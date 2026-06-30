package androidx.camera.core;

/* loaded from: classes13.dex */
public final /* synthetic */ class CameraExecutor$$a implements java.util.concurrent.RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(java.lang.Runnable runnable, java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
        androidx.camera.core.Logger.e(androidx.camera.core.CameraExecutor.TAG, "A rejected execution occurred in CameraExecutor!");
    }
}
