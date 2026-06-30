package bm2;

/* loaded from: classes3.dex */
public final class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.mb0 f103529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f103530e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.v0 f103531f;

    public j0(bw5.mb0 mb0Var, android.content.Context context, bm2.v0 v0Var) {
        this.f103529d = mb0Var;
        this.f103530e = context;
        this.f103531f = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.f0 f0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$30", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            bf2.c.b(bf2.c.f101131a, eVar, 8, 12, null, 0, 24, null);
        }
        bw5.mb0 mb0Var = this.f103529d;
        if (mb0Var != null) {
            zl2.r4 r4Var = zl2.r4.f555483a;
            android.content.Context context = this.f103530e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            r4Var.r2(context, mb0Var, bw5.ar0.TingScene_Live_AnchorAddCategoryLiveHalfPage);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f103531f.f103894d, "jump ting but play info is null!");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$30", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
