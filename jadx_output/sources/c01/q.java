package c01;

/* loaded from: classes11.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f37383d;

    public q(c01.u uVar, java.util.Map map) {
        this.f37383d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map map = this.f37383d;
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.ClientCheckGetExtInfo.ReportContext"), 0);
        int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.ClientCheckGetExtInfo.Basic"), 0);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.ClientCheckGetExtInfo.Cellular"), 0) == 1;
        w04.l lVar = w04.l.INSTANCE;
        if (P2 != 0) {
            lVar.ab(P, 0, z17);
        } else {
            lVar.ab(P, 1008, z17);
        }
    }
}
