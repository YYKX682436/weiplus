package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class og implements lj2.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f190175a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.y20 f190176b;

    /* renamed from: c, reason: collision with root package name */
    public final lj2.t0 f190177c;

    /* renamed from: d, reason: collision with root package name */
    public final int f190178d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f190179e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f190180f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.lg f190181g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ng f190182h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f190183i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f190184j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f190185k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f190186l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f190187m;

    /* renamed from: n, reason: collision with root package name */
    public int f190188n;

    /* renamed from: o, reason: collision with root package name */
    public int f190189o;

    /* renamed from: p, reason: collision with root package name */
    public int f190190p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 f190191q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f190192r;

    public og(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.y20 coverAbility, lj2.t0 buContextAbility, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverAbility, "coverAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContextAbility, "buContextAbility");
        this.f190175a = context;
        this.f190176b = coverAbility;
        this.f190177c = buContextAbility;
        this.f190178d = i17;
        this.f190179e = "Finder.FeedVoiceRoomAdapter";
        this.f190180f = new java.util.LinkedList();
        this.f190181g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.lg(this);
        this.f190182h = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ng(this);
        this.f190183i = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.mg(this));
        this.f190184j = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kg(this));
        this.f190185k = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jg(this));
        this.f190186l = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ig(this));
        this.f190187m = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.gg(this));
        new android.graphics.Point(0, 0);
        this.f190192r = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hg.f188455d);
    }

    @Override // lj2.y0
    public void a(android.graphics.Point curWindowSize, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curWindowSize, "curWindowSize");
        float f17 = curWindowSize.x / ((android.graphics.Point) ((jz5.n) this.f190192r).mo141623x754a37bb()).x;
        float m17 = fj2.r.f344715a.m(f17, curWindowSize, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f190179e, "updateWindowSize curWindowSize: " + curWindowSize + " scale = " + f17 + " translateY: " + m17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950 = this.f190191q;
        if (c14245x86828950 != null) {
            c14245x86828950.setTranslationY(-m17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x868289502 = this.f190191q;
        if (c14245x868289502 != null) {
            c14245x868289502.setScaleX(f17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x868289503 = this.f190191q;
        if (c14245x868289503 == null) {
            return;
        }
        c14245x868289503.setScaleY(f17);
    }

    @Override // lj2.y0
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950) {
        android.view.ViewGroup.LayoutParams layoutParams;
        this.f190191q = c14245x86828950;
        if (c14245x86828950 != null) {
            ((fi2.e0) ((jz5.n) this.f190186l).mo141623x754a37bb()).n(c14245x86828950);
            ((fi2.k) ((jz5.n) this.f190187m).mo141623x754a37bb()).g(c14245x86828950);
        }
        if (c14245x86828950 == null || (layoutParams = c14245x86828950.getLayoutParams()) == null) {
            return;
        }
        jz5.g gVar = this.f190192r;
        layoutParams.width = ((android.graphics.Point) ((jz5.n) gVar).mo141623x754a37bb()).x;
        layoutParams.height = ((android.graphics.Point) ((jz5.n) gVar).mo141623x754a37bb()).y;
    }

    @Override // lj2.y0
    public fi2.l c() {
        return (fi2.k) ((jz5.n) this.f190187m).mo141623x754a37bb();
    }

    @Override // lj2.y0
    public void d(gk2.e buContext, int i17, int i18, int i19, int i27, android.graphics.Point curWindowSize, java.util.LinkedList dataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curWindowSize, "curWindowSize");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        this.f190188n = i17;
        this.f190189o = i18;
        this.f190190p = i19;
        java.util.LinkedList linkedList = this.f190180f;
        linkedList.clear();
        linkedList.addAll(dataList);
        a(curWindowSize, i27);
        f().j(linkedList, new android.graphics.Rect());
    }

    @Override // lj2.y0
    public ah2.f e() {
        return (fi2.e0) ((jz5.n) this.f190186l).mo141623x754a37bb();
    }

    public final gi2.e f() {
        gi2.e d17;
        int i17 = this.f190188n;
        int i18 = this.f190189o;
        int i19 = this.f190190p;
        boolean z17 = false;
        if ((i17 == 0 && i19 == 1) || (i17 == 2 && i18 == 1)) {
            d17 = (gi2.e) ((jz5.n) this.f190183i).mo141623x754a37bb();
        } else {
            if (i17 == 2 && i18 == 8) {
                d17 = (gi2.e) ((jz5.n) this.f190185k).mo141623x754a37bb();
            } else {
                if ((i17 == 0 && i19 == 4) || (i17 == 2 && i18 == 16)) {
                    z17 = true;
                }
                d17 = z17 ? ((fi2.k) ((jz5.n) this.f190187m).mo141623x754a37bb()).d() : (gi2.e) ((jz5.n) this.f190184j).mo141623x754a37bb();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950 = this.f190191q;
        if (c14245x86828950 != null) {
            c14245x86828950.m56838x6cab2c8d(d17);
        }
        return d17;
    }

    @Override // lj2.y0
    /* renamed from: onAttach */
    public void mo56531x3b13c504() {
        ((fi2.e0) ((jz5.n) this.f190186l).mo141623x754a37bb()).m();
    }

    @Override // lj2.y0
    /* renamed from: reset */
    public void mo56532x6761d4f() {
        java.util.LinkedList linkedList = this.f190180f;
        if (linkedList.size() > 0) {
            linkedList.clear();
            f().j(linkedList, new android.graphics.Rect());
        }
        ((fi2.e0) ((jz5.n) this.f190186l).mo141623x754a37bb()).o();
    }
}
