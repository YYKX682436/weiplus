package rh0;

/* loaded from: classes14.dex */
public interface d0 {
    static /* synthetic */ void a(rh0.d0 d0Var, java.lang.String str, float f17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeFilter");
        }
        if ((i17 & 2) != 0) {
            f17 = 1.0f;
        }
        ((p05.l4) d0Var).g(str, f17);
    }

    static /* synthetic */ void b(rh0.d0 d0Var, int i17, boolean z17, int i18, boolean z18, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: faceTrack");
        }
        if ((i19 & 2) != 0) {
            z17 = false;
        }
        if ((i19 & 4) != 0) {
            i18 = 0;
        }
        if ((i19 & 8) != 0) {
            z18 = false;
        }
        ((p05.l4) d0Var).q(i17, z17, i18, z18);
    }

    static /* synthetic */ int c(rh0.d0 d0Var, int i17, int i18, long j17, int i19, boolean z17, boolean z18, boolean z19, int i27, java.lang.Object obj) {
        if (obj == null) {
            return ((p05.l4) d0Var).w(i17, i18, (i27 & 4) != 0 ? 0L : j17, (i27 & 8) != 0 ? 0 : i19, (i27 & 16) != 0 ? false : z17, (i27 & 32) != 0 ? true : z18, (i27 & 64) != 0 ? false : z19);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: render");
    }
}
