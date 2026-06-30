package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac;

/* loaded from: classes7.dex */
public class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.a {

    /* renamed from: CTRL_INDEX */
    public static final int f34167x366c91de = 592;

    /* renamed from: NAME */
    public static final java.lang.String f34168x24728b = "openBusinessView";

    /* renamed from: g, reason: collision with root package name */
    public boolean f162487g = false;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f162488h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f162489i;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, final int i17) {
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        final java.lang.String optString = jSONObject.optString("businessType");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            D(yVar, i17, -4, "fail invalid businessType");
            return;
        }
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
        if (optJSONObject == null) {
            optJSONObject = new org.json.JSONObject();
        }
        org.json.JSONObject jSONObject2 = optJSONObject;
        if (jSONObject.optJSONObject("privateExtraData") == null) {
            new org.json.JSONObject();
        }
        java.lang.String optString2 = jSONObject.optString("queryString");
        int i18 = yVar.t3().E0().f387385r.f156932d;
        int i19 = (i18 == 1 || i18 == 2) ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b.a(jSONObject.optString("envVersion"), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b.RELEASE).f163727d : 0;
        int optInt = jSONObject.optInt("sourcetype", 5);
        java.lang.String optString3 = jSONObject.optString("agentId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.d dVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.d();
        dVar.f163737a = i17;
        dVar.f163738b = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        dVar.f163739c = jSONObject.optString("sceneNote");
        dVar.f163740d = jSONObject.optInt("preScene", 0);
        dVar.f163741e = jSONObject.optString("preSceneNote");
        dVar.f163743g = optInt;
        dVar.f163742f = optString3;
        dVar.f163745i = optString;
        dVar.f163747k = jSONObject.optBoolean("sticky", false);
        dVar.f163748l = jSONObject.optBoolean("disableVisibilityEvent", false);
        java.lang.String mo48798x74292566 = yVar.mo48798x74292566();
        this.f162487g = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.l(this, yVar.mo50352x76847179(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.i(this, yVar, i17)));
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f162489i;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
        final p012xc85e97e9.p093xedfae76a.y mo50358x95c7fa5f = yVar.mo50358x95c7fa5f();
        java.util.Objects.requireNonNull(mo50358x95c7fa5f);
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5727xe19dcaa5> abstractC20980x9b9ad01d2 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5727xe19dcaa5>(mo50358x95c7fa5f) { // from class: com.tencent.mm.plugin.appbrand.jsapi.fakenative.JsApiOpenBusinessView$3
            {
                this.f39173x3fe91575 = -1201570635;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5727xe19dcaa5 c5727xe19dcaa5) {
                org.json.JSONObject jSONObject3;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5727xe19dcaa5 c5727xe19dcaa52 = c5727xe19dcaa5;
                if (!u46.l.c(c5727xe19dcaa52.f136049g.f88963b, optString)) {
                    return false;
                }
                am.nk nkVar = c5727xe19dcaa52.f136049g;
                java.lang.String str = nkVar.f88965d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar2 = yVar;
                if (!u46.l.c(str, yVar2.mo48798x74292566())) {
                    return false;
                }
                int i27 = nkVar.f88962a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.h hVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.h.this;
                int i28 = i17;
                if (i27 < 0) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("errCode", java.lang.Integer.valueOf(i27));
                    java.lang.String str2 = i27 == -2 ? "fail CGI error" : i27 == -3 ? "fail cancel" : i27 == -4 ? "fail invalid businessType" : "fail system error";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenBusinessView", "navigate back MiniProgram fail, errCode:%s, errMsg:%s", java.lang.Integer.valueOf(i27), str2);
                    yVar2.a(i28, hVar.p(str2, hashMap));
                } else {
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    hashMap2.put("errCode", java.lang.Integer.valueOf(i27));
                    java.lang.String str3 = nkVar.f88964c;
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (str3 == null) {
                        str3 = "{}";
                    }
                    try {
                        jSONObject3 = new org.json.JSONObject(str3);
                    } catch (org.json.JSONException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenBusinessView", "navigate back MiniProgram, parse extraData fail", e17);
                        jSONObject3 = new org.json.JSONObject();
                    }
                    hashMap2.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, jSONObject3);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenBusinessView", "navigate back MiniProgram success");
                    yVar2.a(i28, hVar.p("ok", hashMap2));
                }
                mo48814x2efc64();
                return false;
            }
        };
        this.f162489i = abstractC20980x9b9ad01d2;
        abstractC20980x9b9ad01d2.mo48813x58998cd();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.z.h(3, optString, optString2, mo48798x74292566, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.k(this, yVar, i17, optString2, jSONObject2, i19, dVar, jSONObject));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.a
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.h C() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.y.f162534c;
    }

    public final void D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, int i18, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errCode", java.lang.Integer.valueOf(i18));
        yVar.a(i17, p(str, hashMap));
    }
}
