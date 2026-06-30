package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31;

/* loaded from: classes7.dex */
public final class j implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.b {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.b
    public java.lang.String b() {
        return "sdk_openFeedback";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.b
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.C12403xda2a3ec7 invokeArgs, l81.b1 appOpenBundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeArgs, "invokeArgs");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appOpenBundle, "appOpenBundle");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(invokeArgs.f167093f);
            ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
            java.lang.String optString = jSONObject.optString("appId", null);
            if (optString == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.b.a(this, invokeArgs, null, null, 6, null);
                return;
            }
            java.lang.String optString2 = jSONObject.optString("pageId");
            int optInt = jSONObject.optInt("appVersion", 0);
            int optInt2 = jSONObject.optInt("versionType", 0);
            k91.z5 z5Var = new k91.z5();
            z5Var.f387396a = optString;
            z5Var.f387406k = optString2;
            z5Var.f387402g = optInt;
            z5Var.f387403h = optInt2;
            z5Var.f387405j = 16;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.d.a(null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.i(this, invokeArgs, z5Var.a()));
        } catch (org.json.JSONException unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.b.a(this, invokeArgs, null, null, 6, null);
        }
    }
}
