package sl0;

/* loaded from: classes11.dex */
public class h implements ll0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sl0.o f490659a;

    public h(sl0.o oVar) {
        this.f490659a = oVar;
    }

    @Override // ll0.b
    /* renamed from: getData */
    public java.lang.Object mo145883xfb7e5820() {
        boolean z17;
        m33.b1 a17 = m33.a1.a();
        boolean z18 = false;
        if (a17 != null) {
            z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.h0) a17).Vi(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        } else {
            z17 = false;
        }
        boolean b17 = sl0.o.b(this.f490659a, 8388608L);
        boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        if (z17 && !b17 && !mo168058x74219ae7) {
            z18 = true;
        }
        return java.lang.Boolean.valueOf(z18);
    }
}
