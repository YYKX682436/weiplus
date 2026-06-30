package com.tencent.mm.plugin.appbrand.widget.halfscreen;

/* loaded from: classes7.dex */
public final class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f91176d;

    public i0(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f91176d = o6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger$trySetupHalfScreenCapsuleBar$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.page.n7 N2 = this.f91176d.N2();
        if (N2 != null) {
            N2.j4(false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger$trySetupHalfScreenCapsuleBar$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
