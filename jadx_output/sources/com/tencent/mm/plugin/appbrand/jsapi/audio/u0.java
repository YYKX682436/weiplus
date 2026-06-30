package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class u0 extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c01.l2 f79285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f79286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.audio.e1 f79287f;

    public u0(com.tencent.mm.plugin.appbrand.jsapi.audio.e1 e1Var, c01.l2 l2Var, com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        this.f79287f = e1Var;
        this.f79285d = l2Var;
        this.f79286e = c0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        c01.l2 l2Var = this.f79285d;
        java.lang.String f17 = l2Var.f("appId", "");
        l2Var.e("pkgType", 0);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("operationType", "stop");
        } catch (org.json.JSONException unused) {
        }
        com.tencent.mm.plugin.appbrand.jsapi.audio.e1 e1Var = this.f79287f;
        com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer$OperateMusicPlayer jsApiOperateMusicPlayer$OperateMusicPlayer = new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer$OperateMusicPlayer(e1Var, this.f79286e, e1Var.f79179g.f79042m);
        jsApiOperateMusicPlayer$OperateMusicPlayer.f79043n = jSONObject.toString();
        jsApiOperateMusicPlayer$OperateMusicPlayer.f79044o = f17;
        jsApiOperateMusicPlayer$OperateMusicPlayer.f79047r = -1;
        jsApiOperateMusicPlayer$OperateMusicPlayer.f79038f = l2Var;
        jsApiOperateMusicPlayer$OperateMusicPlayer.s();
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void e(com.tencent.mm.plugin.appbrand.w0 w0Var) {
        c01.l2 l2Var = this.f79285d;
        java.lang.String f17 = l2Var.f("appId", "");
        l2Var.e("pkgType", 0);
        int ordinal = w0Var.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f79286e;
            if (c0Var.t3().l2().f87790f == 1023) {
                return;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("operationType", "pause");
            } catch (org.json.JSONException unused) {
            }
            com.tencent.mm.plugin.appbrand.jsapi.audio.e1 e1Var = this.f79287f;
            com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer$OperateMusicPlayer jsApiOperateMusicPlayer$OperateMusicPlayer = new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer$OperateMusicPlayer(e1Var, c0Var, e1Var.f79179g.f79042m);
            jsApiOperateMusicPlayer$OperateMusicPlayer.f79043n = jSONObject.toString();
            jsApiOperateMusicPlayer$OperateMusicPlayer.f79044o = f17;
            jsApiOperateMusicPlayer$OperateMusicPlayer.f79038f = l2Var;
            jsApiOperateMusicPlayer$OperateMusicPlayer.d();
        }
    }
}
