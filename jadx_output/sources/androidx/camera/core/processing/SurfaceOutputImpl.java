package androidx.camera.core.processing;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class SurfaceOutputImpl implements androidx.camera.core.SurfaceOutput {
    private static final java.lang.String TAG = "SurfaceOutputImpl";
    private final float[] mAdditionalTransform;
    private final androidx.camera.core.SurfaceOutput.CameraInputInfo mCameraInputInfo;
    private final wa.a mCloseFuture;
    private t2.k mCloseFutureCompleter;
    private m3.a mEventListener;
    private java.util.concurrent.Executor mExecutor;
    private final int mFormat;
    private final float[] mInvertedTextureTransform;
    private final float[] mSecondaryAdditionalTransform;
    private final androidx.camera.core.SurfaceOutput.CameraInputInfo mSecondaryCameraInputInfo;
    private final float[] mSecondaryInvertedTextureTransform;
    private android.graphics.Matrix mSensorToBufferTransform;
    private final android.util.Size mSize;
    private final android.view.Surface mSurface;
    private final int mTargets;
    private final java.lang.Object mLock = new java.lang.Object();
    private boolean mHasPendingCloseRequest = false;
    private boolean mIsClosed = false;

    public SurfaceOutputImpl(android.view.Surface surface, int i17, int i18, android.util.Size size, androidx.camera.core.SurfaceOutput.CameraInputInfo cameraInputInfo, androidx.camera.core.SurfaceOutput.CameraInputInfo cameraInputInfo2, android.graphics.Matrix matrix) {
        float[] fArr = new float[16];
        this.mAdditionalTransform = fArr;
        float[] fArr2 = new float[16];
        this.mSecondaryAdditionalTransform = fArr2;
        float[] fArr3 = new float[16];
        this.mInvertedTextureTransform = fArr3;
        float[] fArr4 = new float[16];
        this.mSecondaryInvertedTextureTransform = fArr4;
        this.mSurface = surface;
        this.mTargets = i17;
        this.mFormat = i18;
        this.mSize = size;
        this.mCameraInputInfo = cameraInputInfo;
        this.mSecondaryCameraInputInfo = cameraInputInfo2;
        this.mSensorToBufferTransform = matrix;
        calculateAdditionalTransform(fArr, fArr3, cameraInputInfo);
        calculateAdditionalTransform(fArr2, fArr4, cameraInputInfo2);
        this.mCloseFuture = t2.p.a(new t2.m() { // from class: androidx.camera.core.processing.SurfaceOutputImpl$$a
            @Override // t2.m
            public final java.lang.Object attachCompleter(t2.k kVar) {
                java.lang.Object lambda$new$0;
                lambda$new$0 = androidx.camera.core.processing.SurfaceOutputImpl.this.lambda$new$0(kVar);
                return lambda$new$0;
            }
        });
    }

    private static void calculateAdditionalTransform(float[] fArr, float[] fArr2, androidx.camera.core.SurfaceOutput.CameraInputInfo cameraInputInfo) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        if (cameraInputInfo == null) {
            return;
        }
        androidx.camera.core.impl.utils.MatrixExt.preVerticalFlip(fArr, 0.5f);
        androidx.camera.core.impl.utils.MatrixExt.preRotate(fArr, cameraInputInfo.getRotationDegrees(), 0.5f, 0.5f);
        if (cameraInputInfo.getMirroring()) {
            android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        android.graphics.Matrix rectToRect = androidx.camera.core.impl.utils.TransformUtils.getRectToRect(androidx.camera.core.impl.utils.TransformUtils.sizeToRectF(cameraInputInfo.getInputSize()), androidx.camera.core.impl.utils.TransformUtils.sizeToRectF(androidx.camera.core.impl.utils.TransformUtils.rotateSize(cameraInputInfo.getInputSize(), cameraInputInfo.getRotationDegrees())), cameraInputInfo.getRotationDegrees(), cameraInputInfo.getMirroring());
        android.graphics.RectF rectF = new android.graphics.RectF(cameraInputInfo.getInputCropRect());
        rectToRect.mapRect(rectF);
        float width = rectF.left / r1.getWidth();
        float height = ((r1.getHeight() - rectF.height()) - rectF.top) / r1.getHeight();
        float width2 = rectF.width() / r1.getWidth();
        float height2 = rectF.height() / r1.getHeight();
        android.opengl.Matrix.translateM(fArr, 0, width, height, 0.0f);
        android.opengl.Matrix.scaleM(fArr, 0, width2, height2, 1.0f);
        calculateInvertedTextureTransform(fArr2, cameraInputInfo.getCameraInternal());
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    private static void calculateInvertedTextureTransform(float[] fArr, androidx.camera.core.impl.CameraInternal cameraInternal) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        androidx.camera.core.impl.utils.MatrixExt.preVerticalFlip(fArr, 0.5f);
        if (cameraInternal != null) {
            m3.h.e(cameraInternal.getHasTransform(), "Camera has no transform.");
            androidx.camera.core.impl.utils.MatrixExt.preRotate(fArr, cameraInternal.getCameraInfo().getSensorRotationDegrees(), 0.5f, 0.5f);
            if (cameraInternal.isFrontFacing()) {
                android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
                android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        android.opengl.Matrix.invertM(fArr, 0, fArr, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$new$0(t2.k kVar) {
        this.mCloseFutureCompleter = kVar;
        return "SurfaceOutputImpl close future complete";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestClose$1(java.util.concurrent.atomic.AtomicReference atomicReference) {
        ((m3.a) atomicReference.get()).accept(androidx.camera.core.SurfaceOutput.Event.of(0, this));
    }

    @Override // androidx.camera.core.SurfaceOutput, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.mLock) {
            if (!this.mIsClosed) {
                this.mIsClosed = true;
            }
        }
        this.mCloseFutureCompleter.a(null);
    }

    public androidx.camera.core.impl.CameraInternal getCamera() {
        return this.mCameraInputInfo.getCameraInternal();
    }

    public wa.a getCloseFuture() {
        return this.mCloseFuture;
    }

    @Override // androidx.camera.core.SurfaceOutput
    public int getFormat() {
        return this.mFormat;
    }

    public android.graphics.Rect getInputCropRect() {
        return this.mCameraInputInfo.getInputCropRect();
    }

    public android.util.Size getInputSize() {
        return this.mCameraInputInfo.getInputSize();
    }

    public int getRotationDegrees() {
        return this.mCameraInputInfo.getRotationDegrees();
    }

    @Override // androidx.camera.core.SurfaceOutput
    public android.graphics.Matrix getSensorToBufferTransform() {
        return new android.graphics.Matrix(this.mSensorToBufferTransform);
    }

    @Override // androidx.camera.core.SurfaceOutput
    public android.util.Size getSize() {
        return this.mSize;
    }

    @Override // androidx.camera.core.SurfaceOutput
    public android.view.Surface getSurface(java.util.concurrent.Executor executor, m3.a aVar) {
        boolean z17;
        synchronized (this.mLock) {
            this.mExecutor = executor;
            this.mEventListener = aVar;
            z17 = this.mHasPendingCloseRequest;
        }
        if (z17) {
            requestClose();
        }
        return this.mSurface;
    }

    @Override // androidx.camera.core.SurfaceOutput
    public int getTargets() {
        return this.mTargets;
    }

    public boolean isClosed() {
        boolean z17;
        synchronized (this.mLock) {
            z17 = this.mIsClosed;
        }
        return z17;
    }

    public boolean isMirroring() {
        return this.mCameraInputInfo.getMirroring();
    }

    public void requestClose() {
        java.util.concurrent.Executor executor;
        m3.a aVar;
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        synchronized (this.mLock) {
            if (this.mExecutor != null && (aVar = this.mEventListener) != null) {
                if (!this.mIsClosed) {
                    atomicReference.set(aVar);
                    executor = this.mExecutor;
                    this.mHasPendingCloseRequest = false;
                }
                executor = null;
            }
            this.mHasPendingCloseRequest = true;
            executor = null;
        }
        if (executor != null) {
            try {
                executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceOutputImpl$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.processing.SurfaceOutputImpl.this.lambda$requestClose$1(atomicReference);
                    }
                });
            } catch (java.util.concurrent.RejectedExecutionException e17) {
                androidx.camera.core.Logger.d(TAG, "Processor executor closed. Close request not posted.", e17);
            }
        }
    }

    @Override // androidx.camera.core.SurfaceOutput
    public void updateTransformMatrix(float[] fArr, float[] fArr2) {
        updateTransformMatrix(fArr, fArr2, true);
    }

    @Override // androidx.camera.core.SurfaceOutput
    public void updateTransformMatrix(float[] fArr, float[] fArr2, boolean z17) {
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, z17 ? this.mAdditionalTransform : this.mSecondaryAdditionalTransform, 0);
    }
}
