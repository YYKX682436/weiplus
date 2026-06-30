package cb1;

/* loaded from: classes4.dex */
public class u0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f40314d;

    public u0(cb1.y0 y0Var, com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        this.f40314d = v5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/autofill/JsApiRequestAuthUserAutoFillData$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "do know the auth auto fill data protocol");
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f40314d;
        java.lang.String str = v5Var.getF147807d().getString(com.tencent.mm.R.string.f490050ji) + "" + com.tencent.mm.sdk.platformtools.m2.d();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "do open url:" + str);
        ((com.tencent.mm.plugin.appbrand.jsapi.r1) v5Var.q(com.tencent.mm.plugin.appbrand.jsapi.r1.class)).N(v5Var.getF147807d(), str, "", null);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/autofill/JsApiRequestAuthUserAutoFillData$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
