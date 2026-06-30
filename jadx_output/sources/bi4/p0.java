package bi4;

/* loaded from: classes11.dex */
public interface p0 extends bi4.s0 {
    static /* synthetic */ void U2(bi4.p0 p0Var, java.lang.String str, mj4.h hVar, pj4.u0 u0Var, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }
        if ((i17 & 4) != 0) {
            u0Var = new pj4.u0();
        }
        p0Var.m(str, hVar, u0Var);
    }

    void m(java.lang.String str, mj4.h hVar, pj4.u0 u0Var);
}
