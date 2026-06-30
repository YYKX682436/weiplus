package ad2;

/* loaded from: classes2.dex */
public interface k {
    static /* synthetic */ void a(ad2.k kVar, in5.s0 s0Var, android.view.View view, xc2.p0 p0Var, boolean z17, yz5.a aVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRealHide");
        }
        if ((i17 & 16) != 0) {
            aVar = null;
        }
        kVar.d(s0Var, view, p0Var, z17, aVar);
    }

    static /* synthetic */ void b(ad2.k kVar, in5.s0 s0Var, android.view.View view, xc2.p0 p0Var, boolean z17, yz5.a aVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRealShow");
        }
        if ((i17 & 16) != 0) {
            aVar = null;
        }
        kVar.c(s0Var, view, p0Var, z17, aVar);
    }

    void c(in5.s0 s0Var, android.view.View view, xc2.p0 p0Var, boolean z17, yz5.a aVar);

    void d(in5.s0 s0Var, android.view.View view, xc2.p0 p0Var, boolean z17, yz5.a aVar);
}
