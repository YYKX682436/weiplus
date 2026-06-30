package c.t.m.sapp.c;

/* loaded from: classes13.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f36900a = "TencentLocTag";

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.map.geolocation.sapp.internal.LocationLogCallback f36901b;

    public static void a(com.tencent.map.geolocation.sapp.internal.LocationLogCallback locationLogCallback) {
        f36901b = locationLogCallback;
    }

    public static void a(int i17, java.lang.String str, java.lang.Throwable th6) {
        com.tencent.map.geolocation.sapp.internal.LocationLogCallback locationLogCallback = f36901b;
        if (locationLogCallback != null) {
            locationLogCallback.onLog(i17, "TencentLocationComp_sapp", str, th6);
        }
    }

    public static void a(java.lang.String str) {
        a(4, str, null);
    }

    public static void a(java.lang.String str, java.lang.Throwable th6) {
        a(6, str, th6);
    }
}
