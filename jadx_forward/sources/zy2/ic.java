package zy2;

/* loaded from: classes3.dex */
public interface ic {
    static /* synthetic */ void a(zy2.ic icVar, r45.j32 j32Var, java.lang.String str, boolean z17, java.lang.String str2, int i17, int i18, r45.c32 c32Var, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showList");
        }
        if ((i19 & 1) != 0) {
            j32Var = null;
        }
        if ((i19 & 2) != 0) {
            str = "";
        }
        if ((i19 & 4) != 0) {
            z17 = false;
        }
        if ((i19 & 8) != 0) {
            str2 = "";
        }
        if ((i19 & 16) != 0) {
            i17 = -1;
        }
        if ((i19 & 32) != 0) {
            i18 = 0;
        }
        if ((i19 & 64) != 0) {
            c32Var = null;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4) icVar).g(j32Var, str, z17, str2, i17, i18, c32Var);
    }
}
