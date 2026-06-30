package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiLuggageStartSoterAuthentication$1 */
/* loaded from: classes.dex */
class ResultReceiverC12021x438ad70d extends android.os.ResultReceiver {
    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i17, android.os.Bundle bundle) {
        if (i17 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLuggageStartSoterAuthentication", "hy: soter auth ok");
            throw null;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiLuggageStartSoterAuthentication", "hy: soter auth failed");
            throw null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLuggageStartSoterAuthentication", "hy: soter user cancelled");
        throw null;
    }
}
