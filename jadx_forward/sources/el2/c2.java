package el2;

/* loaded from: classes3.dex */
public final class c2 extends xt2.m6 implements jf2.o, jf2.l, jf2.m {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f335294d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f335295e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f335296f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f335297g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f335298h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f335299i;

    public c2(android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f335294d = root;
        this.f335295e = basePlugin;
        this.f335296f = "FinderLivePromoteFixedEntranceWidget";
        this.f335297g = jz5.h.b(new el2.r1(this));
        this.f335298h = jz5.h.b(new el2.p1(this));
        this.f335299i = jz5.h.b(new el2.o1(this));
    }

    public static final void k(el2.c2 c2Var, yz5.a aVar) {
        el2.n1 n1Var;
        c2Var.getClass();
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.content.Context m17 = c2Var.m();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m17, "<get-context>(...)");
        if (!(r4Var.Y1(m17) && !r4Var.w1())) {
            aVar.mo152xb9724478();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
        if (c14197x319b1b9e == null || (n1Var = (el2.n1) c14197x319b1b9e.m56798x25fe639c(el2.n1.class)) == null) {
            return;
        }
        n1Var.W6(new el2.b2(aVar));
    }

    @Override // jf2.l
    public void F(int i17) {
        o();
    }

    @Override // jf2.o
    public void b() {
        android.view.ViewGroup viewGroup = this.f335294d;
        if (viewGroup.getVisibility() != 0) {
            o();
        }
        viewGroup.setVisibility(0);
    }

    @Override // jf2.l
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80145xebd70552), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.mis));
    }

    @Override // jf2.m
    public void e(int i17) {
        this.f335294d.performClick();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f335294d.findViewById(com.p314xaae8f345.mm.R.id.lc8);
    }

    @Override // jf2.o
    public void g() {
        this.f335294d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f335294d;
    }

    @Override // jf2.o
    public boolean i() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14226x69ca5d17 c14226x69ca5d17;
        el2.n1 n1Var = (el2.n1) this.f335295e.U0(el2.n1.class);
        return ((n1Var == null || (c14226x69ca5d17 = n1Var.f335408q) == null) ? null : (r45.y42) c14226x69ca5d17.mo3195x754a37bb()) != null;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.view.View findViewById = this.f335294d.findViewById(com.p314xaae8f345.mm.R.id.lc9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return (android.widget.ImageView) findViewById;
    }

    public final gk2.e l() {
        return (gk2.e) ((jz5.n) this.f335299i).mo141623x754a37bb();
    }

    public final android.content.Context m() {
        return (android.content.Context) ((jz5.n) this.f335298h).mo141623x754a37bb();
    }

    public final void n(r45.y42 y42Var, java.lang.Long l17, yz5.l lVar) {
        if (zl2.q4.f555466a.E()) {
            db5.t7.m123883x26a183b(m(), "getJumpInfo!!", 0).show();
        }
        mm2.e1 e1Var = (mm2.e1) l().a(mm2.e1.class);
        long j17 = e1Var.f410516m;
        long m75942xfb822ef2 = e1Var.f410521r.m75942xfb822ef2(0);
        int m75939xb282bd08 = y42Var.m75939xb282bd08(1);
        android.content.Context m17 = m();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m17, "<get-context>(...)");
        java.lang.String e17 = xy2.c.e(m17);
        byte[] bArr = ((mm2.e1) l().a(mm2.e1.class)).f410518o;
        java.lang.String m75945x2fec8307 = y42Var.m75945x2fec8307(4);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        java.lang.String str = m75945x2fec8307;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = y42Var.m75934xbce7f2f(2);
        new ke2.v(j17, m75942xfb822ef2, m75939xb282bd08, e17, bArr, str, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(m75934xbce7f2f != null ? m75934xbce7f2f.g() : null), zl2.r4.f555483a.f1(l(), l17), ((mm2.e1) l().a(mm2.e1.class)).f410526w, null, 512, null).l().K(new el2.q1(this, y42Var, lVar));
    }

    public final void o() {
        df2.nt ntVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14226x69ca5d17 c14226x69ca5d17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f335295e;
        el2.n1 n1Var = (el2.n1) lVar.U0(el2.n1.class);
        r45.y42 y42Var = (n1Var == null || (c14226x69ca5d17 = n1Var.f335408q) == null) ? null : (r45.y42) c14226x69ca5d17.mo3195x754a37bb();
        if (y42Var == null || (ntVar = (df2.nt) lVar.U0(df2.nt.class)) == null) {
            return;
        }
        r45.yp5 yp5Var = new r45.yp5();
        yp5Var.set(0, java.lang.Long.valueOf(y42Var.m75942xfb822ef2(0)));
        yp5Var.set(2, 1);
        yp5Var.set(1, 3);
        yp5Var.set(3, y42Var.m75934xbce7f2f(5));
        ntVar.a7(yp5Var);
    }

    @Override // jf2.o
    /* renamed from: type */
    public int mo57989x368f3a() {
        return 19;
    }
}
