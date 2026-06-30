package com.tencent.mm.feature.lite;

/* loaded from: classes8.dex */
public class e0 implements kh0.e {
    public e0(com.tencent.mm.feature.lite.i iVar) {
    }

    @Override // kh0.e
    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "checkGameLiteApp onError: " + str);
    }

    @Override // kh0.e
    public void onSuccess(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "checkGameLiteApp onSuccess: " + str);
    }
}
