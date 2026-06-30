package hw0;

/* loaded from: classes5.dex */
public abstract class z extends ov0.i0 implements mw0.h {

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f367026p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f367027q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f367028r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f367029s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f367030t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 f367031u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f367032v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f367026p = jz5.h.b(new hw0.t(this));
        this.f367027q = jz5.h.b(new hw0.r(this));
        this.f367028r = jz5.h.b(new hw0.x(this));
        this.f367029s = jz5.h.b(new hw0.q(this));
        this.f367030t = jz5.h.b(new hw0.w(this));
    }

    public abstract du0.o A7();

    public abstract gx0.hf B7();

    @Override // ov0.i0
    /* renamed from: C7, reason: merged with bridge method [inline-methods] */
    public void Z6(hw0.p panel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        super.Z6(panel);
        panel.m134221x2dcea882(this);
        android.view.View m157205x83e42eef = panel.m157205x83e42eef();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10948xe76107c2 c10948xe76107c2 = m157205x83e42eef instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10948xe76107c2 ? (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10948xe76107c2) m157205x83e42eef : null;
        if (c10948xe76107c2 == null) {
            return;
        }
        c10948xe76107c2.m47158x7574987c(new hw0.o(panel));
    }

    public java.lang.Object D7(java.lang.String str, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return jz5.f0.f384359a;
    }

    public void E7() {
    }

    public void F7() {
    }

    public final void G7() {
        hw0.p pVar = (hw0.p) this.f150773i;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10997xb9369314 m157199xdb574fcd = pVar != null ? pVar.m157199xdb574fcd() : null;
        if (m157199xdb574fcd == null) {
            return;
        }
        m157199xdb574fcd.setHint(m7());
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 Y6() {
        return new hw0.p(m158354x19263085());
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void a7(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 abstractC10936x89d53ec6) {
        hw0.p panel = (hw0.p) abstractC10936x89d53ec6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        w7();
        bu0.a u76 = u7();
        java.lang.String d17 = u76 != null ? u76.d() : null;
        nw0.h v76 = v7();
        p3325xe03a0797.p3326xc267989b.l.d(v76.f422301b, null, null, new nw0.b(v76, d17, null), 3, null);
        panel.f367010y1 = false;
        x7(panel);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void b7() {
        mv0.c cVar;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10997xb9369314 m157199xdb574fcd;
        hw0.p pVar = (hw0.p) this.f150773i;
        if (pVar == null || (cVar = pVar.m134219x6dbe567e()) == null) {
            cVar = mv0.c.f413066e;
        }
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            E7();
        } else if (ordinal == 1) {
            F7();
        }
        t7();
        v7().e();
        du0.v0 R6 = R6();
        hw0.p pVar2 = (hw0.p) this.f150773i;
        R6.U6(java.lang.String.valueOf((pVar2 == null || (m157199xdb574fcd = pVar2.m157199xdb574fcd()) == null) ? null : m157199xdb574fcd.getText()));
    }

    @Override // mw0.h
    public void e3(kw0.a stickerData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stickerData, "stickerData");
        nw0.h v76 = v7();
        v76.getClass();
        p3325xe03a0797.p3326xc267989b.l.d(v76.f422301b, null, null, new nw0.e(stickerData, v76, kw0.b.f394324e, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void e7() {
        zw0.d dVar;
        gx0.hf hfVar = (gx0.hf) ((jz5.n) this.f367026p).mo141623x754a37bb();
        hw0.p pVar = (hw0.p) this.f150773i;
        if (pVar == null || (dVar = pVar.mo47067x3a90fbd6()) == null) {
            dVar = zw0.d.f558094f;
        }
        gx0.hf.b7(hfVar, dVar, null, 2, null);
    }

    @Override // ov0.i0
    public sw0.c l7(ov0.e page) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        int ordinal = page.ordinal();
        if (ordinal == 0) {
            return new sw0.c(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.lkj), ov0.e.f430658e, new vw0.j(m158354x19263085()));
        }
        if (ordinal == 1) {
            return new sw0.c(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.lkk), ov0.e.f430659f, new com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10948xe76107c2(m158354x19263085(), null, 0, 6, null));
        }
        throw new jz5.j();
    }

    @Override // ov0.i0
    public java.lang.String m7() {
        java.lang.String a17;
        bu0.a u76 = u7();
        if (u76 != null && (a17 = u76.a()) != null) {
            return a17;
        }
        java.lang.String string = j65.q.a(m80379x76847179()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.ln_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // pf5.o, pf5.e, p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        v7().d();
    }

    @Override // ov0.i0
    public void p7(java.lang.CharSequence charSequence) {
        java.lang.String str;
        if (charSequence == null || (str = charSequence.toString()) == null) {
            str = "";
        }
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = this.f367031u;
        if (c3971x241f78 != null) {
            p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new hw0.y(this, str, c3971x241f78, null), 3, null);
        }
        if (str.length() == 0) {
            hw0.p pVar = (hw0.p) this.f150773i;
            if (pVar != null) {
                pVar.J();
                return;
            }
            return;
        }
        hw0.p pVar2 = (hw0.p) this.f150773i;
        if (pVar2 != null) {
            pVar2.Q();
        }
    }

    public abstract void s7();

    public void t7() {
    }

    public bu0.a u7() {
        return null;
    }

    public final nw0.h v7() {
        return (nw0.h) ((jz5.n) this.f367030t).mo141623x754a37bb();
    }

    public void w7() {
        q7("");
    }

    public void x7(hw0.p panel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        v7().f422305f.mo7806x9d92d11c(W6(), new hw0.s(panel, this));
    }

    public abstract ow0.a0 y7();

    public abstract gx0.w z7();
}
