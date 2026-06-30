package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes15.dex */
public class l7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f81364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.l14 f81365e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.w7 f81366f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.n7 f81367g;

    public l7(com.tencent.mm.plugin.appbrand.jsapi.n7 n7Var, android.content.Intent intent, r45.l14 l14Var, com.tencent.mm.plugin.appbrand.jsapi.w7 w7Var) {
        this.f81367g = n7Var;
        this.f81364d = intent;
        this.f81365e = l14Var;
        this.f81366f = w7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.v7 v7Var;
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        com.tencent.mm.plugin.appbrand.jsapi.n7 n7Var = this.f81367g;
        boolean cj6 = ((kt.c) i0Var).cj(n7Var.f82380g.f82448a.getF147807d(), this.f81364d, null, this.f81365e.f379072f, this.f81366f, n7Var.f82380g.f82458k);
        com.tencent.mm.plugin.appbrand.jsapi.w7 w7Var = this.f81366f;
        w7Var.f83714a = cj6;
        w7Var.f83717d = true;
        if (!w7Var.f83716c || (v7Var = w7Var.f83718e) == null) {
            return;
        }
        v7Var.a(cj6, w7Var.f83715b);
    }
}
