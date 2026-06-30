package xm;

/* loaded from: classes11.dex */
public class f implements xm.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xm.n f536682a;

    public f(xm.n nVar) {
        this.f536682a = nVar;
    }

    @Override // xm.b
    /* renamed from: getData */
    public java.lang.Object mo175660xfb7e5820() {
        boolean z17;
        m33.b1 a17 = m33.a1.a();
        boolean z18 = false;
        if (a17 != null) {
            z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.h0) a17).Vi(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        } else {
            z17 = false;
        }
        boolean b17 = xm.n.b(this.f536682a, 8388608L);
        boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        if (z17 && !b17 && !mo168058x74219ae7) {
            z18 = true;
        }
        return java.lang.Boolean.valueOf(z18);
    }
}
