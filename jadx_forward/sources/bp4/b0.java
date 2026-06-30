package bp4;

/* loaded from: classes10.dex */
public interface b0 extends bp4.z {
    static /* synthetic */ void o(bp4.b0 b0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var, long j17, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onUpdate");
        }
        if ((i17 & 2) != 0) {
            j17 = -1;
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        b0Var.b(h1Var, j17, z17);
    }

    void b(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var, long j17, boolean z17);
}
