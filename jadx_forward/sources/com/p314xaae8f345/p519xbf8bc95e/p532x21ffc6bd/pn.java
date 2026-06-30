package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class pn extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.am> implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.am {

    /* renamed from: y, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicInteger f132188y = new java.util.concurrent.atomic.AtomicInteger(0);
    private android.view.View A;
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25982xe7f56712[] B;
    private boolean C;

    /* renamed from: d, reason: collision with root package name */
    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx f132189d;

    /* renamed from: p, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an f132190p;

    /* renamed from: q, reason: collision with root package name */
    private android.graphics.Bitmap f132191q;

    /* renamed from: r, reason: collision with root package name */
    private int f132192r;

    /* renamed from: s, reason: collision with root package name */
    private int f132193s;

    /* renamed from: t, reason: collision with root package name */
    private com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df f132194t;

    /* renamed from: u, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr f132195u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f132196v;

    /* renamed from: w, reason: collision with root package name */
    private float f132197w;

    /* renamed from: x, reason: collision with root package name */
    private float f132198x;

    /* renamed from: z, reason: collision with root package name */
    private boolean f132199z;

    public pn(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an anVar) {
        super(trVar);
        this.f132191q = null;
        this.f132192r = 0;
        this.f132193s = 0;
        this.f132194t = null;
        this.f132196v = false;
        this.f132197w = 0.5f;
        this.f132198x = 0.5f;
        this.f132199z = false;
        this.C = true;
        this.f132195u = trVar;
        this.f132190p = anVar;
        if (trVar == null || anVar == null || anVar.mo36439xf353c268() == null) {
            return;
        }
        i();
        if (((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) trVar.e_).f134045o.f132044k != null) {
            this.f132189d = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx(this, trVar, b(anVar.mo36439xf353c268()));
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b("create InfoWindowView:" + this.A);
            this.f132189d.f132628u = anVar.m();
            a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.a(this.A), anVar.mo36439xf353c268().m99708x2146b97());
        }
    }

    public static android.view.View a(android.content.Context context, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew ewVar, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.InfoWindowAdapter infoWindowAdapter, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a) {
        if (context == null || ewVar == null || interfaceC26059x88f1805a == null || bdVar == null) {
            return null;
        }
        java.lang.String mo36446x7531c8a2 = interfaceC26059x88f1805a.mo36446x7531c8a2();
        java.lang.String mo36443xc2eb2ce7 = interfaceC26059x88f1805a.mo36443xc2eb2ce7();
        if (infoWindowAdapter == null) {
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(mo36446x7531c8a2) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(mo36443xc2eb2ce7)) {
                return null;
            }
            return a(context, bdVar, ewVar, mo36446x7531c8a2, mo36443xc2eb2ce7);
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ewVar.g();
        if (linearLayout == null) {
            linearLayout = a(context);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.av avVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.av) bdVar.e().f130496c.a(interfaceC26059x88f1805a.mo36409x5db1b11(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.av.class);
        if (avVar == null) {
            return null;
        }
        android.view.View mo99152xc3c42a34 = infoWindowAdapter.mo99152xc3c42a34(avVar);
        if (mo99152xc3c42a34 != null) {
            if (mo99152xc3c42a34.getParent() == linearLayout) {
                return linearLayout;
            }
            if (mo99152xc3c42a34.getParent() instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) mo99152xc3c42a34.getParent()).removeAllViews();
            }
            linearLayout.setBackgroundDrawable(null);
            a(linearLayout);
            linearLayout.addView(mo99152xc3c42a34);
            return linearLayout;
        }
        android.view.View mo99151x40d285e = infoWindowAdapter.mo99151x40d285e(avVar);
        if (mo99151x40d285e != null) {
            if (mo99151x40d285e.getParent() == linearLayout) {
                return linearLayout;
            }
            if (mo99151x40d285e.getParent() instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) mo99151x40d285e.getParent()).removeAllViews();
            }
            a(linearLayout);
            a(linearLayout, "marker_infowindow.9.png");
            linearLayout.addView(mo99151x40d285e);
            return linearLayout;
        }
        if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(mo36446x7531c8a2) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(mo36443xc2eb2ce7)) {
            return null;
        }
        a(linearLayout, "marker_infowindow.9.png");
        linearLayout.removeAllViews();
        a(bdVar, linearLayout, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew.f130956b, mo36446x7531c8a2);
        a(bdVar, linearLayout, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew.f130957c, mo36443xc2eb2ce7);
        return linearLayout;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qy b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4) {
        int m99684x49c37951 = c26064xea4764e4.m99684x49c37951();
        int m99685x1a244972 = c26064xea4764e4.m99685x1a244972();
        d();
        e();
        float f17 = this.f132197w - ((m99684x49c37951 * 1.0f) / this.f132192r);
        float f18 = this.f132198x - ((m99685x1a244972 * 1.0f) / this.f132193s);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26060x2581df2b[] m99683xb94374d5 = c26064xea4764e4.m99683xb94374d5();
        if (m99683xb94374d5 == null || c26064xea4764e4.m99675x63acda98() == com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26061x5ec49214.TOGETHER) {
            m99683xb94374d5 = c26064xea4764e4.m99676x8e265777();
        }
        mo36460xbc4aa583(m99683xb94374d5);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qy qyVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qy();
        qyVar.f132642i = com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df.m35328x3017aa(c26064xea4764e4.m99688xa86cd69f());
        qyVar.f132646m = c26064xea4764e4.m99672x742757a8();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qy a17 = qyVar.a(f17, f18);
        a17.f132647n = false;
        a17.f132657x = mo36450x8c2e79f(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26060x2581df2b.POI);
        a17.f132658y = mo36450x8c2e79f(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26060x2581df2b.MARKER);
        a17.f132652s = (int) c26064xea4764e4.m99695x397e976e();
        a17.f132653t = c26064xea4764e4.m99686x74bf41ce();
        a17.f132654u = this.f132196v;
        a17.A = "InfoWindow Of " + c26064xea4764e4.m99691xb5887064();
        a17.f132655v = true;
        return a17;
    }

    private void h() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an anVar = this.f132190p;
        if (this.f132195u == null || anVar == null || anVar.mo36439xf353c268() == null) {
            return;
        }
        i();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f132195u;
        if (((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) trVar.e_).f134045o.f132044k == null) {
            return;
        }
        this.f132189d = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx(this, trVar, b(anVar.mo36439xf353c268()));
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b("create InfoWindowView:" + this.A);
        this.f132189d.f132628u = anVar.m();
        a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.a(this.A), anVar.mo36439xf353c268().m99708x2146b97());
    }

    private void i() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f132195u;
        if (trVar == null || trVar.I() == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an anVar = this.f132190p;
        android.view.View a17 = a(trVar.I(), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd) trVar.d_, this, anVar != null ? anVar.g() : null, anVar);
        this.A = a17;
        if (a17 == null || a17.isInLayout()) {
            return;
        }
        if (this.A.isLayoutRequested() || this.A.getWidth() == 0 || this.A.getHeight() == 0) {
            this.A.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            this.f132192r = this.A.getMeasuredWidth();
            int measuredHeight = this.A.getMeasuredHeight();
            this.f132193s = measuredHeight;
            this.A.layout(0, 0, this.f132192r, measuredHeight);
            this.A.setLayoutParams(new android.widget.FrameLayout.LayoutParams(this.f132192r, this.f132193s));
        }
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.am j() {
        return this;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx k() {
        return this.f132189d;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew
    public final void c(boolean z17) {
        this.f132199z = z17;
        mo36427xcd1079b0(z17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew
    public final void d() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an anVar = this.f132190p;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f132195u;
        if (anVar == null || trVar == null || trVar.I() == null) {
            return;
        }
        int mo36447x755bd410 = anVar.mo36447x755bd410(trVar.I());
        float m99681x72a3df6c = anVar.mo36439xf353c268() != null ? anVar.mo36439xf353c268().m99681x72a3df6c() : 0.5f;
        int i17 = this.f132192r;
        if (i17 == 0) {
            i17 = 1;
        }
        this.f132197w = m99681x72a3df6c + ((mo36447x755bd410 * (anVar.mo36433xa62d00a() - 0.5f)) / i17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew
    public final void e() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an anVar = this.f132190p;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f132195u;
        if (anVar == null || trVar == null || trVar.I() == null) {
            return;
        }
        int mo36437x1c4fb41d = (int) (anVar.mo36437x1c4fb41d(trVar.I()) * anVar.mo36434xa62d00b());
        int i17 = this.f132193s;
        float m99682x72a3df6d = anVar.mo36439xf353c268() != null ? anVar.mo36439xf353c268().m99682x72a3df6d() : 1.0f;
        if (i17 == 0) {
            i17 = 1;
        }
        float f17 = i17;
        this.f132198x = ((mo36437x1c4fb41d + 5) + (m99682x72a3df6d * f17)) / f17;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew
    public final void f() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an anVar = this.f132190p;
        if (anVar == null || !this.C) {
            return;
        }
        a(anVar.mo36439xf353c268());
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au
    public final /* bridge */ /* synthetic */ com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ao f_() {
        return this;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew
    public final android.view.View g() {
        return this.A;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26030xc162a7c7
    /* renamed from: getId */
    public final java.lang.String mo36409x5db1b11() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.f132189d;
        return qxVar != null ? qxVar.mo36409x5db1b11() : super.mo36409x5db1b11();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po
    public final void h_() {
        mo36412xcb03051();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew
    public final void i_() {
        int i17;
        int i18;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an anVar = this.f132190p;
        if (anVar == null || anVar.mo36439xf353c268() == null) {
            i17 = 0;
            i18 = 0;
        } else {
            i17 = anVar.mo36439xf353c268().m99684x49c37951();
            i18 = anVar.mo36439xf353c268().m99685x1a244972();
        }
        d();
        e();
        float f17 = this.f132197w - ((i17 * 1.0f) / this.f132192r);
        float f18 = this.f132198x - ((i18 * 1.0f) / this.f132193s);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.f132189d;
        if (qxVar != null) {
            qxVar.a(f17, f18);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25983x9215236c
    /* renamed from: isCollisionBy */
    public final boolean mo36450x8c2e79f(final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25982xe7f56712 interfaceC25982xe7f56712) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25982xe7f56712[] interfaceC25982xe7f56712Arr = this.B;
        if (interfaceC25982xe7f56712Arr != null) {
            return com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35856x6bdbce7(interfaceC25982xe7f56712Arr, new com.p314xaae8f345.map.p511x696c9db.InterfaceC4313x73735db5<java.lang.Boolean, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25982xe7f56712>() { // from class: com.tencent.mapsdk.internal.pn.1
                private java.lang.Boolean a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25982xe7f56712 interfaceC25982xe7f567122) {
                    return java.lang.Boolean.valueOf(interfaceC25982xe7f567122 == interfaceC25982xe7f56712);
                }

                @Override // com.p314xaae8f345.map.p511x696c9db.InterfaceC4313x73735db5
                /* renamed from: callback */
                public final /* synthetic */ java.lang.Boolean mo35807xf5bc2045(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25982xe7f56712 interfaceC25982xe7f567122) {
                    return java.lang.Boolean.valueOf(interfaceC25982xe7f567122 == interfaceC25982xe7f56712);
                }
            });
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25999x7f0a8852
    /* renamed from: isVisible */
    public final boolean mo36423xf94337e8() {
        return c() && super.mo36423xf94337e8();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po
    public final void j_() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.f132189d;
        if (qxVar != null) {
            qxVar.j_();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25998xe695d027
    /* renamed from: onTap */
    public final boolean mo36424x64f7944(float f17, float f18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.f132189d;
        if (qxVar == null) {
            return false;
        }
        return qxVar.mo36424x64f7944(f17, f18);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ev
    public final void p() {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25991xc3dfd4bb
    /* renamed from: releaseData */
    public final void mo36412xcb03051() {
        this.f132191q = null;
        this.f132190p = null;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25983x9215236c
    /* renamed from: setCollisions */
    public final void mo36460xbc4aa583(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25982xe7f56712... interfaceC25982xe7f56712Arr) {
        this.B = interfaceC25982xe7f56712Arr;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.f132189d;
        if (qxVar == null) {
            return;
        }
        if (mo36450x8c2e79f(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26060x2581df2b.NONE) || interfaceC25982xe7f56712Arr.length == 0) {
            qxVar.b(false);
            qxVar.c(false);
        } else {
            qxVar.b(mo36450x8c2e79f(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26060x2581df2b.POI));
            qxVar.c(mo36450x8c2e79f(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26060x2581df2b.MARKER));
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po
    /* renamed from: setTag */
    public final void mo36890xca0297d8(java.lang.Object obj) {
        super.mo36890xca0297d8(obj);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.f132189d;
        if (qxVar != null) {
            qxVar.mo36890xca0297d8(obj);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25999x7f0a8852
    /* renamed from: setVisible */
    public final void mo36427xcd1079b0(boolean z17) {
        M m17;
        super.mo36427xcd1079b0(z17);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.f132189d;
        if (qxVar != null) {
            qxVar.mo36427xcd1079b0(z17);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f132195u;
        if (trVar == null || (m17 = trVar.e_) == 0) {
            return;
        }
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) m17).f134045o.f132055v = true;
    }

    /* renamed from: toString */
    public final java.lang.String m36891x9616526c() {
        return "GLInfoWindowOverlay{id='" + mo36409x5db1b11() + "'nativeId='" + a() + "'tag='" + m36896xb5887064() + "'}";
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew
    public final boolean c() {
        return this.f132199z && this.f132191q != null;
    }

    private static void a(android.widget.LinearLayout linearLayout) {
        linearLayout.removeAllViews();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
        linearLayout.setPadding(0, 0, 0, 0);
        marginLayoutParams.setMargins(0, 0, 0, 0);
        linearLayout.setLayoutParams(marginLayoutParams);
    }

    private static android.view.View a(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 interfaceC25963x17625b8, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew ewVar, java.lang.String str, java.lang.String str2) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ewVar.g();
        if (linearLayout == null) {
            linearLayout = a(context);
        } else {
            linearLayout.removeAllViews();
        }
        a(linearLayout, "marker_infowindow.9.png");
        a(interfaceC25963x17625b8, linearLayout, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew.f130956b, str);
        a(interfaceC25963x17625b8, linearLayout, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew.f130957c, str2);
        return linearLayout;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25979x32e3ffb8
    /* renamed from: b */
    public final android.graphics.Rect mo36416x7436dfc8(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey eyVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.f132189d;
        if (qxVar != null) {
            return qxVar.mo36416x7436dfc8(eyVar);
        }
        return new android.graphics.Rect(0, 0, 0, 0);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew
    public final void b(boolean z17) {
        this.f132196v = z17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.f132189d;
        if (qxVar != null) {
            qxVar.a(z17);
        }
    }

    private static android.widget.LinearLayout a(android.content.Context context) {
        if (context == null) {
            return null;
        }
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setTag(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew.f130955a);
        linearLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        return linearLayout;
    }

    private static void a(android.view.ViewGroup viewGroup, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            viewGroup.setBackgroundDrawable(null);
        }
        android.graphics.Bitmap b17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.b(viewGroup.getContext(), str);
        if (b17 != null) {
            viewGroup.setBackgroundDrawable(new android.graphics.drawable.NinePatchDrawable(viewGroup.getContext().getResources(), b17, b17.getNinePatchChunk(), new android.graphics.Rect(10, 10, 10, 30), null));
        }
    }

    private static void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 interfaceC25963x17625b8, android.widget.LinearLayout linearLayout, java.lang.String str, java.lang.String str2) {
        if (linearLayout == null || linearLayout.getContext() == null) {
            return;
        }
        android.content.Context context = linearLayout.getContext();
        android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewWithTag(str);
        if (android.text.TextUtils.isEmpty(str2)) {
            if (textView != null) {
                linearLayout.removeView(textView);
                return;
            }
            return;
        }
        if (textView == null) {
            textView = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nb(context, interfaceC25963x17625b8);
            textView.setTag(str);
            textView.setGravity(3);
            textView.setTextColor(-16777216);
            linearLayout.addView(textView, new android.widget.LinearLayout.LayoutParams(-2, -2));
        }
        textView.setText(str2);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4) {
        if (c26064xea4764e4 == null || this.f132189d == null) {
            return;
        }
        mo36427xcd1079b0(c26064xea4764e4.m99711xf94337e8());
        mo35536x534d5c42(c26064xea4764e4.m99686x74bf41ce());
        i();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qy b17 = b(c26064xea4764e4);
        if (b17 == null) {
            return;
        }
        this.f132189d.a(b17);
        a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.a(this.A), c26064xea4764e4.m99708x2146b97());
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew
    public final void a(boolean z17) {
        this.C = z17;
        if (c()) {
            mo36427xcd1079b0(z17);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        if (c26041x873d1d26 == null) {
            return;
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = this.f132194t;
        if (c4247x704e24df == null) {
            this.f132194t = com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df.m35328x3017aa(c26041x873d1d26);
        } else {
            c4247x704e24df.m35334xea574fff((int) (c26041x873d1d26.f49501xaa2bac6c * 1000000.0d));
            this.f132194t.m35335x2c901cbe((int) (c26041x873d1d26.f49502x83009af * 1000000.0d));
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.f132189d;
        if (qxVar != null) {
            qxVar.a(this.f132194t);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25979x32e3ffb8
    /* renamed from: a */
    public final android.graphics.Rect mo36419xd5aa333c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey eyVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.f132189d;
        if (qxVar == null) {
            return null;
        }
        return qxVar.mo36419xd5aa333c(eyVar);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew
    public final void a(int i17, int i18) {
        if (this.f132189d != null) {
            b(true);
            this.f132189d.a(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i18, i17));
        }
    }

    private void a(android.graphics.Bitmap bitmap, boolean z17) {
        this.f132191q = bitmap;
        if (bitmap == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b("setBitmapAssist:".concat(java.lang.String.valueOf(bitmap)));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(bitmap.hashCode() + f132188y.getAndIncrement());
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.f132189d;
        if (qxVar != null) {
            qxVar.a(sb7, z17, bitmap);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ev, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.am
    public final int a() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.f132189d;
        if (qxVar != null) {
            return qxVar.a();
        }
        return super.a();
    }
}
