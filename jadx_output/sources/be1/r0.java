package be1;

/* loaded from: classes.dex */
public class r0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 168;
    public static final java.lang.String NAME = "setClipboardData";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String optString = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            lVar.a(i17, o("fail"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetClipboardData", "stevyang dataStr %s", optString);
        try {
            com.tencent.mm.sdk.platformtools.b0.d(lVar.getContext(), com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, optString, null);
            lVar.a(i17, o("ok"));
            C(lVar, optString);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetClipboardData", "setPrimaryClip get exception:%s", e17);
            lVar.a(i17, o("fail:internal error"));
        }
    }

    public void C(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str) {
    }
}
