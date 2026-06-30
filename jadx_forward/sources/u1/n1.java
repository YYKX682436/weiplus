package u1;

/* loaded from: classes14.dex */
public final class n1 extends s1.o1 implements s1.r0 {

    /* renamed from: h, reason: collision with root package name */
    public final u1.w f505172h;

    /* renamed from: i, reason: collision with root package name */
    public u1.c1 f505173i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f505174m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f505175n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f505176o;

    /* renamed from: p, reason: collision with root package name */
    public long f505177p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.l f505178q;

    /* renamed from: r, reason: collision with root package name */
    public float f505179r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Object f505180s;

    public n1(u1.w layoutNode, u1.c1 outerWrapper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutNode, "layoutNode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outerWrapper, "outerWrapper");
        this.f505172h = layoutNode;
        this.f505173i = outerWrapper;
        int i17 = p2.m.f432922c;
        this.f505177p = p2.m.f432921b;
    }

    @Override // s1.o1
    public void B(long j17, float f17, yz5.l lVar) {
        this.f505177p = j17;
        this.f505179r = f17;
        this.f505178q = lVar;
        u1.c1 c1Var = this.f505173i;
        u1.c1 c1Var2 = c1Var.f505088i;
        if (c1Var2 != null && c1Var2.f505099w) {
            s1.m1 m1Var = s1.n1.f483574a;
            if (lVar == null) {
                m1Var.c(c1Var, j17, f17);
                return;
            } else {
                m1Var.i(c1Var, j17, f17, lVar);
                return;
            }
        }
        this.f505175n = true;
        u1.w wVar = this.f505172h;
        wVar.f505235z.f505169g = false;
        u1.w1 snapshotObserver = u1.q0.a(wVar).getSnapshotObserver();
        u1.m1 m1Var2 = new u1.m1(this, j17, f17, lVar);
        snapshotObserver.getClass();
        snapshotObserver.a(wVar, snapshotObserver.f505246d, m1Var2);
    }

    public final void P() {
        u1.w wVar = this.f505172h;
        wVar.I(false);
        u1.w p17 = wVar.p();
        if (p17 == null || wVar.F != u1.e0.NotUsed) {
            return;
        }
        int ordinal = p17.f505224o.ordinal();
        u1.e0 e0Var = ordinal != 0 ? ordinal != 1 ? p17.F : u1.e0.InLayoutBlock : u1.e0.InMeasureBlock;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e0Var, "<set-?>");
        wVar.F = e0Var;
    }

    public final boolean Q(long j17) {
        u1.w layoutNode = this.f505172h;
        u1.r1 a17 = u1.q0.a(layoutNode);
        u1.w p17 = layoutNode.p();
        boolean z17 = true;
        layoutNode.H = layoutNode.H || (p17 != null && p17.H);
        if (!layoutNode.X && p2.c.b(this.f483586g, j17)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutNode, "layoutNode");
            ((p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988) a17).f91989J.d(layoutNode);
            layoutNode.J();
            return false;
        }
        layoutNode.f505235z.f505168f = false;
        o0.i r17 = layoutNode.r();
        int i17 = r17.f423385f;
        if (i17 > 0) {
            java.lang.Object[] objArr = r17.f423383d;
            int i18 = 0;
            do {
                ((u1.w) objArr[i18]).f505235z.f505165c = false;
                i18++;
            } while (i18 < i17);
        }
        this.f505174m = true;
        long j18 = this.f505173i.f483585f;
        O(j17);
        u1.c0 c0Var = u1.c0.Measuring;
        layoutNode.f505224o = c0Var;
        layoutNode.X = false;
        u1.w1 snapshotObserver = u1.q0.a(layoutNode).getSnapshotObserver();
        u1.l0 l0Var = new u1.l0(layoutNode, j17);
        snapshotObserver.getClass();
        snapshotObserver.a(layoutNode, snapshotObserver.f505244b, l0Var);
        if (layoutNode.f505224o == c0Var) {
            layoutNode.Y = true;
            layoutNode.f505224o = u1.c0.Idle;
        }
        if (p2.q.a(this.f505173i.f483585f, j18)) {
            u1.c1 c1Var = this.f505173i;
            if (c1Var.f483583d == this.f483583d && c1Var.f483584e == this.f483584e) {
                z17 = false;
            }
        }
        u1.c1 c1Var2 = this.f505173i;
        N(p2.r.a(c1Var2.f483583d, c1Var2.f483584e));
        return z17;
    }

    @Override // s1.o1, s1.t
    public java.lang.Object g() {
        return this.f505180s;
    }

    @Override // s1.t
    public int i(int i17) {
        P();
        return this.f505173i.i(i17);
    }

    @Override // s1.t
    public int j(int i17) {
        P();
        return this.f505173i.j(i17);
    }

    @Override // s1.t
    public int k(int i17) {
        P();
        return this.f505173i.k(i17);
    }

    @Override // s1.t
    public int l(int i17) {
        P();
        return this.f505173i.l(i17);
    }

    @Override // s1.r0
    public s1.o1 m(long j17) {
        u1.e0 e0Var;
        u1.w wVar = this.f505172h;
        u1.w p17 = wVar.p();
        u1.e0 e0Var2 = u1.e0.NotUsed;
        if (p17 != null) {
            if (!(wVar.E == e0Var2 || wVar.H)) {
                throw new java.lang.IllegalStateException(("measure() may not be called multiple times on the same Measurable. Current state " + wVar.E + ". Parent state " + p17.f505224o + '.').toString());
            }
            int ordinal = p17.f505224o.ordinal();
            if (ordinal == 0) {
                e0Var = u1.e0.InMeasureBlock;
            } else {
                if (ordinal != 1) {
                    throw new java.lang.IllegalStateException("Measurable could be only measured from the parent's measure or layout block.Parents state is " + p17.f505224o);
                }
                e0Var = u1.e0.InLayoutBlock;
            }
            wVar.getClass();
            wVar.E = e0Var;
        } else {
            wVar.getClass();
            wVar.E = e0Var2;
        }
        Q(j17);
        return this;
    }

    @Override // s1.y0
    public int s(s1.a alignmentLine) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alignmentLine, "alignmentLine");
        u1.w wVar = this.f505172h;
        u1.w p17 = wVar.p();
        if ((p17 != null ? p17.f505224o : null) == u1.c0.Measuring) {
            wVar.f505235z.f505165c = true;
        } else {
            u1.w p18 = wVar.p();
            if ((p18 != null ? p18.f505224o : null) == u1.c0.LayingOut) {
                wVar.f505235z.f505166d = true;
            }
        }
        this.f505176o = true;
        int s17 = this.f505173i.s(alignmentLine);
        this.f505176o = false;
        return s17;
    }

    @Override // s1.o1
    public int x() {
        return this.f505173i.x();
    }

    @Override // s1.o1
    public int y() {
        return this.f505173i.y();
    }
}
