package cb1;

/* loaded from: classes4.dex */
public class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.yb f121836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f121837e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f121838f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cb1.y0 f121839g;

    public s0(cb1.y0 y0Var, r45.yb ybVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, int i17) {
        this.f121839g = y0Var;
        this.f121836d = ybVar;
        this.f121837e = v5Var;
        this.f121838f = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/autofill/JsApiRequestAuthUserAutoFillData$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "showAlertImplNew, acceptButton");
        r45.yb ybVar = this.f121836d;
        ybVar.f472474f = true;
        cb1.y0 y0Var = this.f121839g;
        java.lang.String o17 = y0Var.o("ok");
        int i17 = this.f121838f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f121837e;
        v5Var.a(i17, o17);
        cb1.y0.C(y0Var, v5Var, ybVar);
        cb1.k1 k1Var = y0Var.f121869g;
        if (k1Var != null) {
            k1Var.dismiss();
            y0Var.f121869g = null;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/autofill/JsApiRequestAuthUserAutoFillData$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
