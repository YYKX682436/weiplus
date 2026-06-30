package cb1;

/* loaded from: classes7.dex */
public final class k implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cb1.j0 f121794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fl1.g1 f121795b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f121796c;

    public k(cb1.j0 j0Var, fl1.g1 g1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
        this.f121794a = j0Var;
        this.f121795b = g1Var;
        this.f121796c = v5Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        this.f121794a.getClass();
        km5.b b17 = km5.u.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f121796c;
        java.lang.String string = v5Var.getF229340d().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a3p);
        fl1.g1 g1Var = this.f121795b;
        g1Var.setMessage(string);
        g1Var.setOnCancelListener(new cb1.i0(b17));
        fl1.g2 mo50353x784fb1e3 = v5Var.mo50353x784fb1e3();
        if (mo50353x784fb1e3 != null) {
            mo50353x784fb1e3.c(g1Var);
        }
        return new java.lang.Object();
    }
}
