package androidx.camera.core.processing;

/* loaded from: classes14.dex */
public class SurfaceProcessorNode implements androidx.camera.core.processing.Node<androidx.camera.core.processing.SurfaceProcessorNode.In, androidx.camera.core.processing.SurfaceProcessorNode.Out> {
    private static final java.lang.String TAG = "SurfaceProcessorNode";
    final androidx.camera.core.impl.CameraInternal mCameraInternal;
    private androidx.camera.core.processing.SurfaceProcessorNode.In mInput;
    private androidx.camera.core.processing.SurfaceProcessorNode.Out mOutput;
    final androidx.camera.core.processing.SurfaceProcessorInternal mSurfaceProcessor;

    /* loaded from: classes14.dex */
    public static abstract class In {
        public static androidx.camera.core.processing.SurfaceProcessorNode.In of(androidx.camera.core.processing.SurfaceEdge surfaceEdge, java.util.List<androidx.camera.core.processing.util.OutConfig> list) {
            return new androidx.camera.core.processing.AutoValue_SurfaceProcessorNode_In(surfaceEdge, list);
        }

        public abstract java.util.List<androidx.camera.core.processing.util.OutConfig> getOutConfigs();

        public abstract androidx.camera.core.processing.SurfaceEdge getSurfaceEdge();
    }

    /* loaded from: classes14.dex */
    public static class Out extends java.util.HashMap<androidx.camera.core.processing.util.OutConfig, androidx.camera.core.processing.SurfaceEdge> {
    }

