package pu5;

/* loaded from: classes12.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f440002d;

    public c(java.lang.Runnable runnable) {
        this.f440002d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f440002d.run();
        ku5.o.f394131b.b(java.lang.Thread.currentThread(), java.lang.Thread.currentThread().getName(), java.lang.Thread.currentThread().getId());
    }
}
