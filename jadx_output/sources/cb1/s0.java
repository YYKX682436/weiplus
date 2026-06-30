package cb1;

/* loaded from: classes4.dex */
public class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.yb f40303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f40304e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f40305f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cb1.y0 f40306g;

    public s0(cb1.y0 y0Var, r45.yb ybVar, com.tencent.mm.plugin.appbrand.page.v5 v5Var, int i17) {
        this.f40306g = y0Var;
        this.f40303d = ybVar;
        this.f40304e = v5Var;
        this.f40305f = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/autofill/JsApiRequestAuthUserAutoFillData$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "showAlertImplNew, acceptButton");
        r45.yb ybVar = this.f40303d;
        ybVar.f390941f = true;
        cb1.y0 y0Var = this.f40306g;
        java.lang.String o17 = y0Var.o("ok");
        int i17 = this.f40305f;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f40304e;
        v5Var.a(i17, o17);
        cb1.y0.C(y0Var, v5Var, ybVar);
        cb1.k1 k1Var = y0Var.f40336g;
        if (k1Var != null) {
            k1Var.dismiss();
            y0Var.f40336g = null;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/autofill/JsApiRequestAuthUserAutoFillData$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
