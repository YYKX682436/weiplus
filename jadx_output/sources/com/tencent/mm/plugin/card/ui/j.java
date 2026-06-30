package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class j implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public int f95030d = 0;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        ku1.i iVar;
        if (this.f95030d < 0) {
            if (activity == null || !(activity instanceof com.tencent.mm.plugin.card.ui.CardDetailUI)) {
                gm0.j1.e().j(new com.tencent.mm.plugin.card.ui.i(this));
            } else {
                com.tencent.mm.plugin.card.ui.CardDetailUI cardDetailUI = (com.tencent.mm.plugin.card.ui.CardDetailUI) activity;
                com.tencent.mm.plugin.card.ui.b0 b0Var = cardDetailUI.f94763e;
                if (b0Var != null && (iVar = b0Var.f94944p) != null && (iVar instanceof ku1.r)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CardAcitivityLifecycleListener", "CardAcitivityLifecycleListener on activity from background to foreground！is showing CardDetailUI,updateCodeView!");
                    cardDetailUI.f94763e.f94944p.l(lu1.e.CARDCODEREFRESHACTION_ENTERFOREGROUND);
                }
            }
        }
        this.f95030d++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        this.f95030d--;
    }
}
