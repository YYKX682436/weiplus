package hi1;

/* loaded from: classes7.dex */
public class a implements hi1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.appwidget.AppWidgetManager f363017a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f363018b;

    public a(hi1.b bVar, android.appwidget.AppWidgetManager appWidgetManager, android.content.Context context) {
        this.f363017a = appWidgetManager;
        this.f363018b = context;
    }

    @Override // hi1.l
    public void a() {
        android.content.ComponentName componentName = new android.content.ComponentName(this.f363018b, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1167xbf20f27f.C12481xac61b4b9.class);
        android.appwidget.AppWidgetManager appWidgetManager = this.f363017a;
        appWidgetManager.notifyAppWidgetViewDataChanged(appWidgetManager.getAppWidgetIds(componentName), com.p314xaae8f345.mm.R.id.pmb);
    }
}
