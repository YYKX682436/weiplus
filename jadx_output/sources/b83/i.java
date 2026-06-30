package b83;

/* loaded from: classes11.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f18324a = new android.os.Handler(android.os.Looper.getMainLooper());

    public i(android.content.Context context, b83.h hVar, long j17) {
        java.lang.Boolean bool;
        try {
            bool = (java.lang.Boolean) android.os.PowerManager.class.getMethod("isScreenOn", new java.lang.Class[0]).invoke((android.os.PowerManager) context.getSystemService("power"), new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            bool = null;
        }
        com.tencent.mars.xlog.Log.i("Tinker.ScreenOffRetryPatch", "try post ScreenOffRetryPatch delay time: %d, screen: %b", java.lang.Long.valueOf(j17), bool);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        b83.f fVar = new b83.f(this, hVar);
        if (bool == null || bool.booleanValue()) {
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
        } else {
            com.tencent.mars.xlog.Log.i("Tinker.ScreenOffRetryPatch", "screen is just off now, we can send message directly");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            this.f18324a.postDelayed(fVar, j17);
        }
        context.registerReceiver(new b83.g(this, fVar, j17), intentFilter);
    }
}
