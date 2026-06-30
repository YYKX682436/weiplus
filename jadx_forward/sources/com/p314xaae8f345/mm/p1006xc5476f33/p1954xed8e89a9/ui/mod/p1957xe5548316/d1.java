package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316;

/* loaded from: classes11.dex */
public final class d1 implements lr3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.k1 f235427a;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.k1 k1Var) {
        this.f235427a = k1Var;
    }

    @Override // lr3.a
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.k1 k1Var = this.f235427a;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) k1Var.f392926h;
        if (c21503x6e5a020a == null) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 U6 = k1Var.U6();
        java.lang.String w07 = U6 != null ? U6.w0() : null;
        if (w07 == null || r26.n0.N(w07)) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21525x1d56253b editText = c21503x6e5a020a.getEditText();
            editText.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.c1(editText, k1Var));
        }
    }

    @Override // lr3.a
    public void b() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) this.f235427a.f392926h;
        if (c21503x6e5a020a == null) {
            return;
        }
        sa5.d.e(c21503x6e5a020a, i65.a.h(r0.m158354x19263085(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), (r14 & 2) != 0 ? 1 : 0, (r14 & 4) != 0 ? 1000L : 0L, (r14 & 8) != 0 ? 300L : 0L, (r14 & 16) != 0 ? null : null);
    }
}
