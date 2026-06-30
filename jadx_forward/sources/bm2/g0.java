package bm2;

/* loaded from: classes3.dex */
public final class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f103435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.v0 f103436e;

    public g0(android.content.Context context, bm2.v0 v0Var) {
        this.f103435d = context;
        this.f103436e = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        gk2.e q57;
        gk2.e q58;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$23", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        bm2.v0 v0Var = this.f103436e;
        if (eVar != null) {
            wt2.a aVar = v0Var.f103901n;
            boolean z17 = false;
            if (aVar != null && (q58 = aVar.q5()) != null && ((mm2.c1) q58.a(mm2.c1.class)).S) {
                z17 = true;
            }
            bf2.c.b(bf2.c.f101131a, eVar, z17 ? 8 : 6, 10, null, 0, 24, null);
        }
        c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
        android.content.Context context = this.f103435d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        wt2.a aVar2 = v0Var.f103901n;
        if (aVar2 == null || (q57 = aVar2.q5()) == null || (str = ((mm2.c1) q57.a(mm2.c1.class)).f410385o) == null) {
            str = "";
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).Nk(context, null, str, 0, 0);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$23", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
