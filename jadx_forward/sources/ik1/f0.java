package ik1;

/* loaded from: classes7.dex */
public abstract class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.FutureTask f373362d;

    public f0(java.lang.Runnable runnable) {
        this.f373362d = new java.util.concurrent.FutureTask(runnable, 0);
    }

    /* renamed from: onDestroy */
    public void m136680xac79a11b() {
        run();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f373362d.run();
    }
}
