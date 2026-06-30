package ku1;

/* loaded from: classes15.dex */
public class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.w50 f393676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tt1.j f393677e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ku1.v f393678f;

    public t(ku1.v vVar, r45.w50 w50Var, tt1.j jVar) {
        this.f393678f = vVar;
        this.f393676d = w50Var;
        this.f393677e = jVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.w50 w50Var = this.f393676d;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w50Var.f470421q);
        tt1.j jVar = this.f393677e;
        ku1.v vVar = this.f393678f;
        if (!K0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w50Var.f470420p)) {
            lu1.d.e(jVar.g(), w50Var, vVar.f393664b.getIntent() != null ? vVar.f393664b.getIntent().getIntExtra("key_from_scene", 3) : 3, vVar.f393664b.getIntent() != null ? vVar.f393664b.getIntent().getIntExtra("key_from_appbrand_type", 0) : 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11941, 20, jVar.g(), jVar.f(), "", w50Var.f470411d);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w50Var.f470414g)) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = vVar.f393664b;
            lu1.r.e(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aw9), true);
        } else {
            lu1.d.j(vVar.f393664b, lu1.a0.k(w50Var.f470414g, w50Var.f470415h), 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[5];
            objArr[0] = 9;
            objArr[1] = jVar.g();
            objArr[2] = jVar.f();
            objArr[3] = "";
            java.lang.String str = w50Var.f470411d;
            objArr[4] = str != null ? str : "";
            g0Var.d(11941, objArr);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
