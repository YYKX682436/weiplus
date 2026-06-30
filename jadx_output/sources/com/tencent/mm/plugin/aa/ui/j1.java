package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes11.dex */
public class j1 extends com.tencent.mm.ui.contact.item.a {
    public final com.tencent.mm.plugin.aa.ui.i1 C;
    public final com.tencent.mm.plugin.aa.ui.g1 D;

    static {
        java.util.regex.Pattern.compile(",");
    }

    public j1(int i17) {
        super(2, i17);
        this.C = new com.tencent.mm.plugin.aa.ui.i1(this);
        this.D = new com.tencent.mm.plugin.aa.ui.g1(this);
    }

    public static boolean g(com.tencent.mm.plugin.aa.ui.j1 j1Var, com.tencent.mm.plugin.aa.ui.j1 j1Var2) {
        j1Var.getClass();
        return com.tencent.mm.storage.z3.m4(j1Var2.f206819z) || (java.lang.Boolean.valueOf(j1Var2.f206845n).booleanValue() && c01.z1.r().equals(j1Var2.f206819z)) || !java.lang.Boolean.valueOf(j1Var2.f206846o).booleanValue();
    }

    @Override // com.tencent.mm.ui.contact.item.d
    public void a(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar) {
        java.lang.String f17;
        com.tencent.mm.storage.z3 z3Var = this.B;
        if (z3Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactDataItem", "filling dataItem Occur Error Contact is null, position=%d", java.lang.Integer.valueOf(this.f206833b));
            return;
        }
        this.f206819z = z3Var.d1();
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f206849r)) {
            f17 = ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).wi(this.B);
        } else {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String d17 = this.B.d1();
            java.lang.String str = this.f206849r;
            ((sg3.a) v0Var).getClass();
            f17 = c01.a2.f(d17, str);
        }
        if (c01.z1.r().equals(this.f206819z)) {
            f17 = f17 + context.getString(com.tencent.mm.R.string.f489751ao);
        }
        this.f206818y = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, f17, i65.a.h(context, com.tencent.mm.R.dimen.f479897ia));
    }

    @Override // com.tencent.mm.ui.contact.item.d
    public com.tencent.mm.ui.contact.item.c b() {
        return this.C;
    }
}
