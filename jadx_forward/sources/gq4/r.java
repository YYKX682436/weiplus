package gq4;

/* loaded from: classes14.dex */
public class r implements java.lang.Runnable {
    public r(gq4.s sVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 Bi = gq4.v.Bi();
        if (Bi.f258114x.f382766b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.VoipService", "no allow to show main ui");
            Bi.G();
            return;
        }
        uq4.a aVar = Bi.f258104n;
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.VoipService", "do not need voip resume");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.VoipService", "on voip resume");
        java.lang.String str = aVar.f511762c;
        boolean z17 = aVar.f511760a;
        boolean z18 = aVar.f511761b;
        long j17 = aVar.f511763d;
        Bi.G();
        Bi.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str, j17, z17, z18, true);
    }
}
