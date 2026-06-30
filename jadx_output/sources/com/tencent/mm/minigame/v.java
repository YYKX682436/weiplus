package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f69150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f69151e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.minigame.y f69152f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, com.tencent.mm.minigame.y yVar) {
        super(0);
        this.f69150d = c0Var;
        this.f69151e = i17;
        this.f69152f = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pa1.t tVar;
        yd.n nVar;
        com.tencent.mm.plugin.appbrand.o6 o6Var = com.tencent.mm.minigame.f0.f69069b;
        if (o6Var == null || o6Var.L0() || o6Var.S) {
            com.tencent.mars.xlog.Log.w("WVA.WVAActivityDelegate", "getRenderer but runtime is finishing");
            tVar = null;
        } else {
            com.tencent.mm.plugin.appbrand.page.n7 N2 = o6Var.N2();
            kotlin.jvm.internal.o.e(N2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.game.page.WAGamePageView");
            tVar = ((pa1.o) N2).o4();
        }
        if (tVar == null) {
            com.tencent.mars.xlog.Log.e("WVA.WVAActivityDelegate", "moveToBackground, getRenderer is null");
        } else {
            com.tencent.luggage.game.page.WAGamePageViewContainerLayout wAGamePageViewContainerLayout = tVar.f40685f;
            if (wAGamePageViewContainerLayout != null) {
                wAGamePageViewContainerLayout.removeView(tVar.f40699w);
                if (tVar.f40686g.getParent() == null) {
                    tVar.f40685f.addView(tVar.f40686g, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
                }
                yd.u S = tVar.S();
                if (S != null && (nVar = S.f460966b) != null) {
                    com.tencent.mm.sdk.platformtools.b4 b4Var = nVar.f460958m;
                    nVar.setVisibility(0);
                    b4Var.c(1000L, 1000L);
                }
            }
        }
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f69150d;
        int i17 = this.f69151e;
        com.tencent.mm.minigame.y yVar = this.f69152f;
        yVar.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        c0Var.a(i17, yVar.u(str, jSONObject));
        return jz5.f0.f302826a;
    }
}
