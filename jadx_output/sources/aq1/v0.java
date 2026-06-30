package aq1;

/* loaded from: classes12.dex */
public class v0 implements vg3.a4 {

    /* renamed from: d, reason: collision with root package name */
    public static f21.g f13096d;

    /* renamed from: e, reason: collision with root package name */
    public static oq.e f13097e;

    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        b();
        com.tencent.mm.ui.chatting.m9 b17 = com.tencent.mm.ui.chatting.n9.b(str2, f13096d, f13097e);
        java.lang.String valueOf = java.lang.String.valueOf(b17 == null ? 1 : b17.f201956d);
        int i17 = c01.ia.f37254a;
        java.lang.String b18 = c01.ia.b(str, "eggIncluded", d75.b.h(valueOf, "eggIncluded"));
        return b17 != null ? c01.ia.b(b18, "eggSeed", d75.b.h(java.lang.String.valueOf(c06.e.f37716d.g(2147483647L) + 1), "eggSeed")) : b18;
    }

    public static void b() {
        f21.g K = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).K();
        if (K == null) {
            return;
        }
        if (f13096d != K || f13097e == null) {
            oq.e eVar = new oq.e();
            f13097e = eVar;
            eVar.a(K);
        }
        f13096d = K;
    }

    @Override // vg3.a4
    public void j(r45.ll4 ll4Var, com.tencent.mm.storage.f9 f9Var) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(ll4Var.f379577i)) {
            ll4Var.f379577i = f9Var.G;
        }
        if (f9Var.getType() == 1) {
            jz5.l lVar = com.tencent.mm.ui.chatting.n9.f202017t;
            com.tencent.mm.ui.chatting.m9 m9Var = (lVar == null || ((java.lang.Long) lVar.f302833d).longValue() != f9Var.getMsgId()) ? null : (com.tencent.mm.ui.chatting.m9) com.tencent.mm.ui.chatting.n9.f202017t.f302834e;
            if (m9Var == null) {
                b();
                m9Var = com.tencent.mm.ui.chatting.n9.b(f9Var.j(), f13096d, f13097e);
            }
            if (m9Var != null) {
                com.tencent.mm.ui.chatting.n9.f202017t = new jz5.l(java.lang.Long.valueOf(f9Var.getMsgId()), m9Var);
            }
            int i17 = m9Var != null ? m9Var.f201956d : 1;
            java.lang.String str = ll4Var.f379577i;
            java.lang.String valueOf = java.lang.String.valueOf(i17);
            int i18 = c01.ia.f37254a;
            java.lang.String b17 = c01.ia.b(str, "eggIncluded", d75.b.h(valueOf, "eggIncluded"));
            ll4Var.f379577i = b17;
            if (m9Var == null) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                    b17 = b17.replaceAll("(?s)<eggSeed[^>]*>.*?</eggSeed>", "");
                }
                ll4Var.f379577i = b17;
            }
        }
    }
}
