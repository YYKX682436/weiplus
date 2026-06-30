package s74;

/* loaded from: classes4.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f485724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f485725e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f485726f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f485727g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f485728h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f485729i;

    public a0(android.app.Activity activity, s74.o0 o0Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, boolean z17, android.view.View view) {
        this.f485724d = activity;
        this.f485725e = o0Var;
        this.f485726f = c17702x544f64e9;
        this.f485727g = c17933xe8d1b226;
        this.f485728h = z17;
        this.f485729i = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$processClickableViews$1$1$11");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$processClickableViews$1$1$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryGetIAdLandingPageJumpAnimInfoFromView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
        java.lang.Object tag = view != null ? view.getTag(com.p314xaae8f345.mm.R.id.ptl) : null;
        w64.x xVar = tag instanceof w64.x ? (w64.x) tag : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryGetIAdLandingPageJumpAnimInfoFromView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
        android.app.Activity activity = this.f485724d;
        s74.o0 o0Var = this.f485725e;
        int H = o0Var.H();
        i64.b1 G = o0Var.G();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f485727g;
        w64.n nVar = new w64.n(activity, H, G, null, new s74.z(xVar, o0Var, c17933xe8d1b226));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = this.f485726f;
        c17702x544f64e9.f244102a = 15;
        nVar.p(new w64.c(c17702x544f64e9, this.f485727g, 0, null, true, this.f485728h ? 1 : 2, false, null, 204, null));
        l44.k4 k4Var = l44.k4.f397753a;
        android.view.View view2 = this.f485729i;
        java.lang.String m70363x51f8f990 = c17933xe8d1b226.m70363x51f8f990();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsContext", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsContext", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        k4Var.a(view2, m70363x51f8f990, m70371x485d7, o0Var.f485984r, o0Var.H(), o0Var.G(), nVar, this.f485728h);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$processClickableViews$1$1$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$processClickableViews$1$1$11");
    }
}
