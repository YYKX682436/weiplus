package p012xc85e97e9.p096x62f6fe4.p097x76508296;

/* renamed from: androidx.media.session.MediaButtonReceiver */
/* loaded from: classes11.dex */
public class C1135x23358825 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f93241a = 0;

    public static android.content.ComponentName a(android.content.Context context, java.lang.String str) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        android.content.Intent intent = new android.content.Intent(str);
        intent.setPackage(context.getPackageName());
        java.util.List<android.content.pm.ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            android.content.pm.ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new android.content.ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (queryIntentServices.isEmpty()) {
            return null;
        }
        throw new java.lang.IllegalStateException("Expected 1 service that handles " + str + ", found " + queryIntentServices.size());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            java.util.Objects.toString(intent);
            return;
        }
        android.content.ComponentName a17 = a(context, "android.intent.action.MEDIA_BUTTON");
        if (a17 != null) {
            intent.setComponent(a17);
            b3.l.m9723x47fd1fb0(context, intent);
            return;
        }
        android.content.ComponentName a18 = a(context, "android.media.browse.MediaBrowserService");
        if (a18 == null) {
            throw new java.lang.IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        android.content.BroadcastReceiver.PendingResult goAsync = goAsync();
        android.content.Context applicationContext = context.getApplicationContext();
        e4.a aVar = new e4.a(applicationContext, intent, goAsync);
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.m mVar = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.m(applicationContext, a18, aVar, null);
        aVar.f329134f = mVar;
        ((p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.g) mVar.f90470a).f90460b.connect();
    }
}
