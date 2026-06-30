package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f;

/* loaded from: classes7.dex */
public class i extends nh1.a {

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.h f167504b;

    public i() {
        super(30);
        this.f167504b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.h(null);
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.v0 d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 E0 = n7Var.mo32091x9a3f0ba2().E0();
        int a17 = E0 != null ? k91.a.f387055f.a(E0) : 0;
        int i17 = kj1.z.f389916a;
        if (!((java.lang.Boolean) kj1.y.f389915d.mo152xb9724478()).booleanValue() || a17 == 1) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.v0.HIDDEN;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.l0.e(n7Var) && a17 == 0 && !wa1.b.a(n7Var.mo32091x9a3f0ba2())) {
            java.util.Map map = i81.j.f371125a;
            if (!(context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.ActivityC11550x40c70d1d)) {
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.v0.SHOW_CLICKABLE;
            }
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.v0.SHOW_UNCLICKABLE;
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, db5.g4 g4Var, java.lang.String str) {
        int ordinal = d((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var, context).ordinal();
        int i17 = this.f418617a;
        if (ordinal == 1) {
            g4Var.g(i17, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571620kj), com.p314xaae8f345.mm.R.raw.f78466x4c130bb6);
        } else {
            if (ordinal != 2) {
                return;
            }
            g4Var.l(i17, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571620kj), com.p314xaae8f345.mm.R.raw.f78466x4c130bb6, true);
        }
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.h hVar = this.f167504b;
        hVar.f167486a = str;
        hVar.f167487b = n7Var.X1();
        hVar.f167488c = n7Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.vf.f165052a.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d1.f162264d, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, hVar);
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t0(true).x(n7Var.mo50260x9f1221c2(), n7Var.U1());
    }
}
