package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class WeChatSplashFallbackActivity extends com.tencent.mm.splash.SplashFallbackActivity {
    @Override // com.tencent.mm.splash.SplashFallbackActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.tencent.mm.R.layout.d_7);
        if (com.tencent.mm.splash.j.b()) {
            return;
        }
        ((com.tencent.mm.feature.performance.r4) ((uq3.h) i95.n0.c(uq3.h.class))).getClass();
        dr0.s3.a(com.tencent.mm.ui.bk.C());
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        setVisible(false);
        overridePendingTransition(0, 0);
    }
}
