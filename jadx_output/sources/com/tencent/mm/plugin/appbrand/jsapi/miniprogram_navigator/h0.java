package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

/* loaded from: classes7.dex */
public class h0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f82229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ze.n f82230b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82231c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f82233e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel f82234f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.i0 f82235g;

    public h0(com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.i0 i0Var, ik1.b0 b0Var, ze.n nVar, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.appbrand.y yVar, com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel) {
        this.f82235g = i0Var;
        this.f82229a = b0Var;
        this.f82230b = nVar;
        this.f82231c = str;
        this.f82232d = str2;
        this.f82233e = yVar;
        this.f82234f = launchParcel;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        km5.b c17 = km5.u.c();
        this.f82229a.f291824a = new ph1.l();
        ((ph1.l) this.f82229a.f291824a).f354337d = new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.e0(this);
        ph1.l lVar = (ph1.l) this.f82229a.f291824a;
        com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.f0 f0Var = new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.f0(this, c17);
        lVar.f354341h = f0Var;
        fl1.a2 a2Var = lVar.f354339f;
        if (a2Var != null) {
            ((fl1.g1) a2Var).setOnCancelListener(f0Var);
        }
        ((ph1.l) this.f82229a.f291824a).b(this.f82230b, false);
        if (!this.f82235g.e(this.f82233e, this.f82234f, new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g0(this, c17))) {
            c17.c(java.lang.Boolean.TRUE);
        }
        return java.lang.Boolean.FALSE;
    }
}
