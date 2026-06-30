package com.tencent.mars.sdt;

/* loaded from: classes12.dex */
public class SdtManagerCallback implements com.tencent.mars.sdt.SdtManager.CallBack {
    private static final java.lang.String TAG = "MicroMsg.SdtManagerCallback";

    @Override // com.tencent.mars.sdt.SdtManager.CallBack
    public void reportSignalDetectResults(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(TAG, "reportSignalDetectResults");
    }
}
