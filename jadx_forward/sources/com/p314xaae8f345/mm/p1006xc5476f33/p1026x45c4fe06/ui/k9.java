package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class k9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9 f171361d;

    public k9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9 c9Var) {
        this.f171361d = c9Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/AppBrandUILoadingSplash$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9 c9Var = this.f171361d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = c9Var.f171161x;
        if (c11510xdd90c2f2 == null) {
            yz5.a aVar = c9Var.E;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        } else if (c9Var.M) {
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandUILoadingSplash$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.g(c11510xdd90c2f2.f156336n, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.CLOSE);
            this.f171361d.f171161x.l0();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandUILoadingSplash$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
