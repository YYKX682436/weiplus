package co0;

/* loaded from: classes3.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final co0.q f43731d = new co0.q();

    public q() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        if (intValue <= 5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveVisitorPerformanceIDKeyStat", "markVisitorLinkVideoRendererFpsLow");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1383L, 30L, 1L);
        } else if (intValue <= 10) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveVisitorPerformanceIDKeyStat", "markVisitorLinkVideoRendererFpsMiddle");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1383L, 31L, 1L);
        } else if (intValue > 10) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveVisitorPerformanceIDKeyStat", "markVisitorLinkVideoRendererFpsHigh");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1383L, 32L, 1L);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveVisitorPerformanceIDKeyStat", "markVisitorLinkVideoRendererFps is " + intValue);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.m(1383, 27, 28, intValue, false);
        return jz5.f0.f302826a;
    }
}
