package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class ps extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.am> implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.am, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oz {

    /* renamed from: d, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr f132291d;

    /* renamed from: e, reason: collision with root package name */
    private android.view.View f132292e;

    /* renamed from: j, reason: collision with root package name */
    private com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df f132297j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f132298k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f132299l;

    /* renamed from: o, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an f132302o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f132303p;

    /* renamed from: f, reason: collision with root package name */
    private int f132293f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f132294g = 0;

    /* renamed from: h, reason: collision with root package name */
    private float f132295h = 0.5f;

    /* renamed from: i, reason: collision with root package name */
    private float f132296i = 0.5f;

    /* renamed from: m, reason: collision with root package name */
    private boolean f132300m = false;

    /* renamed from: n, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu f132301n = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu();

    /* renamed from: q, reason: collision with root package name */
    private boolean f132304q = true;

    public ps(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an anVar) {
        this.f132291d = trVar;
        this.f132302o = anVar;
        h();
        if (trVar != null && trVar.I() != null) {
            this.f132292e = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pn.a(trVar.I(), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd) trVar.d_, this, anVar != null ? anVar.g() : null, anVar);
            if (anVar != null) {
                a(anVar.mo36440xa86cd69f());
            }
        }
        this.f132298k = true;
    }

    private void h() {
        M m17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f132291d;
        if (trVar == null || (m17 = trVar.e_) == 0) {
            return;
        }
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) m17).a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oz) this);
    }

    private void i() {
        M m17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f132291d;
        if (trVar == null || (m17 = trVar.e_) == 0) {
            return;
        }
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) m17).f134045o.b(this);
    }

    private void l() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f132291d;
        if (trVar == null || trVar.I() == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an anVar = this.f132302o;
        this.f132292e = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pn.a(this.f132291d.I(), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd) this.f132291d.d_, this, anVar != null ? anVar.g() : null, this.f132302o);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an anVar2 = this.f132302o;
        if (anVar2 != null) {
            a(anVar2.mo36440xa86cd69f());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.ps.1
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ps.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ps.this);
            }
        });
    }

    private void n() {
        android.view.View view;
        com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey mo37464x78d58245;
        android.view.ViewGroup q17;
        boolean z17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f132291d;
        if (trVar == null || (view = this.f132292e) == null || (c4430xc2040f9 = (com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) trVar.e_) == null || (mo37464x78d58245 = c4430xc2040f9.mo37464x78d58245()) == null || (q17 = q()) == null) {
            return;
        }
        if (!this.f132303p) {
            view.setVisibility(8);
            return;
        }
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        this.f132293f = view.getMeasuredWidth();
        this.f132294g = view.getMeasuredHeight();
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        android.graphics.Rect mo36419xd5aa333c = mo36419xd5aa333c(mo37464x78d58245);
        if (mo36419xd5aa333c == null) {
            return;
        }
        if (view.getParent() == null) {
            int childCount = q17.getChildCount();
            int mo36420x397e976e = this.f132302o.mo36420x397e976e();
            int i17 = childCount - 1;
            int i18 = -1;
            int i19 = -1;
            while (true) {
                if (i17 < 0) {
                    i17 = i19;
                    z17 = false;
                    break;
                }
                java.lang.Object tag = q17.getChildAt(i17).getTag();
                if (tag instanceof java.lang.Integer) {
                    if (mo36420x397e976e >= ((java.lang.Integer) tag).intValue()) {
                        i18 = i17 + 1;
                        z17 = true;
                        break;
                    }
                    i19 = i17;
                }
                i17--;
            }
            if (z17) {
                i17 = i18;
            }
            view.setTag(java.lang.Integer.valueOf(mo36420x397e976e));
            if (i17 < childCount) {
                q17.addView(view, i17);
            } else {
                q17.addView(view);
            }
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        q17.getLocalVisibleRect(rect);
        if (rect.isEmpty()) {
            view.setVisibility(8);
            return;
        }
        if (rect.intersect(mo36419xd5aa333c)) {
            view.setVisibility(0);
        }
        view.setX(mo36419xd5aa333c.left);
        view.setY(mo36419xd5aa333c.top);
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.am p() {
        return this;
    }

    private android.view.ViewGroup q() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f132291d;
        if (trVar == null) {
            return null;
        }
        return trVar.ac();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.am
    public final int a() {
        return 0;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew
    public final void d() {
        if (this.f132302o == null || this.f132291d.I() == null) {
            return;
        }
        int mo36447x755bd410 = this.f132302o.mo36447x755bd410(this.f132291d.I());
        float m99681x72a3df6c = this.f132302o.mo36439xf353c268() != null ? this.f132302o.mo36439xf353c268().m99681x72a3df6c() : 0.5f;
        int i17 = this.f132293f;
        if (i17 == 0) {
            i17 = 1;
        }
        this.f132295h = m99681x72a3df6c + ((mo36447x755bd410 * (this.f132302o.mo36433xa62d00a() - 0.5f)) / i17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew
    public final void e() {
        if (this.f132302o == null || this.f132291d.I() == null) {
            return;
        }
        int mo36437x1c4fb41d = (int) (this.f132302o.mo36437x1c4fb41d(this.f132291d.I()) * this.f132302o.mo36434xa62d00b());
        int i17 = this.f132294g;
        float m99682x72a3df6d = this.f132302o.mo36439xf353c268() != null ? this.f132302o.mo36439xf353c268().m99682x72a3df6d() : 1.0f;
        if (i17 == 0) {
            i17 = 1;
        }
        float f17 = i17;
        this.f132296i = (mo36437x1c4fb41d + (m99682x72a3df6d * f17)) / f17;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew
    public final void f() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f132291d;
        if (trVar == null || !this.f132304q) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an anVar = this.f132302o;
        final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.InfoWindowAdapter g17 = anVar != null ? anVar.g() : null;
        final android.content.Context I = trVar.I();
        final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd) trVar.d_;
        android.view.ViewGroup q17 = q();
        if (q17 != null) {
            q17.post(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.ps.2
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ps psVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ps.this;
                    psVar.f132292e = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pn.a(I, bdVar, psVar, g17, psVar.f132302o);
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ps.this.m();
                }
            });
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au
    public final /* bridge */ /* synthetic */ com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.am f_() {
        return this;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew
    public final android.view.View g() {
        return this.f132292e;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26030xc162a7c7
    /* renamed from: getId */
    public final java.lang.String mo36409x5db1b11() {
        return this.c_;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew
    public final void i_() {
        m();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25983x9215236c
    /* renamed from: isCollisionBy */
    public final boolean mo36450x8c2e79f(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25982xe7f56712 interfaceC25982xe7f56712) {
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25991xc3dfd4bb
    /* renamed from: isRemoved */
    public final boolean mo36411x1e855fd6() {
        return this.f132299l;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25999x7f0a8852
    /* renamed from: isVisible */
    public final boolean mo36423xf94337e8() {
        return this.f132303p;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oz
    public final void j() {
        m();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oz
    public final void k() {
        m();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25998xe695d027
    /* renamed from: onTap */
    public final boolean mo36424x64f7944(float f17, float f18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar;
        M m17;
        android.graphics.Rect mo36419xd5aa333c;
        if (this.f132292e == null || !this.f132298k || (trVar = this.f132291d) == null || (m17 = trVar.e_) == 0 || ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) m17).mo37464x78d58245() == null || (mo36419xd5aa333c = mo36419xd5aa333c(((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f132291d.e_).mo37464x78d58245())) == null || mo36419xd5aa333c.isEmpty()) {
            return false;
        }
        return mo36419xd5aa333c.contains((int) f17, (int) f18);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25991xc3dfd4bb
    /* renamed from: releaseData */
    public final void mo36412xcb03051() {
        i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25991xc3dfd4bb
    /* renamed from: remove */
    public final void mo36414xc84af884() {
        final android.view.View view = this.f132292e;
        if (view == 0) {
            return;
        }
        final android.view.ViewParent parent = view.getParent();
        if (parent == null) {
            parent = (android.view.ViewParent) view;
        }
        if (parent instanceof android.view.ViewGroup) {
            if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
                a((android.view.ViewGroup) parent, view);
            } else {
                ((android.view.ViewGroup) parent).post(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.ps.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ps.this.a((android.view.ViewGroup) parent, view);
                    }
                });
            }
        }
        this.f132291d.d(mo36409x5db1b11());
        this.f132299l = true;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25983x9215236c
    /* renamed from: setCollisions */
    public final void mo36460xbc4aa583(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25982xe7f56712... interfaceC25982xe7f56712Arr) {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25999x7f0a8852
    /* renamed from: setVisible */
    public final void mo36427xcd1079b0(boolean z17) {
        this.f132303p = z17;
        m();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4) {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew
    public final void b(boolean z17) {
        this.f132300m = z17;
        if (z17) {
            i();
        } else {
            h();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew
    public final void c(boolean z17) {
        if (this.f132292e == null) {
            return;
        }
        this.f132298k = z17;
        mo36427xcd1079b0(z17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew
    public final void a(boolean z17) {
        this.f132304q = z17;
        if (this.f132298k) {
            c(z17);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25979x32e3ffb8
    /* renamed from: b */
    public final android.graphics.Rect mo36416x7436dfc8(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey eyVar) {
        if (mo36419xd5aa333c(eyVar) != null && eyVar != null) {
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df a17 = eyVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(r0.left, r0.top));
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df a18 = eyVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(r0.right, r0.bottom));
            if (a17 != null && a18 != null) {
                return new android.graphics.Rect(a17.m35332x962aa94a(), a17.m35331xbc3301f3(), a18.m35332x962aa94a(), a18.m35331xbc3301f3());
            }
        }
        return null;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew
    public final boolean c() {
        return this.f132298k;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        if (c26041x873d1d26 == null) {
            return;
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = this.f132297j;
        if (c4247x704e24df == null) {
            this.f132297j = com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df.m35328x3017aa(c26041x873d1d26);
        } else {
            c4247x704e24df.m35334xea574fff((int) (c26041x873d1d26.f49501xaa2bac6c * 1000000.0d));
            this.f132297j.m35335x2c901cbe((int) (c26041x873d1d26.f49502x83009af * 1000000.0d));
        }
        m();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew
    public final void a(int i17, int i18) {
        b(true);
        this.f132301n.a(i17, i18);
        m();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25979x32e3ffb8
    /* renamed from: a */
    public final android.graphics.Rect mo36419xd5aa333c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey eyVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a17;
        int i17;
        int i18;
        if (eyVar == null || this.f132292e == null) {
            return null;
        }
        if (this.f132300m) {
            a17 = this.f132301n;
        } else {
            a17 = eyVar.a(this.f132297j);
        }
        if (a17 == null) {
            return null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an anVar = this.f132302o;
        if (anVar == null || anVar.mo36439xf353c268() == null) {
            i17 = 0;
            i18 = 0;
        } else {
            i17 = this.f132302o.mo36439xf353c268().m99684x49c37951();
            i18 = this.f132302o.mo36439xf353c268().m99685x1a244972();
        }
        d();
        e();
        float f17 = this.f132295h;
        int i19 = this.f132293f;
        float f18 = f17 - ((i17 * 1.0f) / i19);
        float f19 = this.f132296i;
        int i27 = this.f132294g;
        float f27 = f19 - ((i18 * 1.0f) / i27);
        int i28 = (int) (a17.f131000a - (i19 * f18));
        int i29 = (int) (a17.f131001b - (i27 * f27));
        return new android.graphics.Rect(i28, i29, i19 + i28, i27 + i29);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(android.view.ViewGroup viewGroup, android.view.View view) {
        viewGroup.removeView(view);
        if (view instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) view).removeAllViews();
        }
        mo36412xcb03051();
    }

    public static /* synthetic */ void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ps psVar) {
        android.view.View view;
        com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey mo37464x78d58245;
        android.view.ViewGroup q17;
        boolean z17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = psVar.f132291d;
        if (trVar == null || (view = psVar.f132292e) == null || (c4430xc2040f9 = (com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) trVar.e_) == null || (mo37464x78d58245 = c4430xc2040f9.mo37464x78d58245()) == null || (q17 = psVar.q()) == null) {
            return;
        }
        if (!psVar.f132303p) {
            view.setVisibility(8);
            return;
        }
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        psVar.f132293f = view.getMeasuredWidth();
        psVar.f132294g = view.getMeasuredHeight();
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        android.graphics.Rect mo36419xd5aa333c = psVar.mo36419xd5aa333c(mo37464x78d58245);
        if (mo36419xd5aa333c != null) {
            if (view.getParent() == null) {
                int childCount = q17.getChildCount();
                int mo36420x397e976e = psVar.f132302o.mo36420x397e976e();
                int i17 = childCount - 1;
                int i18 = -1;
                int i19 = -1;
                while (true) {
                    if (i17 < 0) {
                        i17 = i19;
                        z17 = false;
                        break;
                    }
                    java.lang.Object tag = q17.getChildAt(i17).getTag();
                    if (tag instanceof java.lang.Integer) {
                        if (mo36420x397e976e >= ((java.lang.Integer) tag).intValue()) {
                            i18 = i17 + 1;
                            z17 = true;
                            break;
                        }
                        i19 = i17;
                    }
                    i17--;
                }
                if (z17) {
                    i17 = i18;
                }
                view.setTag(java.lang.Integer.valueOf(mo36420x397e976e));
                if (i17 < childCount) {
                    q17.addView(view, i17);
                } else {
                    q17.addView(view);
                }
            }
            android.graphics.Rect rect = new android.graphics.Rect();
            q17.getLocalVisibleRect(rect);
            if (rect.isEmpty()) {
                view.setVisibility(8);
                return;
            }
            if (rect.intersect(mo36419xd5aa333c)) {
                view.setVisibility(0);
            }
            view.setX(mo36419xd5aa333c.left);
            view.setY(mo36419xd5aa333c.top);
        }
    }
}
