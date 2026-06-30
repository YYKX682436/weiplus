package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public abstract class po<D extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ao> extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au<D> implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ev {
    protected com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26035xa5f569c1 b_;

    /* renamed from: d, reason: collision with root package name */
    private boolean f132203d;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az f132213n;

    /* renamed from: o, reason: collision with root package name */
    volatile boolean f132214o;

    /* renamed from: p, reason: collision with root package name */
    private java.lang.Object f132215p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f132216q;

    /* renamed from: r, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25994x1423c876.OnSelectedListener f132217r;

    /* renamed from: s, reason: collision with root package name */
    private float f132218s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f132219t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f132220u;

    /* renamed from: b, reason: collision with root package name */
    private boolean f132202b = false;

    /* renamed from: e, reason: collision with root package name */
    protected float f132204e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    protected int f132205f = android.graphics.Color.argb(17, 0, 163, 255);

    /* renamed from: g, reason: collision with root package name */
    protected int f132206g = android.graphics.Color.argb(255, 0, 163, 255);

    /* renamed from: h, reason: collision with root package name */
    protected float f132207h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    protected boolean f132208i = true;

    /* renamed from: j, reason: collision with root package name */
    protected boolean f132209j = false;

    /* renamed from: k, reason: collision with root package name */
    protected java.util.concurrent.atomic.AtomicInteger f132210k = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: l, reason: collision with root package name */
    protected int f132211l = 2;

    /* renamed from: m, reason: collision with root package name */
    public int f132212m = -1;

    /* renamed from: v, reason: collision with root package name */
    private final long f132221v = java.lang.System.nanoTime();

    public po(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az azVar) {
        this.f132213n = azVar;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az d() {
        return this.f132213n;
    }

    private void e() {
        this.f132214o = true;
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25994x1423c876.OnSelectedListener f() {
        return this.f132217r;
    }

    private static void g() {
    }

    private static void h() {
    }

    public int a() {
        return this.f132212m;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25979x32e3ffb8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public android.graphics.Rect mo36416x7436dfc8(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey eyVar) {
        return new android.graphics.Rect();
    }

    /* renamed from: getFillColor */
    public int m36892xbb5db4ea() {
        return this.f132205f;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25979x32e3ffb8
    /* renamed from: getGroupBounds */
    public java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25979x32e3ffb8<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey>> mo36417xe9d104de() {
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        arrayList.add(this);
        return arrayList;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26030xc162a7c7
    /* renamed from: getId */
    public java.lang.String mo36409x5db1b11() {
        return this.c_;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25989x14bfeebe
    /* renamed from: getLevel */
    public int mo36418x74bf41ce() {
        return this.f132211l;
    }

    /* renamed from: getRotation */
    public float m36893x79734cf4() {
        return this.f132218s;
    }

    /* renamed from: getStrokeColor */
    public int m36894x4b6e32d5() {
        return this.f132206g;
    }

    /* renamed from: getStrokeWidth */
    public float m36895x4c853138() {
        return this.f132204e;
    }

    /* renamed from: getTag */
    public java.lang.Object m36896xb5887064() {
        return this.f132215p;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25989x14bfeebe
    /* renamed from: getZIndex */
    public int mo36420x397e976e() {
        return (int) this.f132207h;
    }

    public void h_() {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25998xe695d027
    /* renamed from: handleOnTap */
    public boolean mo36421x5820b3fc() {
        return false;
    }

    /* renamed from: isClickable */
    public boolean m36897xd12298d8() {
        return this.f132203d;
    }

    /* renamed from: isDraggable */
    public boolean m36898x34173f83() {
        return this.f132219t;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25991xc3dfd4bb
    /* renamed from: isRemoved */
    public boolean mo36411x1e855fd6() {
        return this.f132220u;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25994x1423c876
    /* renamed from: isSelected */
    public boolean mo36422x17bd99e5() {
        return this.f132216q;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25999x7f0a8852
    /* renamed from: isVisible */
    public boolean mo36423xf94337e8() {
        return this.b_ != null ? this.f132208i && this.f132202b : this.f132208i;
    }

    public void j_() {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez
    public final long o() {
        return this.f132221v;
    }

    public void p() {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ev
    public boolean q() {
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ev
    public final void r() {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25991xc3dfd4bb
    /* renamed from: releaseData */
    public void mo36412xcb03051() {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25991xc3dfd4bb
    /* renamed from: remove */
    public final void mo36414xc84af884() {
        this.f132217r = null;
        this.f132213n.d(mo36409x5db1b11());
        h_();
        this.f132220u = true;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ex
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26035xa5f569c1 s() {
        return this.b_;
    }

    /* renamed from: setClickable */
    public void m36899xe6a688a0(boolean z17) {
        this.f132203d = z17;
    }

    /* renamed from: setDraggable */
    public void mo36462x499b2f4b(boolean z17) {
        this.f132219t = z17;
    }

    /* renamed from: setFillColor */
    public void m36900x17b1755e(int i17) {
        this.f132205f = i17;
        w();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25989x14bfeebe, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d
    /* renamed from: setLevel */
    public void mo35536x534d5c42(int i17) {
        this.f132211l = i17;
        w();
    }

    /* renamed from: setRotation */
    public void mo36474x742bae00(float f17) {
        this.f132218s = f17;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25994x1423c876
    /* renamed from: setSelected */
    public void mo36425xbd98911d(boolean z17) {
        this.f132216q = z17;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25994x1423c876
    /* renamed from: setSelectedListener */
    public void mo36426x884f4cf1(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25994x1423c876.OnSelectedListener onSelectedListener) {
        this.f132217r = onSelectedListener;
    }

    /* renamed from: setStrokeColor */
    public void m36901xe1d3a649(int i17) {
        this.f132206g = i17;
        w();
    }

    /* renamed from: setStrokeWidth */
    public void m36902xe2eaa4ac(float f17) {
        this.f132204e = f17;
        w();
    }

    /* renamed from: setTag */
    public void mo36890xca0297d8(java.lang.Object obj) {
        this.f132215p = obj;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25999x7f0a8852
    /* renamed from: setVisible */
    public void mo36427xcd1079b0(boolean z17) {
        this.f132208i = z17;
        w();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25989x14bfeebe
    /* renamed from: setZIndex */
    public void mo36429x2cb3cb7a(int i17) {
        mo36428x2cb3cb7a(i17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ex
    public final boolean t() {
        return this.f132202b;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ex
    public void u() {
        if (this.b_ != null) {
            this.f132202b = false;
            mo36427xcd1079b0(false);
        }
        p();
    }

    public final boolean v() {
        if (this.f132210k.get() > 0) {
            this.f132209j = true;
            this.f132210k.set(0);
        }
        return this.f132209j;
    }

    public void w() {
        if (this.f132214o) {
            return;
        }
        this.f132210k.incrementAndGet();
        this.f132209j = true;
    }

    public final void x() {
        this.f132214o = false;
        w();
    }

    public final java.lang.String y() {
        return this.c_;
    }

    private void a(int i17) {
        this.f132212m = i17;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25989x14bfeebe
    /* renamed from: setZIndex */
    public void mo36428x2cb3cb7a(float f17) {
        this.f132207h = f17;
        w();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ex
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26035xa5f569c1 c26035xa5f569c1) {
        this.b_ = c26035xa5f569c1;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ex
    public void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 c26034x15ff5647) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26035xa5f569c1 c26035xa5f569c1 = this.b_;
        if (c26035xa5f569c1 != null) {
            boolean equals = c26035xa5f569c1.m99473x9616526c().equals(c26034x15ff5647.m99470x9616526c());
            this.f132202b = equals;
            mo36427xcd1079b0(equals);
        }
        p();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.et
    public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az azVar;
        boolean v17 = v();
        j_();
        if (v17 && (azVar = this.f132213n) != null) {
            azVar.H();
        }
        this.f132209j = false;
    }
}
