package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lbs.c1 f81390d;

    public a1(com.tencent.mm.plugin.appbrand.jsapi.lbs.c1 c1Var) {
        this.f81390d = c1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.lbs.c1 c1Var = this.f81390d;
        if (c1Var.f81395b == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - c1Var.f81394a;
        if (currentTimeMillis >= 3000) {
            c1Var.f81395b.dismiss();
            c1Var.f81395b = null;
            c1Var.f81397d = null;
        } else {
            java.lang.Runnable runnable = c1Var.f81397d;
            if (runnable != null) {
                c1Var.f81396c.removeCallbacks(runnable);
            }
            com.tencent.mm.plugin.appbrand.jsapi.lbs.z0 z0Var = new com.tencent.mm.plugin.appbrand.jsapi.lbs.z0(this);
            c1Var.f81397d = z0Var;
            c1Var.f81396c.postDelayed(z0Var, 3000 - currentTimeMillis);
        }
    }
}
