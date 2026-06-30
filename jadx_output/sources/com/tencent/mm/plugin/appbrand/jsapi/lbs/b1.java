package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lbs.c1 f81392d;

    public b1(com.tencent.mm.plugin.appbrand.jsapi.lbs.c1 c1Var) {
        this.f81392d = c1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.lbs.c1 c1Var = this.f81392d;
        java.lang.Runnable runnable = c1Var.f81397d;
        if (runnable != null) {
            c1Var.f81396c.removeCallbacks(runnable);
            c1Var.f81397d = null;
        }
        mi1.w0 w0Var = c1Var.f81395b;
        if (w0Var != null) {
            w0Var.dismiss();
            c1Var.f81395b = null;
        }
    }
}
