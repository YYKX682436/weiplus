package tc4;

/* loaded from: classes4.dex */
public abstract class v0 extends tc4.k2 {

    /* renamed from: x1, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f499023x1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        final p012xc85e97e9.p093xedfae76a.y m166227x95c7fa5f = m166227x95c7fa5f();
        this.f499023x1 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5568xa650f04c>(m166227x95c7fa5f) { // from class: com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem$galleryPhotoInfoListener$1
            {
                this.f39173x3fe91575 = 1036677180;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r22v1 */
            /* JADX WARN: Type inference failed for: r22v2 */
            /* JADX WARN: Type inference failed for: r22v3 */
            /* JADX WARN: Type inference failed for: r22v4 */
            /* JADX WARN: Type inference failed for: r22v5 */
            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5568xa650f04c c5568xa650f04c) {
                int[] iArr;
                android.view.View view;
                ?? r222;
                xc4.p n17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem$galleryPhotoInfoListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5568xa650f04c event = c5568xa650f04c;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem$galleryPhotoInfoListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                tc4.v0 v0Var = tc4.v0.this;
                zc4.b m166188xfb7e5820 = v0Var.m166188xfb7e5820();
                java.lang.String W0 = (m166188xfb7e5820 == null || (n17 = m166188xfb7e5820.n()) == null) ? "" : n17.W0();
                am.ie ieVar = event.f135888g;
                boolean z17 = false;
                if (android.text.TextUtils.isEmpty(ieVar.f88481d)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem$galleryPhotoInfoListener$1");
                } else if (ieVar.f88481d.equals(W0)) {
                    int i17 = ieVar.f88479b;
                    int i18 = ieVar.f88482e;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getPhotoInfo", "com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPhotoInfo", "com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewPosition", "com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem");
                    android.view.View Q = v0Var.Q(i17);
                    int[] iArr2 = new int[2];
                    if (Q != null) {
                        Q.getLocationOnScreen(iArr2);
                    }
                    if (i18 == 1) {
                        iArr = iArr2;
                        view = Q;
                        r222 = true;
                        if (view != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList.add(4);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/ImprovePositionTimelineItem", "getViewPosition", "(II)Lkotlin/Pair;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/improve/item/ImprovePositionTimelineItem", "getViewPosition", "(II)Lkotlin/Pair;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            r222 = true;
                        }
                    } else if (i18 == 2 && Q != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        r222 = 1;
                        iArr = iArr2;
                        yj0.a.d(Q, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/ImprovePositionTimelineItem", "getViewPosition", "(II)Lkotlin/Pair;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        Q.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        view = Q;
                        yj0.a.f(Q, "com/tencent/mm/plugin/sns/ui/improve/item/ImprovePositionTimelineItem", "getViewPosition", "(II)Lkotlin/Pair;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        r222 = 1;
                        iArr = iArr2;
                        view = Q;
                    }
                    int width = view != null ? view.getWidth() : 0;
                    int height = view != null ? view.getHeight() : 0;
                    v0Var.x("MicroMsg.Improve.BasePositionTimelineItem", "position:" + i17 + " location:" + iArr[0] + ' ' + iArr[r222] + " width:" + width + " height:" + height + " status:" + i18);
                    android.graphics.Point point = new android.graphics.Point(iArr[0], iArr[r222]);
                    android.util.Size size = new android.util.Size(width, height);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewPosition", "com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem");
                    int i19 = point.x;
                    am.je jeVar = event.f135889h;
                    jeVar.f88560a = i19;
                    jeVar.f88561b = point.y;
                    jeVar.f88562c = size.getWidth();
                    jeVar.f88563d = size.getHeight();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPhotoInfo", "com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getPhotoInfo", "com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem$galleryPhotoInfoListener$1");
                    z17 = r222;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem$galleryPhotoInfoListener$1");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem$galleryPhotoInfoListener$1");
                return z17;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object R(tc4.v0 r9, in5.s0 r10, zc4.b r11, int r12, boolean r13, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r14) {
        /*
            java.lang.String r0 = "onBindViewHolder$suspendImpl"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            boolean r2 = r14 instanceof tc4.t0
            if (r2 == 0) goto L1b
            r2 = r14
            tc4.t0 r2 = (tc4.t0) r2
            int r3 = r2.f498999g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f498999g = r3
            goto L20
        L1b:
            tc4.t0 r2 = new tc4.t0
            r2.<init>(r9, r14)
        L20:
            r8 = r2
            java.lang.Object r14 = r8.f498997e
            pz5.a r2 = pz5.a.f440719d
            int r3 = r8.f498999g
            r4 = 1
            if (r3 == 0) goto L3f
            if (r3 != r4) goto L34
            java.lang.Object r9 = r8.f498996d
            tc4.v0 r9 = (tc4.v0) r9
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L55
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            throw r9
        L3f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            r8.f498996d = r9
            r8.f498999g = r4
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            java.lang.Object r10 = super.h(r4, r5, r6, r7, r8)
            if (r10 != r2) goto L55
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r2
        L55:
            com.tencent.mm.sdk.event.IListener r9 = r9.f499023x1
            r9.mo48813x58998cd()
            jz5.f0 r9 = jz5.f0.f384359a
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.v0.R(tc4.v0, in5.s0, zc4.b, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object S(tc4.v0 r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            java.lang.String r0 = "onViewRecycled$suspendImpl"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            boolean r2 = r8 instanceof tc4.u0
            if (r2 == 0) goto L1b
            r2 = r8
            tc4.u0 r2 = (tc4.u0) r2
            int r3 = r2.f499014g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f499014g = r3
            goto L20
        L1b:
            tc4.u0 r2 = new tc4.u0
            r2.<init>(r7, r8)
        L20:
            java.lang.Object r8 = r2.f499012e
            pz5.a r3 = pz5.a.f440719d
            int r4 = r2.f499014g
            jz5.f0 r5 = jz5.f0.f384359a
            r6 = 1
            if (r4 == 0) goto L40
            if (r4 != r6) goto L35
            java.lang.Object r7 = r2.f499011d
            tc4.v0 r7 = (tc4.v0) r7
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L50
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            throw r7
        L40:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            r2.f499011d = r7
            r2.f499014g = r6
            super.g(r2)
            if (r5 != r3) goto L50
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r3
        L50:
            com.tencent.mm.sdk.event.IListener r7 = r7.f499023x1
            r7.mo48814x2efc64()
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.v0.S(tc4.v0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public abstract android.view.View Q(int i17);

    @Override // tc4.i2, tc4.s0
    public java.lang.Object g(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem");
        java.lang.Object S = S(this, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem");
        return S;
    }

    @Override // uc4.f1, tc4.s0
    public java.lang.Object h(in5.s0 s0Var, zc4.b bVar, int i17, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem");
        java.lang.Object R = R(this, s0Var, bVar, i17, z17, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem");
        return R;
    }
}
