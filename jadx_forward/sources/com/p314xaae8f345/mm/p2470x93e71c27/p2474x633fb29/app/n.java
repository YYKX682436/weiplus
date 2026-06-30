package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes8.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lt.h0 f270522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270524f;

    public n(lt.h0 h0Var, java.lang.String str, java.lang.String str2) {
        this.f270522d = h0Var;
        this.f270523e = str;
        this.f270524f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("key_open_sdk_pkg");
        lt.h0 h0Var = this.f270522d;
        if (R == null) {
            h0Var.a(null);
            return;
        }
        java.lang.String str = this.f270524f;
        java.lang.String str2 = this.f270523e;
        R.D(str2, str);
        h0Var.a(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.k(str2, true));
    }
}
