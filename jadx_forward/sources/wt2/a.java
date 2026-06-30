package wt2;

/* loaded from: classes3.dex */
public interface a {
    static /* synthetic */ void m4(wt2.a aVar, r45.a52 a52Var, yz5.l lVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPromoInfo");
        }
        if ((i17 & 2) != 0) {
            lVar = null;
        }
        aVar.B4(a52Var, lVar);
    }

    static /* synthetic */ void x4(wt2.a aVar, r45.z42 z42Var, yz5.l lVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delPromoteInfo");
        }
        if ((i17 & 2) != 0) {
            lVar = null;
        }
        aVar.O1(z42Var, lVar);
    }

    void B4(r45.a52 a52Var, yz5.l lVar);

    void J3(android.content.Context context, r45.z42 z42Var);

    void O1(r45.z42 z42Var, yz5.l lVar);

    void V3();

    java.util.LinkedList j0();

    void m1();

    gk2.e q5();
}
