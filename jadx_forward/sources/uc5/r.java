package uc5;

/* loaded from: classes10.dex */
public interface r extends zc5.p, zc5.o {
    @Override // zc5.p
    default long[] G() {
        java.util.List<uc5.l0> m82898xfb7e5820;
        xm3.t0 b17 = xm3.u0.b(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) this).m7());
        if (b17 == null || (m82898xfb7e5820 = b17.m82898xfb7e5820()) == null) {
            return new long[0];
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (uc5.l0 l0Var : m82898xfb7e5820) {
            if (l0Var instanceof uc5.h0) {
                uc5.d dVar = ((uc5.h0) l0Var).f508027d;
                if ((dVar instanceof dd5.n1) || (dVar instanceof dd5.d3)) {
                    arrayList.add(java.lang.Long.valueOf(dVar.p().m124847x74d37ac6()));
                }
            }
        }
        return kz5.n0.T0(arrayList);
    }
}
