package kw3;

/* loaded from: classes9.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kw3.p f394665e;

    public n(kw3.p pVar, java.lang.String str) {
        this.f394665e = pVar;
        this.f394664d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        kw3.p pVar = this.f394665e;
        java.lang.String str = this.f394664d;
        boolean Ri = pVar.Ri(str);
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(str);
        if (p17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "update red flag: %s, %s", str, java.lang.Boolean.valueOf(Ri));
            p17.U1(Ri ? 1 : 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "update ret: %s", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().Y(p17, str, false, true)));
        }
    }
}
