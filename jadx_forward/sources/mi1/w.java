package mi1;

/* loaded from: classes7.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi1.x f408252d;

    public w(mi1.x xVar) {
        this.f408252d = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/capsulebar/AppBrandCapsuleTipsView$initImpl$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mi1.x xVar = this.f408252d;
        android.view.View view2 = xVar.f408257f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/page/capsulebar/AppBrandCapsuleTipsView$initImpl$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/page/capsulebar/AppBrandCapsuleTipsView$initImpl$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1 = xVar.f408255d.u0().L1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11818x81f6960b c11818x81f6960b = c11816x5915d2c1.S;
        if (c11818x81f6960b != null) {
            c11818x81f6960b.a();
        }
        c11816x5915d2c1.R = "";
        c11816x5915d2c1.S = null;
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/capsulebar/AppBrandCapsuleTipsView$initImpl$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
