package androidx.camera.camera2.internal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/camera/camera2/internal/VideoUsageControl;", "", "Ljz5/f0;", "incrementUsage", "decrementUsage", "reset", "resetDirectly", "", "getUsage", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/atomic/AtomicInteger;", "mVideoUsage", "Ljava/util/concurrent/atomic/AtomicInteger;", "<init>", "(Ljava/util/concurrent/Executor;)V", "camera-camera2_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes14.dex */
public final class VideoUsageControl {
    private final java.util.concurrent.Executor executor;
    private final java.util.concurrent.atomic.AtomicInteger mVideoUsage;

    public VideoUsageControl(java.util.concurrent.Executor executor) {
        kotlin.jvm.internal.o.g(executor, "executor");
        this.executor = executor;
        this.mVideoUsage = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void decrementUsage$lambda$1(androidx.camera.camera2.internal.VideoUsageControl this$0) {
        kotlin.jvm.internal.o.g(this$0, "this$0");
        int decrementAndGet = this$0.mVideoUsage.decrementAndGet();
        if (decrementAndGet >= 0) {
            androidx.camera.core.Logger.d("VideoUsageControl", "decrementUsage: mVideoUsage = " + decrementAndGet);
        } else {
            androidx.camera.core.Logger.w("VideoUsageControl", "decrementUsage: mVideoUsage = " + decrementAndGet + ", which is less than 0!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void incrementUsage$lambda$0(androidx.camera.camera2.internal.VideoUsageControl this$0) {
        kotlin.jvm.internal.o.g(this$0, "this$0");
        androidx.camera.core.Logger.d("VideoUsageControl", "incrementUsage: mVideoUsage = " + this$0.mVideoUsage.incrementAndGet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reset$lambda$2(androidx.camera.camera2.internal.VideoUsageControl this$0) {
        kotlin.jvm.internal.o.g(this$0, "this$0");
        this$0.resetDirectly();
    }

    public final void decrementUsage() {
        this.executor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.VideoUsageControl$$c
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.VideoUsageControl.decrementUsage$lambda$1(androidx.camera.camera2.internal.VideoUsageControl.this);
            }
        });
    }

    public final int getUsage() {
        return this.mVideoUsage.get();
    }

    public final void incrementUsage() {
        this.executor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.VideoUsageControl$$a
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.VideoUsageControl.incrementUsage$lambda$0(androidx.camera.camera2.internal.VideoUsageControl.this);
            }
        });
    }

    public final void reset() {
        this.executor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.VideoUsageControl$$b
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.VideoUsageControl.reset$lambda$2(androidx.camera.camera2.internal.VideoUsageControl.this);
            }
        });
    }

    public final void resetDirectly() {
        this.mVideoUsage.set(0);
        androidx.camera.core.Logger.d("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }
}
