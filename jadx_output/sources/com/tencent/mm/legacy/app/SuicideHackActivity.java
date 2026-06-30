package com.tencent.mm.legacy.app;

/* loaded from: classes11.dex */
class SuicideHackActivity extends com.tencent.mm.hellhoundlib.activities.HellActivity {
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("WxSplash.SuicideHackActivity", "onCreate");
        finish();
    }
}
