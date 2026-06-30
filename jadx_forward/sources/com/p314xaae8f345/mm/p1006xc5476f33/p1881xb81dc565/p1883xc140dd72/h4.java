package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class h4 implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f231135d;

    public h4(java.lang.Runnable runnable) {
        this.f231135d = runnable;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "IlinkNoLoggingRunnable";
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Runnable runnable = this.f231135d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
