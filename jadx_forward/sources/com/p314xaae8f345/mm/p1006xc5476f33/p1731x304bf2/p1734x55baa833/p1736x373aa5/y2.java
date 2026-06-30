package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes15.dex */
public class y2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public int f220892d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f220893e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d f220894f;

    public y2(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d) {
        this.f220894f = c15859x7405890d;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        long j17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/GameChatListView$9", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d = this.f220894f;
            if (c15859x7405890d.B2 != null) {
                if (c15859x7405890d.D2 && this.f220893e == c15859x7405890d.f220493f2.mo1894x7e414b06() - 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.j3 j3Var = c15859x7405890d.B2;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i3 i3Var = c15859x7405890d.f220493f2;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.r2) j3Var).f220810a;
                    c15859x7405890d2.D2 = false;
                    if (i3Var.f220699e.size() > 0) {
                        j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67) i3Var.f220699e.get(r4.size() - 1)).seq;
                    } else {
                        j17 = 0;
                    }
                    long j18 = j17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.GameChatListView", "onBottomLoadMore, bottomSeq:%d", java.lang.Long.valueOf(j18));
                    gm0.j1.d().g(new v33.e(c15859x7405890d2.f220499l2, j18, 0L, 2, 0L, c15859x7405890d2.f220500m2));
                }
                boolean z17 = c15859x7405890d.f220500m2 == 1;
                if (c15859x7405890d.C2) {
                    if (this.f220892d < (z17 ? 1 : 50)) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.r2) c15859x7405890d.B2).a(c15859x7405890d.f220493f2);
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$9", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/GameChatListView$9", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) c1163xf1deaba4.getLayoutManager();
        this.f220892d = c1162x665295de.w();
        this.f220893e = c1162x665295de.y();
        int m8008x3d79f549 = c1162x665295de.m8008x3d79f549();
        int m8020x7e414b06 = c1162x665295de.m8020x7e414b06();
        int i19 = m8008x3d79f549 + this.f220892d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d = this.f220894f;
        if (i19 >= m8020x7e414b06) {
            c15859x7405890d.f220506s2 = true;
            c15859x7405890d.f220493f2.z(1, false, true);
        } else {
            c15859x7405890d.f220506s2 = false;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$9", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
