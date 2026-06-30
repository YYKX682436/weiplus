package androidx.camera.core.processing.concurrent;

/* loaded from: classes14.dex */
public class DualSurfaceProcessorNode implements androidx.camera.core.processing.Node<androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In, androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.Out> {
    private static final java.lang.String TAG = "DualSurfaceProcessorNode";
    private androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In mInput;
    private androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.Out mOutput;
    final androidx.camera.core.impl.CameraInternal mPrimaryCameraInternal;
    final androidx.camera.core.impl.CameraInternal mSecondaryCameraInternal;
    final androidx.camera.core.processing.SurfaceProcessorInternal mSurfaceProcessor;

    /* loaded from: classes14.dex */
    public static abstract class In {
        public static androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In of(androidx.camera.core.processing.SurfaceEdge surfaceEdge, androidx.camera.core.processing.SurfaceEdge surfaceEdge2, java.util.List<androidx.camera.core.processing.concurrent.DualOutConfig> list) {
            return new androidx.camera.core.processing.concurrent.AutoValue_DualSurfaceProcessorNode_In(surfaceEdge, surfaceEdge2, list);
        }

        public abstract java.util.List<androidx.camera.core.processing.concurrent.DualOutConfig> getOutConfigs();

        public abstract androidx.camera.core.processing.SurfaceEdge getPrimarySurfaceEdge();

        public abstract androidx.camera.core.processing.SurfaceEdge getSecondarySurfaceEdge();
    }

    /* loaded from: classes14.dex */
    public static class Out extends java.util.HashMap<androidx.camera.core.processing.concurrent.DualOutConfig, androidx.camera.core.processing.SurfaceEdge> {
    }

