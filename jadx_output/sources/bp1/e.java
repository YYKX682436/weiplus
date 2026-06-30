package bp1;

/* loaded from: classes11.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final bp1.d f23040a = new bp1.d(null);

    /* renamed from: b, reason: collision with root package name */
    public static final bp1.f[] f23041b;

    /* renamed from: c, reason: collision with root package name */
    public static final bp1.f[] f23042c;

    static {
        int i17 = android.os.Build.VERSION.SDK_INT;
        f23041b = i17 >= 33 ? new bp1.f[]{new bp1.f("android.permission.NEARBY_WIFI_DEVICES", null)} : new bp1.f[]{new bp1.f("android.permission.ACCESS_FINE_LOCATION", com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.p2h))};
        f23042c = i17 >= 31 ? new bp1.f[]{new bp1.f("android.permission.BLUETOOTH_SCAN", com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.nk6)), new bp1.f("android.permission.BLUETOOTH_CONNECT", null), new bp1.f("android.permission.BLUETOOTH_ADVERTISE", null), new bp1.f("android.permission.BLUETOOTH_CONNECT", null), new bp1.f("android.permission.ACCESS_FINE_LOCATION", com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.p2h))} : new bp1.f[]{new bp1.f("android.permission.ACCESS_FINE_LOCATION", com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.p2h))};
    }
}
