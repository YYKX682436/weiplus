package bm2;

/* loaded from: classes3.dex */
public final class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.mb0 f21996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f21997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.v0 f21998f;

    public j0(bw5.mb0 mb0Var, android.content.Context context, bm2.v0 v0Var) {
        this.f21996d = mb0Var;
        this.f21997e = context;
        this.f21998f = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.f0 f0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$30", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            bf2.c.b(bf2.c.f19598a, eVar, 8, 12, null, 0, 24, null);
        }
        bw5.mb0 mb0Var = this.f21996d;
        if (mb0Var != null) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            android.content.Context context = this.f21997e;
            kotlin.jvm.internal.o.d(context);
            r4Var.r2(context, mb0Var, bw5.ar0.TingScene_Live_AnchorAddCategoryLiveHalfPage);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i(this.f21998f.f22361d, "jump ting but play info is null!");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$30", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
