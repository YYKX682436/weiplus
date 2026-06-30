package ut2;

/* loaded from: classes3.dex */
public final class v2 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f512659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f512660e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f512661f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f512662g;

    public v2(ut2.s3 s3Var, cm2.m0 m0Var, gk2.e eVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar) {
        this.f512659d = s3Var;
        this.f512660e = m0Var;
        this.f512661f = eVar;
        this.f512662g = lVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingViewHolder$setUpCartBtn$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.ohu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type kotlin.FloatArray");
        float[] fArr = (float[]) tag;
        ut2.s3 s3Var = this.f512659d;
        rl5.r rVar = new rl5.r(s3Var.f3639x46306858.getContext());
        int i17 = (int) fArr[0];
        int i18 = (int) fArr[1];
        android.view.View view2 = s3Var.f3639x46306858;
        ut2.t2 t2Var = new ut2.t2(s3Var);
        gk2.e eVar = this.f512661f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f512662g;
        cm2.m0 m0Var = this.f512660e;
        rVar.h(view2, t2Var, new ut2.u2(m0Var, s3Var, eVar, lVar), i17, i18);
        ut2.s3.o(s3Var, m0Var);
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingViewHolder$setUpCartBtn$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
