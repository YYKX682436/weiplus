package uj3;

/* loaded from: classes14.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.l0 f509789d;

    public d0(uj3.l0 l0Var) {
        this.f509789d = l0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        uj3.l0 l0Var = this.f509789d;
        if (!l0Var.f509861m) {
            yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe c16591xa5634bbe = l0Var.f509853e;
        if (c16591xa5634bbe != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenProjectReportHelper", "markClickDoodle");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1538L, 6L, 1L);
            if (c16591xa5634bbe.isChceked) {
                uj3.b.a(l0Var.f509850b, uj3.a.f509729g, null, 2, null);
                c16591xa5634bbe.m67103xdd7d58e5(false);
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe c16591xa5634bbe2 = l0Var.f509855g;
                if (c16591xa5634bbe2 != null) {
                    c16591xa5634bbe2.setVisibility(0);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe c16591xa5634bbe3 = l0Var.f509856h;
                if (c16591xa5634bbe3 != null) {
                    c16591xa5634bbe3.setVisibility(0);
                }
                if (l0Var.f509858j && (c22699x3dcdb352 = l0Var.f509860l) != null) {
                    c22699x3dcdb352.setVisibility(0);
                }
            } else {
                uj3.b.a(l0Var.f509850b, uj3.a.f509728f, null, 2, null);
                c16591xa5634bbe.m67103xdd7d58e5(true);
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe c16591xa5634bbe4 = l0Var.f509855g;
                if (c16591xa5634bbe4 != null) {
                    c16591xa5634bbe4.setVisibility(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe c16591xa5634bbe5 = l0Var.f509856h;
                if (c16591xa5634bbe5 != null) {
                    c16591xa5634bbe5.setVisibility(8);
                }
                if (l0Var.f509858j && (c22699x3dcdb3522 = l0Var.f509860l) != null) {
                    c22699x3dcdb3522.setVisibility(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe c16591xa5634bbe6 = l0Var.f509853e;
                if (c16591xa5634bbe6 != null) {
                    c16591xa5634bbe6.setVisibility(8);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = l0Var.f509854f;
                if (c22699x3dcdb3523 != null) {
                    c22699x3dcdb3523.setVisibility(0);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
