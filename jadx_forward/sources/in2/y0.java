package in2;

/* loaded from: classes10.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.a1 f374467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.yg f374468e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f374469f;

    public y0(in2.a1 a1Var, dk2.yg ygVar, int i17) {
        this.f374467d = a1Var;
        this.f374468e = ygVar;
        this.f374469f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapter$onBindSingSongHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in2.a1 a1Var = this.f374467d;
        java.lang.Boolean bool = (java.lang.Boolean) ((mm2.m6) a1Var.f374327d.a(mm2.m6.class)).f410778m.mo3195x754a37bb();
        if (bool == null) {
            bool = java.lang.Boolean.FALSE;
        }
        if (bool.booleanValue()) {
            dk2.yg ygVar = this.f374468e;
            if (ygVar.a()) {
                if (ygVar.f315930e) {
                    int i17 = 0;
                    for (java.lang.Object obj : a1Var.f374331h) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        if (i17 == this.f374469f) {
                            a1Var.m8148xed6e4d18(i17, java.lang.Boolean.TRUE);
                        } else {
                            a1Var.m8148xed6e4d18(i17, java.lang.Boolean.FALSE);
                        }
                        i17 = i18;
                    }
                } else {
                    android.content.Context context = a1Var.f374328e;
                    db5.t7.g(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oyx));
                }
            }
        } else {
            android.content.Context context2 = a1Var.f374328e;
            db5.t7.g(context2, context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.okd));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapter$onBindSingSongHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
