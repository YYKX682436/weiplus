package gx0;

/* loaded from: classes5.dex */
public final class h1 extends uw0.e1 {
    public final jz5.g C;
    public final jz5.g D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.C = jz5.h.b(new gx0.b1(this));
        this.D = jz5.h.b(new gx0.a1(this));
    }

    @Override // uw0.e1
    public p3325xe03a0797.p3326xc267989b.r2 A7() {
        return pf5.e.m158343xd39de650(this, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new gx0.z0(this, null), 2, null);
    }

    @Override // uw0.e1
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a B7() {
        return L7().h7();
    }

    @Override // uw0.e1
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a C7() {
        return (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) L7().A.mo3195x754a37bb();
    }

    @Override // uw0.e1
    public ow0.a0 E7() {
        return (ow0.a0) T6(gx0.u2.class);
    }

    @Override // uw0.e1
    public gx0.hf F7() {
        return (gx0.hf) T6(gx0.kc.class);
    }

    @Override // uw0.e1
    public void G7(java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        super.G7(text);
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.c1(this, null), 3, null);
    }

    @Override // uw0.e1
    public void H7(sw0.e textStyleState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textStyleState, "textStyleState");
        ex0.a0 a0Var = M7().f358175r;
        if (a0Var == null) {
            return;
        }
        sw0.d dVar = (sw0.d) kz5.n0.a0(textStyleState.f494959a, textStyleState.f494960b.f494968b);
        if (zu0.i.f557209f == (dVar != null ? dVar.f494956b : null)) {
            java.lang.String str = dVar.f494955a.f129757b;
            du0.v0 R6 = R6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            R6.getClass();
            yy0.m7 m7Var = (yy0.m7) R6.O6();
            m7Var.getClass();
            p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.a4(m7Var, str, null), 3, null);
            java.util.Iterator it = a0Var.f338630g.f338713h.iterator();
            while (it.hasNext()) {
                ((ex0.b) it.next()).K(str);
            }
            sw0.b bVar = this.f430651q;
            this.f430651q = bVar != null ? sw0.b.a(bVar, null, str, null, null, null, 29, null) : null;
            sw0.b bVar2 = this.f513081t;
            this.f513081t = bVar2 != null ? sw0.b.a(bVar2, null, str, null, null, null, 29, null) : null;
            p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.d1(this, null), 3, null);
        }
    }

    @Override // uw0.e1
    public void I7(java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        super.I7(text);
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.e1(this, null), 3, null);
    }

    @Override // uw0.e1
    public void J7() {
        sw0.b bVar;
        java.lang.String str;
        java.lang.String str2;
        this.f513087z = false;
        ex0.a0 a0Var = M7().f358175r;
        if (a0Var == null || (bVar = this.f430651q) == null || (str = bVar.f494949c) == null) {
            return;
        }
        java.util.List list = a0Var.f338630g.f338713h;
        ex0.b bVar2 = (ex0.b) kz5.n0.a0(list, 0);
        if (bVar2 != null) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4180x49749a8d c4180x49749a8d = bVar2.f338650p;
            c4180x49749a8d.getClass();
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4180x49749a8d.D();
            str2 = D != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4180x49749a8d.M0(c4180x49749a8d, D) : "";
        } else {
            str2 = null;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str)) {
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((ex0.b) arrayList.get(i17)).I(str);
        }
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.f1(this, null), 3, null);
    }

    @Override // uw0.e1
    public void K7(sw0.e textMaterialUiState) {
        sw0.b bVar;
        sw0.b bVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textMaterialUiState, "textMaterialUiState");
        ex0.a0 a0Var = M7().f358175r;
        if (a0Var == null) {
            return;
        }
        sw0.d dVar = (sw0.d) kz5.n0.a0(textMaterialUiState.f494959a, textMaterialUiState.f494960b.f494968b);
        if (zu0.i.f557209f == (dVar != null ? dVar.f494956b : null)) {
            java.lang.String str = dVar.f494955a.f129757b;
            java.util.ArrayList arrayList = (java.util.ArrayList) a0Var.f338630g.f338713h;
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                ex0.b bVar3 = (ex0.b) arrayList.get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                bVar3.getClass();
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4180x49749a8d c4180x49749a8d = bVar3.f338650p;
                c4180x49749a8d.getClass();
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4180x49749a8d.D();
                if (D != null) {
                    bool = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4180x49749a8d.v0(c4180x49749a8d, str, D);
                }
                bool.booleanValue();
                bVar3.J(str);
            }
            sw0.b bVar4 = this.f430651q;
            if (bVar4 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                bVar = sw0.b.a(bVar4, null, null, null, str, null, 23, null);
            } else {
                bVar = null;
            }
            this.f430651q = bVar;
            sw0.b bVar5 = this.f513081t;
            if (bVar5 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                bVar2 = sw0.b.a(bVar5, null, null, null, str, null, 23, null);
            } else {
                bVar2 = null;
            }
            this.f513081t = bVar2;
            p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.g1(this, null), 3, null);
        }
    }

    public final gx0.bf L7() {
        return (gx0.bf) ((jz5.n) this.D).mo141623x754a37bb();
    }

    public final gx0.kh M7() {
        return (gx0.kh) ((jz5.n) this.C).mo141623x754a37bb();
    }

    @Override // uw0.e1, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void b7() {
        super.b7();
        ex0.a0 a0Var = M7().f358175r;
        if (a0Var != null) {
            a0Var.J(cx0.d.f306043f.a(cx0.d.f306042e), null);
        }
    }

    @Override // uw0.e1
    public void x7(java.lang.String snapshotDesc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotDesc, "snapshotDesc");
        M7().r7(snapshotDesc, (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) L7().A.mo3195x754a37bb());
    }

    @Override // uw0.e1
    public ex0.b z7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        gx0.kh M7 = M7();
        M7.getClass();
        ex0.a0 a0Var = M7.f358175r;
        if (a0Var == null) {
            return null;
        }
        return ex0.i0.c(a0Var, segmentID);
    }
}
