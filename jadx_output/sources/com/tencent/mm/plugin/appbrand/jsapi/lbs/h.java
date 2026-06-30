package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public final class h extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 938;
    public static final java.lang.String NAME = "choosePoi";

    /* renamed from: g, reason: collision with root package name */
    public final int f81417g = cf.b.a(cf.b.f40819a);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (e9Var == null) {
            return;
        }
        android.app.Activity Z0 = e9Var.Z0();
        kotlin.jvm.internal.o.f(Z0, "getPageContext(...)");
        nf.g.a(Z0).f(new com.tencent.mm.plugin.appbrand.jsapi.lbs.g(this, e9Var, i17));
        j45.l.n(Z0, "nearlife", ".ui.CheckInLifeUI", new android.content.Intent(), this.f81417g);
    }
}
