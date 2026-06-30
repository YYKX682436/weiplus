package h82;

/* loaded from: classes8.dex */
public class f extends com.p314xaae8f345.mm.p971x6de15a2e.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h82.i f361063d;

    public f(h82.i iVar) {
        this.f361063d = iVar;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s0
    /* renamed from: onNetworkChange */
    public void mo8869xde9f63df(int i17) {
        java.util.concurrent.Future future;
        h82.i iVar = this.f361063d;
        try {
            if (i17 == 0 || i17 == 3 || i17 == 2 || i17 == 5) {
                iVar.f361075d = false;
            } else {
                iVar.f361075d = true;
            }
            boolean m40093xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.offline.FavOfflineService", "onNetworkChange st:%d hasNet:%s isWifi:%B, lastIsWifi:%B", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(iVar.f361075d), java.lang.Boolean.valueOf(m40093xb9aa8b5f), java.lang.Boolean.valueOf(iVar.f361074c));
            if (!iVar.f361074c) {
                iVar.f361074c = m40093xb9aa8b5f;
                if (m40093xb9aa8b5f) {
                    iVar.e();
                    return;
                }
                return;
            }
            iVar.f361074c = m40093xb9aa8b5f;
            if (m40093xb9aa8b5f || (future = iVar.f361077f) == null) {
                return;
            }
            future.cancel(false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.offline.FavOfflineService", e17, "", new java.lang.Object[0]);
        }
    }
}
