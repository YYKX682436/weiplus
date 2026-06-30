package bw0;

/* loaded from: classes5.dex */
public abstract class l extends com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k {

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f106323n;

    /* renamed from: o, reason: collision with root package name */
    public sw0.b f106324o;

    /* renamed from: p, reason: collision with root package name */
    public sw0.b f106325p;

    /* renamed from: q, reason: collision with root package name */
    public ex0.o f106326q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f106327r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f106328s;

    /* renamed from: t, reason: collision with root package name */
    public final bw0.j f106329t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f106323n = jz5.h.b(new bw0.h(this));
        this.f106327r = jz5.h.b(new bw0.k(this));
        this.f106328s = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.c(m80379x76847179(), j65.q.b(m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.lli), false, 0, null);
        this.f106329t = new bw0.j(this);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 Y6() {
        return new bw0.a(m158354x19263085());
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void Z6(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 abstractC10936x89d53ec6) {
        bw0.a panel = (bw0.a) abstractC10936x89d53ec6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        panel.m11429x2dcea882(this.f106329t);
        panel.I(bw0.b.f106307d, new bw0.c(this, panel));
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void a7(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 abstractC10936x89d53ec6) {
        bw0.a panel = (bw0.a) abstractC10936x89d53ec6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        bw0.a aVar = (bw0.a) this.f150773i;
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = aVar != null ? (com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78) com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6.k(aVar, "key_dest_segment", null, 2, null) : null;
        ex0.o k76 = c3971x241f78 != null ? k7(c3971x241f78) : null;
        if (k76 == null) {
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k.U6(this, false, 1, null);
            return;
        }
        this.f106326q = k76;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e c4188xeef5596e = k76.f338687q;
        c4188xeef5596e.getClass();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4188xeef5596e.D();
        java.lang.String D1 = D != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e.D1(c4188xeef5596e, D) : "";
        c4188xeef5596e.getClass();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D2 = c4188xeef5596e.D();
        java.lang.String H1 = D2 != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e.H1(c4188xeef5596e, D2) : "";
        c4188xeef5596e.getClass();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D3 = c4188xeef5596e.D();
        sw0.b bVar = new sw0.b("", D1, H1, D3 != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e.A1(c4188xeef5596e, D3) : "", k76.f338663f.g0());
        this.f106325p = bVar;
        this.f106324o = bVar;
        if (!l7().f539175f) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f106328s;
            if (!u3Var.isShowing()) {
                u3Var.show();
            }
        }
        l7().f539185p.mo7806x9d92d11c(W6(), new bw0.d(panel, this));
        l7().f539187r.mo7806x9d92d11c(W6(), new bw0.e(panel, this));
        l7().f539183n.mo7806x9d92d11c(W6(), new bw0.g(panel, this));
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void e7() {
        zw0.d dVar;
        gx0.hf hfVar = (gx0.hf) ((jz5.n) this.f106323n).mo141623x754a37bb();
        bw0.a aVar = (bw0.a) this.f150773i;
        if (aVar == null || (dVar = aVar.mo47067x3a90fbd6()) == null) {
            dVar = zw0.d.f558094f;
        }
        gx0.hf.b7(hfVar, dVar, null, 2, null);
    }

    public ex0.o k7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        return null;
    }

    public final xw0.r l7() {
        return (xw0.r) ((jz5.n) this.f106327r).mo141623x754a37bb();
    }

    public abstract gx0.hf m7();

    public void n7() {
    }

    public void o7() {
    }

    public void p7() {
    }
}
