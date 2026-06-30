package v26;

/* loaded from: classes14.dex */
public abstract class g0 {
    public static /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v26.h0 h0Var, oz5.l lVar, int i17, u26.u uVar, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
        if ((i18 & 1) != 0) {
            lVar = oz5.m.f431862d;
        }
        if ((i18 & 2) != 0) {
            i17 = -3;
        }
        if ((i18 & 4) != 0) {
            uVar = u26.u.SUSPEND;
        }
        return h0Var.b(lVar, i17, uVar);
    }
}
