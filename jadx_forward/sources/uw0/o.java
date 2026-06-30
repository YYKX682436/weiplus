package uw0;

/* loaded from: classes5.dex */
public abstract class o extends ov0.c {
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 A;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f513117t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f513118u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f513119v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f513120w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f513121x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 f513122y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f513123z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f513117t = jz5.h.b(new uw0.n(this));
        this.f513118u = jz5.h.b(new uw0.b(this));
        this.f513119v = jz5.h.b(new uw0.m(this));
        this.f513120w = jz5.h.b(new uw0.c(this));
        this.A = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.c(m80379x76847179(), j65.q.b(m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.lli), false, 0, null);
    }

    public java.util.List A7() {
        return kz5.p0.f395529d;
    }

    public ex0.c B7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        return null;
    }

    public ex0.d C7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        return null;
    }

    public com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49 D7() {
        return null;
    }

    public final sw0.b E7(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49 c4182xb2a3bd49) {
        java.lang.String P0 = c4182xb2a3bd49.P0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(P0, "getText(...)");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4182xb2a3bd49.D();
        java.lang.String I0 = D != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49.I0(c4182xb2a3bd49, D) : "";
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D2 = c4182xb2a3bd49.D();
        java.lang.String F0 = D2 != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49.F0(c4182xb2a3bd49, D2) : "";
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D3 = c4182xb2a3bd49.D();
        return new sw0.b(P0, I0, F0, D3 != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49.z0(c4182xb2a3bd49, D3) : "", c4182xb2a3bd49.g0());
    }

    public final gx0.u2 F7() {
        return (gx0.u2) ((jz5.n) this.f513117t).mo141623x754a37bb();
    }

    public final void G7(uw0.a panel, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 segment) {
        java.lang.String P0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segment, "segment");
        this.f513122y = segment;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49 h07 = segment.h0();
        this.f430650p = h07 != null ? E7(h07) : null;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = segment.D();
        if (D != null) {
            bool = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7.Y(segment, D);
        }
        this.f513121x = bool.booleanValue();
        java.util.Objects.toString(this.f430650p);
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49 D7 = D7();
        this.f430651q = D7 != null ? E7(D7) : this.f430650p;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D2 = segment.D();
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 N = D2 != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7.N(segment, D2) : null;
        java.lang.String str = "";
        if (N == null || !I7(N)) {
            q7("");
        } else {
            ex0.d C7 = C7(N);
            java.lang.Object obj = C7 != null ? C7.f338700a : null;
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49 c4182xb2a3bd49 = obj instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49) obj : null;
            if (c4182xb2a3bd49 != null && (P0 = c4182xb2a3bd49.P0()) != null) {
                str = P0;
            }
            q7(str);
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(z7(segment), segment)) {
            panel.m157201xabe4ee33().setVisibility(8);
        } else {
            panel.m157201xabe4ee33().setVisibility(0);
        }
    }

    public void H7(uw0.a panel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        u7().f539185p.mo7806x9d92d11c(W6(), new uw0.d(panel, this));
        u7().f539187r.mo7806x9d92d11c(W6(), new uw0.e(panel, this));
        u7().f539183n.mo7806x9d92d11c(W6(), new uw0.g(panel, this));
    }

    public boolean I7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78) {
        return false;
    }

    public abstract gx0.w J7();

    @Override // vw0.d0
    public void K3(sw0.d data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        u7().v(data);
    }

    public void K7(sw0.d data, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 belongingSegment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(belongingSegment, "belongingSegment");
    }

    @Override // vw0.d0
    public void L6(sw0.d data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f430652r = true;
        u7().u(data);
    }

    @Override // ov0.c
    /* renamed from: L7, reason: merged with bridge method [inline-methods] */
    public void Z6(uw0.a panel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        super.Z6(panel);
        panel.m157201xabe4ee33().setOnClickListener(new uw0.h(this, panel));
    }

    public void M7(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 segment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segment, "segment");
    }

    public void N7() {
    }

    public void O7() {
    }

    @Override // vw0.d0
    public void P5(sw0.d data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
    }

    public void P7() {
    }

    public void Q7() {
    }

    public final void R7() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = this.f513122y;
        java.lang.String str = null;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49 h07 = c4181x2248e1a3 != null ? c4181x2248e1a3.h0() : null;
        boolean z17 = this.f513121x;
        if (!z17 || h07 == null) {
            if (!z17 && h07 != null) {
                str = j65.q.a(m80379x76847179()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.lls);
            } else if (z17 && h07 == null) {
                str = j65.q.a(m80379x76847179()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574043lm4);
            }
        } else if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430651q, this.f430650p)) {
            str = j65.q.a(m80379x76847179()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574043lm4);
        }
        if (str != null) {
            y7(str);
        }
    }

    public final void S7(sw0.e eVar) {
        sw0.d dVar = (sw0.d) kz5.n0.a0(eVar.f494959a, eVar.f494960b.f494968b);
        sw0.b bVar = null;
        if (zu0.i.f557209f == (dVar != null ? dVar.f494956b : null)) {
            java.lang.String str = dVar.f494955a.f129757b;
            java.util.Iterator it = A7().iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = ((com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49) it.next()).f130065a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c3971x241f78, "getSegmentID(...)");
                ex0.d C7 = C7(c3971x241f78);
                if (C7 != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49 c4182xb2a3bd49 = C7.f338654p;
                    c4182xb2a3bd49.getClass();
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4182xb2a3bd49.D();
                    if (D != null) {
                        bool = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49.B0(c4182xb2a3bd49, str, D);
                    }
                    bool.booleanValue();
                }
            }
            sw0.b bVar2 = this.f430651q;
            if (bVar2 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                bVar = sw0.b.a(bVar2, null, null, str, null, null, 27, null);
            }
            this.f430651q = bVar;
            N7();
        }
    }

    public final void T7(java.lang.String text) {
        sw0.e eVar;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49 h07;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = this.f513122y;
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = (c4181x2248e1a3 == null || (h07 = c4181x2248e1a3.h0()) == null) ? null : h07.f130065a;
        if (c3971x241f78 != null) {
            ex0.d C7 = C7(c3971x241f78);
            if (C7 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49 c4182xb2a3bd49 = C7.f338654p;
                c4182xb2a3bd49.getClass();
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4182xb2a3bd49.D();
                if (D != null) {
                    bool = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49.M0(c4182xb2a3bd49, text, D);
                }
                bool.booleanValue();
            }
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49 D7 = D7();
            this.f430651q = D7 != null ? E7(D7) : this.f430650p;
            O7();
            return;
        }
        if (this.f513123z || (eVar = (sw0.e) u7().f539183n.mo3195x754a37bb()) == null) {
            return;
        }
        sw0.d dVar = (sw0.d) kz5.n0.a0(eVar.f494959a, eVar.f494960b.f494968b);
        if (dVar == null || zu0.i.f557209f != dVar.f494956b) {
            return;
        }
        x7(dVar);
        sw0.e eVar2 = (sw0.e) u7().f539187r.mo3195x754a37bb();
        if (eVar2 != null) {
            S7(eVar2);
        }
        sw0.e eVar3 = (sw0.e) u7().f539185p.mo3195x754a37bb();
        if (eVar3 != null) {
            U7(eVar3);
        }
        T7(text);
    }

    public final void U7(sw0.e eVar) {
        sw0.d dVar = (sw0.d) kz5.n0.a0(eVar.f494959a, eVar.f494960b.f494968b);
        sw0.b bVar = null;
        if (zu0.i.f557209f == (dVar != null ? dVar.f494956b : null)) {
            java.lang.String str = dVar.f494955a.f129757b;
            java.util.Iterator it = A7().iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = ((com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49) it.next()).f130065a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c3971x241f78, "getSegmentID(...)");
                ex0.d C7 = C7(c3971x241f78);
                if (C7 != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49 c4182xb2a3bd49 = C7.f338654p;
                    c4182xb2a3bd49.getClass();
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4182xb2a3bd49.D();
                    if (D != null) {
                        bool = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49.O0(c4182xb2a3bd49, str, D);
                    }
                    bool.booleanValue();
                }
            }
            sw0.b bVar2 = this.f430651q;
            if (bVar2 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                bVar = sw0.b.a(bVar2, null, null, null, str, null, 23, null);
            }
            this.f430651q = bVar;
            Q7();
        }
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 Y6() {
        return new uw0.a(m158354x19263085());
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void a7(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 abstractC10936x89d53ec6) {
        uw0.a panel = (uw0.a) abstractC10936x89d53ec6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        uw0.a aVar = (uw0.a) this.f150773i;
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = aVar != null ? (com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78) com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6.k(aVar, "key_belonging_segment_id", null, 2, null) : null;
        if (c3971x241f78 != null) {
            ex0.c B7 = B7(c3971x241f78);
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = B7 != null ? B7.f338700a : null;
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) c4190xd8dd3713 : null;
            if (c4181x2248e1a3 != null) {
                G7(panel, c4181x2248e1a3);
            }
        }
        if (this.f513122y == null) {
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k.U6(this, false, 1, null);
            return;
        }
        panel.m47107x79e29ffe(new uw0.j(this, panel));
        if (!u7().f539175f) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.A;
            if (!u3Var.isShowing()) {
                u3Var.show();
            }
        }
        H7(panel);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void b7() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49 h07;
        R7();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = this.f513122y;
        if (c4181x2248e1a3 != null && (h07 = c4181x2248e1a3.h0()) != null) {
            java.lang.String P0 = h07.P0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(P0, "getText(...)");
            if (P0.length() == 0) {
                gx0.kc kcVar = (gx0.kc) ((jz5.n) this.f513119v).mo141623x754a37bb();
                com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = h07.f130065a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c3971x241f78, "getSegmentID(...)");
                gx0.hf.h7(kcVar, c3971x241f78, false, false, 6, null);
            }
            if (v7()) {
                gx0.w.V6((gx0.w) ((jz5.n) this.f513118u).mo141623x754a37bb(), null, h07, new uw0.k(this), 1, null);
            }
        }
        u7().t();
        this.f513121x = false;
        this.f430650p = null;
        this.f430651q = null;
        this.f513122y = null;
        this.f513123z = false;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void e7() {
        zw0.d dVar;
        if (F7().X6()) {
            return;
        }
        gx0.kc kcVar = (gx0.kc) ((jz5.n) this.f513119v).mo141623x754a37bb();
        uw0.a aVar = (uw0.a) this.f150773i;
        if (aVar == null || (dVar = aVar.mo47067x3a90fbd6()) == null) {
            dVar = zw0.d.f558094f;
        }
        gx0.hf.b7(kcVar, dVar, null, 2, null);
    }

    @Override // vw0.d0
    public void l5() {
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new uw0.l(this, null), 3, null);
    }

    @Override // ov0.i0
    public java.lang.String m7() {
        java.lang.String string = j65.q.a(m80379x76847179()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.ln7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // pf5.o, pf5.e, p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        u7().s();
    }

    @Override // vw0.d0
    public void p0() {
    }

    @Override // ov0.i0
    public void p7(java.lang.CharSequence charSequence) {
        java.lang.String str;
        if (this.f513122y == null) {
            return;
        }
        if (charSequence == null || (str = charSequence.toString()) == null) {
            str = "";
        }
        T7(str);
        if (str.length() == 0) {
            uw0.a aVar = (uw0.a) this.f150773i;
            if (aVar != null) {
                aVar.J();
                return;
            }
            return;
        }
        uw0.a aVar2 = (uw0.a) this.f150773i;
        if (aVar2 != null) {
            aVar2.Q();
        }
    }

    @Override // ov0.c
    public ug.m t7() {
        return ug.m.ContentDesc;
    }

    @Override // vw0.d0
    public void w1() {
        sw0.e eVar = (sw0.e) u7().f539183n.mo3195x754a37bb();
        if (eVar == null) {
            return;
        }
        sw0.d dVar = (sw0.d) kz5.n0.a0(eVar.f494959a, eVar.f494960b.f494968b);
        if (dVar == null) {
            return;
        }
        xw0.r u76 = u7();
        sw0.b bVar = this.f430651q;
        u76.l(dVar, bVar != null ? bVar.f494949c : null, true);
    }

    public final void x7(sw0.d dVar) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = this.f513122y;
        if (c4181x2248e1a3 != null) {
            if (c4181x2248e1a3.C() == ug.m.MovieClip || c4181x2248e1a3.C() == ug.m.ImageClip) {
                this.f513123z = true;
                K7(dVar, c4181x2248e1a3);
                this.f513123z = false;
            }
        }
    }

    public void y7(java.lang.String snapshotDesc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotDesc, "snapshotDesc");
    }

    public com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 z7(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 segment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segment, "segment");
        return null;
    }
}
