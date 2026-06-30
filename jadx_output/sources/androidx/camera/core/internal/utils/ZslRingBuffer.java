package androidx.camera.core.internal.utils;

/* loaded from: classes14.dex */
public final class ZslRingBuffer extends androidx.camera.core.internal.utils.ArrayRingBuffer<androidx.camera.core.ImageProxy> {
    public ZslRingBuffer(int i17, androidx.camera.core.internal.utils.RingBuffer.OnRemoveCallback<androidx.camera.core.ImageProxy> onRemoveCallback) {
        super(i17, onRemoveCallback);
    }

    private boolean isValidZslFrame(androidx.camera.core.ImageInfo imageInfo) {
        androidx.camera.core.impl.CameraCaptureResult retrieveCameraCaptureResult = androidx.camera.core.impl.CameraCaptureResults.retrieveCameraCaptureResult(imageInfo);
        return (retrieveCameraCaptureResult.getAfState() == androidx.camera.core.impl.CameraCaptureMetaData.AfState.LOCKED_FOCUSED || retrieveCameraCaptureResult.getAfState() == androidx.camera.core.impl.CameraCaptureMetaData.AfState.PASSIVE_FOCUSED) && retrieveCameraCaptureResult.getAeState() == androidx.camera.core.impl.CameraCaptureMetaData.AeState.CONVERGED && retrieveCameraCaptureResult.getAwbState() == androidx.camera.core.impl.CameraCaptureMetaData.AwbState.CONVERGED;
    }

    @Override // androidx.camera.core.internal.utils.ArrayRingBuffer, androidx.camera.core.internal.utils.RingBuffer
    public void enqueue(androidx.camera.core.ImageProxy imageProxy) {
        if (isValidZslFrame(imageProxy.getImageInfo())) {
            super.enqueue((androidx.camera.core.internal.utils.ZslRingBuffer) imageProxy);
        } else {
            this.mOnRemoveCallback.onRemove(imageProxy);
        }
    }
}
