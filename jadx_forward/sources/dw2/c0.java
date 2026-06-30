package dw2;

/* loaded from: classes2.dex */
public interface c0 {
    static /* synthetic */ void h(dw2.c0 c0Var, java.lang.String str, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
        }
        if ((i17 & 4) != 0) {
            z18 = false;
        }
        c0Var.y(str, z17, z18);
    }

    void X(boolean z17);

    void s();

    void w0(java.lang.String str);

    void y(java.lang.String str, boolean z17, boolean z18);
}
