package y82;

/* loaded from: classes9.dex */
public class e extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public e() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.Object obj;
        am.u9 u9Var = ((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5426x1aa8f97e) abstractC20979x809547d1).f135771g;
        java.lang.Object obj2 = u9Var.f89597f;
        if (obj2 != null && (obj2 instanceof r35.i1) && (obj = u9Var.f89598g) != null && (obj instanceof android.content.Context)) {
            o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(u9Var.f89594c);
            java.lang.String str = u9Var.f89595d;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && ((F != null && F.f67657x2262335f == 18) || F.f67657x2262335f == 14)) {
                try {
                    java.util.LinkedList linkedList = F.f67640x5ab01132.f452497f;
                    int i17 = F.f67657x2262335f == 18 ? 1 : 0;
                    while (true) {
                        if (i17 >= linkedList.size()) {
                            break;
                        }
                        r45.gp0 gp0Var = (r45.gp0) linkedList.get(i17);
                        if (str.startsWith(gp0Var.T)) {
                            o72.r2 m150781x5a5dd5d = F.m150781x5a5dd5d();
                            m150781x5a5dd5d.f67657x2262335f = u9Var.f89596e;
                            m150781x5a5dd5d.B1 = true;
                            m150781x5a5dd5d.C1 = F;
                            m150781x5a5dd5d.D1 = F.f67645x88be67a1 + "_" + gp0Var.T;
                            r45.bq0 a17 = q72.c.a(F.f67640x5ab01132);
                            m150781x5a5dd5d.f67640x5ab01132 = a17;
                            a17.f452497f = new java.util.LinkedList();
                            m150781x5a5dd5d.f67640x5ab01132.f452497f.add(gp0Var);
                            m150781x5a5dd5d.f67640x5ab01132.p(gp0Var.f456937d);
                            r45.hp0 hp0Var = gp0Var.J1;
                            if (hp0Var != null) {
                                int i18 = u9Var.f89596e;
                                if (i18 == 6) {
                                    m150781x5a5dd5d.f67640x5ab01132.j(hp0Var.f457887e);
                                } else if (i18 == 5) {
                                    m150781x5a5dd5d.f67640x5ab01132.r(hp0Var.f457888f);
                                }
                            }
                            F = m150781x5a5dd5d;
                        } else {
                            i17++;
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.InitConfirmDialogContentListener", "FavInitConfirmDialogContentEvent callback : %s %s", e17.getClass().getSimpleName(), e17.getMessage());
                }
            }
            if (F == null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u9Var.f89599h)) {
                F = o72.x1.B(u9Var.f89599h, 18);
            }
            o72.r2 r2Var = F;
            r35.i1 i1Var = (r35.i1) u9Var.f89597f;
            android.content.Context context = (android.content.Context) u9Var.f89598g;
            x82.k0.l(i1Var, context, r2Var);
            x82.k0.m(i1Var, context, u9Var.f89593b, r2Var, u9Var.f89592a, u9Var.f89600i);
        }
        u9Var.f89594c = 0L;
        u9Var.f89595d = "";
        u9Var.f89597f = null;
        u9Var.f89598g = null;
        return false;
    }
}
