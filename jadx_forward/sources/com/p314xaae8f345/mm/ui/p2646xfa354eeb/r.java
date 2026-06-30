package com.p314xaae8f345.mm.ui.p2646xfa354eeb;

/* loaded from: classes11.dex */
public class r implements com.p314xaae8f345.mm.ui.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI f279508a;

    public r(com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI bizChatConversationFmUI) {
        this.f279508a = bizChatConversationFmUI;
    }

    @Override // com.p314xaae8f345.mm.ui.y9
    public void a(java.lang.Object obj) {
    }

    @Override // com.p314xaae8f345.mm.ui.y9
    public void b(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI bizChatConversationFmUI = this.f279508a;
        if (bizChatConversationFmUI.f279434h.getCount() <= 0) {
            bizChatConversationFmUI.f279430d.setVisibility(0);
            bizChatConversationFmUI.f279432f.setVisibility(8);
            return;
        }
        bizChatConversationFmUI.f279430d.setVisibility(8);
        android.widget.ListView listView = bizChatConversationFmUI.f279432f;
        if (listView != null) {
            listView.setVisibility(0);
        }
    }
}
