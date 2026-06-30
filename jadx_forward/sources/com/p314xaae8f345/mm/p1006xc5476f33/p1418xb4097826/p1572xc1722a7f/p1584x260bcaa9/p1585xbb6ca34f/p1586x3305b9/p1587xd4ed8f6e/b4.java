package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class b4 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f203125e;

    /* renamed from: f, reason: collision with root package name */
    public final float f203126f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.p f203127g;

    public b4(int i17, float f17, sp2.k outsideOperator, yz5.p jumProfileCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outsideOperator, "outsideOperator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumProfileCallback, "jumProfileCallback");
        this.f203125e = i17;
        this.f203126f = f17;
        this.f203127g = jumProfileCallback;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ds9;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r8, in5.c r9, int r10, int r11, boolean r12, java.util.List r13) {
        /*
            r7 = this;
            vp2.i0 r9 = (vp2.i0) r9
            java.lang.String r0 = "holder"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            java.lang.String r0 = "item"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r0)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            super.h(r1, r2, r3, r4, r5, r6)
            r10 = 1
            r11 = 0
            if (r13 == 0) goto L5b
            java.lang.Object r12 = kz5.n0.a0(r13, r11)
            if (r12 == 0) goto L5b
            boolean r13 = r12 instanceof dk2.zg
            if (r13 == 0) goto L5b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "consume payload "
            r13.<init>(r0)
            dk2.zg r12 = (dk2.zg) r12
            r45.qa2 r0 = r12.f315974d
            r13.append(r0)
            java.lang.String r0 = ", id="
            r13.append(r0)
            long r0 = r9.mo2128x1ed62e84()
            java.lang.String r0 = pm0.v.u(r0)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "PlayTogetherLivingConvert"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r13)
            r45.qa2 r12 = r12.f315974d
            if (r12 == 0) goto L5b
            r13 = 15
            r45.ea2 r0 = r9.f529916o
            r0.set(r13, r12)
            r7.n(r8, r9, r10)
            r12 = r10
            goto L5c
        L5b:
            r12 = r11
        L5c:
            if (r12 == 0) goto L5f
            goto Lcc
        L5f:
            r12 = 2131322691(0x7f096743, float:1.826404E38)
            android.view.View r12 = r8.p(r12)
            float r13 = r7.f203126f
            int r0 = r7.f203125e
            if (r12 == 0) goto L7e
            android.view.ViewGroup$LayoutParams r1 = r12.getLayoutParams()
            r1.width = r0
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            if (r12 != 0) goto L79
            goto L7e
        L79:
            float r1 = (float) r0
            float r1 = r1 * r13
            int r1 = (int) r1
            r12.height = r1
        L7e:
            r12 = 2131306169(0x7f0926b9, float:1.823053E38)
            android.view.View r12 = r8.p(r12)
            if (r12 == 0) goto L99
            android.view.ViewGroup$LayoutParams r1 = r12.getLayoutParams()
            r1.width = r0
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            if (r12 != 0) goto L94
            goto L99
        L94:
            float r0 = (float) r0
            float r13 = r13 * r0
            int r13 = (int) r13
            r12.height = r13
        L99:
            r7.n(r8, r9, r11)
            java.lang.Object r11 = r8.f374657h
            if (r11 == 0) goto La6
            boolean r12 = r11 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.u3
            if (r12 == 0) goto La6
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.u3 r11 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.u3) r11
        La6:
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.u3 r11 = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.u3
            r11.<init>(r7)
            r8.f374657h = r11
            boolean r12 = r9.f529920s
            if (r12 != 0) goto Lcc
            kotlinx.coroutines.r2 r12 = r11.f203506a
            r13 = 0
            if (r12 == 0) goto Lb9
            p3325xe03a0797.p3326xc267989b.p2.a(r12, r13, r10, r13)
        Lb9:
            kotlinx.coroutines.y0 r0 = r8.f374653d
            if (r0 == 0) goto Lca
            r1 = 0
            r2 = 0
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.z3 r3 = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.z3
            r3.<init>(r7, r8, r9, r13)
            r4 = 3
            r5 = 0
            kotlinx.coroutines.r2 r13 = p3325xe03a0797.p3326xc267989b.l.d(r0, r1, r2, r3, r4, r5)
        Lca:
            r11.f203506a = r13
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.b4.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.s_v);
        d92.f fVar = d92.f.f309003a;
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
            fVar.l(textView, 15.0f, true);
            d92.f.o(fVar, textView, false, false, true, 3, null);
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ryq);
        if (textView2 != null) {
            fVar.l(textView2, 12.0f, true);
            com.p314xaae8f345.mm.ui.fk.a(textView2);
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.gua);
        if (textView3 != null) {
            fVar.l(textView3, 12.0f, true);
        }
        android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.gvq);
        if (textView4 != null) {
            fVar.l(textView4, 12.0f, true);
        }
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.s_u);
        if (p17 != null) {
            d92.f.o(fVar, p17, false, false, true, 3, null);
        }
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14572x50388393 c14572x50388393 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14572x50388393) holder.p(com.p314xaae8f345.mm.R.id.rty);
        if (c14572x50388393 != null) {
            gr2.k kVar = c14572x50388393.onPlayerStatusChange;
            if (kVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14571xd0df2617) kVar).i();
            }
            c14572x50388393.onPlayerStatusChange = null;
            c14572x50388393.onLiveFinish = null;
        }
        java.lang.Object obj = holder.f374657h;
        if (obj != null && (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.u3)) {
        }
        holder.f374657h = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(in5.s0 r24, vp2.i0 r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.b4.n(in5.s0, vp2.i0, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r1.m75939xb282bd08(2) == 1) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(in5.s0 r30) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.b4.o(in5.s0):void");
    }
}
