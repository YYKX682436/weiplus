package com.p314xaae8f345.mm.app;

/* renamed from: com.tencent.mm.app.WeChatSplashActivity */
/* loaded from: classes12.dex */
public class ActivityC5029x1adff79c extends com.p314xaae8f345.mm.p2617xca9a2a67.ActivityC21042xd7c5f6b6 {
    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return super.getResources();
    }

    @Override // com.p314xaae8f345.mm.p2617xca9a2a67.ActivityC21042xd7c5f6b6, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf.m78472x26f04c88(getBaseContext());
        if (com.p314xaae8f345.mm.p2617xca9a2a67.j.b()) {
            if (android.os.Build.VERSION.SDK_INT < 26 || com.p314xaae8f345.mm.ui.ga.q()) {
                return;
            }
            getWindow().setNavigationBarColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560052a1));
            return;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r4) ((uq3.h) i95.n0.c(uq3.h.class))).getClass();
        dr0.s3.a(com.p314xaae8f345.mm.ui.bk.C());
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        setVisible(false);
        overridePendingTransition(0, 0);
    }

    @Override // com.p314xaae8f345.mm.p2617xca9a2a67.ActivityC21042xd7c5f6b6, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        o25.n2.f424098c = true;
        super.onPause();
    }
}
