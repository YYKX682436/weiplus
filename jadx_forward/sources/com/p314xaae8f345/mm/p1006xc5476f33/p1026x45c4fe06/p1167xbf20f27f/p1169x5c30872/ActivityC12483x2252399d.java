package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1167xbf20f27f.p1169x5c30872;

/* renamed from: com.tencent.mm.plugin.appbrand.outerwidget.entry.WidgetEntryActivity */
/* loaded from: classes7.dex */
public class ActivityC12483x2252399d extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        char c17;
        java.util.List xi6;
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandOuterWidget", "intent is null");
            finish();
            return;
        }
        if (!gm0.j1.a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1167xbf20f27f.C12481xac61b4b9.b();
        }
        ji1.b bVar = ji1.b.INSTANCE;
        java.lang.String stringExtra = intent.getStringExtra("extra_action");
        if (stringExtra != null) {
            int i17 = -1;
            switch (stringExtra.hashCode()) {
                case -2016297581:
                    if (stringExtra.equals("action_go_to_login")) {
                        c17 = 0;
                        break;
                    }
                    c17 = 65535;
                    break;
                case -1277381344:
                    if (stringExtra.equals("action_authorize")) {
                        c17 = 1;
                        break;
                    }
                    c17 = 65535;
                    break;
                case -220619501:
                    if (stringExtra.equals("action_click_item")) {
                        c17 = 2;
                        break;
                    }
                    c17 = 65535;
                    break;
                case 1648930373:
                    if (stringExtra.equals("action_click_bg")) {
                        c17 = 3;
                        break;
                    }
                    c17 = 65535;
                    break;
                default:
                    c17 = 65535;
                    break;
            }
            switch (c17) {
                case 0:
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.addFlags(67108864);
                    j45.l.u(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "com.tencent.mm.ui.LauncherUI", intent2, null);
                    break;
                case 1:
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a().putBoolean("check_authorization_key", true);
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    android.appwidget.AppWidgetManager appWidgetManager = android.appwidget.AppWidgetManager.getInstance(context);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1167xbf20f27f.C12481xac61b4b9.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, appWidgetManager, appWidgetManager.getAppWidgetIds(new android.content.ComponentName(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1167xbf20f27f.C12481xac61b4b9.class)));
                    break;
                case 2:
                    ((ku5.t0) ku5.t0.f394148d).g(new ji1.a(bVar, intent));
                    break;
                case 3:
                    android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    android.content.Intent intent3 = new android.content.Intent(context2, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12644x463f8168.class);
                    intent3.addFlags(335544320);
                    intent3.putExtra("extra_enter_scene", 1223);
                    intent3.putExtra("KEY_MODE", 2);
                    intent3.putExtra("extra_is_from_widget", true);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent3);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/outerwidget/entry/WidgetEntryManager", "jumpToCollectionList", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context2.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context2, "com/tencent/mm/plugin/appbrand/outerwidget/entry/WidgetEntryManager", "jumpToCollectionList", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5 z5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5.class);
            if (z5Var != null && (xi6 = z5Var.xi(Integer.MAX_VALUE, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.y5.DESC)) != null) {
                i17 = xi6.size();
            }
            l75.q0 q0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1167xbf20f27f.C12481xac61b4b9.f167826a;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6322xbf867733 c6322xbf867733 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6322xbf867733();
            c6322xbf867733.f136797d = 1001L;
            c6322xbf867733.f136798e = 2;
            c6322xbf867733.f136799f = i17;
            c6322xbf867733.k();
        }
        finish();
    }
}
