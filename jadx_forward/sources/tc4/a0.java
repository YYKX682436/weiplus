package tc4;

/* loaded from: classes4.dex */
public final class a0 extends tc4.v0 implements xd4.d {
    public static final /* synthetic */ int P1 = 0;
    public final jz5.g A1;
    public final jz5.g B1;
    public final jz5.g C1;
    public final jz5.g D1;
    public final jz5.g E1;
    public final jz5.g F1;
    public final jz5.g G1;
    public final jz5.g H1;
    public long I1;
    public long J1;
    public long K1;
    public c50.m0 L1;
    public boolean M1;
    public int N1;
    public boolean O1;

    /* renamed from: y1, reason: collision with root package name */
    public android.view.View f498803y1;

    /* renamed from: z1, reason: collision with root package name */
    public final jz5.g f498804z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f498804z1 = jz5.h.b(new tc4.z(this));
        this.A1 = jz5.h.b(new tc4.f(this));
        this.B1 = jz5.h.b(new tc4.q(this));
        this.C1 = jz5.h.b(new tc4.r(this));
        this.D1 = jz5.h.b(new tc4.o(this));
        this.E1 = jz5.h.b(new tc4.n(this));
        this.F1 = jz5.h.b(new tc4.p(this));
        this.G1 = jz5.h.b(new tc4.l(this));
        this.H1 = jz5.h.b(new tc4.m(this));
    }

    public static final /* synthetic */ android.view.View T(tc4.a0 a0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getFinderLiveView$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        android.view.View view = a0Var.f498803y1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getFinderLiveView$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return view;
    }

    public static final /* synthetic */ android.view.View U(tc4.a0 a0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getFinderLivingUI", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        android.view.View m166163xf8706a39 = a0Var.m166163xf8706a39();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getFinderLivingUI", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return m166163xf8706a39;
    }

    /* renamed from: getBansTv */
    private final android.widget.TextView m166157x11dcb2dc() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBansTv", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.A1).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBansTv", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return textView;
    }

    /* renamed from: getFinderLiveBottomArea */
    private final android.view.View m166158x8ca6eda0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFinderLiveBottomArea", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        android.view.View view = (android.view.View) ((jz5.n) this.G1).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderLiveBottomArea", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return view;
    }

    /* renamed from: getFinderLiveDesc */
    private final android.widget.TextView m166159xf824f0d9() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFinderLiveDesc", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.H1).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderLiveDesc", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return textView;
    }

    /* renamed from: getFinderLiveLongFeedTip */
    private final android.widget.TextView m166160x948a50b9() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFinderLiveLongFeedTip", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.E1).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderLiveLongFeedTip", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return textView;
    }

    /* renamed from: getFinderLiveLongFeedUI */
    private final android.view.View m166161xb2360296() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFinderLiveLongFeedUI", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        android.view.View view = (android.view.View) ((jz5.n) this.D1).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderLiveLongFeedUI", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return view;
    }

    /* renamed from: getFinderLivePlayerContainer */
    private final android.view.View m166162x8743cf58() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFinderLivePlayerContainer", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        android.view.View view = (android.view.View) ((jz5.n) this.F1).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderLivePlayerContainer", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return view;
    }

    /* renamed from: getFinderLivingUI */
    private final android.view.View m166163xf8706a39() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFinderLivingUI", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        android.view.View view = (android.view.View) ((jz5.n) this.B1).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderLivingUI", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return view;
    }

    /* renamed from: getFinderLivingUITip */
    private final android.widget.TextView m166164x21da87a2() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFinderLivingUITip", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.C1).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderLivingUITip", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return textView;
    }

    /* renamed from: getThumbImg */
    private final android.widget.ImageView m166165xd93f5383() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getThumbImg", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.f498804z1).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getThumbImg", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return imageView;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // tc4.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object E(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r12) {
        /*
            r11 = this;
            java.lang.String r0 = "loadCustomItemInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            boolean r2 = r12 instanceof tc4.s
            if (r2 == 0) goto L1b
            r2 = r12
            tc4.s r2 = (tc4.s) r2
            int r3 = r2.f498991i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f498991i = r3
            goto L20
        L1b:
            tc4.s r2 = new tc4.s
            r2.<init>(r11, r12)
        L20:
            java.lang.Object r12 = r2.f498989g
            pz5.a r3 = pz5.a.f440719d
            int r4 = r2.f498991i
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L4f
            if (r4 == r6) goto L3f
            if (r4 != r5) goto L34
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto Lc7
        L34:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r2)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            throw r12
        L3f:
            java.lang.Object r4 = r2.f498988f
            r45.g92 r4 = (r45.g92) r4
            java.lang.Object r6 = r2.f498987e
            xc4.p r6 = (xc4.p) r6
            java.lang.Object r8 = r2.f498986d
            tc4.a0 r8 = (tc4.a0) r8
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto L93
        L4f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            zc4.b r12 = r11.m166188xfb7e5820()
            if (r12 == 0) goto Lcd
            xc4.p r12 = r12.n()
            if (r12 != 0) goto L60
            goto Lcd
        L60:
            com.tencent.mm.protocal.protobuf.TimeLineObject r4 = r12.h1()
            r45.a90 r4 = r4.f39014x86965dde
            if (r4 == 0) goto L6b
            r45.g92 r4 = r4.f451381s
            goto L6c
        L6b:
            r4 = r7
        L6c:
            if (r4 != 0) goto L74
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r12
        L74:
            kotlinx.coroutines.p0 r8 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r8 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            tc4.t r9 = new tc4.t
            r9.<init>(r11, r4, r7)
            r2.f498986d = r11
            r2.f498987e = r12
            r2.f498988f = r4
            r2.f498991i = r6
            java.lang.Object r6 = p3325xe03a0797.p3326xc267989b.l.g(r8, r9, r2)
            if (r6 != r3) goto L8f
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r3
        L8f:
            r8 = r11
            r10 = r6
            r6 = r12
            r12 = r10
        L93:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto Lc7
            r2.f498986d = r7
            r2.f498987e = r7
            r2.f498988f = r7
            r2.f498991i = r5
            r8.getClass()
            java.lang.String r12 = "checkLiveStatus"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r12, r1)
            kotlinx.coroutines.p0 r5 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            tc4.i r9 = new tc4.i
            r9.<init>(r4, r8, r6, r7)
            java.lang.Object r2 = p3325xe03a0797.p3326xc267989b.l.g(r5, r9, r2)
            if (r2 != r3) goto Lbc
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r12, r1)
            goto Lc1
        Lbc:
            jz5.f0 r2 = jz5.f0.f384359a
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r12, r1)
        Lc1:
            if (r2 != r3) goto Lc7
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r3
        Lc7:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r12
        Lcd:
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.a0.E(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tc4.v0
    public android.view.View Q(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        android.view.View view = this.f498803y1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return view;
    }

    public final boolean V(android.widget.ImageView imageView, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkIsImageLoaded", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        if (imageView == null) {
            w("MicroMsg.Improve.FinderLiveTimelineItem", "notice!thumb view is null!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkIsImageLoaded", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            return false;
        }
        java.lang.Object tag = imageView.getTag(com.p314xaae8f345.mm.R.id.n8h);
        x("MicroMsg.Improve.FinderLiveTimelineItem", "checkIsImageLoaded[" + p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, str + i17) + "] last:" + tag + " current:$" + str + i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(i17);
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkIsImageLoaded", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return b17;
    }

    public final void W(boolean z17, r45.g92 g92Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkShowDesc", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        android.view.View m166158x8ca6eda0 = m166158x8ca6eda0();
        if (m166158x8ca6eda0 != null) {
            if (z17) {
                java.lang.String m75945x2fec8307 = g92Var.m75945x2fec8307(4);
                if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0) && ((r40.i) ((tc.e) i95.n0.c(tc.e.class))).Ai()) {
                    if (!(m166158x8ca6eda0.getBackground() instanceof m95.b)) {
                        m166158x8ca6eda0.setBackground(m95.a.e(getContext().getResources(), com.p314xaae8f345.mm.R.raw.f81098xa4b4a9ee, 0.0f));
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(m166158x8ca6eda0, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "checkShowDesc", "(ZLcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    m166158x8ca6eda0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(m166158x8ca6eda0, "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "checkShowDesc", "(ZLcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.widget.TextView m166159xf824f0d9 = m166159xf824f0d9();
                    if (m166159xf824f0d9 != null) {
                        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                        android.content.Context context = m166158x8ca6eda0.getContext();
                        java.lang.String m75945x2fec83072 = g92Var.m75945x2fec8307(4);
                        ((ke0.e) xVar).getClass();
                        m166159xf824f0d9.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, m75945x2fec83072));
                    }
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(m166158x8ca6eda0, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "checkShowDesc", "(ZLcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m166158x8ca6eda0.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(m166158x8ca6eda0, "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "checkShowDesc", "(ZLcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkShowDesc", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
    }

    public final tc4.x3 X(r45.g92 g92Var, r45.l71 l71Var) {
        r45.lw1 lw1Var;
        java.lang.String m75945x2fec8307;
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCoverUrl", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        tc4.x3 x3Var = new tc4.x3(null, null, 3, null);
        r45.d84 d84Var = l71Var != null ? (r45.d84) l71Var.m75936x14adae67(9) : null;
        boolean z17 = true;
        if (l71Var == null || (m75941xfb821914 = l71Var.m75941xfb821914(15)) == null) {
            lw1Var = null;
        } else {
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((r45.lw1) obj).m75939xb282bd08(5) == 2) {
                    break;
                }
            }
            lw1Var = (r45.lw1) obj;
        }
        java.lang.String m75945x2fec83072 = lw1Var != null ? lw1Var.m75945x2fec8307(0) : null;
        if (m75945x2fec83072 == null || m75945x2fec83072.length() == 0) {
            java.lang.String m75945x2fec83073 = d84Var != null ? d84Var.m75945x2fec8307(0) : null;
            if (m75945x2fec83073 == null || m75945x2fec83073.length() == 0) {
                java.lang.String m75945x2fec83074 = g92Var.m75945x2fec8307(5);
                if (m75945x2fec83074 == null || m75945x2fec83074.length() == 0) {
                    java.lang.String m75945x2fec83075 = g92Var.m75945x2fec8307(11);
                    if (m75945x2fec83075 != null && m75945x2fec83075.length() != 0) {
                        z17 = false;
                    }
                    if (!z17) {
                        java.lang.String m75945x2fec83076 = g92Var.m75945x2fec8307(11);
                        x3Var.d(m75945x2fec83076 != null ? m75945x2fec83076 : "");
                        x3Var.c(x3Var.b());
                    }
                } else {
                    java.lang.String m75945x2fec83077 = g92Var.m75945x2fec8307(5);
                    if (m75945x2fec83077 == null) {
                        m75945x2fec83077 = "";
                    }
                    x3Var.d(m75945x2fec83077);
                    java.lang.String url = x3Var.b();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeParam", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItemKt");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
                    java.util.regex.Pattern compile = java.util.regex.Pattern.compile("&?token=[^&]*");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
                    java.lang.String replaceAll = compile.matcher(url).replaceAll("");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeParam", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItemKt");
                    x3Var.c(replaceAll);
                }
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(d84Var != null ? d84Var.m75945x2fec8307(0) : null);
                java.lang.String m75945x2fec83078 = d84Var != null ? d84Var.m75945x2fec8307(1) : null;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (m75945x2fec83078 == null) {
                    m75945x2fec83078 = "";
                }
                sb6.append(m75945x2fec83078);
                x3Var.d(sb6.toString());
                m75945x2fec8307 = d84Var != null ? d84Var.m75945x2fec8307(0) : null;
                x3Var.c(m75945x2fec8307 != null ? m75945x2fec8307 : "");
            }
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(lw1Var != null ? lw1Var.m75945x2fec8307(0) : null);
            java.lang.String m75945x2fec83079 = lw1Var != null ? lw1Var.m75945x2fec8307(1) : null;
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (m75945x2fec83079 == null) {
                m75945x2fec83079 = "";
            }
            sb7.append(m75945x2fec83079);
            x3Var.d(sb7.toString());
            m75945x2fec8307 = lw1Var != null ? lw1Var.m75945x2fec8307(0) : null;
            x3Var.c(m75945x2fec8307 != null ? m75945x2fec8307 : "");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCoverUrl", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return x3Var;
    }

    public final boolean Y(r45.g92 g92Var, r45.nw1 nw1Var) {
        boolean Ni;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isLiveReplay", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        if (nw1Var != null) {
            Ni = ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).bj(g92Var.m75945x2fec8307(1), nw1Var);
        } else {
            Ni = ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Ni(g92Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLiveReplay", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return Ni;
    }

    public final void Z() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetThumbForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        android.widget.ImageView m166165xd93f5383 = m166165xd93f5383();
        if (m166165xd93f5383 != null) {
            m166165xd93f5383.setImageResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d);
        }
        android.widget.ImageView m166165xd93f53832 = m166165xd93f5383();
        if (m166165xd93f53832 != null) {
            m166165xd93f53832.setTag(com.p314xaae8f345.mm.R.id.n8h, "");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetThumbForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
    }

    public final void a0(android.widget.ImageView imageView, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLoadedImageTagAndClearOther", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        if (imageView != null) {
            imageView.setTag(com.p314xaae8f345.mm.R.id.n8h, str + i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLoadedImageTagAndClearOther", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public final void b0(r45.nw1 nw1Var, tc4.x3 x3Var, int i17, r45.g92 g92Var) {
        java.lang.String str;
        java.lang.String str2;
        ?? r57;
        java.lang.String str3;
        r45.co1 co1Var;
        r45.co1 co1Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showEndTag", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        x("MicroMsg.Improve.FinderLiveTimelineItem", "showEndTag flag:" + i17);
        android.view.View m166163xf8706a39 = m166163xf8706a39();
        if (m166163xf8706a39 == null) {
            str = "showEndTag";
            str2 = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem";
            r57 = 0;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            str = "showEndTag";
            str2 = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem";
            r57 = 0;
            yj0.a.d(m166163xf8706a39, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "showEndTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m166163xf8706a39.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m166163xf8706a39, "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "showEndTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View m166161xb2360296 = m166161xb2360296();
        if (m166161xb2360296 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf((int) r57));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(m166161xb2360296, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "showEndTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m166161xb2360296.setVisibility(((java.lang.Integer) arrayList2.get(r57)).intValue());
            yj0.a.f(m166161xb2360296, "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "showEndTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        W(r57, g92Var);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Gk(m166160x948a50b9(), true, i17, g92Var);
        if ((nw1Var == null || (co1Var2 = (r45.co1) nw1Var.m75936x14adae67(43)) == 0 || co1Var2.m75939xb282bd08(r57) != 1) ? r57 : true) {
            if (!V(m166165xd93f5383(), x3Var.a(), 1)) {
                x("MicroMsg.Improve.FinderLiveTimelineItem", "loadImage ban");
                i95.m c17 = i95.n0.c(vd2.i5.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                vd2.i5.Fb((vd2.i5) c17, x3Var.b(), m166165xd93f5383(), x3Var.a(), null, 8, null);
                a0(m166165xd93f5383(), x3Var.a(), 1);
            }
            android.widget.TextView m166157x11dcb2dc = m166157x11dcb2dc();
            if (m166157x11dcb2dc != null) {
                if (nw1Var == null || (co1Var = (r45.co1) nw1Var.m75936x14adae67(43)) == null || (str3 = co1Var.m75945x2fec8307(1)) == null) {
                    str3 = "";
                }
                m166157x11dcb2dc.setText(str3);
            }
            android.widget.TextView m166157x11dcb2dc2 = m166157x11dcb2dc();
            if (m166157x11dcb2dc2 != 0) {
                m166157x11dcb2dc2.setVisibility(r57);
            }
        } else {
            if (!V(m166165xd93f5383(), x3Var.a(), r57)) {
                x("MicroMsg.Improve.FinderLiveTimelineItem", "loadImage not ban");
                i95.m c18 = i95.n0.c(vd2.i5.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                vd2.i5.Ac((vd2.i5) c18, x3Var.b(), m166165xd93f5383(), x3Var.a(), null, 8, null);
                a0(m166165xd93f5383(), x3Var.a(), r57);
            }
            android.widget.TextView m166157x11dcb2dc3 = m166157x11dcb2dc();
            if (m166157x11dcb2dc3 != null) {
                m166157x11dcb2dc3.setVisibility(8);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
    }

    @Override // xd4.d
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder, int i17) {
        xc4.p n17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            x("MicroMsg.Improve.FinderLiveTimelineItem", "play: is in teen mode, position=" + i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            return;
        }
        this.N1 = i17;
        zc4.b m166188xfb7e5820 = m166188xfb7e5820();
        if (m166188xfb7e5820 == null || (n17 = m166188xfb7e5820.n()) == null) {
            w("MicroMsg.Improve.FinderLiveTimelineItem", "play: sns info is null, position=" + i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            return;
        }
        r45.a90 a90Var = n17.h1().f39014x86965dde;
        r45.g92 g92Var = a90Var != null ? a90Var.f451381s : null;
        if (g92Var == null) {
            w("MicroMsg.Improve.FinderLiveTimelineItem", "play: finderLiveShareObject is null, position=" + i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            return;
        }
        this.O1 = true;
        r45.nw1 nw1Var = (r45.nw1) g92Var.m75936x14adae67(24);
        if (nw1Var == null) {
            nw1Var = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Gj(pm0.v.Z(g92Var.m75945x2fec8307(0)));
            if (nw1Var == null) {
                x("MicroMsg.Improve.FinderLiveTimelineItem", "play: live info is null, liveId=" + g92Var.m75945x2fec8307(0) + ", position=" + i17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
                return;
            }
        }
        r45.nw1 nw1Var2 = nw1Var;
        if (nw1Var2.m75939xb282bd08(2) != 1) {
            this.O1 = false;
            x("MicroMsg.Improve.FinderLiveTimelineItem", "play: live is end, position=" + i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            return;
        }
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        long m75942xfb822ef2 = nw1Var2.m75942xfb822ef2(0);
        qs5.d dVar = qs5.d.f447959e;
        java.lang.Integer Uj = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).Uj(m75942xfb822ef2, 2);
        if (Uj == null || (Uj.intValue() & 1) == 0) {
            if (Uj != null) {
                this.O1 = false;
                mo69496x360802();
                x("MicroMsg.Improve.FinderLiveTimelineItem", "play: server ban auto play, auto_play_control_flag=" + Uj + ", position=" + i17);
            } else {
                x("MicroMsg.Improve.FinderLiveTimelineItem", "play: flag is null wait cgi back, position=" + i17);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            return;
        }
        if (this.L1 == null) {
            c50.q0 q0Var = (c50.q0) i95.n0.c(c50.q0.class);
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            c50.m0 Ai = ((v40.q) q0Var).Ai((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context);
            this.L1 = Ai;
            ((gp2.l0) Ai).f(c50.a.f120120f, 15);
        }
        if (!this.M1) {
            this.M1 = true;
            c50.m0 m0Var = this.L1;
            if (m0Var != null) {
                ((gp2.l0) m0Var).e(null);
            }
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
        c19792x256d2725.m76877x684351d(pm0.v.Z(g92Var.m75945x2fec8307(2)));
        c19792x256d2725.m76929x66bc2758(g92Var.m75945x2fec8307(1));
        c19792x256d2725.m76894x7ac946f0(g92Var.m75945x2fec8307(3));
        c19792x256d2725.m76896xfefec3e9(g92Var.m75945x2fec8307(12));
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 c19793xceab7f56 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56();
        c19793xceab7f56.m77002xdb5612fc(9);
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e = c19793xceab7f56.m76962x74cd162e();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e();
        c19788xd7cfd73e.m76666xdb5612fc(9);
        c19788xd7cfd73e.m76676xd3f7e23b(X(g92Var, ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Hj(nw1Var2.m75942xfb822ef2(0))).b());
        m76962x74cd162e.add(c19788xd7cfd73e);
        c19792x256d2725.m76895x5bf46472(c19793xceab7f56);
        c19792x256d2725.m76887xcb0dd23c(nw1Var2);
        android.view.View m166162x8743cf58 = m166162x8743cf58();
        if (m166162x8743cf58 != null) {
            c50.m0 m0Var2 = this.L1;
            boolean C = m0Var2 != null ? ((gp2.l0) m0Var2).C("MicroMsg.Improve.FinderLiveTimelineItem", nw1Var2.m75942xfb822ef2(0)) : false;
            x("MicroMsg.Improve.FinderLiveTimelineItem", "play: start play live, isPlaying=" + C + ", liveId=" + nw1Var2.m75942xfb822ef2(0) + ", position=" + i17 + ", feedId=" + g92Var.m75945x2fec8307(2));
            if (C) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
                return;
            }
            xd4.o0.d().j();
            xd4.g.a().d(this);
            c50.m0 m0Var3 = this.L1;
            if (m0Var3 != null) {
                ((gp2.l0) m0Var3).F(c19792x256d2725, m166162x8743cf58, new tc4.v(this, nw1Var2, i17, g92Var, c19792x256d2725), new tc4.x(this, nw1Var2, i17, g92Var), null, true);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
    }

    public final void c0(r45.nw1 nw1Var, r45.g92 g92Var, tc4.x3 x3Var, int i17, r45.l71 l71Var) {
        java.lang.String str;
        r45.co1 co1Var;
        r45.co1 co1Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showLiveTag", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        x("MicroMsg.Improve.FinderLiveTimelineItem", "showLiveTag flag:" + i17);
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).vk(nw1Var, "timelineimprove") && i17 == 4) {
            android.view.View m166163xf8706a39 = m166163xf8706a39();
            if (m166163xf8706a39 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(m166163xf8706a39, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                m166163xf8706a39.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(m166163xf8706a39, "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View m166161xb2360296 = m166161xb2360296();
            if (m166161xb2360296 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(m166161xb2360296, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                m166161xb2360296.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(m166161xb2360296, "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Gk(m166160x948a50b9(), false, i17, g92Var);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).cj(l71Var != null ? (r45.nw1) l71Var.m75936x14adae67(1) : null, 37);
        } else {
            android.view.View m166163xf8706a392 = m166163xf8706a39();
            if (m166163xf8706a392 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(m166163xf8706a392, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                m166163xf8706a392.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(m166163xf8706a392, "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View m166161xb23602962 = m166161xb2360296();
            if (m166161xb23602962 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(m166161xb23602962, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                m166161xb23602962.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(m166161xb23602962, "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Ik(m166164x21da87a2(), false, i17, g92Var);
        }
        if (g92Var != null) {
            W(true, g92Var);
        }
        if ((nw1Var == null || (co1Var2 = (r45.co1) nw1Var.m75936x14adae67(43)) == null || co1Var2.m75939xb282bd08(0) != 1) ? false : true) {
            if (!V(m166165xd93f5383(), x3Var.a(), 1)) {
                x("MicroMsg.Improve.FinderLiveTimelineItem", "loadImage ban");
                i95.m c17 = i95.n0.c(vd2.i5.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                vd2.i5.Fb((vd2.i5) c17, x3Var.b(), m166165xd93f5383(), x3Var.a(), null, 8, null);
                a0(m166165xd93f5383(), x3Var.a(), 1);
            }
            android.widget.TextView m166157x11dcb2dc = m166157x11dcb2dc();
            if (m166157x11dcb2dc != null) {
                if (nw1Var == null || (co1Var = (r45.co1) nw1Var.m75936x14adae67(43)) == null || (str = co1Var.m75945x2fec8307(1)) == null) {
                    str = "";
                }
                m166157x11dcb2dc.setText(str);
            }
            android.widget.TextView m166157x11dcb2dc2 = m166157x11dcb2dc();
            if (m166157x11dcb2dc2 != null) {
                m166157x11dcb2dc2.setVisibility(0);
            }
        } else {
            if (!V(m166165xd93f5383(), x3Var.a(), 0)) {
                x("MicroMsg.Improve.FinderLiveTimelineItem", "loadImage not ban");
                i95.m c18 = i95.n0.c(vd2.i5.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                vd2.i5.Ac((vd2.i5) c18, x3Var.b(), m166165xd93f5383(), x3Var.a(), null, 8, null);
                a0(m166165xd93f5383(), x3Var.a(), 0);
            }
            android.widget.TextView m166157x11dcb2dc3 = m166157x11dcb2dc();
            if (m166157x11dcb2dc3 != null) {
                m166157x11dcb2dc3.setVisibility(8);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showLiveTag", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
    }

    public final void d0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopAutoPlay", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        this.O1 = false;
        c50.m0 m0Var = this.L1;
        if (m0Var != null) {
            tc4.y yVar = new tc4.y(this);
            gp2.l0 l0Var = (gp2.l0) m0Var;
            l0Var.m();
            l0Var.M(yVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopAutoPlay", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
    }

    @Override // xd4.d
    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIPause", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        x("MicroMsg.Improve.FinderLiveTimelineItem", "onUIPause: ");
        d0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIPause", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
    }

    public final boolean e0(r45.g92 g92Var, r45.l71 l71Var) {
        boolean Ri;
        r45.o52 o52Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateLiveTag", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        tc4.x3 X = X(g92Var, l71Var);
        r45.nw1 nw1Var = (r45.nw1) g92Var.m75936x14adae67(24);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isChargeLive", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        boolean hk6 = nw1Var != null ? ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).hk(nw1Var) : g92Var.m75939xb282bd08(22) == 2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isChargeLive", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        boolean Y = Y(g92Var, (r45.nw1) g92Var.m75936x14adae67(24));
        r45.nw1 nw1Var2 = (r45.nw1) g92Var.m75936x14adae67(24);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replayAuditing", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        if (nw1Var2 != null) {
            Ri = ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Ri(nw1Var2);
        } else {
            ss5.i0 i0Var = (ss5.i0) i95.n0.c(ss5.i0.class);
            long Z = pm0.v.Z(g92Var.m75945x2fec8307(0));
            vd2.d5 d5Var = (vd2.d5) i0Var;
            d5Var.getClass();
            Ri = d5Var.Ri(((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Gj(Z));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replayAuditing", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateLiveTag, isChargeLive:");
        sb6.append(hk6);
        sb6.append(" isLiveReplay:");
        sb6.append(Y);
        sb6.append(" replayAuditing:");
        sb6.append(Ri);
        sb6.append(" getCoverUrl:");
        sb6.append(X);
        sb6.append(", finderShareObject.liveStatus=");
        sb6.append(g92Var.m75939xb282bd08(13));
        sb6.append(", chargeFlat=");
        r45.nw1 nw1Var3 = (r45.nw1) g92Var.m75936x14adae67(24);
        sb6.append((nw1Var3 == null || (o52Var = (r45.o52) nw1Var3.m75936x14adae67(28)) == null) ? null : java.lang.Integer.valueOf(o52Var.m75939xb282bd08(0)));
        sb6.append(", flag=");
        r45.nw1 nw1Var4 = (r45.nw1) g92Var.m75936x14adae67(24);
        sb6.append(nw1Var4 != null ? java.lang.Integer.valueOf(nw1Var4.m75939xb282bd08(37)) : null);
        x("MicroMsg.Improve.FinderLiveTimelineItem", sb6.toString());
        if (hk6) {
            c0((r45.nw1) g92Var.m75936x14adae67(24), g92Var, X, 2, l71Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateLiveTag", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            return true;
        }
        if (Y) {
            c0((r45.nw1) g92Var.m75936x14adae67(24), g92Var, X, 4, l71Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateLiveTag", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            return true;
        }
        if (Ri) {
            b0((r45.nw1) g92Var.m75936x14adae67(24), X, 3, g92Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateLiveTag", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            return true;
        }
        if (g92Var.m75939xb282bd08(13) == 1) {
            c0((r45.nw1) g92Var.m75936x14adae67(24), g92Var, X, 0, l71Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateLiveTag", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            return true;
        }
        b0((r45.nw1) g92Var.m75936x14adae67(24), X, 0, g92Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateLiveTag", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return true;
    }

    @Override // xd4.d
    /* renamed from: getDisplayRect */
    public android.graphics.Rect mo69493x4003fc90() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDisplayRect", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        android.view.View m166162x8743cf58 = m166162x8743cf58();
        if (m166162x8743cf58 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayRect", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            return null;
        }
        int[] iArr = new int[2];
        m166162x8743cf58.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        int i18 = iArr[1];
        android.graphics.Rect rect = new android.graphics.Rect(i17, i18, m166162x8743cf58.getMeasuredWidth() + i17, m166162x8743cf58.getMeasuredHeight() + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayRect", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return rect;
    }

    @Override // tc4.x1
    /* renamed from: getViewType */
    public int mo166166xc321a0f5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return 20;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @Override // tc4.v0, uc4.f1, tc4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(in5.s0 r20, zc4.b r21, int r22, boolean r23, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r24) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.a0.h(in5.s0, zc4.b, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tc4.x1
    public jz5.l k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        this.f498803y1 = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.crn, (android.view.ViewGroup) this, false);
        if (pc4.d.f434943a.x()) {
            android.view.View view = this.f498803y1;
            android.widget.ImageView imageView = view != null ? (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.n8n) : null;
            zl5.b bVar = zl5.b.f555619a;
            zl5.b.b(bVar, imageView, i65.a.b(getContext(), 2), false, false, 12, null);
            android.view.View view2 = this.f498803y1;
            zl5.b.b(bVar, view2 != null ? (android.widget.FrameLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.icp) : null, i65.a.b(getContext(), 2), false, false, 12, null);
        }
        android.util.Pair j17 = m21.y.j(getContext());
        java.lang.Object first = j17.first;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first, "first");
        int intValue = ((java.lang.Number) first).intValue();
        java.lang.Object second = j17.second;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(second, "second");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(intValue, ((java.lang.Number) second).intValue());
        android.view.View view3 = this.f498803y1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view3);
        jz5.l lVar = new jz5.l(view3, layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return lVar;
    }

    @Override // tc4.x1, tc4.s0
    /* renamed from: name */
    public java.lang.String mo70844x337a8b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return "FinderImproveLiveTimelineItem";
    }

    @Override // tc4.i2
    public void o() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        super.o();
        zc4.b m166188xfb7e5820 = m166188xfb7e5820();
        xc4.p n17 = m166188xfb7e5820 != null ? m166188xfb7e5820.n() : null;
        if (n17 == null) {
            Z();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            return;
        }
        r45.a90 a90Var = n17.h1().f39014x86965dde;
        r45.g92 g92Var = a90Var != null ? a90Var.f451381s : null;
        if (g92Var == null) {
            Z();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        } else {
            if (!V(m166165xd93f5383(), X(g92Var, null).a(), 0)) {
                Z();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        }
    }

    @Override // xd4.d
    /* renamed from: pause */
    public void mo69495x65825f6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pause", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        x("MicroMsg.Improve.FinderLiveTimelineItem", "pause: ");
        d0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pause", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
    }

    @Override // xd4.d
    /* renamed from: stop */
    public void mo69496x360802() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stop", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        x("MicroMsg.Improve.FinderLiveTimelineItem", "stop: ");
        d0();
        c50.m0 m0Var = this.L1;
        if (m0Var != null) {
            ((gp2.l0) m0Var).o();
        }
        this.M1 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stop", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
    }
}
