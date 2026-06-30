package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class w extends com.tencent.mm.plugin.appbrand.jsapi.audio.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f79293d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f79294e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f79295f = 0;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.audio.u
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.JsApiCreateAudioInstance", "runTask flag:%d", java.lang.Integer.valueOf(this.f79295f));
        int i17 = this.f79295f;
        if (i17 == 0) {
            java.lang.String a17 = n01.c.a(this.f79293d, this.f79294e);
            this.f79294e = a17;
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.JsApiCreateAudioInstance", "player audioId:%s", a17);
            android.text.TextUtils.isEmpty(this.f79294e);
        } else if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.JsApiCreateAudioInstance", "pauseAllAudioPlayer");
            java.lang.String str = this.f79293d;
            com.tencent.mars.xlog.Log.i("MicroMsg.AudioPlayerHelper", "pauseAllAudioPlayer appId:%s", str);
            am.f0 f0Var = new am.f0();
            am.d0 d0Var = f0Var.f6621a;
            d0Var.f6413a = 12;
            d0Var.f6415c = str;
            dl3.c.a(f0Var);
        } else if (i17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.JsApiCreateAudioInstance", "stopAllAudioPlayer");
            java.lang.String str2 = this.f79293d;
            com.tencent.mars.xlog.Log.i("MicroMsg.AudioPlayerHelper", "destroyAllAudioPlayer appId:%s", str2);
            am.f0 f0Var2 = new am.f0();
            am.d0 d0Var2 = f0Var2.f6621a;
            d0Var2.f6413a = 9;
            d0Var2.f6415c = str2;
            dl3.c.a(f0Var2);
            jh1.a.c(this.f79293d);
        }
        super.b();
        int i18 = this.f79295f;
        if (i18 != 0) {
            if (i18 == 1) {
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.JsApiCreateAudioInstance", "destroy audio instance end");
        } else if (android.text.TextUtils.isEmpty(this.f79294e)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.JsApiCreateAudioInstance", "create player failed");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.JsApiCreateAudioInstance", "create player ok");
        }
    }
}
