package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public class a0 implements com.tencent.mm.plugin.appbrand.jsapi.share.s {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f83100a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f83101b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f83102c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f83103d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f83104e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f83105f;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.s
    public void a(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var, org.json.JSONObject jSONObject) {
        this.f83100a = jSONObject.optString("videoPath");
        java.lang.String optString = jSONObject.optString("videoThumbPath");
        this.f83101b = jSONObject.optString("videoMD5");
        this.f83102c = jSONObject.optString("videoButtonText");
        this.f83103d = jSONObject.optString("playDesc");
        this.f83104e = com.tencent.mm.plugin.appbrand.jsapi.share.n2.e(uVar.f83256b, this.f83100a, uVar.D);
        this.f83105f = com.tencent.mm.plugin.appbrand.jsapi.share.n2.e(uVar.f83256b, optString, uVar.D);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f83104e) || com.tencent.mm.sdk.platformtools.t8.K0(this.f83105f) || com.tencent.mm.sdk.platformtools.t8.K0(this.f83101b)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiShareAppMessageBase", "hy: try share video but video path or video thumbpath or md5 is null nil");
            throw new com.tencent.mm.plugin.appbrand.jsapi.share.t("try share video but video path or video thumbpath is null nil");
        }
        uVar.I.put("is_video", java.lang.Boolean.TRUE);
        uVar.I.put("footer_icon", uVar.f83257c.f305843f);
        uVar.I.put("footer_text", uVar.f83257c.f305841d);
        uVar.I.put("video_path", this.f83104e);
        uVar.I.put("video_thumb_path", this.f83105f);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.s
    public void b(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask sendAppMessageTask, com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        sendAppMessageTask.B = 4;
        sendAppMessageTask.U = true;
        sendAppMessageTask.f83072p1 = com.tencent.mm.plugin.appbrand.jsapi.share.n2.b(this.f83104e);
        sendAppMessageTask.f83085y1 = com.tencent.mm.plugin.appbrand.jsapi.share.n2.b(this.f83105f);
        sendAppMessageTask.f83082x1 = this.f83101b;
        sendAppMessageTask.f83087z1 = this.f83102c;
        sendAppMessageTask.A1 = this.f83103d;
        sendAppMessageTask.f83074r = com.tencent.mm.plugin.appbrand.jsapi.share.n2.b(this.f83105f);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.s
    public void c(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, boolean z17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.s
    public void d(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, android.content.Intent intent) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.s
    public boolean e(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar) {
        java.lang.String str = uVar.C;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (!str.startsWith("delayLoadFile://")) {
            java.lang.String str2 = this.f83104e;
            if (str2 == null) {
                str2 = "";
            }
            if (!str2.startsWith("delayLoadFile://")) {
                java.lang.String str3 = this.f83105f;
                if (!(str3 != null ? str3 : "").startsWith("delayLoadFile://")) {
                    return false;
                }
            }
        }
        return true;
    }

    public java.lang.String toString() {
        return "ShareTypeVideo{videoPath='" + this.f83100a + "', videoMD5='" + this.f83101b + "', videoButtonText='" + this.f83102c + "', videoPlayDesc='" + this.f83103d + "', videoPathInFileSystem='" + this.f83104e + "', videoThumbPathInFileSystem='" + this.f83105f + "'}";
    }
}
