package y6;

/* loaded from: classes13.dex */
public final class p {

    /* renamed from: e, reason: collision with root package name */
    public static final int f541135e;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f541136a;

    /* renamed from: b, reason: collision with root package name */
    public final android.app.ActivityManager f541137b;

    /* renamed from: c, reason: collision with root package name */
    public final y6.r f541138c;

    /* renamed from: d, reason: collision with root package name */
    public final float f541139d;

    static {
        f541135e = android.os.Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public p(android.content.Context context) {
        this.f541139d = f541135e;
        this.f541136a = context;
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        this.f541137b = activityManager;
        this.f541138c = new y6.q(context.getResources().getDisplayMetrics());
        if (android.os.Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.f541139d = 0.0f;
    }
}
