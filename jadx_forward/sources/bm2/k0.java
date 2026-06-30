package bm2;

/* loaded from: classes3.dex */
public final class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.do2 f103557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.v0 f103558e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f103559f;

    public k0(r45.do2 do2Var, bm2.v0 v0Var, android.content.Context context) {
        this.f103557d = do2Var;
        this.f103558e = v0Var;
        this.f103559f = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        gk2.e q57;
        gk2.e q58;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$33", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bm2.v0 v0Var = this.f103558e;
        jz5.f0 f0Var = null;
        r45.do2 do2Var = this.f103557d;
        if (do2Var != null) {
            wt2.a aVar = v0Var.f103901n;
            if (aVar != null && (q57 = aVar.q5()) != null) {
                wt2.a aVar2 = v0Var.f103901n;
                boolean z17 = false;
                if (aVar2 != null && (q58 = aVar2.q5()) != null && ((mm2.c1) q58.a(mm2.c1.class)).S) {
                    z17 = true;
                }
                bf2.c.b(bf2.c.f101131a, q57, z17 ? 8 : 6, 15, pm0.v.u(zl2.r4.f555483a.c0(do2Var)), 0, 16, null);
            }
            android.content.Context context = this.f103559f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).dk(context, null, null, do2Var, true);
            wt2.a aVar3 = v0Var.f103901n;
            if (aVar3 != null) {
                aVar3.m1();
                f0Var = jz5.f0.f384359a;
            }
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v0Var.f103894d, "jump PayVideoLis but play info is null!");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$33", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
