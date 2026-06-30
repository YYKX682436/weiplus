package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView */
/* loaded from: classes7.dex */
public abstract class AbstractC12805xabdd4ef7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12800x5824e46 implements l75.q0 {

    /* renamed from: d2, reason: collision with root package name */
    public android.content.Context f173439d2;

    /* renamed from: e2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.h0 f173440e2;

    /* renamed from: f2, reason: collision with root package name */
    public java.util.List f173441f2;

    /* renamed from: g2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.m1 f173442g2;

    /* renamed from: h2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.l2 f173443h2;

    /* renamed from: i2, reason: collision with root package name */
    public boolean f173444i2;

    /* renamed from: j2, reason: collision with root package name */
    public final java.util.List f173445j2;

    /* renamed from: k2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.l0 f173446k2;

    /* renamed from: l2, reason: collision with root package name */
    public final java.lang.Object f173447l2;

    /* renamed from: m2, reason: collision with root package name */
    public boolean f173448m2;

    /* renamed from: n2, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f173449n2;

    /* renamed from: o2, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f173450o2;

    /* renamed from: p2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.i0 f173451p2;

    /* renamed from: q2, reason: collision with root package name */
    public float f173452q2;

    /* renamed from: r2, reason: collision with root package name */
    public float f173453r2;

    /* renamed from: s2, reason: collision with root package name */
    public boolean f173454s2;

