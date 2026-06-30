package s74;

/* loaded from: classes4.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f485951d;

    public m0(s74.o0 o0Var) {
        this.f485951d = o0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View.OnClickListener onClickListener;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$setImageKeeperLayoutClick$rootClickListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$setImageKeeperLayoutClick$rootClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        s74.o0 o0Var = this.f485951d;
        s74.f3 D = o0Var.D();
        if (D != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRootContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            android.view.ViewGroup viewGroup = D.f485824y;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRootContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            if (viewGroup != null) {
                viewGroup.performClick();
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$setImageKeeperLayoutClick$rootClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$setImageKeeperLayoutClick$rootClickListener$1");
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(o0Var.j(), "error! rootContainer not finded!");
        ca4.q.a("dynamicImageKeeperError", "", 9);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f17 = o0Var.C().f();
        if ((f17 != null ? f17.T : null) == null) {
            ca4.q.c("-1listener null", null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f18 = o0Var.C().f();
        if (f18 != null && (onClickListener = f18.T) != null) {
            onClickListener.onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$setImageKeeperLayoutClick$rootClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$setImageKeeperLayoutClick$rootClickListener$1");
    }
}
