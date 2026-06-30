package bv1;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public long f24711a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f24712b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24713c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.BatteryManager f24714d;

    public b() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("batterymanager");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
        this.f24714d = (android.os.BatteryManager) systemService;
        this.f24711a = 0L;
        this.f24712b = new com.tencent.mm.sdk.platformtools.n3("ScreenCast_batteryCounter");
    }

    public final void a() {
        this.f24713c = true;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f24712b;
        if ((n3Var != null && n3Var.isQuit()) || !this.f24713c) {
            this.f24711a = 0L;
            this.f24712b = new com.tencent.mm.sdk.platformtools.n3("ScreenCast_batteryCounter");
            a();
        } else {
            com.tencent.mm.sdk.platformtools.n3 n3Var2 = this.f24712b;
            if (n3Var2 != null) {
                n3Var2.postDelayed(new bv1.a(this), 1000L);
            }
        }
    }
}
