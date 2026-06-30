package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes8.dex */
public class f1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i1 f220639d;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i1 i1Var) {
        this.f220639d = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).getClass();
        int i17 = l33.c.f396961a;
        boolean z17 = true;
        if (i17 != 1 && i17 != 3) {
            z17 = false;
        }
        if (z17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Vi();
            yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i1 i1Var = this.f220639d;
        boolean L0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(i1Var.f220692q);
        android.content.Context context = i1Var.f220830d;
        if (!L0) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15705xc5787f05 c15705xc5787f05 : i1Var.f220692q) {
                if (c15705xc5787f05.f36453x368f3a == 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.j1.d(context, c15705xc5787f05.f36452x2efe91);
                    yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            }
        }
        s33.y.h(context, i1Var.f220686h);
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a.k(1003L, 2L, 7L, 0L, i1Var.f220690o, i1Var.f220691p, "", "", "");
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
