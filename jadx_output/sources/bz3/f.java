package bz3;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final bz3.f f36772d = new bz3.f();

    public f() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Float valueOf = java.lang.Float.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).hj(new com.tencent.mm.repairer.config.scan.RepairerConfigScanProductRotationThreshold()));
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanClientConfigManager", "scanConfig scanProductRotateThreshold: " + valueOf.floatValue());
        return valueOf;
    }
}
