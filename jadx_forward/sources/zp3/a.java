package zp3;

/* loaded from: classes12.dex */
public class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        rh.k1 k1Var = (rh.k1) ph.a.a(rh.k1.class);
        if (k1Var == null || !k1Var.y()) {
            return null;
        }
        rh.f1 w17 = k1Var.w();
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4632xe8a3494d c4632xe8a3494d = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4632xe8a3494d();
        c4632xe8a3494d.f134090d = new java.util.ArrayList(w17.f476919e.size());
        for (rh.y2 y2Var : w17.f476919e) {
            int size = y2Var.f477093a.size();
            long[] jArr = new long[size];
            for (int i17 = 0; i17 < size; i17++) {
                jArr[i17] = ((java.lang.Long) ((rh.x2) y2Var.f477093a.get(i17)).f477085a).longValue();
            }
            c4632xe8a3494d.f134090d.add(jArr);
        }
        return c4632xe8a3494d;
    }
}
