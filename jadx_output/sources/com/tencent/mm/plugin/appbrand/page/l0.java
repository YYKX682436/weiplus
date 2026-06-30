package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f86842d;

    public l0(com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader appBrandMenuHeader, com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        this.f86842d = n7Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f86842d;
        n7Var.V3();
        java.util.Map map = i81.j.f289592a;
        if (n7Var != null) {
            try {
                android.content.Context f147807d = n7Var.getF147807d() != null ? n7Var.getF147807d() : com.tencent.mm.sdk.platformtools.x2.f193071a;
                android.content.Intent putExtra = new android.content.Intent(f147807d, (java.lang.Class<?>) i81.j.f289592a.get(bm5.f1.a().replaceFirst(com.tencent.mm.sdk.platformtools.x2.f193072b, ""))).putExtra("appId", n7Var.getAppId());
                if (!(f147807d instanceof android.app.Activity)) {
                    putExtra.addFlags(268435456);
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(putExtra);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(f147807d, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/ad/AppBrandAdUtils", "openAdUIFromMenu", "(Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                f147807d.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(f147807d, "com/tencent/mm/plugin/appbrand/ad/AppBrandAdUtils", "openAdUIFromMenu", "(Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", e17, "openAdUIFromMenu fail", new java.lang.Object[0]);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
