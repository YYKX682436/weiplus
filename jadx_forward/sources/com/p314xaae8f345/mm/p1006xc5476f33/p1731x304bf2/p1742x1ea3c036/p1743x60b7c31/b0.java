package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes8.dex */
public final class b0 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "fetchGameCenterEntranceInfo";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        if (q5Var == null || context == null) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5862x6c491c8f c5862x6c491c8f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5862x6c491c8f();
        c5862x6c491c8f.e();
        m33.r0 r0Var = m33.q0.f404860a;
        m33.p0 p0Var = r0Var.f404862a;
        if (p0Var == null) {
            am.dp dpVar = c5862x6c491c8f.f136169g;
            if (dpVar.f88017c == null) {
                q5Var.a("sessionid is null", null);
                return;
            } else {
                ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Ai(dpVar.f88017c, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.a0(c5862x6c491c8f, this, q5Var));
                return;
            }
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String str2 = p0Var.f404856a;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("iconUrl", str2);
        java.lang.String str3 = p0Var.f404857b;
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("wording", str3);
        java.lang.String str4 = p0Var.f404858c;
        jSONObject.put("noticeId", str4 != null ? str4 : "");
        jSONObject.put("msgType", p0Var.f404859d);
        q5Var.a(null, jSONObject);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("fetchGameCenterEntranceInfo", "cacheMsg exist iconUrl = " + p0Var.f404856a + "  , wording = " + p0Var.f404857b + ", msgType= " + p0Var.f404859d);
        r0Var.f404862a = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}
