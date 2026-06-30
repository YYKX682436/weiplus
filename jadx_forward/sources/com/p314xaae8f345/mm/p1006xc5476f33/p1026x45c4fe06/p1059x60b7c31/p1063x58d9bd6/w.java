package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* loaded from: classes7.dex */
public class w extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f160826d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f160827e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f160828f = 0;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.u
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.JsApiCreateAudioInstance", "runTask flag:%d", java.lang.Integer.valueOf(this.f160828f));
        int i17 = this.f160828f;
        if (i17 == 0) {
            java.lang.String a17 = n01.c.a(this.f160826d, this.f160827e);
            this.f160827e = a17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.JsApiCreateAudioInstance", "player audioId:%s", a17);
            android.text.TextUtils.isEmpty(this.f160827e);
        } else if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.JsApiCreateAudioInstance", "pauseAllAudioPlayer");
            java.lang.String str = this.f160826d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPlayerHelper", "pauseAllAudioPlayer appId:%s", str);
            am.f0 f0Var = new am.f0();
            am.d0 d0Var = f0Var.f88154a;
            d0Var.f87946a = 12;
            d0Var.f87948c = str;
            dl3.c.a(f0Var);
        } else if (i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.JsApiCreateAudioInstance", "stopAllAudioPlayer");
            java.lang.String str2 = this.f160826d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPlayerHelper", "destroyAllAudioPlayer appId:%s", str2);
            am.f0 f0Var2 = new am.f0();
            am.d0 d0Var2 = f0Var2.f88154a;
            d0Var2.f87946a = 9;
            d0Var2.f87948c = str2;
            dl3.c.a(f0Var2);
            jh1.a.c(this.f160826d);
        }
        super.b();
        int i18 = this.f160828f;
        if (i18 != 0) {
            if (i18 == 1) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.JsApiCreateAudioInstance", "destroy audio instance end");
        } else if (android.text.TextUtils.isEmpty(this.f160827e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.JsApiCreateAudioInstance", "create player failed");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.JsApiCreateAudioInstance", "create player ok");
        }
    }
}
