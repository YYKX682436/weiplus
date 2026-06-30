package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1167xbf20f27f;

/* renamed from: com.tencent.mm.plugin.appbrand.outerwidget.AppBrandOuterWidget */
/* loaded from: classes7.dex */
public class C12481xac61b4b9 extends android.appwidget.AppWidgetProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final l75.q0 f167826a = new hi1.b();

    public static void a(android.widget.RemoteViews remoteViews, int i17, java.lang.String str, int i18) {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1167xbf20f27f.p1169x5c30872.ActivityC12483x2252399d.class);
        intent.putExtra("extra_action", str);
        intent.addFlags(67108864);
        remoteViews.setOnClickPendingIntent(i17, android.app.PendingIntent.getActivity(context, i18, intent, fp.g0.a(134217728)));
    }

    public static void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOuterWidget", "onLogout");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.appwidget.AppWidgetManager appWidgetManager = android.appwidget.AppWidgetManager.getInstance(context);
        android.widget.RemoteViews remoteViews = new android.widget.RemoteViews(context.getPackageName(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569654hq);
        remoteViews.setTextViewText(com.p314xaae8f345.mm.R.id.pm7, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.a3a));
        remoteViews.setTextViewText(com.p314xaae8f345.mm.R.id.pm6, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.a3_));
        a(remoteViews, com.p314xaae8f345.mm.R.id.pm6, "action_go_to_login", 4);
        appWidgetManager.updateAppWidget(appWidgetManager.getAppWidgetIds(new android.content.ComponentName(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1167xbf20f27f.C12481xac61b4b9.class)), remoteViews);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2 w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2.class);
        if (w2Var != null) {
            w2Var.mo49775xc84af884(f167826a);
        }
    }

    public static void c(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int[] iArr) {
        for (int i17 : iArr) {
            if (!gm0.j1.a()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOuterWidget", "refreshLayout, login");
                android.widget.RemoteViews remoteViews = new android.widget.RemoteViews(context.getPackageName(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569654hq);
                remoteViews.setTextViewText(com.p314xaae8f345.mm.R.id.pm7, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.a3a));
                remoteViews.setTextViewText(com.p314xaae8f345.mm.R.id.pm6, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.a3_));
                a(remoteViews, com.p314xaae8f345.mm.R.id.pm6, "action_go_to_login", 1);
                appWidgetManager.updateAppWidget(i17, remoteViews);
            } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a().getBoolean("check_authorization_key", false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOuterWidget", "refreshLayout, items");
                d(new hi1.c());
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOuterWidget", "refreshLayout, authorize");
                android.widget.RemoteViews remoteViews2 = new android.widget.RemoteViews(context.getPackageName(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569654hq);
                remoteViews2.setTextViewText(com.p314xaae8f345.mm.R.id.pm7, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.a39));
                remoteViews2.setTextViewText(com.p314xaae8f345.mm.R.id.pm6, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.a38));
                a(remoteViews2, com.p314xaae8f345.mm.R.id.pm6, "action_authorize", 2);
                appWidgetManager.updateAppWidget(i17, remoteViews2);
            }
        }
    }

    public static void d(hi1.l lVar) {
        java.lang.String str;
        hi1.o oVar = hi1.o.f363033c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5 z5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5.class);
        if (z5Var != null) {
            java.util.List xi6 = z5Var.xi(Integer.MAX_VALUE, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.y5.DESC);
            ki1.b bVar = (ki1.b) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(ki1.b.class);
            if (xi6 == null || bVar == null) {
                oVar.f363034a = null;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                bVar.y0();
                for (int i17 = 0; i17 < xi6.size() && i17 < 4; i17++) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) xi6.get(i17);
                    byte[] bytes = (c11714x918fd2e4.f157894d + "," + gm0.j1.b().h() + "," + c11714x918fd2e4.f157895e).getBytes();
                    try {
                        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
                        messageDigest.update(bytes);
                        str = java.lang.String.format("%064x", new java.math.BigInteger(1, messageDigest.digest()));
                    } catch (java.security.NoSuchAlgorithmException unused) {
                        str = "";
                    }
                    java.lang.String str2 = str;
                    java.lang.String str3 = c11714x918fd2e4.f157894d;
                    java.lang.String str4 = c11714x918fd2e4.f157895e;
                    int i18 = c11714x918fd2e4.f157896f;
                    int i19 = c11714x918fd2e4.f157897g;
                    java.lang.String str5 = c11714x918fd2e4.f157898h;
                    java.lang.String str6 = c11714x918fd2e4.f157901n;
                    hi1.m mVar = new hi1.m(str2, str3, str4, i18, i19, str5, str6);
                    ki1.b bVar2 = (ki1.b) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(ki1.b.class);
                    if (bVar2 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                        ki1.a aVar = new ki1.a();
                        aVar.f65908x29df9a74 = str2;
                        boolean z17 = bVar2.get(aVar, new java.lang.String[0]);
                        aVar.f65909xdec927b = str3;
                        aVar.f65905x28d46377 = str4;
                        aVar.f65904x119cf7dc = i19;
                        aVar.f65910x94d24c6d = i18;
                        aVar.f65906xd6403ff1 = str6;
                        aVar.f65907x21f9b213 = str5;
                        if (z17) {
                            bVar2.mo9952xce0038c9(aVar, new java.lang.String[0]);
                        } else {
                            bVar2.mo880xb970c2b9(aVar);
                        }
                    }
                    arrayList.add(mVar);
                }
                oVar.f363034a = arrayList;
            }
        }
        java.util.List list = oVar.f363034a;
        if (list == null || list.size() == 0) {
            lVar.a();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOuterWidget", "updateAppInfo, size:%d", java.lang.Integer.valueOf(oVar.f363034a.size()));
        int size = oVar.f363034a.size();
        android.graphics.Bitmap[] bitmapArr = new android.graphics.Bitmap[size];
        for (int i27 = 0; i27 < size; i27++) {
            l01.d0.f396294a.m(new hi1.d(bitmapArr, i27, lVar), ((hi1.m) oVar.f363034a.get(i27)).f363031c, rp1.a.f479885d);
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDisabled(android.content.Context context) {
        java.util.List xi6;
        super.onDisabled(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOuterWidget", "onDisabled");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2 w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2.class);
        if (w2Var != null) {
            w2Var.mo49775xc84af884(f167826a);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5 z5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5.class);
        int size = (z5Var == null || (xi6 = z5Var.xi(Integer.MAX_VALUE, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.y5.DESC)) == null) ? -1 : xi6.size();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6322xbf867733 c6322xbf867733 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6322xbf867733();
        c6322xbf867733.f136797d = 1001L;
        c6322xbf867733.f136798e = 3;
        c6322xbf867733.f136799f = size;
        c6322xbf867733.k();
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onEnabled(android.content.Context context) {
        java.util.List xi6;
        super.onEnabled(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOuterWidget", "onEnabled");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2 w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2.class);
        if (w2Var != null) {
            w2Var.add(xu5.b.a("AppBrandWidgetUpdateCollectionList"), f167826a);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5 z5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5.class);
        int size = (z5Var == null || (xi6 = z5Var.xi(Integer.MAX_VALUE, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.y5.DESC)) == null) ? -1 : xi6.size();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6322xbf867733 c6322xbf867733 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6322xbf867733();
        c6322xbf867733.f136797d = 1001L;
        c6322xbf867733.f136798e = 1;
        c6322xbf867733.f136799f = size;
        c6322xbf867733.k();
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        super.onReceive(context, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOuterWidget", "onReceive action: %s", intent.getAction());
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onRestored(android.content.Context context, int[] iArr, int[] iArr2) {
        super.onRestored(context, iArr, iArr2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOuterWidget", "onRestored");
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOuterWidget", "onUpdate");
        c(context, appWidgetManager, iArr);
    }
}
