package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36;

/* loaded from: classes14.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult f218689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.l0 f218690e;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.l0 l0Var, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult) {
        this.f218690e = l0Var;
        this.f218689d = cronetTaskResult;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionReflectManager", "GetFaceCheckAction use http response!");
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.l0 l0Var = this.f218690e;
        wu5.b bVar = l0Var.f218692a.X;
        if (bVar != null) {
            bVar.b();
        }
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult = this.f218689d;
        vz2.c.k("rspCfg", java.lang.Integer.valueOf(cronetTaskResult.f18200x139cb015));
        vz2.c.c().f137739h = cronetTaskResult.f18200x139cb015;
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.s0 s0Var = l0Var.f218692a;
        s0Var.N++;
        s0Var.P = java.lang.System.currentTimeMillis();
        if (cronetTaskResult.f18207xec0a8ff != 200 || cronetTaskResult.f18200x139cb015 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.s0 s0Var2 = l0Var.f218692a;
            s0Var2.r(90036, i65.a.r(s0Var2.f504804p, com.p314xaae8f345.mm.R.C30867xcad56011.f81517x9a9e6cc4), "cgi failed");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(cronetTaskResult.m37974x3a5e0c51());
            int optInt = jSONObject.optInt("errcode");
            java.lang.String optString = jSONObject.optString("msg");
            if (optInt == 0) {
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                java.lang.String optString2 = optJSONObject.optString("action_data");
                java.lang.String optString3 = optJSONObject.optString("color_data");
                java.lang.String optString4 = optJSONObject.optString("select_data");
                int i17 = optJSONObject.getInt("bio_id");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionReflectManager", "GetFaceCheckAction use http response. errCode: %s, errMsg: %s, action_data: %s, color_data: %s, select_data: %s, bio_id: %s", java.lang.Integer.valueOf(optInt), optString, optString2, optString3, optString4, java.lang.Integer.valueOf(i17));
                com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.s0 s0Var3 = l0Var.f218692a;
                s0Var3.f218713J = optString2;
                s0Var3.f504798g = i17;
                s0Var3.p(new java.lang.String(optString4.getBytes()), optString2, optString3);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionReflectManager", "GetFaceCheckAction use http response. errCode: %s, errMsg: %s", java.lang.Integer.valueOf(optInt), optString);
                l0Var.f218692a.r(optInt, optString, "response.ret_code != 0");
            }
        } catch (org.json.JSONException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionReflectManager", "GetFaceCheckAction use http response. parse resposne JSON error");
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.s0 s0Var4 = l0Var.f218692a;
            s0Var4.r(90036, i65.a.r(s0Var4.f504804p, com.p314xaae8f345.mm.R.C30867xcad56011.f81517x9a9e6cc4), "cgi failed");
        }
    }
}
