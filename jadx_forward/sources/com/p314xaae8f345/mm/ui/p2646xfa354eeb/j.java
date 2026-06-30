package com.p314xaae8f345.mm.ui.p2646xfa354eeb;

/* loaded from: classes11.dex */
public class j implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI f279499d;

    public j(com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI bizChatConversationFmUI) {
        this.f279499d = bizChatConversationFmUI;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        r01.x cj6 = r01.q3.cj();
        com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI bizChatConversationFmUI = this.f279499d;
        bizChatConversationFmUI.f279437n = cj6.b1(bizChatConversationFmUI.f279436m).y0();
        int intExtra = bizChatConversationFmUI.mo78409x676b27cd().getIntent().getIntExtra("biz_chat_from_scene", 7);
        hb5.m mVar = bizChatConversationFmUI.f279434h;
        int count = mVar != null ? mVar.getCount() : -1;
        r01.m y07 = r01.q3.bj().y0(bizChatConversationFmUI.f279437n);
        int i17 = y07 != null ? y07.f66038x29b98d8d : 0;
        int i18 = y07 != null ? y07.f66045x6bcd764a : 0;
        r01.m y08 = r01.q3.bj().y0(bizChatConversationFmUI.f279436m);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12648, bizChatConversationFmUI.f279437n, bizChatConversationFmUI.f279436m, java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(count), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(y08 == null ? 0 : y08.f66038x29b98d8d), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(y07 != null ? y07.f66046x771ad30a : 0L), java.lang.Long.valueOf(y07 != null ? y07.f66050x2a8d0441 : 0L));
        return false;
    }
}
