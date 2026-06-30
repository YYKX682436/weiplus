package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes15.dex */
public class u2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d f220838d;

    public u2(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d) {
        this.f220838d = c15859x7405890d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/GameChatListView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.GameChatListView", "click new msg tag, cache list size:%d", java.lang.Integer.valueOf(this.f220838d.F2.size()));
        android.view.View view2 = this.f220838d.f220509v2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$5", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$5", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f220838d.f220509v2.getTag() != null) {
            java.lang.String str = this.f220838d.f220509v2.getTag() instanceof java.lang.String ? (java.lang.String) this.f220838d.f220509v2.getTag() : "";
            this.f220838d.f220509v2.setTag(null);
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.t2 t2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.t2(this, str);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(t2Var, 200L, false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d = this.f220838d;
            if (!(c15859x7405890d.f220500m2 == 0)) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5239x4881ea67 c5239x4881ea67 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5239x4881ea67();
                c5239x4881ea67.f135572g.f87961a = 0;
                c5239x4881ea67.e();
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.f fVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d2 = this.f220838d;
                fVar.g(14L, 2L, c15859x7405890d2.f220496i2, c15859x7405890d2.f220495h2, 0L, "", 0L, c15859x7405890d2.f220500m2);
            } else if (c15859x7405890d.F2.size() > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d3 = this.f220838d;
                c15859x7405890d3.o1(c15859x7405890d3.F2, 7, null);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d4 = this.f220838d;
                int mo1894x7e414b06 = c15859x7405890d4.f220493f2.mo1894x7e414b06() - 1;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(java.lang.Integer.valueOf(mo1894x7e414b06));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(c15859x7405890d4, arrayList3.toArray(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$5", "onClick", "(Landroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
                c15859x7405890d4.a1(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(c15859x7405890d4, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$5", "onClick", "(Landroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
