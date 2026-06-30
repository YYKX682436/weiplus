package ub5;

/* loaded from: classes8.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ub5.j f507755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f507756e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f507757f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f507758g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f507759h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f507760i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ xj.m f507761m;

    public f(ub5.j jVar, java.util.List list, android.app.Activity activity, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, yz5.a aVar, xj.m mVar) {
        this.f507755d = jVar;
        this.f507756e = list;
        this.f507757f = activity;
        this.f507758g = k0Var;
        this.f507759h = z3Var;
        this.f507760i = aVar;
        this.f507761m = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/sheet/ForwardBottomSheetHelper$tryDecorateBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ub5.j jVar = this.f507755d;
        if (jVar != null) {
            ub5.j.a(jVar, 3, null, null, 6, null);
        }
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.w(this.f507756e)) {
            android.app.Activity activity = this.f507757f;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activity);
            u1Var.g(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ncg));
            u1Var.a(true);
            u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.ohw);
            u1Var.b(new ub5.e(this.f507757f, this.f507758g, this.f507756e, this.f507759h, this.f507755d, this.f507760i, this.f507761m));
            u1Var.q(false);
        } else {
            ub5.g.f507762a.a(this.f507757f, this.f507758g, this.f507756e, this.f507759h, this.f507755d, this.f507760i, this.f507761m);
        }
        this.f507758g.u();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/sheet/ForwardBottomSheetHelper$tryDecorateBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
