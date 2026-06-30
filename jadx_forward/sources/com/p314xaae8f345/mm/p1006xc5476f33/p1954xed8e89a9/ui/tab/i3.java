package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes8.dex */
public final class i3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s4 f235892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xl3 f235893e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s4 s4Var, r45.xl3 xl3Var) {
        super(1);
        this.f235892d = s4Var;
        this.f235893e = xl3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s4 s4Var = this.f235892d;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = s4Var.f236088f;
        java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
        if (d17 == null) {
            d17 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var = s4Var.f236084d;
        long j17 = m0Var.D;
        android.content.Intent intent = s4Var.f236086e.getIntent();
        int i17 = m0Var.L;
        int i18 = m0Var.f236000v;
        boolean i19 = m0Var.i();
        r45.xl3 xl3Var = this.f235893e;
        java.lang.String str = xl3Var != null ? xl3Var.f471746f : null;
        gr3.e.d(d17, intValue, j17, intent, i17, i18, i19 ? 1 : 0, null, str == null ? "" : str, null, 0, 0, 3712, null);
        return jz5.f0.f384359a;
    }
}
