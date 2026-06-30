package v74;

/* loaded from: classes4.dex */
public final class y implements p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v74.k0 f515475d;

    public y(v74.k0 k0Var) {
        this.f515475d = k0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a
    public void R3(android.view.View view) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onChildViewAttachedToWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$mOnChildAttachStateChangeListener$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        v74.k0 k0Var = this.f515475d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05 d17 = v74.k0.d(k0Var);
        int u07 = d17 != null ? d17.u0(view) : -1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05 d18 = v74.k0.d(k0Var);
        boolean z17 = false;
        int mo1894x7e414b06 = (d18 == null || (mo7946xf939df19 = d18.mo7946xf939df19()) == null) ? 0 : mo7946xf939df19.mo1894x7e414b06();
        view.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05 d19 = v74.k0.d(k0Var);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = d19 != null ? d19.w0(view) : null;
        boolean b17 = v74.k0.b(k0Var);
        boolean z18 = w07 instanceof v74.b;
        v74.b bVar = z18 ? (v74.b) w07 : null;
        android.widget.ImageView j17 = bVar != null ? bVar.j() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setVideoStatusIconVisibility", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        k0Var.n(j17, b17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setVideoStatusIconVisibility", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMSplashVideoLogic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        v74.h1 h1Var = k0Var.f515387t;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMSplashVideoLogic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        if (h1Var != null && h1Var.b()) {
            z17 = true;
        }
        if (!z17 && u07 != -1 && u07 != mo1894x7e414b06 - 1) {
            v74.k0.a(k0Var).i(u07);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMIsSmoothMode$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMIsSmoothMode$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        if (k0Var.f515379l) {
            v74.k0.E.f(z18 ? (v74.b) w07 : null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onChildViewAttachedToWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$mOnChildAttachStateChangeListener$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p3(android.view.View r10) {
        /*
            r9 = this;
            java.lang.String r0 = "onChildViewDetachedFromWindow"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$mOnChildAttachStateChangeListener$1"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            java.lang.String r2 = "view"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r2)
            v74.k0 r2 = r9.f515475d
            com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView r3 = v74.k0.d(r2)
            r4 = 0
            if (r3 == 0) goto L1c
            androidx.recyclerview.widget.k3 r3 = r3.w0(r10)
            goto L1d
        L1c:
            r3 = r4
        L1d:
            boolean r5 = r3 instanceof v74.b
            if (r5 == 0) goto L24
            v74.b r3 = (v74.b) r3
            goto L25
        L24:
            r3 = r4
        L25:
            boolean r5 = v74.k0.b(r2)
            if (r3 == 0) goto L30
            android.widget.ImageView r6 = r3.j()
            goto L31
        L30:
            r6 = r4
        L31:
            java.lang.String r7 = "access$setVideoStatusIconVisibility"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r7, r8)
            r2.n(r6, r5)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r8)
            if (r3 == 0) goto L45
            android.widget.FrameLayout r3 = r3.i()
            goto L46
        L45:
            r3 = r4
        L46:
            java.lang.String r5 = "getVideoViewInContainer"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager$Companion"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r5, r6)
            boolean r7 = a84.y0.e(r3)
            if (r7 == 0) goto L67
            if (r3 == 0) goto L5b
            r7 = 0
            android.view.View r3 = r3.getChildAt(r7)
            goto L5c
        L5b:
            r3 = r4
        L5c:
            boolean r7 = r3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d
            if (r7 == 0) goto L67
            r4 = r3
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r4 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) r4
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r5, r6)
            goto L6a
        L67:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r5, r6)
        L6a:
            if (r4 != 0) goto L6d
            goto L71
        L6d:
            r3 = 0
            r4.setAlpha(r3)
        L71:
            com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView r2 = v74.k0.d(r2)
            if (r2 == 0) goto L7a
            r2.u0(r10)
        L7a:
            r10.hashCode()
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v74.y.p3(android.view.View):void");
    }
}
