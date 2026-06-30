package zx5;

/* loaded from: classes13.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f558775d;

    public g0(int i17) {
        this.f558775d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        zx5.c cVar = com.p314xaae8f345.p3210x3857dc.b3.f301748c;
        if (cVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.gc gcVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.gc) cVar;
            if (gcVar.f171276a) {
                int i17 = this.f558775d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "onDownloadProgress, percent = %d", java.lang.Integer.valueOf(i17));
                if (gcVar.f171277b.f171026e != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.fc(gcVar, i17));
                }
            }
        }
    }
}
