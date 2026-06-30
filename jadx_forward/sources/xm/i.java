package xm;

/* loaded from: classes11.dex */
public class i implements xm.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xm.n f536684a;

    public i(xm.n nVar) {
        this.f536684a = nVar;
    }

    @Override // xm.b
    /* renamed from: getData */
    public java.lang.Object mo175660xfb7e5820() {
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            return java.lang.Boolean.FALSE;
        }
        int n17 = c01.z1.n();
        boolean Ai = ((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).Ai();
        xm.n nVar = this.f536684a;
        if (Ai) {
            return java.lang.Boolean.valueOf(!xm.n.b(nVar, 70368744177664L));
        }
        ((pa0.e) ((qa0.e) i95.n0.c(qa0.e.class))).getClass();
        if (m25.a.b()) {
            return java.lang.Boolean.valueOf(!xm.n.b(nVar, 70368744177664L));
        }
        boolean z17 = (n17 & 512) == 0;
        j45.l.g("nearby");
        return z17 ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
    }
}
