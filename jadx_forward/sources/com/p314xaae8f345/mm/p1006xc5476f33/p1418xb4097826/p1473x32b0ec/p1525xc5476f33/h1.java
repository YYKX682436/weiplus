package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class h1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: p, reason: collision with root package name */
    public final te2.u f194280p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        android.content.Context context = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        te2.w wVar = new te2.w(context, S0(), statusMonitor);
        this.f194280p = wVar;
        android.content.Context context2 = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        wVar.mo56536x3b13c504(new te2.a0(root, (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2, wVar));
        if (x0()) {
            zl2.r4.f555483a.e(this, false);
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += com.p314xaae8f345.mm.ui.bl.c(root.getContext());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if ((r9.length() > 0) == true) goto L25;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M0(qo0.b r8, android.os.Bundle r9) {
        /*
            r7 = this;
            java.lang.String r0 = "status"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            int[] r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g1.f194153a
            int r8 = r8.ordinal()
            r8 = r0[r8]
            r0 = 1
            if (r8 != r0) goto L94
            r8 = 0
            if (r9 == 0) goto L1a
            java.lang.String r1 = "PARAM_FINDER_LIVE_ALLOWANCE_GIFT_ICON_URL"
            java.lang.String r9 = r9.getString(r1)
            goto L1b
        L1a:
            r9 = r8
        L1b:
            te2.u r1 = r7.f194280p
            if (r1 == 0) goto L94
            te2.w r1 = (te2.w) r1
            te2.v r1 = r1.f500036d
            if (r1 == 0) goto L94
            te2.a0 r1 = (te2.a0) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "#showPagView giftIcon="
            r2.<init>(r3)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FinderLiveAllowanceGiftPagViewCallback"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r2)
            com.tencent.mm.view.MMPAGView r2 = r1.f499382i
            if (r2 == 0) goto L94
            te2.z r3 = new te2.z
            r3.<init>(r1, r9)
            r2.a(r3)
            android.widget.ImageView r3 = r1.f499383m
            if (r3 == 0) goto L76
            r4 = 8
            r3.setVisibility(r4)
            r4 = 0
            if (r9 == 0) goto L5e
            int r5 = r9.length()
            if (r5 <= 0) goto L5a
            r5 = r0
            goto L5b
        L5a:
            r5 = r4
        L5b:
            if (r5 != r0) goto L5e
            goto L5f
        L5e:
            r0 = r4
        L5f:
            if (r0 == 0) goto L76
            mn2.g1 r0 = mn2.g1.f411508a
            vo0.d r4 = r0.e()
            mn2.n r5 = new mn2.n
            r6 = 2
            r5.<init>(r9, r8, r6, r8)
            mn2.f1 r8 = mn2.f1.f411490h
            yo0.i r8 = r0.h(r8)
            r4.c(r5, r3, r8)
        L76:
            android.content.Context r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            android.graphics.Point r8 = com.p314xaae8f345.mm.ui.bl.b(r8)
            int r9 = r8.x
            int r8 = r8.y
            int r8 = java.lang.Math.min(r9, r8)
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            r9.<init>(r8, r8)
            com.tencent.mm.view.MMPAGView r8 = r1.f499382i
            if (r8 != 0) goto L8e
            goto L91
        L8e:
            r8.setLayoutParams(r9)
        L91:
            r2.n()
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h1.M0(qo0.b, android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
    }
}
