package vm0;

/* loaded from: classes13.dex */
public class b implements ft5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f519511a;

    public b(com.p314xaae8f345.mm.lib.p816xf7b9944f.ServiceC10821xba748486 serviceC10821xba748486, android.os.Bundle bundle) {
        this.f519511a = bundle;
    }

    public void a(int i17, byte[] bArr) {
        java.lang.ThreadLocal threadLocal = vm0.a.f519510a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RiskScannerReportService", "Report scan result, %d", java.lang.Integer.valueOf(i17));
        if (i17 == -10) {
            jx3.f.INSTANCE.mo68477x336bdfd8(590L, 2L, 1L, true);
        } else if (i17 != 0) {
            jx3.f.INSTANCE.mo68477x336bdfd8(590L, 3L, 1L, true);
        } else {
            java.lang.Long l17 = (java.lang.Long) vm0.a.f519510a.get();
            if (l17 != null) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - l17.longValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RiskScannerReportService", "Scan cost: %d ms", java.lang.Long.valueOf(elapsedRealtime));
                jx3.f.INSTANCE.m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1.f34581x366c91de, 5, 1, (int) elapsedRealtime, true);
            } else {
                jx3.f.INSTANCE.mo68477x336bdfd8(590L, 1L, 1L, true);
            }
        }
        if (i17 != 0 || bArr == null) {
            return;
        }
        android.os.Bundle bundle = this.f519511a;
        bundle.putInt("errCode", i17);
        bundle.putByteArray("reqBufferBase64", bArr);
    }
}
