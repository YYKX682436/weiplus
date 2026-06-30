package uw0;

/* loaded from: classes5.dex */
public abstract class e1 extends ov0.c {
    public boolean A;
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 B;

    /* renamed from: t, reason: collision with root package name */
    public sw0.b f513081t;

    /* renamed from: u, reason: collision with root package name */
    public sw0.b f513082u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f513083v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f513084w;

    /* renamed from: x, reason: collision with root package name */
    public ex0.b f513085x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f513086y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f513087z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f513083v = jz5.h.b(new uw0.d1(this));
        this.f513084w = jz5.h.b(new uw0.c1(this));
        this.f513086y = "";
        this.B = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.c(m80379x76847179(), j65.q.b(m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.lli), false, 0, null);
    }

    public p3325xe03a0797.p3326xc267989b.r2 A7() {
        return null;
    }

    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a B7() {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a ZeroTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ZeroTime, "ZeroTime");
        return ZeroTime;
    }

    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a C7() {
        return null;
    }

    public final sw0.b D7(ex0.b bVar, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9 c4179xedb0cdf9) {
        java.lang.String m34366xfb85ada3 = c4179xedb0cdf9.m34366xfb85ada3();
        java.lang.String str = m34366xfb85ada3 == null ? "" : m34366xfb85ada3;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4180x49749a8d c4180x49749a8d = bVar.f338650p;
        c4180x49749a8d.getClass();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4180x49749a8d.D();
        java.lang.String K0 = D != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4180x49749a8d.K0(c4180x49749a8d, D) : "";
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4180x49749a8d c4180x49749a8d2 = bVar.f338650p;
        c4180x49749a8d2.getClass();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D2 = c4180x49749a8d2.D();
        java.lang.String M0 = D2 != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4180x49749a8d.M0(c4180x49749a8d2, D2) : "";
        c4180x49749a8d2.getClass();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D3 = c4180x49749a8d2.D();
        return new sw0.b(str, K0, M0, D3 != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4180x49749a8d.L0(c4180x49749a8d2, D3) : "", bVar.f338663f.g0());
    }

    public abstract ow0.a0 E7();

    public abstract gx0.hf F7();

    public void G7(java.lang.String text) {
        ex0.b z76;
        java.lang.String E;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 y76 = y7();
        if (y76 == null || (z76 = z7(y76)) == null || (E = z76.E()) == null) {
            return;
        }
        java.lang.String obj = r26.n0.u0(text).toString();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, "")) {
            obj = " ";
        }
        z76.L(obj, E, B7());
        sw0.b bVar = this.f513081t;
        this.f513081t = bVar != null ? sw0.b.a(bVar, text, null, null, null, null, 30, null) : null;
    }

    public void H7(sw0.e textStyleState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textStyleState, "textStyleState");
    }

    public void I7(java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 y76 = y7();
        if (y76 == null) {
            return;
        }
        ex0.b z76 = z7(y76);
        if (z76 != null) {
            z76.L(text, this.f513086y, B7());
        }
        sw0.b bVar = this.f430651q;
        this.f430651q = bVar != null ? sw0.b.a(bVar, text, null, null, null, null, 30, null) : null;
    }

    public void J7() {
        this.f513087z = false;
    }

    @Override // vw0.d0
    public void K3(sw0.d data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        u7().v(data);
    }

    public void K7(sw0.e textMaterialUiState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textMaterialUiState, "textMaterialUiState");
    }

    @Override // vw0.d0
    public void L6(sw0.d data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        u7().u(data);
    }

    @Override // vw0.d0
    public void P5(sw0.d data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 Y6() {
        return new uw0.u0(m80379x76847179());
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void a7(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 abstractC10936x89d53ec6) {
        java.lang.String str;
        uw0.u0 panel = (uw0.u0) abstractC10936x89d53ec6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 y76 = y7();
        sw0.b bVar = null;
        ex0.b z76 = y76 != null ? z7(y76) : null;
        if (z76 == null) {
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k.U6(this, false, 1, null);
            return;
        }
        uw0.u0 u0Var = (uw0.u0) this.f150773i;
        java.lang.String str2 = u0Var != null ? (java.lang.String) com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6.k(u0Var, "key_caption_language", null, 2, null) : null;
        if (str2 == null) {
            str2 = z76.D();
        }
        this.f513086y = str2;
        java.lang.String E = z76.E();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a C7 = C7();
        if (C7 == null) {
            C7 = z76.k();
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9 A = z76.A(this.f513086y, C7);
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9 A2 = E != null ? z76.A(E, C7) : null;
        if (A == null) {
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k.U6(this, false, 1, null);
            return;
        }
        this.f513085x = z76;
        this.f430650p = D7(z76, A);
        this.f513082u = A2 != null ? D7(z76, A2) : null;
        sw0.b bVar2 = this.f430650p;
        if (bVar2 == null) {
            bVar2 = D7(z76, A);
        }
        this.f430651q = bVar2;
        sw0.b bVar3 = this.f513082u;
        if (bVar3 != null) {
            bVar = bVar3;
        } else if (A2 != null) {
            bVar = D7(z76, A2);
        }
        this.f513081t = bVar;
        java.lang.String m34366xfb85ada3 = A.m34366xfb85ada3();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34366xfb85ada3, "getText(...)");
        q7(m34366xfb85ada3);
        sw0.b bVar4 = this.f513081t;
        if (bVar4 != null && (str = bVar4.f494947a) != null) {
            r7(str);
        }
        panel.m47107x79e29ffe(new uw0.a1(this, panel));
        if (!u7().f539175f) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.B;
            if (!u3Var.isShowing()) {
                u3Var.show();
            }
        }
        u7().f539185p.mo7806x9d92d11c(W6(), new uw0.v0(panel, this));
        u7().f539187r.mo7806x9d92d11c(W6(), new uw0.w0(panel, this));
        u7().f539183n.mo7806x9d92d11c(W6(), new uw0.y0(this, panel));
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void b7() {
        java.lang.String str;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10997xb9369314 m157199xdb574fcd;
        android.text.Editable text;
        if (this.f513085x != null) {
            java.lang.String string = (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430651q, this.f430650p) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513081t, this.f513082u)) ? null : j65.q.a(m80379x76847179()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.m_q);
            if (string != null) {
                x7(string);
            }
        }
        u7().t();
        this.f513085x = null;
        this.f430650p = null;
        this.f513082u = null;
        this.f430651q = null;
        this.f513081t = null;
        du0.v0 R6 = R6();
        uw0.u0 u0Var = (uw0.u0) this.f150773i;
        if (u0Var == null || (m157199xdb574fcd = u0Var.m157199xdb574fcd()) == null || (text = m157199xdb574fcd.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        R6.U6(str);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void d7() {
        if (this.f513087z) {
            J7();
        }
        yy0.m7 m7Var = (yy0.m7) R6().O6();
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.y4(m7Var, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void e7() {
        zw0.d dVar;
        if (((ow0.a0) ((jz5.n) this.f513083v).mo141623x754a37bb()).X6()) {
            return;
        }
        gx0.hf hfVar = (gx0.hf) ((jz5.n) this.f513084w).mo141623x754a37bb();
        uw0.u0 u0Var = (uw0.u0) this.f150773i;
        if (u0Var == null || (dVar = u0Var.mo47067x3a90fbd6()) == null) {
            dVar = zw0.d.f558094f;
        }
        gx0.hf.b7(hfVar, dVar, null, 2, null);
    }

    @Override // ov0.i0
    public void k7() {
        r7("");
    }

    @Override // vw0.d0
    public void l5() {
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new uw0.b1(this, null), 3, null);
    }

    @Override // ov0.i0
    public java.lang.String m7() {
        return "";
    }

    @Override // ov0.i0
    public void o7(java.lang.CharSequence charSequence) {
        java.lang.String str;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10997xb9369314 m157203x4d68d3e1;
        if (this.f513085x == null) {
            return;
        }
        if (charSequence == null || (str = charSequence.toString()) == null) {
            str = "";
        }
        uw0.u0 u0Var = (uw0.u0) this.f150773i;
        if ((u0Var == null || (m157203x4d68d3e1 = u0Var.m157203x4d68d3e1()) == null || !m157203x4d68d3e1.isFocused()) ? false : true) {
            if (str.length() > 0) {
                uw0.u0 u0Var2 = (uw0.u0) this.f150773i;
                if (u0Var2 != null) {
                    u0Var2.m157202xba2a8c67().setVisibility(0);
                }
                G7(str);
            }
        }
        uw0.u0 u0Var3 = (uw0.u0) this.f150773i;
        if (u0Var3 != null) {
            u0Var3.m157202xba2a8c67().setVisibility(8);
        }
        G7(str);
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
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10997xb9369314 m157199xdb574fcd;
        if (this.f513085x == null) {
            return;
        }
        if (charSequence == null || (str = charSequence.toString()) == null) {
            str = "";
        }
        uw0.u0 u0Var = (uw0.u0) this.f150773i;
        if ((u0Var == null || (m157199xdb574fcd = u0Var.m157199xdb574fcd()) == null || !m157199xdb574fcd.isFocused()) ? false : true) {
            if (str.length() > 0) {
                uw0.u0 u0Var2 = (uw0.u0) this.f150773i;
                if (u0Var2 != null) {
                    u0Var2.Q();
                }
                I7(str);
            }
        }
        uw0.u0 u0Var3 = (uw0.u0) this.f150773i;
        if (u0Var3 != null) {
            u0Var3.J();
        }
        I7(str);
    }

    @Override // ov0.c, vw0.d0
    public void s(sw0.d data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data.f494956b != zu0.i.f557211h) {
            super.s(data);
            return;
        }
        android.app.Activity m80379x76847179 = m80379x76847179();
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m80379x76847179);
        e4Var.f293309c = j65.q.a(m80379x76847179()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.mbr);
        e4Var.c();
    }

    @Override // ov0.c
    public ug.m t7() {
        return ug.m.Caption;
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

    public void x7(java.lang.String snapshotDesc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotDesc, "snapshotDesc");
    }

    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 y7() {
        uw0.u0 u0Var = (uw0.u0) this.f150773i;
        if (u0Var != null) {
            return (com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78) com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6.k(u0Var, "key_caption_segment_id", null, 2, null);
        }
        return null;
    }

    public ex0.b z7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        return null;
    }
}
