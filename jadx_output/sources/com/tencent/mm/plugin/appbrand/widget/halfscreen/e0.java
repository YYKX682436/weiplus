package com.tencent.mm.plugin.appbrand.widget.halfscreen;

/* loaded from: classes7.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f91164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar f91165e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 f91166f;

    public e0(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar baseAppBrandSingleCloseCapsuleBar, com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var) {
        this.f91164d = o6Var;
        this.f91165e = baseAppBrandSingleCloseCapsuleBar;
        this.f91166f = l0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger$trySetupHalfScreenCapsuleBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f91164d.S();
        this.f91165e.setCloseBtnListener(null);
        com.tencent.mm.plugin.appbrand.widget.f0 f0Var = this.f91166f.f91198d;
        if (f0Var != null) {
            f0Var.T(10);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger$trySetupHalfScreenCapsuleBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
