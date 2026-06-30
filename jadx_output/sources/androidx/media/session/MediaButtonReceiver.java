package androidx.media.session;

/* loaded from: classes11.dex */
public class MediaButtonReceiver extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11708a = 0;

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
            b3.l.startForegroundService(context, intent);
            return;
        }
        android.content.ComponentName a18 = a(context, "android.media.browse.MediaBrowserService");
        if (a18 == null) {
            throw new java.lang.IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        android.content.BroadcastReceiver.PendingResult goAsync = goAsync();
        android.content.Context applicationContext = context.getApplicationContext();
        e4.a aVar = new e4.a(applicationContext, intent, goAsync);
        android.support.v4.media.m mVar = new android.support.v4.media.m(applicationContext, a18, aVar, null);
        aVar.f247601f = mVar;
        ((android.support.v4.media.g) mVar.f8937a).f8927b.connect();
    }
}
