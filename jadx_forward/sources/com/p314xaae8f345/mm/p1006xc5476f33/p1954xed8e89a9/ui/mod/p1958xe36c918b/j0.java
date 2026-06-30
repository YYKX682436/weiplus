package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b;

/* loaded from: classes11.dex */
public final class j0 implements lr3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.n0 f235615a;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.n0 n0Var) {
        this.f235615a = n0Var;
    }

    @Override // lr3.a
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.n0 n0Var = this.f235615a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4 c16924x6da766a4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4) n0Var.f393013h;
        if (c16924x6da766a4 != null && n0Var.f235633r.isEmpty()) {
            c16924x6da766a4.m67736x5db1c8a().a().performClick();
        }
    }

    @Override // lr3.a
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.n0 n0Var = this.f235615a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4 c16924x6da766a4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4) n0Var.f393013h;
        if (c16924x6da766a4 == null) {
            return;
        }
        float h17 = i65.a.h(n0Var.m158354x19263085(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        em.t3 m67736x5db1c8a = c16924x6da766a4.m67736x5db1c8a();
        if (m67736x5db1c8a.f336354e == null) {
            m67736x5db1c8a.f336354e = (android.widget.LinearLayout) m67736x5db1c8a.f336350a.findViewById(com.p314xaae8f345.mm.R.id.cd7);
        }
        android.widget.LinearLayout linearLayout = m67736x5db1c8a.f336354e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linearLayout, "getContactInfoModDecCon(...)");
        sa5.d.e(linearLayout, h17, (r14 & 2) != 0 ? 1 : 0, (r14 & 4) != 0 ? 1000L : 0L, (r14 & 8) != 0 ? 300L : 0L, (r14 & 16) != 0 ? null : null);
    }
}
