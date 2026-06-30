package vq4;

/* loaded from: classes13.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static vq4.c f520815a;

    public static void a() {
        if (f520815a == null) {
            f520815a = new vq4.c(null);
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(f520815a, intentFilter);
    }
}
