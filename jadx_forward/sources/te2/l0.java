package te2;

/* loaded from: classes3.dex */
public interface l0 {
    static /* synthetic */ void A0(te2.l0 l0Var, boolean z17, r45.xg7 xg7Var, yz5.l lVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadMoreData");
        }
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            xg7Var = null;
        }
        l0Var.u5(z17, xg7Var, lVar);
    }

    boolean D2(int i17, r45.xg7 xg7Var);

    void u5(boolean z17, r45.xg7 xg7Var, yz5.l lVar);
}
