package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class wn0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l implements kn2.d, kn2.c {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f196506p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f196507q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f196508r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f196509s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f196510t;

    /* renamed from: u, reason: collision with root package name */
    public qs5.s f196511u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f196512v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f196513w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap.KeySetView f196514x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f196506p = statusMonitor;
        this.f196507q = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.an0(root, this));
        this.f196508r = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qm0(root, this));
        this.f196509s = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rm0(root, this));
        this.f196511u = qs5.s.f447997d;
        this.f196514x = java.util.concurrent.ConcurrentHashMap.newKeySet();
        if (zl2.r4.f555483a.W1(S0())) {
            return;
        }
        dk2.ef efVar = dk2.ef.f314905a;
        if (dk2.ef.f314913e instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419) {
            return;
        }
        A1();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0 r12, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r13) {
        /*
            r12.getClass()
            boolean r0 = r13 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tm0
            if (r0 == 0) goto L16
            r0 = r13
            com.tencent.mm.plugin.finder.live.plugin.tm0 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tm0) r0
            int r1 = r0.f195966g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f195966g = r1
            goto L1b
        L16:
            com.tencent.mm.plugin.finder.live.plugin.tm0 r0 = new com.tencent.mm.plugin.finder.live.plugin.tm0
            r0.<init>(r12, r13)
        L1b:
            java.lang.Object r13 = r0.f195964e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f195966g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r12 = r0.f195963d
            xg2.h r12 = (xg2.h) r12
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L8a
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            java.lang.Object r12 = r0.f195963d
            com.tencent.mm.plugin.finder.live.plugin.wn0 r12 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0) r12
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L6b
        L41:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            az2.j r13 = r12.v1()
            android.view.ViewGroup r2 = r12.f446856d
            android.content.Context r6 = r2.getContext()
            java.lang.String r2 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r2)
            r7 = 0
            r8 = 0
            r10 = 6
            r11 = 0
            r5 = r13
            az2.j.u(r5, r6, r7, r8, r10, r11)
            kotlinx.coroutines.p0 r2 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r2 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            r0.f195963d = r12
            r0.f195966g = r4
            java.lang.Object r13 = xg2.g.b(r13, r2, r0)
            if (r13 != r1) goto L6b
            goto L8c
        L6b:
            xg2.h r13 = (xg2.h) r13
            boolean r2 = r13 instanceof xg2.i
            if (r2 == 0) goto L8a
            oz5.l r2 = r13.f535925a
            if (r2 != 0) goto L79
            oz5.l r2 = r0.mo48699x76847179()
        L79:
            com.tencent.mm.plugin.finder.live.plugin.sm0 r4 = new com.tencent.mm.plugin.finder.live.plugin.sm0
            r5 = 0
            r4.<init>(r13, r5, r12)
            r0.f195963d = r13
            r0.f195966g = r3
            java.lang.Object r12 = p3325xe03a0797.p3326xc267989b.l.g(r2, r4, r0)
            if (r12 != r1) goto L8a
            goto L8c
        L8a:
            jz5.f0 r1 = jz5.f0.f384359a
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0.t1(com.tencent.mm.plugin.finder.live.plugin.wn0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void A1() {
        if (this.f196510t) {
            return;
        }
        this.f196510t = true;
        ((mm2.f7) P0(mm2.f7.class)).f410593h.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ln0(this));
        ((mm2.s2) P0(mm2.s2.class)).f410938g.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mn0(this));
        ((mm2.s2) P0(mm2.s2.class)).f410939h.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nn0(this));
        ((mm2.f7) P0(mm2.f7.class)).f410594i.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.on0(this));
    }

    public boolean B1() {
        zl2.r4 r4Var = zl2.r4.f555483a;
        if (r4Var.w1() && !dk2.ef.f314905a.x()) {
            return r4Var.U1(S0());
        }
        return ((mm2.c1) P0(mm2.c1.class)).m7();
    }

    public boolean C1() {
        boolean z17 = ((mm2.c1) P0(mm2.c1.class)).Z5;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWishPanelPlug", "isInteractionWishSwitchEnable : " + z17);
        return z17;
    }

    public boolean D1() {
        r45.i82 i82Var = (r45.i82) ((mm2.f7) P0(mm2.f7.class)).f410591f.mo3195x754a37bb();
        return i82Var != null && i82Var.m75933x41a8a7f2(0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lm0.f194949a[status.ordinal()] == 1) {
            A1();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        this.f196510t = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void f1(float f17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u1() {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0.u1():void");
    }

    public final az2.j v1() {
        r45.uu1 uu1Var = new r45.uu1();
        uu1Var.set(1, db2.t4.f309704a.a(10069));
        android.content.Context context = this.f194857f.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        uu1Var.set(2, xy2.c.e(context));
        uu1Var.set(4, java.lang.Long.valueOf(((mm2.e1) P0(mm2.e1.class)).f410516m));
        gk2.e eVar = gk2.e.f354004n;
        uu1Var.set(3, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(eVar != null ? ((mm2.e1) eVar.a(mm2.e1.class)).f410518o : null));
        uu1Var.set(5, java.lang.Long.valueOf(((mm2.e1) P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
        if (((mm2.c1) P0(mm2.c1.class)).T) {
            r3 = 3;
        } else if (!((mm2.c1) P0(mm2.c1.class)).N7()) {
            r3 = (!((mm2.n0) P0(mm2.n0.class)).f410806r ? 0 : 1) != 0 ? 16 : 2;
        }
        uu1Var.set(6, java.lang.Integer.valueOf(r3));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 10069;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivegetrewardwishlist";
        lVar.f152197a = uu1Var;
        lVar.f152198b = new r45.vu1();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a17);
        return (az2.j) wi6;
    }

    public void w1(r45.c04 wishConfig, yz5.a onSuccess, yz5.q onFail) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wishConfig, "wishConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSuccess, "onSuccess");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onFail, "onFail");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWishPanelPlug", "createInteractionWish with callback: " + this.f196513w);
        if (C1()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.sn0(this, 1, wishConfig, onSuccess, onFail, null), 2, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWishPanelPlug", "createInteractionWish ignore as interactiveWish disable.");
            onFail.mo147xb9724478(null, null, null);
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.q x1() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.q) ((jz5.n) this.f196508r).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.x y1() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.x) ((jz5.n) this.f196509s).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 z1() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0) ((jz5.n) this.f196507q).mo141623x754a37bb();
    }
}
