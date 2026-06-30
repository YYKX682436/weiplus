package rv0;

/* loaded from: classes5.dex */
public final class n1 extends com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k {
    public final java.util.List A;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f481659n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f481660o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f481661p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f481662q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f481663r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f481664s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f481665t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f481666u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f481667v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f481668w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f481669x;

    /* renamed from: y, reason: collision with root package name */
    public zv0.f0 f481670y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f481671z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f481659n = jz5.h.b(new rv0.o(this));
        this.f481660o = jz5.h.b(new rv0.z0(this));
        this.f481661p = jz5.h.b(new rv0.a1(this));
        this.f481662q = jz5.h.b(new rv0.l(this));
        this.f481663r = jz5.h.b(new rv0.m(this));
        this.f481664s = jz5.h.b(new rv0.n(this));
        this.f481665t = jz5.h.b(new rv0.k1(this));
        this.f481666u = jz5.h.b(new rv0.i1(this));
        this.f481667v = jz5.h.b(new rv0.e1(this));
        this.f481668w = jz5.h.b(new rv0.f1(this));
        this.f481669x = jz5.h.b(new rv0.l1(this));
        this.f481671z = jz5.h.b(new rv0.j1(this));
        this.A = new java.util.ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k7(rv0.n1 r9, rv0.c7 r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            r9.getClass()
            boolean r0 = r11 instanceof rv0.k
            if (r0 == 0) goto L16
            r0 = r11
            rv0.k r0 = (rv0.k) r0
            int r1 = r0.f481606h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f481606h = r1
            goto L1b
        L16:
            rv0.k r0 = new rv0.k
            r0.<init>(r9, r11)
        L1b:
            java.lang.Object r11 = r0.f481604f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f481606h
            jz5.f0 r3 = jz5.f0.f384359a
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L54
            if (r2 == r6) goto L47
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L83
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            java.lang.Object r9 = r0.f481603e
            rv0.c7 r9 = (rv0.c7) r9
            java.lang.Object r10 = r0.f481602d
            rv0.n1 r10 = (rv0.n1) r10
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L7d
        L47:
            java.lang.Object r9 = r0.f481603e
            r10 = r9
            rv0.c7 r10 = (rv0.c7) r10
            java.lang.Object r9 = r0.f481602d
            rv0.n1 r9 = (rv0.n1) r9
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L68
        L54:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            gx0.bf r11 = r9.p7()
            r0.f481602d = r9
            r0.f481603e = r10
            r0.f481606h = r6
            java.lang.Object r11 = r11.e7(r0)
            if (r11 != r1) goto L68
            goto La9
        L68:
            gx0.bf r11 = r9.p7()
            r0.f481602d = r9
            r0.f481603e = r10
            r0.f481606h = r5
            r2 = 0
            java.lang.Object r11 = gx0.bf.t7(r11, r2, r0, r6, r7)
            if (r11 != r1) goto L7a
            goto La9
        L7a:
            r8 = r10
            r10 = r9
            r9 = r8
        L7d:
            ex0.a0 r11 = r10.s7()
            if (r11 != 0) goto L85
        L83:
            r1 = r3
            goto La9
        L85:
            ex0.r r11 = r11.n()
            if (r11 != 0) goto L8c
            goto L83
        L8c:
            com.tencent.maas.moviecomposing.segments.Segment r11 = r11.f338700a
            boolean r2 = r11 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3
            if (r2 == 0) goto L95
            com.tencent.maas.moviecomposing.segments.ClipSegment r11 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) r11
            goto L96
        L95:
            r11 = r7
        L96:
            if (r11 != 0) goto L99
            goto L83
        L99:
            gx0.bf r10 = r10.p7()
            r0.f481602d = r7
            r0.f481603e = r7
            r0.f481606h = r4
            java.lang.Object r9 = r10.Z6(r11, r9, r0)
            if (r9 != r1) goto L83
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rv0.n1.k7(rv0.n1, rv0.c7, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l7(rv0.n1 r4, java.util.List r5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof rv0.g1
            if (r0 == 0) goto L16
            r0 = r6
            rv0.g1 r0 = (rv0.g1) r0
            int r1 = r0.f481545f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f481545f = r1
            goto L1b
        L16:
            rv0.g1 r0 = new rv0.g1
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r4 = r0.f481543d
            pz5.a r6 = pz5.a.f440719d
            int r1 = r0.f481545f
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r4)
            goto L46
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r4)
            kotlinx.coroutines.p0 r4 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            rv0.h1 r1 = new rv0.h1
            r3 = 0
            r1.<init>(r5, r3)
            r0.f481545f = r2
            java.lang.Object r4 = p3325xe03a0797.p3326xc267989b.l.g(r4, r1, r0)
            if (r4 != r6) goto L46
            goto L4c
        L46:
            java.lang.String r5 = "withContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r5)
            r6 = r4
        L4c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rv0.n1.l7(rv0.n1, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void t7(rv0.n1 n1Var, ex0.a0 a0Var, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, int i17, java.lang.Object obj) {
        ex0.v vVar;
        java.util.List list;
        if ((i17 & 2) != 0) {
            c4128x879fba0a = null;
        }
        int i18 = (int) (n1Var.m80379x76847179().getResources().getDisplayMetrics().widthPixels * 0.5f);
        float f17 = 48;
        n1Var.r7().b(a0Var, new bx0.j(e3.d.b(i18, (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * f17), i18, 0), (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * f17)), n1Var.m158345xefc66565());
        n1Var.r7().m47452x2e4caec8(new rv0.e0(n1Var));
        n1Var.r7().m47458x91b6da1b(new rv0.g0(n1Var));
        n1Var.r7().m47455x476e2aac(new rv0.j0(n1Var, a0Var));
        n1Var.r7().m47138xd31977(new rv0.l0(n1Var));
        n1Var.r7().m47137x6bbc962(new rv0.n0(n1Var));
        n1Var.r7().mo47139x7b8a77dc(new rv0.s0(n1Var, a0Var));
        n1Var.r7().m47454x565c0d26(new rv0.v0(n1Var));
        n1Var.r7().m47456xee666f0a(new rv0.w0(n1Var, a0Var));
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p894x8438d441.C10943x503f3e16 r76 = n1Var.r7();
        p3325xe03a0797.p3326xc267989b.y0 mainScope = n1Var.m158345xefc66565();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mainScope, "mainScope");
        ex0.a0 timelineVM = r76.getTimelineVM();
        if (timelineVM != null && (vVar = timelineVM.f338630g) != null && (list = vVar.f338710e) != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ex0.r rVar = (ex0.r) it.next();
                r76.getThumbnailProviderManager().d(rVar.f338701b);
                if (rVar.f338702c != ug.m.Transition) {
                    p3325xe03a0797.p3326xc267989b.l.d(mainScope, null, null, new yv0.l(r76, rVar, null), 3, null);
                }
            }
        }
        n1Var.r7().m47141xbb69fe28(new rv0.x0(a0Var, n1Var));
        n1Var.r7().m47140x1a73a7bd(new rv0.d0(a0Var, n1Var));
        if (c4128x879fba0a != null) {
            n1Var.z7(c4128x879fba0a);
        } else {
            n1Var.v7(((gx0.bh) ((jz5.n) n1Var.f481665t).mo141623x754a37bb()).b7());
        }
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 Y6() {
        rv0.j jVar = new rv0.j(m158354x19263085());
        jVar.m163169xf18ba5b3(o7().v7().f150877f.f150178e);
        return jVar;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void a7(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 abstractC10936x89d53ec6) {
        rv0.j panel = (rv0.j) abstractC10936x89d53ec6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        ex0.a0 s76 = s7();
        if (s76 == null) {
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k.U6(this, false, 1, null);
        } else if (r7().getWidth() <= 0) {
            r7().getViewTreeObserver().addOnGlobalLayoutListener(new rv0.y0(this, s76));
        } else {
            t7(this, s76, null, 2, null);
        }
        panel.m47071x815861a0(new rv0.r(this));
        ((gx0.gf) ((jz5.n) this.f481668w).mo141623x754a37bb()).f358006f.mo7806x9d92d11c(W6(), new rv0.s(this));
        ex0.a0 s77 = s7();
        if (s77 != null) {
            ex0.i0.m(s77);
            p012xc85e97e9.p093xedfae76a.j0 j0Var = s77.f338649z;
            j0Var.mo523x53d8522f(null);
            j0Var.mo7806x9d92d11c(W6(), new rv0.v(this, panel, s77));
            s77.H();
            p012xc85e97e9.p093xedfae76a.j0 j0Var2 = s77.f338648y;
            j0Var2.mo7806x9d92d11c(W6(), new rv0.x(this, s77));
            s77.A.mo7806x9d92d11c(W6(), new rv0.y(this));
            ((zv0.y) ((jz5.n) this.f481669x).mo141623x754a37bb()).f557781c.mo7806x9d92d11c(W6(), new rv0.z(this));
            s77.f338639p.mo7806x9d92d11c(W6(), new rv0.a0(panel));
            s77.f338638o.mo7806x9d92d11c(W6(), new rv0.b0(this, panel, s77));
            j0Var2.mo7806x9d92d11c(W6(), new rv0.c0(panel));
            s77.f338647x.mo7806x9d92d11c(W6(), new rv0.q(s77, this));
        }
        ex0.a0 s78 = s7();
        if (s78 == null) {
            return;
        }
        panel.m163171xda95c801(s78);
        panel.J(s78.y());
        panel.F();
        if (s7() == null) {
            return;
        }
        double s17 = r6.s(r7().getTimelineLayoutType()) * p7().V6().i7().m33988x124aa384();
        rv0.j jVar = (rv0.j) this.f150773i;
        if (jVar != null) {
            jVar.B((int) s17);
        }
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void b7() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 o76 = q7().o7();
        if (o76 != null) {
            du0.v0 R6 = R6();
            int h76 = q7().h7();
            int k76 = q7().k7();
            R6.getClass();
            yy0.m7 m7Var = (yy0.m7) R6.O6();
            m7Var.getClass();
            p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.g1(m7Var, o76, h76, k76, null), 3, null);
        }
        o7().f2().e(yw0.q.f548118h);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void d7() {
        zw0.b m47060xff04c82c;
        rv0.j jVar = (rv0.j) this.f150773i;
        if (jVar != null && (m47060xff04c82c = jVar.m47060xff04c82c()) != null) {
            du0.v0 R6 = R6();
            R6.getClass();
            java.lang.String entryType = m47060xff04c82c.f558092d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entryType, "entryType");
            yy0.m7 m7Var = (yy0.m7) R6.O6();
            m7Var.getClass();
            p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.o1(m7Var, entryType, null), 3, null);
        }
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new rv0.c1(this, null), 3, null);
    }

    public final aw0.f m7() {
        return (aw0.f) ((jz5.n) this.f481659n).mo141623x754a37bb();
    }

    public final ex0.r n7() {
        ex0.a0 s76 = s7();
        if (s76 != null) {
            return s76.n();
        }
        return null;
    }

    public final gx0.w8 o7() {
        return (gx0.w8) ((jz5.n) this.f481660o).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        if (2222 == i17 && i18 == -1) {
            java.util.ArrayList parcelableArrayListExtra = intent != null ? intent.getParcelableArrayListExtra("key_select_mix_media_list") : null;
            if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
                return;
            }
            p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new rv0.p(this, parcelableArrayListExtra, null), 3, null);
        }
    }

    @Override // pf5.o, pf5.e, p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        aw0.f m76 = m7();
        p3325xe03a0797.p3326xc267989b.z0.d(m76.f96013b, m76 + " onCleared.", null, 2, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        ex0.a0 s76;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.mo2276x50e1c15d(newConfig);
        if (!X6() || (s76 = s7()) == null) {
            return;
        }
        t7(this, s76, null, 2, null);
    }

    public final gx0.bf p7() {
        return (gx0.bf) ((jz5.n) this.f481667v).mo141623x754a37bb();
    }

    public final gx0.kh q7() {
        return (gx0.kh) ((jz5.n) this.f481666u).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p894x8438d441.C10943x503f3e16 r7() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f481671z).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p894x8438d441.C10943x503f3e16) mo141623x754a37bb;
    }

    public final ex0.a0 s7() {
        return q7().f358175r;
    }

    public final boolean u7(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713) {
        if ((c4190xd8dd3713 != null ? c4190xd8dd3713.C() : null) != ug.m.ImageClip) {
            if ((c4190xd8dd3713 != null ? c4190xd8dd3713.C() : null) != ug.m.MovieClip) {
                return false;
            }
        }
        return true;
    }

    public final void v7(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a currentTime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentTime, "currentTime");
        y7(currentTime);
        z7(currentTime);
        x7();
    }

    public final void w7() {
        p7().n7();
        ex0.a0 s76 = s7();
        ex0.r n17 = s76 != null ? s76.n() : null;
        ex0.f fVar = n17 instanceof ex0.f ? (ex0.f) n17 : null;
        if (fVar == null) {
            return;
        }
        int ordinal = fVar.f338667j.ordinal();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a i76 = ordinal != 1 ? ordinal != 2 ? p7().i7() : fVar.l().m34007xde00a612() : fVar.k();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) p7().f357791y.mo3195x754a37bb();
        if (c4128x879fba0a == null) {
            c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
        }
        if (i76.m33983x7b953cf2() && c4128x879fba0a.m33983x7b953cf2()) {
            ((gx0.bh) ((jz5.n) this.f481665t).mo141623x754a37bb()).i7(i76, c4128x879fba0a);
        }
    }

    public final void x7() {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817.i(r7(), false, 1, null);
    }

    public final void y7(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a) {
        ex0.a0 s76;
        ex0.a0 s77 = s7();
        if (s77 == null) {
            return;
        }
        s77.N(c4128x879fba0a, true);
        ex0.r n17 = s77.n();
        if ((n17 != null ? n17.f338702c : null) != ug.m.Transition && (s76 = s7()) != null) {
            ex0.i0.a(s76, c4128x879fba0a);
        }
        c4128x879fba0a.m33988x124aa384();
    }

    public final void z7(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a currentTime) {
        ex0.a0 s76;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentTime, "currentTime");
        if (currentTime.m33980x66356283() && (s76 = s7()) != null) {
            r7().g(s76.s(r7().getTimelineLayoutType()) * currentTime.m33988x124aa384());
        }
    }
}
