package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic;

/* loaded from: classes11.dex */
public final class a implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.b f243524a;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.b bVar) {
        this.f243524a = bVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        int i17;
        j75.f m67437x4bd5310;
        com.p314xaae8f345.mm.p944x882e457a.f cgiBack = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiBack, "cgiBack");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "GetSafetyInfoRespsonse cgiBack, errType:%s, errCode:%s", java.lang.Integer.valueOf(cgiBack.f152148a), java.lang.Integer.valueOf(cgiBack.f152149b));
        if (cgiBack.f152148a == 0) {
            r45.on3 on3Var = (r45.on3) cgiBack.f152151d;
            if ((on3Var != null ? on3Var.f463910d : null) != null) {
                r45.iu5 iu5Var = on3Var.f463910d;
                boolean z17 = iu5Var.f458875e;
                boolean z18 = iu5Var.f458876f;
                int o17 = c01.z1.o();
                if (z17) {
                    int i18 = 65536 | o17;
                    i17 = z18 ? 131072 | i18 : (-131073) & i18;
                } else {
                    i17 = (-65537) & o17;
                }
                if (i17 != o17) {
                    c01.b9.f118602c.d("last_login_use_voice", i17 + "");
                    gm0.j1.u().c().z(40, i17);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 a17 = tm3.a.a(this.f243524a.m80379x76847179());
                    if (a17 != null && (m67437x4bd5310 = a17.m67437x4bd5310()) != null) {
                        m67437x4bd5310.B3(new r24.b());
                    }
                }
            }
        }
        return cgiBack;
    }
}
