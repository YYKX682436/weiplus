package gx0;

/* loaded from: classes5.dex */
public final class f4 extends gx0.w {
    public final jz5.g D;
    public final jz5.g E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.D = jz5.h.b(new gx0.e4(this));
        this.E = jz5.h.b(new gx0.d4(this));
    }

    @Override // gx0.w
    public void A7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 b76 = I7().b7(segmentID);
        if (b76 == null) {
            return;
        }
        gx0.bf bfVar = (gx0.bf) ((jz5.n) this.E).mo141623x754a37bb();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 B = b76.B();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(B, "getPresentationTimeRange(...)");
        ou0.d.b(bfVar, B);
    }

    @Override // gx0.w
    public boolean D7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID, boolean z17, zw0.b entrance, du0.g parentUIC) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entrance, "entrance");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentUIC, "parentUIC");
        jz5.g gVar = this.B;
        if (((pv0.y) ((jz5.n) gVar).mo141623x754a37bb()).X6()) {
            return false;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 segment = I7().b7(segmentID);
        if (!(segment instanceof ug.n)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segment, "segment");
        ix0.g gVar2 = new ix0.g(segment, (pv0.y) ((jz5.n) gVar).mo141623x754a37bb(), I7(), (gx0.bf) ((jz5.n) this.E).mo141623x754a37bb(), m158345xefc66565());
        java.lang.String r17 = i65.a.r(m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f574048mc0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
        pv0.j jVar = pv0.j.f440066e;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("KEY_TIMBRE_ARGS", new pv0.h(segment, gVar2, r17, jVar, z17, false, true));
        if (parentUIC instanceof gx0.w8) {
            C7(entrance);
            Z6().k7((pv0.y) ((jz5.n) gVar).mo141623x754a37bb(), hashMap, entrance, this.C);
        } else {
            if (!(parentUIC instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k)) {
                return false;
            }
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k.i7((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k) parentUIC, (pv0.y) ((jz5.n) gVar).mo141623x754a37bb(), hashMap, null, null, null, 28, null);
        }
        return true;
    }

    @Override // gx0.w
    public boolean E7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 b76 = I7().b7(segmentID);
        if (b76 == null) {
            return false;
        }
        ug.m C = b76.C();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(C, "getSegmentType(...)");
        gx0.hf hfVar = (gx0.hf) ((jz5.n) this.f358624r).mo141623x754a37bb();
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = b76.f130065a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c3971x241f78, "getSegmentID(...)");
        boolean h76 = gx0.hf.h7(hfVar, c3971x241f78, false, false, 6, null);
        F7(C);
        return h76;
    }

    @Override // gx0.w
    public void G7(java.lang.String snapshotDesc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotDesc, "snapshotDesc");
        I7().r7(snapshotDesc, null);
    }

    public final gx0.kh I7() {
        return (gx0.kh) ((jz5.n) this.D).mo141623x754a37bb();
    }

    @Override // gx0.w
    public ex0.b W6() {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a ZeroTime = (ou0.g) ((gx0.bf) ((jz5.n) this.E).mo141623x754a37bb()).A.mo3195x754a37bb();
        if (ZeroTime == null) {
            ZeroTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ZeroTime, "ZeroTime");
        }
        ex0.b e76 = I7().e7(ZeroTime);
        if (e76 != null) {
            if (e76.A(e76.D(), ZeroTime) != null) {
                return e76;
            }
        }
        return null;
    }

    @Override // gx0.w
    public ex0.c X6() {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a ZeroTime = (ou0.g) ((gx0.bf) ((jz5.n) this.E).mo141623x754a37bb()).A.mo3195x754a37bb();
        if (ZeroTime == null) {
            ZeroTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ZeroTime, "ZeroTime");
        }
        return I7().g7(ZeroTime);
    }

    @Override // gx0.w
    public boolean e7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 b76 = I7().b7(segmentID);
        if (b76 == null || !(b76 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e)) {
            return false;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e c4188xeef5596e = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e) b76;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4188xeef5596e.D();
        if (D != null) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e.F1(c4188xeef5596e, D);
        }
        ug.m C = c4188xeef5596e.C();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(C, "getSegmentType(...)");
        F7(C);
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.c4(this, null), 3, null);
        return true;
    }

    @Override // gx0.w
    public uw0.o i7() {
        return (uw0.o) T6(gx0.h0.class);
    }

    @Override // gx0.w
    public uw0.t0 k7() {
        return (uw0.t0) T6(gx0.u0.class);
    }

    @Override // gx0.w
    public uw0.e1 l7() {
        return (uw0.e1) T6(gx0.h1.class);
    }

    @Override // gx0.w
    public hw0.n m7() {
        return (hw0.n) T6(gx0.r1.class);
    }

    @Override // gx0.w
    public ow0.a0 n7() {
        return (ow0.a0) T6(gx0.u2.class);
    }

    @Override // gx0.w
    public jv0.g o7() {
        return (jv0.g) T6(gx0.y3.class);
    }

    @Override // gx0.w
    public kv0.b p7() {
        return (kv0.b) T6(gx0.b4.class);
    }

    @Override // gx0.w
    public hw0.z q7() {
        return (hw0.z) T6(gx0.m4.class);
    }

    @Override // gx0.w
    public du0.o r7() {
        return (du0.o) T6(gx0.x4.class);
    }

    @Override // gx0.w
    public yt0.c s7() {
        return (yt0.c) T6(gx0.w8.class);
    }

    @Override // gx0.w
    public bw0.l t7() {
        return (bw0.l) T6(gx0.c9.class);
    }

    @Override // gx0.w
    public ew0.l u7() {
        return (ew0.l) T6(gx0.w9.class);
    }

    @Override // gx0.w
    public cw0.l0 v7() {
        return (cw0.l0) T6(gx0.ac.class);
    }

    @Override // gx0.w
    public gx0.hf w7() {
        return (gx0.hf) T6(gx0.kc.class);
    }

    @Override // gx0.w
    public pv0.y x7() {
        return (pv0.y) T6(gx0.sc.class);
    }

    @Override // gx0.w
    public lw0.l y7() {
        return (lw0.l) T6(gx0.dd.class);
    }
}
