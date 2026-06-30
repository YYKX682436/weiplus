package bv1;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public long f106244a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f106245b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f106246c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.BatteryManager f106247d;

    public b() {
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("batterymanager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
        this.f106247d = (android.os.BatteryManager) systemService;
        this.f106244a = 0L;
        this.f106245b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("ScreenCast_batteryCounter");
    }

    public final void a() {
        this.f106246c = true;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f106245b;
        if ((n3Var != null && n3Var.mo50287xb9a7fe99()) || !this.f106246c) {
            this.f106244a = 0L;
            this.f106245b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("ScreenCast_batteryCounter");
            a();
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = this.f106245b;
            if (n3Var2 != null) {
                n3Var2.mo50297x7c4d7ca2(new bv1.a(this), 1000L);
            }
        }
    }
}