    public AbstractC12805xabdd4ef7(android.content.Context context) {
        super(context);
        this.f173441f2 = new java.util.ArrayList();
        this.f173443h2 = null;
        this.f173444i2 = false;
        this.f173445j2 = new java.util.ArrayList();
        this.f173447l2 = new java.lang.Object();
        this.f173448m2 = false;
        this.f173449n2 = null;
        this.f173450o2 = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f173451p2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.k1(this);
        this.f173454s2 = false;
        i1(context);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i17) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f173452q2 = motionEvent.getRawX();
            this.f173453r2 = motionEvent.getRawY();
        } else if (motionEvent.getAction() == 2 && this.f173454s2) {
            return true;
        }
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f173454s2 = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12800x5824e46
    public void g1() {
        if (this.f173449n2 == null) {
            this.f173449n2 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("UpdateAppBrandList_" + this.f173446k2);
        }
        synchronized (this.f173447l2) {
            if (this.f173448m2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseAppBrandRecentView", "refresh is running and delay mType: %s", this.f173446k2);
                if (this.f173450o2.size() <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseAppBrandRecentView", "refresh add updateTask");
                    this.f173450o2.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.r1(this, true));
                }
            } else {
                this.f173448m2 = true;
                this.f173449n2.m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.r1(this, true));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12800x5824e46, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4
    /* renamed from: getAdapter */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19() {
        return this.f173442g2;
    }

    /* renamed from: getCompletelyCountPerPage */
    public int m53638x2a647fd9() {
        return 4;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12800x5824e46
    /* renamed from: getCount */
    public int mo53619x7444f759() {
        return this.f173441f2.size();
    }

    /* renamed from: getCurrentPage */
    public int m53639xfdaa7672() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.l2 l2Var = this.f173443h2;
        if (l2Var != null) {
            return l2Var.f173537i;
        }
        return 0;
    }

    /* renamed from: getCustomItemCount */
    public int m53640x8a88f15() {
        return 0;
    }

    /* renamed from: getDataCount */
    public int m53641xe8381ccf() {
        java.util.List list = this.f173441f2;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: getItemWidth */
    public int m53642x7f5827bd() {
        return 0;
    }

    /* renamed from: getLayoutId */
    public abstract int mo53643x2ee31f5b();

    /* renamed from: getLoadCount */
    public abstract int mo53644x50b42d13();

    /* renamed from: getOnDataChangedListener */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.j0 m53645xa7a00069() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12800x5824e46
    /* renamed from: getOnItemClickListener */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.h0 mo53620x536a1ab4() {
        return this.f173440e2;
    }

    /* renamed from: getPreviewItemList */
    public java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.x> m53646x1754b003() {
        if (this.f173441f2 == null) {
            this.f173441f2 = new java.util.ArrayList();
        }
        return this.f173441f2;
    }

    /* renamed from: getShowCount */
    public abstract int mo53647x8c6e4d5c();

    /* renamed from: getShowCountPerPage */
    public float m53648x85f57c50() {
        return 4.0f;
    }

    /* renamed from: getType */
    public abstract java.lang.String mo53649xfb85f7b0();

    public final java.lang.String h1(java.lang.String str) {
        if (str != null) {
            try {
                if (com.p314xaae8f345.mm.ui.p2740x696c9db.v4.f(str) <= 11) {
                    return str;
                }
                int i17 = 0;
                int i18 = 0;
                for (char c17 : str.toCharArray()) {
                    i17 += com.p314xaae8f345.mm.ui.p2740x696c9db.v4.f(c17 + "");
                    if (i17 >= 11) {
                        return str.substring(0, i18) + (char) 8230;
                    }
                    i18++;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return str;
    }

    public void i1(android.content.Context context) {
        this.f173439d2 = context;
        context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561162b4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.l1 l1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.l1(this, this.f173439d2);
        l1Var.Q(0);
        mo7967x900dcbe1(l1Var);
        m7963x830bc99d(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.m1 m1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.m1(this, null);
        this.f173442g2 = m1Var;
        mo7960x6cab2c8d(m1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.l2 l2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.l2(m53640x8a88f15());
        this.f173443h2 = l2Var;
        getContext();
        int m53638x2a647fd9 = m53638x2a647fd9();
        l2Var.f173532d = this;
        l2Var.f173538m = m53638x2a647fd9;
        V0(l2Var);
        l2Var.f173532d.i(l2Var);
        l2Var.f173542q = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) l2Var.f173532d.getLayoutManager();
        l2Var.f173535g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.i2(l2Var, l2Var.f173532d.getContext());
        l2Var.f173536h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.j2(l2Var, l2Var.f173532d.getContext());
    }

    public void j1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.p1 p1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.x xVar, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4;
        int m53642x7f5827bd = m53642x7f5827bd();
        float m53648x85f57c50 = m53648x85f57c50();
        if (m53642x7f5827bd <= 0) {
            m53642x7f5827bd = (int) (getWidth() / m53648x85f57c50);
        }
        if (m53642x7f5827bd <= 0) {
            m53642x7f5827bd = (int) (getResources().getDisplayMetrics().widthPixels / m53648x85f57c50);
        }
        if (i17 == this.f173442g2.mo1894x7e414b06() - 1) {
            double d17 = m53642x7f5827bd;
            double d18 = m53648x85f57c50;
            m53642x7f5827bd = (int) (d17 * (1.0d - (java.lang.Math.ceil(d18) - d18)));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseAppBrandRecentView", "lastPosition %d set width %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(m53642x7f5827bd));
        }
        p1Var.f173565g.getLayoutParams().width = m53642x7f5827bd;
        android.view.View view = p1Var.f173565g;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        if (xVar == null || xVar.f173618b != 1 || (c11714x918fd2e4 = xVar.f173617a) == null) {
            return;
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11714x918fd2e4.f157900m);
        android.widget.TextView textView = p1Var.f173564f;
        if (!K0) {
            textView.setText(h1(c11714x918fd2e4.f157900m));
            textView.setVisibility(0);
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11714x918fd2e4.f157898h)) {
            textView.setText(h1(c11714x918fd2e4.f157898h));
            textView.setVisibility(0);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11714x918fd2e4.f157894d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseAppBrandRecentView", "[onBindCustomViewHolder] nickname is null! username:%s appId:%s", c11714x918fd2e4.f157894d, c11714x918fd2e4.f157895e);
            textView.setText("");
            textView.setVisibility(4);
        } else {
            textView.setText(c11714x918fd2e4.f157894d);
            textView.setVisibility(0);
        }
        p1Var.f173563e.setVisibility(0);
        boolean K02 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11714x918fd2e4.f157901n);
        android.widget.ImageView imageView = p1Var.f173562d;
        if (K02) {
            imageView.setImageDrawable(l01.a.h());
        } else {
            l01.d0.f396294a.b(imageView, c11714x918fd2e4.f157901n, l01.a.h(), l01.q0.f396320d);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        getMeasuredWidth();
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseAppBrandRecentView", "[onNotifyChange] process:%s eventId:%s, mType: %s", ((km0.c) gm0.j1.p().a()).m143639x9616526c(), java.lang.Integer.valueOf(w0Var.f398507b), this.f173446k2);
        int i17 = w0Var.f398507b;
        g1();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4
    public boolean r0(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.l2 l2Var = this.f173443h2;
        int b17 = l2Var.b(l2Var.f173533e + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12805xabdd4ef7 abstractC12805xabdd4ef7 = l2Var.f173532d;
        if (abstractC12805xabdd4ef7 != null && l2Var.f173547v) {
            l2Var.f173536h.f93582a = b17;
            l2Var.f173548w = true;
            abstractC12805xabdd4ef7.getLayoutManager().m8099x6305639d(l2Var.f173536h);
        }
        return super.r0(i17, i18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12800x5824e46
    /* renamed from: setDataQuery */
    public void mo53623x4553a4fc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.i0 i0Var) {
        this.f173451p2 = i0Var;
    }

    /* renamed from: setEnableDataCache */
    public void m53650x7f67f2f3(boolean z17) {
        this.f173444i2 = z17;
    }

    /* renamed from: setOnDataChangedListener */
    public void m53651x77b2b2dd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.j0 j0Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12800x5824e46
    /* renamed from: setOnItemClickListener */
    public void mo53624xa1aeda28(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.h0 h0Var) {
        this.f173440e2 = h0Var;
    }

    /* renamed from: setOnScrollPageListener */
    public void m53652x243c9791(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.k2 k2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.l2 l2Var = this.f173443h2;
        if (l2Var != null) {
            l2Var.getClass();
        }
    }

    /* renamed from: setType */
    public void m53653x7650bebc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.l0 l0Var) {
        this.f173446k2 = l0Var;
        if (l0Var == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.l0.MY_APP_BRAND) {
            if (i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5.class) != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5.class)).add(this);
            }
        } else {
            if (l0Var != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.l0.RECENT_APP_BRAND || i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6.class) == null) {
                return;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6.class)).add(this);
        }
    }

    public AbstractC12805xabdd4ef7(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f173441f2 = new java.util.ArrayList();
        this.f173443h2 = null;
        this.f173444i2 = false;
        this.f173445j2 = new java.util.ArrayList();
        this.f173447l2 = new java.lang.Object();
        this.f173448m2 = false;
        this.f173449n2 = null;
        this.f173450o2 = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f173451p2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.k1(this);
        this.f173454s2 = false;
        i1(context);
    }
}
