package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2;

/* loaded from: classes11.dex */
public final class n implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.ActivityC22395xe70a9721.UnreadConversationFmUI f289681d;

    public n(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.ActivityC22395xe70a9721.UnreadConversationFmUI unreadConversationFmUI) {
        this.f289681d = unreadConversationFmUI;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        em.e4 e4Var;
        em.e4 e4Var2;
        int ordinal = ((ym3.o) obj).f544710a.ordinal();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.ActivityC22395xe70a9721.UnreadConversationFmUI unreadConversationFmUI = this.f289681d;
        if (ordinal == 0) {
            e4Var = unreadConversationFmUI.viewBinding;
            if (e4Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                throw null;
            }
            e4Var.c().post(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.l(unreadConversationFmUI));
        } else if (ordinal == 2) {
            e4Var2 = unreadConversationFmUI.viewBinding;
            if (e4Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                throw null;
            }
            e4Var2.c().post(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.m(unreadConversationFmUI));
        }
        return jz5.f0.f384359a;
    }
}
