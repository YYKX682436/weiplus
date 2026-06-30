package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes15.dex */
public final class j4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f172020d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f172021e;

    public j4(java.lang.Runnable realRunnable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(realRunnable, "realRunnable");
        this.f172020d = realRunnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f172020d.run();
        this.f172021e = true;
    }
}
