package com.tencent.mm.plugin.appbrand.outerwidget.entry;

/* loaded from: classes7.dex */
public class WidgetEntryActivity extends com.tencent.mm.ui.MMActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        char c17;
        java.util.List xi6;
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandOuterWidget", "intent is null");
            finish();
            return;
        }
        if (!gm0.j1.a()) {
            com.tencent.mm.plugin.appbrand.outerwidget.AppBrandOuterWidget.b();
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
                    j45.l.u(com.tencent.mm.sdk.platformtools.x2.f193071a, "com.tencent.mm.ui.LauncherUI", intent2, null);
                    break;
                case 1:
                    com.tencent.mm.plugin.appbrand.app.q0.f75227a.a().putBoolean("check_authorization_key", true);
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    android.appwidget.AppWidgetManager appWidgetManager = android.appwidget.AppWidgetManager.getInstance(context);
                    com.tencent.mm.plugin.appbrand.outerwidget.AppBrandOuterWidget.c(com.tencent.mm.sdk.platformtools.x2.f193071a, appWidgetManager, appWidgetManager.getAppWidgetIds(new android.content.ComponentName(context, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.outerwidget.AppBrandOuterWidget.class)));
                    break;
                case 2:
                    ((ku5.t0) ku5.t0.f312615d).g(new ji1.a(bVar, intent));
                    break;
                case 3:
                    android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    android.content.Intent intent3 = new android.content.Intent(context2, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherFolderUI.class);
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
            com.tencent.mm.plugin.appbrand.appusage.z5 z5Var = (com.tencent.mm.plugin.appbrand.appusage.z5) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.z5.class);
            if (z5Var != null && (xi6 = z5Var.xi(Integer.MAX_VALUE, com.tencent.mm.plugin.appbrand.appusage.y5.DESC)) != null) {
                i17 = xi6.size();
            }
            l75.q0 q0Var = com.tencent.mm.plugin.appbrand.outerwidget.AppBrandOuterWidget.f86293a;
            com.tencent.mm.autogen.mmdata.rpt.AppBrandWidgetReportStruct appBrandWidgetReportStruct = new com.tencent.mm.autogen.mmdata.rpt.AppBrandWidgetReportStruct();
            appBrandWidgetReportStruct.f55264d = 1001L;
            appBrandWidgetReportStruct.f55265e = 2;
            appBrandWidgetReportStruct.f55266f = i17;
            appBrandWidgetReportStruct.k();
        }
        finish();
    }
}
