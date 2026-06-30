package bz3;

/* loaded from: classes3.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final bz3.a f36767d = new bz3.a();

    public a() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int nj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.scan.RepairerConfigScanGoodsFilterCodeFrame());
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanClientConfigManager", "scanConfig enableFilterCode: " + nj6);
        return java.lang.Boolean.valueOf(nj6 == 1);
    }
}
