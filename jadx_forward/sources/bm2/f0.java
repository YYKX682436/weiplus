package bm2;

/* loaded from: classes3.dex */
public final class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.b0 f103411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f103412e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.v0 f103413f;

    public f0(bm2.b0 b0Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, bm2.v0 v0Var) {
        this.f103411d = b0Var;
        this.f103412e = c19786x6a1e2862;
        this.f103413f = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        gk2.e q57;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gq gqVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jq.f194687p;
        android.content.Context context = this.f103411d.f3639x46306858.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        gqVar.a(context, this.f103412e);
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            wt2.a aVar = this.f103413f.f103901n;
            boolean z17 = false;
            if (aVar != null && (q57 = aVar.q5()) != null && ((mm2.c1) q57.a(mm2.c1.class)).S) {
                z17 = true;
            }
            bf2.c.b(bf2.c.f101131a, eVar, z17 ? 8 : 6, 8, null, 0, 24, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
