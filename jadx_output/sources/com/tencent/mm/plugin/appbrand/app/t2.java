package com.tencent.mm.plugin.appbrand.app;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.PluginAppBrand.class})
/* loaded from: classes7.dex */
public final class t2 extends i95.w implements com.tencent.mm.plugin.appbrand.service.k6 {
    public void Ai(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, com.tencent.mm.plugin.appbrand.service.j6 j6Var) {
        if (!(str2 == null || str2.length() == 0)) {
            str = str2;
        }
        if (!(str == null || str.length() == 0)) {
            ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Di(str, new com.tencent.mm.plugin.appbrand.app.w0(str, j6Var, i17, str3, context));
        } else if (j6Var != null) {
            j6Var.onResult(-1, "Invalid username");
        }
    }

    public boolean Bi() {
        if (((com.tencent.mm.plugin.appbrand.debugger.j0) i95.n0.c(com.tencent.mm.plugin.appbrand.debugger.j0.class)) == null) {
            return false;
        }
        return com.tencent.mm.plugin.appbrand.ui.e4.g();
    }

    public void wi(android.content.Context context, int i17, boolean z17) {
        if (!z17) {
            z17 = ek1.a.c();
        }
        android.content.Context context2 = context == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : context;
        android.content.Intent intent = new android.content.Intent(context2, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.class);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.content.Intent addFlags = intent.putExtra("extra_start_activity_click_timestamp_ms", java.lang.System.currentTimeMillis()).putExtra("extra_enter_scene", i17).putExtra("extra_show_recommend", z17).addFlags(context instanceof android.app.Activity ? 0 : 268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(addFlags);
        java.util.Collections.reverse(arrayList);
        android.content.Context context3 = context2;
        yj0.a.d(context3, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/app/ExportUILauncher", "openLauncherUI", "(Landroid/content/Context;IZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context3, "com/tencent/mm/plugin/appbrand/app/ExportUILauncher", "openLauncherUI", "(Landroid/content/Context;IZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
