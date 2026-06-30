package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b;

/* loaded from: classes11.dex */
public final class c1 implements lr3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.j1 f235569a;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.j1 j1Var) {
        this.f235569a = j1Var;
    }

    @Override // lr3.a
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.j1 j1Var = this.f235569a;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) j1Var.f393013h;
        if (c21503x6e5a020a == null) {
            return;
        }
        com.p314xaae8f345.mm.p670x38b72420.o U6 = j1Var.U6();
        java.lang.String c17 = U6 != null ? ((yq3.v) U6).c() : null;
        if (c17 == null || r26.n0.N(c17)) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21525x1d56253b editText = c21503x6e5a020a.getEditText();
            editText.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.b1(editText, j1Var));
        }
    }

    @Override // lr3.a
    public void b() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) this.f235569a.f393013h;
        if (c21503x6e5a020a == null) {
            return;
        }
        sa5.d.e(c21503x6e5a020a, i65.a.h(r0.m158354x19263085(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), (r14 & 2) != 0 ? 1 : 0, (r14 & 4) != 0 ? 1000L : 0L, (r14 & 8) != 0 ? 300L : 0L, (r14 & 16) != 0 ? null : null);
    }
}
