package sc3;

/* loaded from: classes7.dex */
public class k1 extends lc3.h0 implements qc3.f, bf3.m, yg.b0 {
    public static final jz5.g Y;
    public final com.p314xaae8f345.p485x5dc4f1ad.p487x294b574a.C4212xbf459dc6 A;
    public java.util.List B;
    public yz5.l C;
    public final java.lang.String D;
    public final jz5.g E;
    public final jz5.g F;
    public int G;
    public final jz5.g H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f488007J;
    public final jz5.g K;
    public final jz5.g L;
    public final java.util.Map M;
    public final jz5.g N;
    public sc3.k1 P;
    public final java.lang.String Q;
    public final jz5.g R;
    public volatile boolean S;
    public long T;
    public volatile long U;
    public final sc3.w V;
    public tc3.m0 W;
    public final sc3.d X;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f488008d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f488009e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p485x5dc4f1ad.biz.C4210x94b68e8f f488010f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.p f488011g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f488012h;

    /* renamed from: i, reason: collision with root package name */
    public qc3.c f488013i;

    /* renamed from: m, reason: collision with root package name */
    public final oc3.c f488014m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b f488015n;

    /* renamed from: o, reason: collision with root package name */
    public jc3.n f488016o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f488017p;

    /* renamed from: q, reason: collision with root package name */
    public vc3.a f488018q;

    /* renamed from: r, reason: collision with root package name */
    public jc3.x f488019r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5130x9c70410d f488020s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad f488021t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f488022u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f488023v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5128x72a3f151 f488024w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f488025x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc f488026y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2815x498e71d6.C22932xe093580f f488027z;

