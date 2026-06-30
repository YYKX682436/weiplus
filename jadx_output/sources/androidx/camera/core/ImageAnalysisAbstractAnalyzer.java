package androidx.camera.core;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public abstract class ImageAnalysisAbstractAnalyzer implements androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener {
    private static final java.lang.String TAG = "ImageAnalysisAnalyzer";
    private volatile boolean mOnePixelShiftEnabled;
    private volatile boolean mOutputImageRotationEnabled;
    private volatile int mPrevBufferRotationDegrees;
    private androidx.camera.core.SafeCloseImageReaderProxy mProcessedImageReaderProxy;
    private android.media.ImageWriter mProcessedImageWriter;
    java.nio.ByteBuffer mRGBConvertedBuffer;
    private volatile int mRelativeRotation;
    private androidx.camera.core.ImageAnalysis.Analyzer mSubscribedAnalyzer;
    java.nio.ByteBuffer mURotatedBuffer;
    private java.util.concurrent.Executor mUserExecutor;
    java.nio.ByteBuffer mVRotatedBuffer;
    java.nio.ByteBuffer mYRotatedBuffer;
    private volatile int mOutputImageFormat = 1;
    private android.graphics.Rect mOriginalViewPortCropRect = new android.graphics.Rect();
    private android.graphics.Rect mUpdatedViewPortCropRect = new android.graphics.Rect();
    private android.graphics.Matrix mOriginalSensorToBufferTransformMatrix = new android.graphics.Matrix();
    private android.graphics.Matrix mUpdatedSensorToBufferTransformMatrix = new android.graphics.Matrix();
    private final java.lang.Object mAnalyzerLock = new java.lang.Object();
    protected boolean mIsAttached = true;

    private void createHelperBuffer(androidx.camera.core.ImageProxy imageProxy) {
        if (this.mOutputImageFormat != 1) {
            if (this.mOutputImageFormat == 2 && this.mRGBConvertedBuffer == null) {
                this.mRGBConvertedBuffer = java.nio.ByteBuffer.allocateDirect(imageProxy.getWidth() * imageProxy.getHeight() * 4);
                return;
            }
            return;
        }
        if (this.mYRotatedBuffer == null) {
            this.mYRotatedBuffer = java.nio.ByteBuffer.allocateDirect(imageProxy.getWidth() * imageProxy.getHeight());
        }
        this.mYRotatedBuffer.position(0);
        if (this.mURotatedBuffer == null) {
            this.mURotatedBuffer = java.nio.ByteBuffer.allocateDirect((imageProxy.getWidth() * imageProxy.getHeight()) / 4);
        }
        this.mURotatedBuffer.position(0);
        if (this.mVRotatedBuffer == null) {
            this.mVRotatedBuffer = java.nio.ByteBuffer.allocateDirect((imageProxy.getWidth() * imageProxy.getHeight()) / 4);
        }
        this.mVRotatedBuffer.position(0);
    }

    private static androidx.camera.core.SafeCloseImageReaderProxy createImageReaderProxy(int i17, int i18, int i19, int i27, int i28) {
        boolean z17 = i19 == 90 || i19 == 270;
        int i29 = z17 ? i18 : i17;
        if (!z17) {
            i17 = i18;
        }
        return new androidx.camera.core.SafeCloseImageReaderProxy(androidx.camera.core.ImageReaderProxys.createIsolatedReader(i29, i17, i27, i28));
    }

    public static android.graphics.Matrix getAdditionalTransformMatrixAppliedByProcessor(int i17, int i18, int i19, int i27, int i28) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        if (i28 > 0) {
            matrix.setRectToRect(new android.graphics.RectF(0.0f, 0.0f, i17, i18), androidx.camera.core.impl.utils.TransformUtils.NORMALIZED_RECT, android.graphics.Matrix.ScaleToFit.FILL);
            matrix.postRotate(i28);
            matrix.postConcat(androidx.camera.core.impl.utils.TransformUtils.getNormalizedToBuffer(new android.graphics.RectF(0.0f, 0.0f, i19, i27)));
        }
        return matrix;
    }

    public static android.graphics.Rect getUpdatedCropRect(android.graphics.Rect rect, android.graphics.Matrix matrix) {
        android.graphics.RectF rectF = new android.graphics.RectF(rect);
        matrix.mapRect(rectF);
        android.graphics.Rect rect2 = new android.graphics.Rect();
        rectF.round(rect2);
        return rect2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$analyzeImage$0(androidx.camera.core.ImageProxy imageProxy, android.graphics.Matrix matrix, androidx.camera.core.ImageProxy imageProxy2, android.graphics.Rect rect, androidx.camera.core.ImageAnalysis.Analyzer analyzer, t2.k kVar) {
        if (!this.mIsAttached) {
            kVar.b(new j3.q("ImageAnalysis is detached"));
            return;
        }
        androidx.camera.core.SettableImageProxy settableImageProxy = new androidx.camera.core.SettableImageProxy(imageProxy2, androidx.camera.core.ImmutableImageInfo.create(imageProxy.getImageInfo().getTagBundle(), imageProxy.getImageInfo().getTimestamp(), this.mOutputImageRotationEnabled ? 0 : this.mRelativeRotation, matrix));
        if (!rect.isEmpty()) {
            settableImageProxy.setCropRect(rect);
        }
        analyzer.analyze(settableImageProxy);
        kVar.a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$analyzeImage$1(java.util.concurrent.Executor executor, final androidx.camera.core.ImageProxy imageProxy, final android.graphics.Matrix matrix, final androidx.camera.core.ImageProxy imageProxy2, final android.graphics.Rect rect, final androidx.camera.core.ImageAnalysis.Analyzer analyzer, final t2.k kVar) {
        executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.ImageAnalysisAbstractAnalyzer$$b
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.ImageAnalysisAbstractAnalyzer.this.lambda$analyzeImage$0(imageProxy, matrix, imageProxy2, rect, analyzer, kVar);
            }
        });
        return "analyzeImage";
    }

    private void recalculateTransformMatrixAndCropRect(int i17, int i18, int i19, int i27) {
        android.graphics.Matrix additionalTransformMatrixAppliedByProcessor = getAdditionalTransformMatrixAppliedByProcessor(i17, i18, i19, i27, this.mRelativeRotation);
        this.mUpdatedViewPortCropRect = getUpdatedCropRect(this.mOriginalViewPortCropRect, additionalTransformMatrixAppliedByProcessor);
        this.mUpdatedSensorToBufferTransformMatrix.setConcat(this.mOriginalSensorToBufferTransformMatrix, additionalTransformMatrixAppliedByProcessor);
    }

    private void recreateImageReaderProxy(androidx.camera.core.ImageProxy imageProxy, int i17) {
        androidx.camera.core.SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.mProcessedImageReaderProxy;
        if (safeCloseImageReaderProxy == null) {
            return;
        }
        safeCloseImageReaderProxy.safeClose();
        this.mProcessedImageReaderProxy = createImageReaderProxy(imageProxy.getWidth(), imageProxy.getHeight(), i17, this.mProcessedImageReaderProxy.getImageFormat(), this.mProcessedImageReaderProxy.getMaxImages());
        if (this.mOutputImageFormat == 1) {
            android.media.ImageWriter imageWriter = this.mProcessedImageWriter;
            if (imageWriter != null) {
                androidx.camera.core.internal.compat.ImageWriterCompat.close(imageWriter);
            }
            this.mProcessedImageWriter = androidx.camera.core.internal.compat.ImageWriterCompat.newInstance(this.mProcessedImageReaderProxy.getSurface(), this.mProcessedImageReaderProxy.getMaxImages());
        }
    }

    public abstract androidx.camera.core.ImageProxy acquireImage(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy);

    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wa.a analyzeImage(final androidx.camera.core.ImageProxy r15) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ImageAnalysisAbstractAnalyzer.analyzeImage(androidx.camera.core.ImageProxy):wa.a");
    }

    public void attach() {
        this.mIsAttached = true;
    }

    public abstract void clearCache();

    public void detach() {
        this.mIsAttached = false;
        clearCache();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public void onImageAvailable(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
        try {
            androidx.camera.core.ImageProxy acquireImage = acquireImage(imageReaderProxy);
            if (acquireImage != null) {
                onValidImageAvailable(acquireImage);
            }
        } catch (java.lang.IllegalStateException e17) {
            androidx.camera.core.Logger.e(TAG, "Failed to acquire image.", e17);
        }
    }

    public abstract void onValidImageAvailable(androidx.camera.core.ImageProxy imageProxy);

    public void setAnalyzer(java.util.concurrent.Executor executor, androidx.camera.core.ImageAnalysis.Analyzer analyzer) {
        if (analyzer == null) {
            clearCache();
        }
        synchronized (this.mAnalyzerLock) {
            this.mSubscribedAnalyzer = analyzer;
            this.mUserExecutor = executor;
        }
    }

    public void setOnePixelShiftEnabled(boolean z17) {
        this.mOnePixelShiftEnabled = z17;
    }

    public void setOutputImageFormat(int i17) {
        this.mOutputImageFormat = i17;
    }

    public void setOutputImageRotationEnabled(boolean z17) {
        this.mOutputImageRotationEnabled = z17;
    }

    public void setProcessedImageReaderProxy(androidx.camera.core.SafeCloseImageReaderProxy safeCloseImageReaderProxy) {
        synchronized (this.mAnalyzerLock) {
            this.mProcessedImageReaderProxy = safeCloseImageReaderProxy;
        }
    }

    public void setRelativeRotation(int i17) {
        this.mRelativeRotation = i17;
    }

    public void setSensorToBufferTransformMatrix(android.graphics.Matrix matrix) {
        synchronized (this.mAnalyzerLock) {
            this.mOriginalSensorToBufferTransformMatrix = matrix;
            this.mUpdatedSensorToBufferTransformMatrix = new android.graphics.Matrix(this.mOriginalSensorToBufferTransformMatrix);
        }
    }

    public void setViewPortCropRect(android.graphics.Rect rect) {
        synchronized (this.mAnalyzerLock) {
            this.mOriginalViewPortCropRect = rect;
            this.mUpdatedViewPortCropRect = new android.graphics.Rect(this.mOriginalViewPortCropRect);
        }
    }
}
