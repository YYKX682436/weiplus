package com.p314xaae8f345.mm.ui.p2646xfa354eeb;

/* loaded from: classes11.dex */
public class i implements s01.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI f279498a;

    public i(com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI bizChatConversationFmUI) {
        this.f279498a = bizChatConversationFmUI;
    }

    @Override // s01.l
    public void a(s01.k kVar) {
        s01.h hVar;
        if (kVar == null || (hVar = kVar.f483424c) == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI bizChatConversationFmUI = this.f279498a;
        if (bizChatConversationFmUI.f279436m.equals(hVar.f69170x75756b18)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatConversationFmUI", "bizChatExtension bizChat change");
            bizChatConversationFmUI.f279434h.u(kVar.f483423b);
            if (bizChatConversationFmUI.f279439p) {
                bizChatConversationFmUI.f279434h.q();
            }
        }
    }
}
