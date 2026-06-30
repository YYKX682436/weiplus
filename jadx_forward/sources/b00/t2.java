package b00;

@j95.b
/* loaded from: classes9.dex */
public final class t2 extends i95.w implements c00.f4 {
    public c00.e4 wi(java.lang.String username, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true);
        int i17 = n17 != null ? n17.I : 0;
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String f17 = c01.a2.f(username, str);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(username);
        java.lang.String d17 = n07 != null ? n07.d() : null;
        c00.e4 e4Var = new c00.e4(f17, d17, i17);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ecs_sync_avatar_when_null_android, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMEcsUserInfoService", "hy: got ecs user info " + e4Var + ", and autosync config is " + Ni);
        if (d17 == null) {
            i95.m c17 = i95.n0.c(c00.b4.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c00.b4.lg((c00.b4) c17, "EcsUserInfoErrReport", 0, null, 4, null);
            if (Ni == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMEcsUserInfoService", "hy: no userinfo. will trigger update sync contact");
                ((c01.k7) c01.n8.a()).b(username, 13, b00.s2.f98303a);
            }
        }
        return e4Var;
    }
}
