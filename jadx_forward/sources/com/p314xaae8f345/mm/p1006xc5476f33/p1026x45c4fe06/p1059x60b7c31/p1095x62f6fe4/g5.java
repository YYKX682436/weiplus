package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public final class g5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f163356a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f163357b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i5 f163358c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f163359d;

    public g5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i5 i5Var, boolean z17) {
        this.f163356a = lVar;
        this.f163357b = i17;
        this.f163358c = i5Var;
        this.f163359d = z17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        fl1.g1 g1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.a0 a0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.a0) obj;
        boolean z17 = a0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i5 i5Var = this.f163358c;
        int i17 = this.f163357b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f163356a;
        if (z17) {
            java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y) a0Var).f163678a;
            if (str == null) {
                str = "";
            }
            lVar.a(i17, i5Var.o("fail ".concat(str)));
        } else if (a0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.z) {
            if (lVar.mo50262x39e05d35()) {
                boolean z18 = this.f163359d;
                if (z18) {
                    g1Var = new fl1.g1(lVar.getF229340d());
                    g1Var.setMessage(lVar.getF229340d().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571613kc));
                    g1Var.setCanceledOnTouchOutside(false);
                    fl1.g2 mo50353x784fb1e3 = lVar.mo50353x784fb1e3();
                    if (mo50353x784fb1e3 != null) {
                        mo50353x784fb1e3.c(g1Var);
                    }
                } else {
                    g1Var = null;
                }
                pq5.g b17 = pq5.h.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.z) a0Var).f163693a.get(0));
                b17.H(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.b5(lVar, z18));
                b17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.c5(lVar, i17, i5Var, a0Var));
                b17.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.d5(g1Var)).s(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.f5(g1Var));
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.x.f163657a)) {
            lVar.a(i17, i5Var.o("fail user canceled"));
        }
        return jz5.f0.f384359a;
    }
}
