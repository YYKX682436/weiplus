package com.tencent.mm.plugin.appbrand.outerwidget;

/* loaded from: classes7.dex */
public class AppBrandOuterWidget extends android.appwidget.AppWidgetProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final l75.q0 f86293a = new hi1.b();

    public static void a(android.widget.RemoteViews remoteViews, int i17, java.lang.String str, int i18) {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.outerwidget.entry.WidgetEntryActivity.class);
        intent.putExtra("extra_action", str);
        intent.addFlags(67108864);
        remoteViews.setOnClickPendingIntent(i17, android.app.PendingIntent.getActivity(context, i18, intent, fp.g0.a(134217728)));
    }

    public static void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOuterWidget", "onLogout");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.appwidget.AppWidgetManager appWidgetManager = android.appwidget.AppWidgetManager.getInstance(context);
        android.widget.RemoteViews remoteViews = new android.widget.RemoteViews(context.getPackageName(), com.tencent.mm.R.layout.f488121hq);
        remoteViews.setTextViewText(com.tencent.mm.R.id.pm7, com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.a3a));
        remoteViews.setTextViewText(com.tencent.mm.R.id.pm6, com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.a3_));
        a(remoteViews, com.tencent.mm.R.id.pm6, "action_go_to_login", 4);
        appWidgetManager.updateAppWidget(appWidgetManager.getAppWidgetIds(new android.content.ComponentName(context, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.outerwidget.AppBrandOuterWidget.class)), remoteViews);
        com.tencent.mm.plugin.appbrand.appusage.w2 w2Var = (com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class);
        if (w2Var != null) {
            w2Var.remove(f86293a);
        }
    }

    public static void c(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int[] iArr) {
        for (int i17 : iArr) {
            if (!gm0.j1.a()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOuterWidget", "refreshLayout, login");
                android.widget.RemoteViews remoteViews = new android.widget.RemoteViews(context.getPackageName(), com.tencent.mm.R.layout.f488121hq);
                remoteViews.setTextViewText(com.tencent.mm.R.id.pm7, com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.a3a));
                remoteViews.setTextViewText(com.tencent.mm.R.id.pm6, com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.a3_));
                a(remoteViews, com.tencent.mm.R.id.pm6, "action_go_to_login", 1);
                appWidgetManager.updateAppWidget(i17, remoteViews);
            } else if (com.tencent.mm.plugin.appbrand.app.q0.f75227a.a().getBoolean("check_authorization_key", false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOuterWidget", "refreshLayout, items");
                d(new hi1.c());
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOuterWidget", "refreshLayout, authorize");
                android.widget.RemoteViews remoteViews2 = new android.widget.RemoteViews(context.getPackageName(), com.tencent.mm.R.layout.f488121hq);
                remoteViews2.setTextViewText(com.tencent.mm.R.id.pm7, com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.a39));
                remoteViews2.setTextViewText(com.tencent.mm.R.id.pm6, com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.a38));
                a(remoteViews2, com.tencent.mm.R.id.pm6, "action_authorize", 2);
                appWidgetManager.updateAppWidget(i17, remoteViews2);
            }
        }
    }

    public static void d(hi1.l lVar) {
        java.lang.String str;
        hi1.o oVar = hi1.o.f281500c;
        com.tencent.mm.plugin.appbrand.appusage.z5 z5Var = (com.tencent.mm.plugin.appbrand.appusage.z5) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.z5.class);
        if (z5Var != null) {
            java.util.List xi6 = z5Var.xi(Integer.MAX_VALUE, com.tencent.mm.plugin.appbrand.appusage.y5.DESC);
            ki1.b bVar = (ki1.b) com.tencent.mm.plugin.appbrand.app.r9.fj(ki1.b.class);
            if (xi6 == null || bVar == null) {
                oVar.f281501a = null;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                bVar.y0();
                for (int i17 = 0; i17 < xi6.size() && i17 < 4; i17++) {
                    com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = (com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) xi6.get(i17);
                    byte[] bytes = (localUsageInfo.f76361d + "," + gm0.j1.b().h() + "," + localUsageInfo.f76362e).getBytes();
                    try {
                        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
                        messageDigest.update(bytes);
                        str = java.lang.String.format("%064x", new java.math.BigInteger(1, messageDigest.digest()));
                    } catch (java.security.NoSuchAlgorithmException unused) {
                        str = "";
                    }
                    java.lang.String str2 = str;
                    java.lang.String str3 = localUsageInfo.f76361d;
                    java.lang.String str4 = localUsageInfo.f76362e;
                    int i18 = localUsageInfo.f76363f;
                    int i19 = localUsageInfo.f76364g;
                    java.lang.String str5 = localUsageInfo.f76365h;
                    java.lang.String str6 = localUsageInfo.f76368n;
                    hi1.m mVar = new hi1.m(str2, str3, str4, i18, i19, str5, str6);
                    ki1.b bVar2 = (ki1.b) com.tencent.mm.plugin.appbrand.app.r9.fj(ki1.b.class);
                    if (bVar2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        ki1.a aVar = new ki1.a();
                        aVar.field_token = str2;
                        boolean z17 = bVar2.get(aVar, new java.lang.String[0]);
                        aVar.field_username = str3;
                        aVar.field_appid = str4;
                        aVar.field_appVersion = i19;
                        aVar.field_versionType = i18;
                        aVar.field_iconUrl = str6;
                        aVar.field_nickname = str5;
                        if (z17) {
                            bVar2.update(aVar, new java.lang.String[0]);
                        } else {
                            bVar2.insert(aVar);
                        }
                    }
                    arrayList.add(mVar);
                }
                oVar.f281501a = arrayList;
            }
        }
        java.util.List list = oVar.f281501a;
        if (list == null || list.size() == 0) {
            lVar.a();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOuterWidget", "updateAppInfo, size:%d", java.lang.Integer.valueOf(oVar.f281501a.size()));
        int size = oVar.f281501a.size();
        android.graphics.Bitmap[] bitmapArr = new android.graphics.Bitmap[size];
        for (int i27 = 0; i27 < size; i27++) {
            l01.d0.f314761a.m(new hi1.d(bitmapArr, i27, lVar), ((hi1.m) oVar.f281501a.get(i27)).f281498c, rp1.a.f398352d);
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDisabled(android.content.Context context) {
        java.util.List xi6;
        super.onDisabled(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOuterWidget", "onDisabled");
        com.tencent.mm.plugin.appbrand.appusage.w2 w2Var = (com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class);
        if (w2Var != null) {
            w2Var.remove(f86293a);
        }
        com.tencent.mm.plugin.appbrand.appusage.z5 z5Var = (com.tencent.mm.plugin.appbrand.appusage.z5) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.z5.class);
        int size = (z5Var == null || (xi6 = z5Var.xi(Integer.MAX_VALUE, com.tencent.mm.plugin.appbrand.appusage.y5.DESC)) == null) ? -1 : xi6.size();
        com.tencent.mm.autogen.mmdata.rpt.AppBrandWidgetReportStruct appBrandWidgetReportStruct = new com.tencent.mm.autogen.mmdata.rpt.AppBrandWidgetReportStruct();
        appBrandWidgetReportStruct.f55264d = 1001L;
        appBrandWidgetReportStruct.f55265e = 3;
        appBrandWidgetReportStruct.f55266f = size;
        appBrandWidgetReportStruct.k();
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onEnabled(android.content.Context context) {
        java.util.List xi6;
        super.onEnabled(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOuterWidget", "onEnabled");
        com.tencent.mm.plugin.appbrand.appusage.w2 w2Var = (com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class);
        if (w2Var != null) {
            w2Var.add(xu5.b.a("AppBrandWidgetUpdateCollectionList"), f86293a);
        }
        com.tencent.mm.plugin.appbrand.appusage.z5 z5Var = (com.tencent.mm.plugin.appbrand.appusage.z5) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.z5.class);
        int size = (z5Var == null || (xi6 = z5Var.xi(Integer.MAX_VALUE, com.tencent.mm.plugin.appbrand.appusage.y5.DESC)) == null) ? -1 : xi6.size();
        com.tencent.mm.autogen.mmdata.rpt.AppBrandWidgetReportStruct appBrandWidgetReportStruct = new com.tencent.mm.autogen.mmdata.rpt.AppBrandWidgetReportStruct();
        appBrandWidgetReportStruct.f55264d = 1001L;
        appBrandWidgetReportStruct.f55265e = 1;
        appBrandWidgetReportStruct.f55266f = size;
        appBrandWidgetReportStruct.k();
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        super.onReceive(context, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOuterWidget", "onReceive action: %s", intent.getAction());
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onRestored(android.content.Context context, int[] iArr, int[] iArr2) {
        super.onRestored(context, iArr, iArr2);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOuterWidget", "onRestored");
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOuterWidget", "onUpdate");
        c(context, appWidgetManager, iArr);
    }
}
