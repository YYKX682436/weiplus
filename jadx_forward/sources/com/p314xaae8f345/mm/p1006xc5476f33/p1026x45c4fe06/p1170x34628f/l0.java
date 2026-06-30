package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f168375d;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12494xc37d1f72 c12494xc37d1f72, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var) {
        this.f168375d = n7Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = this.f168375d;
        n7Var.V3();
        java.util.Map map = i81.j.f371125a;
        if (n7Var != null) {
            try {
                android.content.Context f229340d = n7Var.getF229340d() != null ? n7Var.getF229340d() : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                android.content.Intent putExtra = new android.content.Intent(f229340d, (java.lang.Class<?>) i81.j.f371125a.get(bm5.f1.a().replaceFirst(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, ""))).putExtra("appId", n7Var.mo48798x74292566());
                if (!(f229340d instanceof android.app.Activity)) {
                    putExtra.addFlags(268435456);
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(putExtra);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(f229340d, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/ad/AppBrandAdUtils", "openAdUIFromMenu", "(Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                f229340d.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(f229340d, "com/tencent/mm/plugin/appbrand/ad/AppBrandAdUtils", "openAdUIFromMenu", "(Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", e17, "openAdUIFromMenu fail", new java.lang.Object[0]);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
