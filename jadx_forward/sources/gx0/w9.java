package gx0;

/* loaded from: classes5.dex */
public final class w9 extends ew0.l {
    public final jz5.g A;
    public final jz5.g B;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f358659z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f358659z = jz5.h.b(new gx0.u9(this));
        this.A = jz5.h.b(new gx0.s9(this));
        this.B = jz5.h.b(new gx0.t9(this));
    }

    @Override // ew0.l
    public void A7(ew0.a panel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        super.A7(panel);
        ((gx0.gf) ((jz5.n) this.B).mo141623x754a37bb()).f358006f.mo7806x9d92d11c(W6(), new gx0.q9(this));
    }

    @Override // ew0.l
    public du0.o B7() {
        return (du0.o) T6(gx0.x4.class);
    }

    @Override // ew0.l
    public cw0.l0 C7() {
        return (cw0.l0) T6(gx0.ac.class);
    }

    @Override // ew0.l
    public gx0.hf D7() {
        return (gx0.hf) T6(gx0.kc.class);
    }

    @Override // ew0.l
    public void E7(ex0.q narrationVM, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 narrationSegment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(narrationVM, "narrationVM");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(narrationSegment, "narrationSegment");
        gx0.kh khVar = (gx0.kh) ((jz5.n) this.f358659z).mo141623x754a37bb();
        khVar.getClass();
        ex0.a0 a0Var = khVar.f358175r;
        if (a0Var != null) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 c4189xeb0c3951 = narrationVM.f338695q;
            c4189xeb0c3951.getClass();
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4189xeb0c3951.D();
            java.lang.String C1 = D != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951.C1(c4189xeb0c3951, D) : "";
            c4189xeb0c3951.getClass();
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D2 = c4189xeb0c3951.D();
            java.lang.String K1 = D2 != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951.K1(c4189xeb0c3951, D2) : "";
            c4189xeb0c3951.getClass();
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D3 = c4189xeb0c3951.D();
            java.lang.String G1 = D3 != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951.G1(c4189xeb0c3951, D3) : "";
            java.util.List list = a0Var.f338630g.f338711f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (((ex0.r) next).f338702c == ug.m.Narration) {
                    arrayList.add(next);
                }
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                ex0.r rVar = (ex0.r) it6.next();
                ex0.q qVar = rVar instanceof ex0.q ? (ex0.q) rVar : null;
                if (qVar != null) {
                    qVar.O(C1);
                    qVar.M(K1);
                    qVar.L(G1);
                }
            }
        }
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.r9(this, null), 3, null);
        H7(narrationSegment);
    }

    @Override // ew0.l
    public void F7(java.lang.String text) {
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78;
        ex0.q z76;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        super.F7(text);
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.v9(this, null), 3, null);
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 c4189xeb0c3951 = this.f338561w;
        if (c4189xeb0c3951 == null || (c3971x241f78 = c4189xeb0c3951.f130065a) == null || (z76 = z7(c3971x241f78)) == null) {
            return;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = z76.f338700a;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 c4189xeb0c39512 = c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951) c4190xd8dd3713 : null;
        if (c4189xeb0c39512 != null) {
            H7(c4189xeb0c39512);
        }
    }

    public final gx0.bf G7() {
        return (gx0.bf) ((jz5.n) this.A).mo141623x754a37bb();
    }

    public final void H7(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 c4189xeb0c3951) {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m34367xdd1fba;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9 c4179xedb0cdf9 = this.f338562x;
        if (c4179xedb0cdf9 == null || (m34367xdd1fba = c4179xedb0cdf9.m34367xdd1fba()) == null) {
            return;
        }
        ou0.d.b(G7(), new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553(m34367xdd1fba.m34009x8082fb99().add(c4189xeb0c3951.A()), m34367xdd1fba.m34005x51e8b0a()));
    }

    @Override // ew0.l, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void b7() {
        super.b7();
        ex0.a0 a0Var = ((gx0.kh) ((jz5.n) this.f358659z).mo141623x754a37bb()).f358175r;
        if (a0Var != null) {
            a0Var.J(cx0.d.f306043f.a(cx0.d.f306042e), null);
        }
    }

    @Override // ew0.l
    public void x7(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 narrationSegment, java.lang.String snapshotDesc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(narrationSegment, "narrationSegment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotDesc, "snapshotDesc");
        ((gx0.kh) ((jz5.n) this.f358659z).mo141623x754a37bb()).r7(snapshotDesc, narrationSegment.A());
    }

    @Override // ew0.l
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a y7() {
        return (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) G7().A.mo3195x754a37bb();
    }

    @Override // ew0.l
    public ex0.q z7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        return ((gx0.kh) ((jz5.n) this.f358659z).mo141623x754a37bb()).n7(segmentID);
    }
}
