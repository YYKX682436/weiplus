package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2698xc90c42a8;

/* renamed from: com.tencent.mm.ui.conversation.presenter.BaseBizConversationUI */
/* loaded from: classes11.dex */
public abstract class AbstractActivityC22393x78692359 extends com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.da f289509e = null;

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.ui.da daVar = this.f289509e;
        if (daVar == null) {
            super.onActivityResult(i17, i18, intent);
        } else {
            daVar.mo9729x757c998b(i17, i18, intent);
            this.f289509e = null;
        }
    }
}
