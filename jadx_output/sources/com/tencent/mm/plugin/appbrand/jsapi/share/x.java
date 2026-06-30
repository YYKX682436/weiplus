package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public class x implements com.tencent.mm.plugin.appbrand.jsapi.share.s {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f83298a;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.s
    public void a(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var, org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject.optString("link");
        this.f83298a = optString;
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiShareAppMessageBase", "hy: is h5 share type but no link!");
            throw new com.tencent.mm.plugin.appbrand.jsapi.share.t("is h5 share type but no h5 link");
        }
        uVar.I.put("is_h5", java.lang.Boolean.TRUE);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.s
    public void b(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask sendAppMessageTask, com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        sendAppMessageTask.B = 5;
        sendAppMessageTask.f83069o = this.f83298a;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.s
    public void c(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, boolean z17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.s
    public void d(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, android.content.Intent intent) {
        java.util.HashMap hashMap = new java.util.HashMap(4);
        hashMap.put("img_url", uVar.f83263i);
        hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, uVar.f83260f);
        hashMap.put("desc", uVar.f83261g);
        hashMap.put("url", this.f83298a);
        intent.putExtra("webview_params", hashMap);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.s
    public boolean e(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar) {
        java.lang.String str = uVar.C;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        return str.startsWith("delayLoadFile://");
    }

    public java.lang.String toString() {
        return "ShareTypeH5{h5Link='" + this.f83298a + "'}";
    }
}
