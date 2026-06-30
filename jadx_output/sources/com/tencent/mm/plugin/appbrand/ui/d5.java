package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class d5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherFolderUI f89659d;

    public d5(com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherFolderUI appBrandLauncherFolderUI) {
        this.f89659d = appBrandLauncherFolderUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherFolderUI appBrandLauncherFolderUI = this.f89659d;
        if (appBrandLauncherFolderUI.f89357e) {
            android.content.Intent intent = new android.content.Intent(appBrandLauncherFolderUI, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.class);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            intent.putExtra("extra_start_activity_click_timestamp_ms", java.lang.System.currentTimeMillis());
            intent.putExtra("extra_enter_scene", 6);
            intent.putExtra("extra_show_recommend", false);
            intent.addFlags(67108864);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(appBrandLauncherFolderUI, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandLauncherFolderUI", "dealWidgetBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            appBrandLauncherFolderUI.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(appBrandLauncherFolderUI, "com/tencent/mm/plugin/appbrand/ui/AppBrandLauncherFolderUI", "dealWidgetBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            appBrandLauncherFolderUI.overridePendingTransition(com.tencent.mm.ui.uc.f211080c, com.tencent.mm.ui.uc.f211085h);
        }
        appBrandLauncherFolderUI.finish();
        return true;
    }
}
