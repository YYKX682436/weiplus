package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class d6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.f6 f171193d;

    public d6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.f6 f6Var) {
        this.f171193d = f6Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/AppBrandPluginLoadingSplash$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.f6 f6Var = this.f171193d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = f6Var.f171237x;
        if (o6Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.g(o6Var.f156336n, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.CLOSE);
            this.f171193d.f171237x.l0();
        } else {
            yz5.a aVar = f6Var.f171239z;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandPluginLoadingSplash$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
