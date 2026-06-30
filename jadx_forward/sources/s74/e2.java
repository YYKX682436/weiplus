package s74;

/* loaded from: classes4.dex */
public final class e2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f485788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f485789e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w64.n f485790f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f485791g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 f485792h;

    public e2(int i17, s74.o2 o2Var, w64.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720) {
        this.f485788d = i17;
        this.f485789e = o2Var;
        this.f485790f = nVar;
        this.f485791g = c17933xe8d1b226;
        this.f485792h = c19807x593d1720;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        w64.x xVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$processGridElementContainer$1$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicComponent$processGridElementContainer$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = this.f485788d;
        s74.o2 o2Var = this.f485789e;
        if (i17 == 0) {
            java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.mhg);
            java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o2Var.j(), "onGridElementClick, isFakeClick=" + booleanValue);
            if (!booleanValue) {
                s74.f3 D = o2Var.D();
                if (D != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getView2JumpAnimMap", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                    java.util.Map map = D.f485817r;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getView2JumpAnimMap", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                    if (map != null) {
                        xVar = (w64.x) ((java.util.LinkedHashMap) map).get(view);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setIAdLandingPageJumpAnimInfoFromView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
                        view.setTag(com.p314xaae8f345.mm.R.id.ptl, xVar);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIAdLandingPageJumpAnimInfoFromView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
                    }
                }
                xVar = null;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setIAdLandingPageJumpAnimInfoFromView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
                view.setTag(com.p314xaae8f345.mm.R.id.ptl, xVar);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIAdLandingPageJumpAnimInfoFromView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.IAdLandingPageJumpAnimInfo$Companion");
            }
            this.f485790f.x(null);
            view.setTag(com.p314xaae8f345.mm.R.id.mhg, java.lang.Boolean.FALSE);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v.f245299e.d(this.f485791g);
        l44.k4 k4Var = l44.k4.f397753a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) o2Var.i();
        java.lang.String m70363x51f8f990 = c17933xe8d1b226 != null ? c17933xe8d1b226.m70363x51f8f990() : null;
        java.lang.String str = m70363x51f8f990 == null ? "" : m70363x51f8f990;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = this.f485792h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsContext", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsContext", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        k4Var.a(view, str, c19807x593d1720, o2Var.f485984r, o2Var.H(), o2Var.G(), this.f485790f, false);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicComponent$processGridElementContainer$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$processGridElementContainer$1$3");
    }
}