    static {
        new sc3.b(null);
        ((et.o) ((ft.b4) i95.n0.c(ft.b4.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n0.b();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        bf3.g0.f101160a.a();
        je3.i.M2(je3.k.f380831e, "", "magicbrush", com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16456x617fbd72.f37616x3edcc055, android.os.SystemClock.elapsedRealtime() - elapsedRealtime, null, 1.0E-5f, 16, null);
        bf3.a0 a0Var = new bf3.a0();
        ah.i.f86248a = a0Var;
        g8.g.f350942a = new ah.h(a0Var);
        Y = jz5.h.b(sc3.a.f487959d);
    }

    public k1(android.content.Context context, java.lang.String instanceName, com.p314xaae8f345.p485x5dc4f1ad.biz.C4210x94b68e8f bizManager, yz5.p pVar, yz5.l lVar) {
        java.util.List t07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizManager, "bizManager");
        this.f488008d = context;
        this.f488009e = instanceName;
        this.f488010f = bizManager;
        this.f488011g = pVar;
        this.f488012h = lVar;
        this.f488014m = new oc3.c(instanceName, null, 2, null);
        this.f488017p = jz5.h.b(new sc3.e0(this));
        this.f488022u = new java.util.concurrent.ConcurrentHashMap();
        this.f488023v = new java.util.concurrent.ConcurrentHashMap();
        this.f488024w = new com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5128x72a3f151(this);
        this.f488025x = jz5.h.b(sc3.f.f487975d);
        this.A = new com.p314xaae8f345.p485x5dc4f1ad.p487x294b574a.C4212xbf459dc6();
        java.lang.String s07 = r26.n0.s0(instanceName, "-", instanceName);
        this.D = s07;
        this.E = jz5.h.b(sc3.c0.f487966d);
        this.F = jz5.h.b(sc3.d0.f487969d);
        boolean z17 = true;
        this.G = 1;
        this.H = jz5.h.b(new sc3.p(this));
        this.I = jz5.h.b(new sc3.q(this));
        this.K = jz5.h.b(sc3.j1.f488000d);
        this.L = jz5.h.b(new sc3.e(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.f6 f6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.f6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.f4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.f4.class));
        f6Var.getClass();
        int hashCode = s07.hashCode();
        if (hashCode == -1270166210 ? s07.equals("MagicAdPlayable") : hashCode == -251354526 ? s07.equals("MagicEmojiCocos") : hashCode == 1454730499 && s07.equals("MagicEcsGiftEasterEgg")) {
            t07 = f6Var.wi();
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s07, "MagicAdBrandService") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s07, "MagicAdLandPage")) {
            t07 = kz5.n0.t0(kz5.n0.t0(kz5.n0.t0(f6Var.wi(), f6Var.Bi()), f6Var.Ri()), kz5.b0.c(new fd3.b(id3.a.class)));
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s07, "MagicBrandService") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s07, "MagicReward")) {
            t07 = kz5.n0.t0(kz5.n0.t0(kz5.n0.t0(f6Var.wi(), f6Var.Ri()), f6Var.Di()), f6Var.Ai());
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s07, "MagicAdMiniProgram")) {
            t07 = kz5.n0.t0(kz5.n0.t0(kz5.n0.t0(f6Var.wi(), f6Var.Ri()), f6Var.Di()), f6Var.Ai());
            try {
                xj.p Di = ((wj.g1) ((wj.m) i95.n0.c(wj.m.class))).Di();
                if (Di != xj.p.f536300g && Di != xj.p.f536301h) {
                    z17 = false;
                }
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiExtFeature", "[MBAd] strategy=" + Di + ": register navigateToMiniProgram serverJsApi");
                    t07 = kz5.n0.t0(t07, kz5.b0.c(new md3.p()));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiExtFeature", "[MBAd] strategy=" + Di + ", skip serverJsApi registration");
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MBJsApiExtFeature", "[MBAd] provideAdMiniProgramServerJsApi failed: " + e17.getMessage());
            }
        } else {
            t07 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s07, "MagicWeAppMagicBrushFrame") ? kz5.n0.t0(f6Var.wi(), f6Var.Ai()) : kz5.n0.t0(kz5.n0.t0(kz5.n0.t0(kz5.n0.t0(kz5.n0.t0(kz5.n0.t0(f6Var.wi(), f6Var.Bi()), f6Var.Ri()), f6Var.Di()), f6Var.Ai()), kz5.b0.c(new fd3.b(id3.a.class))), kz5.b0.c(new jd3.g()));
        }
        int d17 = kz5.b1.d(kz5.d0.q(t07, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        for (java.lang.Object obj : t07) {
            linkedHashMap.put(((lc3.c0) obj).f(), obj);
        }
        this.M = linkedHashMap;
        this.N = jz5.h.b(new sc3.c(this));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MBBizServer_");
        java.lang.String instanceName2 = this.f488009e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName2, "instanceName");
        sb6.append(r26.n0.s0(instanceName2, "-", instanceName2).concat(r26.p0.F0(r26.n0.p0(instanceName2, "-", ""), 5)));
        this.Q = sb6.toString();
        this.R = jz5.h.b(sc3.u.f488069d);
        this.V = new sc3.w(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5 a5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229369a;
        java.lang.String instanceName3 = this.f488009e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName3, "instanceName");
        java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229373e;
        synchronized (set) {
            set.add(instanceName3);
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229372d = a5Var.a(set);
        }
        this.X = new sc3.d(this);
    }

    @Override // bl.a
    public com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5131x1c4cfc5e A(java.lang.String[] strArr, java.util.Map map) {
        boolean z17 = true;
        if (strArr != null) {
            if (!(strArr.length == 0)) {
                z17 = false;
            }
        }
        if (z17) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            jc3.x xVar = this.f488019r;
            if (xVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgManagement");
                throw null;
            }
            lc3.k0 c17 = xVar.c(str, map);
            if (c17 != null) {
                arrayList.add(c17);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5131x1c4cfc5e c5131x1c4cfc5e = new com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5131x1c4cfc5e();
        c5131x1c4cfc5e.f21474xcf632f24 = (java.lang.String) ((jz5.n) this.K).mo141623x754a37bb();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lc3.k0 k0Var = (lc3.k0) it.next();
            com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5135x5683f13e c5135x5683f13e = new com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5135x5683f13e();
            c5135x5683f13e.f21478xbeaa57e7 = k0Var.f399439b;
            c5135x5683f13e.f21479xaee3fa51 = k0Var.f399438a;
            arrayList2.add(c5135x5683f13e);
        }
        c5131x1c4cfc5e.fds = (com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5135x5683f13e[]) arrayList2.toArray(new com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5135x5683f13e[0]);
        return c5131x1c4cfc5e;
    }

    @Override // lc3.h0
    public void C0(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1833x2e06d1.C16422xf998446d event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        s2(event.f229414d, event.f229415e);
    }

    @Override // qc3.f
    public void D1() {
        jz5.f0 f0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.Q, "start");
        sc3.i1 i1Var = new sc3.i1(this);
        if (!O0()) {
            jc3.x xVar = this.f488019r;
            if (xVar != null) {
                xVar.f(i1Var);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgManagement");
                throw null;
            }
        }
        synchronized (this) {
            java.util.List list = this.B;
            if (list != null) {
                i1Var.mo146xb9724478(list);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.Q, "hy: parallel reading not ready. pending wait");
                this.C = i1Var;
            }
            this.B = null;
        }
    }

    @Override // lc3.h0
    public void E0(java.lang.String script, android.webkit.ValueCallback valueCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(script, "script");
        if (this.G >= 2) {
            M0().mo14660x738236e6(script, valueCallback);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.Q, "evaluate discard, script is ".concat(r26.p0.E0(script, 100)));
        }
    }

    @Override // lc3.h0
    public void F0(java.lang.String api, java.lang.String data, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(api, "api");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.Q, "forwardJsApiToClient api:" + api + ", callbackId:" + i17);
        H0().j6(api, data, "", i17);
    }

    public final com.p314xaae8f345.p485x5dc4f1ad.a G0(java.lang.String str, vc3.a aVar, yz5.a aVar2, yg.b0 b0Var) {
        android.util.DisplayMetrics d17 = j65.f.d();
        com.p314xaae8f345.p485x5dc4f1ad.a aVar3 = new com.p314xaae8f345.p485x5dc4f1ad.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        f06.v[] vVarArr = com.p314xaae8f345.p485x5dc4f1ad.c0.I;
        aVar3.f130151t.b(aVar3, vVarArr[11], str);
        aVar3.e(gh.b.NativeLocker);
        f06.v vVar = vVarArr[9];
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        aVar3.f130149r.b(aVar3, vVar, bool);
        aVar3.f(this.f488024w.m43142xdc4f8f95());
        aVar3.f130135d.b(aVar3, vVarArr[0], java.lang.Float.valueOf(d17.density));
        aVar3.f130136e.b(aVar3, vVarArr[1], java.lang.Integer.valueOf((int) (d17.widthPixels / d17.density)));
        aVar3.f130137f.b(aVar3, vVarArr[2], java.lang.Integer.valueOf((int) (d17.heightPixels / d17.density)));
        aVar3.f130145n.b(aVar3, vVarArr[7], bool);
        aVar3.f130143l.b(aVar3, vVarArr[5], bool);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = this.f488015n;
        if (c16416x87606a7b == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("config");
            throw null;
        }
        aVar3.D.b(aVar3, vVarArr[21], java.lang.Boolean.valueOf(c16416x87606a7b.f229358o));
        aVar3.f130155x.b(aVar3, vVarArr[15], java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_minigame_enable_program_binary, 0) == 1));
        aVar3.G.b(aVar3, vVarArr[24], java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_mb_v2_enable_unified_cmdbuffer, 0) == 1));
        aVar3.F.b(aVar3, vVarArr[23], java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_mb_v2_enable_cmdbuffer_canvas, 0) == 1));
        aVar3.E.b(aVar3, vVarArr[22], java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_mb_v2_enable_cmdbuffer_canvas2d, 0) == 1));
        ((et.o) ((ft.b4) i95.n0.c(ft.b4.class))).getClass();
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l1.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "retrieveMBShaderCachePath(...)");
        aVar3.g(a17);
        f06.v vVar2 = vVarArr[16];
        com.p314xaae8f345.p485x5dc4f1ad.c cVar = aVar3.f130156y;
        java.lang.Object a18 = cVar.a(aVar3, vVar2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "<get-programBinaryPath>(...)");
        if (!android.text.TextUtils.isEmpty((java.lang.String) a18)) {
            java.lang.Object a19 = cVar.a(aVar3, vVarArr[16]);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a19, "<get-programBinaryPath>(...)");
            aVar3.g(java.lang.String.valueOf(com.p314xaae8f345.mm.vfs.w6.i((java.lang.String) a19, true)));
        }
        aVar3.f130154w.b(aVar3, vVarArr[14], java.lang.Float.valueOf(((java.lang.Number) ((jz5.n) Y).mo141623x754a37bb()).intValue()));
        aVar3.f130132a = this.f488008d;
        aVar3.f130134c = aVar2;
        java.lang.String D = lp0.b.D();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D, "DATAROOT_SDCARD_PATH(...)");
        aVar3.f130148q.b(aVar3, vVarArr[8], D);
        aVar3.f130133b = aVar;
        aVar3.f130140i = b0Var;
        aVar3.f130138g = new sc3.l(this);
        aVar3.f130157z.b(aVar3, vVarArr[17], bool);
        aVar3.A.b(aVar3, vVarArr[18], bool);
        aVar3.B.b(aVar3, vVarArr[19], new sc3.n());
        return aVar3;
    }

    public final qc3.c H0() {
        qc3.c cVar = this.f488013i;
        if (cVar != null) {
            return cVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("client");
        throw null;
    }

    @Override // qc3.f
    public void J5(int i17, java.lang.String result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5130x9c70410d c5130x9c70410d = this.f488020s;
        if (c5130x9c70410d != null) {
            c5130x9c70410d.mo43190x44c4dbad(i17, result, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.jf.b(null));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("jsBridge");
            throw null;
        }
    }

    public final boolean K0() {
        return ((java.lang.Boolean) ((jz5.n) this.I).mo141623x754a37bb()).booleanValue();
    }

    @Override // yg.b0
    public void M(com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 view, float[] left, float[] top, float[] width, float[] height) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(left, "left");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(top, "top");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(width, "width");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(height, "height");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.Q, "onSetTouchableRectList: count = " + left.length);
        H0().Bi(view.getVirtualElementId(), left, top, width, height);
    }

    public final vc3.a M0() {
        vc3.a aVar = this.f488018q;
        if (aVar != null) {
            return aVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("jsRuntime");
        throw null;
    }

    @Override // qc3.f
    public void M1(int i17, int i18, int i19, long j17, int[] pointerIds, float[] x17, float[] y17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pointerIds, "pointerIds");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(x17, "x");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(y17, "y");
        sc3.k1 k1Var = this.P;
        if (k1Var != null) {
            k1Var.M1(i17, i18, i19, j17, pointerIds, x17, y17);
            return;
        }
        int min = java.lang.Math.min(x17.length, y17.length);
        java.util.ArrayList arrayList = new java.util.ArrayList(min);
        int i27 = 0;
        for (int i28 = 0; i28 < min; i28++) {
            arrayList.add(new jz5.l(java.lang.Float.valueOf(x17[i28]), java.lang.Float.valueOf(y17[i28])));
        }
        int length = pointerIds.length;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(java.lang.Math.min(kz5.d0.q(arrayList, 10), length));
        for (java.lang.Object obj : arrayList) {
            if (i27 >= length) {
                break;
            }
            jz5.l lVar = (jz5.l) obj;
            arrayList2.add(new ch.c(pointerIds[i27], ((java.lang.Number) lVar.f384366d).floatValue(), ((java.lang.Number) lVar.f384367e).floatValue()));
            i27++;
        }
        M0().mo51545x3498a0(new sc3.p0(this, i17, i18, i19, j17, arrayList2));
    }

    public final oc3.a N0() {
        return (oc3.a) ((jz5.n) this.f488017p).mo141623x754a37bb();
    }

    public final boolean O0() {
        return ((java.lang.Boolean) ((jz5.n) this.E).mo141623x754a37bb()).booleanValue();
    }

    @Override // qc3.f
    public void Oc(int i17) {
        bf3.g0.f101160a.b(this.f488009e, new sc3.t(this, i17));
    }

    public final java.lang.String S0() {
        jz5.l[] lVarArr = new jz5.l[17];
        lVarArr[0] = new jz5.l("platform", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
        bf3.p0 p0Var = bf3.p0.f101178a;
        java.lang.Object mo141623x754a37bb = ((jz5.n) bf3.p0.f101182e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        lVarArr[1] = new jz5.l("brand", (java.lang.String) mo141623x754a37bb);
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) bf3.p0.f101183f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        lVarArr[2] = new jz5.l("model", (java.lang.String) mo141623x754a37bb2);
        lVarArr[3] = new jz5.l("system", android.os.Build.VERSION.RELEASE);
        lVarArr[4] = new jz5.l("pixelRatio", java.lang.Float.valueOf(p0Var.a()));
        java.lang.Object mo141623x754a37bb3 = ((jz5.n) bf3.p0.f101184g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
        lVarArr[5] = new jz5.l(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, (java.lang.String) mo141623x754a37bb3);
        java.lang.Object mo141623x754a37bb4 = ((jz5.n) bf3.p0.f101185h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
        lVarArr[6] = new jz5.l("version", (java.lang.String) mo141623x754a37bb4);
        lVarArr[7] = new jz5.l("fontSizeSetting", java.lang.Integer.valueOf(((java.lang.Number) ((jz5.n) bf3.p0.f101179b).mo141623x754a37bb()).intValue()));
        lVarArr[8] = new jz5.l("fontSizeScaleFactor", java.lang.Float.valueOf(((java.lang.Number) ((jz5.n) bf3.p0.f101180c).mo141623x754a37bb()).floatValue()));
        lVarArr[9] = new jz5.l("clientVersion", java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h));
        lVarArr[10] = new jz5.l("isDarkMode", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.ui.bk.C()));
        lVarArr[11] = new jz5.l("isDebugEnv", java.lang.Boolean.valueOf(z65.c.a()));
        lVarArr[12] = new jz5.l("bizName", this.D);
        lVarArr[13] = new jz5.l("maxFps", java.lang.Integer.valueOf(((java.lang.Number) ((jz5.n) Y).mo141623x754a37bb()).intValue()));
        lVarArr[14] = new jz5.l("USER_DATA_PATH", "wxfile://usr");
        lVarArr[15] = new jz5.l("experimental", kz5.c1.i(new jz5.l("supportCreateCanvasAheadOfTime", java.lang.Boolean.TRUE)));
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = this.f488015n;
        if (c16416x87606a7b == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("config");
            throw null;
        }
        lVarArr[16] = new jz5.l("customEnv", c16416x87606a7b.f229359p);
        return ";mb.env = " + new org.json.JSONObject(kz5.c1.k(lVarArr)) + ';';
    }

    @Override // bl.a
    public java.lang.String[] T() {
        return (java.lang.String[]) ((jz5.n) this.N).mo141623x754a37bb();
    }

    public final com.p159x477cd522.p160x333422.C1481x17e6a5e9 V0(lc3.g0 g0Var) {
        java.lang.String str;
        if (g0Var instanceof lc3.j0) {
            com.p159x477cd522.p160x333422.C1481x17e6a5e9 c1481x17e6a5e9 = new com.p159x477cd522.p160x333422.C1481x17e6a5e9();
            c1481x17e6a5e9.f4815xcdd276a5 = 3;
            c1481x17e6a5e9.f4814xcdd22c98 = ((lc3.j0) g0Var).f399436a;
            return c1481x17e6a5e9;
        }
        if (g0Var instanceof lc3.d) {
            com.p159x477cd522.p160x333422.C1481x17e6a5e9 c1481x17e6a5e92 = new com.p159x477cd522.p160x333422.C1481x17e6a5e9();
            c1481x17e6a5e92.f4815xcdd276a5 = 1;
            com.p159x477cd522.p160x333422.C1484x78647178 c1484x78647178 = new com.p159x477cd522.p160x333422.C1484x78647178();
            c1481x17e6a5e92.f4812xe7b4d2e9 = c1484x78647178;
            lc3.d dVar = (lc3.d) g0Var;
            c1484x78647178.f125528fd = dVar.f399426a.getParcelFileDescriptor().detachFd();
            c1481x17e6a5e92.f4812xe7b4d2e9.f4826x8926c395 = dVar.f399426a.getStartOffset();
            c1481x17e6a5e92.f4812xe7b4d2e9.f4825xbe0e3ae6 = dVar.f399426a.getLength();
            return c1481x17e6a5e92;
        }
        if (!(g0Var instanceof lc3.k0)) {
            throw new jz5.j();
        }
        com.p159x477cd522.p160x333422.C1481x17e6a5e9 c1481x17e6a5e93 = new com.p159x477cd522.p160x333422.C1481x17e6a5e9();
        c1481x17e6a5e93.f4815xcdd276a5 = 2;
        com.p159x477cd522.p160x333422.C1485x5683f13e c1485x5683f13e = new com.p159x477cd522.p160x333422.C1485x5683f13e();
        c1481x17e6a5e93.f4816xeca5f473 = c1485x5683f13e;
        lc3.k0 k0Var = (lc3.k0) g0Var;
        c1485x5683f13e.f4828xaee3fa51 = k0Var.f399438a;
        java.lang.String str2 = k0Var.f399439b;
        c1485x5683f13e.f4827xbeaa57e7 = str2;
        bf3.g0.f101160a.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "str");
        if (r26.i0.y(str2, "/", false)) {
            str2 = str2.substring(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "substring(...)");
        }
        c1481x17e6a5e93.f4813xcdcf61f6 = "https://mm.tencent.com/".concat(str2);
        jc3.x xVar = this.f488019r;
        if (xVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgManagement");
            throw null;
        }
        java.lang.String d17 = xVar.d();
        if (d17.length() > 0) {
            str = d17 + '_' + str2;
        } else {
            str = "";
        }
        c1481x17e6a5e93.f4809xe6292f7d = str;
        c1481x17e6a5e93.f4808x7f1f2ea0 = this.D;
        c1481x17e6a5e93.f4810xdf0121dc = 0;
        return c1481x17e6a5e93;
    }

    @Override // bl.a
    public void W(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.Q, "onWorkerDestroyed, workerId: " + i17);
        this.f488023v.remove(java.lang.Integer.valueOf(i17));
    }

    public final void X0(java.lang.String msg, java.lang.String stack, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stack, "stack");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.Q, source + ": " + msg + '\n' + stack);
        java.lang.String str = stack.length() == 0 ? msg : stack;
        if (r26.n0.B(str, "illegal access", false)) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(ya.b.f77502x92235c1b, source);
        jSONObject.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, msg);
        jSONObject.put("stack", stack);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        s2("onJsError", jSONObject2);
        H0().h("", str);
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put(ya.b.f77502x92235c1b, source);
        he3.e eVar = (he3.e) ((ie3.i) i95.n0.c(ie3.i.class));
        java.lang.String str2 = this.D;
        jSONObject3.put(str2, eVar.bj(str2));
        java.util.Iterator it = N0().f425861b.values().iterator();
        while (it.hasNext()) {
            java.lang.String appid = ((oc3.b) it.next()).f425863b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appid, "appid");
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(appid, "wxe208ce76dfa39515")) {
                appid = "MagicLiveCard";
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(appid, "wx2f3fb5db9f226462")) {
                appid = "MagicSclPublicService";
            }
            jSONObject3.put(appid, ((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).bj(appid));
        }
        je3.k kVar = je3.k.f380831e;
        java.lang.String str3 = this.D;
        java.lang.String jSONObject4 = jSONObject3.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
        kVar.T5(str3, "js-exception", str, jSONObject4, 1.0f);
    }

    public void Y0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.Q, "onStarted");
        this.G = 4;
        this.f488024w.m43154x5513f0d6();
        com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad = this.f488021t;
        if (c4209xd2d3ddad != null) {
            c4209xd2d3ddad.f();
        }
        H0().n();
        if (K0()) {
            ((xz1.k) ((qk.v6) i95.n0.c(qk.v6.class))).Ai((qk.u6) ((jz5.n) this.H).mo141623x754a37bb());
        }
    }

    @Override // yg.b0
    public com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 Z() {
        com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad = this.f488021t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4209xd2d3ddad);
        pc3.c cVar = new pc3.c(this.f488008d, c4209xd2d3ddad);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f488022u;
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2 = cVar.f434905f;
        concurrentHashMap.put(java.lang.Integer.valueOf(c4216x654bedf2.getVirtualElementId()), cVar);
        return c4216x654bedf2;
    }

    @Override // yg.b0
    public void a0(com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 view, int i17, int i18, int i19, int i27, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        H0().C3(view.getVirtualElementId(), i17, i18, i19, i27, i28);
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.W;
    }

    @Override // bl.a
    public java.lang.String c0(java.lang.String api, java.lang.String data, java.lang.String privateData, int i17, boolean z17, int i18, int i19) {
        com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5130x9c70410d c5130x9c70410d;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(api, "api");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(privateData, "privateData");
        if (i18 > 0) {
            c5130x9c70410d = (uc3.e) this.f488023v.get(java.lang.Integer.valueOf(i18));
            if (c5130x9c70410d == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.Q, "worker bridge not found for workerId: " + i18);
                return "";
            }
        } else {
            c5130x9c70410d = this.f488020s;
            if (c5130x9c70410d == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("jsBridge");
                throw null;
            }
        }
        if (i18 > 0 && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(api, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.oe.f34575x24728b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.Q, "jsapi is not supported in worker " + i18);
            return "";
        }
        if (this.G == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.Q, "invoke jsapi " + api + " after destroy with data: " + data);
            c5130x9c70410d.mo43190x44c4dbad(i17, "{\"errMsg\":\"Not handled\", \"errCode\": -1}", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.jf.b(null));
            return "";
        }
        java.util.Map map = (java.util.Map) ((jz5.n) this.L).mo141623x754a37bb();
        if (map != null && ((java.lang.String) map.get(api)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.Q, "invoke jsapi " + api + " have not permission");
            c5130x9c70410d.mo43190x44c4dbad(i17, "{\"errMsg\":\"no permission\", \"errCode\": -5}", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.jf.b(null));
            return "";
        }
        try {
            lc3.c0 c0Var = (lc3.c0) ((java.util.LinkedHashMap) this.M).get(api);
            if (c0Var != null) {
                if (c0Var instanceof lc3.b0) {
                    lc3.b0 r17 = ((lc3.b0) c0Var).r();
                    r17.f399423a = this;
                    r17.o(this.f488014m);
                    r17.f399419d = new sc3.f0(c5130x9c70410d, i17);
                    r17.t(new lc3.a0(data));
                    return "";
                }
                if (!(c0Var instanceof lc3.d0)) {
                    throw new java.lang.IllegalAccessError("Illegal jsapi");
                }
                c0Var.f399423a = this;
                c0Var.o(this.f488014m);
                java.lang.String a17 = ((lc3.d0) c0Var).r(new lc3.a0(data)).a();
                c0Var.f399423a = null;
                c5130x9c70410d.mo43190x44c4dbad(i17, a17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.jf.b(null));
                return "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = this.f488015n;
            if (c16416x87606a7b == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("config");
                throw null;
            }
            java.util.Iterator it = c16416x87606a7b.f229350d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((jz5.l) obj).f384366d, api)) {
                    break;
                }
            }
            jz5.l lVar = (jz5.l) obj;
            if (lVar != null) {
                if (((java.lang.Boolean) lVar.f384367e).booleanValue()) {
                    c5130x9c70410d.mo43190x44c4dbad(i17, H0().ih(api, data, privateData), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.jf.b(null));
                    return "";
                }
                H0().j6(api, data, privateData, i17);
                return "";
            }
            jc3.n nVar = this.f488016o;
            if (nVar != null) {
                return nVar.B(api, data, privateData, i17);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mbAdaptor");
            throw null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.Q, e17, "Catch jsapi exception " + api + ", data = " + data, new java.lang.Object[0]);
            ((ku5.t0) ku5.t0.f394148d).B(new sc3.g0(e17));
            return "{\"errMsg\":\"jsapi exception\", \"errCode\": -4}";
        }
    }

    @Override // qc3.f
    public void cj(int i17, int i18, int i19) {
        sc3.k1 k1Var = this.P;
        if (k1Var != null) {
            k1Var.cj(i17, i18, i19);
        } else {
            M0().mo51545x3498a0(new sc3.w0(this, i17, i18, i19));
        }
    }

    @Override // bl.a
    public void e() {
        M0().e();
    }

    @Override // qc3.f
    public void fj(int i17, java.lang.String result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = ue3.b.f508424a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushJsApiMMKVUtil", "fetch data by key:".concat(result));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = ue3.b.f508424a;
        java.lang.String t17 = o4Var2.t(result);
        o4Var2.W(result);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t17);
        J5(i17, t17);
    }

    public final void g1(final yz5.a r17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r17, "r");
        M0().mo51545x3498a0(new java.lang.Runnable(r17) { // from class: sc3.z0

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f488087d;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r17, "function");
                this.f488087d = r17;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f488087d.mo152xb9724478();
            }
        });
    }

    @Override // bl.a
    public boolean h0(int i17, java.lang.String moduleName, java.lang.String paramsJson) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleName, "moduleName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paramsJson, "paramsJson");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.Q, "lazy load module ".concat(moduleName));
        if (i17 > 0) {
            return false;
        }
        int hashCode = moduleName.hashCode();
        if (hashCode != -1809564299) {
            if (hashCode != -1425794666) {
                if (hashCode != -937619447 || !moduleName.equals("Profiler")) {
                    return false;
                }
                if (this.f488021t == null) {
                    g1(new sc3.i(this));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(this.f488021t);
                }
            } else {
                if (!moduleName.equals("WeMedia")) {
                    return false;
                }
                synchronized (bf3.g0.f101160a) {
                    if (!bf3.g0.f101164e) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBServerUtil", "start load wemedia so");
                        ah.d.b("c++_shared");
                        ah.d.b("wxVcodec2");
                        ah.d.b("xffmpeg");
                        ah.d.b("mmmedia");
                        ah.d.b("wemedia");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBServerUtil", "load wemedia so done");
                        bf3.g0.f101164e = true;
                    }
                }
                java.lang.String str = this.Q;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initWeMedia");
                if (this.f488027z == null) {
                    kq5.c.f392820b = new sc3.x();
                    kq5.g.f392821a = new sc3.y();
                    java.lang.String str2 = com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.vfs.q7.c("magicPath"), true) + "/wemedia/";
                    com.p314xaae8f345.mm.p2815x498e71d6.C22932xe093580f c22932xe093580f = new com.p314xaae8f345.mm.p2815x498e71d6.C22932xe093580f(this.f488008d);
                    c22932xe093580f.m83432x316510(M0().L(), M0().G(), M0().z(), str2, new sc3.z(this));
                    this.f488027z = c22932xe093580f;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initWeMedia done");
                }
            }
        } else {
            if (!moduleName.equals("WXAUDIO")) {
                return false;
            }
            synchronized (bf3.g0.f101160a) {
                if (!bf3.g0.f101163d) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBServerUtil", "start load web audio so");
                    ah.d.b("c++_shared");
                    ah.d.b("xffmpeg");
                    ah.d.b("wxaudio");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBServerUtil", "load web audio so done");
                    com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.m46435x2d426967(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets());
                    bf3.g0.f101163d = true;
                }
            }
            com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc c10824x1e0081cc = new com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc(M0().L(), M0().G(), M0().z());
            c10824x1e0081cc.m46444x8696a1b5(new sc3.b0(this));
            this.f488026y = c10824x1e0081cc;
        }
        return true;
    }

    @Override // bl.a
    public boolean j() {
        return M0().j();
    }

    @Override // bl.a
    public java.lang.String k(int i17, long j17, long j18, long j19) {
        java.lang.String str = this.Q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onWorkerCreated, workerId: " + i17 + ", isolatePtr: " + j17 + ", contextPtr: " + j18 + ", uvPtr: " + j19);
        java.lang.String str2 = ik1.f.e("magic_emoji/magic_brush_common_lib.js") + S0();
        vc3.k kVar = new vc3.k(this.f488024w, i17, j17, j18, j19);
        this.f488023v.put(java.lang.Integer.valueOf(i17), new uc3.e(this.f488024w, i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = this.f488015n;
        if (c16416x87606a7b == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("config");
            throw null;
        }
        if (c16416x87606a7b.f229355i) {
            try {
                java.lang.String bizName = this.D;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
                com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad h17 = G0("MB.Worker.".concat(r26.p0.E0(r26.n0.W(bizName, "Magic"), 5)), kVar, new sc3.m0(j17, j18, j19), null).h();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h17);
                h17.f();
                h17.f130112c = this.f488021t;
                s1(h17, "MagicBrush-Worker");
                kVar.O(new sc3.k0(h17));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "Worker MagicBrush created for workerId: " + i17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "Failed to create worker MagicBrush, workerId: " + i17, e17);
                d75.b.g(new sc3.l0(e17));
            }
        }
        return str2;
    }

    @Override // bl.a
    public java.nio.ByteBuffer l0(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        bf3.g0 g0Var = bf3.g0.f101160a;
        jc3.x xVar = this.f488019r;
        if (xVar != null) {
            return g0Var.c(xVar, path);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgManagement");
        throw null;
    }

    public final void m1(qc3.c client) {
        long j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(client, "client");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.Q, "setRemoteMBClient instance:" + this.f488009e);
        this.f488013i = new tc3.u(this.f488009e, client, new sc3.b1(this));
        this.W = new tc3.m0(this);
        try {
            android.os.IBinder asBinder = H0().asBinder();
            if (asBinder != null) {
                asBinder.linkToDeath(this.X, 0);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.Q, "link client binder death failed: " + e17);
        }
        try {
            j17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_mb_auto_ping_interval_ms, 0L);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.Q, "heartbeat expt read failed, fallback disabled: " + th6);
            j17 = 0L;
        }
        if (j17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.Q, "heartbeat not enabled (intervalMs=" + j17 + "), skip instance:" + this.f488009e);
            return;
        }
        if (this.S) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.Q, "heartbeat already started, skip instance:" + this.f488009e);
            return;
        }
        this.U = j17;
        this.S = true;
        this.T = 0L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.Q, "heartbeat start instance:" + this.f488009e + ", intervalMs=" + j17);
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) this.R).mo141623x754a37bb()).mo50297x7c4d7ca2(this.V, this.U);
    }

    @Override // bl.a
    public java.lang.String o0(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        jc3.x xVar = this.f488019r;
        if (xVar != null) {
            return xVar.a(str);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgManagement");
        throw null;
    }

    /* renamed from: onCreated */
    public void mo164293x8cf48009() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.w wVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.Q, "onCreated");
        com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5130x9c70410d c5130x9c70410d = this.f488020s;
        if (c5130x9c70410d == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("jsBridge");
            throw null;
        }
        c5130x9c70410d.mo43187xe258f33c(M0().L(), M0().G(), "JSBridge", true);
        com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5130x9c70410d c5130x9c70410d2 = this.f488020s;
        if (c5130x9c70410d2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("jsBridge");
            throw null;
        }
        c5130x9c70410d2.mo43192xf5827fa9(new sc3.h0(this));
        this.G = 2;
        M0().mo14660x738236e6("\n        JSBridge.on(\"onJsError\", function(res) {\n            if (res.stack == '') {\n                console.error(res.message);\n            } else {\n                console.error(res.stack);\n            }\n        });\n        JSBridge.on('devtools:receive', function(msg) {\n            const devtools = global.DevtoolsMessage;\n            if (devtools && devtools.onreceive) {\n                devtools.onreceive.call(devtools, msg);\n            }\n        });\n    ", null);
        if (K0() && (wVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.w) M0().h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.w.class)) != null) {
            cl.q0 n07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) wVar).n0();
            n07.getClass();
            ((cl.a) n07.f124257b).h(new cl.RunnableC1400x64ebda2(n07, "_console"), false);
        }
        M0().mo171467x65825f6();
        H0().mo159828x8cf48009();
    }

    /* renamed from: onDestroy */
    public void mo164294xac79a11b(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.Q, "onDestroy, reason " + i17);
        v1();
        this.G = 1;
        this.P = null;
        if (t1(i17)) {
            H0().mo159829xac79a11b();
        }
        jc3.x xVar = this.f488019r;
        if (xVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgManagement");
            throw null;
        }
        xVar.mo66315x41012807();
        this.f488010f.c();
        com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5130x9c70410d c5130x9c70410d = this.f488020s;
        if (c5130x9c70410d == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("jsBridge");
            throw null;
        }
        c5130x9c70410d.mo43188x2c3bba7e();
        ((com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.p629xaddb9440.C5136x9c8c9fbe) ((jz5.n) this.f488025x).mo141623x754a37bb()).b();
        synchronized (this) {
            com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad = this.f488021t;
            if (c4209xd2d3ddad != null) {
                c4209xd2d3ddad.r();
            }
        }
        this.f488024w.m43151x68d28c71();
        com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc c10824x1e0081cc = this.f488026y;
        if (c10824x1e0081cc != null) {
            c10824x1e0081cc.m46445xbc3bfb13();
        }
        com.p314xaae8f345.mm.p2815x498e71d6.C22932xe093580f c22932xe093580f = this.f488027z;
        if (c22932xe093580f != null) {
            c22932xe093580f.m83437x36c75a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5 a5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229369a;
        java.lang.String instanceName = this.f488009e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229373e;
        synchronized (set) {
            set.remove(instanceName);
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229372d = a5Var.a(set);
        }
    }

    @Override // bl.a
    public java.nio.ByteBuffer p(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        if (path.length() == 0) {
            return null;
        }
        jc3.x xVar = this.f488019r;
        if (xVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgManagement");
            throw null;
        }
        byte[] bytes = xVar.a(path).getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        return java.nio.ByteBuffer.allocateDirect(bytes.length).put(bytes);
    }

    @Override // qc3.f
    public void pg(int i17, android.view.Surface surface, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        sc3.k1 k1Var = this.P;
        if (k1Var != null) {
            k1Var.pg(i17, surface, i18, i19);
        } else {
            M0().mo51545x3498a0(new sc3.u0(this, i17, surface, i18, i19));
        }
    }

    @Override // yg.b0
    public void q0(com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 view, int i17, int i18, int i19, int i27, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        H0().B8(view.getVirtualElementId(), i17, i18, i19, i27, i28);
    }

    @Override // bl.a
    public void r0(int i17, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (K0()) {
            ((xz1.k) ((qk.v6) i95.n0.c(qk.v6.class))).Di((qk.u6) ((jz5.n) this.H).mo141623x754a37bb(), msg);
        }
    }

    public final void s1(com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad, java.lang.String str) {
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a()) {
            c4209xd2d3ddad.getClass();
        }
        c4209xd2d3ddad.f130121l.a(new sc3.d1(this, str));
        c4209xd2d3ddad.f130114e.mo17119xf75a4916(8192, 8192);
        c4209xd2d3ddad.f130114e.mo17100xcc2da62d(new sc3.e1(this), true);
        c4209xd2d3ddad.f130122m.a(new sc3.f1(this));
    }

    @Override // qc3.f
    public void s2(java.lang.String event, java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (this.G < 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.Q, "event " + event + " discard, data = " + r26.p0.E0(data, 100));
            return;
        }
        com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5130x9c70410d c5130x9c70410d = this.f488020s;
        if (c5130x9c70410d == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("jsBridge");
            throw null;
        }
        bf3.g0.f101160a.getClass();
        c5130x9c70410d.mo43193xc5c86aa0(event, data, 0, "{\"nativeTime\": " + java.lang.System.currentTimeMillis() + '}');
    }

    @Override // qc3.f
    /* renamed from: setMute */
    public void mo159830x764d819b(boolean z17) {
        M0().Z(new sc3.a1(this, z17));
    }

    public boolean t1(int i17) {
        return i17 == 1;
    }

    @Override // qc3.f
    public void uc() {
        yz5.p pVar = this.f488011g;
        if (pVar != null) {
            pVar.mo149xb9724478(this.f488009e, java.lang.Boolean.FALSE);
        }
        if (bf3.h0.a(this.G, 8)) {
            return;
        }
        M0().Z(new sc3.x0(this));
        M0().C(-8);
        M0().mo171468xc84dc82d();
        M0().mo51545x3498a0(new sc3.y0(this));
        this.G = 4;
    }

    public final void v1() {
        if (this.S) {
            this.S = false;
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) this.R).mo141623x754a37bb()).mo50300x3fa464aa(this.V);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.Q, "heartbeat stop instance:" + this.f488009e + ", totalTick=" + this.T);
        }
    }

    @Override // yg.b0
    public void w0(com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        pc3.c cVar = (pc3.c) this.f488022u.remove(java.lang.Integer.valueOf(view.getVirtualElementId()));
        if (cVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBRendererView", "destroy");
            android.view.Surface surface = cVar.f434904e;
            if (surface == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MBRendererView", "destroyService: try to destroy an empty surface");
            } else {
                cVar.f434904e = null;
                gh.t tVar = cVar.f434903d;
                if (tVar != null) {
                    tVar.a(surface, false);
                }
            }
            cVar.f434903d = null;
        }
        H0().K3(view.getVirtualElementId());
    }

    @Override // qc3.f
    public void w3(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        java.lang.String str = this.Q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "setupConfig");
        this.f488015n = config;
        java.lang.String str2 = config.f229353g;
        if (str2 == null) {
            str2 = "";
        }
        oc3.c cVar = this.f488014m;
        cVar.getClass();
        cVar.f425865b = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "postConfig callerProcessName: " + cVar.f425865b);
        bf3.g0.f101160a.b(this.f488009e, new sc3.t0(this, config));
    }

    @Override // qc3.f
    public void w9(java.lang.String script, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(script, "script");
        if (this.G < 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.Q, "evaluate discard, script is ".concat(r26.p0.E0(script, 100)));
        } else if (i17 > 0) {
            M0().mo14660x738236e6(script, new sc3.r(this, i17));
        } else {
            M0().mo14660x738236e6(script, null);
        }
    }

    @Override // qc3.f
    public void yd(int i17) {
        sc3.k1 k1Var = this.P;
        if (k1Var != null) {
            k1Var.yd(i17);
        } else {
            M0().mo51545x3498a0(new sc3.v0(this, i17));
        }
    }

    @Override // qc3.f
    public void z3() {
        yz5.p pVar = this.f488011g;
        if (pVar != null) {
            pVar.mo149xb9724478(this.f488009e, java.lang.Boolean.TRUE);
        }
        if (bf3.h0.a(this.G, 4)) {
            return;
        }
        M0().mo51545x3498a0(new sc3.o0(this));
        M0().C(10);
        M0().mo171467x65825f6();
        M0().Z(new sc3.n0(this));
        this.G = 8;
    }
}
