package dc4;

/* loaded from: classes4.dex */
public final class g implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dc4.i f310280a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m0 f310281b;

    public g(dc4.i iVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m0 m0Var) {
        this.f310280a = iVar;
        this.f310281b = m0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.f
    public void a(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2$bindComponentModel$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2$bindComponentModel$1");
        dc4.i iVar = this.f310280a;
        android.app.Activity p17 = iVar.p();
        int i17 = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d;
        dc4.i.o(iVar, i65.a.b(p17, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d));
        dc4.i.n(iVar, i65.a.b(iVar.p(), 132));
        boolean z18 = iVar.f310372o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m0 m0Var = this.f310281b;
        if (z18) {
            i17 = 396;
            dc4.i.o(iVar, i65.a.b(iVar.p(), 396));
            dc4.i.n(iVar, i65.a.b(iVar.p(), com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508));
        } else if (m0Var.b() == 1) {
            i17 = 248;
            dc4.i.o(iVar, i65.a.b(iVar.p(), 248));
            dc4.i.n(iVar, i65.a.b(iVar.p(), 140));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRootContainer", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        android.view.ViewGroup viewGroup = iVar.f310291v;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRootContainer", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        int width = viewGroup != null ? viewGroup.getWidth() : 0;
        if (width != 0 && width < i65.a.b(iVar.p(), i17)) {
            dc4.i.o(iVar, width);
            dc4.i.n(iVar, (int) ((dc4.i.m(iVar) * 132.0f) / 233.0f));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMViewLogic", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            r74.a0 a0Var = iVar.f310295z;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMViewLogic", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            if (a0Var != null) {
                a0Var.k(m0Var, new dc4.f(iVar));
            }
        }
        android.view.View itemRootView = iVar.f310369i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemRootView, "itemRootView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMMedia", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        r45.jj4 r17 = iVar.r();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMMedia", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        int m17 = dc4.i.m(iVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getAdLivingContainerHeight$p", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        int i18 = iVar.H;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getAdLivingContainerHeight$p", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        dc4.i.l(iVar, itemRootView, r17, m17, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2$bindComponentModel$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2$bindComponentModel$1");
    }
}
