package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/camera/camera2/internal/VideoUsageControl;", "", "Ljz5/f0;", "incrementUsage", "decrementUsage", "reset", "resetDirectly", "", "getUsage", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/atomic/AtomicInteger;", "mVideoUsage", "Ljava/util/concurrent/atomic/AtomicInteger;", "<init>", "(Ljava/util/concurrent/Executor;)V", "camera-camera2_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: androidx.camera.camera2.internal.VideoUsageControl */
/* loaded from: classes14.dex */
public final class C0282x7ec5e077 {
    private final java.util.concurrent.Executor executor;
    private final java.util.concurrent.atomic.AtomicInteger mVideoUsage;

    public C0282x7ec5e077(java.util.concurrent.Executor executor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(executor, "executor");
        this.executor = executor;
        this.mVideoUsage = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: decrementUsage$lambda$1 */
    public static final void m3642x2f0b01aa(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0282x7ec5e077 this$0) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
        int decrementAndGet = this$0.mVideoUsage.decrementAndGet();
        if (decrementAndGet >= 0) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d("VideoUsageControl", "decrementUsage: mVideoUsage = " + decrementAndGet);
        } else {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w("VideoUsageControl", "decrementUsage: mVideoUsage = " + decrementAndGet + ", which is less than 0!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: incrementUsage$lambda$0 */
    public static final void m3643x5cb68f85(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0282x7ec5e077 this$0) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d("VideoUsageControl", "incrementUsage: mVideoUsage = " + this$0.mVideoUsage.incrementAndGet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reset$lambda$2 */
    public static final void m3644xa338a4a(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0282x7ec5e077 this$0) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
        this$0.m3649xc4ac15a5();
    }

    /* renamed from: decrementUsage */
    public final void m3645x9f95a4ce() {
        this.executor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.VideoUsageControl$$c
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0282x7ec5e077.m3642x2f0b01aa(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0282x7ec5e077.this);
            }
        });
    }

    /* renamed from: getUsage */
    public final int m3646x754423eb() {
        return this.mVideoUsage.get();
    }

    /* renamed from: incrementUsage */
    public final void m3647x6b85cf72() {
        this.executor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.VideoUsageControl$$a
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0282x7ec5e077.m3643x5cb68f85(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0282x7ec5e077.this);
            }
        });
    }

    /* renamed from: reset */
    public final void m3648x6761d4f() {
        this.executor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.VideoUsageControl$$b
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0282x7ec5e077.m3644xa338a4a(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0282x7ec5e077.this);
            }
        });
    }

    /* renamed from: resetDirectly */
    public final void m3649xc4ac15a5() {
        this.mVideoUsage.set(0);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }
}
