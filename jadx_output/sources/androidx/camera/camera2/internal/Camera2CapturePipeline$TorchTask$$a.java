package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
public final /* synthetic */ class Camera2CapturePipeline$TorchTask$$a implements androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener.Checker {
    @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener.Checker
    public final boolean check(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        boolean is3AConverged;
        is3AConverged = androidx.camera.camera2.internal.Camera2CapturePipeline.is3AConverged(totalCaptureResult, true);
        return is3AConverged;
    }
}
