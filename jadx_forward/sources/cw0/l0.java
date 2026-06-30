package cw0;

/* loaded from: classes5.dex */
public abstract class l0 extends com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k implements vu0.p0 {
    public final jz5.g A;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f304175n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f304176o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f304177p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f304178q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f304179r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 f304180s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f304181t;

    /* renamed from: u, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f304182u;

    /* renamed from: v, reason: collision with root package name */
    public float f304183v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.Map f304184w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f304185x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f304186y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f304187z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f304175n = jz5.h.b(new cw0.j(this));
        this.f304176o = jz5.h.b(new cw0.i0(this));
        this.f304177p = jz5.h.b(new cw0.k(this));
        this.f304178q = new java.util.concurrent.ConcurrentHashMap();
        this.f304179r = jz5.h.b(new cw0.j0(this));
        com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 c4104x6d422cb2 = dw0.c.f325616e;
        this.f304180s = dw0.c.f325617f;
        this.f304181t = true;
        this.f304183v = 0.5f;
        this.f304184w = new java.util.LinkedHashMap();
        this.f304185x = jz5.h.b(new cw0.i(this));
        this.f304186y = jz5.h.b(new cw0.k0(this));
        this.f304187z = jz5.h.b(new cw0.g(this));
        this.A = jz5.h.b(new cw0.h0(this));
    }

    public static void Q7(cw0.l0 l0Var, ov0.e openPage, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 narrationSegmentId, zw0.b bVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openEditCaptionItemPanel");
        }
        if ((i17 & 1) != 0) {
            openPage = ov0.e.f430658e;
        }
        if ((i17 & 4) != 0) {
            bVar = zw0.b.f558084e;
        }
        zw0.b entrance = bVar;
        l0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openPage, "openPage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(narrationSegmentId, "narrationSegmentId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entrance, "entrance");
        jz5.g gVar = l0Var.f304175n;
        if (((gx0.w9) ((jz5.n) gVar).mo141623x754a37bb()).X6()) {
            return;
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k.i7(l0Var, (gx0.w9) ((jz5.n) gVar).mo141623x754a37bb(), kz5.c1.i(new jz5.l("key_open_page", openPage), new jz5.l("KEY_NARRATION_SEGMENT_ID", narrationSegmentId)), entrance, null, new cw0.z(l0Var, narrationSegmentId), 8, null);
    }

    public static final void k7(cw0.l0 l0Var, java.lang.String str, java.util.List list, boolean z17, boolean z18) {
        java.util.concurrent.CountDownLatch countDownLatch;
        if (z17) {
            l0Var.getClass();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                r45.le4 le4Var = (r45.le4) it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(le4Var, "<this>");
                l0Var.l7(str, new com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9(le4Var.f460912f, new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33967x6fa736dc(le4Var.f460910d), com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33967x6fa736dc(le4Var.f460911e))));
            }
            if (z18 && (countDownLatch = (java.util.concurrent.CountDownLatch) l0Var.f304178q.get(str)) != null) {
                countDownLatch.countDown();
            }
        }
        l0Var.R7();
    }

    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p895x6855c7a2.p896x8438d441.C10945x27e58328 A7() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f304179r).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p895x6855c7a2.p896x8438d441.C10945x27e58328) mo141623x754a37bb;
    }

    public double B7() {
        return 0.0d;
    }

    public void C7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
    }

    public void D7(cw0.d panel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        panel.m47071x815861a0(new cw0.p(this));
    }

    public void E7() {
    }

    public boolean F7() {
        return false;
    }

    public abstract gx0.w G7();

    public void H7(int i17, java.lang.String wavFilepath, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wavFilepath, "wavFilepath");
    }

    public void I7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 narrationSegmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(narrationSegmentID, "narrationSegmentID");
    }

    @Override // vu0.p0
    public void J4(float[] waveArray, float f17) {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.p903x6b2e132.C10970x276594b8 m122810x3c4152c6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(waveArray, "waveArray");
        cw0.d dVar = (cw0.d) this.f150773i;
        if (dVar == null || (m122810x3c4152c6 = dVar.m122810x3c4152c6()) == null) {
            return;
        }
        kx0.g gVar = m122810x3c4152c6.A;
        kx0.f fVar = gVar.f394788d;
        kx0.f fVar2 = kx0.f.PRESS;
        if (fVar == fVar2) {
            kx0.i iVar = gVar.f394787c;
            iVar.getClass();
            iVar.f394809q = java.lang.Math.max(java.lang.Math.min(f17, 1.0f), 0.0f);
            gVar.invalidateSelf();
        }
        kx0.g gVar2 = m122810x3c4152c6.B;
        if (gVar2.f394788d == fVar2) {
            kx0.i iVar2 = gVar2.f394787c;
            iVar2.getClass();
            iVar2.f394809q = java.lang.Math.max(java.lang.Math.min(f17, 1.0f), 0.0f);
            gVar2.invalidateSelf();
        }
    }

    public void J7() {
    }

    public void K7(ru0.e roleResult, ex0.q narrationVM, com.p314xaae8f345.mm.vfs.r6 roleFile) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roleResult, "roleResult");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(narrationVM, "narrationVM");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roleFile, "roleFile");
    }

    public void L7() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331 m122811xfd5faf5d;
        android.view.View findViewWithTag;
        ex0.r v76 = v7();
        if (v76 == null) {
            wt0.a.a("No focused segment!!!!", m158345xefc66565());
            return;
        }
        if (v76.f338702c != ug.m.Narration) {
            wt0.a.a("Must be a narration segment", m158345xefc66565());
            return;
        }
        cw0.d dVar = (cw0.d) this.f150773i;
        boolean z17 = false;
        if (dVar != null && (m122811xfd5faf5d = dVar.m122811xfd5faf5d()) != null && (findViewWithTag = m122811xfd5faf5d.findViewWithTag(fv0.a.f348472h)) != null && rv0.b7.f481475d.a(findViewWithTag)) {
            z17 = true;
        }
        if (z17) {
            android.app.Activity m80379x76847179 = m80379x76847179();
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m80379x76847179);
            e4Var.f293309c = j65.q.a(m80379x76847179()).getText(com.p314xaae8f345.mm.R.C30867xcad56011.lmz);
            e4Var.c();
        }
    }

    public void M7() {
    }

    public void N7(ex0.q narrationVM) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(narrationVM, "narrationVM");
    }

    public void O7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID, ex0.q narrationVM) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(narrationVM, "narrationVM");
    }

    public void P7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
    }

    public void R7() {
    }

    public final void S7(ex0.q narrationVM) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(narrationVM, "narrationVM");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 c4189xeb0c3951 = narrationVM.f338695q;
        c4189xeb0c3951.getClass();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4189xeb0c3951.D();
        if (D != null) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951.A1(c4189xeb0c3951, "", "", D);
        }
        java.lang.String Q1 = c4189xeb0c3951.Q1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q1, "getOriginNarrationFilePath(...)");
        c4189xeb0c3951.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D2 = c4189xeb0c3951.D();
        if (D2 != null) {
            bool = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951.O1(c4189xeb0c3951, Q1, D2);
        }
        bool.booleanValue();
        narrationVM.P(vu0.w.f521701f);
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new cw0.b0(narrationVM, this, null), 3, null);
    }

    public void T7(float f17, java.lang.Float f18, java.lang.Float f19) {
    }

    public final void U7(java.lang.String snapshotDesc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotDesc, "snapshotDesc");
        ym5.a1.f(new cw0.c0(this, snapshotDesc));
    }

    public final void V7() {
        android.app.Activity m80379x76847179 = m80379x76847179();
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m80379x76847179);
        e4Var.f293309c = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574033h6);
        e4Var.c();
    }

    public final void W7(ex0.q narrationVM, java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(narrationVM, "narrationVM");
        if (map == null) {
            map = null;
        } else if (map.isEmpty()) {
            map = (java.util.Map) ((java.util.LinkedHashMap) this.f304184w).get(narrationVM.f338701b);
        }
        if (map != null) {
            java.util.List<com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9> I = narrationVM.I();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9 c4179xedb0cdf9 : I) {
                java.lang.Double d17 = (java.lang.Double) map.get(c4179xedb0cdf9.m34366xfb85ada3());
                if (d17 == null) {
                    arrayList.add(c4179xedb0cdf9);
                } else {
                    arrayList.add(new com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9(c4179xedb0cdf9.m34366xfb85ada3(), new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553(c4179xedb0cdf9.m34367xdd1fba().m34009x8082fb99(), com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(d17.doubleValue()))));
                }
            }
            narrationVM.N(arrayList);
        }
    }

    public final void X7() {
        boolean p76 = p7();
        cw0.d dVar = (cw0.d) this.f150773i;
        if (dVar != null) {
            if (p76) {
                com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.p903x6b2e132.C10970x276594b8 m122810x3c4152c6 = dVar.m122810x3c4152c6();
                if (m122810x3c4152c6.G == kx0.d.f394777e) {
                    return;
                }
                m122810x3c4152c6.F = true;
                m122810x3c4152c6.f151008x.setVisibility(8);
                m122810x3c4152c6.C();
                m122810x3c4152c6.f151009y.setVisibility(0);
                m122810x3c4152c6.f151010z.setVisibility(0);
                m122810x3c4152c6.G();
                m122810x3c4152c6.F();
                m122810x3c4152c6.A.d();
                return;
            }
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.p903x6b2e132.C10970x276594b8 m122810x3c4152c62 = dVar.m122810x3c4152c6();
            if (m122810x3c4152c62.G == kx0.d.f394777e) {
                return;
            }
            m122810x3c4152c62.F = false;
            m122810x3c4152c62.f151008x.setVisibility(8);
            m122810x3c4152c62.C();
            m122810x3c4152c62.f151009y.setVisibility(0);
            m122810x3c4152c62.f151010z.setVisibility(0);
            m122810x3c4152c62.G();
            m122810x3c4152c62.F();
            kx0.g gVar = m122810x3c4152c62.A;
            kx0.f fVar = gVar.f394788d;
            kx0.f fVar2 = kx0.f.DISABLE;
            if (fVar == fVar2) {
                return;
            }
            gVar.f394788d = fVar2;
            gVar.f394789e.cancel();
            gVar.invalidateSelf();
        }
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 Y6() {
        return new cw0.d(m158354x19263085());
    }

    public void Y7(java.lang.String requestId, vu0.u state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void a7(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 abstractC10936x89d53ec6) {
        cw0.d dVar;
        cw0.d panel = (cw0.d) abstractC10936x89d53ec6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        panel.m122810x3c4152c6().m47264xf566e927(new cw0.q(this));
        E7();
        double B7 = B7();
        if (B7 >= 0.0d && (dVar = (cw0.d) this.f150773i) != null) {
            dVar.C(B7);
        }
        D7(panel);
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new cw0.n(this, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void d7() {
        zw0.b m47060xff04c82c;
        cw0.d dVar = (cw0.d) this.f150773i;
        if (dVar == null || (m47060xff04c82c = dVar.m47060xff04c82c()) == null) {
            return;
        }
        du0.v0 R6 = R6();
        R6.getClass();
        java.lang.String entryType = m47060xff04c82c.f558092d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entryType, "entryType");
        yy0.m7 m7Var = (yy0.m7) R6.O6();
        m7Var.getClass();
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.q1(m7Var, entryType, null), 3, null);
    }

    public void l7(java.lang.String requestId, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9 captionItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(captionItem, "captionItem");
    }

    public void m7(float f17) {
    }

    public void n7(float f17) {
    }

    public void o7(float f17) {
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        super.mo451xac79a11b();
        t7().f448270h.a();
        uu0.c e17 = uu0.c.e();
        uu0.j jVar = e17.f512743e;
        if (jVar == uu0.j.START || jVar == uu0.j.RESUME || jVar == uu0.j.ERROR) {
            e17.h(java.lang.Boolean.FALSE);
        }
        e17.f512756r = null;
        e17.f512757s = null;
    }

    public boolean p7() {
        return false;
    }

    public java.lang.Object q7(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return jz5.f0.f384359a;
    }

    public void r7(java.lang.String snapshotDesc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotDesc, "snapshotDesc");
    }

    public void s7(yz5.l action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
    }

    public final qu0.i t7() {
        return (qu0.i) ((jz5.n) this.f304187z).mo141623x754a37bb();
    }

    public ex0.c u7() {
        return null;
    }

    public ex0.r v7() {
        return null;
    }

    public ex0.o w7() {
        return null;
    }

    public ex0.q x7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        return null;
    }

    public java.util.List y7() {
        return null;
    }

    public final gx0.sc z7() {
        return (gx0.sc) ((jz5.n) this.f304176o).mo141623x754a37bb();
    }
}
