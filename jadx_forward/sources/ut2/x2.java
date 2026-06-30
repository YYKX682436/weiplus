package ut2;

/* loaded from: classes3.dex */
public final class x2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f512681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f512682e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f512683f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f512684g;

    public x2(ut2.s3 s3Var, cm2.m0 m0Var, gk2.e eVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar) {
        this.f512681d = s3Var;
        this.f512682e = m0Var;
        this.f512683f = eVar;
        this.f512684g = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingViewHolder$setUpCartBtn$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ut2.s3.l(this.f512681d, this.f512682e, this.f512683f, this.f512684g);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingViewHolder$setUpCartBtn$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
