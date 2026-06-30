package zt1;

/* loaded from: classes8.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5591x5fe952d1 f557088d;

    public b(zt1.c cVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5591x5fe952d1 c5591x5fe952d1) {
        this.f557088d = c5591x5fe952d1;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (gm0.j1.a()) {
            boolean z17 = this.f557088d.f135915g.f88564a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreCard.cardGetCountListener", "GetCardCountEvent isForceGet is " + z17);
            boolean t17 = lu1.a0.t();
            boolean A = lu1.a0.A();
            if (t17 && A) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreCard.cardGetCountListener", "card entrance and share card entrance is open");
                return;
            }
            if (z17) {
                gm0.j1.n().f354821b.g(new xt1.f0());
            } else {
                java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().l(282882, null);
                if (((int) (java.lang.System.currentTimeMillis() / 1000)) - (num != null ? num.intValue() : 0) >= 7200) {
                    gm0.j1.n().f354821b.g(new xt1.f0());
                }
            }
            ((ku5.t0) ku5.t0.f394148d).h(new zt1.a(this, A, t17), "SubCoreCard-doSyncNetScene");
        }
    }
}
