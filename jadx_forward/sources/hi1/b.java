package hi1;

/* loaded from: classes7.dex */
public class b implements l75.q0 {
    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.appwidget.AppWidgetManager appWidgetManager = android.appwidget.AppWidgetManager.getInstance(context);
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1167xbf20f27f.C12481xac61b4b9.c(context, appWidgetManager, appWidgetManager.getAppWidgetIds(new android.content.ComponentName(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1167xbf20f27f.C12481xac61b4b9.class)));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1167xbf20f27f.C12481xac61b4b9.d(new hi1.a(this, appWidgetManager, context));
        }
    }
}
