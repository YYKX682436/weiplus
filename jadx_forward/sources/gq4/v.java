package gq4;

@j95.b
/* loaded from: classes14.dex */
public class v extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2[] f356139d = {null};

    /* renamed from: e, reason: collision with root package name */
    public final qq4.b[] f356140e = {null};

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.t0[] f356141f = {null};

    /* renamed from: g, reason: collision with root package name */
    public rs0.n f356142g;

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.t0 Ai() {
        if (!gm0.j1.a()) {
            throw new c01.c();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.t0[] t0VarArr = ((gq4.v) i95.n0.c(gq4.v.class)).f356141f;
        if (t0VarArr[0] == null) {
            synchronized (t0VarArr) {
                if (t0VarArr[0] == null) {
                    t0VarArr[0] = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.t0();
                }
            }
        }
        return t0VarArr[0];
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 Bi() {
        if (!gm0.j1.a()) {
            throw new c01.c();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2[] h2VarArr = ((gq4.v) i95.n0.c(gq4.v.class)).f356139d;
        if (h2VarArr[0] == null) {
            synchronized (h2VarArr) {
                if (h2VarArr[0] == null) {
                    h2VarArr[0] = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2();
                }
            }
        }
        return h2VarArr[0];
    }

    public static void Di(boolean z17) {
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOIP_STATUS_PUSH_BOOLEAN, java.lang.Boolean.valueOf(z17));
        gm0.j1.u().c().i(true);
    }

    public static boolean Ni() {
        return (c01.z1.j() & 137438953472L) == 0;
    }

    public static qq4.b wi() {
        if (!gm0.j1.a()) {
            throw new c01.c();
        }
        qq4.b[] bVarArr = ((gq4.v) i95.n0.c(gq4.v.class)).f356140e;
        if (bVarArr[0] == null) {
            synchronized (bVarArr) {
                if (bVarArr[0] == null) {
                    bVarArr[0] = new qq4.b();
                }
            }
        }
        return bVarArr[0];
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        java.lang.String str;
        super.mo204xfac946a6(context);
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOIP_STATUS_PUSH_BOOLEAN, null);
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.j0.d() && m17 != null && !((java.lang.Boolean) m17).booleanValue()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOIP_STATUS_VIDEO_MODE_BOOLEAN;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            boolean booleanValue = ((java.lang.Boolean) c17.m(u3Var, bool)).booleanValue();
            boolean booleanValue2 = ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOIP_STATUS_OUT_CALL_BOOLEAN, bool)).booleanValue();
            long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOIP_STATUS_BEFORE_TIME_LONG, 0)).longValue();
            java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOIP_STATUS_TO_USER_STRING, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVoip", "voip message need push is %s,%s,%s,%s", java.lang.Boolean.valueOf(booleanValue), java.lang.Boolean.valueOf(booleanValue2), java.lang.Long.valueOf(longValue), str2);
            if (booleanValue) {
                int i17 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.f275459r2;
                str = "voip_content_video";
            } else {
                int i18 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.f275459r2;
                str = "voip_content_voice";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.b2.c(str2, str, booleanValue2 ? 1 : 0, 6, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kcp));
            Di(true);
        }
        nq4.f.f420547a.d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPBubbleHelper", "checkCrashCgi: ");
        ((ku5.t0) ku5.t0.f394148d).g(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h0.f258087d);
        uo.q qVar = uo.q.f511065a;
        uo.q.f511067c = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCamera", "initCameraNumbers start, useMMKVCache : true");
        uo.q.f511068d = new java.util.concurrent.FutureTask(uo.o.f511063d);
        ((ku5.t0) ku5.t0.f394148d).g(uo.p.f511064d);
        it0.g.f376028a = new java.util.concurrent.FutureTask(it0.e.f376026d);
        ((ku5.t0) ku5.t0.f394148d).g(it0.f.f376027d);
        ((ku5.t0) ku5.t0.f394148d).g(new gq4.u(this));
        Bi().getClass();
        rs0.n nVar = new rs0.n();
        this.f356142g = nVar;
        nVar.a();
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).f(40);
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        boolean booleanValue3 = ((java.lang.Boolean) c18.l(73217, bool2)).booleanValue();
        boolean booleanValue4 = ((java.lang.Boolean) gm0.j1.u().c().l(73218, bool2)).booleanValue();
        boolean b17 = ip.b.b();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c19 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOIP_MSG_SOUND_DIFF_STAT_BOOLEAN_SYNC;
        boolean booleanValue5 = ((java.lang.Boolean) c19.m(u3Var2, java.lang.Boolean.FALSE)).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVoip", "voipSound: %s, voipAudioSound: %s, msgSound: %s, hasReport: %s", java.lang.Boolean.valueOf(booleanValue3), java.lang.Boolean.valueOf(booleanValue4), java.lang.Boolean.valueOf(b17), java.lang.Boolean.valueOf(booleanValue5));
        if (!booleanValue5) {
            boolean z17 = booleanValue3 || booleanValue4;
            if (z17 != b17) {
                if (z17 && !b17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(500L, 13L, 1L, false);
                } else if (!z17 && b17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(500L, 14L, 1L, false);
                }
            }
            gm0.j1.u().c().x(u3Var2, bool2);
        }
        if (z65.c.a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.s0.f258515a;
            if (z65.c.a()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipAutomatedTestSetupShell", "setup");
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.s0.f258518d.mo48813x58998cd();
            }
        }
        c01.a9.a(1);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        boolean z17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2;
        super.mo836xb8969aab(context);
        synchronized (this.f356141f) {
            z17 = false;
            if (this.f356141f[0] != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new gq4.t(this));
            }
        }
        rs0.n nVar = this.f356142g;
        if (nVar != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var3 = nVar.f480842c;
            if (n3Var3 != null) {
                n3Var3.mo50302x6b17ad39(null);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var4 = nVar.f480842c;
            if (n3Var4 != null && !n3Var4.mo50287xb9a7fe99()) {
                z17 = true;
            }
            if (z17 && (n3Var2 = nVar.f480842c) != null) {
                n3Var2.mo50293x3498a0(new rs0.m(nVar));
            }
        }
        nq4.f.f420547a.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.i1 i1Var = Bi().f258091a.f257944a.A;
        if (i1Var != null && (n3Var = i1Var.f258199u) != null) {
            n3Var.m77787xbe88f509();
            i1Var.f258199u = null;
        }
        Bi().R();
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.s0.f258515a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipAutomatedTestSetupShell", "destroy");
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.s0.f258518d.mo48814x2efc64();
    }
}
