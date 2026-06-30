package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes8.dex */
public class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f220873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.e1 f220874e;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.e1 e1Var, android.view.View view) {
        this.f220874e = e1Var;
        this.f220873d = view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b c15741x8495618b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15720x34e10e9d c15720x34e10e9d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RecommendChatRoomVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f220873d;
        if ((view2.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b) && (c15741x8495618b = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b) view2.getTag()) != null && (c15720x34e10e9d = c15741x8495618b.f36604x391f2836) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.e1 e1Var = this.f220874e;
            int c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.j1.c(e1Var.f220830d, 4, c15720x34e10e9d, e1Var.f220621r, e1Var.f220613g, e1Var.f220627x, 0L, e1Var.f220626w ? 1102L : 1002L);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.e1.j(e1Var, (c17 == 1 || c17 != 2) ? 3 : 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RecommendChatRoomVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
