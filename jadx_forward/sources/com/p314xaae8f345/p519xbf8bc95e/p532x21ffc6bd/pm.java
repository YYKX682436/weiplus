package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class pm extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ah> implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ah, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.or {

    /* renamed from: b, reason: collision with root package name */
    private static final int f132179b = 128;

    /* renamed from: d, reason: collision with root package name */
    private com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df f132180d;

    /* renamed from: p, reason: collision with root package name */
    private double f132181p;

    /* renamed from: q, reason: collision with root package name */
    private float f132182q;

    /* renamed from: r, reason: collision with root package name */
    private int f132183r;

    /* renamed from: s, reason: collision with root package name */
    private final java.util.ArrayList<java.lang.Integer> f132184s;

    /* renamed from: t, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26017xfbda878e f132185t;

    /* renamed from: u, reason: collision with root package name */
    private final com.p314xaae8f345.map.lib.p496xc04b6a6a.C4239x349689be f132186u;

    /* renamed from: v, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne f132187v;

    public pm(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az azVar) {
        super(azVar);
        this.f132180d = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(39909230, 116397428);
        this.f132181p = 0.0d;
        this.f132182q = 1000.0f;
        this.f132183r = 0;
        this.f132184s = new java.util.ArrayList<>();
        this.f132186u = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4239x349689be();
        this.f132187v = azVar.b();
    }

    private double d() {
        return this.f132182q;
    }

    private void e() {
        if (a() == -1) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f132187v.f132039f;
            this.f132212m = ((java.lang.Integer) tkVar.a((com.p314xaae8f345.map.p511x696c9db.InterfaceC4309x11c86a2<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass68>) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass68(this.f132186u), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass68) (-1))).intValue();
        } else if (v()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar2 = this.f132187v.f132039f;
            int a17 = a();
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4239x349689be c4239x349689be = this.f132186u;
            if (tkVar2.f133194e != 0 && c4239x349689be != null) {
                tkVar2.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass79(a17, c4239x349689be));
            }
            this.f132187v.f132055v = true;
        }
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ah f() {
        return this;
    }

    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26017xfbda878e c26017xfbda878e) {
        if (c26017xfbda878e == null) {
            return;
        }
        this.f132185t = c26017xfbda878e;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m99391x13c9ef4b = c26017xfbda878e.m99391x13c9ef4b();
        if (m99391x13c9ef4b != null) {
            a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df.m35328x3017aa(m99391x13c9ef4b));
        }
        mo36405x205ac394(c26017xfbda878e.m99395x2d258f88());
        m36902xe2eaa4ac(c26017xfbda878e.m99397x4c853138());
        m36901xe1d3a649(c26017xfbda878e.m99396x4b6e32d5());
        m36900x17b1755e(c26017xfbda878e.m99392xbb5db4ea());
        mo36429x2cb3cb7a(c26017xfbda878e.m99398x397e976e());
        mo36427xcd1079b0(c26017xfbda878e.m99400xf94337e8());
        mo35536x534d5c42(c26017xfbda878e.m99393x74bf41ce());
        a(c26017xfbda878e.m99390x5b07397c().ordinal());
        a(c26017xfbda878e.m99394xea6275a());
        this.f132185t = c26017xfbda878e;
        w();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25979x32e3ffb8
    /* renamed from: b */
    public final android.graphics.Rect mo36416x7436dfc8(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey eyVar) {
        double a17 = a(this.f132181p, this.f132180d.m35331xbc3301f3() / 1000000.0d);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc a18 = a(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(this.f132180d.m35331xbc3301f3() / 1000000.0d, this.f132180d.m35332x962aa94a() / 1000000.0d));
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc gcVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc(a18.f131098c - a17, a18.f131097b + a17);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc gcVar2 = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc(a18.f131098c + a17, a18.f131097b - a17);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 a19 = a(gcVar);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 a27 = a(gcVar2);
        android.graphics.Rect rect = new android.graphics.Rect();
        rect.left = (int) (a19.f49502x83009af * 1000000.0d);
        rect.top = (int) (a19.f49501xaa2bac6c * 1000000.0d);
        rect.right = (int) (a27.f49502x83009af * 1000000.0d);
        rect.bottom = (int) (a27.f49501xaa2bac6c * 1000000.0d);
        return rect;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26016x7851a8f0
    /* renamed from: contains */
    public final boolean mo36395xde2d761f(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kq.a(mo36396x13c9ef4b(), c26041x873d1d26) < mo36398x2d258f88();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au
    public final /* bridge */ /* synthetic */ com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ao f_() {
        return this;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.or
    public final boolean g_() {
        return false;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26016x7851a8f0
    /* renamed from: getCenter */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 mo36396x13c9ef4b() {
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = this.f132180d;
        if (c4247x704e24df != null) {
            return c4247x704e24df.m35336x89192361();
        }
        return null;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26016x7851a8f0
    /* renamed from: getRadius */
    public final double mo36398x2d258f88() {
        return this.f132181p;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po
    public final void h_() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        if (a() == -1 || (neVar = this.f132187v) == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = neVar.f132039f;
        int a17 = a();
        if (tkVar.f133194e != 0 && a17 >= 0 && tkVar.f133199j != null) {
            tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass90(a17));
        }
        this.f132212m = -1;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po
    public final void j_() {
        if (this.f132187v == null) {
            return;
        }
        p();
        if (a() == -1) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f132187v.f132039f;
            this.f132212m = ((java.lang.Integer) tkVar.a((com.p314xaae8f345.map.p511x696c9db.InterfaceC4309x11c86a2<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass68>) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass68(this.f132186u), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass68) (-1))).intValue();
        } else if (v()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar2 = this.f132187v.f132039f;
            int a17 = a();
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4239x349689be c4239x349689be = this.f132186u;
            if (tkVar2.f133194e != 0 && c4239x349689be != null) {
                tkVar2.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass79(a17, c4239x349689be));
            }
            this.f132187v.f132055v = true;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25998xe695d027
    /* renamed from: onTap */
    public final boolean mo36424x64f7944(float f17, float f18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        if (this.f132180d != null && (neVar = this.f132187v) != null) {
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df a17 = neVar.f132046m.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(f17, f18));
            if (java.lang.Math.hypot(a17.m35331xbc3301f3() - this.f132180d.m35331xbc3301f3(), a17.m35332x962aa94a() - this.f132180d.m35332x962aa94a()) <= this.f132182q) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ev
    public final void p() {
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df;
        if ((a() > 0 && !v()) || this.f132187v == null || (c4247x704e24df = this.f132180d) == null) {
            return;
        }
        double d17 = this.f132181p;
        if (d17 <= 0.0d) {
            return;
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4239x349689be c4239x349689be = this.f132186u;
        c4239x349689be.f16372xd4677478 = (int) this.f132207h;
        c4239x349689be.f16360x2b158697 = this.f132206g;
        c4239x349689be.f16362x2c2c84fa = this.f132204e;
        c4239x349689be.f16367xbbf043a0 = this.f132205f;
        c4239x349689be.f16371xc80e6c92 = (float) d17;
        c4239x349689be.f16363x27a6bea3 = c4247x704e24df.m35332x962aa94a();
        this.f132186u.f16364x27a6bea4 = this.f132180d.m35331xbc3301f3();
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4239x349689be c4239x349689be2 = this.f132186u;
        c4239x349689be2.f16368xf94337e8 = this.f132208i;
        c4239x349689be2.f16369x6219b84 = this.f132211l;
        c4239x349689be2.f16361x6cc68186 = this.f132183r;
        c4239x349689be2.f16370x4a4486e3 = new int[this.f132184s.size()];
        for (int i17 = 0; i17 < this.f132184s.size(); i17++) {
            this.f132186u.f16370x4a4486e3[i17] = this.f132184s.get(i17).intValue();
        }
        w();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26016x7851a8f0
    /* renamed from: setCenter */
    public final void mo36401x6ff2357(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df.m35328x3017aa(c26041x873d1d26));
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26016x7851a8f0
    /* renamed from: setOptions */
    public final void mo36404x66c50fdc(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26017xfbda878e c26017xfbda878e) {
        a(c26017xfbda878e);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26016x7851a8f0
    /* renamed from: setRadius */
    public final void mo36405x205ac394(double d17) {
        if (d17 < 0.0d) {
            return;
        }
        if (d17 == 0.0d) {
            d17 = 1.0E-10d;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26017xfbda878e c26017xfbda878e = this.f132185t;
        if (c26017xfbda878e == null || c26017xfbda878e.m99391x13c9ef4b() == null) {
            return;
        }
        this.f132181p = d17;
        this.f132182q = (float) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.a(d17, this.f132185t.m99391x13c9ef4b().f49501xaa2bac6c);
        w();
    }

    private void a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
        if (c4247x704e24df == null) {
            return;
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2 = this.f132180d;
        if (c4247x704e24df2 == null) {
            this.f132180d = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(c4247x704e24df.m35331xbc3301f3(), c4247x704e24df.m35332x962aa94a());
        } else {
            c4247x704e24df2.m35334xea574fff(c4247x704e24df.m35331xbc3301f3());
            this.f132180d.m35335x2c901cbe(c4247x704e24df.m35332x962aa94a());
        }
        w();
    }

    private void a(int i17) {
        this.f132183r = i17;
        w();
    }

    private void a(java.util.List<java.lang.Integer> list) {
        if (list == null || list.size() != 2) {
            return;
        }
        this.f132184s.clear();
        this.f132184s.addAll(list);
        w();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25979x32e3ffb8
    /* renamed from: a */
    public final android.graphics.Rect mo36419xd5aa333c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey eyVar) {
        android.graphics.Rect mo36416x7436dfc8 = mo36416x7436dfc8(eyVar);
        int i17 = mo36416x7436dfc8.left;
        int i18 = mo36416x7436dfc8.right;
        int i19 = mo36416x7436dfc8.top;
        int i27 = mo36416x7436dfc8.bottom;
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i19, i17);
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i27, i17);
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df3 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i27, i18);
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df4 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i19, i18);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a17 = eyVar.a(c4247x704e24df);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a18 = eyVar.a(c4247x704e24df2);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a19 = eyVar.a(c4247x704e24df3);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a27 = eyVar.a(c4247x704e24df4);
        return new android.graphics.Rect((int) java.lang.Math.min(java.lang.Math.min(a17.f131000a, a18.f131000a), java.lang.Math.min(a19.f131000a, a27.f131000a)), (int) java.lang.Math.min(java.lang.Math.min(a17.f131001b, a18.f131001b), java.lang.Math.min(a19.f131001b, a27.f131001b)), (int) java.lang.Math.max(java.lang.Math.max(a17.f131000a, a18.f131000a), java.lang.Math.max(a19.f131000a, a27.f131000a)), (int) java.lang.Math.max(java.lang.Math.max(a17.f131001b, a18.f131001b), java.lang.Math.max(a19.f131001b, a27.f131001b)));
    }

    private static double a(double d17, double d18) {
        return d17 / java.lang.Math.cos((d18 * 3.141592653589793d) / 180.0d);
    }

    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc((c26041x873d1d26.f49502x83009af * 2.003750834E7d) / 180.0d, ((java.lang.Math.log(java.lang.Math.tan(((c26041x873d1d26.f49501xaa2bac6c + 90.0d) * 3.141592653589793d) / 360.0d)) / 0.017453292519943295d) * 2.003750834E7d) / 180.0d);
    }

    private static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc gcVar) {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26((float) (((java.lang.Math.atan(java.lang.Math.exp((((float) ((gcVar.f131097b * 180.0d) / 2.003750834E7d)) * 3.141592653589793d) / 180.0d)) * 2.0d) - 1.5707963267948966d) * 57.29577951308232d), (float) ((gcVar.f131098c * 180.0d) / 2.003750834E7d));
    }
}
