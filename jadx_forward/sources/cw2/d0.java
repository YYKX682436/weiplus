package cw2;

/* loaded from: classes15.dex */
public final class d0 {

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f305159n = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    public final kk4.c f305160a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd f305161b;

    /* renamed from: c, reason: collision with root package name */
    public int f305162c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f305163d;

    /* renamed from: e, reason: collision with root package name */
    public final int f305164e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f305165f;

    /* renamed from: g, reason: collision with root package name */
    public long f305166g;

    /* renamed from: h, reason: collision with root package name */
    public long f305167h;

    /* renamed from: i, reason: collision with root package name */
    public long f305168i;

    /* renamed from: j, reason: collision with root package name */
    public float f305169j;

    /* renamed from: k, reason: collision with root package name */
    public cw2.w9 f305170k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.Map f305171l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f305172m;

    public d0(kk4.c player, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd proxy) {
        java.util.Map map;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proxy, "proxy");
        this.f305160a = player;
        this.f305161b = proxy;
        this.f305163d = new java.util.concurrent.atomic.AtomicInteger();
        this.f305164e = ((c61.l7) i95.n0.c(c61.l7.class)).ek().f546241y * 1000;
        this.f305166g = 40000L;
        this.f305169j = 1.0f;
        java.util.concurrent.CopyOnWriteArrayList<r45.xe2> copyOnWriteArrayList = ((c61.l7) i95.n0.c(c61.l7.class)).ek().U;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (r45.xe2 xe2Var : copyOnWriteArrayList) {
            linkedHashMap.put(java.lang.Integer.valueOf(xe2Var.m75939xb282bd08(0)), java.lang.Integer.valueOf(xe2Var.m75939xb282bd08(1) * 1000));
        }
        this.f305171l = linkedHashMap;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.De).mo141623x754a37bb()).r()).booleanValue()) {
            map = kz5.c1.l(new jz5.l(30000, 25000), new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8), java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54059x396cc171)), new jz5.l(120000, java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8)));
        } else {
            java.util.concurrent.CopyOnWriteArrayList<r45.ye2> copyOnWriteArrayList2 = ((c61.l7) i95.n0.c(c61.l7.class)).ek().T;
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            for (r45.ye2 ye2Var : copyOnWriteArrayList2) {
                linkedHashMap2.put(java.lang.Integer.valueOf(ye2Var.m75939xb282bd08(0) * 1000), java.lang.Integer.valueOf(ye2Var.m75939xb282bd08(1) * 1000));
            }
            map = linkedHashMap2;
        }
        this.f305172m = map;
    }

    public final void a(long j17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209363mf).mo141623x754a37bb()).r()).booleanValue() && this.f305161b.isViewFocused && j17 >= this.f305164e) {
            long b17 = (((float) j17) * this.f305169j) + b() + c();
            if (b17 == this.f305168i) {
                return;
            }
            if (b17 > this.f305166g) {
                this.f305166g = b17;
            }
            long j18 = 1000;
            ((kk4.f0) this.f305160a).mo100903x59e24e46(this.f305163d.getAndIncrement(), b17 * j18, 0L, this.f305166g * j18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d(), "configBufferMs#" + str + " playSpeed:" + this.f305169j + ' ' + this.f305167h + " -> " + b17 + '(' + j17 + " + " + b() + " +" + c() + ") maxLimit:" + this.f305166g + ' ');
            this.f305167h = j17;
            this.f305168i = b17;
        }
    }

    public final int b() {
        cs2.j d17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209345lf).mo141623x754a37bb()).r()).booleanValue() || this.f305171l.size() == 0) {
            return 0;
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger = f305159n;
        if (atomicInteger.get() == 0 || !this.f305161b.f212198r) {
            return 0;
        }
        cw2.w9 w9Var = this.f305170k;
        int m17 = (w9Var == null || (d17 = w9Var.d1()) == null) ? 0 : d17.m();
        if (m17 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBufCtr", "getAppendBufferMs return for " + m17);
            return 0;
        }
        java.lang.Integer num = (java.lang.Integer) ((java.util.LinkedHashMap) this.f305171l).get(java.lang.Integer.valueOf(atomicInteger.get()));
        int intValue = num != null ? num.intValue() : 50000;
        this.f305161b.getF212205x0().N = intValue;
        return intValue;
    }

    public final int c() {
        cs2.j d17;
        if (!this.f305161b.f212198r) {
            return 0;
        }
        cw2.w9 w9Var = this.f305170k;
        int m17 = (w9Var == null || (d17 = w9Var.d1()) == null) ? 0 : d17.m();
        if (m17 <= 0) {
            return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBufCtr", "getAppendPart3Ms return for " + m17);
        return 0;
    }

    public final java.lang.String d() {
        return this.f305161b.m61380xe56ce956() + ".FinderBufCtr";
    }
}
