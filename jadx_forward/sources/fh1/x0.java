package fh1;

/* loaded from: classes7.dex */
public final class x0 extends hq0.i0 {
    public static jc3.o P;
    public final java.lang.String A;
    public hq0.e0 B;
    public final java.util.concurrent.ConcurrentHashMap C;
    public final java.util.concurrent.atomic.AtomicBoolean D;
    public final java.util.concurrent.ConcurrentSkipListSet E;
    public yz5.a F;
    public final java.util.concurrent.atomic.AtomicBoolean G;
    public final fh1.u0 H;

    /* renamed from: x, reason: collision with root package name */
    public final fh1.i f344155x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f344156y;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 f344157z;
    public static final fh1.s0 I = new fh1.s0(null);

    /* renamed from: J, reason: collision with root package name */
    public static final java.util.HashMap f344154J = new java.util.HashMap();
    public static final java.util.HashMap K = new java.util.HashMap();
    public static final java.util.HashMap L = new java.util.HashMap();
    public static final android.util.SparseIntArray M = new android.util.SparseIntArray();
    public static final java.util.HashMap N = new java.util.HashMap();
    public static final hq0.e Q = new fh1.r0();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(fh1.i host, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 wxaCommLib) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxaCommLib, "wxaCommLib");
        this.f344155x = host;
        this.f344156y = str;
        this.f344157z = wxaCommLib;
        java.lang.String str2 = "MicroMsg.MagicSclMBFrameBiz(" + hashCode() + ')';
        this.A = str2;
        this.C = new java.util.concurrent.ConcurrentHashMap();
        this.D = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.E = new java.util.concurrent.ConcurrentSkipListSet(fh1.w0.f344149d);
        this.G = new java.util.concurrent.atomic.AtomicBoolean(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "<init>");
        hq0.e eVar = Q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        this.f364536r = eVar;
        X0();
        this.H = new fh1.u0(this);
    }

    @Override // lc3.s
    public jc3.m F0(java.lang.String containerTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerTag, "containerTag");
        return new fh1.t0();
    }

    @Override // hq0.i0
    public java.lang.String O0() {
        return "MagicWeAppMagicBrushFrame";
    }

    @Override // hq0.i0
    public void X0() {
        java.lang.String str;
        super.X0();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229371c) {
            x5();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b(null, null, null, null, false, false, false, null, false, null, 1023, null);
        c16416x87606a7b.f229367x = this;
        c16416x87606a7b.f229356m = true;
        java.util.HashSet d17 = kz5.p1.d(new gh1.a(), new gh1.b(), new gh1.d(), new gh1.c());
        ej1.b bVar = new ej1.b();
        bVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o2.class, null);
        bVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.gc.class, null);
        bVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.p.class, null);
        bVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.v.class, null);
        bVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.j0.class, null);
        bVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.k0.class, null);
        bVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.c.class, null);
        bVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.d.class, null);
        bVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.e.class, null);
        bVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.f.class, null);
        bVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.s.class, null);
        bVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.v.class, null);
        bVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.b0.class, null);
        bVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.c0.class, null);
        bVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.h.class, null);
        bVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.i.class, null);
        bVar.a(ad1.e.class, fj1.a.f344635d);
        bVar.a(ad1.f.class, fj1.b.f344637d);
        bVar.a(ad1.g.class, null);
        bVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j4.class, null);
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.util.Map.Entry entry : bVar.entrySet()) {
            java.lang.Class cls = ((ej1.a) entry.getValue()).f334808a;
            hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1.class.isAssignableFrom(cls) ? new fj1.p(cls) : new fj1.n(cls));
        }
        d17.addAll(hashSet);
        c16416x87606a7b.a(d17);
        jc3.j0 j0Var = this.f364528g;
        if (j0Var == null || (str = ((rc3.w0) j0Var).f475620e) == null) {
            str = "";
        }
        c16416x87606a7b.f229357n = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1153x32add612.C12411x6bc6c745(str, this.f344156y, this.f344157z);
        c16416x87606a7b.f229351e.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.h6.class.getName());
        I1(c16416x87606a7b);
        mo123044x68ac462();
    }

    @Override // hq0.i0, jc3.u
    public void b1() {
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b c4683x847dbe1b = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495;
        boolean mo40975xf7b3660d = c4683x847dbe1b.mo40975xf7b3660d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.A, "onConnException foreground: " + mo40975xf7b3660d);
        super.b1();
        if (z65.c.a()) {
            pm0.v.X(fh1.v0.f344142d);
        }
        if (!mo40975xf7b3660d) {
            fh1.u0 u0Var = this.H;
            c4683x847dbe1b.mo40976xa01141ab(u0Var);
            c4683x847dbe1b.mo40973x40b15f2e(u0Var);
        } else {
            yz5.a aVar = this.F;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        }
    }

    @Override // hq0.i0, jc3.u
    /* renamed from: onDestroy */
    public void mo123043xac79a11b(int i17) {
        super.mo123043xac79a11b(i17);
        this.G.set(true);
    }

    @Override // hq0.i0, jc3.u
    public void x5() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.D;
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = this.E;
        super.x5();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.A, "onServiceReady");
        while (true) {
            try {
                if (!(!concurrentSkipListSet.isEmpty())) {
                    return;
                }
                yz5.a aVar = (yz5.a) concurrentSkipListSet.pollFirst();
                if (aVar != null) {
                    aVar.mo152xb9724478();
                }
            } finally {
                atomicBoolean.set(true);
            }
        }
    }
}
