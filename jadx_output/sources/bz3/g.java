package bz3;

/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final bz3.g f36773d = new bz3.g();

    public g() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.scan.RepairerConfigScanProductSensorSkipStableMs()));
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanClientConfigManager", "scanConfig scanProductSensorSkipStableMs: " + valueOf.intValue());
        return valueOf;
    }
}
