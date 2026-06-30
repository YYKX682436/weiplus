package ym5;

/* loaded from: classes15.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22783x88759141 f545107d;

    public y(com.p314xaae8f345.mm.p2776x373aa5.C22783x88759141 c22783x88759141) {
        this.f545107d = c22783x88759141;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/EmojiPanelSlideIndicatorView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ym5.f0 controller = this.f545107d.getController();
        if (controller != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPanelDragIndicator", "onClicked");
            if (controller.f544818k) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmojiPanelDragIndicator", "has reset");
            } else {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.g1 g1Var = controller.f544811d;
                if (g1Var != null) {
                    g1Var.d();
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6406xa2da930f c6406xa2da930f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6406xa2da930f();
                c6406xa2da930f.f137538d = java.lang.System.currentTimeMillis();
                if (controller.f544826s == 0) {
                    controller.f(controller.f544823p, 500);
                    c6406xa2da930f.f137539e = 1L;
                } else {
                    controller.f(0, 500);
                    c6406xa2da930f.f137539e = 2L;
                }
                c6406xa2da930f.f137540f = (controller.f544827t != null ? r1.f420576a : 0) + 1;
                c6406xa2da930f.k();
                com.p314xaae8f345.mm.p2470x93e71c27.ui.g1 g1Var2 = controller.f544811d;
                if (g1Var2 != null) {
                    g1Var2.f(controller.f544826s == controller.f544823p);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/view/EmojiPanelSlideIndicatorView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
