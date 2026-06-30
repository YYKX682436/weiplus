package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes.dex */
public class z4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI f90363d;

    public z4(com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI appBrandGuideUI) {
        this.f90363d = appBrandGuideUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI appBrandGuideUI = this.f90363d;
        com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI appBrandGuideUI2 = this.f90363d;
        android.content.Intent putExtra = new android.content.Intent(appBrandGuideUI2, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.class).putExtra("extra_enter_scene", 11);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(putExtra);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(appBrandGuideUI, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandGuideUI$3", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        appBrandGuideUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(appBrandGuideUI, "com/tencent/mm/plugin/appbrand/ui/AppBrandGuideUI$3", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        jx3.f.INSTANCE.d(14750, 3, "");
        appBrandGuideUI2.finish();
    }
}
