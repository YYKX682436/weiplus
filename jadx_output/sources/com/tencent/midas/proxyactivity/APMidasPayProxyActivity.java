package com.tencent.midas.proxyactivity;

/* loaded from: classes13.dex */
public class APMidasPayProxyActivity extends com.tencent.midas.plugin.APPluginProxyActivity {
    @Override // com.tencent.midas.plugin.APPluginProxyActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.midas.comm.APLog.i("APMidasPayProxyActivity", "onActivityResult requestCode:" + i17 + " resultCode:" + i18);
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.midas.plugin.APPluginProxyActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
