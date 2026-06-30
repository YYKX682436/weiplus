package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes8.dex */
public class l0 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "currentMpInfo";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
        org.json.JSONObject jSONObject = bVar.f488130b.f426039c;
        java.lang.String icon = jSONObject.optString("brandIcon");
        java.lang.String optString = jSONObject.optString("brandName");
        java.lang.String optString2 = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCurrentMpInfo", "doCurrentMpInfo brandIcon:%s", icon);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(icon)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).D.X(icon);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.x3 x3Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).E;
            x3Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(icon, "icon");
            x3Var.f264221z = icon;
            x3Var.K(icon);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.x3 x3Var2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).E;
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = x3Var2.f381610a;
            r45.lr4 v07 = c16601x7ed0e40c != null ? c16601x7ed0e40c.v0() : null;
            if (v07 != null) {
                v07.set(0, optString);
            }
            x3Var2.I();
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).D.Z(optString2);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).E.L(optString2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16092xbbe22aef c16092xbbe22aef = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).F;
        if (c16092xbbe22aef != null) {
            if (icon == null) {
                icon = "";
            }
            c16092xbbe22aef.m65137x764b6bfb(icon);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).F.m65139x53bfe316(optString);
            }
            ((d73.i) i95.n0.c(d73.i.class)).Jc(((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).F);
        }
        bVar.a();
    }
}
