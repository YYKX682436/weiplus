package gx0;

/* loaded from: classes5.dex */
public abstract class w extends du0.g {
    public final jz5.g A;
    public final jz5.g B;
    public final gx0.a C;

    /* renamed from: i */
    public final java.util.Map f358618i;

    /* renamed from: m */
    public final jz5.g f358619m;

    /* renamed from: n */
    public final jz5.g f358620n;

    /* renamed from: o */
    public final jz5.g f358621o;

    /* renamed from: p */
    public final jz5.g f358622p;

    /* renamed from: q */
    public final jz5.g f358623q;

    /* renamed from: r */
    public final jz5.g f358624r;

    /* renamed from: s */
    public final jz5.g f358625s;

    /* renamed from: t */
    public final jz5.g f358626t;

    /* renamed from: u */
    public final jz5.g f358627u;

    /* renamed from: v */
    public final jz5.g f358628v;

    /* renamed from: w */
    public final jz5.g f358629w;

    /* renamed from: x */
    public final jz5.g f358630x;

    /* renamed from: y */
    public final jz5.g f358631y;

    /* renamed from: z */
    public final jz5.g f358632z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f358618i = kz5.c1.k(new jz5.l(bu0.b.f106014i, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.bvy)), new jz5.l(bu0.b.f106015m, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.bvx)), new jz5.l(bu0.b.f106017o, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.lwv)), new jz5.l(bu0.b.f106018p, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.m_r)), new jz5.l(bu0.b.f106016n, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.buk)), new jz5.l(bu0.b.f106010e, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.mbx)), new jz5.l(bu0.b.f106011f, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.mby)), new jz5.l(bu0.b.f106012g, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.mbw)));
        this.f358619m = jz5.h.b(new gx0.j(this));
        this.f358620n = jz5.h.b(new gx0.d(this));
        this.f358621o = jz5.h.b(new gx0.i(this));
        this.f358622p = jz5.h.b(new gx0.c(this));
        this.f358623q = jz5.h.b(new gx0.f(this));
        this.f358624r = jz5.h.b(new gx0.q(this));
        this.f358625s = jz5.h.b(new gx0.k(this));
        this.f358626t = jz5.h.b(new gx0.t(this));
        this.f358627u = jz5.h.b(new gx0.r(this));
        this.f358628v = jz5.h.b(new gx0.v(this));
        this.f358629w = jz5.h.b(new gx0.h(this));
        this.f358630x = jz5.h.b(new gx0.n(this));
        this.f358631y = jz5.h.b(new gx0.m(this));
        this.f358632z = jz5.h.b(new gx0.l(this));
        this.A = jz5.h.b(new gx0.g(this));
        this.B = jz5.h.b(new gx0.u(this));
        this.C = new gx0.a(new gx0.p(this));
    }

    public static /* synthetic */ void V6(gx0.w wVar, fv0.d dVar, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713, yz5.l lVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkIfNeedRegenerateSpeech");
        }
        if ((i17 & 1) != 0) {
            dVar = fv0.d.f348496o;
        }
        wVar.U6(dVar, c4190xd8dd3713, lVar);
    }

    public void A7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
    }

    public final boolean B7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78, zw0.b bVar, du0.g gVar) {
        if (Y6().X6()) {
            return false;
        }
        java.util.HashMap i17 = kz5.c1.i(new jz5.l("key_dest_segment_id", c3971x241f78));
        boolean z17 = !b7().A4();
        if (gVar instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k) {
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k.i7((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k) gVar, Y6(), i17, bVar, null, new gx0.o(this, c3971x241f78), 8, null);
        } else {
            if (!(gVar instanceof gx0.w8)) {
                return false;
            }
            ((gx0.w8) gVar).N0(Y6(), i17, z17, bVar);
        }
        return true;
    }

    public final void C7(zw0.b entrance) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entrance, "entrance");
        yt0.c.Q5(b7(), Z6(), null, !b7().A4(), entrance, 2, null);
    }

    public boolean D7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID, boolean z17, zw0.b entrance, du0.g parentUIC) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entrance, "entrance");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentUIC, "parentUIC");
        return false;
    }

    public boolean E7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        return false;
    }

    public final void F7(ug.m segmentType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentType, "segmentType");
        java.lang.Integer num = (java.lang.Integer) this.f358618i.get(av0.a.a(segmentType));
        if (num != null) {
            java.lang.String string = j65.q.a(m80379x76847179()).getString(num.intValue());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            ym5.a1.f(new gx0.s(this, string));
        }
    }

    public void G7(java.lang.String snapshotDesc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotDesc, "snapshotDesc");
    }

    public final boolean H7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID, bu0.b materialType, cv0.m option, zw0.b entrance) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialType, "materialType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(option, "option");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entrance, "entrance");
        z7(segmentID, materialType, option, entrance, false);
        return true;
    }

    public final void U6(fv0.d scene, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 segment, yz5.l regenerateBlock) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segment, "segment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(regenerateBlock, "regenerateBlock");
        java.lang.String b17 = ru0.a.b(segment);
        if (b17 != null && g7(scene, b17)) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(m80379x76847179());
            i0Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.m_m);
            i0Var.f(com.p314xaae8f345.mm.R.C30867xcad56011.m_o);
            i0Var.f293354b.E = new gx0.e(regenerateBlock, segment);
            i0Var.e(com.p314xaae8f345.mm.R.C30867xcad56011.m_n);
            i0Var.h();
        }
    }

    public ex0.b W6() {
        return null;
    }

    public ex0.c X6() {
        return null;
    }

    public final jv0.g Y6() {
        return (jv0.g) ((jz5.n) this.f358623q).mo141623x754a37bb();
    }

    public final kv0.b Z6() {
        return (kv0.b) ((jz5.n) this.f358629w).mo141623x754a37bb();
    }

    public final cv0.e a7(bu0.b materialType) {
        cv0.e eVar;
        cv0.e eVar2;
        cv0.e eVar3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialType, "materialType");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q qVar = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q) b7().v6().f421961b.j();
        boolean z17 = (qVar == null ? false : qVar instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.r) && com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.a(qVar);
        boolean z18 = (qVar != null ? qVar.mo47067x3a90fbd6() : null) == zw0.d.f558095g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "getHandleBoxShowOptionsForSegment: materialType:" + materialType + " isInEditing = " + z17 + ", isFirstPanelShown = " + z18);
        jz5.g gVar = this.f358619m;
        if (z17) {
            du0.o oVar = (du0.o) ((jz5.n) gVar).mo141623x754a37bb();
            oVar.getClass();
            cv0.f fVar = (cv0.f) ((java.util.LinkedHashMap) oVar.f324927p).get(materialType);
            return (fVar == null || (eVar3 = fVar.f304069c) == null) ? oVar.f324928q.f304069c : eVar3;
        }
        if (z17 || !z18) {
            du0.o oVar2 = (du0.o) ((jz5.n) gVar).mo141623x754a37bb();
            oVar2.getClass();
            cv0.f fVar2 = (cv0.f) ((java.util.LinkedHashMap) oVar2.f324927p).get(materialType);
            return (fVar2 == null || (eVar = fVar2.f304067a) == null) ? oVar2.f324928q.f304067a : eVar;
        }
        du0.o oVar3 = (du0.o) ((jz5.n) gVar).mo141623x754a37bb();
        oVar3.getClass();
        cv0.f fVar3 = (cv0.f) ((java.util.LinkedHashMap) oVar3.f324927p).get(materialType);
        return (fVar3 == null || (eVar2 = fVar3.f304068b) == null) ? oVar3.f324928q.f304068b : eVar2;
    }

    public final yt0.c b7() {
        return (yt0.c) ((jz5.n) this.f358625s).mo141623x754a37bb();
    }

    public final du0.g c7(bu0.b bVar) {
        if (!b7().A4()) {
            java.lang.Object b76 = b7();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(b76, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.common.uic.BaseComposingUIC");
            return (du0.g) b76;
        }
        int ordinal = bVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2 || ordinal == 3) {
                return (hw0.n) ((jz5.n) this.f358627u).mo141623x754a37bb();
            }
            if (ordinal != 5) {
                java.lang.Object b77 = b7();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(b77, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.common.uic.BaseComposingUIC");
                return (du0.g) b77;
            }
        }
        return d7();
    }

    public final ow0.a0 d7() {
        return (ow0.a0) ((jz5.n) this.f358626t).mo141623x754a37bb();
    }

    public boolean e7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (r3 != 9) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f7(bu0.b r3) {
        /*
            r2 = this;
            java.lang.String r0 = "materialType"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)
            int r3 = r3.ordinal()
            r0 = 1
            if (r3 == r0) goto L57
            r1 = 2
            if (r3 == r1) goto L38
            r1 = 3
            if (r3 == r1) goto L38
            r1 = 5
            if (r3 == r1) goto L57
            r1 = 6
            if (r3 == r1) goto L57
            r1 = 8
            if (r3 == r1) goto L21
            r1 = 9
            if (r3 == r1) goto L57
            goto L7c
        L21:
            jz5.g r3 = r2.f358630x
            jz5.n r3 = (jz5.n) r3
            java.lang.Object r3 = r3.mo141623x754a37bb()
            cw0.l0 r3 = (cw0.l0) r3
            if (r3 == 0) goto L32
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r3 = r3.f150773i
            cw0.d r3 = (cw0.d) r3
            goto L33
        L32:
            r3 = 0
        L33:
            boolean r0 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.a(r3)
            goto L7d
        L38:
            jz5.g r3 = r2.f358627u
            jz5.n r3 = (jz5.n) r3
            java.lang.Object r3 = r3.mo141623x754a37bb()
            hw0.n r3 = (hw0.n) r3
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r3 = r3.f150773i
            boolean r3 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.a(r3)
            if (r3 != 0) goto L7d
            jv0.g r3 = r2.Y6()
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r3 = r3.f150773i
            boolean r3 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.a(r3)
            if (r3 == 0) goto L7c
            goto L7d
        L57:
            ow0.a0 r3 = r2.d7()
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r3 = r3.f150773i
            boolean r3 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.a(r3)
            if (r3 != 0) goto L7d
            kv0.b r3 = r2.Z6()
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r3 = r3.f150773i
            boolean r3 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.a(r3)
            if (r3 != 0) goto L7d
            jv0.g r3 = r2.Y6()
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r3 = r3.f150773i
            boolean r3 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.a(r3)
            if (r3 == 0) goto L7c
            goto L7d
        L7c:
            r0 = 0
        L7d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.w.f7(bu0.b):boolean");
    }

    public final boolean g7(fv0.d scene, java.lang.String roleID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roleID, "roleID");
        com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 c4104x6d422cb2 = dw0.c.f325616e;
        return (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(roleID, dw0.f.a(scene == fv0.d.f348496o ? dw0.c.f325616e : dw0.c.f325617f)) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(roleID, "")) ? false : true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0010. Please report as an issue. */
    public final boolean h7(bu0.b materialType) {
        ew0.a aVar;
        uw0.u0 u0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialType, "materialType");
        int ordinal = materialType.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                switch (ordinal) {
                    case 5:
                        if (!com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.a(((uw0.t0) ((jz5.n) this.f358620n).mo141623x754a37bb()).f150773i) && !com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.a(Y6().f150773i)) {
                            return false;
                        }
                        break;
                    case 6:
                        return com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.a(((uw0.o) ((jz5.n) this.f358622p).mo141623x754a37bb()).f150773i);
                    case 7:
                        return com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.a(((bw0.l) ((jz5.n) this.f358632z).mo141623x754a37bb()).f150773i);
                    case 8:
                        ew0.l lVar = (ew0.l) ((jz5.n) this.f358631y).mo141623x754a37bb();
                        if (lVar == null || (aVar = (ew0.a) lVar.f150773i) == null || !com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.a(aVar)) {
                            return false;
                        }
                        break;
                    case 9:
                        uw0.e1 e1Var = (uw0.e1) ((jz5.n) this.A).mo141623x754a37bb();
                        if (!((e1Var == null || (u0Var = (uw0.u0) e1Var.f150773i) == null || !com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.a(u0Var)) ? false : true) && !com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.a(Y6().f150773i)) {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            } else if (!com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.a(((lw0.l) ((jz5.n) this.f358628v).mo141623x754a37bb()).f150773i) && !com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.a(Y6().f150773i)) {
                return false;
            }
        } else if (!com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.a(((hw0.z) ((jz5.n) this.f358621o).mo141623x754a37bb()).f150773i) && !com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.a(Y6().f150773i)) {
            return false;
        }
        return true;
    }

    public abstract uw0.o i7();

    public abstract uw0.t0 k7();

    public uw0.e1 l7() {
        return null;
    }

    public abstract hw0.n m7();

    public abstract ow0.a0 n7();

    public abstract jv0.g o7();

    public abstract kv0.b p7();

    public abstract hw0.z q7();

    public abstract du0.o r7();

    public abstract yt0.c s7();

    public abstract bw0.l t7();

    public ew0.l u7() {
        return null;
    }

    public cw0.l0 v7() {
        return null;
    }

    public abstract gx0.hf w7();

    public abstract pv0.y x7();

    public abstract lw0.l y7();

    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [boolean] */
    public final boolean z7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78, bu0.b bVar, cv0.m mVar, zw0.b bVar2, boolean z17) {
        du0.g gVar;
        du0.g gVar2;
        ex0.c X6;
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f782;
        du0.g gVar3;
        cw0.l0 l0Var;
        ?? r96;
        ex0.b W6;
        int ordinal = bVar.ordinal();
        gx0.a aVar = this.C;
        switch (ordinal) {
            case 1:
                int ordinal2 = mVar.ordinal();
                if (ordinal2 == 1) {
                    E7(c3971x241f78);
                    return true;
                }
                if (ordinal2 == 2) {
                    if (h7(bVar)) {
                        return true;
                    }
                    if (d7().X6()) {
                        d7().N7(c3971x241f78, bVar2, mv0.c.f413066e);
                        return true;
                    }
                    C7(bVar2);
                    Z6().k7((hw0.z) ((jz5.n) this.f358621o).mo141623x754a37bb(), kz5.c1.i(new jz5.l("key_open_page", ov0.e.f430658e), new jz5.l("key_mj_id", c3971x241f78), new jz5.l("key_edit_purpose", mv0.c.f413066e)), bVar2, aVar);
                    return true;
                }
                if (ordinal2 == 3) {
                    B7(c3971x241f78, bVar2, c7(bVar));
                    return true;
                }
                if (ordinal2 != 4) {
                    return true;
                }
                if (b7().A4()) {
                    gVar = d7();
                } else {
                    java.lang.Object b76 = b7();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(b76, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.common.uic.BaseComposingUIC");
                    gVar = (du0.g) b76;
                }
                D7(c3971x241f78, false, bVar2, gVar);
                return true;
            case 2:
                int ordinal3 = mVar.ordinal();
                if (ordinal3 == 1) {
                    E7(c3971x241f78);
                    return true;
                }
                if (ordinal3 != 2) {
                    if (ordinal3 != 3) {
                        return true;
                    }
                    B7(c3971x241f78, bVar2, c7(bVar));
                    return true;
                }
                jz5.g gVar4 = this.f358627u;
                if (((hw0.n) ((jz5.n) gVar4).mo141623x754a37bb()).X6()) {
                    ((hw0.n) ((jz5.n) gVar4).mo141623x754a37bb()).p7(c3971x241f78, bVar2, mv0.c.f413066e);
                    return true;
                }
                b7().N0((lw0.l) ((jz5.n) this.f358628v).mo141623x754a37bb(), kz5.c1.i(new jz5.l("ket_dest_segment", c3971x241f78)), !b7().A4(), bVar2);
                return true;
            case 3:
                int ordinal4 = mVar.ordinal();
                if (ordinal4 == 1) {
                    E7(c3971x241f78);
                    return true;
                }
                if (ordinal4 != 3) {
                    return true;
                }
                B7(c3971x241f78, bVar2, c7(bVar));
                return true;
            case 5:
                int ordinal5 = mVar.ordinal();
                if (ordinal5 == 1) {
                    E7(c3971x241f78);
                    return true;
                }
                if (ordinal5 != 2) {
                    if (ordinal5 == 3) {
                        B7(c3971x241f78, bVar2, c7(bVar));
                        return true;
                    }
                    if (ordinal5 != 4) {
                        return true;
                    }
                    if (b7().A4()) {
                        gVar2 = d7();
                    } else {
                        java.lang.Object b77 = b7();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(b77, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.common.uic.BaseComposingUIC");
                        gVar2 = (du0.g) b77;
                    }
                    D7(c3971x241f78, false, bVar2, gVar2);
                    return true;
                }
                if (h7(bVar)) {
                    return true;
                }
                if (d7().X6() && !z17) {
                    return true;
                }
                if (!d7().X6() && !z17) {
                    yt0.c b78 = b7();
                    ow0.a0 d76 = d7();
                    sw0.f fVar = sw0.f.f494962d;
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("KEY_PANEL_ARGS", new ow0.a(fVar, false));
                    yt0.c.Q5(b78, d76, hashMap, false, bVar2, 4, null);
                    return true;
                }
                if (d7().X6() && z17) {
                    ow0.a0.M7(d7(), null, bVar2, 1, null);
                    return true;
                }
                if (d7().X6() || !z17) {
                    return true;
                }
                C7(bVar2);
                Z6().k7((uw0.t0) ((jz5.n) this.f358620n).mo141623x754a37bb(), kz5.c1.i(new jz5.l("key_open_page", ov0.e.f430658e)), bVar2, aVar);
                return true;
            case 6:
                int ordinal6 = mVar.ordinal();
                if (ordinal6 == 1) {
                    E7(c3971x241f78);
                    return true;
                }
                if (ordinal6 != 2) {
                    if (ordinal6 != 4) {
                        return true;
                    }
                    if (b7().A4()) {
                        gVar3 = d7();
                    } else {
                        java.lang.Object b79 = b7();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(b79, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.common.uic.BaseComposingUIC");
                        gVar3 = (du0.g) b79;
                    }
                    D7(c3971x241f78, false, bVar2, gVar3);
                    return true;
                }
                if (h7(bVar)) {
                    return true;
                }
                if (d7().X6() && !z17) {
                    return true;
                }
                if (!d7().X6() && !z17) {
                    yt0.c b710 = b7();
                    ow0.a0 d77 = d7();
                    sw0.f fVar2 = sw0.f.f494963e;
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    hashMap2.put("KEY_PANEL_ARGS", new ow0.a(fVar2, false));
                    yt0.c.Q5(b710, d77, hashMap2, false, bVar2, 4, null);
                }
                if (d7().X6() && z17) {
                    ow0.a0.L7(d7(), null, bVar2, 1, null);
                    return true;
                }
                if (d7().X6() || !z17 || (X6 = X6()) == null || (c3971x241f782 = X6.f338701b) == null) {
                    return true;
                }
                C7(bVar2);
                Z6().k7((uw0.o) ((jz5.n) this.f358622p).mo141623x754a37bb(), kz5.c1.i(new jz5.l("key_open_page", ov0.e.f430658e), new jz5.l("key_belonging_segment_id", c3971x241f782)), bVar2, aVar);
                return true;
            case 7:
                int ordinal7 = mVar.ordinal();
                if (ordinal7 == 1) {
                    e7(c3971x241f78);
                    return true;
                }
                if (ordinal7 != 2) {
                    return true;
                }
                b7().N0((bw0.l) ((jz5.n) this.f358632z).mo141623x754a37bb(), kz5.c1.i(new jz5.l("key_dest_segment", c3971x241f78)), !b7().A4(), bVar2);
                return true;
            case 8:
                if (gx0.b.f357747a[mVar.ordinal()] != 2 || h7(bVar) || (l0Var = (cw0.l0) ((jz5.n) this.f358630x).mo141623x754a37bb()) == null) {
                    return true;
                }
                if (l0Var.X6() && !z17) {
                    l0Var.C7(c3971x241f78);
                    return true;
                }
                if (!l0Var.X6() && !z17) {
                    b7().N0(l0Var, kz5.c1.i(new jz5.l("NARRATION_SEGMENT_ID", c3971x241f78)), !b7().A4(), bVar2);
                    return true;
                }
                if (l0Var.X6() && z17) {
                    cw0.l0.Q7(l0Var, null, c3971x241f78, null, 5, null);
                    return true;
                }
                ew0.l lVar = (ew0.l) ((jz5.n) this.f358631y).mo141623x754a37bb();
                if (lVar == null || l0Var.X6() || !z17) {
                    return true;
                }
                C7(bVar2);
                Z6().k7(lVar, kz5.c1.i(new jz5.l("key_open_page", ov0.e.f430658e), new jz5.l("KEY_NARRATION_SEGMENT_ID", c3971x241f78)), bVar2, aVar);
                return true;
            case 9:
                int ordinal8 = mVar.ordinal();
                if (ordinal8 == 1) {
                    E7(c3971x241f78);
                    return true;
                }
                if (ordinal8 == 2 && !h7(bVar) && (!d7().X6() || z17)) {
                    if (d7().X6() || z17) {
                        r96 = 1;
                    } else {
                        yt0.c b711 = b7();
                        ow0.a0 d78 = d7();
                        sw0.f fVar3 = sw0.f.f494965g;
                        java.util.HashMap hashMap3 = new java.util.HashMap();
                        hashMap3.put("KEY_PANEL_ARGS", new ow0.a(fVar3, false));
                        r96 = 1;
                        yt0.c.Q5(b711, d78, hashMap3, false, bVar2, 4, null);
                    }
                    if (d7().X6() && z17) {
                        ow0.a0.K7(d7(), null, bVar2, null, 5, null);
                        return r96;
                    }
                    uw0.e1 e1Var = (uw0.e1) ((jz5.n) this.A).mo141623x754a37bb();
                    if (e1Var == null || d7().X6() || !z17 || (W6 = W6()) == null) {
                        return r96;
                    }
                    C7(bVar2);
                    kv0.b Z6 = Z6();
                    jz5.l[] lVarArr = new jz5.l[4];
                    lVarArr[0] = new jz5.l("key_open_page", ov0.e.f430658e);
                    lVarArr[r96] = new jz5.l("key_caption_segment_id", W6.f338701b);
                    lVarArr[2] = new jz5.l("key_caption_language", W6.D());
                    lVarArr[3] = new jz5.l("key_enable_dual_language_edit", java.lang.Boolean.valueOf(W6.E() != null ? r96 : false));
                    Z6.k7(e1Var, kz5.c1.i(lVarArr), bVar2, aVar);
                    return r96;
                }
                break;
        }
        return true;
    }
}
