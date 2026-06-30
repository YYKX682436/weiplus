package com.p314xaae8f345.mm.p957x53236a1b;

/* loaded from: classes9.dex */
public class h1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, de0.h {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f152869d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f152870e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f152871f;

    public h1(java.lang.String str, int i17, java.util.LinkedList linkedList) {
        J(str, i17, linkedList, "", "", 0, null);
    }

    public final org.json.JSONObject H(int i17, org.json.JSONObject jSONObject) {
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("jumpType", i17);
            jSONObject2.put("wording", jSONObject.optString("wording"));
            jSONObject2.put("extra", jSONObject.optString("extra"));
            if (i17 == 1) {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("appusername", jSONObject.optString(dm.i4.f66875xa013b0d5) + "@app");
                jSONObject3.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, jSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714));
                jSONObject2.put("miniAppInfo", jSONObject3);
            } else {
                if (i17 != 2) {
                    return null;
                }
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                jSONObject4.put("url", jSONObject.optString("url"));
                jSONObject2.put("html5Info", jSONObject4);
            }
            return jSONObject2;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneTranslateLink", e17, "parseFinderComponentJumpInfo exception", new java.lang.Object[0]);
            return null;
        }
    }

    public r45.zp6 I() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f152870e;
        if (oVar == null || (fVar = oVar.f152244b.f152233a) == null) {
            return null;
        }
        return (r45.zp6) fVar;
    }

    public final void J(java.lang.String str, int i17, java.util.LinkedList linkedList, java.lang.String str2, java.lang.String str3, int i18, r45.qa qaVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTranslateLink", "ticket link = " + str + "; scene = " + i17 + "; token = " + str2 + "; sdkVersion = " + str3 + "; authenticationResult = " + i18);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.yp6();
        lVar.f152198b = new r45.zp6();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/translatelink";
        lVar.f152200d = 1200;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f152870e = a17;
        r45.yp6 yp6Var = (r45.yp6) a17.f152243a.f152217a;
        yp6Var.f472809d = str;
        yp6Var.f472810e = i17;
        yp6Var.f472812g = linkedList;
        yp6Var.f472813h = str2;
        yp6Var.f472814i = str3;
        yp6Var.f472816n = i18;
        yp6Var.f472817o = qaVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f152869d = u0Var;
        return mo9409x10f9447a(sVar, this.f152870e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1200;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f152869d.mo815x76e0bfae(i18, i19, str, this);
    }

    public h1(java.lang.String str, int i17, java.util.LinkedList linkedList, java.lang.String str2, java.lang.String str3, int i18, r45.qa qaVar) {
        J(str, i17, linkedList, str2, str3, i18, qaVar);
    }
}
