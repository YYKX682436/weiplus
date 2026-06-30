package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* JADX INFO: Access modifiers changed from: package-private */
@mk0.a
/* loaded from: classes7.dex */
public final class e implements com.p314xaae8f345.mm.p794xb0fa9b5e.i<android.os.Bundle, android.os.Bundle> {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        try {
            ((ij1.j) ((k01.u0) i95.n0.c(k01.u0.class))).Ni(bundle.getInt("action"), bundle);
            if (rVar == null) {
                return;
            }
        } catch (java.lang.Exception unused) {
            if (rVar == null) {
                return;
            }
        } catch (java.lang.Throwable th6) {
            if (rVar != null) {
                try {
                    rVar.a(android.os.Bundle.EMPTY);
                } catch (java.lang.Exception unused2) {
                }
            }
            throw th6;
        }
        try {
            rVar.a(android.os.Bundle.EMPTY);
        } catch (java.lang.Exception unused3) {
        }
    }
}
