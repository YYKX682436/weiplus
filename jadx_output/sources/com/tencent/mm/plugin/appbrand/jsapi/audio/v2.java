package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class v2 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 33;
    public static final java.lang.String NAME = "playVoice";

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f79291h;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartPlayVoice$StartPlayVoice f79292g;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        java.lang.String optString = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, null);
        java.lang.String optString2 = jSONObject.optString(dm.i4.COL_LOCALID);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (optString == null) {
            optString = optString2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStartPlayVoice", "doPlayVoice, appId : %s, localId : %s", e9Var.getAppId(), optString);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            e9Var.a(i17, o("fail_missing arguments"));
            return;
        }
        com.tencent.mm.vfs.r6 absoluteFile = e9Var.getFileSystem().getAbsoluteFile(optString);
        com.tencent.mm.plugin.appbrand.page.v5 V0 = e9Var.V0();
        if (absoluteFile == null || !absoluteFile.m() || V0 == null) {
            e9Var.a(i17, o("fail"));
            return;
        }
        c01.l2 c17 = c01.n2.d().c("JsApi@" + V0.hashCode(), true);
        com.tencent.mm.plugin.appbrand.jsapi.v vVar = (com.tencent.mm.plugin.appbrand.jsapi.v) c17.c("onBackgroundListener", null);
        if (vVar == null) {
            vVar = new com.tencent.mm.plugin.appbrand.jsapi.audio.p2(this, V0);
            c17.i("onBackgroundListener", vVar);
        }
        V0.R(vVar);
        if (((com.tencent.mm.plugin.appbrand.jsapi.w) c17.c("onDestroyListener", null)) == null) {
            com.tencent.mm.plugin.appbrand.jsapi.audio.q2 q2Var = new com.tencent.mm.plugin.appbrand.jsapi.audio.q2(this, V0);
            c17.i("onDestroyListener", q2Var);
            V0.w(q2Var);
        }
        if (this.f79292g == null) {
            this.f79292g = new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartPlayVoice$StartPlayVoice(this, e9Var, i17);
        }
        if (f79291h != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(dm.i4.COL_LOCALID, this.f79292g.f79116i);
            e9Var.a(this.f79292g.f79115h, p("fail", hashMap));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartPlayVoice$StartPlayVoice jsApiStartPlayVoice$StartPlayVoice = this.f79292g;
        jsApiStartPlayVoice$StartPlayVoice.f79113f = this;
        jsApiStartPlayVoice$StartPlayVoice.f79114g = e9Var;
        jsApiStartPlayVoice$StartPlayVoice.f79115h = i17;
        jsApiStartPlayVoice$StartPlayVoice.f79116i = optString;
        jsApiStartPlayVoice$StartPlayVoice.f79117m = absoluteFile.o();
        this.f79292g.d();
        f79291h = optString;
    }
}
