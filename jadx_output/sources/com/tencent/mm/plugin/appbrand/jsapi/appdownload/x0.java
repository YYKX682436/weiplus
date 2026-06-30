package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes15.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f78975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.l14 f78976e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.appdownload.e1 f78977f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.appdownload.z0 f78978g;

    public x0(com.tencent.mm.plugin.appbrand.jsapi.appdownload.z0 z0Var, android.content.Intent intent, r45.l14 l14Var, com.tencent.mm.plugin.appbrand.jsapi.appdownload.e1 e1Var) {
        this.f78978g = z0Var;
        this.f78975d = intent;
        this.f78976e = l14Var;
        this.f78977f = e1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        com.tencent.mm.plugin.appbrand.jsapi.appdownload.z0 z0Var = this.f78978g;
        this.f78977f.b(((kt.c) i0Var).cj(z0Var.f78984g.f78930a.getF147807d(), this.f78975d, null, this.f78976e.f379072f, this.f78977f, z0Var.f78984g.f78933d));
    }
}
