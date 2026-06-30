package c01;

/* loaded from: classes9.dex */
public abstract class i0 {
    public static void a(java.lang.String str, boolean z17) {
        iz5.a.g(null, !com.tencent.mm.sdk.platformtools.t8.K0(str));
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null || com.tencent.mm.sdk.platformtools.t8.K0(n17.d1())) {
            return;
        }
        n17.setType(n17.getType() | 2048);
        c01.e2.g0(n17, true);
        if (z17) {
            if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(str) == null && n17.k2()) {
                if (r01.z.o(str) || r01.z.m(str)) {
                    if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p("officialaccounts") == null) {
                        com.tencent.mm.storage.l4 l4Var = new com.tencent.mm.storage.l4("officialaccounts");
                        l4Var.f2();
                        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().G(l4Var);
                    }
                    com.tencent.mm.storage.l4 l4Var2 = new com.tencent.mm.storage.l4(str);
                    l4Var2.n1(java.lang.System.currentTimeMillis());
                    l4Var2.T1("officialaccounts");
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().G(l4Var2);
                } else if (r01.z.h(str)) {
                    qk.o b17 = r01.z.b(str);
                    if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(b17.field_enterpriseFather) == null) {
                        com.tencent.mm.storage.l4 l4Var3 = new com.tencent.mm.storage.l4(b17.field_enterpriseFather);
                        l4Var3.f2();
                        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().G(l4Var3);
                    }
                    com.tencent.mm.storage.l4 l4Var4 = new com.tencent.mm.storage.l4(str);
                    l4Var4.n1(java.lang.System.currentTimeMillis());
                    l4Var4.T1(b17.y0());
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().G(l4Var4);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.BizConversationLogic", "setPlacedTop username = " + str);
            }
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().S(str);
        }
    }
}
