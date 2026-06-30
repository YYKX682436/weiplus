package x11;

/* loaded from: classes12.dex */
public final class t implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {
    public static boolean F;
    public java.lang.Long A;
    public java.lang.Thread B;
    public final jz5.g C;

    /* renamed from: d, reason: collision with root package name */
    public final w11.k0 f532923d;

    /* renamed from: e, reason: collision with root package name */
    public int f532924e;

    /* renamed from: f, reason: collision with root package name */
    public int f532925f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f532926g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f532927h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f532928i;

    /* renamed from: m, reason: collision with root package name */
    public final r45.iu4 f532929m;

    /* renamed from: n, reason: collision with root package name */
    public int f532930n;

    /* renamed from: o, reason: collision with root package name */
    public int f532931o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f532932p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f532933q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f532934r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Queue f532935s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f532936t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f532937u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f532938v;

    /* renamed from: w, reason: collision with root package name */
    public long f532939w;

    /* renamed from: x, reason: collision with root package name */
    public long f532940x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f532941y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f532942z;
    public static final x11.g D = new x11.g(null);
    public static final jz5.g E = jz5.h.b(x11.c.f532885d);
    public static final jz5.g G = jz5.h.b(x11.d.f532888d);
    public static final jz5.g H = jz5.h.b(x11.b.f532882d);
    public static final jz5.g I = jz5.h.b(x11.e.f532889d);

    /* renamed from: J, reason: collision with root package name */
    public static final jz5.g f532922J = jz5.h.b(x11.f.f532891d);

    public t(w11.k0 initScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initScene, "initScene");
        this.f532923d = initScene;
        this.f532929m = new r45.iu4();
        this.f532932p = new java.util.HashMap();
        this.f532934r = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(gm0.j1.e().a(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) this, true);
        this.f532935s = new java.util.LinkedList();
        this.f532936t = jz5.h.b(x11.j.f532909d);
        this.f532937u = jz5.h.b(new x11.k(this));
        this.f532938v = jz5.h.b(new x11.m(this));
        this.f532942z = jz5.h.b(new x11.h(this));
        this.C = jz5.h.b(x11.l.f532911d);
    }

    public final x11.f0 a() {
        return (x11.f0) ((jz5.n) this.f532938v).mo141623x754a37bb();
    }

    public final boolean b() {
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SYNC_CONTROL_USE_INIT_CONTACT_INT_SYNC, null);
        java.lang.Integer num = m17 instanceof java.lang.Integer ? (java.lang.Integer) m17 : null;
        return D.c() && (num != null ? num.intValue() : 0) != 0;
    }

    public final void c(int i17, int i18, java.lang.String str) {
        this.f532928i = true;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f532927h;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i17, i18, str, this.f532923d);
        }
        a().c(i17, i18, this.f532930n, this.f532924e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneInit.dkInit", "removeBlockDetect");
        ((ku5.t0) ku5.t0.f394148d).A("initBlockDetector");
        this.f532941y = true;
    }

    public final void d(r45.b50 b50Var) {
        if (b50Var == null) {
            return;
        }
        java.util.HashMap hashMap = this.f532932p;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(b50Var.f452063d);
        java.lang.Integer num = (java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(b50Var.f452063d));
        if (num == null) {
            num = 0;
        }
        hashMap.put(valueOf, java.lang.Integer.valueOf(num.intValue() + 1));
        this.f532931o++;
    }

    public final void e(boolean z17) {
        this.f532923d.m48022x4479fa06().d(true);
        if (!z17) {
            c(3, -1, "");
        } else {
            this.f532926g = true;
            f(new x11.w(a(), 0, 0, "", this.f532923d));
        }
    }

    public final void f(x11.a aVar) {
        ((jz5.n) this.f532942z).mo141623x754a37bb();
        if (((java.lang.Boolean) ((jz5.n) this.f532936t).mo141623x754a37bb()).booleanValue()) {
            if (!this.f532933q) {
                a().d();
            }
            ((ku5.t0) ku5.t0.f394148d).h(new x11.s(this, aVar), w11.h2.f523583f);
            return;
        }
        ((java.util.LinkedList) this.f532935s).add(aVar);
        if (this.f532934r.e()) {
            a().d();
            this.f532934r.c(50L, 50L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x11.t.g():boolean");
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        return g();
    }
}
