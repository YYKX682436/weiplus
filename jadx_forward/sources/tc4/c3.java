package tc4;

/* loaded from: classes4.dex */
public final class c3 extends tc4.k2 {
    public static final /* synthetic */ int D1 = 0;
    public final jz5.g A1;
    public final jz5.g B1;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d C1;

    /* renamed from: x1, reason: collision with root package name */
    public android.view.View f498840x1;

    /* renamed from: y1, reason: collision with root package name */
    public final jz5.g f498841y1;

    /* renamed from: z1, reason: collision with root package name */
    public final jz5.g f498842z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f498841y1 = jz5.h.b(new tc4.w2(this));
        this.f498842z1 = jz5.h.b(new tc4.x2(this));
        this.A1 = jz5.h.b(new tc4.y2(this));
        this.B1 = jz5.h.b(new tc4.b3(this));
        final p012xc85e97e9.p093xedfae76a.y m166227x95c7fa5f = m166227x95c7fa5f();
        this.C1 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4>(m166227x95c7fa5f) { // from class: com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$musicPlayerListener$1
            {
                this.f39173x3fe91575 = -1155728636;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4) {
                tc4.c3 c3Var;
                com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18734x8eb4224a Q;
                xc4.p n17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$musicPlayerListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 event = c5722xb16ab0f4;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$musicPlayerListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                int i17 = event.f136045g.f88569b;
                if ((i17 == 0 || i17 == 1 || i17 == 2 || i17 == 3 || i17 == 4 || i17 == 7) && (Q = tc4.c3.Q((c3Var = tc4.c3.this))) != null) {
                    zc4.b m166188xfb7e5820 = c3Var.m166188xfb7e5820();
                    Q.a(true, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.wm.b((m166188xfb7e5820 == null || (n17 = m166188xfb7e5820.n()) == null) ? null : n17.h1()));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$musicPlayerListener$1");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$musicPlayerListener$1");
                return false;
            }
        };
    }

    public static final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18734x8eb4224a Q(tc4.c3 c3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMusicView", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18734x8eb4224a m166171x16af73b4 = c3Var.m166171x16af73b4();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMusicView", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        return m166171x16af73b4;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v5 java.lang.String, still in use, count: 2, list:
          (r6v5 java.lang.String) from 0x0053: IF  (r6v5 java.lang.String) == (null java.lang.String)  -> B:65:0x0055 A[HIDDEN]
          (r6v5 java.lang.String) from 0x0056: PHI (r6v8 java.lang.String) = (r6v5 java.lang.String), (r6v7 java.lang.String), (r6v31 java.lang.String) binds: [B:69:0x0053, B:65:0x0055, B:13:0x004a] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:53)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:40)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void R(tc4.c3 r11, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 r12, r45.jj4 r13, bw5.v70 r14) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.c3.R(tc4.c3, com.tencent.mm.protocal.protobuf.TimeLineObject, r45.jj4, bw5.v70):void");
    }

    /* renamed from: getMusicMvRoot */
    private final android.view.View m166170x19f4377a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMusicMvRoot", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        android.view.View view = (android.view.View) ((jz5.n) this.f498841y1).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMusicMvRoot", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        return view;
    }

    /* renamed from: getMusicView */
    private final com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18734x8eb4224a m166171x16af73b4() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMusicView", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18734x8eb4224a c18734x8eb4224a = (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18734x8eb4224a) ((jz5.n) this.f498842z1).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMusicView", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        return c18734x8eb4224a;
    }

    /* renamed from: getMusicViewContainer */
    private final android.view.ViewGroup m166172x1e98e32d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMusicViewContainer", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.A1).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMusicViewContainer", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        return viewGroup;
    }

    /* renamed from: getRoot */
    private final android.view.ViewGroup m166173xfb84e958() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRoot", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.B1).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRoot", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        return viewGroup;
    }

    @Override // tc4.d2
    public boolean B() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableRepeatLoad", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableRepeatLoad", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        return true;
    }

    @Override // tc4.d2
    public java.lang.Object E(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, new tc4.v2(this, null), interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        return g17;
    }

    public final void S(int i17, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18734x8eb4224a m166171x16af73b4;
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateMusicViewWidth", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        if (viewGroup == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateMusicViewWidth", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
        android.view.ViewGroup.LayoutParams layoutParams4 = null;
        if (!(layoutParams3 != null && layoutParams3.width == i17)) {
            android.view.ViewGroup.LayoutParams layoutParams5 = viewGroup.getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.width = i17;
            } else {
                layoutParams5 = null;
            }
            viewGroup.setLayoutParams(layoutParams5);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18734x8eb4224a m166171x16af73b42 = m166171x16af73b4();
        if (!((m166171x16af73b42 == null || (layoutParams2 = m166171x16af73b42.getLayoutParams()) == null || layoutParams2.width != i17) ? false : true) && (m166171x16af73b4 = m166171x16af73b4()) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18734x8eb4224a m166171x16af73b43 = m166171x16af73b4();
            if (m166171x16af73b43 != null && (layoutParams = m166171x16af73b43.getLayoutParams()) != null) {
                layoutParams.width = i17;
                layoutParams4 = layoutParams;
            }
            m166171x16af73b4.setLayoutParams(layoutParams4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateMusicViewWidth", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // tc4.i2, tc4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "onViewRecycled"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            boolean r2 = r8 instanceof tc4.a3
            if (r2 == 0) goto L1b
            r2 = r8
            tc4.a3 r2 = (tc4.a3) r2
            int r3 = r2.f498813g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f498813g = r3
            goto L20
        L1b:
            tc4.a3 r2 = new tc4.a3
            r2.<init>(r7, r8)
        L20:
            java.lang.Object r8 = r2.f498811e
            pz5.a r3 = pz5.a.f440719d
            int r4 = r2.f498813g
            jz5.f0 r5 = jz5.f0.f384359a
            r6 = 1
            if (r4 == 0) goto L40
            if (r4 != r6) goto L35
            java.lang.Object r2 = r2.f498810d
            tc4.c3 r2 = (tc4.c3) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L51
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r2)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            throw r8
        L40:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            r2.f498810d = r7
            r2.f498813g = r6
            super.g(r2)
            if (r5 != r3) goto L50
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r3
        L50:
            r2 = r7
        L51:
            com.tencent.mm.sdk.event.IListener r8 = r2.C1
            r8.mo48814x2efc64()
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.c3.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tc4.x1
    /* renamed from: getViewType */
    public int mo166166xc321a0f5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        return 24;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @Override // uc4.f1, tc4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(in5.s0 r18, zc4.b r19, int r20, boolean r21, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r22) {
        /*
            r17 = this;
            r6 = r17
            r0 = r22
            java.lang.String r7 = "onBindViewHolder"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r7, r8)
            boolean r1 = r0 instanceof tc4.z2
            if (r1 == 0) goto L1f
            r1 = r0
            tc4.z2 r1 = (tc4.z2) r1
            int r2 = r1.f499079g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1f
            int r2 = r2 - r3
            r1.f499079g = r2
            goto L24
        L1f:
            tc4.z2 r1 = new tc4.z2
            r1.<init>(r6, r0)
        L24:
            r5 = r1
            java.lang.Object r0 = r5.f499077e
            pz5.a r9 = pz5.a.f440719d
            int r1 = r5.f499079g
            r2 = 1
            if (r1 == 0) goto L43
            if (r1 != r2) goto L38
            java.lang.Object r1 = r5.f499076d
            tc4.c3 r1 = (tc4.c3) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r0)
            goto L9f
        L38:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r8)
            throw r0
        L43:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r0)
            java.util.ArrayList r0 = uc4.f1.J(r17)
            java.util.Iterator r0 = r0.iterator()
        L4e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5f
            java.lang.Object r1 = r0.next()
            uc4.g r1 = (uc4.g) r1
            boolean r3 = r1 instanceof uc4.t0
            if (r3 == 0) goto L4e
            goto L60
        L5f:
            r1 = 0
        L60:
            if (r1 != 0) goto L86
            uc4.t0 r0 = new uc4.t0
            android.content.Context r1 = r17.getContext()
            java.lang.String r3 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r3)
            r0.<init>(r1)
            android.view.View r11 = r17.m166170x19f4377a()
            r12 = 0
            r13 = 1
            r14 = 0
            r15 = 10
            r16 = 0
            r10 = r0
            uc4.g.l(r10, r11, r12, r13, r14, r15, r16)
            java.util.ArrayList r1 = r17.m167831x70c5fbc5()
            r1.add(r0)
        L86:
            r5.f499076d = r6
            r5.f499079g = r2
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            java.lang.Object r0 = super.h(r1, r2, r3, r4, r5)
            if (r0 != r9) goto L9e
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r8)
            return r9
        L9e:
            r1 = r6
        L9f:
            com.tencent.mm.sdk.event.IListener r0 = r1.C1
            r0.mo48814x2efc64()
            com.tencent.mm.sdk.event.IListener r0 = r1.C1
            r0.mo48813x58998cd()
            jz5.f0 r0 = jz5.f0.f384359a
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.c3.h(in5.s0, zc4.b, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tc4.x1
    public jz5.l k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.csk, (android.view.ViewGroup) this, false);
        this.f498840x1 = inflate;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(0, -2);
        layoutParams.f92441s = 0;
        jz5.l lVar = new jz5.l(inflate, layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        return lVar;
    }

    @Override // tc4.x1, tc4.s0
    /* renamed from: name */
    public java.lang.String mo70844x337a8b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        return "MusicImproveTimelineItem";
    }

    @Override // tc4.i2
    public void r() {
        bw5.v70 c17;
        bw5.nb0 Bi;
        xc4.p n17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 h17;
        r45.a90 a90Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadAppNameView", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        zc4.b m166188xfb7e5820 = m166188xfb7e5820();
        r45.xs4 xs4Var = (m166188xfb7e5820 == null || (n17 = m166188xfb7e5820.n()) == null || (h17 = n17.h1()) == null || (a90Var = h17.f39014x86965dde) == null) ? null : a90Var.f451385w;
        if (xs4Var == null || xs4Var.m75939xb282bd08(18) <= 0 || (c17 = rk4.l5.c(xs4Var.m75945x2fec8307(19))) == null || (Bi = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Bi(c17)) == null) {
            super.r();
            m166212x741f2de4().invalidate();
            m166212x741f2de4().requestLayout();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadAppNameView", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
            return;
        }
        if (m166212x741f2de4() instanceof android.view.ViewStub) {
            android.widget.TextView l17 = tc4.x1.l(this, true, com.p314xaae8f345.mm.R.C30859x5a72f63.f561048a62, com.p314xaae8f345.mm.R.C30860x5b28f31.f561458j4, true, 0, 0, null, 112, null);
            l17.setEllipsize(android.text.TextUtils.TruncateAt.END);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, -2);
            layoutParams.setMargins(i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561204c8), 0, 0, 0);
            layoutParams.weight = 1.0f;
            android.view.View m166212x741f2de4 = m166212x741f2de4();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m166212x741f2de4, "null cannot be cast to non-null type android.view.ViewStub");
            pd4.d.a((android.view.ViewStub) m166212x741f2de4, l17, layoutParams);
            m166239xa84a158(l17);
        }
        java.lang.String string = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574914lg5, Bi.f112143s[9] ? Bi.f112139o : "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        android.text.SpannableString spannableString = new android.text.SpannableString(string);
        spannableString.setSpan(new tc4.u2(this, Bi), 0, spannableString.length(), 33);
        m166212x741f2de4().setClickable(true);
        m166212x741f2de4().setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p5());
        android.view.View m166212x741f2de42 = m166212x741f2de4();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m166212x741f2de42, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) m166212x741f2de42;
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView.setText(spannableString, android.widget.TextView.BufferType.SPANNABLE);
        textView.setContentDescription(spannableString);
        android.view.View m166212x741f2de43 = m166212x741f2de4();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m166212x741f2de43, "null cannot be cast to non-null type android.widget.TextView");
        ((android.widget.TextView) m166212x741f2de43).setTextColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f561048a62));
        android.view.View m166212x741f2de44 = m166212x741f2de4();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m166212x741f2de44, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/MusicImproveTimelineItem", "loadAppNameView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m166212x741f2de44.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m166212x741f2de44, "com/tencent/mm/plugin/sns/ui/improve/item/MusicImproveTimelineItem", "loadAppNameView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m166212x741f2de4().invalidate();
        m166212x741f2de4().requestLayout();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadAppNameView", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
    }
}
