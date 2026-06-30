package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2;

/* loaded from: classes11.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.ActivityC22395xe70a9721.UnreadConversationFmUI f289647d;

    public c(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.ActivityC22395xe70a9721.UnreadConversationFmUI unreadConversationFmUI) {
        this.f289647d = unreadConversationFmUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.ActivityC22395xe70a9721.UnreadConversationFmUI unreadConversationFmUI = this.f289647d;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = unreadConversationFmUI.mo7430x19263085();
        if ((mo7430x19263085 == null || mo7430x19263085.isFinishing()) ? false : true) {
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x192630852 = unreadConversationFmUI.mo7430x19263085();
            if (mo7430x192630852 != null) {
                mo7430x192630852.finish();
            }
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x192630853 = unreadConversationFmUI.mo7430x19263085();
            if (mo7430x192630853 != null) {
                mo7430x192630853.overridePendingTransition(0, 0);
            }
        }
    }
}