    public DualSurfaceProcessorNode(androidx.camera.core.impl.CameraInternal cameraInternal, androidx.camera.core.impl.CameraInternal cameraInternal2, androidx.camera.core.processing.SurfaceProcessorInternal surfaceProcessorInternal) {
        this.mPrimaryCameraInternal = cameraInternal;
        this.mSecondaryCameraInternal = cameraInternal2;
        this.mSurfaceProcessor = surfaceProcessorInternal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createAndSendSurfaceOutput, reason: merged with bridge method [inline-methods] */
    public void lambda$sendSurfaceOutputs$0(androidx.camera.core.impl.CameraInternal cameraInternal, androidx.camera.core.impl.CameraInternal cameraInternal2, androidx.camera.core.processing.SurfaceEdge surfaceEdge, androidx.camera.core.processing.SurfaceEdge surfaceEdge2, java.util.Map.Entry<androidx.camera.core.processing.concurrent.DualOutConfig, androidx.camera.core.processing.SurfaceEdge> entry) {
        final androidx.camera.core.processing.SurfaceEdge value = entry.getValue();
        android.util.Size resolution = surfaceEdge.getStreamSpec().getResolution();
        android.graphics.Rect cropRect = entry.getKey().getPrimaryOutConfig().getCropRect();
        if (!surfaceEdge.hasCameraTransform()) {
            cameraInternal = null;
        }
        androidx.camera.core.SurfaceOutput.CameraInputInfo of6 = androidx.camera.core.SurfaceOutput.CameraInputInfo.of(resolution, cropRect, cameraInternal, entry.getKey().getPrimaryOutConfig().getRotationDegrees(), entry.getKey().getPrimaryOutConfig().isMirroring());
        android.util.Size resolution2 = surfaceEdge2.getStreamSpec().getResolution();
        android.graphics.Rect cropRect2 = entry.getKey().getSecondaryOutConfig().getCropRect();
        if (!surfaceEdge2.hasCameraTransform()) {
            cameraInternal2 = null;
        }
        androidx.camera.core.impl.utils.futures.Futures.addCallback(value.createSurfaceOutputFuture(entry.getKey().getPrimaryOutConfig().getFormat(), of6, androidx.camera.core.SurfaceOutput.CameraInputInfo.of(resolution2, cropRect2, cameraInternal2, entry.getKey().getSecondaryOutConfig().getRotationDegrees(), entry.getKey().getSecondaryOutConfig().isMirroring())), new androidx.camera.core.impl.utils.futures.FutureCallback<androidx.camera.core.SurfaceOutput>() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable th6) {
                if (value.getTargets() == 2 && (th6 instanceof java.util.concurrent.CancellationException)) {
                    androidx.camera.core.Logger.d(androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.TAG, "Downstream VideoCapture failed to provide Surface.");
                    return;
                }
                androidx.camera.core.Logger.w(androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.TAG, "Downstream node failed to provide Surface. Target: " + androidx.camera.core.processing.TargetUtils.getHumanReadableName(value.getTargets()), th6);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(androidx.camera.core.SurfaceOutput surfaceOutput) {
                surfaceOutput.getClass();
                try {
                    androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.this.mSurfaceProcessor.onOutputSurface(surfaceOutput);
                } catch (androidx.camera.core.ProcessingException e17) {
                    androidx.camera.core.Logger.e(androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.TAG, "Failed to send SurfaceOutput to SurfaceProcessor.", e17);
                }
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$1() {
        androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.Out out = this.mOutput;
        if (out != null) {
            java.util.Iterator<androidx.camera.core.processing.SurfaceEdge> it = out.values().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
        }
    }

    private void sendSurfaceOutputs(final androidx.camera.core.impl.CameraInternal cameraInternal, final androidx.camera.core.impl.CameraInternal cameraInternal2, final androidx.camera.core.processing.SurfaceEdge surfaceEdge, final androidx.camera.core.processing.SurfaceEdge surfaceEdge2, java.util.Map<androidx.camera.core.processing.concurrent.DualOutConfig, androidx.camera.core.processing.SurfaceEdge> map) {
        for (final java.util.Map.Entry<androidx.camera.core.processing.concurrent.DualOutConfig, androidx.camera.core.processing.SurfaceEdge> entry : map.entrySet()) {
            lambda$sendSurfaceOutputs$0(cameraInternal, cameraInternal2, surfaceEdge, surfaceEdge2, entry);
            entry.getValue().addOnInvalidatedListener(new java.lang.Runnable() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode$$b
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.this.lambda$sendSurfaceOutputs$0(cameraInternal, cameraInternal2, surfaceEdge, surfaceEdge2, entry);
                }
            });
        }
    }

    private void sendSurfaceRequest(androidx.camera.core.impl.CameraInternal cameraInternal, androidx.camera.core.processing.SurfaceEdge surfaceEdge, java.util.Map<androidx.camera.core.processing.concurrent.DualOutConfig, androidx.camera.core.processing.SurfaceEdge> map, boolean z17) {
        try {
            this.mSurfaceProcessor.onInputSurface(surfaceEdge.createSurfaceRequest(cameraInternal, z17));
        } catch (androidx.camera.core.ProcessingException e17) {
            androidx.camera.core.Logger.e(TAG, "Failed to send SurfaceRequest to SurfaceProcessor.", e17);
        }
    }

    private androidx.camera.core.processing.SurfaceEdge transformSingleOutput(androidx.camera.core.processing.SurfaceEdge surfaceEdge, androidx.camera.core.processing.util.OutConfig outConfig) {
        android.graphics.Rect cropRect = outConfig.getCropRect();
        int rotationDegrees = outConfig.getRotationDegrees();
        boolean isMirroring = outConfig.isMirroring();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        m3.h.a(androidx.camera.core.impl.utils.TransformUtils.isAspectRatioMatchingWithRoundingError(androidx.camera.core.impl.utils.TransformUtils.getRotatedSize(cropRect, rotationDegrees), outConfig.getSize()));
        android.graphics.Rect sizeToRect = androidx.camera.core.impl.utils.TransformUtils.sizeToRect(outConfig.getSize());
        return new androidx.camera.core.processing.SurfaceEdge(outConfig.getTargets(), outConfig.getFormat(), surfaceEdge.getStreamSpec().toBuilder().setResolution(outConfig.getSize()).build(), matrix, false, sizeToRect, surfaceEdge.getRotationDegrees() - rotationDegrees, -1, surfaceEdge.isMirroring() != isMirroring);
    }

    @Override // androidx.camera.core.processing.Node
    public void release() {
        this.mSurfaceProcessor.release();
        androidx.camera.core.impl.utils.Threads.runOnMain(new java.lang.Runnable() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode$$a
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.this.lambda$release$1();
            }
        });
    }

    @Override // androidx.camera.core.processing.Node
    public androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.Out transform(androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In in6) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.mInput = in6;
        this.mOutput = new androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.Out();
        androidx.camera.core.processing.SurfaceEdge primarySurfaceEdge = this.mInput.getPrimarySurfaceEdge();
        androidx.camera.core.processing.SurfaceEdge secondarySurfaceEdge = this.mInput.getSecondarySurfaceEdge();
        for (androidx.camera.core.processing.concurrent.DualOutConfig dualOutConfig : this.mInput.getOutConfigs()) {
            this.mOutput.put(dualOutConfig, transformSingleOutput(primarySurfaceEdge, dualOutConfig.getPrimaryOutConfig()));
        }
        sendSurfaceRequest(this.mPrimaryCameraInternal, primarySurfaceEdge, this.mOutput, true);
        sendSurfaceRequest(this.mSecondaryCameraInternal, secondarySurfaceEdge, this.mOutput, false);
        sendSurfaceOutputs(this.mPrimaryCameraInternal, this.mSecondaryCameraInternal, primarySurfaceEdge, secondarySurfaceEdge, this.mOutput);
        return this.mOutput;
    }
}
