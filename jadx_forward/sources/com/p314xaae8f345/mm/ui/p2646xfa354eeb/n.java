package com.p314xaae8f345.mm.ui.p2646xfa354eeb;

/* loaded from: classes11.dex */
public class n implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI f279503d;

    public n(com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI bizChatConversationFmUI) {
        this.f279503d = bizChatConversationFmUI;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI bizChatConversationFmUI = this.f279503d;
        if (itemId == 0) {
            long j17 = bizChatConversationFmUI.f279444u;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatConversationFmUI", "deleteChatroom");
            r01.q3.Ui().z0(j17);
            bizChatConversationFmUI.f279440q = false;
            bizChatConversationFmUI.f279433g = db5.e1.Q(bizChatConversationFmUI.mo78409x676b27cd(), bizChatConversationFmUI.m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), bizChatConversationFmUI.m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.ui.p2646xfa354eeb.d(bizChatConversationFmUI));
            gm0.j1.e().j(new c01.h0(bizChatConversationFmUI.f279436m, j17, new com.p314xaae8f345.mm.ui.p2646xfa354eeb.e(bizChatConversationFmUI, j17)));
            return;
        }
        if (itemId == 1) {
            s01.b J0 = r01.q3.aj().J0(bizChatConversationFmUI.f279444u);
            J0.f69079xa35b5abb = 1;
            J0.f69063x49a5aa57 = 0;
            J0.f69062x28d584e9 = 0;
            r01.q3.aj().n1(J0);
            ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).Bi(true, J0.f69065x75756b18, true);
            return;
        }
        if (itemId == 2) {
            r01.q3.aj().o1(bizChatConversationFmUI.f279444u);
            s01.b J02 = r01.q3.aj().J0(bizChatConversationFmUI.f279444u);
            ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).Bi(true, J02.f69065x75756b18, false);
            return;
        }
        if (itemId != 3) {
            if (itemId != 4) {
                return;
            }
            com.p314xaae8f345.mm.ui.o3.b(bizChatConversationFmUI.mo78409x676b27cd(), new com.p314xaae8f345.mm.ui.p2646xfa354eeb.m(this));
            return;
        }
        s01.b J03 = r01.q3.aj().J0(bizChatConversationFmUI.f279444u);
        s01.g aj6 = r01.q3.aj();
        if (aj6.f1(aj6.J0(bizChatConversationFmUI.f279444u))) {
            r01.q3.aj().k1(bizChatConversationFmUI.f279444u);
            ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).Ai(true, J03.f69065x75756b18, false);
            return;
        }
        r01.q3.aj().i1(bizChatConversationFmUI.f279444u);
        ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).Ai(true, J03.f69065x75756b18, true);
    }
}
