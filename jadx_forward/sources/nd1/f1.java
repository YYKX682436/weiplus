package nd1;

/* loaded from: classes7.dex */
public class f1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nd1.g1 f417832d;

    public f1(nd1.g1 g1Var) {
        this.f417832d = g1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/page/JsApiSetNavigationBarRightButton$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f417832d.f417836a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OnCustomRightButtonClickEvent", "OnCustomRightButtonClickEvent dispatch");
        pi1.f fVar = new pi1.f();
        fVar.u(v5Var.v3());
        fVar.m();
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/page/JsApiSetNavigationBarRightButton$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
