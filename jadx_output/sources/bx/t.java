package bx;

/* loaded from: classes7.dex */
public interface t {
    static void bi(bx.t tVar, bx.s strategy, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestPreLayoutWhenExpose");
        }
        if ((i17 & 1) != 0) {
            strategy = bx.s.f36228d;
        }
        cx.j1 j1Var = (cx.j1) tVar;
        j1Var.getClass();
        kotlin.jvm.internal.o.g(strategy, "strategy");
        if (j1Var.oj()) {
            ((ku5.t0) ku5.t0.f312615d).k(new cx.i1(j1Var, strategy), 1500L);
        }
    }

    void K6(int i17);
}
