package sc2;

/* loaded from: classes2.dex */
public final class n6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487633e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f487634f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f487635g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ad2.h f487636h;

    public n6(in5.s0 s0Var, android.view.View view, java.lang.String str, xc2.p0 p0Var, ad2.h hVar) {
        this.f487632d = s0Var;
        this.f487633e = view;
        this.f487634f = str;
        this.f487635g = p0Var;
        this.f487636h = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/component/FinderFeedJumperBaseUIC$Companion$setViewExposedAndClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f487632d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.p(com.p314xaae8f345.mm.R.id.e_k);
        boolean z17 = c15196x85976f5f != null && c15196x85976f5f.D();
        android.view.View view2 = this.f487633e;
        if (view2.getVisibility() != 8) {
            if (!(view2.getAlpha() == 0.0f) && !z17) {
                xc2.p0 p0Var = this.f487635g;
                if (p0Var.C) {
                    this.f487636h.r(s0Var, view2, p0Var);
                }
                yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/component/FinderFeedJumperBaseUIC$Companion$setViewExposedAndClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BaseAdFeedJumperUIC", "[onClick] not visible, visibility:" + view2.getVisibility() + " alpha:" + view2.getVisibility() + " isInScaleMode:" + z17 + ", feedId=" + this.f487634f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/component/FinderFeedJumperBaseUIC$Companion$setViewExposedAndClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
