package hb3;

/* loaded from: classes9.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f361658e;

    public k(hb3.o oVar, java.lang.String str, boolean z17) {
        this.f361657d = str;
        this.f361658e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        java.lang.String str = this.f361657d;
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = Di.p(str);
        if (p17 != null && com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
            boolean z18 = p17.P0() == 1;
            boolean z19 = this.f361658e;
            if (z18 != z19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreLuckyMoney", "update red flag: %s, %s", str, java.lang.Boolean.valueOf(z19));
                p17.L1(z19 ? 1 : 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreLuckyMoney", "update ret: %s", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().Y(p17, str, true, true)));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreLuckyMoney", "finish update red flag: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }
}
