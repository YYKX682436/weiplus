package yn1;

/* loaded from: classes11.dex */
public final class r2 implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.h {

    /* renamed from: f, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f545342f;

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.g f545343a;

    /* renamed from: b, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f545344b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f545345c;

    /* renamed from: d, reason: collision with root package name */
    public final yn1.d1 f545346d = new yn1.d1(this);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f545347e = jz5.h.b(new yn1.c1(this));

    static {
        new yn1.a1(null);
        f545342f = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
    }

    public r2() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MM.Mig.MigrationPlatformImpl", "Try to register network listener");
            c();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MM.Mig.MigrationPlatformImpl", "Fail to register network listener, e=" + e17);
        }
    }

    public final vn1.m a() {
        return (vn1.m) ((jz5.n) this.f545347e).mo141623x754a37bb();
    }

    public boolean b() {
        bp1.d dVar = bp1.e.f104573a;
        bp1.f[] requiredPermissions = bp1.e.f104575c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requiredPermissions, "requiredPermissions");
        for (bp1.f fVar : requiredPermissions) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.checkSelfPermission(fVar.f104576a) != 0) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        yn1.g2 g2Var = new yn1.g2(yn1.h2.f545221d);
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("connectivity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ((android.net.ConnectivityManager) systemService).registerNetworkCallback(new android.net.NetworkRequest.Builder().addTransportType(0).addTransportType(1).addTransportType(6).build(), g2Var);
    }
}
