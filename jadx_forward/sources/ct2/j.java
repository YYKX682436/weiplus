package ct2;

/* loaded from: classes3.dex */
public final class j extends mm2.e {
    public int A;
    public float B;
    public boolean C;
    public boolean D;
    public p3325xe03a0797.p3326xc267989b.r2 E;
    public final jz5.g F;
    public long G;

    /* renamed from: f, reason: collision with root package name */
    public boolean f303798f;

    /* renamed from: g, reason: collision with root package name */
    public long f303799g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 f303800h;

    /* renamed from: i, reason: collision with root package name */
    public int f303801i;

    /* renamed from: m, reason: collision with root package name */
    public int f303802m;

    /* renamed from: n, reason: collision with root package name */
    public kn0.m f303803n;

    /* renamed from: o, reason: collision with root package name */
    public kn0.k f303804o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f303805p;

    /* renamed from: q, reason: collision with root package name */
    public int f303806q;

    /* renamed from: r, reason: collision with root package name */
    public int f303807r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f303808s;

    /* renamed from: t, reason: collision with root package name */
    public int f303809t;

    /* renamed from: u, reason: collision with root package name */
    public int f303810u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f303811v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f303812w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f303813x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f303814y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f303815z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f303800h = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
        this.f303803n = kn0.m.f391106d;
        new r45.nw1();
        this.f303804o = kn0.k.f391099d;
        this.f303810u = -1;
        this.f303814y = "";
        this.f303815z = "";
        this.B = 1.0f;
        this.F = jz5.h.b(ct2.i.f303797d);
    }

    public static int U6(ct2.j jVar, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            i17 = 1;
        }
        jVar.getClass();
        ne2.c cVar = ne2.c.f418060a;
        r45.td2 td2Var = (r45.td2) jVar.P6().m75936x14adae67(27);
        if (((java.lang.Boolean) ((jz5.n) ne2.c.f418061b).mo141623x754a37bb()).booleanValue()) {
            return 180;
        }
        return cm2.a.f124861a.j(td2Var, i17);
    }

    public final java.lang.String N6() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) m147920xbba4bfc0(mm2.c1.class)).f410379n;
        java.lang.String m76836x6c03c64c = c19792x256d2725 != null ? c19792x256d2725.m76836x6c03c64c() : null;
        return m76836x6c03c64c == null ? "" : m76836x6c03c64c;
    }

    public final long O6() {
        return P6().m75942xfb822ef2(0);
    }

    public final r45.nw1 P6() {
        return ((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).f410521r;
    }

    public final long Q6() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) m147920xbba4bfc0(mm2.c1.class)).f410379n;
        if (c19792x256d2725 != null) {
            return c19792x256d2725.m76784x5db1b11();
        }
        return 0L;
    }

    public final ct2.g R6() {
        return (ct2.g) ((jz5.n) this.F).mo141623x754a37bb();
    }

    public final int S6() {
        int i17 = this.f303807r;
        return i17 > 0 ? i17 : this.f303809t;
    }

    public final boolean T6() {
        if (N6().length() > 0) {
            java.lang.String N6 = N6();
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(N6, xy2.c.e(context))) {
                return true;
            }
        }
        return false;
    }

    public final void V6(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        if (i17 == 1) {
            this.G = java.lang.System.currentTimeMillis();
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0.hj((ml2.r0) c17, ml2.b4.J1, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
            return;
        }
        if (i17 != 2 || this.G == 0) {
            return;
        }
        jSONObject.put("pad_duration", java.lang.System.currentTimeMillis() - this.G);
        this.G = 0L;
        i95.m c18 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        ml2.r0.hj((ml2.r0) c18, ml2.b4.J1, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void W6(int i17) {
        if (i17 != this.f303810u) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveReplaySlice", "cacheReplayStatus from " + this.f303810u + " to " + i17);
        }
        this.f303810u = i17;
    }

    public final void X6(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveReplaySlice", "manualClose:" + z17);
        this.f303811v = z17;
    }

    public final void Y6(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveReplaySlice", "manualMinimum:" + z17);
        this.f303812w = z17;
    }

    public final void Z6(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveReplaySlice", "play offset:" + i17);
        je2.y yVar = (je2.y) m147920xbba4bfc0(je2.y.class);
        java.lang.String valueOf = java.lang.String.valueOf(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueOf, "<set-?>");
        yVar.f380818g = valueOf;
        this.f303806q = i17;
    }

    public final void a7(int i17, java.lang.Boolean bool) {
        if (bool != null) {
            this.f303808s = bool.booleanValue();
        }
        if (i17 != this.f303809t) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveReplaySlice", "setOrigDura from:" + this.f303809t + " to " + i17 + ",fromServer:" + bool);
        }
        if (i17 != this.f303809t) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveReplaySlice", "orgi_duration:" + i17);
        }
        this.f303809t = i17;
    }

    public final void b7(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveReplaySlice", "playTransition:" + this.f303798f + " -> " + z17 + '!');
        this.f303798f = z17;
    }

    public final void c7(int i17) {
        if (i17 != this.f303801i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveReplaySlice", "replayStartOffset from:" + this.f303801i + " to " + i17);
            this.f303801i = i17;
        }
    }

    public final void d7(int i17) {
        if (i17 != this.f303802m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveReplaySlice", "replayStatus from:" + this.f303802m + " to " + i17);
            this.f303802m = i17;
        }
    }

    public final void e7(kn0.m value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        if (value != this.f303803n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveReplaySlice", "uiStatus from:" + this.f303803n + " to " + value);
            this.f303803n = value;
        }
    }

    public final void f7(kn0.k value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        if (this.f303804o == value) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveReplaySlice", "set liveMode:" + this.f303804o + '!');
        }
        this.f303804o = value;
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveReplaySlice", "onCleared");
        Z6(0);
        if (this.f303807r != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveReplaySlice", "play total:0");
        }
        this.f303807r = 0;
        this.f303808s = false;
        if (this.f303809t != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveReplaySlice", "orgi_duration:0");
        }
        this.f303809t = 0;
        this.f303799g = 0L;
        c7(0);
        X6(false);
        Y6(false);
        f7(kn0.k.f391099d);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.E;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.C = false;
        this.D = false;
        b7(false);
        this.f303813x = false;
        this.B = 1.0f;
    }
}
