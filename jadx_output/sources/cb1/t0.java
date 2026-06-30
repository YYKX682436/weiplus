package cb1;

/* loaded from: classes4.dex */
public class t0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.yb f40309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f40310e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f40311f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cb1.y0 f40312g;

    public t0(cb1.y0 y0Var, r45.yb ybVar, com.tencent.mm.plugin.appbrand.page.v5 v5Var, int i17) {
        this.f40312g = y0Var;
        this.f40309d = ybVar;
        this.f40310e = v5Var;
        this.f40311f = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/autofill/JsApiRequestAuthUserAutoFillData$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "showAlertImplNew, rejectButton");
        r45.yb ybVar = this.f40309d;
        ybVar.f390941f = false;
        cb1.y0 y0Var = this.f40312g;
        java.lang.String o17 = y0Var.o("cancel");
        int i17 = this.f40311f;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f40310e;
        v5Var.a(i17, o17);
        cb1.y0.C(y0Var, v5Var, ybVar);
        cb1.k1 k1Var = y0Var.f40336g;
        if (k1Var != null) {
            k1Var.dismiss();
            y0Var.f40336g = null;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/autofill/JsApiRequestAuthUserAutoFillData$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
