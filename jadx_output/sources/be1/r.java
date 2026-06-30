package be1;

/* loaded from: classes8.dex */
public class r extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 169;
    public static final java.lang.String NAME = "getClipboardData";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("clipboard");
        if (clipboardManager == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetClipboardData", "getSystemService(CLIPBOARD_SERVICE) failed.");
            lVar.a(i17, o("fail"));
            return;
        }
        try {
            android.content.ClipData primaryClip = clipboardManager.getPrimaryClip();
            java.lang.String str = "";
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                android.content.ClipData.Item itemAt = primaryClip.getItemAt(0);
                if (itemAt.getText() != null) {
                    str = itemAt.getText().toString();
                }
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, str);
            lVar.a(i17, p("ok", hashMap));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetClipboardData", "invoke with appId:%s, but get Exception:%s", lVar.getAppId(), e17);
        }
    }
}
