package i53;

/* loaded from: classes8.dex */
public class b3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f370058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i53.d3 f370059e;

    public b3(i53.d3 d3Var, java.lang.String str) {
        this.f370059e = d3Var;
        this.f370058d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        int i18;
        java.util.HashMap hashMap = new java.util.HashMap();
        i53.u z07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).wi().z0(this.f370058d);
        i53.d3 d3Var = this.f370059e;
        if (z07 != null) {
            hashMap.put("type", java.lang.Integer.valueOf(i53.d3.a(d3Var, z07.f67107x1a330c39)));
            if (i53.d3.a(d3Var, z07.f67107x1a330c39) == 2) {
                hashMap.put("videoid", com.p314xaae8f345.mm.vfs.w6.p(z07.f67101xf1e9b966));
            }
        }
        i53.x D0 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ai().D0(d3Var.f370080a);
        if (D0 != null) {
            hashMap.put("pushid", D0.f67215x11522065);
            i17 = D0.f67212xf10bdf85;
            i18 = D0.f67214xf10c4fa7;
        } else {
            i17 = 0;
            i18 = 0;
        }
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 87, 8764, 0, 20, i18, lj0.a.a(i17, hashMap));
    }
}
