package ne4;

/* loaded from: classes9.dex */
public class g implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ne4.h f418084d;

    public g(ne4.h hVar) {
        this.f418084d = hVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        boolean z17;
        if (!gm0.j1.b().m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginSoter", "account not ready.");
            return false;
        }
        ((ku5.t0) ku5.t0.f394148d).k(new ne4.e(this), 2000L);
        java.lang.String str = ((ie0.q) i95.n0.c(ie0.q.class)).f372503d;
        java.lang.String b17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? str : c01.z1.b();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_LAST_USERNAME_STRING_SYNC;
        java.lang.String str2 = (java.lang.String) c17.m(u3Var, "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginSoter", "username old: %s, new: %s, %s", str2, b17, str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17) && this.f418084d.f418086d < 10) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginSoter", "username is null, delay init");
            this.f418084d.f418086d++;
            return true;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && !str2.equals(b17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginSoter", "have changed username, old: %s, new: %s", str2, b17);
            re4.g0.f476068a = str2;
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            gm0.j1.u().c().x(u3Var, b17);
            re4.g0.f476068a = b17;
        } else {
            re4.g0.f476068a = b17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginSoter", "do init soter: %s, %s, %s", java.lang.Integer.valueOf(this.f418084d.f418086d), b17, re4.g0.f476068a);
        int i17 = this.f418084d.f418086d;
        if (i17 >= 10) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 44);
        } else if (i17 > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 45);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 47);
        }
        this.f418084d.getClass();
        re4.v a17 = re4.u.a();
        if (!((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.f476086a) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.f476087b)) ? false : true)) {
            java.lang.String m17 = wo.w0.m();
            if (!("NCE-AL10".equals(m17) || "NCE-AL00".equals(m17) || "NCE-TL10".equals(m17))) {
                z17 = true;
                se4.h.a(z17, true, new ne4.f(this));
                return false;
            }
        }
        z17 = false;
        se4.h.a(z17, true, new ne4.f(this));
        return false;
    }
}
