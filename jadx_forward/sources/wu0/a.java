package wu0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p886x58d9bd6.p887x5235105e.C10932x97174782 f531182a;

    public final void a() {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p886x58d9bd6.p887x5235105e.C10932x97174782 c10932x97174782 = this.f531182a;
        if (c10932x97174782 != null) {
            c10932x97174782.m47023x5cd39ffa();
        }
        this.f531182a = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AudioDenoise3AHelper", "destroy 3aInterface");
    }

    public final com.p314xaae8f345.mm.vfs.r6 b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(1024);
        ((kg0.r) ((lg0.n) i95.n0.c(lg0.n.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.s1 s1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.s1.f258331a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipModelResMgr", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        ((kg0.r) ((lg0.n) i95.n0.c(lg0.n.class))).getClass();
        s1Var.b(sb6);
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(sb6.toString());
        if (r6Var.m() && r6Var.C() > 0) {
            return r6Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AudioDenoise3AHelper", "initVoipAudioModelRes: modesFile error");
        return null;
    }
}
