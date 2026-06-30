package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public abstract class p2 {
    public static /* synthetic */ void a(p3325xe03a0797.p3326xc267989b.r2 r2Var, java.util.concurrent.CancellationException cancellationException, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
        if ((i17 & 1) != 0) {
            cancellationException = null;
        }
        r2Var.b(cancellationException);
    }

    public static /* synthetic */ p3325xe03a0797.p3326xc267989b.s1 b(p3325xe03a0797.p3326xc267989b.r2 r2Var, boolean z17, boolean z18, yz5.l lVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            z18 = true;
        }
        return r2Var.z(z17, z18, lVar);
    }
}
