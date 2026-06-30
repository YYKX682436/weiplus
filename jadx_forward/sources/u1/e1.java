package u1;

/* loaded from: classes14.dex */
public final class e1 extends u1.c1 {

    /* renamed from: J, reason: collision with root package name */
    public static final e1.n0 f505118J;
    public u1.c1 F;
    public s1.i0 G;
    public boolean H;
    public n0.v2 I;

    static {
        e1.g gVar = new e1.g();
        int i17 = e1.y.f327854l;
        gVar.e(e1.y.f327851i);
        gVar.k(1.0f);
        gVar.l(1);
        f505118J = gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(u1.c1 wrapped, s1.i0 modifier) {
        super(wrapped.f505087h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wrapped, "wrapped");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modifier, "modifier");
        this.F = wrapped;
        this.G = modifier;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1.f505099w == true) goto L8;
     */
    @Override // u1.c1, s1.o1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void B(long r1, float r3, yz5.l r4) {
        /*
            r0 = this;
            super.B(r1, r3, r4)
            u1.c1 r1 = r0.f505088i
            if (r1 == 0) goto Ld
            boolean r1 = r1.f505099w
            r2 = 1
            if (r1 != r2) goto Ld
            goto Le
        Ld:
            r2 = 0
        Le:
            if (r2 == 0) goto L11
            return
        L11:
            u1.p0[] r1 = r0.f505101y
            r2 = 4
            r1 = r1[r2]
        L16:
            if (r1 == 0) goto L25
            r2 = r1
            u1.a2 r2 = (u1.a2) r2
            z0.t r2 = r2.f505188e
            s1.i1 r2 = (s1.i1) r2
            r2.i(r0)
            u1.p0 r1 = r1.f505189f
            goto L16
        L25:
            long r1 = r0.f483585f
            r3 = 32
            long r1 = r1 >> r3
            int r1 = (int) r1
            s1.x0 r2 = r0.f0()
            p2.s r2 = r2.mo7007x6fcfed3f()
            int r3 = s1.n1.f483576c
            p2.s r4 = s1.n1.f483575b
            s1.n1.f483576c = r1
            s1.n1.f483575b = r2
            s1.u0 r1 = r0.e0()
            r1.e()
            s1.n1.f483576c = r3
            s1.n1.f483575b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.e1.B(long, float, yz5.l):void");
    }

    public final s1.i0 G0() {
        n0.v2 v2Var = this.I;
        if (v2Var == null) {
            v2Var = n0.s4.c(this.G, null, 2, null);
        }
        this.I = v2Var;
        return (s1.i0) v2Var.mo128745x754a37bb();
    }

    public void H0() {
        u1.o1 o1Var = this.B;
        if (o1Var != null) {
            o1Var.mo7146x92d0313b();
        }
        this.F.f505088i = this;
    }

    @Override // u1.c1
    public int S(s1.a alignmentLine) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alignmentLine, "alignmentLine");
        if (e0().c().containsKey(alignmentLine)) {
            java.lang.Integer num = (java.lang.Integer) e0().c().get(alignmentLine);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int s17 = this.F.s(alignmentLine);
        if (s17 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        this.f505099w = true;
        B(this.f505097u, this.f505098v, this.f505090n);
        this.f505099w = false;
        return s17 + (alignmentLine instanceof s1.s ? p2.m.b(this.F.f505097u) : (int) (this.F.f505097u >> 32));
    }

    @Override // u1.c1
    public s1.x0 f0() {
        return this.F.f0();
    }

    @Override // s1.t
    public int i(int i17) {
        return G0().Q(f0(), this.F, i17);
    }

    @Override // s1.t
    public int j(int i17) {
        return G0().S(f0(), this.F, i17);
    }

    @Override // u1.c1
    public u1.c1 j0() {
        return this.F;
    }

    @Override // s1.t
    public int k(int i17) {
        return G0().O(f0(), this.F, i17);
    }

    @Override // s1.t
    public int l(int i17) {
        return G0().x(f0(), this.F, i17);
    }

    @Override // s1.r0
    public s1.o1 m(long j17) {
        O(j17);
        A0(this.G.g(f0(), this.F, j17));
        u1.o1 o1Var = this.B;
        if (o1Var != null) {
            o1Var.d(this.f483585f);
        }
        w0();
        return this;
    }

    @Override // u1.c1
    public void x0() {
        super.x0();
        n0.v2 v2Var = this.I;
        if (v2Var == null) {
            return;
        }
        v2Var.mo148714x53d8522f(this.G);
    }

    @Override // u1.c1
    public void y0(e1.u canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        this.F.a0(canvas);
        if (u1.q0.a(this.f505087h).getShowLayoutBounds()) {
            b0(canvas, f505118J);
        }
    }
}
