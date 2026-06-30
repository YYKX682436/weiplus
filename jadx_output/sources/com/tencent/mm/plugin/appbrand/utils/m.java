package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public class m implements java.lang.Runnable, com.tencent.mm.plugin.appbrand.utils.l5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f90506d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f90507e;

    public m(java.lang.Runnable runnable) {
        this.f90506d = runnable;
        this.f90507e = null;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f90506d.run();
        } catch (java.lang.Throwable th6) {
            if (th6 instanceof android.system.ErrnoException) {
                return;
            }
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AccountScopedRunnable", th6, "caught exception inside AccountScopedRunnable", new java.lang.Object[0]);
            if (gm0.j1.b().f273254q && gm0.j1.a()) {
                throw th6;
            }
        }
    }

    public m(java.lang.Runnable runnable, java.lang.String str) {
        this.f90506d = runnable;
        this.f90507e = str;
    }
}
