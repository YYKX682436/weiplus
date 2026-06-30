package com.tencent.midas.wx;

/* loaded from: classes13.dex */
public class APMidasWXPayActivity extends com.tencent.mm.hellhoundlib.activities.HellActivity {
    private static final java.lang.String TAG = "APMidasWXPayActivity";

    private void handleIntent(android.content.Intent intent) {
        com.tencent.midas.comm.APLog.d(TAG, "handleIntent get called!");
        try {
            com.tencent.midas.plugin.APPluginInterfaceManager.initPluginInterface(this, com.tencent.midas.control.APMidasPayHelper.MIDAS_PLUGIN_NAME, com.tencent.midas.control.APMidasPayHelper.PKG_DISTRIBUTE, com.tencent.midas.control.APMidasPayHelper.MED_DISTRIBUTE_HANDLE_WX_INTENT, new java.lang.Object[]{this, intent});
        } catch (java.lang.Exception e17) {
            com.tencent.midas.comm.APLog.e(TAG, "handleIntent got exception = " + e17.toString());
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        try {
            getIntent().getStringExtra("wxpay");
            try {
                requestWindowFeature(1);
                handleIntent(getIntent());
                finish();
            } catch (java.lang.Throwable unused) {
                finish();
            }
        } catch (java.lang.Exception unused2) {
            finish();
        }
    }
}
