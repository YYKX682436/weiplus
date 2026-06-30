package tc4;

/* loaded from: classes4.dex */
public final class b4 extends tc4.v0 implements xd4.d {

    /* renamed from: y1, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 f498829y1;

    /* renamed from: z1, reason: collision with root package name */
    public final int[] f498830z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f498830z1 = new int[]{0, 0};
    }

    @Override // tc4.d2
    public boolean B() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableRepeatLoad", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableRepeatLoad", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // tc4.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object D(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r21) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.b4.D(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tc4.d2
    public java.lang.Object E(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        return bool;
    }

    @Override // tc4.v0
    public android.view.View Q(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee15 = this.f498829y1;
        if (viewOnLongClickListenerC18284x499dee15 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
            return viewOnLongClickListenerC18284x499dee15;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoView");
        throw null;
    }

    public final void T(android.view.ViewGroup.LayoutParams layoutParams) {
        xc4.p n17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 h17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateParam", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        zc4.b m166188xfb7e5820 = m166188xfb7e5820();
        if (m166188xfb7e5820 == null || (n17 = m166188xfb7e5820.n()) == null || (h17 = n17.h1()) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateParam", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
            return;
        }
        android.util.Pair l17 = m21.y.l(h17, getContext(), false);
        java.lang.Object first = l17.first;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first, "first");
        layoutParams.width = ((java.lang.Number) first).intValue();
        java.lang.Object second = l17.second;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(second, "second");
        layoutParams.height = ((java.lang.Number) second).intValue();
        x("MicroMsg.Improve.VideoFlexibleTimelineItem", "[" + m166175x75e04be9() + "]width:" + l17.first + " height:" + l17.second);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateParam", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
    }

    @Override // xd4.d
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder, int i17) {
        xc4.p n17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        zc4.b m166188xfb7e5820 = m166188xfb7e5820();
        if (m166188xfb7e5820 == null || (n17 = m166188xfb7e5820.n()) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
            return;
        }
        r45.jj4 R0 = n17.R0();
        if (R0 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
            return;
        }
        if (R0.f459389e == 8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.VideoFlexibleTimelineItem", "[" + m166175x75e04be9() + "]background video no auto play");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee15 = this.f498829y1;
        if (viewOnLongClickListenerC18284x499dee15 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoView");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15.m(viewOnLongClickListenerC18284x499dee15, false, false, false, 7, null);
        xd4.g.a().d(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
    }

    @Override // xd4.d
    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIPause", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee15 = this.f498829y1;
        if (viewOnLongClickListenerC18284x499dee15 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoView");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPlaying", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView");
        boolean z17 = viewOnLongClickListenerC18284x499dee15.f250765r;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPlaying", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView");
        viewOnLongClickListenerC18284x499dee15.k(!z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIPause", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // tc4.v0, tc4.i2, tc4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r12) {
        /*
            r11 = this;
            java.lang.String r0 = "onViewRecycled"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            boolean r2 = r12 instanceof tc4.a4
            if (r2 == 0) goto L1b
            r2 = r12
            tc4.a4 r2 = (tc4.a4) r2
            int r3 = r2.f498817g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f498817g = r3
            goto L20
        L1b:
            tc4.a4 r2 = new tc4.a4
            r2.<init>(r11, r12)
        L20:
            java.lang.Object r12 = r2.f498815e
            pz5.a r3 = pz5.a.f440719d
            int r4 = r2.f498817g
            r5 = 1
            if (r4 == 0) goto L3e
            if (r4 != r5) goto L33
            java.lang.Object r2 = r2.f498814d
            tc4.b4 r2 = (tc4.b4) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto L50
        L33:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r2)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            throw r12
        L3e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            r2.f498814d = r11
            r2.f498817g = r5
            java.lang.Object r12 = super.g(r2)
            if (r12 != r3) goto L4f
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r3
        L4f:
            r2 = r11
        L50:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r3 = "onViewRecycled id:"
            r12.<init>(r3)
            zc4.b r3 = r2.m166188xfb7e5820()
            r4 = 0
            if (r3 == 0) goto L6a
            xc4.p r3 = r3.n()
            if (r3 == 0) goto L6a
            java.lang.String r3 = r3.a1()
            goto L6b
        L6a:
            r3 = r4
        L6b:
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            java.lang.String r3 = "MicroMsg.Improve.VideoFlexibleTimelineItem"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r12)
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView r5 = r2.f498829y1
            if (r5 == 0) goto La2
            r6 = 1
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15.r(r5, r6, r7, r8, r9, r10)
            xd4.g r12 = xd4.g.a()
            r12.getClass()
            java.lang.String r3 = "viewRecycled"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r3, r4)
            java.util.Set r12 = r12.f535174a
            java.util.HashSet r12 = (java.util.HashSet) r12
            r12.remove(r2)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r4)
            jz5.f0 r12 = jz5.f0.f384359a
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r12
        La2:
            java.lang.String r12 = "videoView"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r12)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.b4.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // xd4.d
    /* renamed from: getDisplayRect */
    public android.graphics.Rect mo69493x4003fc90() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDisplayRect", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        int[] iArr = new int[2];
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee15 = this.f498829y1;
        if (viewOnLongClickListenerC18284x499dee15 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoView");
            throw null;
        }
        viewOnLongClickListenerC18284x499dee15.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        int i18 = iArr[1];
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee152 = this.f498829y1;
        if (viewOnLongClickListenerC18284x499dee152 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoView");
            throw null;
        }
        int measuredWidth = viewOnLongClickListenerC18284x499dee152.getMeasuredWidth();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee153 = this.f498829y1;
        if (viewOnLongClickListenerC18284x499dee153 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoView");
            throw null;
        }
        android.graphics.Rect rect = new android.graphics.Rect(i17, i18, measuredWidth + i17, viewOnLongClickListenerC18284x499dee153.getMeasuredHeight() + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayRect", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        return rect;
    }

    @Override // tc4.x1
    /* renamed from: getViewType */
    public int mo166166xc321a0f5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        return 38;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    @Override // tc4.v0, uc4.f1, tc4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(in5.s0 r20, zc4.b r21, int r22, boolean r23, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r24) {
        /*
            r19 = this;
            r6 = r19
            r0 = r24
            java.lang.String r7 = "onBindViewHolder"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r7, r8)
            boolean r1 = r0 instanceof tc4.z3
            if (r1 == 0) goto L1f
            r1 = r0
            tc4.z3 r1 = (tc4.z3) r1
            int r2 = r1.f499084h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1f
            int r2 = r2 - r3
            r1.f499084h = r2
            goto L24
        L1f:
            tc4.z3 r1 = new tc4.z3
            r1.<init>(r6, r0)
        L24:
            r5 = r1
            java.lang.Object r0 = r5.f499082f
            pz5.a r9 = pz5.a.f440719d
            int r1 = r5.f499084h
            java.lang.String r10 = "videoView"
            r2 = 1
            r11 = 0
            if (r1 == 0) goto L4d
            if (r1 != r2) goto L42
            java.lang.Object r1 = r5.f499081e
            zc4.b r1 = (zc4.b) r1
            java.lang.Object r2 = r5.f499080d
            tc4.b4 r2 = (tc4.b4) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r0)
            r12 = r1
            goto Lb3
        L42:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r8)
            throw r0
        L4d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r0)
            java.util.ArrayList r0 = uc4.f1.J(r19)
            java.util.Iterator r0 = r0.iterator()
        L58:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L69
            java.lang.Object r1 = r0.next()
            uc4.g r1 = (uc4.g) r1
            boolean r3 = r1 instanceof uc4.h1
            if (r3 == 0) goto L58
            goto L6a
        L69:
            r1 = r11
        L6a:
            if (r1 != 0) goto L96
            java.util.ArrayList r0 = r19.m167831x70c5fbc5()
            uc4.h1 r1 = new uc4.h1
            android.content.Context r3 = r19.getContext()
            java.lang.String r4 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r4)
            r1.<init>(r3)
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView r13 = r6.f498829y1
            if (r13 == 0) goto L92
            r14 = 0
            r15 = 1
            r16 = 0
            r17 = 10
            r18 = 0
            r12 = r1
            uc4.g.l(r12, r13, r14, r15, r16, r17, r18)
            r0.add(r1)
            goto L96
        L92:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r10)
            throw r11
        L96:
            r5.f499080d = r6
            r12 = r21
            r5.f499081e = r12
            r5.f499084h = r2
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            java.lang.Object r0 = super.h(r1, r2, r3, r4, r5)
            if (r0 != r9) goto Lb2
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r8)
            return r9
        Lb2:
            r2 = r6
        Lb3:
            com.tencent.mm.plugin.sns.ui.ai r0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bi.f249447c
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView r1 = r2.f498829y1
            if (r1 == 0) goto Lc6
            xc4.p r2 = r12.n()
            r0.e(r1, r2)
            jz5.f0 r0 = jz5.f0.f384359a
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r8)
            return r0
        Lc6:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.b4.h(in5.s0, zc4.b, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tc4.x1
    public jz5.l k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        this.f498829y1 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15(getContext());
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(0, 0);
        T(layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee15 = this.f498829y1;
        if (viewOnLongClickListenerC18284x499dee15 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoView");
            throw null;
        }
        jz5.l lVar = new jz5.l(viewOnLongClickListenerC18284x499dee15, layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        return lVar;
    }

    @Override // tc4.x1, tc4.s0
    /* renamed from: name */
    public java.lang.String mo70844x337a8b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        return "VideoFlexibleTimelineItem";
    }

    @Override // tc4.i2
    public void o() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        super.o();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee15 = this.f498829y1;
        if (viewOnLongClickListenerC18284x499dee15 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoView");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = viewOnLongClickListenerC18284x499dee15.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(layoutParams);
        T(layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee152 = this.f498829y1;
        if (viewOnLongClickListenerC18284x499dee152 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoView");
            throw null;
        }
        viewOnLongClickListenerC18284x499dee152.setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            int rawX = (int) motionEvent.getRawX();
            int[] iArr = this.f498830z1;
            iArr[0] = rawX;
            iArr[1] = (int) motionEvent.getRawY();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee15 = this.f498829y1;
            if (viewOnLongClickListenerC18284x499dee15 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoView");
                throw null;
            }
            viewOnLongClickListenerC18284x499dee15.setTag(com.p314xaae8f345.mm.R.id.ohu, iArr);
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        return onInterceptTouchEvent;
    }

    @Override // xd4.d
    /* renamed from: pause */
    public void mo69495x65825f6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pause", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee15 = this.f498829y1;
        if (viewOnLongClickListenerC18284x499dee15 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoView");
            throw null;
        }
        viewOnLongClickListenerC18284x499dee15.k(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pause", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
    }

    @Override // xd4.d
    /* renamed from: stop */
    public void mo69496x360802() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stop", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stop", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
    }
}
