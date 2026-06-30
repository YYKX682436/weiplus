package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public class y1 extends com.tencent.mm.plugin.appbrand.jsapi.f implements com.tencent.mm.plugin.appbrand.jsapi.g {
    public static final int CTRL_INDEX = 57;
    public static final java.lang.String NAME = "requestPayment";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void A(com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, org.json.JSONObject jSONObject, int i17) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void D(com.tencent.mm.plugin.appbrand.jsapi.ff ffVar, int i17) {
        java.lang.Object obj;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) ffVar.f81013b;
        int i18 = ffVar.f81016e;
        org.json.JSONObject jSONObject = ffVar.f81015d;
        org.json.JSONObject jSONObject2 = ffVar.f81014c;
        if (jSONObject2 == null) {
            E(i17, 4);
            d0Var.a(i18, o("fail:invalid data"));
            return;
        }
        com.tencent.mm.plugin.appbrand.o6 o6Var = (com.tencent.mm.plugin.appbrand.o6) d0Var.t3();
        android.app.Activity r07 = o6Var.r0();
        if (r07 == null) {
            E(i17, 4);
            d0Var.a(i18, o("fail:internal error invalid android context"));
            return;
        }
        java.lang.String t17 = u46.l.t(o6Var.x0().getCurrentUrl(), 0, 1024);
        java.lang.String str = o6Var.u0().f47278x;
        java.lang.String str2 = o6Var.u0().f77278d;
        try {
            if (!com.tencent.mm.plugin.appbrand.jsapi.pay.f.d(d0Var, jSONObject2, jSONObject, NAME, true)) {
                E(i17, 4);
                d0Var.a(i18, o("fail illegal appId"));
                return;
            }
            jSONObject2.put("key_appbrand_from_path", t17);
            com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$JsApiPayInfo wCPaySessionInfoRecorder$JsApiPayInfo = (com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$JsApiPayInfo) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(java.lang.String.format("%s,%s", str, d0Var.getAppId())), com.tencent.mm.plugin.appbrand.jsapi.pay.w1.class);
            if (wCPaySessionInfoRecorder$JsApiPayInfo != null) {
                jSONObject2.put("key_chat_type", wCPaySessionInfoRecorder$JsApiPayInfo.f180838d.f180949d);
                jSONObject2.put("key_send_type", wCPaySessionInfoRecorder$JsApiPayInfo.f180839e.f180985d);
                jSONObject2.put("key_qrcode_session_type", wCPaySessionInfoRecorder$JsApiPayInfo.f180840f.f180969d);
                jSONObject2.put("key_qrcode_session_name", wCPaySessionInfoRecorder$JsApiPayInfo.f180841g);
                jSONObject2.put("key_qrcode_timeline_objid", wCPaySessionInfoRecorder$JsApiPayInfo.f180842h);
                jSONObject2.put("key_qrcode_msg_svrid", wCPaySessionInfoRecorder$JsApiPayInfo.f180843i);
                jSONObject2.put("key_qrcode_msg_send_user", wCPaySessionInfoRecorder$JsApiPayInfo.f180844m);
                jSONObject2.put("key_init_raw_url", wCPaySessionInfoRecorder$JsApiPayInfo.f180845n);
                jSONObject2.put("key_init_timestamp", wCPaySessionInfoRecorder$JsApiPayInfo.f180846o);
            }
            com.tencent.mm.pointers.PString pString = new com.tencent.mm.pointers.PString();
            android.util.SparseArray sparseArray = ((com.tencent.mm.plugin.appbrand.o6) d0Var.t3()).f86176k2.f435562a;
            synchronized (sparseArray) {
                obj = sparseArray.get(i18, null);
            }
            vd1.g gVar = (vd1.g) obj;
            java.lang.String optString = jSONObject2.optString("requestId");
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestPayment", "requestId:%s", optString);
            E(i17, 5);
            if (!com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.INSTANCE.startPay(r07, d0Var, o6Var.l2(), jSONObject2, new com.tencent.mm.plugin.appbrand.jsapi.pay.v1(this, d0Var, i18, gVar, optString), pString)) {
                d0Var.a(i18, o("fail"));
                return;
            }
            if (jSONObject2.optBoolean("grantMessageQuota", true)) {
                com.tencent.mm.plugin.appbrand.page.v5 V0 = d0Var instanceof com.tencent.mm.plugin.appbrand.page.v5 ? (com.tencent.mm.plugin.appbrand.page.v5) d0Var : ((com.tencent.mm.plugin.appbrand.e9) d0Var).V0();
                java.lang.String str3 = pString.value;
                if (V0 == null) {
                    return;
                }
                com.tencent.mm.plugin.appbrand.jsapi.base.ReportSubmitFormTask reportSubmitFormTask = new com.tencent.mm.plugin.appbrand.jsapi.base.ReportSubmitFormTask(V0.t3().E0());
                reportSubmitFormTask.f79849f = 0;
                reportSubmitFormTask.f79851h = str3.replace("prepay_id=", "");
                reportSubmitFormTask.f79852i = V0.X1();
                reportSubmitFormTask.d();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRequestPayment", e17.getMessage());
            E(i17, 4);
            d0Var.a(i18, o("fail"));
        }
    }

    public final void E(int i17, int i18) {
        if (i17 == 84) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(29733, java.lang.Integer.valueOf(i18), 2);
        }
    }

    public void h(com.tencent.mm.plugin.appbrand.jsapi.ff ffVar) {
        D(ffVar, 0);
    }
}
