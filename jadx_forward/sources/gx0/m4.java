package gx0;

/* loaded from: classes5.dex */
public final class m4 extends hw0.z {

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f358230w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f358231x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f358232y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f358230w = jz5.h.b(new gx0.l4(this));
        this.f358231x = jz5.h.b(new gx0.i4(this));
        this.f358232y = jz5.h.b(new gx0.j4(this));
    }

    @Override // hw0.z
    public du0.o A7() {
        return (du0.o) T6(gx0.x4.class);
    }

    @Override // hw0.z
    public gx0.hf B7() {
        return (gx0.hf) T6(gx0.kc.class);
    }

    @Override // hw0.z
    public java.lang.Object D7(java.lang.String text, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ex0.k H7 = H7(c3971x241f78);
        if (H7 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4185x4df31add c4185x4df31add = H7.f338677p;
            c4185x4df31add.getClass();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4185x4df31add.D();
            if (D != null) {
                bool = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4185x4df31add.x0(c4185x4df31add, text, D);
            }
            bool.booleanValue();
            gx0.bf I7 = I7();
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 B = H7.f338700a.B();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(B, "getPresentationTimeRange(...)");
            ou0.d.b(I7, B);
        }
        java.lang.Object d76 = gx0.bf.d7(I7(), null, null, false, interfaceC29045xdcb5ca57, 7, null);
        return d76 == pz5.a.f440719d ? d76 : jz5.f0.f384359a;
    }

    @Override // hw0.z
    public void E7() {
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = this.f367031u;
        ex0.a0 a0Var = J7().f358175r;
        ex0.v vVar = a0Var != null ? a0Var.f338630g : null;
        if (c3971x241f78 != null) {
            if ((vVar == null || vVar.b(c3971x241f78)) ? false : true) {
                return;
            }
            ex0.k H7 = H7(c3971x241f78);
            java.lang.Object obj = H7 != null ? H7.f338700a : null;
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4185x4df31add c4185x4df31add = obj instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4185x4df31add ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4185x4df31add) obj : null;
            if (c4185x4df31add != null) {
                java.lang.String N0 = c4185x4df31add.N0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(N0, "getTitle(...)");
                if (N0.length() == 0) {
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4185x4df31add.D();
                    if ((D != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4185x4df31add.K0(c4185x4df31add, D) : "").length() == 0) {
                        return;
                    }
                }
            }
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = (ou0.g) I7().A.mo3195x754a37bb();
            if (c4128x879fba0a == null) {
                c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
            }
            gx0.kh J7 = J7();
            java.lang.String string = j65.q.a(m80379x76847179()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.mbv);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            J7.r7(string, c4128x879fba0a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r1.b(r0) == true) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // hw0.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void F7() {
        /*
            r6 = this;
            com.tencent.maas.base.MJID r0 = r6.f367031u
            gx0.kh r1 = r6.J7()
            ex0.a0 r1 = r1.f358175r
            r2 = 0
            if (r1 == 0) goto Le
            ex0.v r1 = r1.f338630g
            goto Lf
        Le:
            r1 = r2
        Lf:
            android.app.Activity r3 = r6.m80379x76847179()
            android.content.res.Resources r3 = j65.q.a(r3)
            r4 = 2131771420(0x7f10401c, float:1.917417E38)
            java.lang.String r3 = r3.getString(r4)
            if (r0 == 0) goto L61
            if (r1 == 0) goto L2a
            boolean r1 = r1.b(r0)
            r5 = 1
            if (r1 != r5) goto L2a
            goto L2b
        L2a:
            r5 = 0
        L2b:
            if (r5 == 0) goto L61
            ex0.k r0 = r6.H7(r0)
            if (r0 == 0) goto L36
            com.tencent.maas.moviecomposing.segments.Segment r0 = r0.f338700a
            goto L37
        L36:
            r0 = r2
        L37:
            boolean r1 = r0 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4185x4df31add
            if (r1 == 0) goto L3e
            com.tencent.maas.moviecomposing.segments.FancyTextSegment r0 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4185x4df31add) r0
            goto L3f
        L3e:
            r0 = r2
        L3f:
            if (r0 == 0) goto L5f
            java.lang.String r0 = r0.N0()
            java.lang.String r1 = "getTitle(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            java.lang.String r1 = r6.f367032v
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r1)
            if (r0 != 0) goto L6d
            android.app.Activity r0 = r6.m80379x76847179()
            android.content.res.Resources r0 = j65.q.a(r0)
            java.lang.String r2 = r0.getString(r4)
            goto L6d
        L5f:
            r2 = r3
            goto L6d
        L61:
            android.app.Activity r0 = r6.m80379x76847179()
            android.content.res.Resources r0 = j65.q.a(r0)
            java.lang.String r2 = r0.getString(r4)
        L6d:
            if (r2 == 0) goto L87
            gx0.bf r0 = r6.I7()
            androidx.lifecycle.g0 r0 = r0.A
            java.lang.Object r0 = r0.mo3195x754a37bb()
            ou0.g r0 = (ou0.g) r0
            if (r0 == 0) goto L7e
            goto L80
        L7e:
            com.tencent.maas.model.time.MJTime r0 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5
        L80:
            gx0.kh r1 = r6.J7()
            r1.r7(r2, r0)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.m4.F7():void");
    }

    public final ex0.k H7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78) {
        return J7().i7(c3971x241f78);
    }

    public final gx0.bf I7() {
        return (gx0.bf) ((jz5.n) this.f358231x).mo141623x754a37bb();
    }

    public final gx0.kh J7() {
        return (gx0.kh) ((jz5.n) this.f358230w).mo141623x754a37bb();
    }

    @Override // hw0.z
    public void s7() {
        bu0.a u76 = u7();
        ex0.k kVar = u76 instanceof ex0.k ? (ex0.k) u76 : null;
        if (kVar == null) {
            return;
        }
        gx0.hf hfVar = (gx0.hf) ((jz5.n) this.f367026p).mo141623x754a37bb();
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = kVar.f338700a.f130065a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c3971x241f78, "getSegmentID(...)");
        gx0.hf.V6(hfVar, c3971x241f78, null, 2, null);
    }

    @Override // hw0.z
    public void t7() {
        ex0.a0 a0Var;
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = this.f367031u;
        if (c3971x241f78 != null) {
            ex0.k H7 = H7(c3971x241f78);
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = H7 != null ? H7.f338700a : null;
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4185x4df31add c4185x4df31add = c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4185x4df31add ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4185x4df31add) c4190xd8dd3713 : null;
            if (c4185x4df31add != null) {
                java.lang.String N0 = c4185x4df31add.N0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(N0, "getTitle(...)");
                if (N0.length() == 0) {
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4185x4df31add.D();
                    if (((D != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4185x4df31add.K0(c4185x4df31add, D) : "").length() == 0) && (a0Var = J7().f358175r) != null) {
                        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f782 = this.f367031u;
                        if (c3971x241f782 != null && a0Var.G(c3971x241f782, true, ax0.e.f96508d)) {
                            this.f367031u = null;
                        }
                        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.k4(this, null), 3, null);
                    }
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f367032v, c4185x4df31add.N0())) {
                    return;
                }
                java.lang.String N02 = c4185x4df31add.N0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(N02, "getTitle(...)");
                if (N02.length() > 0) {
                    gx0.w.V6((gx0.w) ((jz5.n) this.f367029s).mo141623x754a37bb(), null, c4185x4df31add, new gx0.g4(this), 1, null);
                }
            }
        }
    }

    @Override // hw0.z
    public bu0.a u7() {
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = this.f367031u;
        if (c3971x241f78 == null) {
            return null;
        }
        return H7(c3971x241f78);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r2.b(r0) == true) goto L22;
     */
    @Override // hw0.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w7() {
        /*
            r5 = this;
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r0 = r5.f150773i
            hw0.p r0 = (hw0.p) r0
            r1 = 0
            if (r0 == 0) goto L11
            java.lang.String r2 = "key_mj_id"
            r3 = 2
            java.lang.Object r0 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6.k(r0, r2, r1, r3, r1)
            com.tencent.maas.base.MJID r0 = (com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78) r0
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 != 0) goto L15
            return
        L15:
            ex0.k r0 = r5.H7(r0)
            if (r0 == 0) goto L72
            com.tencent.maas.base.MJID r0 = r0.f338701b
            if (r0 != 0) goto L20
            goto L72
        L20:
            r5.f367031u = r0
            gx0.kh r2 = r5.J7()
            ex0.a0 r2 = r2.f358175r
            if (r2 == 0) goto L2d
            ex0.v r2 = r2.f338630g
            goto L2e
        L2d:
            r2 = r1
        L2e:
            if (r2 == 0) goto L38
            boolean r2 = r2.b(r0)
            r3 = 1
            if (r2 != r3) goto L38
            goto L39
        L38:
            r3 = 0
        L39:
            java.lang.String r2 = ""
            if (r3 == 0) goto L6f
            ex0.k r3 = r5.H7(r0)
            if (r3 == 0) goto L46
            com.tencent.maas.moviecomposing.segments.Segment r3 = r3.f338700a
            goto L47
        L46:
            r3 = r1
        L47:
            boolean r4 = r3 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4185x4df31add
            if (r4 == 0) goto L4e
            r1 = r3
            com.tencent.maas.moviecomposing.segments.FancyTextSegment r1 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4185x4df31add) r1
        L4e:
            if (r1 == 0) goto L58
            java.lang.String r1 = r1.N0()
            if (r1 != 0) goto L57
            goto L58
        L57:
            r2 = r1
        L58:
            r5.f367032v = r2
            r5.q7(r2)
            r5.G7()
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r1 = r5.f150773i
            hw0.p r1 = (hw0.p) r1
            if (r1 == 0) goto L72
            hw0.v r2 = new hw0.v
            r2.<init>(r5, r0)
            r1.m47107x79e29ffe(r2)
            goto L72
        L6f:
            r5.q7(r2)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.m4.w7():void");
    }

    @Override // hw0.z
    public void x7(hw0.p panel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        super.x7(panel);
        ((gx0.gf) ((jz5.n) this.f358232y).mo141623x754a37bb()).f358006f.mo7806x9d92d11c(W6(), new gx0.h4(this));
    }

    @Override // hw0.z
    public ow0.a0 y7() {
        return (ow0.a0) T6(gx0.u2.class);
    }

    @Override // hw0.z
    public gx0.w z7() {
        return (gx0.w) T6(gx0.f4.class);
    }
}
