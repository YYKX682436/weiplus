package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* loaded from: classes7.dex */
public class i2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f33799x366c91de = 481;

    /* renamed from: NAME */
    public static final java.lang.String f33800x24728b = "setInnerAudioOption";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.JsApiSetInnerAudioOption", "data:%s, appId:%s", jSONObject, mo48798x74292566);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPlayerHelper", "getAudioContextOption()");
        am.f0 f0Var = new am.f0();
        f0Var.f88154a.f87946a = 20;
        dl3.c.a(f0Var);
        n01.a aVar = f0Var.f88155b.f88047c;
        if (aVar == null) {
            aVar = new n01.a();
        }
        if (!android.text.TextUtils.isEmpty(mo48798x74292566) && !android.text.TextUtils.isEmpty(aVar.f415368c) && !mo48798x74292566.equalsIgnoreCase(aVar.f415368c)) {
            aVar.f415366a = true;
            aVar.f415367b = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.JsApiSetInnerAudioOption", "reset AudioContextParam");
        }
        aVar.f415368c = mo48798x74292566;
        if (jSONObject.has("mixWithOther")) {
            aVar.f415366a = jSONObject.optBoolean("mixWithOther", true);
        }
        if (jSONObject.has("speakerOn")) {
            aVar.f415367b = jSONObject.optBoolean("speakerOn", true);
        }
        if (!aVar.f415367b) {
            aVar.f415366a = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPlayerHelper", "setAudioContextOption, mixWithOther:%b", java.lang.Boolean.valueOf(aVar.f415366a));
        am.f0 f0Var2 = new am.f0();
        am.d0 d0Var = f0Var2.f88154a;
        d0Var.f87946a = 19;
        d0Var.f87951f = aVar;
        dl3.c.a(f0Var2);
        boolean z17 = f0Var2.f88155b.f88045a;
        lVar.a(i17, o("ok"));
    }
}
