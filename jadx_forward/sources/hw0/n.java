package hw0;

/* loaded from: classes5.dex */
public abstract class n extends com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k {

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f367002n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f367003o;

    /* renamed from: p, reason: collision with root package name */
    public kw0.c f367004p;

    /* renamed from: q, reason: collision with root package name */
    public au0.c f367005q;

    /* renamed from: r, reason: collision with root package name */
    public final hw0.m f367006r;

    /* renamed from: s, reason: collision with root package name */
    public final hw0.k f367007s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f367008t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f367002n = jz5.h.b(new hw0.l(this));
        this.f367004p = kw0.c.f394328d;
        this.f367006r = new hw0.m(this);
        this.f367007s = new hw0.k(this);
        this.f367008t = jz5.h.b(new hw0.i(this));
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 Y6() {
        return new hw0.g(m158354x19263085());
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void Z6(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 abstractC10936x89d53ec6) {
        hw0.g panel = (hw0.g) abstractC10936x89d53ec6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new kw0.d(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.lmp), kw0.c.f394329e, new com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10950x224d45f2(m158354x19263085(), null, 0, 6, null)));
        arrayList.add(new kw0.d(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.lmn), kw0.c.f394328d, new com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10946xf6acd180(m158354x19263085(), null, 0, 6, null)));
        panel.C(arrayList, this.f367006r, this.f367007s);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void a7(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 abstractC10936x89d53ec6) {
        hw0.g panel = (hw0.g) abstractC10936x89d53ec6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        this.f367003o = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.c(m80379x76847179(), j65.q.b(m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.lli), true, 0, null);
        nw0.h k76 = k7();
        p3325xe03a0797.p3326xc267989b.l.d(k76.f422301b, null, null, new nw0.d(k76, null, null), 3, null);
        m7(panel);
        panel.D(panel.m134216x4e91f60a(), false);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void b7() {
        k7().e();
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void c7(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 abstractC10936x89d53ec6) {
        hw0.g panel = (hw0.g) abstractC10936x89d53ec6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        this.f367003o = null;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void d7() {
        zw0.b m47060xff04c82c;
        hw0.g gVar = (hw0.g) this.f150773i;
        if (gVar != null && (m47060xff04c82c = gVar.m47060xff04c82c()) != null) {
            du0.v0 R6 = R6();
            R6.getClass();
            java.lang.String entryType = m47060xff04c82c.f558092d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entryType, "entryType");
            yy0.m7 m7Var = (yy0.m7) R6.O6();
            m7Var.getClass();
            p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.r1(m7Var, entryType, null), 3, null);
        }
        int ordinal = this.f367004p.ordinal();
        if (ordinal == 0) {
            yy0.m7 m7Var2 = (yy0.m7) R6().O6();
            p3325xe03a0797.p3326xc267989b.l.d(m7Var2.Di(), null, null, new yy0.i3(m7Var2, null), 3, null);
        } else {
            if (ordinal != 1) {
                return;
            }
            yy0.m7 m7Var3 = (yy0.m7) R6().O6();
            p3325xe03a0797.p3326xc267989b.l.d(m7Var3.Di(), null, null, new yy0.j3(m7Var3, null), 3, null);
        }
    }

    public final nw0.h k7() {
        return (nw0.h) ((jz5.n) this.f367002n).mo141623x754a37bb();
    }

    public abstract lw0.l l7();

    public void m7(hw0.g panel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        k7().f422304e.mo7806x9d92d11c(W6(), new hw0.j(panel, this));
    }

    public abstract java.lang.Object n7(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, com.p314xaae8f345.mm.vfs.r6 r6Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57);

    public abstract void o7(kw0.a aVar);

    @Override // pf5.o, pf5.e, p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        java.lang.Object obj;
        super.mo528x82b764cd();
        hw0.g gVar = (hw0.g) this.f150773i;
        if (gVar != null) {
            kw0.c cVar = kw0.c.f394328d;
            java.util.Iterator it = gVar.D.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((kw0.d) obj).f394332b == cVar) {
                        break;
                    }
                }
            }
            kw0.d dVar = (kw0.d) obj;
            android.view.View view = dVar != null ? dVar.f394333c : null;
            if (!(view instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10946xf6acd180)) {
                view = null;
            }
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10946xf6acd180 c10946xf6acd180 = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10946xf6acd180) view;
            if (c10946xf6acd180 != null) {
                c10946xf6acd180.b();
            }
        }
        this.f367003o = null;
        k7().d();
    }

    public final void p7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 mjID, zw0.b entrance, mv0.c editPurpose) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mjID, "mjID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entrance, "entrance");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editPurpose, "editPurpose");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k.i7(this, (lw0.l) ((jz5.n) this.f367008t).mo141623x754a37bb(), kz5.c1.i(new jz5.l("ket_dest_segment", mjID), new jz5.l("ket_edit_purpose", editPurpose)), entrance, null, null, 24, null);
    }
}
