package c50;

/* loaded from: classes3.dex */
public interface m0 {
    static /* synthetic */ void a(c50.m0 m0Var, com.tencent.mm.protocal.protobuf.FinderObject finderObject, android.view.View view, yz5.a aVar, yz5.a aVar2, yz5.p pVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: playFinderLive");
        }
        ((gp2.l0) m0Var).F(finderObject, view, (i17 & 4) != 0 ? null : aVar, (i17 & 8) != 0 ? null : aVar2, (i17 & 16) != 0 ? null : pVar, (i17 & 32) != 0 ? false : z17);
    }

    static void b(c50.m0 m0Var, yz5.q qVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearAndStopPlayer");
        }
        if ((i17 & 1) != 0) {
            qVar = null;
        }
        gp2.l0 l0Var = (gp2.l0) m0Var;
        l0Var.m();
        l0Var.M(qVar);
    }

    static /* synthetic */ void c(c50.m0 m0Var, yz5.q qVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopCurrentView");
        }
        if ((i17 & 1) != 0) {
            qVar = null;
        }
        ((gp2.l0) m0Var).M(qVar);
    }
}
