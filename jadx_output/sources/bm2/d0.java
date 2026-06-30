package bm2;

/* loaded from: classes3.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.v0 f21835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f21836e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.k92 f21837f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f21838g;

    public d0(bm2.v0 v0Var, java.lang.String str, r45.k92 k92Var, android.content.Context context) {
        this.f21835d = v0Var;
        this.f21836e = str;
        this.f21837f = k92Var;
        this.f21838g = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        gk2.e q57;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            java.lang.String str = this.f21836e;
            bm2.v0 v0Var = this.f21835d;
            wt2.a aVar = v0Var.f22368n;
            boolean z17 = false;
            if (aVar != null && (q57 = aVar.q5()) != null && ((mm2.c1) q57.a(mm2.c1.class)).S) {
                z17 = true;
            }
            int i17 = z17 ? 8 : 6;
            bf2.c cVar = bf2.c.f19598a;
            r45.k92 k92Var = this.f21837f;
            cVar.a(eVar, i17, 4, str, k92Var.getInteger(10));
            com.tencent.mm.plugin.finder.live.plugin.m mVar = com.tencent.mm.plugin.finder.live.plugin.r.f114059n;
            android.content.Context context = this.f21838g;
            kotlin.jvm.internal.o.d(context);
            mVar.a(context, eVar, v0Var.f22361d, new cm2.h0(k92Var));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
