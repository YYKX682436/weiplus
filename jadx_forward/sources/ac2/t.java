package ac2;

/* loaded from: classes2.dex */
public final class t extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj {
    public final java.lang.String A;
    public final java.lang.String B;
    public boolean C;
    public jz5.l D;
    public ac2.y E;
    public final java.util.List F;
    public long G;
    public long H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f84589J;
    public long K;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15272xcb1f133d L;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.w2 M;
    public long N;
    public long P;
    public cw2.ea Q;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f R;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.w2 S;
    public long T;
    public boolean U;
    public final java.util.Map V;
    public final java.util.Set W;

    /* renamed from: y, reason: collision with root package name */
    public final long f84590y;

    /* renamed from: z, reason: collision with root package name */
    public long f84591z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, long j17, long j18, java.lang.String str) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f84590y = j17;
        this.f84591z = j18;
        this.A = str;
        this.B = "FinderNativeDramaTimelineContract";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Presenter init nativeDramaId=");
        sb6.append(pm0.v.u(j17));
        sb6.append(" selectObjectId=");
        sb6.append(pm0.v.u(this.f84591z));
        sb6.append(" hasSessionBuffer=");
        sb6.append(true ^ (str == null || str.length() == 0));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNativeDramaTimelineContract", sb6.toString());
        this.F = new java.util.ArrayList();
        this.G = -1L;
        this.H = -1L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        this.f84589J = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209325kd).mo141623x754a37bb()).r()).booleanValue();
        this.V = new java.util.LinkedHashMap();
        this.W = new java.util.LinkedHashSet();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public void C() {
        ac2.y yVar = this.E;
        if (yVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.B, "loadMore waitCountDownAtFeed " + yVar.f84602u + " hasLoadFirstPage " + this.C);
            if (!this.C) {
                yVar.o().N(0);
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = this.f188103t;
        if (abstractC13919x46aff122 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56346x54c164a7(abstractC13919x46aff122, false, 1, null);
        }
    }

    public final void C0(java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f187954d;
        if (abstractActivityC21394xb3d2c0cf.isDestroyed() || abstractActivityC21394xb3d2c0cf.isFinishing()) {
            return;
        }
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(abstractActivityC21394xb3d2c0cf);
        e4Var.f293309c = text;
        e4Var.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 r9) {
        /*
            r8 = this;
            com.tencent.mm.ui.MMActivity r0 = r8.f187954d
            boolean r1 = r0.isDestroyed()
            if (r1 != 0) goto L73
            boolean r1 = r0.isFinishing()
            if (r1 == 0) goto Lf
            goto L73
        Lf:
            boolean r1 = r8.f84589J
            r2 = 2131781464(0x7f106758, float:1.9194542E38)
            if (r1 == 0) goto L23
            java.lang.String r9 = r0.getString(r2)
            java.lang.String r0 = "getString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r9, r0)
            r8.C0(r9)
            goto L66
        L23:
            com.tencent.mm.plugin.finder.view.w2 r0 = r8.S
            if (r0 == 0) goto L66
            r1 = 2131315338(0x7f094a8a, float:1.8249126E38)
            android.view.View r0 = r0.findViewById(r1)
            com.tencent.mm.plugin.finder.view.FinderCountDownTextView r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15272xcb1f133d) r0
            if (r0 == 0) goto L66
            int r1 = r0.tempWordingResId
            r3 = 1
            if (r1 == 0) goto L47
            long r4 = r0.remainTimeMs
            long r6 = r0.showTempWordingUntilTime
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L47
            r4 = 0
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L47
            r1 = r3
            goto L48
        L47:
            r1 = 0
        L48:
            if (r1 != 0) goto L4e
            r1 = 3
            r8.w0(r3, r1, r9)
        L4e:
            ac2.s r1 = new ac2.s
            r1.<init>(r8, r9)
            r0.m61977x7fd1afa(r1)
            long r3 = r0.remainTimeMs
            r5 = 1500(0x5dc, double:7.41E-321)
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 <= 0) goto L66
            r0.tempWordingResId = r2
            long r3 = r3 - r5
            r0.showTempWordingUntilTime = r3
            r0.c()
        L66:
            com.tencent.mm.plugin.finder.feed.i0 r9 = r8.f187957g
            if (r9 == 0) goto L73
            com.tencent.mm.view.RefreshLoadMoreLayout r9 = r9.o()
            if (r9 == 0) goto L73
            hc2.f1.x(r9)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ac2.t.D0(com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }

    public final void E0() {
        android.view.ViewStub viewStub;
        java.util.List m56387xe6796cde;
        ac2.y yVar = this.E;
        if (yVar == null || yVar.f84602u == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = this.f188103t;
        int i17 = -1;
        if (abstractC13919x46aff122 != null && (m56387xe6796cde = abstractC13919x46aff122.m56387xe6796cde()) != null) {
            java.util.Iterator it = m56387xe6796cde.iterator();
            int i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((so2.j5) it.next(), yVar.f84602u)) {
                    i17 = i18;
                    break;
                }
                i18++;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNativeDramaTimelineContract", "showFeedAfterPromotion " + i17);
        yVar.f84602u = null;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = yVar.f188501d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ac2.g gVar = (ac2.g) pf5.z.f435481a.a(activity).a(ac2.g.class);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = gVar.f84559d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = c1163xf1deaba4 != null ? c1163xf1deaba4.p0(i17) : null;
        android.view.View view = p07 != null ? p07.f3639x46306858 : null;
        if (view != null && (viewStub = (android.view.ViewStub) view.findViewById(com.p314xaae8f345.mm.R.id.skr)) != null) {
            viewStub.inflate();
        }
        android.view.View findViewById = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.tbo) : null;
        if (findViewById != null) {
            gVar.f84562g = new ac2.f(gVar, p07, findViewById, findViewById);
            android.view.ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(gVar.f84562g);
            }
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = yVar.o().m82555x4905e9fa().getLayoutManager();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) layoutManager : null;
        if (c15415x74224fd8 != null) {
            c15415x74224fd8.C = true;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public void G(ym5.s3 reason) {
        ac2.y yVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        if (!reason.f545054f || (yVar = this.E) == null) {
            return;
        }
        yVar.v(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if ((r2 == null || r2.length() == 0) != false) goto L23;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void P() {
        /*
            r40 = this;
            r0 = r40
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader r1 = r0.f188103t
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineFeedLoader"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r1, r2)
            com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineFeedLoader r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.C13721x95edc87c) r1
            boolean r2 = r0.C
            if (r2 != 0) goto Lb8
            ac2.z r2 = r1.f186827i
            long r3 = r2.f84607d
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L2e
            java.lang.String r2 = r2.f84610g
            if (r2 == 0) goto L29
            int r2 = r2.length()
            if (r2 != 0) goto L27
            goto L29
        L27:
            r2 = r4
            goto L2a
        L29:
            r2 = r5
        L2a:
            if (r2 == 0) goto L2e
            goto Lb8
        L2e:
            long r2 = r0.f84591z
            ac2.z r1 = r1.f186827i
            java.lang.String r1 = r1.f84610g
            java.lang.String r9 = ""
            int r10 = r0.f187955e
            r11 = 2
            java.lang.String r12 = ""
            r13 = 1
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            if (r1 != 0) goto L46
            java.lang.String r1 = ""
        L46:
            r21 = r1
            com.tencent.mm.ui.MMActivity r1 = r0.f187954d
            java.lang.String r6 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r6)
            pf5.z r6 = pf5.z.f435481a
            pf5.v r6 = r6.a(r1)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class
            androidx.lifecycle.c1 r6 = r6.a(r7)
            com.tencent.mm.plugin.finder.viewmodel.component.ny r6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) r6
            if (r6 == 0) goto L64
            r45.qt2 r6 = r6.V6()
            goto L65
        L64:
            r6 = 0
        L65:
            r22 = r6
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r45.tj2 r6 = new r45.tj2
            r37 = r6
            r6.<init>()
            java.lang.String r7 = r0.A
            r6.set(r5, r7)
            long r7 = r0.f84590y
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            r6.set(r4, r5)
            r38 = 268423104(0xfffcfc0, float:2.5224964E-29)
            r39 = 0
            db2.g4 r4 = new db2.g4
            r6 = r4
            r19 = 0
            r20 = 0
            r7 = r2
            r6.<init>(r7, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            pq5.g r4 = r4.l()
            r4.f(r1)
            ac2.j r1 = new ac2.j
            r1.<init>(r0, r2)
            r4.h(r1)
            goto Lbf
        Lb8:
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader r1 = r0.f188103t
            if (r1 == 0) goto Lbf
            r1.mo56155xd210094c()
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ac2.t.P():void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj
    public void V() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj
    public void X(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 model, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.gj viewCallback) {
        ac2.y yVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewCallback, "viewCallback");
        super.X(model, viewCallback);
        this.E = viewCallback instanceof ac2.y ? (ac2.y) viewCallback : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = this.f188103t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractC13919x46aff122, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineFeedLoader");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.C13721x95edc87c c13721x95edc87c = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.C13721x95edc87c) abstractC13919x46aff122;
        ac2.y yVar2 = this.E;
        if (yVar2 != null) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = yVar2.f188501d;
            android.view.View findViewById = abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.lbi);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            yVar2.f84600s = findViewById;
            android.view.View findViewById2 = abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.m2d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
            yVar2.f84601t = findViewById2;
        }
        ac2.z zVar = c13721x95edc87c.f186827i;
        c13721x95edc87c.f186830o = p0(zVar.f84610g, zVar.f84607d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56345x587162dc(c13721x95edc87c, false, 1, null);
        if (c13721x95edc87c.m56387xe6796cde().isEmpty() && (yVar = this.E) != null) {
            yVar.C();
        }
        c13721x95edc87c.f186831p = new ac2.i(c13721x95edc87c, this);
    }

    public final void Z() {
        cw2.ea eaVar = this.Q;
        if (eaVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.R;
            if (c15196x85976f5f != null) {
                c15196x85976f5f.T(eaVar);
            }
            this.Q = null;
        }
        this.R = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8
    public boolean e0() {
        ac2.y yVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.w2 w2Var = this.M;
        boolean z17 = false;
        if (w2Var != null && w2Var.isShowing()) {
            z17 = true;
        }
        if (z17 && (yVar = this.E) != null) {
            yVar.f84603v = true;
        }
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public boolean g() {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 o17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var = this.f187957g;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = (i0Var == null || (o17 = i0Var.o()) == null || (m82555x4905e9fa = o17.m82555x4905e9fa()) == null) ? null : m82555x4905e9fa.getLayoutManager();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) layoutManager : null;
        if (c15415x74224fd8 == null) {
            return true;
        }
        java.lang.Object a07 = kz5.n0.a0(y(), c15415x74224fd8.w());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = a07 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) a07 : null;
        return abstractC14490x69736cb5 == null || !abstractC14490x69736cb5.getFeedObject().m59319xdd99097b() || abstractC14490x69736cb5.getNativeDramaUnlockCountDownFinish();
    }

    public final void i0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.w2 w2Var = this.M;
        if (w2Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.B, "pause/dismiss showPromotionCountDownToast, reason=" + str + " hostFeedId=" + pm0.v.u(this.P));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15272xcb1f133d c15272xcb1f133d = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15272xcb1f133d) w2Var.findViewById(com.p314xaae8f345.mm.R.id.ukc);
            if (c15272xcb1f133d != null) {
                c15272xcb1f133d.a();
            }
            if (w2Var.isShowing()) {
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f187954d;
                if (!abstractActivityC21394xb3d2c0cf.isDestroyed() && !abstractActivityC21394xb3d2c0cf.isFinishing()) {
                    w2Var.dismiss();
                }
            }
        }
        this.M = null;
        this.P = 0L;
        this.N = 0L;
        ac2.y yVar = this.E;
        if (yVar == null) {
            return;
        }
        yVar.f84603v = false;
    }

    public final void j0(float f17) {
        android.view.View decorView;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.w2 w2Var = this.M;
        if (w2Var != null && w2Var.isShowing()) {
            if (f17 >= 1.0f) {
                w2Var.b(true);
            } else {
                w2Var.b(false);
                android.view.Window window = w2Var.getWindow();
                if (window != null) {
                    ug5.x.e(window, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
                }
            }
            android.view.Window window2 = w2Var.getWindow();
            if (window2 == null || (decorView = window2.getDecorView()) == null) {
                return;
            }
            android.view.ViewPropertyAnimator animate = decorView.animate();
            if (animate != null) {
                animate.cancel();
            }
            android.view.ViewPropertyAnimator animate2 = decorView.animate();
            if (animate2 == null || (alpha = animate2.alpha(f17)) == null || (duration = alpha.setDuration(200L)) == null) {
                return;
            }
            duration.start();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public void m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, db5.g4 menu, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 sheet, in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sheet, "sheet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.m(feed, menu, sheet, holder);
        menu.removeItem(305);
        menu.removeItem(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54461xcc044630);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0190  */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29, types: [com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager] */
    /* JADX WARN: Type inference failed for: r6v46 */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o0(in5.s0 r34, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 r35) {
        /*
            Method dump skipped, instructions count: 2071
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ac2.t.o0(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0, fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        super.mo979x3f5eee52();
        Z();
        i0("onDetach");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15272xcb1f133d c15272xcb1f133d = this.L;
        if (c15272xcb1f133d != null) {
            c15272xcb1f133d.a();
        }
        this.L = null;
        this.K = 0L;
        this.E = null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 p0(java.lang.String exportId, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17;
        if (exportId == null || exportId.length() == 0) {
            if (j17 == 0 || (h17 = bu2.j.f106067a.h(j17)) == null) {
                return null;
            }
            return cu2.u.f303974a.p(h17);
        }
        zr2.d a17 = zr2.d.f556713b.a(39, false);
        if (a17 == null) {
            return null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exportId, "exportId");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) a17.f556715a.get(exportId);
        if (c19792x256d2725 != null) {
            return cu2.u.f303974a.p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 0));
        }
        return null;
    }

    public final java.util.List u0(java.util.List list) {
        r45.wx4 wx4Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            so2.j5 j5Var = (so2.j5) it.next();
            if (!(j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) || ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().m59319xdd99097b()) {
                wx4Var = null;
            } else {
                wx4Var = new r45.wx4();
                wx4Var.set(0, java.lang.Long.valueOf(j5Var.mo2128x1ed62e84()));
                java.lang.Long l17 = (java.lang.Long) ((java.util.LinkedHashMap) this.V).get(java.lang.Long.valueOf(j5Var.mo2128x1ed62e84()));
                wx4Var.set(1, java.lang.Long.valueOf(l17 != null ? l17.longValue() : 0L));
            }
            if (wx4Var != null) {
                arrayList.add(wx4Var);
            }
        }
        return kz5.n0.V0(arrayList);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public java.lang.String v() {
        return this.B;
    }

    public final void w0(int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        r45.bn2 promotionDramaInfo = abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.getPromotionDramaInfo() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f187954d;
        jz5.l[] lVarArr = new jz5.l[6];
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L));
        lVarArr[1] = new jz5.l("native_drama_id", pm0.v.u(this.f84590y));
        lVarArr[2] = new jz5.l("native_drama_item_num", promotionDramaInfo != null ? java.lang.Integer.valueOf(promotionDramaInfo.m75939xb282bd08(2)) : null);
        lVarArr[3] = new jz5.l("previous_native_drama_feed_id", pm0.v.u(abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.getPromotionFromObjectId() : 0L));
        lVarArr[4] = new jz5.l("switch_drama_toast_type", java.lang.Integer.valueOf(i18));
        lVarArr[5] = new jz5.l("drama_toast_type", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.e(d2Var, abstractActivityC21394xb3d2c0cf, "native_drama_ad_count_down_toast", "native_drama_toast_switch", 0, kz5.c1.k(lVarArr), 8, null);
    }

    public final void x0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209156bd).mo141623x754a37bb()).r()).booleanValue()) {
            C0(str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.B, str);
    }
}
