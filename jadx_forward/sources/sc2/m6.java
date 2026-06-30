package sc2;

/* loaded from: classes2.dex */
public final class m6 extends ad2.h {

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f487614w = jz5.h.b(new sc2.e6(this));

    public final yc2.c G() {
        return (yc2.c) ((jz5.n) this.f487614w).mo141623x754a37bb();
    }

    public final void H(in5.s0 s0Var, xc2.p0 p0Var, yc2.b bVar) {
        sc2.q8 q8Var = p0Var.f534766J;
        if (q8Var != null) {
            q8Var.f487710a = false;
        }
        by2.c.f117901a.b(s0Var.f3639x46306858, 2, sc2.i6.f487507d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1462x365338.C13928xc82087f4 c13928xc82087f4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1462x365338.C13928xc82087f4) s0Var.p(com.p314xaae8f345.mm.R.id.tw9);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedBottomBubbleObserver", "[realHide] feedId:" + ((java.lang.Object) jz5.x.a(this.f84678f)) + ' ');
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c13928xc82087f4);
        n(c13928xc82087f4, true, new sc2.j6(this, c13928xc82087f4));
        I(c13928xc82087f4, "view_clk", bVar);
    }

    public final void I(android.view.View view, java.lang.String str, yc2.b bVar) {
        java.lang.String str2;
        yc2.c G = G();
        if (G == null || (str2 = G.y()) == null) {
            str2 = "";
        }
        java.lang.String str3 = str2;
        yc2.c G2 = G();
        hc2.v0.d(view, str3, str, false, G2 != null ? G2.x(bVar) : null, null, 20, null);
    }

    @Override // ad2.h, ad2.k
    public void c(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
    }

    @Override // ad2.h, ad2.k
    public void d(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
    }

    @Override // ad2.h
    public java.lang.String k() {
        return "FinderFeedBottomBubbleObserver";
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    @Override // ad2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m(xc2.p0 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "infoEx"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            r45.wf6 r0 = r6.f84682m
            r1 = 52
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L1a
            com.tencent.mm.protobuf.f r0 = r0.m75936x14adae67(r1)
            r45.on r0 = (r45.on) r0
            if (r0 == 0) goto L1a
            java.lang.String r0 = r0.m75945x2fec8307(r3)
            goto L1b
        L1a:
            r0 = r2
        L1b:
            r4 = 1
            if (r0 == 0) goto L27
            int r0 = r0.length()
            if (r0 != 0) goto L25
            goto L27
        L25:
            r0 = r3
            goto L28
        L27:
            r0 = r4
        L28:
            if (r0 != 0) goto L4c
            r45.wf6 r0 = r6.f84682m
            if (r0 == 0) goto L3b
            com.tencent.mm.protobuf.f r0 = r0.m75936x14adae67(r1)
            r45.on r0 = (r45.on) r0
            if (r0 == 0) goto L3b
            java.lang.String r0 = r0.m75945x2fec8307(r4)
            goto L3c
        L3b:
            r0 = r2
        L3c:
            if (r0 == 0) goto L47
            int r0 = r0.length()
            if (r0 != 0) goto L45
            goto L47
        L45:
            r0 = r3
            goto L48
        L47:
            r0 = r4
        L48:
            if (r0 != 0) goto L4c
            r0 = r4
            goto L4d
        L4c:
            r0 = r3
        L4d:
            if (r0 != 0) goto L6a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "[hasWording], checkWordingValid failed, style="
            r1.<init>(r5)
            r45.wf6 r5 = r6.f84682m
            if (r5 == 0) goto L5e
            org.json.JSONObject r2 = r5.mo12245xcc313de3()
        L5e:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FinderFeedBottomBubbleObserver"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r1)
        L6a:
            boolean r7 = super.m(r7)
            if (r7 != 0) goto L72
            if (r0 == 0) goto L73
        L72:
            r3 = r4
        L73:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.m6.m(xc2.p0):boolean");
    }

    @Override // ad2.h
    public void q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        java.lang.String v17;
        java.lang.String w17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        r45.wf6 wf6Var = this.f84682m;
        r45.on onVar = wf6Var != null ? (r45.on) wf6Var.m75936x14adae67(52) : null;
        android.content.Context context = holder.f374654e;
        android.content.res.Resources resources = context.getResources();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1462x365338.C13928xc82087f4 c13928xc82087f4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1462x365338.C13928xc82087f4) holder.p(com.p314xaae8f345.mm.R.id.tw9);
        if (c13928xc82087f4 == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onBindView], tipsView null, not added, style=");
            r45.wf6 wf6Var2 = this.f84682m;
            sb6.append(wf6Var2 != null ? wf6Var2.mo12245xcc313de3() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderFeedBottomBubbleObserver", sb6.toString());
            return;
        }
        c13928xc82087f4.a(new sc2.f6(holder));
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.qsy);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.qsz);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.qsw);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.f566520qt0);
        android.view.ViewGroup.LayoutParams layoutParams = c13928xc82087f4.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561187bs);
        layoutParams2.gravity = 80;
        c13928xc82087f4.setLayoutParams(layoutParams2);
        if (textView != null) {
            if (onVar == null || (w17 = onVar.m75945x2fec8307(0)) == null) {
                yc2.c G = G();
                w17 = G != null ? G.w() : null;
            }
            textView.setText(w17);
        }
        if (textView2 != null) {
            if (onVar == null || (v17 = onVar.m75945x2fec8307(1)) == null) {
                yc2.c G2 = G();
                v17 = G2 != null ? G2.v() : null;
            }
            textView2.setText(v17);
        }
        if (textView2 != null) {
            textView2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563159yf);
        }
        if (textView2 != null) {
            textView2.setTextColor(context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
        }
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setVisibility(8);
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[onBindView], feedId=");
        sb7.append((java.lang.Object) jz5.x.a(feed.mo2128x1ed62e84()));
        sb7.append(", position:");
        sb7.append(holder.m8183xf806b362());
        sb7.append(" infoEx=");
        sb7.append(infoEx);
        sb7.append(", jumpInfo=");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = infoEx.f534767a;
        sb7.append(c19786x6a1e2862.mo12245xcc313de3());
        sb7.append(", snap_shot_init_data=");
        r45.k74 m76504xa819f0c7 = c19786x6a1e2862.m76504xa819f0c7();
        sb7.append(m76504xa819f0c7 != null ? m76504xa819f0c7.m75945x2fec8307(12) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedBottomBubbleObserver", sb7.toString());
        textView2.setOnClickListener(new sc2.g6(this, holder, infoEx));
        p17.setOnClickListener(new sc2.h6(this, holder, infoEx));
    }

    @Override // ad2.h
    public void r(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
    }

    @Override // ad2.h
    public void v(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.v(holder, jumpView, infoEx);
        jz5.x.a(this.f84678f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1462x365338.C13928xc82087f4 c13928xc82087f4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1462x365338.C13928xc82087f4) holder.p(com.p314xaae8f345.mm.R.id.tw9);
        long j17 = this.f84678f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c13928xc82087f4);
        boolean z17 = false;
        if (c13928xc82087f4.getVisibility() == 0) {
            jz5.x.a(j17);
            return;
        }
        sc2.q8 q8Var = infoEx.f534766J;
        if (q8Var != null && q8Var.f487710a) {
            jz5.x.a(j17);
            return;
        }
        if (q8Var != null && q8Var.f487711b) {
            z17 = true;
        }
        if (z17) {
            jz5.x.a(j17);
            return;
        }
        if (!c13928xc82087f4.visibilityManager.O6(c13928xc82087f4.f190598e)) {
            jz5.x.a(j17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedBottomBubbleObserver", "[realShow] feedId:" + ((java.lang.Object) jz5.x.a(j17)) + ' ');
        sc2.q8 q8Var2 = infoEx.f534766J;
        if (q8Var2 != null) {
            q8Var2.f487710a = true;
        }
        by2.c.f117901a.b(holder.f3639x46306858, 2, sc2.k6.f487555d);
        E(holder, c13928xc82087f4, infoEx, true, new sc2.l6(this, j17, c13928xc82087f4));
        I(c13928xc82087f4, "view_exp", null);
    }

    @Override // ad2.h
    public void w(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.w(holder, jumpView, infoEx);
        H(holder, infoEx, null);
        jz5.x.a(this.f84678f);
    }
}
