package vz4;

/* loaded from: classes8.dex */
public class x implements kh0.h {

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.regex.Pattern f523285u = java.util.regex.Pattern.compile(".*#.*wechat_redirect");

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f523286a;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f523288c;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.s f523290e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda f523291f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.c f523292g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc f523293h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.m f523294i;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.d f523297l;

    /* renamed from: o, reason: collision with root package name */
    public long f523300o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f523302q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f523303r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f523304s;

    /* renamed from: b, reason: collision with root package name */
    public long f523287b = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f523289d = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f523295j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f523296k = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f523298m = false;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Set f523299n = new java.util.HashSet();

    /* renamed from: p, reason: collision with root package name */
    public boolean f523301p = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f523305t = false;

    public x() {
        java.util.Map map = vz4.s.f523277a;
        if (!com.p314xaae8f345.mm.p794xb0fa9b5e.d0.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.a("", new vz4.p());
        }
        this.f523294i = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.m();
        if (vz4.s.f523279c == 0) {
            vz4.b.b();
        }
        vz4.s.f523279c++;
        vz4.t tVar = new vz4.t(this);
        this.f523292g = tVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.h.f269865a.add(new java.lang.ref.WeakReference(tVar));
    }

    public final void a() {
        this.f523301p = false;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.e0) ((s43.k) i95.n0.c(s43.k.class))).Ai(this.f523288c);
    }

    public java.lang.String b() {
        return vz4.b.a();
    }

    public boolean c() {
        return this.f523289d;
    }

    public boolean d(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        if (f523285u.matcher(str).find()) {
            return false;
        }
        return this.f523289d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean e(java.lang.String str, boolean z17, boolean z18) {
        this.f523304s = z18;
        this.f523286a = str;
        java.lang.Object obj = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.f270034a;
        this.f523288c = kh0.i.a(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.s b17 = vz4.s.b(str, z17);
        int i17 = b17.f269928a;
        if ((i17 == 0) == true) {
            this.f523290e = b17;
            this.f523289d = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda c19543x781c5eda = b17.f269995d;
            this.f523291f = c19543x781c5eda;
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.c("WepkgUsed", this.f523286a, this.f523288c, c19543x781c5eda.f269909f, 2L, 0L, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.c("EnterWeb", this.f523286a, this.f523288c, this.f523291f.f269909f, 1L, 0L, null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.c("WepkgUsed", this.f523286a, this.f523288c, b17.f269930c, 3L, 0L, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.d(i17));
        }
        if (b17.f269929b) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.c("WepkgUsed", this.f523286a, this.f523288c, b17.f269930c, 1L, 0L, null);
        }
        java.lang.String str2 = this.f523286a;
        java.lang.String str3 = this.f523288c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda c19543x781c5eda2 = this.f523291f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.c("WepkgUsed", str2, str3, c19543x781c5eda2 != null ? c19543x781c5eda2.f269909f : "", 0L, 0L, null);
        if (this.f523289d && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f523288c)) {
            boolean z19 = ((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).wi(e42.d0.clicfg_game_open_page_cache, 0) == 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WePkgPlugin", "isOpenPageCache:%b", java.lang.Boolean.valueOf(z19));
            if (z19) {
                s43.k kVar = (s43.k) i95.n0.c(s43.k.class);
                java.lang.String str4 = this.f523288c;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.e0) kVar).getClass();
                java.lang.String b18 = ew4.c.c().b(str4);
                this.f523302q = b18;
                if (b18 != null && b18.length() < 8) {
                    this.f523302q = null;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WePkgPlugin", "wepkgAvailable:%s, pkgId:%s", java.lang.Boolean.valueOf(this.f523289d), this.f523288c);
        if (this.f523293h == null) {
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc b19 = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc.b(str);
            this.f523293h = b19;
            b19.f149717q = kh0.i.a(str);
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc c10723x8ab106bc = this.f523293h;
            c10723x8ab106bc.f149710g = this.f523289d ? 1 : 0;
            c10723x8ab106bc.M = vz4.b.a();
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc c10723x8ab106bc2 = this.f523293h;
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda c19543x781c5eda3 = this.f523291f;
            c10723x8ab106bc2.N = c19543x781c5eda3 != null ? c19543x781c5eda3.f269909f : "";
        }
        return this.f523289d;
    }

    public void f(android.webkit.ConsoleMessage consoleMessage) {
        this.f523296k = true;
        java.lang.String message = consoleMessage != null ? consoleMessage.message() : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(message) || !message.equalsIgnoreCase("weixin://whiteScreenEnd")) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WePkgPlugin", "mIsReceivedWhiteScreenEnd: true");
        this.f523295j = true;
    }

    public void g(boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f523303r;
        if (b4Var != null) {
            b4Var.d();
        }
        if (z17 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f523288c)) {
            ((java.util.HashMap) vz4.s.f523277a).remove(this.f523288c);
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.i.c().e(this.f523288c, 2, 1);
        }
        int i17 = vz4.s.f523279c - 1;
        vz4.s.f523279c = i17;
        if (i17 == 0) {
            ((java.util.HashMap) vz4.s.f523277a).clear();
            vz4.b.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.h.b(this.f523292g);
    }

    public void h(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda c19543x781c5eda;
        if (this.f523287b != 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f523287b;
            java.lang.Object obj = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.f270034a;
            java.lang.String a17 = kh0.i.a(str);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.c("PageLoadTime", str, "", null, 2L, currentTimeMillis, null);
            } else if (!this.f523289d || (c19543x781c5eda = this.f523291f) == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.c("PageLoadTime", str, a17, null, 0L, currentTimeMillis, null);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.c("PageLoadTime", str, c19543x781c5eda.f269907d, c19543x781c5eda.f269909f, 1L, currentTimeMillis, null);
            }
            this.f523287b = 0L;
        }
        if (!this.f523289d || this.f523290e == null || this.f523304s) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f523302q)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.s sVar = this.f523290e;
            sVar.getClass();
            java.lang.Object obj2 = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.f270034a;
            com.p314xaae8f345.p3210x3857dc.y0 a18 = sVar.a(kh0.i.b(str));
            if (a18 != null) {
                java.io.InputStream inputStream = a18.f302159f;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused) {
                    }
                }
                z17 = true;
            } else {
                z17 = false;
            }
            if (!z17) {
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WePkgPlugin", "startTimer");
        if (this.f523303r == null) {
            this.f523303r = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new vz4.w(this), false);
        }
        this.f523303r.c(1000L, 1000L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (r0 != null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.p3210x3857dc.y0 i(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 r18, java.lang.String r19, com.p314xaae8f345.p3210x3857dc.x0 r20) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vz4.x.i(com.tencent.xweb.WebView, java.lang.String, com.tencent.xweb.x0):com.tencent.xweb.y0");
    }
}
