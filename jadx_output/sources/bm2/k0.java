package bm2;

/* loaded from: classes3.dex */
public final class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.do2 f22024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.v0 f22025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f22026f;

    public k0(r45.do2 do2Var, bm2.v0 v0Var, android.content.Context context) {
        this.f22024d = do2Var;
        this.f22025e = v0Var;
        this.f22026f = context;
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
        bm2.v0 v0Var = this.f22025e;
        jz5.f0 f0Var = null;
        r45.do2 do2Var = this.f22024d;
        if (do2Var != null) {
            wt2.a aVar = v0Var.f22368n;
            if (aVar != null && (q57 = aVar.q5()) != null) {
                wt2.a aVar2 = v0Var.f22368n;
                boolean z17 = false;
                if (aVar2 != null && (q58 = aVar2.q5()) != null && ((mm2.c1) q58.a(mm2.c1.class)).S) {
                    z17 = true;
                }
                bf2.c.b(bf2.c.f19598a, q57, z17 ? 8 : 6, 15, pm0.v.u(zl2.r4.f473950a.c0(do2Var)), 0, 16, null);
            }
            android.content.Context context = this.f22026f;
            kotlin.jvm.internal.o.d(context);
            ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).dk(context, null, null, do2Var, true);
            wt2.a aVar3 = v0Var.f22368n;
            if (aVar3 != null) {
                aVar3.m1();
                f0Var = jz5.f0.f302826a;
            }
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i(v0Var.f22361d, "jump PayVideoLis but play info is null!");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$33", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