    public SurfaceProcessorNode(androidx.camera.core.impl.CameraInternal cameraInternal, androidx.camera.core.processing.SurfaceProcessorInternal surfaceProcessorInternal) {
        this.mCameraInternal = cameraInternal;
        this.mSurfaceProcessor = surfaceProcessorInternal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createAndSendSurfaceOutput, reason: merged with bridge method [inline-methods] */
    public void lambda$sendSurfaceOutputs$0(androidx.camera.core.processing.SurfaceEdge surfaceEdge, java.util.Map.Entry<androidx.camera.core.processing.util.OutConfig, androidx.camera.core.processing.SurfaceEdge> entry) {
        final androidx.camera.core.processing.SurfaceEdge value = entry.getValue();
        androidx.camera.core.impl.utils.futures.Futures.addCallback(value.createSurfaceOutputFuture(entry.getKey().getFormat(), androidx.camera.core.SurfaceOutput.CameraInputInfo.of(surfaceEdge.getStreamSpec().getResolution(), entry.getKey().getCropRect(), surfaceEdge.hasCameraTransform() ? this.mCameraInternal : null, entry.getKey().getRotationDegrees(), entry.getKey().isMirroring()), null), new androidx.camera.core.impl.utils.futures.FutureCallback<androidx.camera.core.SurfaceOutput>() { // from class: androidx.camera.core.processing.SurfaceProcessorNode.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable th6) {
                if (value.getTargets() == 2 && (th6 instanceof java.util.concurrent.CancellationException)) {
                    androidx.camera.core.Logger.d(androidx.camera.core.processing.SurfaceProcessorNode.TAG, "Downstream VideoCapture failed to provide Surface.");
                    return;
                }
                androidx.camera.core.Logger.w(androidx.camera.core.processing.SurfaceProcessorNode.TAG, "Downstream node failed to provide Surface. Target: " + androidx.camera.core.processing.TargetUtils.getHumanReadableName(value.getTargets()), th6);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(androidx.camera.core.SurfaceOutput surfaceOutput) {
                surfaceOutput.getClass();
                try {
                    androidx.camera.core.processing.SurfaceProcessorNode.this.mSurfaceProcessor.onOutputSurface(surfaceOutput);
                } catch (androidx.camera.core.ProcessingException e17) {
                    androidx.camera.core.Logger.e(androidx.camera.core.processing.SurfaceProcessorNode.TAG, "Failed to send SurfaceOutput to SurfaceProcessor.", e17);
                }
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$2() {
        androidx.camera.core.processing.SurfaceProcessorNode.Out out = this.mOutput;
        if (out != null) {
            java.util.Iterator<androidx.camera.core.processing.SurfaceEdge> it = out.values().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setUpRotationUpdates$1(java.util.Map map, androidx.camera.core.SurfaceRequest.TransformationInfo transformationInfo) {
        for (java.util.Map.Entry entry : map.entrySet()) {
            int rotationDegrees = transformationInfo.getRotationDegrees() - ((androidx.camera.core.processing.util.OutConfig) entry.getKey()).getRotationDegrees();
            if (((androidx.camera.core.processing.util.OutConfig) entry.getKey()).isMirroring()) {
                rotationDegrees = -rotationDegrees;
            }
            ((androidx.camera.core.processing.SurfaceEdge) entry.getValue()).updateTransformation(androidx.camera.core.impl.utils.TransformUtils.within360(rotationDegrees), -1);
        }
    }

    private void sendSurfaceOutputs(final androidx.camera.core.processing.SurfaceEdge surfaceEdge, java.util.Map<androidx.camera.core.processing.util.OutConfig, androidx.camera.core.processing.SurfaceEdge> map) {
        for (final java.util.Map.Entry<androidx.camera.core.processing.util.OutConfig, androidx.camera.core.processing.SurfaceEdge> entry : map.entrySet()) {
            lambda$sendSurfaceOutputs$0(surfaceEdge, entry);
            entry.getValue().addOnInvalidatedListener(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceProcessorNode$$b
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.processing.SurfaceProcessorNode.this.lambda$sendSurfaceOutputs$0(surfaceEdge, entry);
                }
            });
        }
    }

    private void sendSurfaceRequest(androidx.camera.core.processing.SurfaceEdge surfaceEdge) {
        try {
            this.mSurfaceProcessor.onInputSurface(surfaceEdge.createSurfaceRequest(this.mCameraInternal));
        } catch (androidx.camera.core.ProcessingException e17) {
            androidx.camera.core.Logger.e(TAG, "Failed to send SurfaceRequest to SurfaceProcessor.", e17);
        }
    }

    private androidx.camera.core.processing.SurfaceEdge transformSingleOutput(androidx.camera.core.processing.SurfaceEdge surfaceEdge, androidx.camera.core.processing.util.OutConfig outConfig) {
        android.graphics.Rect sizeToRect;
        android.graphics.Rect cropRect = outConfig.getCropRect();
        int rotationDegrees = outConfig.getRotationDegrees();
        boolean isMirroring = outConfig.isMirroring();
        android.graphics.Matrix matrix = new android.graphics.Matrix(surfaceEdge.getSensorToBufferTransform());
        android.graphics.Matrix rectToRect = androidx.camera.core.impl.utils.TransformUtils.getRectToRect(new android.graphics.RectF(cropRect), androidx.camera.core.impl.utils.TransformUtils.sizeToRectF(outConfig.getSize()), rotationDegrees, isMirroring);
        matrix.postConcat(rectToRect);
        m3.h.a(androidx.camera.core.impl.utils.TransformUtils.isAspectRatioMatchingWithRoundingError(androidx.camera.core.impl.utils.TransformUtils.getRotatedSize(cropRect, rotationDegrees), outConfig.getSize()));
        if (outConfig.shouldRespectInputCropRect()) {
            m3.h.b(outConfig.getCropRect().contains(surfaceEdge.getCropRect()), java.lang.String.format("Output crop rect %s must contain input crop rect %s", outConfig.getCropRect(), surfaceEdge.getCropRect()));
            sizeToRect = new android.graphics.Rect();
            android.graphics.RectF rectF = new android.graphics.RectF(surfaceEdge.getCropRect());
            rectToRect.mapRect(rectF);
            rectF.round(sizeToRect);
        } else {
            sizeToRect = androidx.camera.core.impl.utils.TransformUtils.sizeToRect(outConfig.getSize());
        }
        android.graphics.Rect rect = sizeToRect;
        return new androidx.camera.core.processing.SurfaceEdge(outConfig.getTargets(), outConfig.getFormat(), surfaceEdge.getStreamSpec().toBuilder().setResolution(outConfig.getSize()).build(), matrix, false, rect, surfaceEdge.getRotationDegrees() - rotationDegrees, -1, surfaceEdge.isMirroring() != isMirroring);
    }

    public androidx.camera.core.processing.SurfaceProcessorInternal getSurfaceProcessor() {
        return this.mSurfaceProcessor;
    }

    @Override // androidx.camera.core.processing.Node
    public void release() {
        this.mSurfaceProcessor.release();
        androidx.camera.core.impl.utils.Threads.runOnMain(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceProcessorNode$$c
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.processing.SurfaceProcessorNode.this.lambda$release$2();
            }
        });
    }

    public void setUpRotationUpdates(androidx.camera.core.processing.SurfaceEdge surfaceEdge, final java.util.Map<androidx.camera.core.processing.util.OutConfig, androidx.camera.core.processing.SurfaceEdge> map) {
        surfaceEdge.addTransformationUpdateListener(new m3.a() { // from class: androidx.camera.core.processing.SurfaceProcessorNode$$a
            @Override // m3.a
            public final void accept(java.lang.Object obj) {
                androidx.camera.core.processing.SurfaceProcessorNode.lambda$setUpRotationUpdates$1(map, (androidx.camera.core.SurfaceRequest.TransformationInfo) obj);
            }
        });
    }

    @Override // androidx.camera.core.processing.Node
    public androidx.camera.core.processing.SurfaceProcessorNode.Out transform(androidx.camera.core.processing.SurfaceProcessorNode.In in6) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.mInput = in6;
        this.mOutput = new androidx.camera.core.processing.SurfaceProcessorNode.Out();
        androidx.camera.core.processing.SurfaceEdge surfaceEdge = in6.getSurfaceEdge();
        for (androidx.camera.core.processing.util.OutConfig outConfig : in6.getOutConfigs()) {
            this.mOutput.put(outConfig, transformSingleOutput(surfaceEdge, outConfig));
        }
        sendSurfaceRequest(surfaceEdge);
        sendSurfaceOutputs(surfaceEdge, this.mOutput);
        setUpRotationUpdates(surfaceEdge, this.mOutput);
        return this.mOutput;
    }
}
