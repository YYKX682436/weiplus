package s74;

/* loaded from: classes4.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f486134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f486135e;

    public y(s74.o0 o0Var, android.view.View view) {
        this.f486134d = o0Var;
        this.f486135e = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc k17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$processClickableViews$1$1$10");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$processClickableViews$1$1$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        s74.o0 o0Var = this.f486134d;
        s74.f3 D = o0Var.D();
        if (D != null && (k17 = D.k()) != null) {
            if (k17.getChildCount() > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o0Var.j(), "on gridElementClick");
                android.view.View childAt = k17.getChildAt(0);
                int i17 = w64.x.f524871a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryGetIAdLandingPageJumpAnimInfoFromView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
                android.view.View view2 = this.f486135e;
                java.lang.Object tag = view2 != null ? view2.getTag(com.p314xaae8f345.mm.R.id.ptl) : null;
                w64.x xVar = tag instanceof w64.x ? (w64.x) tag : null;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryGetIAdLandingPageJumpAnimInfoFromView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setIAdLandingPageJumpAnimInfoFromView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
                if (childAt != null) {
                    childAt.setTag(com.p314xaae8f345.mm.R.id.ptl, xVar);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIAdLandingPageJumpAnimInfoFromView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
                if (childAt != null) {
                    childAt.setTag(com.p314xaae8f345.mm.R.id.mhg, java.lang.Boolean.TRUE);
                    childAt.performClick();
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(o0Var.j(), "gridElementClick, empty gridElementContainer");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$processClickableViews$1$1$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$processClickableViews$1$1$10");
    }
}
