package com.tencent.mm.modelsimple;

/* loaded from: classes9.dex */
public class h1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, de0.h {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f71336d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f71337e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f71338f;

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
                jSONObject3.put("appusername", jSONObject.optString(dm.i4.COL_USERNAME) + "@app");
                jSONObject3.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH));
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
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneTranslateLink", e17, "parseFinderComponentJumpInfo exception", new java.lang.Object[0]);
            return null;
        }
    }

    public r45.zp6 I() {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.modelbase.o oVar = this.f71337e;
        if (oVar == null || (fVar = oVar.f70711b.f70700a) == null) {
            return null;
        }
        return (r45.zp6) fVar;
    }

    public final void J(java.lang.String str, int i17, java.util.LinkedList linkedList, java.lang.String str2, java.lang.String str3, int i18, r45.qa qaVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTranslateLink", "ticket link = " + str + "; scene = " + i17 + "; token = " + str2 + "; sdkVersion = " + str3 + "; authenticationResult = " + i18);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.yp6();
        lVar.f70665b = new r45.zp6();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/translatelink";
        lVar.f70667d = 1200;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f71337e = a17;
        r45.yp6 yp6Var = (r45.yp6) a17.f70710a.f70684a;
        yp6Var.f391276d = str;
        yp6Var.f391277e = i17;
        yp6Var.f391279g = linkedList;
        yp6Var.f391280h = str2;
        yp6Var.f391281i = str3;
        yp6Var.f391283n = i18;
        yp6Var.f391284o = qaVar;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f71336d = u0Var;
        return dispatch(sVar, this.f71337e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1200;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f71336d.onSceneEnd(i18, i19, str, this);
    }

    public h1(java.lang.String str, int i17, java.util.LinkedList linkedList, java.lang.String str2, java.lang.String str3, int i18, r45.qa qaVar) {
        J(str, i17, linkedList, str2, str3, i18, qaVar);
    }
}
