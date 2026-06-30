package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes15.dex */
public class a7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f78696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.l14 f78697e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.h7 f78698f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.c7 f78699g;

    public a7(com.tencent.mm.plugin.appbrand.jsapi.c7 c7Var, android.content.Intent intent, r45.l14 l14Var, com.tencent.mm.plugin.appbrand.jsapi.h7 h7Var) {
        this.f78699g = c7Var;
        this.f78696d = intent;
        this.f78697e = l14Var;
        this.f78698f = h7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        com.tencent.mm.plugin.appbrand.jsapi.c7 c7Var = this.f78699g;
        this.f78698f.b(((kt.c) i0Var).cj(c7Var.f80160g.f80739a.getF147807d(), this.f78696d, null, this.f78697e.f379072f, this.f78698f, c7Var.f80160g.f80743e));
    }
}
