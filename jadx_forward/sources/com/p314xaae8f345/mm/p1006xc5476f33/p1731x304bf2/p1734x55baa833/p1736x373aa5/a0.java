package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes8.dex */
public class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.b0 f220553d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.b0 b0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15849x99cbe261 c15849x99cbe261) {
        this.f220553d = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b c15741x8495618b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/ChatRoomListCard$RoomCardVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.f fVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.b0 b0Var = this.f220553d;
        long j17 = b0Var.f220570h + 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15849x99cbe261 c15849x99cbe261 = b0Var.f220572m;
        fVar.p(j17, 2L, 0L, c15849x99cbe261.f220431h2, c15849x99cbe261.f220430g2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15793xe0873b6d c15793xe0873b6d = b0Var.f220571i;
        if (c15793xe0873b6d != null && (c15741x8495618b = c15793xe0873b6d.f36787x39219d3a) != null && c15741x8495618b.f36604x391f2836 != null) {
            s33.n.f484063b = false;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("chat_room_title", b0Var.f220571i.f36787x39219d3a.f36604x391f2836.f36499xc05e036f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15720x34e10e9d c15720x34e10e9d = b0Var.f220571i.f36787x39219d3a.f36604x391f2836;
            t33.e eVar = new t33.e(c15720x34e10e9d.f36490x3923b317, c15720x34e10e9d.f36488x39217505, 9999L, 0L, false, bundle);
            t33.f fVar2 = (t33.f) i95.n0.c(t33.f.class);
            android.content.Context context = c15849x99cbe261.f220429f2;
            ((s33.j0) fVar2).getClass();
            s33.n.f484063b = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.ActivityC15843x1aee8bd9.b7(context, eVar, null, null, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomListCard$RoomCardVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
