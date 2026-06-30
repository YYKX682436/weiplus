package he5;

/* loaded from: classes9.dex */
public class g implements java.util.Comparator {
    public g(he5.h hVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj2;
        if (f9Var.mo78012x3fdd41df() > f9Var2.mo78012x3fdd41df()) {
            return 1;
        }
        return f9Var.mo78012x3fdd41df() < f9Var2.mo78012x3fdd41df() ? -1 : 0;
    }
}
