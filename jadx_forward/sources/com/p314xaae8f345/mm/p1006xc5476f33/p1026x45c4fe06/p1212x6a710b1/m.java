package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public class m implements java.lang.Runnable, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.l5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f172039d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f172040e;

    public m(java.lang.Runnable runnable) {
        this.f172039d = runnable;
        this.f172040e = null;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f172039d.run();
        } catch (java.lang.Throwable th6) {
            if (th6 instanceof android.system.ErrnoException) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AccountScopedRunnable", th6, "caught exception inside AccountScopedRunnable", new java.lang.Object[0]);
            if (gm0.j1.b().f354787q && gm0.j1.a()) {
                throw th6;
            }
        }
    }

    public m(java.lang.Runnable runnable, java.lang.String str) {
        this.f172039d = runnable;
        this.f172040e = str;
    }
}
