package lt0;

/* loaded from: classes14.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static final lt0.a f402695c = new lt0.a();

    /* renamed from: a, reason: collision with root package name */
    public int f402696a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f402697b = "default";

    public a() {
        this.f402696a = 10485760;
        int largeMemoryClass = ((android.app.ActivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getLargeMemoryClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CacheInvoke", "BitmapPool %dMB", java.lang.Integer.valueOf(largeMemoryClass));
        if (largeMemoryClass >= 512) {
            this.f402696a = 62914560;
        } else if (largeMemoryClass >= 256) {
            this.f402696a = 31457280;
        } else {
            this.f402696a = 15728640;
        }
    }

    /* renamed from: equals */
    public boolean m146309xb2c87fbf(java.lang.Object obj) {
        return obj instanceof lt0.a ? this.f402697b.equals(((lt0.a) obj).f402697b) : super.equals(obj);
    }
}
