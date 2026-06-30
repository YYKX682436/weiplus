package bp1;

/* loaded from: classes11.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final bp1.d f104573a = new bp1.d(null);

    /* renamed from: b, reason: collision with root package name */
    public static final bp1.f[] f104574b;

    /* renamed from: c, reason: collision with root package name */
    public static final bp1.f[] f104575c;

    static {
        int i17 = android.os.Build.VERSION.SDK_INT;
        f104574b = i17 >= 33 ? new bp1.f[]{new bp1.f("android.permission.NEARBY_WIFI_DEVICES", null)} : new bp1.f[]{new bp1.f("android.permission.ACCESS_FINE_LOCATION", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.p2h))};
        f104575c = i17 >= 31 ? new bp1.f[]{new bp1.f("android.permission.BLUETOOTH_SCAN", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.nk6)), new bp1.f("android.permission.BLUETOOTH_CONNECT", null), new bp1.f("android.permission.BLUETOOTH_ADVERTISE", null), new bp1.f("android.permission.BLUETOOTH_CONNECT", null), new bp1.f("android.permission.ACCESS_FINE_LOCATION", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.p2h))} : new bp1.f[]{new bp1.f("android.permission.ACCESS_FINE_LOCATION", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.p2h))};
    }
}
