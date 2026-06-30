package ku1;

/* loaded from: classes15.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt1.j f393655d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ku1.l f393656e;

    public k(ku1.l lVar, tt1.j jVar) {
        this.f393656e = lVar;
        this.f393655d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/view/CardBaseCodeViewController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tt1.j jVar = this.f393655d;
        boolean n07 = jVar.n0();
        ku1.l lVar = this.f393656e;
        if (n07) {
            lu1.d.g(lVar.f393663a.f393626b, 0, null, false, jVar);
        } else {
            r45.w50 w50Var = jVar.s0().Z;
            if (w50Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w50Var.f470421q) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w50Var.f470420p)) {
                lu1.d.e(jVar.g(), w50Var, lVar.f393664b.getIntent() != null ? lVar.f393664b.getIntent().getIntExtra("key_from_scene", 3) : 3, lVar.f393664b.getIntent() != null ? lVar.f393664b.getIntent().getIntExtra("key_from_appbrand_type", 0) : 0);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11941, 20, jVar.g(), jVar.f(), "", w50Var.f470411d);
            } else if (w50Var != null && !android.text.TextUtils.isEmpty(w50Var.f470414g)) {
                lu1.d.j(lVar.f393663a.f393626b, lu1.a0.k(w50Var.f470414g, w50Var.f470415h), 1);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11941, 9, jVar.g(), jVar.f(), "", w50Var.f470411d);
                if (lu1.a0.C(w50Var, jVar.g())) {
                    lu1.a0.L(jVar.g(), w50Var.f470411d);
                    lu1.d.h(lVar.f393663a.f393626b, jVar.s0().f470085m);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/view/CardBaseCodeViewController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
