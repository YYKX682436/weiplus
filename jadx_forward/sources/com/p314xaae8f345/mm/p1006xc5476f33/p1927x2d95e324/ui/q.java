package com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui;

/* loaded from: classes9.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f233876d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f233877e;

    public q(java.lang.String str, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        this.f233876d = str;
        this.f233877e = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] u07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u0(this.f233876d);
        android.os.Message obtain = android.os.Message.obtain();
        obtain.obj = u07;
        this.f233877e.mo50308x2936bf5f(obtain);
    }
}
