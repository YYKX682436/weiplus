package s74;

/* loaded from: classes4.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f485854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f485855e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f485856f;

    public h0(s74.o0 o0Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, s74.f3 f3Var) {
        this.f485854d = o0Var;
        this.f485855e = c17933xe8d1b226;
        this.f485856f = f3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$processClickableViews$1$1$8");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$processClickableViews$1$1$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        s74.o0 o0Var = this.f485854d;
        w64.n nVar = new w64.n(o0Var.E(), o0Var.H(), o0Var.G(), null, null);
        l44.k4 k4Var = l44.k4.f397753a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f485855e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f17 = o0Var.C().f();
        kz5.p0 p0Var = kz5.p0.f395529d;
        nVar.x(l44.k4.c(k4Var, c17933xe8d1b226, 1, f17, null, p0Var, p0Var, null, null, 128, null));
        s34.c1 c1Var = this.f485856f.e().f370821b.f38220x654de096;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 a17 = c1Var != null ? c1Var.a() : null;
        if (a17 != null) {
            a17.f244102a = 20;
            nVar.p(new w64.c(a17, this.f485855e, 0, null, false, 0, false, null, 252, null));
            nVar.k(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$processClickableViews$1$1$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$processClickableViews$1$1$8");
    }
}
