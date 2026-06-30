package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class j implements r01.z2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.k f261884a;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.k kVar) {
        this.f261884a = kVar;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0073 -> B:12:0x0081). Please report as a decompilation issue!!! */
    @Override // r01.z2
    public void a(int i17, int i18, java.lang.String str, r01.y2 y2Var) {
        org.json.JSONObject jSONObject;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "onSceneEnd errType = " + i17 + ", errCode = " + i18 + ",errMsg = " + str);
        if (i17 != 0 || i18 != 0) {
            y2Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxPay.ContactWidgetWxPayCollection", "scene.getType() = %s", 1769);
            return;
        }
        r45.nm3 nm3Var = ((r01.k3) y2Var).f449666f;
        if (nm3Var == null) {
            nm3Var = new r45.nm3();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "resp : %s", nm3Var.f463028d);
        rv.t2 Ai = ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Ai(this.f261884a.f261898e.d1());
        try {
            jSONObject = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((qk.o) Ai).f66740x26b3182a) ? new org.json.JSONObject() : new org.json.JSONObject(((qk.o) Ai).f66740x26b3182a);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxPay.ContactWidgetWxPayCollection", "create Json object from extInfo error. %s.", e17);
            jSONObject = new org.json.JSONObject();
        }
        try {
            jSONObject.put("MMBizMenu", nm3Var.f463028d);
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxPay.ContactWidgetWxPayCollection", "updateExtInfoAttrs MMBizMenu failed：value(%s), exception : %s.", nm3Var.f463028d, e18);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nm3Var.f463028d)) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WX_PAY_REVEIVE_PLUGIN_MENU_STRING_SYNC, nm3Var.f463028d);
        }
        ((qk.o) Ai).f66740x26b3182a = jSONObject.toString();
        ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Di(Ai);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "Update bizInfo attributes successfully.");
    }
}
