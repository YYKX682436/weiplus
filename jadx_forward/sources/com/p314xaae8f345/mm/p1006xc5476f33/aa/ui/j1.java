package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes11.dex */
public class j1 extends com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a {
    public final com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.i1 C;
    public final com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.g1 D;

    static {
        java.util.regex.Pattern.compile(",");
    }

    public j1(int i17) {
        super(2, i17);
        this.C = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.i1(this);
        this.D = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.g1(this);
    }

    public static boolean g(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.j1 j1Var, com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.j1 j1Var2) {
        j1Var.getClass();
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(j1Var2.f288352z) || (java.lang.Boolean.valueOf(j1Var2.f288378n).booleanValue() && c01.z1.r().equals(j1Var2.f288352z)) || !java.lang.Boolean.valueOf(j1Var2.f288379o).booleanValue();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d
    public void a(android.content.Context context, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b bVar) {
        java.lang.String f17;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.B;
        if (z3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactDataItem", "filling dataItem Occur Error Contact is null, position=%d", java.lang.Integer.valueOf(this.f288366b));
            return;
        }
        this.f288352z = z3Var.d1();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f288382r)) {
            f17 = ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).wi(this.B);
        } else {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String d17 = this.B.d1();
            java.lang.String str = this.f288382r;
            ((sg3.a) v0Var).getClass();
            f17 = c01.a2.f(d17, str);
        }
        if (c01.z1.r().equals(this.f288352z)) {
            f17 = f17 + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571284ao);
        }
        this.f288351y = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, f17, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c b() {
        return this.C;
    }
}
