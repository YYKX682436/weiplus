package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes8.dex */
public class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f270441d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f270442e;

    /* renamed from: f, reason: collision with root package name */
    public final int f270443f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f270444g;

    public g3(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, java.lang.String str, int i17, java.lang.String str2) {
        this.f270441d = null;
        this.f270442e = null;
        this.f270443f = 0;
        this.f270444g = null;
        this.f270441d = n3Var;
        this.f270442e = str;
        this.f270443f = i17;
        this.f270444g = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2 = this.f270442e;
        if (str2 == null || str2.length() == 0 || (str = this.f270444g) == null || str.length() == 0) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.n3 n3Var = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.n3(str2, this.f270443f, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u0(str));
        android.os.Message obtain = android.os.Message.obtain();
        obtain.obj = n3Var;
        this.f270441d.mo50308x2936bf5f(obtain);
    }
}
