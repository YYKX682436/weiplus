package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes8.dex */
public class t extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "configLiveBrandName";
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiConfigLiveBrandName", "invokeInOwn");
        org.json.JSONObject jSONObject = bVar.f488130b.f426039c;
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiConfigLiveBrandName", "data is null");
            bVar.c("null_data", null);
            return;
        }
        java.lang.String optString = jSONObject.optString("userName");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            bVar.c("userName is null", null);
            return;
        }
        java.lang.String optString2 = jSONObject.optString("reportStr");
        int optInt = jSONObject.optInt("bizType", 1);
        java.lang.String optString3 = jSONObject.optString("byPass");
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) bVar.f488129a;
        x0Var.f221485d2 = optString;
        if (x0Var.f263719t instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.u) {
            x0Var.L();
            java.lang.String string = x0Var.f488190n.getString("rawUrl");
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.u uVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.u) x0Var.f263719t;
            uVar.Q = optString;
            uVar.R = optString2;
            uVar.S = optInt;
            uVar.T = string;
            uVar.U = optString3;
            uVar.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.s(uVar));
        }
        bVar.a();
    }
}
