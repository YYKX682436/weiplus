package b00;

@j95.b
/* loaded from: classes9.dex */
public final class t2 extends i95.w implements c00.f4 {
    public c00.e4 wi(java.lang.String username, java.lang.String str) {
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true);
        int i17 = n17 != null ? n17.I : 0;
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String f17 = c01.a2.f(username, str);
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(username);
        java.lang.String d17 = n07 != null ? n07.d() : null;
        c00.e4 e4Var = new c00.e4(f17, d17, i17);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ecs_sync_avatar_when_null_android, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMEcsUserInfoService", "hy: got ecs user info " + e4Var + ", and autosync config is " + Ni);
        if (d17 == null) {
            i95.m c17 = i95.n0.c(c00.b4.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c00.b4.lg((c00.b4) c17, "EcsUserInfoErrReport", 0, null, 4, null);
            if (Ni == 1) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMEcsUserInfoService", "hy: no userinfo. will trigger update sync contact");
                ((c01.k7) c01.n8.a()).b(username, 13, b00.s2.f16770a);
            }
        }
        return e4Var;
    }
}
