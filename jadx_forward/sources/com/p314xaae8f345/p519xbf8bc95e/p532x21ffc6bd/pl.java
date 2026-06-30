package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class pl extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ag> implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ag {

    /* renamed from: b, reason: collision with root package name */
    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.aq f132165b;

    /* renamed from: d, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne f132166d;

    /* renamed from: p, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 f132167p;

    /* renamed from: q, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 f132168q;

    /* renamed from: r, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 f132169r;

    /* renamed from: s, reason: collision with root package name */
    private float f132170s;

    /* renamed from: t, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 f132171t;

    /* renamed from: u, reason: collision with root package name */
    private double f132172u;

    /* renamed from: v, reason: collision with root package name */
    private double f132173v;

    /* renamed from: w, reason: collision with root package name */
    private int f132174w;

    /* renamed from: x, reason: collision with root package name */
    private float f132175x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f132176y;

    public pl(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26008x51f2a00c c26008x51f2a00c, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az azVar) {
        super(azVar);
        this.f132174w = -16776961;
        this.f132175x = 10.0f;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne b17 = azVar.b();
        this.f132166d = b17;
        if (b17 == null || c26008x51f2a00c == null) {
            return;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m99307x5d9dd6d2 = c26008x51f2a00c.m99307x5d9dd6d2();
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m99306xf121286d = c26008x51f2a00c.m99306xf121286d();
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m99305x525ac70b = c26008x51f2a00c.m99305x525ac70b();
        float m99303x74281f1d = c26008x51f2a00c.m99303x74281f1d() >= 0.0f ? c26008x51f2a00c.m99303x74281f1d() % 360.0f : (c26008x51f2a00c.m99303x74281f1d() % 360.0f) + 360.0f;
        if (m99307x5d9dd6d2 == null || m99305x525ac70b == null || m99307x5d9dd6d2.m99507xb2c87fbf(m99305x525ac70b)) {
            return;
        }
        if (m99306xf121286d == null && (m99303x74281f1d == 0.0f || m99303x74281f1d == 180.0f)) {
            return;
        }
        if (m99306xf121286d == null || !(m99306xf121286d.m99507xb2c87fbf(m99307x5d9dd6d2) || m99306xf121286d.m99507xb2c87fbf(m99305x525ac70b))) {
            if (this.f132167p != m99307x5d9dd6d2) {
                this.f132167p = m99307x5d9dd6d2;
                w();
            }
            if (this.f132168q != m99305x525ac70b) {
                this.f132168q = m99305x525ac70b;
                w();
            }
            if (this.f132169r != m99306xf121286d) {
                this.f132169r = m99306xf121286d;
                w();
            }
            if (this.f132170s != m99303x74281f1d) {
                this.f132170s = m99303x74281f1d;
                w();
            }
            mo36391x52d2f021(c26008x51f2a00c.m99304x7444d5ad());
            mo36394x53e9ee84(c26008x51f2a00c.m99310x755bd410());
            m36902xe2eaa4ac(c26008x51f2a00c.m99309x4c853138());
            m36901xe1d3a649(c26008x51f2a00c.m99308x4b6e32d5());
            this.f132176y = c26008x51f2a00c.m99311xd3234102();
            if (v()) {
                e();
            }
        }
    }

    private void b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        if (this.f132168q != c26041x873d1d26) {
            this.f132168q = c26041x873d1d26;
            w();
        }
    }

    private void c(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        if (this.f132169r != c26041x873d1d26) {
            this.f132169r = c26041x873d1d26;
            w();
        }
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ag d() {
        return this;
    }

    private void e() {
        double a17;
        boolean z17;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = this.f132167p;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262 = this.f132169r;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d263 = this.f132168q;
        float f17 = this.f132170s;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc b17 = this.f132166d.f132046m.b(c26041x873d1d26);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc b18 = this.f132166d.f132046m.b(c26041x873d1d263);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc gcVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc(0.0d, 0.0d);
        if (f17 == 0.0f) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc b19 = this.f132166d.f132046m.b(c26041x873d1d262);
            double a18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.li.a(b17, b19, b18, gcVar);
            z17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.li.a(b17.x(), b17.y(), b18.x(), b18.y(), b19.x(), b19.y()) > 0.0d;
            a17 = a18;
        } else {
            boolean z18 = f17 < 180.0f;
            if (f17 > 180.0f) {
                f17 = 360.0f - f17;
            }
            a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.li.a(b17, b18, f17 * 2.0f, z18, gcVar);
            z17 = z18;
        }
        this.f132171t = this.f132166d.f132046m.a(gcVar);
        this.f132172u = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.li.b(b17, b18, gcVar);
        this.f132173v = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.li.a(b17, gcVar);
        final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[] c26041x873d1d26Arr = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3];
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.li.a(gcVar, a17, b17, b18, z17, new com.p314xaae8f345.map.p511x696c9db.InterfaceC4312x55abeb17<android.util.Pair<java.lang.Double, java.lang.Double>>() { // from class: com.tencent.mapsdk.internal.pl.1
            private void a(int i17, android.util.Pair<java.lang.Double, java.lang.Double> pair) {
                c26041x873d1d26Arr[i17] = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pl.this.f132166d.f132046m.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc(((java.lang.Double) pair.first).doubleValue(), ((java.lang.Double) pair.second).doubleValue()));
            }

            @Override // com.p314xaae8f345.map.p511x696c9db.InterfaceC4312x55abeb17
            /* renamed from: callback */
            public final /* synthetic */ void mo35817xf5bc2045(int i17, android.util.Pair<java.lang.Double, java.lang.Double> pair) {
                android.util.Pair<java.lang.Double, java.lang.Double> pair2 = pair;
                c26041x873d1d26Arr[i17] = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pl.this.f132166d.f132046m.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc(((java.lang.Double) pair2.first).doubleValue(), ((java.lang.Double) pair2.second).doubleValue()));
            }
        });
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f132167p);
        for (int i17 = 0; i17 < 360; i17++) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d264 = c26041x873d1d26Arr[i17];
            if (c26041x873d1d264 != null) {
                arrayList.add(c26041x873d1d264);
            }
        }
        arrayList.add(this.f132168q);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.aq aqVar = this.f132165b;
        if (aqVar != null) {
            aqVar.mo36414xc84af884();
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0 a19 = this.f132166d.a(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26079x1291dc9e().m99861xab35b940(arrayList).m99871x5a72f63(this.f132174w).m99920x6be2dc6(this.f132175x).m99869x2c2c84fa(m36895x4c853138()).m99867x2b158697(m36894x4b6e32d5()).m99922xd4677478(mo36420x397e976e()).m99907x6219b84(mo36418x74bf41ce()).m99864x58c7409(this.f132176y).m99908xa8ae33e(true));
        if (a19 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ax) {
            this.f132165b = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ax) a19).f130407j;
        }
        this.f132166d.f132055v = true;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au
    public final /* bridge */ /* synthetic */ com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ao f_() {
        return this;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.Arc
    /* renamed from: getCenter */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 mo36384x13c9ef4b() {
        return this.f132171t;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25984xed8a7b1d
    /* renamed from: getColor */
    public final int mo36385x7444d5ad() {
        return this.f132174w;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.Arc
    /* renamed from: getLength */
    public final double mo36386x23255ddc() {
        return this.f132172u;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.Arc
    /* renamed from: getRadius */
    public final double mo36387x2d258f88() {
        return this.f132173v;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC26000x74659000
    /* renamed from: getWidth */
    public final float mo36390x755bd410() {
        return this.f132175x;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po
    public final void h_() {
        super.h_();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.aq aqVar = this.f132165b;
        if (aqVar != null) {
            aqVar.mo36414xc84af884();
            this.f132165b = null;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po
    public final void j_() {
        if (this.f132166d == null || this.f132165b == null) {
            return;
        }
        if (!mo36423xf94337e8()) {
            this.f132165b.mo36414xc84af884();
            return;
        }
        if (v()) {
            e();
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.aq aqVar = this.f132165b;
            if (aqVar instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ev) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ev evVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ev) aqVar;
                if (a() == -1) {
                    this.f132212m = evVar.a();
                } else {
                    evVar.p();
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25984xed8a7b1d
    /* renamed from: setColor */
    public final void mo36391x52d2f021(int i17) {
        if (this.f132174w != i17) {
            this.f132174w = i17;
            w();
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC26000x74659000
    /* renamed from: setWidth */
    public final void mo36394x53e9ee84(float f17) {
        if (this.f132175x != f17) {
            this.f132175x = f17;
            w();
        }
    }

    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        if (this.f132167p != c26041x873d1d26) {
            this.f132167p = c26041x873d1d26;
            w();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25979x32e3ffb8
    /* renamed from: b */
    public final android.graphics.Rect mo36416x7436dfc8(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey eyVar) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = this.f132171t;
        if (c26041x873d1d26 != null) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc b17 = eyVar.b(c26041x873d1d26);
            double d17 = b17.f131098c;
            double d18 = this.f132173v;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc gcVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc(d17 - d18, b17.f131097b - d18);
            double d19 = b17.f131098c;
            double d27 = this.f132173v;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc gcVar2 = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc(d19 + d27, b17.f131097b + d27);
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 a17 = eyVar.a(gcVar);
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 a18 = eyVar.a(gcVar2);
            android.graphics.Rect rect = new android.graphics.Rect();
            rect.left = (int) (a17.f49502x83009af * 1000000.0d);
            rect.top = (int) (a17.f49501xaa2bac6c * 1000000.0d);
            rect.right = (int) (a18.f49502x83009af * 1000000.0d);
            rect.bottom = (int) (a18.f49501xaa2bac6c * 1000000.0d);
            return rect;
        }
        return super.mo36416x7436dfc8(eyVar);
    }

    private void a(float f17) {
        if (this.f132170s != f17) {
            this.f132170s = f17;
            w();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ag
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26008x51f2a00c c26008x51f2a00c) {
        if (this.f132166d == null || c26008x51f2a00c == null) {
            return;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m99307x5d9dd6d2 = c26008x51f2a00c.m99307x5d9dd6d2();
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m99306xf121286d = c26008x51f2a00c.m99306xf121286d();
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m99305x525ac70b = c26008x51f2a00c.m99305x525ac70b();
        float m99303x74281f1d = c26008x51f2a00c.m99303x74281f1d() >= 0.0f ? c26008x51f2a00c.m99303x74281f1d() % 360.0f : (c26008x51f2a00c.m99303x74281f1d() % 360.0f) + 360.0f;
        if (m99307x5d9dd6d2 == null || m99305x525ac70b == null || m99307x5d9dd6d2.m99507xb2c87fbf(m99305x525ac70b)) {
            return;
        }
        if (m99306xf121286d == null && (m99303x74281f1d == 0.0f || m99303x74281f1d == 180.0f)) {
            return;
        }
        if (m99306xf121286d == null || !(m99306xf121286d.m99507xb2c87fbf(m99307x5d9dd6d2) || m99306xf121286d.m99507xb2c87fbf(m99305x525ac70b))) {
            if (this.f132167p != m99307x5d9dd6d2) {
                this.f132167p = m99307x5d9dd6d2;
                w();
            }
            if (this.f132168q != m99305x525ac70b) {
                this.f132168q = m99305x525ac70b;
                w();
            }
            if (this.f132169r != m99306xf121286d) {
                this.f132169r = m99306xf121286d;
                w();
            }
            if (this.f132170s != m99303x74281f1d) {
                this.f132170s = m99303x74281f1d;
                w();
            }
            mo36391x52d2f021(c26008x51f2a00c.m99304x7444d5ad());
            mo36394x53e9ee84(c26008x51f2a00c.m99310x755bd410());
            m36902xe2eaa4ac(c26008x51f2a00c.m99309x4c853138());
            m36901xe1d3a649(c26008x51f2a00c.m99308x4b6e32d5());
            this.f132176y = c26008x51f2a00c.m99311xd3234102();
            if (v()) {
                e();
            }
        }
    }

    private void a(boolean z17) {
        this.f132176y = z17;
    }
}
