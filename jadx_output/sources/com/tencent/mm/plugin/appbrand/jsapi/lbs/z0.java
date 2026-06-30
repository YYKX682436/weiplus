package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lbs.a1 f81517d;

    public z0(com.tencent.mm.plugin.appbrand.jsapi.lbs.a1 a1Var) {
        this.f81517d = a1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.lbs.a1 a1Var = this.f81517d;
        mi1.w0 w0Var = a1Var.f81390d.f81395b;
        if (w0Var != null) {
            w0Var.dismiss();
            a1Var.f81390d.f81395b = null;
        }
        a1Var.f81390d.f81397d = null;
    }
}
