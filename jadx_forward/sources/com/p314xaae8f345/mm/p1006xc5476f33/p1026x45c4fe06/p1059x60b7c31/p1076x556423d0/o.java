package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0;

/* loaded from: classes7.dex */
public abstract class o extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.m {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f161792g = true;

    public o() {
        si1.e.a(k());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.m
    public void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, int i17) {
        java.lang.String str;
        if (lVar == null) {
            return;
        }
        android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
        if (mo50352x76847179 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsCommon", "invoke, context is null");
            lVar.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiOpenChannelsCommon", "invoke, data: " + jSONObject);
        org.json.JSONObject jSONObject3 = jSONObject == null ? new org.json.JSONObject() : jSONObject;
        try {
            jSONObject3.put("action", E());
            java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
            if (jSONObject2 == null || (str = jSONObject2.optString("appId", mo48798x74292566)) == null) {
                str = mo48798x74292566;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiOpenChannelsCommon", "invoke, privateData: " + jSONObject2 + ", envAppId: " + mo48798x74292566 + ", appId: " + str);
            jSONObject3.put("sourceId", str);
            if (F()) {
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                jSONObject4.put("appid", lVar.mo48798x74292566());
                if (jSONObject3.has("reportExtraInfo")) {
                    jSONObject4.put("passthrough", jSONObject3.opt("reportExtraInfo"));
                }
                org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                jSONObject5.put("weapp_info", jSONObject4);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiOpenChannelsCommon", "invoke, reportExtInfo: " + jSONObject5);
                jSONObject3.put("reportExtraInfo", jSONObject5);
            }
            if (!J(jSONObject3, jSONObject)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsCommon", "invoke, preProcessExtInfo fail");
                lVar.a(i17, o("fail:internal error"));
                return;
            }
            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
            try {
                jSONObject6.put("extInfo", jSONObject3);
                D(lVar, i17, mo50352x76847179, jSONObject6);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsCommon", "invoke, put extInfo fail since " + e17);
                lVar.a(i17, o("fail:internal error"));
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsCommon", "invoke, put fail since " + e18);
            lVar.a(i17, o("fail:internal error"));
        }
    }

    public void D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l env, int i17, android.content.Context context, org.json.JSONObject extInfoWrapperJsonObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfoWrapperJsonObj, "extInfoWrapperJsonObj");
        java.lang.String jSONObject = extInfoWrapperJsonObj.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12044xf2f7fb1 c12044xf2f7fb1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12044xf2f7fb1(jSONObject, G());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.n nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.n(env, i17, this);
        android.content.Intent K = K(context);
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class, c12044xf2f7fb1, nVar, K);
    }

    public abstract java.lang.String E();

    public boolean F() {
        return this.f161792g;
    }

    public boolean G() {
        return false;
    }

    public java.lang.String H(java.lang.String originErrMsg, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originErrMsg, "originErrMsg");
        return originErrMsg;
    }

    public org.json.JSONObject I(org.json.JSONObject jSONObject) {
        return jSONObject;
    }

    public boolean J(org.json.JSONObject extInfoJsonObj, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfoJsonObj, "extInfoJsonObj");
        return true;
    }

    public android.content.Intent K(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return null;
    }
}
