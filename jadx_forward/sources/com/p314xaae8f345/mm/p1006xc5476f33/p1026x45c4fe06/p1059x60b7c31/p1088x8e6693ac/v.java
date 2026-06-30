package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac;

/* loaded from: classes7.dex */
public final class v extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34171x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f34172x24728b = "saveSplashScreenshot";

    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.q(null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 env = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t37 = env != null ? env.t3() : null;
        if (t37 == null) {
            if (env != null) {
                env.a(i17, o("fail:internal error"));
                return;
            }
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        if (!(gk1.g.f353996f.a() && env.t3().u0().f158825e2)) {
            env.a(i17, o("fail:not supported"));
            return;
        }
        if (t37.f156344t != null) {
            env.a(i17, o("fail: not ready for screenshot"));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.a(env.mo48798x74292566()).getClass();
        pq5.g a17 = pq5.h.a();
        a17.f(t37);
        a17.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.r(t37, env, i17, this)).i(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.u(t37, env, i17, this)).B();
    }
}
