package bb2;

/* loaded from: classes2.dex */
public interface y2 extends cw2.fb {
    static /* synthetic */ void r(bb2.y2 y2Var, int i17, boolean z17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSeekTo");
        }
        if ((i18 & 2) != 0) {
            z17 = false;
        }
        y2Var.A(i17, z17);
    }

    void A(int i17, boolean z17);
}
