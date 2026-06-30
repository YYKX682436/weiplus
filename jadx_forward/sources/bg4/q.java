package bg4;

/* loaded from: classes13.dex */
public class q extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public q() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        zf4.q c17;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5937x8a9a0535) abstractC20979x809547d1).f136241g.f89932a.Q0(), (int) r7.m124847x74d37ac6());
        if (Li.m124847x74d37ac6() != 0 && Li.z0() != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Li.z0()) && (c17 = zf4.r.c(Li.z0())) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f68507xf1f75bac)) {
            c17.f68517x10a0fed7 = 3;
            c17.f68514x90a9378 = 0;
            c17.f68506xad24a2e = java.lang.System.currentTimeMillis() / 1000;
            c17.f68510x8de42782 = java.lang.System.currentTimeMillis() / 1000;
            c17.U = 16840;
            zf4.r.f(c17);
            if (c17.f68512x36ef078a == 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f68519x22628ff0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceRemindLogic", " failed msg id:" + c17.f68512x36ef078a + " user:" + c17.f68519x22628ff0);
            } else {
                Li.r1(1);
                ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(Li.m124847x74d37ac6(), Li, true);
                zf4.l.Ai().c();
            }
        }
        return false;
    }
}
