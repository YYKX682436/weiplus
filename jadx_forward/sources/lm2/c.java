package lm2;

/* loaded from: classes3.dex */
public abstract class c implements so2.j5, lm2.i0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f400904d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ch1 f400905e;

    /* renamed from: f, reason: collision with root package name */
    public int f400906f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f400907g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f400908h;

    public c(boolean z17, r45.ch1 source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        this.f400904d = z17;
        this.f400905e = source;
    }

    public java.lang.String a() {
        r45.qm1 qm1Var = (r45.qm1) this.f400905e.m75936x14adae67(8);
        java.lang.String m75945x2fec8307 = qm1Var != null ? qm1Var.m75945x2fec8307(1) : null;
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    public java.lang.String b() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        r45.xn1 xn1Var = (r45.xn1) this.f400905e.m75936x14adae67(13);
        java.lang.String m76184x8010e5e4 = (xn1Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa.m76184x8010e5e4();
        return m76184x8010e5e4 == null ? "" : m76184x8010e5e4;
    }

    public java.lang.String c() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        r45.xn1 xn1Var = (r45.xn1) this.f400905e.m75936x14adae67(13);
        java.lang.String m76197x6c03c64c = (xn1Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa.m76197x6c03c64c();
        return m76197x6c03c64c == null ? "" : m76197x6c03c64c;
    }

    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        if (obj instanceof lm2.c) {
            lm2.c cVar = (lm2.c) obj;
            if (cVar.f400904d == this.f400904d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar.f400905e.m75945x2fec8307(2), this.f400905e.m75945x2fec8307(2)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar.f400905e.m75945x2fec8307(14), this.f400905e.m75945x2fec8307(14))) {
                return 0;
            }
        }
        return -1;
    }

    public long e() {
        return this.f400905e.m75942xfb822ef2(12);
    }

    public java.lang.String f() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        r45.xn1 xn1Var = (r45.xn1) this.f400905e.m75936x14adae67(0);
        java.lang.String m76197x6c03c64c = (xn1Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa.m76197x6c03c64c();
        return m76197x6c03c64c == null ? "" : m76197x6c03c64c;
    }

    public java.lang.String g() {
        return "msgType:" + this.f400905e.m75939xb282bd08(1) + ", seq:" + this.f400905e.m75942xfb822ef2(12) + ", likeCount:" + this.f400906f + ", selfLike:" + this.f400907g + ", fromUsername:" + c() + ", toUsername:" + f();
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f400905e.m75942xfb822ef2(12);
    }

    @Override // in5.c
    public int h() {
        return this.f400905e.m75939xb282bd08(1);
    }
}
