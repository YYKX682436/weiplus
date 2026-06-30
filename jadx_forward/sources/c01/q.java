package c01;

/* loaded from: classes11.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f118916d;

    public q(c01.u uVar, java.util.Map map) {
        this.f118916d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map map = this.f118916d;
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.ClientCheckGetExtInfo.ReportContext"), 0);
        int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.ClientCheckGetExtInfo.Basic"), 0);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.ClientCheckGetExtInfo.Cellular"), 0) == 1;
        w04.l lVar = w04.l.INSTANCE;
        if (P2 != 0) {
            lVar.ab(P, 0, z17);
        } else {
            lVar.ab(P, 1008, z17);
        }
    }
}
