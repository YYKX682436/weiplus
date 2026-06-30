package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class WeChatSplashActivity extends com.tencent.mm.splash.SplashActivity {
    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return super.getResources();
    }

    @Override // com.tencent.mm.splash.SplashActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.ui.MMActivity.initLanguage(getBaseContext());
        if (com.tencent.mm.splash.j.b()) {
            if (android.os.Build.VERSION.SDK_INT < 26 || com.tencent.mm.ui.ga.q()) {
                return;
            }
            getWindow().setNavigationBarColor(getResources().getColor(com.tencent.mm.R.color.f478519a1));
            return;
        }
        ((com.tencent.mm.feature.performance.r4) ((uq3.h) i95.n0.c(uq3.h.class))).getClass();
        dr0.s3.a(com.tencent.mm.ui.bk.C());
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        setVisible(false);
        overridePendingTransition(0, 0);
    }

    @Override // com.tencent.mm.splash.SplashActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        o25.n2.f342565c = true;
        super.onPause();
    }
}
