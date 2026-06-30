package xn2;

/* loaded from: classes2.dex */
public interface b extends fs2.c {
    static void n(xn2.b bVar, long j17, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: autoFlingToRefresh");
        }
        if ((i17 & 1) != 0) {
            j17 = 0;
        }
        xn2.f1 f1Var = (xn2.f1) bVar;
        f1Var.getClass();
        vn2.u0.f519920a.m("Finder.MegaVideoViewCallback", "autoFlingToRefresh delayStart=" + j17);
        if (j17 <= 0) {
            f1Var.j().post(new xn2.q0(f1Var));
        } else {
            f1Var.j().postDelayed(new xn2.r0(f1Var), j17);
        }
    }
}
