package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public class n6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f158058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f158059e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f158060f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f158061g;

    public n6(java.lang.String str, java.lang.String str2, int i17, java.lang.Runnable runnable) {
        this.f158058d = str;
        this.f158059e = str2;
        this.f158060f = i17;
        this.f158061g = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f158059e;
        java.lang.String str2 = this.f158058d;
        java.lang.Runnable runnable = this.f158061g;
        try {
            if (gm0.j1.b().m()) {
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.o6.d(str2, str, this.f158060f);
                    if (runnable == null) {
                        return;
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.RemoveUsageTask", e17, "doRemove username(%s), appId(%s)", str2, str);
                    if (runnable == null) {
                        return;
                    }
                }
                runnable.run();
            }
        } catch (java.lang.Throwable th6) {
            if (runnable != null) {
                runnable.run();
            }
            throw th6;
        }
    }
}
