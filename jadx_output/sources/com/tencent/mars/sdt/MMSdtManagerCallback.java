package com.tencent.mars.sdt;

/* loaded from: classes12.dex */
public class MMSdtManagerCallback implements com.tencent.mars.sdt.MMSdtManager.CallBack {
    private static final java.lang.String TAG = "MicroMsg.SdtManagerCallback";

    @Override // com.tencent.mars.sdt.MMSdtManager.CallBack
    public void startTraceRoute(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(TAG, "startTraceRoute");
    }
}
