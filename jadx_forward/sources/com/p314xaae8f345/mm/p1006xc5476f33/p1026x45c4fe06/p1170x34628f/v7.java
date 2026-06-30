package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class v7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w7 f168709d;

    public v7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w7 w7Var) {
        this.f168709d = w7Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$16$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageViewWC", "CustomRightButton click");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = this.f168709d.f168733a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OnCustomRightButtonClickEvent", "OnCustomRightButtonClickEvent dispatch");
        pi1.f fVar = new pi1.f();
        fVar.u(n7Var.v3());
        fVar.m();
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$16$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
