package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public abstract class z3 {

    /* renamed from: a, reason: collision with root package name */
    public static j05.e f227268a;

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.i f227269b;

    public static void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.i iVar) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 O = db5.e1.O(context, null, 3, com.p314xaae8f345.mm.R.C30868x68b1db1.f575789i6, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o3(iVar));
        if (!(context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopePreview", "context is not MMFragmentActivity: %s", context.getClass().getName());
            return;
        }
        pq5.g l17 = iVar.l();
        l17.f((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context);
        l17.q(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r3(O, context));
    }

    public static void b() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().y2("1@fackuser");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().J0("1@fackuser");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().y2("1@fackuser");
    }

    public static void c(android.content.Context context, java.lang.String str, j05.e eVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopePreview", "do get red packet preview from scan，url: %s", str);
        f227268a = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.i iVar = f227269b;
        if (iVar != null) {
            iVar.j();
            f227269b = null;
        }
        f227268a = eVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.i iVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.i(0, str, "");
        f227269b = iVar2;
        a(context, iVar2);
    }

    public static void d() {
        if (((int) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q("1@fackuser").E2) > 0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().k("1@fackuser");
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        z3Var.X1("1@fackuser");
        z3Var.M1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gn8));
        z3Var.N2();
        z3Var.E2 = -99L;
        z3Var.V2(3);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().s0(z3Var, false);
    }
}
