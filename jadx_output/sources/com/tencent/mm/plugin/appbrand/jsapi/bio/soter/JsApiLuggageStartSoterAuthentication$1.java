package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

/* loaded from: classes.dex */
class JsApiLuggageStartSoterAuthentication$1 extends android.os.ResultReceiver {
    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i17, android.os.Bundle bundle) {
        if (i17 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLuggageStartSoterAuthentication", "hy: soter auth ok");
            throw null;
        }
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiLuggageStartSoterAuthentication", "hy: soter auth failed");
            throw null;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLuggageStartSoterAuthentication", "hy: soter user cancelled");
        throw null;
    }
}
