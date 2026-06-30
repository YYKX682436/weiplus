package em2;

/* loaded from: classes10.dex */
public final class i implements lj2.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f336665a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.y20 f336666b;

    /* renamed from: c, reason: collision with root package name */
    public final int f336667c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f336668d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f336669e;

    /* renamed from: f, reason: collision with root package name */
    public final gk2.e f336670f;

    /* renamed from: g, reason: collision with root package name */
    public lj2.t0 f336671g;

    /* renamed from: h, reason: collision with root package name */
    public final em2.f f336672h;

    /* renamed from: i, reason: collision with root package name */
    public final em2.h f336673i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f336674j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f336675k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f336676l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f336677m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f336678n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f336679o;

    /* renamed from: p, reason: collision with root package name */
    public int f336680p;

    /* renamed from: q, reason: collision with root package name */
    public int f336681q;

    /* renamed from: r, reason: collision with root package name */
    public int f336682r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 f336683s;

    public i(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.y20 y20Var, lj2.t0 t0Var, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f336665a = context;
        this.f336666b = y20Var;
        this.f336667c = i17;
        this.f336668d = "Finder.FloatVoiceRoomAdapter";
        this.f336669e = new java.util.LinkedList();
        this.f336670f = new gk2.e("Finder.FloatVoiceRoomAdapter");
        this.f336671g = t0Var;
        this.f336672h = new em2.f(this);
        this.f336673i = new em2.h();
        this.f336674j = jz5.h.b(new em2.g(this));
        this.f336675k = jz5.h.b(new em2.e(this));
        this.f336676l = jz5.h.b(new em2.d(this));
        this.f336677m = jz5.h.b(new em2.b(this));
        this.f336678n = jz5.h.b(new em2.c(this));
        this.f336679o = jz5.h.b(new em2.a(this));
    }

    @Override // lj2.y0
    public void a(android.graphics.Point curWindowSize, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curWindowSize, "curWindowSize");
        int i18 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x;
        if (i18 <= 0) {
            return;
        }
        float f17 = curWindowSize.x / i18;
        float f18 = 0.0f;
        if (f17 <= 0.0f) {
            return;
        }
        int i19 = this.f336681q;
        if (((i19 == 0 && this.f336680p == 4) || (i19 == 2 && this.f336682r == 16)) && g().f()) {
            f18 = ((r0.y * f17) - curWindowSize.y) / 2.0f;
        } else if (this.f336667c != 4) {
            f18 = fj2.r.f344715a.m(f17, curWindowSize, i17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f336668d, "updateData curWindowSize: " + curWindowSize + " scale = " + f17 + " translateY: " + f18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950 = this.f336683s;
        if (c14245x86828950 != null) {
            c14245x86828950.setTranslationY(-f18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x868289502 = this.f336683s;
        if (c14245x868289502 != null) {
            c14245x868289502.setScaleX(f17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x868289503 = this.f336683s;
        if (c14245x868289503 == null) {
            return;
        }
        c14245x868289503.setScaleY(f17);
    }

    @Override // lj2.y0
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950) {
        android.view.ViewGroup.LayoutParams layoutParams;
        this.f336683s = c14245x86828950;
        if (c14245x86828950 != null) {
            h().n(c14245x86828950);
            g().g(c14245x86828950);
        }
        if (c14245x86828950 == null || (layoutParams = c14245x86828950.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x;
        layoutParams.height = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y;
    }

    @Override // lj2.y0
    public fi2.l c() {
        return g();
    }

    @Override // lj2.y0
    public void d(gk2.e buContext, int i17, int i18, int i19, int i27, android.graphics.Point curWindowSize, java.util.LinkedList dataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curWindowSize, "curWindowSize");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        this.f336680p = i19;
        this.f336681q = i17;
        this.f336682r = i18;
        if (this.f336671g == null) {
            this.f336671g = new zi2.y(buContext);
        }
        java.util.LinkedList linkedList = this.f336669e;
        linkedList.clear();
        linkedList.addAll(dataList);
        a(curWindowSize, i27);
        f().j(linkedList, new android.graphics.Rect());
    }

    @Override // lj2.y0
    public ah2.f e() {
        return h();
    }

    public final gi2.e f() {
        gi2.e d17;
        int i17 = this.f336681q;
        boolean z17 = false;
        if ((i17 == 0 && this.f336680p == 1) || (i17 == 2 && this.f336682r == 1)) {
            d17 = (gi2.e) ((jz5.n) this.f336674j).mo141623x754a37bb();
        } else {
            if (this.f336681q == 2 && this.f336682r == 8) {
                d17 = this.f336667c == 4 ? (gi2.e) ((jz5.n) this.f336677m).mo141623x754a37bb() : (gi2.e) ((jz5.n) this.f336676l).mo141623x754a37bb();
            } else {
                int i18 = this.f336681q;
                int i19 = this.f336682r;
                int i27 = this.f336680p;
                if ((i18 == 0 && i27 == 4) || (i18 == 2 && i19 == 16)) {
                    z17 = true;
                }
                d17 = z17 ? g().d() : (gi2.e) ((jz5.n) this.f336675k).mo141623x754a37bb();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950 = this.f336683s;
        if (c14245x86828950 != null) {
            c14245x86828950.m56838x6cab2c8d(d17);
        }
        return d17;
    }

    public final fi2.k g() {
        return (fi2.k) ((jz5.n) this.f336679o).mo141623x754a37bb();
    }

    public final fi2.e0 h() {
        return (fi2.e0) ((jz5.n) this.f336678n).mo141623x754a37bb();
    }

    @Override // lj2.y0
    /* renamed from: onAttach */
    public void mo56531x3b13c504() {
        h().m();
    }

    @Override // lj2.y0
    /* renamed from: reset */
    public void mo56532x6761d4f() {
        java.util.LinkedList linkedList = this.f336669e;
        if (linkedList.size() > 0) {
            linkedList.clear();
            f().j(linkedList, new android.graphics.Rect());
        }
        h().o();
    }
}
