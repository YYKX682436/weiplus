package com.p314xaae8f345.mm.ui.p2646xfa354eeb;

/* loaded from: classes8.dex */
public class p implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rl5.r f279505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI f279506e;

    public p(com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI bizChatConversationFmUI, rl5.r rVar) {
        this.f279506e = bizChatConversationFmUI;
        this.f279505d = rVar;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        rl5.r rVar = this.f279505d;
        com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI bizChatConversationFmUI = this.f279506e;
        rVar.g(view, i17, j17, bizChatConversationFmUI, bizChatConversationFmUI.f279435i, bizChatConversationFmUI.f279442s, bizChatConversationFmUI.f279443t);
        return true;
    }
}
