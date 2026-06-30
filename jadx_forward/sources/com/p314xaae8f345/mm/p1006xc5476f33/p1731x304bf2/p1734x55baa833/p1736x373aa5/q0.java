package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes15.dex */
public class q0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15796x2d45dd0b f220801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15852x6de633a3 f220802e;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15852x6de633a3 c15852x6de633a3, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15796x2d45dd0b c15796x2d45dd0b) {
        this.f220802e = c15852x6de633a3;
        this.f220801d = c15796x2d45dd0b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/ChatRoomStateView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15852x6de633a3 c15852x6de633a3 = this.f220802e;
        if (!s33.y.e(c15852x6de633a3.f220466o).f484023a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15796x2d45dd0b c15796x2d45dd0b = this.f220801d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c = c15796x2d45dd0b.f36797x28d1961f;
            if (c15780xf49d6a1c.f36742x28d6c0ab != 3 || c15780xf49d6a1c.f36740x2b224253 == null) {
                s33.y.h(c15852x6de633a3.f220458d, c15780xf49d6a1c);
            } else {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5239x4881ea67 c5239x4881ea67 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5239x4881ea67();
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15742xc7e6730c c15742xc7e6730c = c15796x2d45dd0b.f36797x28d1961f.f36740x2b224253;
                int i17 = c15742xc7e6730c.f36608x8cea31d7;
                am.d2 d2Var = c5239x4881ea67.f135572g;
                d2Var.f87961a = i17;
                d2Var.f87962b = c15742xc7e6730c.seq;
                d2Var.f87963c = true;
                c5239x4881ea67.e();
            }
            if (c15796x2d45dd0b.f36795x3bba899e) {
                c15852x6de633a3.f220471t.c(0L, 0L);
                gm0.j1.d().g(new v33.x(c15852x6de633a3.f220466o, 2, c15796x2d45dd0b.f220232id));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomStateView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
