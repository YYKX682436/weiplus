package com.p314xaae8f345.mm.ui.p2646xfa354eeb;

/* loaded from: classes11.dex */
public class h implements s01.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI f279497d;

    public h(com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI bizChatConversationFmUI) {
        this.f279497d = bizChatConversationFmUI;
    }

    @Override // s01.f
    public void a(s01.e eVar) {
        s01.b bVar;
        if (eVar == null || (bVar = eVar.f483395b) == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI bizChatConversationFmUI = this.f279497d;
        if (bizChatConversationFmUI.f279436m.equals(bVar.f69065x75756b18)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatConversationFmUI", "bizChatExtension bizChatConv change");
            bizChatConversationFmUI.f279434h.u(eVar.f483394a);
            if (bizChatConversationFmUI.f279439p) {
                bizChatConversationFmUI.f279434h.q();
            }
        }
    }
}
