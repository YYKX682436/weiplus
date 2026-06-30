package ih1;

/* loaded from: classes7.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f373063a;

    /* renamed from: b, reason: collision with root package name */
    public final ih1.e f373064b;

    /* renamed from: c, reason: collision with root package name */
    public iq0.c f373065c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f373066d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f373067e;

    /* renamed from: f, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f373068f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f373069g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f373070h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashSet f373071i;

    /* renamed from: j, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f373072j;

    /* renamed from: k, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f373073k;

    /* renamed from: l, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.r0 f373074l;

    public u(java.lang.String appId, ih1.e onMBADCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onMBADCallback, "onMBADCallback");
        this.f373063a = appId;
        this.f373064b = onMBADCallback;
        this.f373066d = jz5.h.b(new ih1.o(this));
        this.f373068f = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392101a));
        this.f373069g = jz5.h.b(new ih1.n(this));
        jc3.y0 wi6 = ((com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.v) ((xj.j) i95.n0.c(xj.j.class))).wi("MagicAdMiniProgram");
        java.util.LinkedList linkedList = new java.util.LinkedList(wi6.f380545a);
        linkedList.add(new hh1.c());
        this.f373070h = linkedList;
        this.f373071i = new java.util.HashSet(wi6.f380546b);
        this.f373073k = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
        int i17 = p3325xe03a0797.p3326xc267989b.r0.N0;
        this.f373074l = new ih1.q(p3325xe03a0797.p3326xc267989b.q0.f392100d, this);
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdMiniProgramInstaller", "appId[" + this.f373063a + "], destroy");
        this.f373067e = true;
        iq0.c cVar = this.f373065c;
        if (cVar != null) {
            ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).Di(cVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i0) this.f373064b;
        i0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandServiceWC", "[MBAd] getGlobalNativeWidgetHandler");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t37 = i0Var.f170218a.t3();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.z zVar = (t37 == null || !t37.J0()) ? null : t37.D1;
        if (zVar != null) {
            zVar.r(3);
        }
        p3325xe03a0797.p3326xc267989b.z0.e(this.f373068f, null, 1, null);
        f();
        p3325xe03a0797.p3326xc267989b.z0.e(this.f373073k, null, 1, null);
    }

    public final ih1.m b() {
        return (ih1.m) ((jz5.n) this.f373069g).mo141623x754a37bb();
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdMiniProgramInstaller", "appId[" + this.f373063a + "], pause");
        ((wj.g1) ((wj.m) i95.n0.c(wj.m.class))).getClass();
        boolean z17 = false;
        jc3.i0 i0Var = null;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_magic_ad_mini_program_heart_beat, -1) == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdMiniProgramInstaller", "appId[" + this.f373063a + "], start send heart beat from app");
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f373072j;
            if (r2Var != null && r2Var.a()) {
                z17 = true;
            }
            if (!z17) {
                p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f373072j;
                if (r2Var2 != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
                }
                this.f373072j = p3325xe03a0797.p3326xc267989b.l.d(this.f373073k, this.f373074l, null, new ih1.t(this, null), 2, null);
            }
        }
        iq0.c cVar = this.f373065c;
        if (cVar != null) {
            nq0.p pVar = (nq0.p) ((gq0.t) i95.n0.c(gq0.t.class));
            pVar.getClass();
            synchronized (cVar) {
                jc3.i0 i0Var2 = (jc3.i0) ((java.util.LinkedHashMap) pVar.f420477f).get(cVar);
                if (i0Var2 != null) {
                    i0Var = i0Var2;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicCardStarterFeatureService", "get biz, but not found");
                }
            }
            if (i0Var != null) {
                i0Var.mo133870x65825f6();
            }
        }
    }

    public final void d() {
        long j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdMiniProgramInstaller", "[MBAd] preload start");
        try {
            j17 = ((java.lang.Number) ((jz5.n) ((wj.g1) ((wj.m) i95.n0.c(wj.m.class))).f527947h).mo141623x754a37bb()).longValue();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MagicAdMiniProgramInstaller", "[MBAd] preload read mbPreloadCacheTime failed, fallback cacheTime=0 (disabled): " + th6);
            j17 = 0;
        }
        int i17 = s26.a.f483901f;
        long f17 = s26.c.f(j17, s26.d.f483905g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdMiniProgramInstaller", "[MBAd] preload cacheTime(sec):" + j17 + ", bizName:MagicAdMiniProgram");
        ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).Vi(new iq0.f("MagicAdMiniProgram", jc3.s0.f380517d, f17, null, this.f373070h, this.f373071i, 0.0d, b(), null, b(), 64, null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdMiniProgramInstaller", "[MBAd] preload submitted to MagicCardStarter");
    }

    public final void e() {
        jc3.i0 i0Var;
        jc3.i0 i0Var2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdMiniProgramInstaller", "appId[" + this.f373063a + "], resume");
        iq0.c cVar = this.f373065c;
        if (cVar != null) {
            gq0.t tVar = (gq0.t) i95.n0.c(gq0.t.class);
            nq0.p pVar = (nq0.p) tVar;
            pVar.getClass();
            synchronized (cVar) {
                i0Var = (jc3.i0) ((java.util.LinkedHashMap) pVar.f420477f).get(cVar);
                i0Var2 = null;
                if (i0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicCardStarterFeatureService", "get biz, but not found");
                    i0Var = null;
                }
            }
            if (i0Var != null) {
                i0Var.mo133871xc84dc82d();
            }
            nq0.p pVar2 = (nq0.p) tVar;
            synchronized (cVar) {
                jc3.i0 i0Var3 = (jc3.i0) ((java.util.LinkedHashMap) pVar2.f420477f).get(cVar);
                if (i0Var3 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicCardStarterFeatureService", "get biz, but not found");
                } else if (i0Var3 instanceof hq0.h) {
                    i0Var2 = i0Var3;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicCardStarterFeatureService", "get biz, but the type is not matched");
                }
            }
            hq0.h hVar = (hq0.h) i0Var2;
            if (hVar != null) {
                hq0.b0 b0Var = (hq0.b0) hVar;
                java.lang.String str = b0Var.f364504y;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "redraw");
                for (java.util.Map.Entry entry : b0Var.f364534p.entrySet()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "redraw, frameSetId: " + ((java.lang.String) entry.getKey()));
                    try {
                        ((hq0.e0) entry.getValue()).g();
                    } catch (java.lang.RuntimeException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "redraw failed for frameSetId: " + ((java.lang.String) entry.getKey()), e17);
                    }
                }
            }
        }
        f();
    }

    public final void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdMiniProgramInstaller", "appId[" + this.f373063a + "], stop send heart beat form app");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f373072j;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f373072j = null;
    }
}
