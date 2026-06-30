package hi1;

/* loaded from: classes7.dex */
public class c implements hi1.l {
    @Override // hi1.l
    public void a() {
        l75.q0 q0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1167xbf20f27f.C12481xac61b4b9.f167826a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOuterWidget", "refreshGridView");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String packageName = context.getPackageName();
        hi1.o oVar = hi1.o.f363033c;
        java.util.List list = oVar.f363034a;
        android.widget.RemoteViews remoteViews = new android.widget.RemoteViews(packageName, list == null ? com.p314xaae8f345.mm.R.C30864xbddafb2a.f569650hm : hi1.n.f363032a[list.size()]);
        if (android.os.Build.VERSION.SDK_INT < 36) {
            remoteViews.setRemoteAdapter(com.p314xaae8f345.mm.R.id.pmb, new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1167xbf20f27f.p1168xd97c5e95.C12482x4e170e45.class));
        } else if (oVar.f363034a != null) {
            ii1.e eVar = new ii1.e(context);
            android.widget.RemoteViews.RemoteCollectionItems.Builder builder = new android.widget.RemoteViews.RemoteCollectionItems.Builder();
            for (int i17 = 0; i17 < oVar.f363034a.size(); i17++) {
                builder.addItem(i17, eVar.getViewAt(i17));
            }
            remoteViews.setRemoteAdapter(com.p314xaae8f345.mm.R.id.pmb, builder.build());
        }
        remoteViews.setEmptyView(com.p314xaae8f345.mm.R.id.pmb, com.p314xaae8f345.mm.R.id.pmc);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1167xbf20f27f.C12481xac61b4b9.a(remoteViews, com.p314xaae8f345.mm.R.id.pmg, "action_click_bg", 3);
        remoteViews.setPendingIntentTemplate(com.p314xaae8f345.mm.R.id.pmb, android.app.PendingIntent.getActivity(context, 0, new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1167xbf20f27f.p1169x5c30872.ActivityC12483x2252399d.class), fp.g0.b(134217728)));
        android.appwidget.AppWidgetManager appWidgetManager = android.appwidget.AppWidgetManager.getInstance(context);
        appWidgetManager.updateAppWidget(appWidgetManager.getAppWidgetIds(new android.content.ComponentName(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1167xbf20f27f.C12481xac61b4b9.class)), remoteViews);
    }
}
