package dk2;

/* loaded from: classes3.dex */
public class mf implements dk2.zf, dk2.cg, dk2.ag, dk2.bg {

    /* renamed from: j, reason: collision with root package name */
    public static final dk2.lf f315305j = new dk2.lf(null);

    /* renamed from: a, reason: collision with root package name */
    public final r45.t12 f315306a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f315307b;

    /* renamed from: c, reason: collision with root package name */
    public int f315308c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f315309d;

    /* renamed from: e, reason: collision with root package name */
    public int f315310e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f315311f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f315312g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f315313h;

    /* renamed from: i, reason: collision with root package name */
    public r45.oj1 f315314i;

    public mf(r45.t12 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f315306a = msg;
        this.f315307b = "";
        this.f315313h = "";
    }

    @Override // dk2.eg
    public boolean A() {
        return this.f315309d;
    }

    @Override // dk2.cg
    public void B(boolean z17) {
        this.f315312g = z17;
    }

    @Override // dk2.zf
    public r45.xn1 C() {
        return (r45.xn1) this.f315306a.m75936x14adae67(11);
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        return null;
    }

    @Override // dk2.zf
    public java.lang.String a() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        r45.xn1 xn1Var = (r45.xn1) this.f315306a.m75936x14adae67(8);
        if (xn1Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) {
            return null;
        }
        return c19782x23db1cfa.m76197x6c03c64c();
    }

    public final boolean b() {
        return this.f315308c == 106;
    }

    @Override // dk2.eg
    public void c(boolean z17) {
        this.f315309d = z17;
    }

    @Override // dk2.cg
    public void d(boolean z17) {
        this.f315311f = z17;
    }

    @Override // dk2.zf
    public java.lang.String f() {
        java.lang.String m75945x2fec8307 = this.f315306a.m75945x2fec8307(9);
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    @Override // dk2.cg
    public boolean g() {
        return this.f315312g;
    }

    @Override // dk2.zf
    /* renamed from: getType */
    public int mo124533xfb85f7b0() {
        return this.f315306a.m75939xb282bd08(3);
    }

    @Override // dk2.zf
    public int h() {
        return this.f315308c;
    }

    @Override // dk2.zf
    public int i() {
        return this.f315306a.m75939xb282bd08(17);
    }

    @Override // dk2.zf
    public java.lang.String j() {
        return this.f315306a.m75945x2fec8307(2);
    }

    @Override // dk2.zf
    public java.lang.String k() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        r45.xn1 xn1Var = (r45.xn1) this.f315306a.m75936x14adae67(8);
        if (xn1Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) {
            return null;
        }
        return c19782x23db1cfa.m76184x8010e5e4();
    }

    @Override // dk2.zf
    public boolean l() {
        return this.f315306a.m75939xb282bd08(12) == 1;
    }

    @Override // dk2.zf
    public long m() {
        return this.f315306a.m75942xfb822ef2(5);
    }

    @Override // dk2.zf
    public boolean n() {
        return this.f315306a.m75933x41a8a7f2(15);
    }

    @Override // dk2.cg
    public boolean o() {
        return this.f315311f;
    }

    @Override // dk2.zf
    public int p() {
        return this.f315306a.m75939xb282bd08(13);
    }

    public final void q(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa, int i17) {
        r45.t12 t12Var = this.f315306a;
        if (((r45.xn1) t12Var.m75936x14adae67(8)) == null) {
            t12Var.set(8, new r45.xn1());
        }
        r45.xn1 xn1Var = (r45.xn1) t12Var.m75936x14adae67(8);
        if (xn1Var != null) {
            if (c19782x23db1cfa != null) {
                xn1Var.set(0, c19782x23db1cfa);
            }
            xn1Var.set(7, java.lang.Integer.valueOf(i17));
        }
        if (c19782x23db1cfa != null) {
            t12Var.set(0, c19782x23db1cfa.m76184x8010e5e4());
        }
    }

    @Override // dk2.zf
    public r45.xn1 r() {
        return (r45.xn1) this.f315306a.m75936x14adae67(8);
    }

    @Override // dk2.cg
    public int s() {
        return this.f315310e;
    }

    @Override // dk2.zf
    public java.lang.String u() {
        return "";
    }

    @Override // dk2.zf
    public java.lang.String v() {
        java.lang.String m75945x2fec8307 = this.f315306a.m75945x2fec8307(6);
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    @Override // dk2.cg
    public void w(int i17) {
        this.f315310e = i17;
    }

    @Override // dk2.zf
    public java.lang.String x() {
        return this.f315307b;
    }

    @Override // dk2.zf
    public java.lang.String y() {
        return "";
    }

    @Override // dk2.zf
    public int z() {
        return this.f315306a.m75939xb282bd08(16);
    }
}
