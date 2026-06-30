package gx0;

/* loaded from: classes5.dex */
public final class u0 extends uw0.t0 {
    public final jz5.g G;
    public final jz5.g H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f358544J;
    public final jz5.g K;
    public final jz5.g L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.G = jz5.h.b(new gx0.m0(this));
        this.H = jz5.h.b(new gx0.s0(this));
        this.I = jz5.h.b(new gx0.r0(this));
        this.f358544J = jz5.h.b(new gx0.n0(this));
        this.K = jz5.h.b(new gx0.o0(this));
        this.L = jz5.h.b(new gx0.j0(this));
    }

    @Override // uw0.t0
    public java.lang.Object A7(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object s76 = Z7().s7(interfaceC29045xdcb5ca57);
        return s76 == pz5.a.f440719d ? s76 : jz5.f0.f384359a;
    }

    @Override // uw0.t0
    public void B7(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 segment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segment, "segment");
        gx0.w.V6((gx0.f4) ((jz5.n) this.L).mo141623x754a37bb(), null, segment, new gx0.i0(this), 1, null);
    }

    @Override // uw0.t0
    public void C7(java.lang.String snapshotDesc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotDesc, "snapshotDesc");
        a8().r7(snapshotDesc, (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) Z7().A.mo3195x754a37bb());
    }

    @Override // uw0.t0
    public java.util.List D7() {
        java.util.List<com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3> c76 = a8().c7();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(c76, 10));
        for (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 : c76) {
            c4181x2248e1a3.getClass();
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4181x2248e1a3.D();
            arrayList.add(D != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.U0(c4181x2248e1a3, D) : null);
        }
        return arrayList;
    }

    @Override // uw0.t0
    public java.lang.String E7() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4160xdd704649 c4160xdd704649;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e m17;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 N1;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 o76 = a8().o7();
        if (o76 == null || (c4160xdd704649 = o76.f129947a) == null || (m17 = c4160xdd704649.m()) == null || (N1 = m17.N1()) == null) {
            return null;
        }
        return N1.m33856x92013dca();
    }

    @Override // uw0.t0
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a F7() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4187xe514cceb J7 = J7();
        if (J7 == null) {
            return Z7().i7();
        }
        gx0.bf Z7 = Z7();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 B = J7.B();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(B, "getPresentationTimeRange(...)");
        return ou0.d.b(Z7, B);
    }

    @Override // uw0.t0
    public com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4187xe514cceb J7() {
        return a8().l7();
    }

    @Override // uw0.t0
    public ex0.l K7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        gx0.kh a86 = a8();
        a86.getClass();
        ex0.a0 a0Var = a86.f358175r;
        if (a0Var == null) {
            return null;
        }
        ex0.r g17 = a0Var.f338630g.g(segmentID);
        ex0.l lVar = g17 instanceof ex0.l ? (ex0.l) g17 : null;
        if (lVar != null) {
            return lVar;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return null;
    }

    @Override // uw0.t0
    public boolean L7() {
        return a8().q7();
    }

    @Override // uw0.t0
    public void M7(uw0.x panel) {
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        super.M7(panel);
        ex0.a0 a0Var = a8().f358175r;
        if (a0Var != null && (j0Var = a0Var.f338648y) != null) {
            j0Var.mo7806x9d92d11c(W6(), new gx0.k0(this));
        }
        ((gx0.gf) ((jz5.n) this.K).mo141623x754a37bb()).f358006f.mo7806x9d92d11c(W6(), new gx0.l0(this));
    }

    @Override // uw0.t0
    public ow0.a0 N7() {
        return (ow0.a0) T6(gx0.u2.class);
    }

    @Override // uw0.t0
    public du0.o O7() {
        return (du0.o) T6(gx0.x4.class);
    }

    @Override // uw0.t0
    public gx0.hf P7() {
        return (gx0.hf) T6(gx0.kc.class);
    }

    @Override // uw0.t0
    public by0.n Q7() {
        return new by0.n(Z7());
    }

    @Override // uw0.t0
    public void R7(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4187xe514cceb c4187xe514cceb) {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a;
        if (c4187xe514cceb != null) {
            c4128x879fba0a = !c4187xe514cceb.B().m34002x805f158c(Z7().h7()) ? c4187xe514cceb.A() : com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
        } else {
            c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2 = c4128x879fba0a;
        if (c4128x879fba0a2.m33980x66356283()) {
            gx0.bf.q7(Z7(), c4128x879fba0a2, true, 0L, 4, null);
        }
    }

    @Override // uw0.t0, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    /* renamed from: S7, reason: merged with bridge method [inline-methods] */
    public void a7(uw0.x panel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        super.a7(panel);
        gx0.bh bhVar = (gx0.bh) ((jz5.n) this.H).mo141623x754a37bb();
        gx0.q0 q0Var = new gx0.q0(this);
        bhVar.getClass();
        bhVar.L.m144677xb4f1a68f(q0Var);
    }

    @Override // uw0.t0
    public java.lang.Object T7(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4187xe514cceb c4187xe514cceb, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        gx0.bf Z7 = Z7();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a A = c4187xe514cceb.A();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(A, "getPresentationStartTime(...)");
        java.lang.Object r76 = gx0.bf.r7(Z7, false, A, 1, false, c4187xe514cceb.B(), interfaceC29045xdcb5ca57, 9, null);
        return r76 == pz5.a.f440719d ? r76 : jz5.f0.f384359a;
    }

    @Override // uw0.t0
    public boolean Y7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID, java.lang.String title) {
        ex0.l K7;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        if (!super.Y7(segmentID, title) || Z7().k7() == null || (K7 = K7(segmentID)) == null) {
            return false;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4187xe514cceb c4187xe514cceb = K7.f338679p;
        c4187xe514cceb.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4187xe514cceb.D();
        if (D != null) {
            bool = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4187xe514cceb.I0(c4187xe514cceb, title, D);
        }
        bool.booleanValue();
        gx0.bf Z7 = Z7();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 B = K7.f338700a.B();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(B, "getPresentationTimeRange(...)");
        ou0.d.b(Z7, B);
        ow0.a0 I7 = I7();
        I7.getClass();
        ow0.g gVar = (ow0.g) I7.f150773i;
        if (gVar != null) {
            gVar.m157275x53bfe316(title);
        }
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.t0(this, null), 3, null);
        return true;
    }

    public final gx0.bf Z7() {
        return (gx0.bf) ((jz5.n) this.f358544J).mo141623x754a37bb();
    }

    public final gx0.kh a8() {
        return (gx0.kh) ((jz5.n) this.I).mo141623x754a37bb();
    }

    @Override // uw0.t0, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void e7() {
        super.e7();
        ((gx0.bh) ((jz5.n) this.H).mo141623x754a37bb()).L.p();
    }

    @Override // uw0.t0
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 y7(java.lang.String materialID, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 timeRange) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialID, "materialID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timeRange, "timeRange");
        gx0.kh a86 = a8();
        a86.getClass();
        ex0.a0 a0Var = a86.f358175r;
        if (a0Var == null) {
            return null;
        }
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 f17 = a0Var.f338625b.f(materialID, timeRange.m34009x8082fb99(), timeRange.m34005x51e8b0a(), true);
        if (f17 == null) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            f17 = null;
        }
        if (f17 == null) {
            return null;
        }
        a0Var.J(cx0.d.f306043f.a(cx0.d.f306042e), null);
        return f17;
    }

    @Override // uw0.t0
    public void z7(ex0.l movieTitleVM) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(movieTitleVM, "movieTitleVM");
        ou0.e0.a(movieTitleVM, Z7(), a8(), ((gx0.w8) ((jz5.n) this.G).mo141623x754a37bb()).C7());
    }
}
