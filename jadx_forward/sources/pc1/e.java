package pc1;

/* loaded from: classes7.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f434881a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static android.content.BroadcastReceiver f434882b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f434883c;

    public static void a(java.lang.String str) {
        java.util.Map map = f434881a;
        ((java.util.concurrent.ConcurrentHashMap) map).remove(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BeaconManager", "remove Beacon appid:%s", str);
        if (((java.util.concurrent.ConcurrentHashMap) map).size() != 0 || f434882b == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BeaconManager", "bluetoothStateListener uninit");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(f434882b);
        f434882b = null;
    }
}
