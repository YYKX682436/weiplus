package nr2;

/* loaded from: classes2.dex */
public final class m implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.do2 f420801d;

    public m(r45.do2 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f420801d = info;
    }

    public final int a() {
        r45.n11 n11Var;
        boolean p17 = p();
        r45.do2 do2Var = this.f420801d;
        if (p17) {
            r45.uz0 uz0Var = (r45.uz0) do2Var.m75936x14adae67(0);
            if (uz0Var != null) {
                return uz0Var.m75939xb282bd08(5);
            }
            return 0;
        }
        if (!q() || (n11Var = (r45.n11) do2Var.m75936x14adae67(1)) == null) {
            return 0;
        }
        return n11Var.m75939xb282bd08(5);
    }

    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa b() {
        r45.n11 n11Var;
        boolean p17 = p();
        r45.do2 do2Var = this.f420801d;
        if (p17) {
            r45.uz0 uz0Var = (r45.uz0) do2Var.m75936x14adae67(0);
            if (uz0Var != null) {
                return (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) uz0Var.m75936x14adae67(11);
            }
            return null;
        }
        if (!q() || (n11Var = (r45.n11) do2Var.m75936x14adae67(1)) == null) {
            return null;
        }
        return (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) n11Var.m75936x14adae67(11);
    }

    public final java.lang.String c() {
        r45.n11 n11Var;
        java.lang.String m75945x2fec8307;
        boolean p17 = p();
        r45.do2 do2Var = this.f420801d;
        if (p17) {
            r45.uz0 uz0Var = (r45.uz0) do2Var.m75936x14adae67(0);
            if (uz0Var == null || (m75945x2fec8307 = uz0Var.m75945x2fec8307(3)) == null) {
                return "";
            }
        } else if (!q() || (n11Var = (r45.n11) do2Var.m75936x14adae67(1)) == null || (m75945x2fec8307 = n11Var.m75945x2fec8307(3)) == null) {
            return "";
        }
        return m75945x2fec8307;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return -1;
    }

    public final java.lang.String e() {
        r45.n11 n11Var;
        java.lang.String m75945x2fec8307;
        boolean p17 = p();
        r45.do2 do2Var = this.f420801d;
        if (p17) {
            r45.uz0 uz0Var = (r45.uz0) do2Var.m75936x14adae67(0);
            if (uz0Var == null || (m75945x2fec8307 = uz0Var.m75945x2fec8307(2)) == null) {
                return "";
            }
        } else if (!q() || (n11Var = (r45.n11) do2Var.m75936x14adae67(1)) == null || (m75945x2fec8307 = n11Var.m75945x2fec8307(2)) == null) {
            return "";
        }
        return m75945x2fec8307;
    }

    public final int f() {
        r45.n11 n11Var;
        boolean p17 = p();
        r45.do2 do2Var = this.f420801d;
        if (p17) {
            r45.uz0 uz0Var = (r45.uz0) do2Var.m75936x14adae67(0);
            if (uz0Var != null) {
                return uz0Var.m75939xb282bd08(4);
            }
            return 0;
        }
        if (!q() || (n11Var = (r45.n11) do2Var.m75936x14adae67(1)) == null) {
            return 0;
        }
        return n11Var.m75939xb282bd08(4);
    }

    public final boolean g() {
        boolean p17 = p();
        r45.do2 do2Var = this.f420801d;
        if (p17) {
            cu2.g0 g0Var = cu2.g0.f303937a;
            r45.uz0 uz0Var = (r45.uz0) do2Var.m75936x14adae67(0);
            if (g0Var.b(uz0Var != null ? uz0Var.m75942xfb822ef2(0) : 0L) != null) {
                return true;
            }
        } else if (q()) {
            cu2.g0 g0Var2 = cu2.g0.f303937a;
            r45.n11 n11Var = (r45.n11) do2Var.m75936x14adae67(1);
            if (g0Var2.b(n11Var != null ? n11Var.m75942xfb822ef2(0) : 0L) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return nr2.m.class.hashCode();
    }

    public final int i() {
        r45.n11 n11Var;
        boolean p17 = p();
        r45.do2 do2Var = this.f420801d;
        if (p17) {
            r45.uz0 uz0Var = (r45.uz0) do2Var.m75936x14adae67(0);
            if (uz0Var != null) {
                return uz0Var.m75939xb282bd08(10);
            }
            return 0;
        }
        if (!q() || (n11Var = (r45.n11) do2Var.m75936x14adae67(1)) == null) {
            return 0;
        }
        return n11Var.m75939xb282bd08(10);
    }

    public final long j() {
        r45.n11 n11Var;
        boolean p17 = p();
        r45.do2 do2Var = this.f420801d;
        if (p17) {
            r45.uz0 uz0Var = (r45.uz0) do2Var.m75936x14adae67(0);
            if (uz0Var != null) {
                return uz0Var.m75942xfb822ef2(8);
            }
            return 0L;
        }
        if (!q() || (n11Var = (r45.n11) do2Var.m75936x14adae67(1)) == null) {
            return 0L;
        }
        return n11Var.m75942xfb822ef2(8);
    }

    public final java.lang.String k() {
        r45.n11 n11Var;
        java.lang.String m75945x2fec8307;
        boolean p17 = p();
        r45.do2 do2Var = this.f420801d;
        if (p17) {
            r45.uz0 uz0Var = (r45.uz0) do2Var.m75936x14adae67(0);
            if (uz0Var == null || (m75945x2fec8307 = uz0Var.m75945x2fec8307(1)) == null) {
                return "";
            }
        } else if (!q() || (n11Var = (r45.n11) do2Var.m75936x14adae67(1)) == null || (m75945x2fec8307 = n11Var.m75945x2fec8307(1)) == null) {
            return "";
        }
        return m75945x2fec8307;
    }

    public final long l() {
        r45.n11 n11Var;
        boolean p17 = p();
        r45.do2 do2Var = this.f420801d;
        if (p17) {
            r45.uz0 uz0Var = (r45.uz0) do2Var.m75936x14adae67(0);
            if (uz0Var != null) {
                return uz0Var.m75942xfb822ef2(0);
            }
            return 0L;
        }
        if (!q() || (n11Var = (r45.n11) do2Var.m75936x14adae67(1)) == null) {
            return 0L;
        }
        return n11Var.m75942xfb822ef2(0);
    }

    public final int n() {
        r45.do2 do2Var = this.f420801d;
        if (do2Var.m75939xb282bd08(2) != 0) {
            return do2Var.m75939xb282bd08(2);
        }
        if (p()) {
            return 1;
        }
        return q() ? 2 : 0;
    }

    public final java.lang.String o() {
        r45.n11 n11Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        java.lang.String m76197x6c03c64c;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        boolean p17 = p();
        r45.do2 do2Var = this.f420801d;
        if (p17) {
            r45.uz0 uz0Var = (r45.uz0) do2Var.m75936x14adae67(0);
            if (uz0Var == null || (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) uz0Var.m75936x14adae67(11)) == null || (m76197x6c03c64c = c19782x23db1cfa2.m76197x6c03c64c()) == null) {
                return "";
            }
        } else if (!q() || (n11Var = (r45.n11) do2Var.m75936x14adae67(1)) == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) n11Var.m75936x14adae67(11)) == null || (m76197x6c03c64c = c19782x23db1cfa.m76197x6c03c64c()) == null) {
            return "";
        }
        return m76197x6c03c64c;
    }

    public final boolean p() {
        r45.uz0 uz0Var = (r45.uz0) this.f420801d.m75936x14adae67(0);
        return (uz0Var != null ? uz0Var.m75942xfb822ef2(0) : 0L) != 0;
    }

    public final boolean q() {
        r45.n11 n11Var = (r45.n11) this.f420801d.m75936x14adae67(1);
        return (n11Var != null ? n11Var.m75942xfb822ef2(0) : 0L) != 0;
    }
}
