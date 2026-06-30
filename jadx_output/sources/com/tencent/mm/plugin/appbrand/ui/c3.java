package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class c3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI f89621d;

    public c3(com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI) {
        this.f89621d = appBrandDebugUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.appbrand.app.g2.f75089d.Ni("AppBrandDebugUI");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI = this.f89621d;
        intent.putExtra("Intro_Need_Clear_Top ", true);
        intent.addFlags(67108864);
        intent.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        intent.addFlags(268435456);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.util.ArrayList arrayList = com.tencent.mm.ui.LauncherUI.f196826y;
        intent.setClass(context, com.tencent.mm.ui.LauncherUI.class);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(appBrandDebugUI, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandDebugUI$onPostCreate$58$1$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        appBrandDebugUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(appBrandDebugUI, "com/tencent/mm/plugin/appbrand/ui/AppBrandDebugUI$onPostCreate$58$1$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        android.content.Context applicationContext = com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext();
        kotlin.jvm.internal.o.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) applicationContext).registerActivityLifecycleCallbacks(new com.tencent.mm.plugin.appbrand.ui.b3());
        this.f89621d.finish();
    }
}
