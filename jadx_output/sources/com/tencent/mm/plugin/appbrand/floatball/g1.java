package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class g1 implements mp1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.k1 f78095a;

    public g1(com.tencent.mm.plugin.appbrand.floatball.k1 k1Var) {
        this.f78095a = k1Var;
    }

    @Override // mp1.b
    public void a() {
        com.tencent.mm.plugin.appbrand.floatball.k1 k1Var = this.f78095a;
        com.tencent.mars.xlog.Log.i(k1Var.f78107v, "onCloseWithAnimation, transform to float ball animation cancel");
        k1Var.f93239n.q(true);
    }

    @Override // mp1.b
    public void onAnimationEnd() {
        com.tencent.mm.plugin.appbrand.floatball.k1 k1Var = this.f78095a;
        com.tencent.mars.xlog.Log.i(k1Var.f78107v, "onCloseWithAnimation, transform to float ball animation end");
        k1Var.f93239n.q(false);
    }
}
