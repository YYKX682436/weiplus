package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2;

/* loaded from: classes11.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.ActivityC22395xe70a9721.UnreadConversationFmUI f289676d;

    public i(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.ActivityC22395xe70a9721.UnreadConversationFmUI unreadConversationFmUI) {
        this.f289676d = unreadConversationFmUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.g0 m80594x62662257;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/unreadmode/UnreadConversationActivity$UnreadConversationFmUI$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.ActivityC22395xe70a9721.UnreadConversationFmUI unreadConversationFmUI = this.f289676d;
        m80594x62662257 = unreadConversationFmUI.m80594x62662257();
        if (m80594x62662257 != null) {
            m80594x62662257.f289674c = 2;
        }
        unreadConversationFmUI.m80605x201c4869();
        yj0.a.h(this, "com/tencent/mm/ui/conversation/unreadmode/UnreadConversationActivity$UnreadConversationFmUI$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
