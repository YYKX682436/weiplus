package ud2;

/* loaded from: classes10.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f508123a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f508124b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.Surface f508125c;

    /* renamed from: d, reason: collision with root package name */
    public int f508126d;

    /* renamed from: e, reason: collision with root package name */
    public int f508127e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f508128f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f508129g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a f508130h;

    /* renamed from: i, reason: collision with root package name */
    public mn0.b0 f508131i;

    /* renamed from: j, reason: collision with root package name */
    public int f508132j;

    /* renamed from: k, reason: collision with root package name */
    public int f508133k;

    /* renamed from: l, reason: collision with root package name */
    public float f508134l;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uf f508135m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f508136n;

    /* renamed from: o, reason: collision with root package name */
    public ig2.r f508137o;

    /* renamed from: p, reason: collision with root package name */
    public final yz5.a f508138p;

    /* renamed from: q, reason: collision with root package name */
    public final yz5.a f508139q;

    /* renamed from: r, reason: collision with root package name */
    public final yz5.p f508140r;

    /* renamed from: s, reason: collision with root package name */
    public final yz5.l f508141s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.p f508142t;

    /* JADX WARN: Multi-variable type inference failed */
    public c0(android.content.Context context, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, android.view.Surface surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f508123a = context;
        this.f508124b = c19792x256d2725;
        this.f508125c = surface;
        this.f508126d = i17;
        this.f508127e = i18;
        this.f508128f = "ShowWindowPreviewManagerForWeApp";
        this.f508130h = new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("ShowWindowPreviewManagerForWeApp", context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null, 0, 4, null);
        this.f508135m = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uf(new android.view.View(context), 1, null, null, null, null, false, null, 240, null);
        this.f508136n = true;
        this.f508138p = new ud2.a0(this);
        this.f508139q = new ud2.y(this);
        this.f508140r = new ud2.z(this);
        this.f508141s = new ud2.x(this);
    }

    public static final void a(ud2.c0 c0Var, android.content.Intent intent) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = c0Var.f508129g;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m59240x7c94657b = c14994x9b99c079 != null ? c14994x9b99c079.m59240x7c94657b() : null;
        java.lang.String str2 = c0Var.f508128f;
        if (m59240x7c94657b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "try enter live when finder object is null");
            return;
        }
        long m76784x5db1b11 = m59240x7c94657b.m76784x5db1b11();
        java.lang.String m76803x6c285d75 = m59240x7c94657b.m76803x6c285d75();
        r45.nw1 m76794xd0557130 = m59240x7c94657b.m76794xd0557130();
        long m75942xfb822ef2 = m76794xd0557130 != null ? m76794xd0557130.m75942xfb822ef2(0) : 0L;
        java.lang.String m76836x6c03c64c = m59240x7c94657b.m76836x6c03c64c();
        if (m76836x6c03c64c == null) {
            m76836x6c03c64c = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "enter live with feedId:" + pm0.v.u(m76784x5db1b11) + ", nonceId:" + m76803x6c285d75 + ", contextId:" + c0Var.f508123a);
        intent.putExtra("key_enter_live_param_visitor_enter_scene", 1);
        intent.putExtra("LAUNCH_WITH_ANIM", true);
        r45.m84 m84Var = new r45.m84();
        m84Var.set(0, java.lang.Long.valueOf(m76784x5db1b11));
        m84Var.set(1, java.lang.Long.valueOf(m75942xfb822ef2));
        m84Var.set(2, m76803x6c285d75);
        m84Var.set(3, m76836x6c03c64c);
        m84Var.set(4, m59240x7c94657b.m76829x97edf6c0());
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = m59240x7c94657b.m76802x2dd01666();
        if (m76802x2dd01666 == null || (str = m76802x2dd01666.m76944x730bcac6()) == null) {
            str = "";
        }
        m84Var.set(5, str);
        m84Var.set(6, null);
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(0, "");
        wk0Var.set(1, "");
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, 1);
        ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ((vd2.f1) e0Var).Ri(context, intent, m84Var, true, wk0Var, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(ud2.c0 r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ud2.c0.b(ud2.c0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c(java.lang.String str, java.util.Map map) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f508128f, "notify event " + str + ", params = " + map);
        map.put("event", str);
        yz5.p pVar = this.f508142t;
        if (pVar != null) {
            java.lang.String gVar = new cl0.g(map).toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "toString(...)");
            pVar.mo149xb9724478("playEvent", gVar);
        }
    }

    public final void d() {
        r45.nw1 m76794xd0557130;
        java.lang.String m75945x2fec8307;
        r45.ka4 ka4Var;
        java.lang.String str;
        r45.ka4 ka4Var2;
        r45.nw1 m59258xd0557130;
        r45.ka4 ka4Var3;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        r45.nw1 m59258xd05571302;
        r45.nw1 m59258xd05571303;
        r45.ma4 ma4Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2;
        boolean z17 = this.f508136n;
        java.lang.String str2 = this.f508128f;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, this + " try start play when platformview is inActive");
            return;
        }
        mn0.b0 b0Var = this.f508131i;
        if (b0Var != null && ((mn0.y) b0Var).b(false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, this + " try start play when playing");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f508129g;
        if (c14994x9b99c079 == null || (m76794xd0557130 = c14994x9b99c079.getFeedObject().m76794xd0557130()) == null || (m75945x2fec8307 = m76794xd0557130.m75945x2fec8307(3)) == null) {
            return;
        }
        so2.h1 h1Var = new so2.h1(c14994x9b99c079);
        if (this.f508131i == null) {
            int X = nn0.c.X(false);
            nn0.c cVar = new nn0.c(this.f508123a, (X == 5 || X == 6) ? 2 : 0, false);
            cVar.f(true);
            cVar.J(new ud2.p(this));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2 n2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.f197173a;
            java.lang.String str3 = this.f508128f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0792 = this.f508129g;
            cVar.F(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.b(n2Var, str3, true, c14994x9b99c0792 != null ? c14994x9b99c0792.m59258xd0557130() : null, null, 0, 0, 56, null));
            cVar.Q(0);
            cVar.K(mn0.d0.f411254t, 19);
            this.f508135m.B = this.f508141s;
            cVar.f411340f.f402661h = new ud2.q(this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, this + " create new player " + cVar);
            this.f508131i = cVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, this + " player " + this.f508131i + " start play, url = " + m75945x2fec8307);
        mn0.b0 b0Var2 = this.f508131i;
        if (b0Var2 != null) {
            android.view.Surface surface = this.f508125c;
            if (surface != null) {
                b0Var2.v(surface, this.f508126d, this.f508127e);
            }
            qg2.e eVar = qg2.e.f444332a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = h1Var.getFeedObject();
            if (feedObject == null || (m59258xd05571303 = feedObject.m59258xd0557130()) == null || (ma4Var = (r45.ma4) m59258xd05571303.m75936x14adae67(23)) == null || (gVar2 = ma4Var.f461833m) == null) {
                ka4Var = null;
            } else {
                r45.na4 na4Var = new r45.na4();
                na4Var.mo11468x92b714fd(gVar2.g());
                ka4Var = na4Var.f462730f;
            }
            java.lang.String a17 = eVar.a(m75945x2fec8307, ka4Var);
            java.lang.String d17 = ko0.t.f391436a.d(a17);
            java.lang.String str4 = d17 == null ? "" : d17;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2 = h1Var.getFeedObject();
            if (feedObject2 == null || (str = feedObject2.m59273x80025a04()) == null) {
                str = "NULL";
            }
            java.lang.String str5 = str;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject3 = h1Var.getFeedObject();
            long m75942xfb822ef2 = (feedObject3 == null || (m59258xd05571302 = feedObject3.m59258xd0557130()) == null) ? 0L : m59258xd05571302.m75942xfb822ef2(0);
            long mo2128x1ed62e84 = h1Var.mo2128x1ed62e84();
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject4 = h1Var.getFeedObject();
            mn0.l0 l0Var = new mn0.l0(str4, str5, m75942xfb822ef2, mo2128x1ed62e84, elapsedRealtime, feedObject4 != null ? feedObject4.m59258xd0557130() : null);
            mn0.y yVar = (mn0.y) b0Var2;
            yVar.N(l0Var);
            yVar.G(true);
            int i17 = this.f508126d;
            int i18 = this.f508127e;
            this.f508126d = i17;
            this.f508127e = i18;
            mn0.b0 b0Var3 = this.f508131i;
            if (b0Var3 != null) {
                b0Var3.A(i17, i18);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject5 = h1Var.getFeedObject();
            if (feedObject5 == null || (m59258xd0557130 = feedObject5.m59258xd0557130()) == null) {
                ka4Var2 = null;
            } else {
                r45.ma4 ma4Var2 = (r45.ma4) m59258xd0557130.m75936x14adae67(23);
                if (ma4Var2 == null || (gVar = ma4Var2.f461833m) == null) {
                    ka4Var3 = null;
                } else {
                    r45.na4 na4Var2 = new r45.na4();
                    na4Var2.mo11468x92b714fd(gVar.g());
                    ka4Var3 = na4Var2.f462730f;
                }
                ka4Var2 = ka4Var3;
            }
            long mo2128x1ed62e842 = h1Var.mo2128x1ed62e84();
            r45.nw1 m59258xd05571304 = h1Var.getFeedObject().m59258xd0557130();
            long m75942xfb822ef22 = m59258xd05571304 != null ? m59258xd05571304.m75942xfb822ef2(0) : 0L;
            r45.p72 p72Var = new r45.p72();
            p72Var.set(0, "");
            p72Var.set(3, java.lang.Long.valueOf(mo2128x1ed62e842));
            p72Var.set(4, java.lang.Long.valueOf(m75942xfb822ef22));
            p72Var.set(1, "WeApp_" + c01.id.c());
            p72Var.set(5, 0);
            mn0.b0.D(b0Var2, a17, 1, ka4Var2, p72Var, false, false, 48, null);
        }
    }
}
