package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1101x949d092f;

/* loaded from: classes7.dex */
public class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34577x366c91de = 634;

    /* renamed from: NAME */
    public static final java.lang.String f34578x24728b = "setCurrentPaySpeech";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.JsApiSetCurrentPaySpeech", "invoke JsApiSetCurrentPaySpeech!");
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OfflineVoice.JsApiSetCurrentPaySpeech", "fail:component is null");
            return;
        }
        if (lVar.mo50352x76847179() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OfflineVoice.JsApiSetCurrentPaySpeech", "fail:context is null");
            lVar.a(i17, o("fail：service.getContext() is null "));
            return;
        }
        java.lang.String optString = jSONObject.optString("dialectPackId");
        java.lang.String optString2 = jSONObject.optString("tempFilePath");
        java.lang.String optString3 = jSONObject.optString("md5Sum");
        java.lang.String optString4 = jSONObject.optString("version");
        boolean optBoolean = jSONObject.optBoolean("isOnlyDownload");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            str = "";
        } else {
            com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609 = lVar.mo50354x59eafec1().mo49620x1d537609(optString2);
            if (mo49620x1d537609 == null || !mo49620x1d537609.m()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.JsApiSetCurrentPaySpeech", "fail:tempFile no exist");
                lVar.a(i17, o("fail:tempFile no exist"));
                return;
            }
            str = mo49620x1d537609.o();
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1101x949d092f.C12196x94c4d117.IPCSetCurrentPaySpeechParam(optString, optString2, str, optBoolean, optString3, optString4), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1101x949d092f.C12196x94c4d117.class, new kd1.d(this, lVar, i17));
    }
}
