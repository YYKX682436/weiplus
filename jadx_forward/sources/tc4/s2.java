package tc4;

/* loaded from: classes4.dex */
public final class s2 extends tc4.v0 {

    /* renamed from: y1, reason: collision with root package name */
    public pd4.b f498993y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // tc4.d2
    public boolean B() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableRepeatLoad", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        pd4.b bVar = this.f498993y1;
        boolean z18 = false;
        if (bVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAllImgViewAttached", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
            java.util.Iterator<T> it = bVar.m158270xf9bd9d24().iterator();
            while (true) {
                if (!it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAllImgViewAttached", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
                    z17 = true;
                    break;
                }
                android.view.View view = (android.view.View) it.next();
                if ((view instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17973x67e3e70e) && !((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17973x67e3e70e) view).m70599xcb16a3ea().E) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAllImgViewAttached", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
                    z17 = false;
                    break;
                }
            }
            if (z17) {
                z18 = true;
            }
        }
        boolean z19 = !z18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableRepeatLoad", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        return z19;
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // tc4.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object D(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r28) {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.s2.D(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tc4.d2
    public java.lang.Object E(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, new tc4.q2(null), interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        return g17;
    }

    @Override // tc4.v0
    public android.view.View Q(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        pd4.b bVar = this.f498993y1;
        android.view.View childAt = bVar != null ? bVar.getChildAt(i17) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        return childAt;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // tc4.v0, tc4.i2, tc4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "onViewRecycled"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            boolean r2 = r7 instanceof tc4.r2
            if (r2 == 0) goto L1b
            r2 = r7
            tc4.r2 r2 = (tc4.r2) r2
            int r3 = r2.f498984g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f498984g = r3
            goto L20
        L1b:
            tc4.r2 r2 = new tc4.r2
            r2.<init>(r6, r7)
        L20:
            java.lang.Object r7 = r2.f498982e
            pz5.a r3 = pz5.a.f440719d
            int r4 = r2.f498984g
            r5 = 1
            if (r4 == 0) goto L3e
            if (r4 != r5) goto L33
            java.lang.Object r2 = r2.f498981d
            tc4.s2 r2 = (tc4.s2) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L50
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r2)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            throw r7
        L3e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            r2.f498981d = r6
            r2.f498984g = r5
            java.lang.Object r7 = super.g(r2)
            if (r7 != r3) goto L4f
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r3
        L4f:
            r2 = r6
        L50:
            pd4.b r7 = r2.f498993y1
            if (r7 == 0) goto L6b
            java.lang.String r2 = "release"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r3)
            ku5.u0 r4 = ku5.t0.f394148d
            pd4.a r5 = new pd4.a
            r5.<init>(r7)
            ku5.t0 r4 = (ku5.t0) r4
            r4.g(r5)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
        L6b:
            jz5.f0 r7 = jz5.f0.f384359a
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.s2.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tc4.x1
    /* renamed from: getViewType */
    public int mo166166xc321a0f5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        return 36;
    }

    @Override // tc4.x1
    public jz5.l k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        if (this.f498993y1 == null) {
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            this.f498993y1 = new pd4.b(context);
        }
        java.util.List<r45.jj4> m166176x7efe73ec = m166176x7efe73ec();
        pd4.b bVar = this.f498993y1;
        if (bVar != null) {
            bVar.b(m166176x7efe73ec != null ? m166176x7efe73ec.size() : 0);
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(0, -2);
        layoutParams.f92424g = 0;
        pd4.b bVar2 = this.f498993y1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar2);
        jz5.l lVar = new jz5.l(bVar2, layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        return lVar;
    }

    @Override // tc4.x1, tc4.s0
    /* renamed from: name */
    public java.lang.String mo70844x337a8b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MultiPhotoImproveTimelineItem-");
        java.util.List<r45.jj4> m166176x7efe73ec = m166176x7efe73ec();
        sb6.append(m166176x7efe73ec != null ? java.lang.Integer.valueOf(m166176x7efe73ec.size()) : null);
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        return sb7;
    }

    @Override // tc4.i2
    public void o() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        super.o();
        java.util.List<r45.jj4> m166176x7efe73ec = m166176x7efe73ec();
        pd4.b bVar = this.f498993y1;
        if (bVar != null) {
            bVar.b(m166176x7efe73ec != null ? m166176x7efe73ec.size() : 0);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("width:");
        pd4.b bVar2 = this.f498993y1;
        sb6.append(bVar2 != null ? java.lang.Integer.valueOf(bVar2.getWidth()) : null);
        sb6.append(" height:");
        pd4.b bVar3 = this.f498993y1;
        sb6.append(bVar3 != null ? java.lang.Integer.valueOf(bVar3.getHeight()) : null);
        x("MicroMsg.Improve.MultiPhotoTimelineItem", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        super.onDetachedFromWindow();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
    }
}
