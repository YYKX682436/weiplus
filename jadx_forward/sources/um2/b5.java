package um2;

/* loaded from: classes3.dex */
public final class b5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f510262e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f510263f;

    public b5(um2.x5 x5Var, int i17, int i18) {
        this.f510261d = x5Var;
        this.f510262e = i17;
        this.f510263f = i18;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC$onStatusChanged$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        um2.x5 x5Var = this.f510261d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ya D = x5Var.D();
        if (D != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c.b(D.f196704r, null, 1, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var = x5Var.f510608t0;
        if (ag0Var != null) {
            ag0Var.f193417z.k(this.f510262e, this.f510263f, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC$onStatusChanged$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
