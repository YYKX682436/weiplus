package com.p314xaae8f345.mm.p874xaefb6cc9;

/* loaded from: classes7.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f150683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f150684e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p874xaefb6cc9.y f150685f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17, com.p314xaae8f345.mm.p874xaefb6cc9.y yVar) {
        super(0);
        this.f150683d = c0Var;
        this.f150684e = i17;
        this.f150685f = yVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        pa1.t tVar;
        yd.n nVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = com.p314xaae8f345.mm.p874xaefb6cc9.f0.f150602b;
        if (o6Var == null || o6Var.L0() || o6Var.S) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WVA.WVAActivityDelegate", "getRenderer but runtime is finishing");
            tVar = null;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 N2 = o6Var.N2();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(N2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.game.page.WAGamePageView");
            tVar = ((pa1.o) N2).o4();
        }
        if (tVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WVA.WVAActivityDelegate", "moveToBackground, getRenderer is null");
        } else {
            com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p431x34628f.C3895x4edfdd1b c3895x4edfdd1b = tVar.f122218f;
            if (c3895x4edfdd1b != null) {
                c3895x4edfdd1b.removeView(tVar.f122232w);
                if (tVar.f122219g.getParent() == null) {
                    tVar.f122218f.addView(tVar.f122219g, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
                }
                yd.u S = tVar.S();
                if (S != null && (nVar = S.f542499b) != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = nVar.f542491m;
                    nVar.setVisibility(0);
                    b4Var.c(1000L, 1000L);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f150683d;
        int i17 = this.f150684e;
        com.p314xaae8f345.mm.p874xaefb6cc9.y yVar = this.f150685f;
        yVar.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        c0Var.a(i17, yVar.u(str, jSONObject));
        return jz5.f0.f384359a;
    }
}
