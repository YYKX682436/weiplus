package bm2;

/* loaded from: classes3.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.v0 f103368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f103369e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.k92 f103370f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f103371g;

    public d0(bm2.v0 v0Var, java.lang.String str, r45.k92 k92Var, android.content.Context context) {
        this.f103368d = v0Var;
        this.f103369e = str;
        this.f103370f = k92Var;
        this.f103371g = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        gk2.e q57;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            java.lang.String str = this.f103369e;
            bm2.v0 v0Var = this.f103368d;
            wt2.a aVar = v0Var.f103901n;
            boolean z17 = false;
            if (aVar != null && (q57 = aVar.q5()) != null && ((mm2.c1) q57.a(mm2.c1.class)).S) {
                z17 = true;
            }
            int i17 = z17 ? 8 : 6;
            bf2.c cVar = bf2.c.f101131a;
            r45.k92 k92Var = this.f103370f;
            cVar.a(eVar, i17, 4, str, k92Var.m75939xb282bd08(10));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.m mVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r.f195592n;
            android.content.Context context = this.f103371g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            mVar.a(context, eVar, v0Var.f103894d, new cm2.h0(k92Var));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
