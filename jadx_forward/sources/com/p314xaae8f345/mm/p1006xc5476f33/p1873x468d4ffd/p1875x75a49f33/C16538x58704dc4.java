package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* renamed from: com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar */
/* loaded from: classes10.dex */
public class C16538x58704dc4 extends android.widget.RelativeLayout {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f230404w = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f230405d;

    /* renamed from: e, reason: collision with root package name */
    public int f230406e;

    /* renamed from: f, reason: collision with root package name */
    public int f230407f;

    /* renamed from: g, reason: collision with root package name */
    public int f230408g;

    /* renamed from: h, reason: collision with root package name */
    public int f230409h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.g f230410i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.h f230411m;

    /* renamed from: n, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f230412n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.z f230413o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a f230414p;

    /* renamed from: q, reason: collision with root package name */
    public int f230415q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d f230416r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.i f230417s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.Runnable f230418t;

    /* renamed from: u, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 f230419u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.k1 f230420v;

    public C16538x58704dc4(android.content.Context context) {
        super(context);
        this.f230407f = -1;
        this.f230417s = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.i(4, new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.q(this));
        this.f230418t = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.s(this);
        this.f230419u = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.v(this);
        this.f230420v = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.w(this);
        e();
    }

    public static int a(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4 c16538x58704dc4, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.z zVar = c16538x58704dc4.f230413o;
        if (zVar == null) {
            throw new java.lang.IllegalStateException("recyclerAdapter is null");
        }
        if (c16538x58704dc4.f230407f <= 0) {
            throw new java.lang.IllegalStateException("durationMs <= 0");
        }
        zVar.mo1894x7e414b06();
        return (int) (java.lang.Math.min(java.lang.Math.max(0.0f, i17 / c16538x58704dc4.f230407f), 1.0f) * c16538x58704dc4.f230409h * (c16538x58704dc4.f230413o.mo1894x7e414b06() - 2));
    }

    /* renamed from: setViewWidth */
    private void m66911xfd8913df(int i17) {
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i17;
        setLayoutParams(layoutParams);
    }

    public float b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a c16543xabefc23a = this.f230414p;
        if (c16543xabefc23a == null) {
            return 0.0f;
        }
        float d17 = d(c16543xabefc23a.m66935x961e58d7(), true);
        this.f230414p.m66935x961e58d7();
        java.lang.Math.round(this.f230407f * d17);
        return d17;
    }

    public float c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a c16543xabefc23a = this.f230414p;
        if (c16543xabefc23a == null) {
            return 0.0f;
        }
        float d17 = d(c16543xabefc23a.m66934xcc839460(), false);
        this.f230414p.m66934xcc839460();
        java.lang.Math.round(this.f230407f * d17);
        return d17;
    }

    public final float d(int i17, boolean z17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        if (this.f230413o == null || (c1163xf1deaba4 = this.f230412n) == null) {
            return 0.0f;
        }
        android.view.View k07 = c1163xf1deaba4.k0(i17, 0.0f);
        if (k07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("RecyclerThumbSeekBar", "getPositionInTotalRange x[%d] isEnd[%b], view is null.", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
            return 0.0f;
        }
        int u07 = this.f230412n.u0(k07);
        int mo1894x7e414b06 = this.f230413o.mo1894x7e414b06();
        if (u07 < 1) {
            return 0.0f;
        }
        if (u07 >= mo1894x7e414b06 - 1) {
            return 1.0f;
        }
        return ((u07 - 1) + ((i17 - k07.getLeft()) / k07.getWidth())) / (mo1894x7e414b06 - 2);
    }

    public final void e() {
        this.f230412n = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4(getContext(), null);
        this.f230412n.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(getContext(), 0, false));
        this.f230412n.m7963x830bc99d(true);
        i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.ad_);
        this.f230415q = i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.ad9);
        addView(this.f230412n, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        this.f230414p = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a(getContext(), null);
        addView(this.f230414p, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        this.f230414p.m66944x5e352211(this.f230420v);
        this.f230412n.i(this.f230419u);
    }

    public void f(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerThumbSeekBar", "initAsync %s", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.u(this));
        } else {
            this.f230405d = str;
            post(this.f230418t);
        }
    }

    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.a0 a0Var;
        this.f230407f = -1;
        this.f230405d = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.i iVar = this.f230417s;
        if (iVar != null) {
            iVar.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.z zVar = this.f230413o;
        if (zVar != null && (a0Var = zVar.f230644d) != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3[] n3VarArr = a0Var.f230511c;
            if (n3VarArr != null && n3VarArr.length != 0) {
                for (int i17 = 0; i17 < n3VarArr.length; i17++) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = n3VarArr[i17];
                    if (n3Var != null) {
                        n3Var.mo50283x2f1920ea().f538836b.g();
                        n3VarArr[i17] = null;
                    }
                }
            }
            this.f230413o.f230644d = null;
            this.f230413o = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a c16543xabefc23a = this.f230414p;
        if (c16543xabefc23a != null) {
            c16543xabefc23a.d();
        }
    }

    /* renamed from: getDurationMs */
    public int m66912x37a7fa50() {
        return this.f230407f;
    }

    /* renamed from: getRightSliderPosition */
    public int m66913x202d8f30() {
        return this.f230414p.m66935x961e58d7();
    }

    /* renamed from: setCurrentCursorPosition */
    public void m66914xbf54e136(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a c16543xabefc23a = this.f230414p;
        float f18 = 0.0f;
        if (this.f230413o != null && this.f230412n != null) {
            float mo1894x7e414b06 = (r1.mo1894x7e414b06() - 2) * f17;
            int floor = (int) java.lang.Math.floor(mo1894x7e414b06);
            float f19 = mo1894x7e414b06 - floor;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = this.f230412n.p0(floor + 1);
            if (p07 != null) {
                android.view.View view = p07.f3639x46306858;
                f18 = (view.getLeft() + (view.getWidth() * f19)) / getWidth();
            }
        }
        c16543xabefc23a.m66939x853690dc(f18);
    }

    /* renamed from: setOnPreparedListener */
    public void m66915x5dd7c812(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.g gVar) {
        this.f230410i = gVar;
    }

    /* renamed from: setThumbBarSeekListener */
    public void m66916x13f495cb(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.h hVar) {
        this.f230411m = hVar;
    }

    /* renamed from: setVideoTransPara */
    public void m66917x824516f(com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d) {
        this.f230416r = c11120x15dce88d;
        if (c11120x15dce88d.f152728h <= c11120x15dce88d.f152729i) {
            this.f230414p.f230474f = true;
        }
    }

    public C16538x58704dc4(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f230407f = -1;
        this.f230417s = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.i(4, new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.q(this));
        this.f230418t = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.s(this);
        this.f230419u = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.v(this);
        this.f230420v = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.w(this);
        e();
    }

    public C16538x58704dc4(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f230407f = -1;
        this.f230417s = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.i(4, new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.q(this));
        this.f230418t = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.s(this);
        this.f230419u = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.v(this);
        this.f230420v = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.w(this);
        e();
    }
}
