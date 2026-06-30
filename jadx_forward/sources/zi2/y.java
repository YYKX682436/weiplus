package zi2;

/* loaded from: classes3.dex */
public final class y implements lj2.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f554696a;

    public y(gk2.e buContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        this.f554696a = buContext;
    }

    @Override // lj2.t0
    public java.lang.String A() {
        return zl2.r4.f555483a.m0(this.f554696a).m76175x6d346f39();
    }

    @Override // lj2.t0
    public boolean B() {
        return zl2.r4.f555483a.M1(this.f554696a);
    }

    @Override // lj2.t0
    public java.lang.String C(java.lang.String str) {
        ((mm2.c1) this.f554696a.a(mm2.c1.class)).a7(str);
        return str == null ? "" : str;
    }

    @Override // lj2.t0
    public void D(android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        ((mm2.c1) this.f554696a.a(mm2.c1.class)).I4 = bitmap;
    }

    @Override // lj2.t0
    public int E() {
        return ((om2.g) this.f554696a.a(om2.g.class)).f427850x;
    }

    @Override // lj2.t0
    public boolean F() {
        return ((mm2.c1) this.f554696a.a(mm2.c1.class)).O4;
    }

    @Override // lj2.t0
    public java.lang.String G(int i17) {
        return ((mm2.y2) this.f554696a.a(mm2.y2.class)).R6(i17);
    }

    @Override // lj2.t0
    public boolean H() {
        if (((mm2.c1) this.f554696a.a(mm2.c1.class)).T) {
            return true;
        }
        return ((mm2.n0) this.f554696a.a(mm2.n0.class)).f410806r;
    }

    @Override // lj2.t0
    public int I() {
        return ((mm2.e1) this.f554696a.a(mm2.e1.class)).R6();
    }

    @Override // lj2.t0
    public boolean J() {
        if (zl2.r4.f555483a.w1()) {
            return ((mm2.c1) this.f554696a.a(mm2.c1.class)).S4;
        }
        return true;
    }

    @Override // lj2.t0
    public dk2.u4 K() {
        return ((mm2.o4) this.f554696a.a(mm2.o4.class)).Z;
    }

    @Override // lj2.t0
    public void L(dk2.zf msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        ((mm2.x4) this.f554696a.a(mm2.x4.class)).f411061f.add(msg);
    }

    @Override // lj2.t0
    public boolean M() {
        return ((mm2.c1) this.f554696a.a(mm2.c1.class)).f410431v3;
    }

    @Override // lj2.t0
    public void N(boolean z17) {
        ((mm2.c1) this.f554696a.a(mm2.c1.class)).n9(z17);
    }

    @Override // lj2.t0
    public int O() {
        return ((mm2.c1) this.f554696a.a(mm2.c1.class)).f410334f2;
    }

    @Override // lj2.t0
    public kn0.i P() {
        return ((mm2.e1) this.f554696a.a(mm2.e1.class)).f410523t;
    }

    @Override // lj2.t0
    public boolean Q() {
        if (((mm2.c1) this.f554696a.a(mm2.c1.class)).I) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiveRoomBuContextAbility", "enableAudienceViewPkBoard false, do not open panel for audience or other users' contributor");
        return false;
    }

    @Override // lj2.t0
    public int a() {
        xh2.c cVar = (xh2.c) ((mm2.o4) this.f554696a.a(mm2.o4.class)).A.mo3195x754a37bb();
        if (cVar != null) {
            return cVar.f536066c;
        }
        return 0;
    }

    @Override // lj2.t0
    public void b(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        ya2.b2 b17 = ya2.h.f542017a.b(((mm2.c1) this.f554696a.a(mm2.c1.class)).f410385o);
        if (b17 != null) {
            zl2.r4.f555483a.Y(b17.y0(), new zi2.x(callback));
        }
    }

    @Override // lj2.t0
    public boolean c() {
        return ((mm2.c1) this.f554696a.a(mm2.c1.class)).H;
    }

    @Override // lj2.t0
    public boolean d(int i17) {
        return ((mm2.y2) this.f554696a.a(mm2.y2.class)).b7(i17);
    }

    @Override // lj2.t0
    public long e() {
        if (((mm2.e1) this.f554696a.a(mm2.e1.class)).f410521r != null) {
            return r0.m75939xb282bd08(1);
        }
        return -1L;
    }

    @Override // lj2.t0
    public android.graphics.Bitmap f() {
        return ((mm2.c1) this.f554696a.a(mm2.c1.class)).I4;
    }

    @Override // lj2.t0
    public java.util.List g() {
        java.util.List list = ((mm2.o4) this.f554696a.a(mm2.o4.class)).f410857s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-anchorPkMicUserList>(...)");
        return list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if (r4 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0062, code lost:
    
        if (r4 == null) goto L20;
     */
    @Override // lj2.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int h(km2.q r15) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zi2.y.h(km2.q):int");
    }

    @Override // lj2.t0
    public boolean i() {
        return ((mm2.c1) this.f554696a.a(mm2.c1.class)).Q4;
    }

    @Override // lj2.t0
    public boolean j(java.lang.String sdkUserId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sdkUserId, "sdkUserId");
        r45.yx1 Q6 = ((om2.g) this.f554696a.a(om2.g.class)).Q6();
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(Q6 != null ? Q6.f473002r : null, sdkUserId);
    }

    @Override // lj2.t0
    public int k() {
        return ((mm2.e1) this.f554696a.a(mm2.e1.class)).U6();
    }

    @Override // lj2.t0
    public java.util.List l() {
        java.util.List list = ((mm2.o4) this.f554696a.a(mm2.o4.class)).f410860v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
        return list;
    }

    @Override // lj2.t0
    public fj2.k m(java.lang.String sdkUserId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sdkUserId, "sdkUserId");
        return ((mm2.y2) this.f554696a.a(mm2.y2.class)).U6(sdkUserId);
    }

    @Override // lj2.t0
    public boolean n() {
        return ((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.o4) this.f554696a.a(mm2.o4.class)).H).mo144003x754a37bb()).booleanValue();
    }

    @Override // lj2.t0
    public boolean o() {
        return ((mm2.c1) this.f554696a.a(mm2.c1.class)).L;
    }

    @Override // lj2.t0
    public java.lang.String p() {
        java.lang.String str = ((mm2.e1) this.f554696a.a(mm2.e1.class)).f410520q.f461834n;
        return str == null ? "" : str;
    }

    @Override // lj2.t0
    public long q() {
        r45.nw1 m76794xd0557130;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) this.f554696a.a(mm2.c1.class)).f410379n;
        if (c19792x256d2725 == null || (m76794xd0557130 = c19792x256d2725.m76794xd0557130()) == null) {
            return 0L;
        }
        return m76794xd0557130.m75942xfb822ef2(0);
    }

    @Override // lj2.t0
    public java.lang.String r() {
        return ((mm2.c1) this.f554696a.a(mm2.c1.class)).f410385o;
    }

    @Override // lj2.t0
    public java.lang.String s() {
        java.lang.String m86 = ((mm2.c1) this.f554696a.a(mm2.c1.class)).m8();
        return m86 == null ? "" : m86;
    }

    @Override // lj2.t0
    public java.util.List t() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        gk2.e eVar = this.f554696a;
        arrayList.add(((mm2.o4) eVar.a(mm2.o4.class)).a7());
        arrayList.addAll(((mm2.o4) eVar.a(mm2.o4.class)).f410860v);
        arrayList.addAll(((mm2.o4) eVar.a(mm2.o4.class)).f410857s);
        return arrayList;
    }

    @Override // lj2.t0
    public boolean u() {
        return zl2.r4.f555483a.a2(this.f554696a);
    }

    @Override // lj2.t0
    public boolean v() {
        return ((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.e) this.f554696a.a(om2.e.class)).f427827m).mo144003x754a37bb()).booleanValue();
    }

    @Override // lj2.t0
    public boolean w() {
        gk2.e eVar = this.f554696a;
        return ((mm2.c1) eVar.a(mm2.c1.class)).G || ((mm2.e1) eVar.a(mm2.e1.class)).g7();
    }

    @Override // lj2.t0
    public boolean x() {
        return ((mm2.c1) this.f554696a.a(mm2.c1.class)).K;
    }

    @Override // lj2.t0
    public int y() {
        r45.kf5 kf5Var;
        r45.il4 il4Var = ((mm2.o4) this.f554696a.a(mm2.o4.class)).U;
        if (il4Var == null || (kf5Var = il4Var.f458665g) == null) {
            return 0;
        }
        return kf5Var.f460190e;
    }

    @Override // lj2.t0
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 z() {
        return ((mm2.c1) this.f554696a.a(mm2.c1.class)).f410379n;
    }
}
