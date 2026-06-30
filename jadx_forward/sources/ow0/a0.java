package ow0;

/* loaded from: classes5.dex */
public abstract class a0 extends com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k implements rw0.d {
    public final p012xc85e97e9.p093xedfae76a.j0 A;
    public dx0.g B;
    public final jz5.g C;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f430813n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f430814o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f430815p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f430816q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f430817r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f430818s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f430819t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f430820u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f430821v;

    /* renamed from: w, reason: collision with root package name */
    public final xw0.r f430822w;

    /* renamed from: x, reason: collision with root package name */
    public final nw0.h f430823x;

    /* renamed from: y, reason: collision with root package name */
    public vw0.g f430824y;

    /* renamed from: z, reason: collision with root package name */
    public final ow0.t f430825z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f430814o = jz5.h.b(new ow0.n(this));
        this.f430815p = jz5.h.b(new ow0.j(this));
        this.f430816q = jz5.h.b(new ow0.m(this));
        this.f430817r = jz5.h.b(new ow0.i(this));
        this.f430818s = jz5.h.b(new ow0.s(this));
        this.f430819t = jz5.h.b(new ow0.l(this));
        this.f430820u = jz5.h.b(new ow0.k(this));
        this.f430821v = jz5.h.b(new ow0.r(this));
        this.f430822w = new xw0.r(Q6());
        this.f430823x = new nw0.h(Q6());
        this.f430824y = vw0.g.f522308d;
        this.f430825z = new ow0.t(this);
        this.A = new p012xc85e97e9.p093xedfae76a.j0();
        this.C = jz5.h.b(new ow0.z(this));
    }

    public static void K7(ow0.a0 a0Var, ov0.e openPage, zw0.b bVar, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78, int i17, java.lang.Object obj) {
        uw0.e1 e1Var;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openEditCaptionPanel");
        }
        if ((i17 & 1) != 0) {
            openPage = ov0.e.f430658e;
        }
        if ((i17 & 2) != 0) {
            bVar = zw0.b.f558084e;
        }
        zw0.b entrance = bVar;
        if ((i17 & 4) != 0) {
            c3971x241f78 = null;
        }
        a0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openPage, "openPage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entrance, "entrance");
        ex0.b m76 = a0Var.m7(c3971x241f78);
        if (m76 == null) {
            return;
        }
        if ((entrance == zw0.b.f558090n && m76.f338704e != ax0.b.f96498e) || (e1Var = (uw0.e1) ((jz5.n) a0Var.f430819t).mo141623x754a37bb()) == null || e1Var.X6()) {
            return;
        }
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("key_open_page", openPage);
        lVarArr[1] = new jz5.l("key_caption_segment_id", m76.f338701b);
        lVarArr[2] = new jz5.l("key_caption_language", m76.D());
        lVarArr[3] = new jz5.l("key_enable_dual_language_edit", java.lang.Boolean.valueOf(m76.E() != null));
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k.i7(a0Var, e1Var, kz5.c1.i(lVarArr), entrance, null, null, 24, null);
    }

    public static void L7(ow0.a0 a0Var, ov0.e openPage, zw0.b bVar, int i17, java.lang.Object obj) {
        ow0.g gVar;
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 m157273xa56be4e7;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openEditContentDescPanel");
        }
        if ((i17 & 1) != 0) {
            openPage = ov0.e.f430658e;
        }
        if ((i17 & 2) != 0) {
            bVar = zw0.b.f558084e;
        }
        zw0.b entrance = bVar;
        a0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openPage, "openPage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entrance, "entrance");
        jz5.g gVar2 = a0Var.f430817r;
        if (((uw0.o) ((jz5.n) gVar2).mo141623x754a37bb()).X6() || (gVar = (ow0.g) a0Var.f150773i) == null || (m157273xa56be4e7 = gVar.m157273xa56be4e7()) == null) {
            return;
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k.i7(a0Var, (uw0.o) ((jz5.n) gVar2).mo141623x754a37bb(), kz5.c1.i(new jz5.l("key_open_page", openPage), new jz5.l("key_belonging_segment_id", m157273xa56be4e7)), entrance, null, null, 24, null);
    }

    public static void M7(ow0.a0 a0Var, ov0.e openPage, zw0.b bVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openEditTitlePanel");
        }
        if ((i17 & 1) != 0) {
            openPage = ov0.e.f430658e;
        }
        if ((i17 & 2) != 0) {
            bVar = zw0.b.f558084e;
        }
        zw0.b entrance = bVar;
        a0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openPage, "openPage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entrance, "entrance");
        jz5.g gVar = a0Var.f430815p;
        if (((uw0.t0) ((jz5.n) gVar).mo141623x754a37bb()).X6()) {
            return;
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k.i7(a0Var, (uw0.t0) ((jz5.n) gVar).mo141623x754a37bb(), kz5.c1.i(new jz5.l("key_open_page", openPage)), entrance, null, null, 24, null);
    }

    public abstract gx0.gg A7();

    public void B(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 clipSegmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clipSegmentID, "clipSegmentID");
        L7(this, null, null, 3, null);
    }

    public void B7() {
        yy0.m7 m7Var = (yy0.m7) R6().O6();
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.n3(m7Var, null), 3, null);
    }

    public void C0(android.view.View view, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 clipSegmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clipSegmentID, "clipSegmentID");
    }

    public void C7() {
    }

    public void D5(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 clipSegmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clipSegmentID, "clipSegmentID");
    }

    public void D7() {
        yy0.m7 m7Var = (yy0.m7) R6().O6();
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.k3(m7Var, null), 3, null);
    }

    public void E7(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 segment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segment, "segment");
    }

    public void F7() {
        yy0.m7 m7Var = (yy0.m7) R6().O6();
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.l3(m7Var, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    /* renamed from: G7 */
    public void a7(ow0.g panel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        this.f430813n = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.c(m80379x76847179(), j65.q.b(m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.lli), true, 0, null);
        s7(panel);
        r7();
        panel.m157274xa89a6bec(new ow0.o(this));
        sw0.f initPage = panel.m157272x8bd87135();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initPage, "initPage");
        panel.E = panel.F(initPage, false);
    }

    public void H7(java.util.List list) {
    }

    public void I7() {
        yy0.m7 m7Var = (yy0.m7) R6().O6();
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.m3(m7Var, null), 3, null);
    }

    public void J7() {
    }

    public void N(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
    }

    public final void N7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 mjID, zw0.b entrance, mv0.c editPurpose) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mjID, "mjID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entrance, "entrance");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editPurpose, "editPurpose");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k.i7(this, (hw0.z) ((jz5.n) this.f430816q).mo141623x754a37bb(), kz5.c1.i(new jz5.l("key_open_page", ov0.e.f430658e), new jz5.l("key_mj_id", mjID), new jz5.l("key_edit_purpose", editPurpose)), entrance, null, null, 24, null);
    }

    public final void O7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        du0.o oVar = (du0.o) ((jz5.n) this.f430814o).mo141623x754a37bb();
        oVar.getClass();
        if (oVar.e7(segmentID) && !oVar.f7(segmentID)) {
            oVar.n7(segmentID, false, z17);
        }
    }

    public final void P7(vw0.g newState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newState, "newState");
        this.f430824y = newState;
        ym5.a1.f(new ow0.u(this, newState));
    }

    public void S() {
        M7(this, null, null, 3, null);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 Y6() {
        return new ow0.g(m158354x19263085());
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void Z6(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 abstractC10936x89d53ec6) {
        ow0.g panel = (ow0.g) abstractC10936x89d53ec6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        panel.D(l7(), this.f430825z, this);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void b7() {
        this.f430822w.t();
        this.f430823x.e();
    }

    public void d0() {
        yy0.m7 m7Var = (yy0.m7) R6().O6();
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.s4(m7Var, null), 3, null);
        ((vu0.o0) ((jz5.n) this.C).mo141623x754a37bb()).c();
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void d7() {
        ((du0.o) ((jz5.n) this.f430814o).mo141623x754a37bb()).l7();
        ow0.g gVar = (ow0.g) this.f150773i;
        if (gVar != null) {
            du0.v0 R6 = R6();
            java.lang.String entryType = gVar.m47060xff04c82c().f558092d;
            R6.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entryType, "entryType");
            yy0.m7 m7Var = (yy0.m7) R6.O6();
            m7Var.getClass();
            p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.s1(m7Var, entryType, null), 3, null);
            int ordinal = gVar.m157271xfdaa7672().ordinal();
            if (ordinal == 0) {
                yy0.m7 m7Var2 = (yy0.m7) R6().O6();
                p3325xe03a0797.p3326xc267989b.l.d(m7Var2.Di(), null, null, new yy0.m3(m7Var2, null), 3, null);
                return;
            }
            if (ordinal == 1) {
                yy0.m7 m7Var3 = (yy0.m7) R6().O6();
                p3325xe03a0797.p3326xc267989b.l.d(m7Var3.Di(), null, null, new yy0.k3(m7Var3, null), 3, null);
            } else if (ordinal == 2) {
                yy0.m7 m7Var4 = (yy0.m7) R6().O6();
                p3325xe03a0797.p3326xc267989b.l.d(m7Var4.Di(), null, null, new yy0.l3(m7Var4, null), 3, null);
            } else {
                if (ordinal != 3) {
                    return;
                }
                yy0.m7 m7Var5 = (yy0.m7) R6().O6();
                p3325xe03a0797.p3326xc267989b.l.d(m7Var5.Di(), null, null, new yy0.n3(m7Var5, null), 3, null);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void e7() {
        zw0.d dVar;
        gx0.hf p76 = p7();
        ow0.g gVar = (ow0.g) this.f150773i;
        if (gVar == null || (dVar = gVar.mo47067x3a90fbd6()) == null) {
            dVar = zw0.d.f558094f;
        }
        gx0.hf.b7(p76, dVar, null, 2, null);
    }

    public void g3(boolean z17) {
        if (z17) {
            yy0.m7 m7Var = (yy0.m7) R6().O6();
            p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.v4(m7Var, null), 3, null);
        } else {
            yy0.m7 m7Var2 = (yy0.m7) R6().O6();
            p3325xe03a0797.p3326xc267989b.l.d(m7Var2.Di(), null, null, new yy0.w4(m7Var2, null), 3, null);
        }
        ((gx0.gg) ((jz5.n) this.f430818s).mo141623x754a37bb()).m132419xae7a2e7a();
    }

    public void k7(kw0.a stickerData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stickerData, "stickerData");
    }

    public java.util.List l7() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new sw0.n(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.lmt), sw0.f.f494962d, new com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10953xe6406afb(m158354x19263085(), null, 0, 6, null)));
        arrayList.add(new sw0.n(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.mbz), sw0.f.f494964f, new com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10947x71306f3b(m158354x19263085(), null, 0, 6, null)));
        return arrayList;
    }

    public ex0.b m7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78) {
        return null;
    }

    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p901x8438d441.C10954x76f4876c n7() {
        java.lang.Object obj;
        ow0.g gVar = (ow0.g) this.f150773i;
        if (gVar == null) {
            return null;
        }
        sw0.f fVar = sw0.f.f494965g;
        java.util.Iterator it = gVar.F.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((sw0.n) obj).f494977b == fVar) {
                break;
            }
        }
        sw0.n nVar = (sw0.n) obj;
        android.view.View view = nVar != null ? nVar.f494978c : null;
        if (!(view instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10951xedb68d8b)) {
            view = null;
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10951xedb68d8b c10951xedb68d8b = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10951xedb68d8b) view;
        if (c10951xedb68d8b != null) {
            return c10951xedb68d8b.getTimelineView();
        }
        return null;
    }

    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10951xedb68d8b o7() {
        java.lang.Object obj;
        ow0.g gVar = (ow0.g) this.f150773i;
        if (gVar == null) {
            return null;
        }
        sw0.f fVar = sw0.f.f494965g;
        java.util.Iterator it = gVar.F.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((sw0.n) obj).f494977b == fVar) {
                break;
            }
        }
        sw0.n nVar = (sw0.n) obj;
        android.view.View view = nVar != null ? nVar.f494978c : null;
        return (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10951xedb68d8b) (view instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10951xedb68d8b ? view : null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        ow0.g gVar;
        sw0.f m157271xfdaa7672;
        ow0.g gVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.mo2276x50e1c15d(newConfig);
        if (!X6() || (gVar = (ow0.g) this.f150773i) == null || (m157271xfdaa7672 = gVar.m157271xfdaa7672()) == null || (gVar2 = (ow0.g) this.f150773i) == null) {
            return;
        }
        gVar2.F(m157271xfdaa7672, false);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        super.mo451xac79a11b();
        this.f430822w.s();
        this.f430823x.d();
        vu0.o0 o0Var = (vu0.o0) ((jz5.n) this.C).mo141623x754a37bb();
        o0Var.c();
        p3325xe03a0797.p3326xc267989b.z0.e(o0Var.f521670j, null, 1, null);
        ru0.m.a().m();
    }

    public final gx0.hf p7() {
        return (gx0.hf) ((jz5.n) this.f430821v).mo141623x754a37bb();
    }

    public com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 q7() {
        return null;
    }

    public void r7() {
        nw0.h hVar = this.f430823x;
        p3325xe03a0797.p3326xc267989b.l.d(hVar.f422301b, null, null, new nw0.b(hVar, null, null), 3, null);
    }

    public void s1(fv0.a operation) {
        sw0.f m157271xfdaa7672;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 q76;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        int ordinal = operation.ordinal();
        if (ordinal == 1) {
            C7();
            return;
        }
        switch (ordinal) {
            case 14:
                ow0.g gVar = (ow0.g) this.f150773i;
                m157271xfdaa7672 = gVar != null ? gVar.m157271xfdaa7672() : null;
                if ((m157271xfdaa7672 != null ? ow0.h.f430846a[m157271xfdaa7672.ordinal()] : -1) == 4) {
                    K7(this, null, zw0.b.f558090n, null, 5, null);
                    return;
                }
                return;
            case 15:
                ow0.g gVar2 = (ow0.g) this.f150773i;
                sw0.f m157271xfdaa76722 = gVar2 != null ? gVar2.m157271xfdaa7672() : null;
                int i17 = m157271xfdaa76722 != null ? ow0.h.f430846a[m157271xfdaa76722.ordinal()] : -1;
                if (i17 == 1) {
                    if (q7() == null) {
                        return;
                    }
                    M7(this, ov0.e.f430659f, null, 2, null);
                    return;
                } else if (i17 == 2) {
                    L7(this, ov0.e.f430659f, null, 2, null);
                    return;
                } else {
                    if (i17 != 4) {
                        return;
                    }
                    K7(this, ov0.e.f430659f, zw0.b.f558090n, null, 4, null);
                    return;
                }
            case 16:
                ow0.g gVar3 = (ow0.g) this.f150773i;
                m157271xfdaa7672 = gVar3 != null ? gVar3.m157271xfdaa7672() : null;
                if ((m157271xfdaa7672 != null ? ow0.h.f430846a[m157271xfdaa7672.ordinal()] : -1) != 1 || (q76 = q7()) == null) {
                    return;
                }
                jz5.g gVar4 = this.f430820u;
                if (((jv0.g) ((jz5.n) gVar4).mo141623x754a37bb()).X6()) {
                    return;
                }
                com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k.i7(this, (jv0.g) ((jz5.n) gVar4).mo141623x754a37bb(), kz5.c1.i(new jz5.l("key_dest_segment_id", q76.f130065a)), null, null, new ow0.q(this, q76), 12, null);
                return;
            default:
                return;
        }
    }

    public void s5(kw0.a fancyTextData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fancyTextData, "fancyTextData");
        nw0.h hVar = this.f430823x;
        hVar.getClass();
        p3325xe03a0797.p3326xc267989b.l.d(hVar.f422301b, null, null, new nw0.e(fancyTextData, hVar, kw0.b.f394324e, null), 3, null);
    }

    public void s7(ow0.g panel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        this.f430823x.f422305f.mo7806x9d92d11c(W6(), new ow0.p(this));
        panel.m157276x21f395e2(this.A);
    }

    public abstract uw0.o t7();

    public abstract uw0.t0 u7();

    public uw0.e1 v7() {
        return null;
    }

    public abstract jv0.g w7();

    public abstract hw0.z x7();

    public abstract du0.o y7();

    public abstract gx0.hf z7();
}
