package com.p314xaae8f345.mm.ui.p2646xfa354eeb;

/* loaded from: classes11.dex */
public class e implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f279493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI f279494e;

    public e(com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI bizChatConversationFmUI, long j17) {
        this.f279494e = bizChatConversationFmUI;
        this.f279493d = j17;
    }

    @Override // c01.da
    public boolean a() {
        return this.f279494e.f279440q;
    }

    @Override // c01.da
    public void c() {
        com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI bizChatConversationFmUI = this.f279494e;
        if (bizChatConversationFmUI.f279433g != null) {
            s01.m Ui = r01.q3.Ui();
            long j17 = this.f279493d;
            Ui.y0(j17);
            r01.q3.aj().D0(j17);
            if (r01.q3.aj().P0(bizChatConversationFmUI.f279436m) <= 0) {
                ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).k(bizChatConversationFmUI.f279436m);
            }
            bizChatConversationFmUI.f279433g.dismiss();
        }
    }
}
