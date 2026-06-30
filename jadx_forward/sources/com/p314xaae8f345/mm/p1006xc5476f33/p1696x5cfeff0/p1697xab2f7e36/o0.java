package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36;

/* loaded from: classes14.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult f218699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.p0 f218700e;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.p0 p0Var, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult) {
        this.f218700e = p0Var;
        this.f218699d = cronetTaskResult;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionReflectManager", "GetFaceCheckResult use http response");
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.p0 p0Var = this.f218700e;
        wu5.b bVar = p0Var.f218704a.W;
        if (bVar != null) {
            bVar.b();
        }
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult = this.f218699d;
        java.lang.String m37974x3a5e0c51 = cronetTaskResult.m37974x3a5e0c51();
        if (cronetTaskResult.f18207xec0a8ff != 200 || cronetTaskResult.f18200x139cb015 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionReflectManager", "GetFaceCheckResult use http response, cgi failed!");
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.s0 s0Var = p0Var.f218704a;
            s0Var.r(90036, i65.a.r(s0Var.f504804p, com.p314xaae8f345.mm.R.C30867xcad56011.f81520xca8123a9), "GetFaceCheckResult use http cgi failed");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(m37974x3a5e0c51);
            int optInt = jSONObject.optInt("errcode");
            java.lang.String optString = jSONObject.optString("msg");
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            java.lang.String optString2 = jSONObject2.optString("auth_token");
            int optInt2 = jSONObject2.optInt("retry");
            java.lang.String optString3 = jSONObject2.optString("serial_id");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionReflectManager", "GetFaceCheckResult use http response, errCode: %s, erMsg: %s, auth_token: %s, retry: %s, serial_id: %s", java.lang.Integer.valueOf(optInt), optString, optString2, java.lang.Integer.valueOf(optInt2), optString3);
            p0Var.f218704a.q(cronetTaskResult.f18200x139cb015, 0, optInt, optString, optString2, optString3, optInt2);
        } catch (org.json.JSONException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionReflectManager", "GetFaceCheckResult use http response, parse response JSON error!");
        }
    }
}
