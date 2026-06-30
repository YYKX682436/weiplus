package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/biz/e1;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lorg/json/JSONObject;", "rawParams", "Ll81/b1;", "e", "", "d", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class e1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v {
    private final boolean d(org.json.JSONObject rawParams) {
        boolean optBoolean = rawParams.optBoolean("useDraft", false);
        if (!rawParams.has("draftType") || !rawParams.has("draftScene")) {
            return optBoolean;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenBizPublishImageForAppBrand", "has draftType and draftScene");
        tk.a Bi = ((ox.z) ((tk.r) i95.n0.c(tk.r.class))).Bi(e(rawParams));
        tk.s[] sVarArr = tk.s.f501403d;
        int optInt = rawParams.optInt("bizType", 1);
        rm.b0 b0Var = (rm.b0) i95.n0.c(rm.b0.class);
        int optInt2 = rawParams.optInt("draftType");
        java.lang.String optString = rawParams.optString("draftScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        return ((ur1.s) b0Var).Bi(optInt2, optString, optInt, Bi.f501391b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l81.b1 e(org.json.JSONObject rawParams) {
        l81.b1 b1Var = new l81.b1();
        b1Var.f398547b = "wx0b2ec076ec39c786";
        b1Var.f398565k = rawParams.has(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(rawParams.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811), 0) : 1037;
        b1Var.f398567l = rawParams.optString("sceneNote");
        java.lang.String optString = rawParams.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
        if (optString.length() == 0) {
            tk.o oVar = (tk.o) i95.n0.c(tk.o.class);
            tk.v vVar = tk.w.f501411e;
            tk.v vVar2 = tk.w.f501411e;
            java.lang.String optString2 = rawParams.optString("mpPublishAction", "openWeApp");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
            optString = ((ox.g) oVar).ij(vVar.a(optString2));
        }
        b1Var.f398555f = optString;
        b1Var.f398561i = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.d1(rawParams);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
        c11812xa040dc98.f158855d = 1;
        c11812xa040dc98.f158858g = rawParams.optString("privateExtraData");
        c11812xa040dc98.f158857f = rawParams.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
        c11812xa040dc98.f158856e = rawParams.optString("sourceAppId");
        c11812xa040dc98.f158862n = rawParams.optInt("sourceType");
        c11812xa040dc98.f158861m = rawParams.optString("agentId");
        c11812xa040dc98.f158868t = rawParams.optString("externalFileRefs");
        b1Var.f398574s = c11812xa040dc98;
        return b1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: handleRequest */
    public void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c) {
        if (!(abstractC11887x3610e10c instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12033x4888b8dc)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenBizPublishImageForAppBrand", "handleRequest, request is not OpenBizPublishImageProcessRequest");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12033x4888b8dc) abstractC11887x3610e10c).getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA java.lang.String());
            boolean d17 = d(jSONObject);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenBizPublishImageForAppBrand", "invoke in MM process， useDraft: " + d17);
            tk.o oVar = (tk.o) i95.n0.c(tk.o.class);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a = m50421x3c6fed6a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m50421x3c6fed6a, "getActivityContext(...)");
            ((ox.g) oVar).Zi(m50421x3c6fed6a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.c1(this, jSONObject, d17));
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenBizPublishImageForAppBrand", "parse json error");
            m50420x7b736e5c(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12034xcbb61794(false, "parse json error", ""));
        }
    }
}
