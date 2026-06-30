package com.p314xaae8f345.mm.ui.p2646xfa354eeb;

/* loaded from: classes11.dex */
public class k implements r01.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI f279500a;

    public k(com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI bizChatConversationFmUI) {
        this.f279500a = bizChatConversationFmUI;
    }

    @Override // r01.p
    public void a(r01.o oVar) {
        int i17 = com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI.f279429y;
        com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI bizChatConversationFmUI = this.f279500a;
        java.lang.String l07 = bizChatConversationFmUI.l0();
        if (oVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(oVar.f449701a) || !oVar.f449701a.equals(l07)) {
            return;
        }
        int i18 = bizChatConversationFmUI.f279441r;
        bizChatConversationFmUI.f279441r = com.p314xaae8f345.mm.ui.h4.a(bizChatConversationFmUI.mo7438x76847179(), l07);
        if (bizChatConversationFmUI.f279441r != i18) {
            bizChatConversationFmUI.n0();
        }
    }
}
