package j20;

/* loaded from: classes9.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f378767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j20.o f378768e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f378769f;

    public n(yz5.l lVar, j20.o oVar, int i17) {
        this.f378767d = lVar;
        this.f378768e = oVar;
        this.f378769f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        java.lang.Thread.currentThread().getName();
        yz5.l lVar = this.f378767d;
        java.util.Objects.toString(lVar);
        j20.o oVar = this.f378768e;
        if (lVar != null) {
            int i17 = this.f378769f;
            j20.g gVar = new j20.g(oVar, i17, lVar);
            j20.o.wi(oVar).add(gVar);
            ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
            i11.h.e().k(gVar, true);
            if (i17 > 0) {
                gVar.f378758e = new j20.f(oVar, gVar);
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) oVar.f378771e).mo141623x754a37bb()).mo50297x7c4d7ca2(gVar.f378758e, i17 * 1000);
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
            i11.h.e().k((j20.j) ((jz5.n) oVar.f378775i).mo141623x754a37bb(), true);
        }
    }
}
