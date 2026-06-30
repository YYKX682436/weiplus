package q91;

/* loaded from: classes7.dex */
public final class c implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f442420d;

    public c(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, android.content.Context context) {
        this.f442420d = context;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        android.content.Context context = this.f442420d;
        if (40 == menuItem.getItemId()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.f170732h.a().q(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.c.f129163d);
            return;
        }
        if (30 == menuItem.getItemId()) {
            try {
                android.content.Context context2 = this.f442420d;
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI.class);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/debug/AppBrandDebugFeatureService$showChooseSheet$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context2, "com/tencent/mm/plugin/appbrand/debug/AppBrandDebugFeatureService$showChooseSheet$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            } catch (java.lang.ClassNotFoundException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("AppBrandLauncherUIForceEntryConfig", e17, "", new java.lang.Object[0]);
                dp.a.m125854x26a183b(context, "RELEASE包不支持调试入口", 0).show();
                return;
            }
        }
        if (20 == menuItem.getItemId()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.u1 u1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.u1.f170794a;
            l81.b1 b1Var = new l81.b1();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("AppBrandLauncherUIForceEntryConfig");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(R, "getSingleMMKV(...)");
            java.lang.String string = R.getString("KEY_FORCE_WE_USE_FAKE_NATIVE_APPID", null);
            if (string == null) {
                string = "wxb6d22f922f37b35a";
            }
            b1Var.f398547b = string;
            b1Var.f398565k = 1112;
            b1Var.f398561i = new ek1.e(1, null);
            u1Var.a(b1Var, new q91.b());
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("AppBrandLauncherUIForceEntryConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(R2, "getSingleMMKV(...)");
        R2.d();
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            R2.putBoolean("KEY_FORCE_NATIVE_LAUNCHER", true);
            return;
        }
        if (itemId == 1 || itemId == 2 || itemId == 3) {
            R2.putBoolean("KEY_FORCE_WE_USE_FAKE_NATIVE", true);
            R2.putString("KEY_FORCE_WE_USE_FAKE_NATIVE_APPID", itemId == 2 ? "wx6bd2fb149a93a9c5" : null);
            R2.putBoolean("KEY_FORCE_FAKE_NATIVE_DEBUG", itemId == 3);
        }
    }
}
