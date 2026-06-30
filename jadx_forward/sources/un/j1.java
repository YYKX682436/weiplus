package un;

/* loaded from: classes11.dex */
public final class j1 extends un.h {

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f510826n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f510827o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f510826n = jz5.h.b(new un.i1(this));
        this.f510827o = jz5.h.b(new un.h1(this));
    }

    @Override // un.h
    public void O6(boolean z17) {
        if (this.f510806d != null) {
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(c7())) {
                super.O6(z17);
                return;
            }
            zy2.g6 g6Var = (zy2.g6) i95.n0.c(zy2.g6.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(this.f510806d);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.v1) ((zy2.g6) i95.n0.c(zy2.g6.class))).Ai(c7());
            g6Var.getClass();
        }
    }

    @Override // un.h
    public void Q6(java.lang.Boolean bool, boolean z17) {
        if (((java.lang.Boolean) ((jz5.n) this.f510827o).mo141623x754a37bb()).booleanValue()) {
            super.Q6(bool, z17);
        }
    }

    @Override // un.h
    public boolean S6() {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f510806d;
        if (z3Var != null) {
            return z3Var.v2();
        }
        return false;
    }

    @Override // un.h
    public boolean T6() {
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(c7())) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.v1) ((zy2.g6) i95.n0.c(zy2.g6.class))).Ai(c7());
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f510806d;
        return Di.K(z3Var != null ? z3Var.d1() : null);
    }

    @Override // un.h
    public java.lang.String U6() {
        return c7();
    }

    @Override // un.h
    public java.lang.String X6() {
        return "MicroMsg.SingleRoomOperationUIC";
    }

    @Override // un.h
    public void Y6(boolean z17) {
        if (((java.lang.Boolean) ((jz5.n) this.f510827o).mo141623x754a37bb()).booleanValue()) {
            super.Y6(z17);
        } else {
            super.Y6(true);
        }
    }

    public final java.lang.String c7() {
        return (java.lang.String) ((jz5.n) this.f510826n).mo141623x754a37bb();
    }
}
