package bg2;

/* loaded from: classes2.dex */
public final class x8 extends tc2.c implements tc2.h {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f102187e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f102188f;

    /* renamed from: g, reason: collision with root package name */
    public r45.wm2 f102189g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Boolean f102190h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f102187e = "Live.LiveShareBtnController";
    }

    @Override // tc2.c
    public void P6() {
        uc2.g gVar = (uc2.g) O6(uc2.g.class);
        android.view.View d76 = gVar != null ? ((sb2.l) gVar).d7() : null;
        if (d76 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(d76, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveShareBtnController", "onBind", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d76.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(d76, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveShareBtnController", "onBind", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        uc2.g gVar2 = (uc2.g) O6(uc2.g.class);
        android.view.View e76 = gVar2 != null ? ((sb2.l) gVar2).e7() : null;
        if (e76 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(e76, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveShareBtnController", "onBind", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        e76.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(e76, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveShareBtnController", "onBind", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0426 A[LOOP:0: B:131:0x0420->B:133:0x0426, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0459  */
    @Override // tc2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Q6() {
        /*
            Method dump skipped, instructions count: 1770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.x8.Q6():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if ((r8 != null && ((r8 = r8.f185893h) == 4 || r8 == 1 || r8 == 3)) == true) goto L20;
     */
    @Override // tc2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void T6(android.view.View r8) {
        /*
            r7 = this;
            java.lang.String r0 = "view"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            java.lang.Class<uc2.g> r8 = uc2.g.class
            java.lang.Object r8 = r7.O6(r8)
            uc2.g r8 = (uc2.g) r8
            r0 = 0
            r1 = 0
            if (r8 == 0) goto L32
            sb2.l r8 = (sb2.l) r8
            tc2.g r8 = r8.f498674d
            in5.r r8 = r8.f498683m
            boolean r2 = r8 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf
            if (r2 == 0) goto L1e
            com.tencent.mm.plugin.finder.convert.zf r8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf) r8
            goto L1f
        L1e:
            r8 = r0
        L1f:
            r2 = 1
            if (r8 == 0) goto L2e
            r3 = 4
            int r8 = r8.f185893h
            if (r8 == r3) goto L2c
            if (r8 == r2) goto L2c
            r3 = 3
            if (r8 != r3) goto L2e
        L2c:
            r8 = r2
            goto L2f
        L2e:
            r8 = r1
        L2f:
            if (r8 != r2) goto L32
            goto L33
        L32:
            r2 = r1
        L33:
            if (r2 == 0) goto L93
            long r2 = c01.id.c()
            gm0.b0 r8 = gm0.j1.u()
            com.tencent.mm.storage.n3 r8 = r8.c()
            com.tencent.mm.storage.u3 r4 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_FEED_LONG_CLICK_LONG_SYNC
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            r8.x(r4, r5)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r4 = "onMediaLongClick USERINFO_FINDER_LIVE_FEED_LONG_CLICK_LONG_SYNC:"
            r8.<init>(r4)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r4 = r7.f102187e
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r8)
            tc2.g r8 = r7.f498674d
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r8 = r8.f498681h
            boolean r5 = r8 instanceof so2.h1
            if (r5 == 0) goto L68
            r0 = r8
            so2.h1 r0 = (so2.h1) r0
        L68:
            if (r0 != 0) goto L6b
            return
        L6b:
            boolean r8 = r0.f491914h
            if (r8 == 0) goto L93
            gm0.b0 r8 = gm0.j1.u()
            com.tencent.mm.storage.n3 r8 = r8.c()
            com.tencent.mm.storage.u3 r5 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_FEED_FORWARD_GUIDE_LONG_SYNC
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            r8.x(r5, r6)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r5 = "onMediaLongClick USERINFO_FINDER_LIVE_FEED_FORWARD_GUIDE_LONG_SYNC:"
            r8.<init>(r5)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r8)
            r0.f491914h = r1
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.x8.T6(android.view.View):void");
    }

    @Override // tc2.c
    public void U6() {
        android.view.View e76;
        android.view.ViewPropertyAnimator animate;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f102188f;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
        this.f102188f = null;
        uc2.g gVar = (uc2.g) O6(uc2.g.class);
        android.view.View d76 = gVar != null ? ((sb2.l) gVar).d7() : null;
        if (d76 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(d76, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveShareBtnController", "onUnFocusFeedCenter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d76.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(d76, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveShareBtnController", "onUnFocusFeedCenter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        uc2.g gVar2 = (uc2.g) O6(uc2.g.class);
        android.view.View e77 = gVar2 != null ? ((sb2.l) gVar2).e7() : null;
        if (e77 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(e77, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveShareBtnController", "onUnFocusFeedCenter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            e77.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(e77, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveShareBtnController", "onUnFocusFeedCenter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        uc2.g gVar3 = (uc2.g) O6(uc2.g.class);
        if (gVar3 != null && (e76 = ((sb2.l) gVar3).e7()) != null && (animate = e76.animate()) != null) {
            animate.cancel();
        }
        a7(null);
        bg2.g2 g2Var = (bg2.g2) N6(bg2.g2.class);
        if (g2Var != null) {
            g2Var.Z6(42);
        }
    }

    public final boolean Y6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2;
        r45.dm2 m76806xdef68064;
        r45.t94 t94Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f498674d.f498681h;
        return (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null || (m76806xdef68064 = feedObject2.m76806xdef68064()) == null || (t94Var = (r45.t94) m76806xdef68064.m75936x14adae67(44)) == null || !t94Var.m75933x41a8a7f2(1)) ? false : true;
    }

    public final void Z6(android.view.View view, so2.h1 h1Var, boolean z17) {
        android.view.View b76;
        android.view.View b77;
        r45.pm2 pm2Var;
        r45.wm2 wm2Var;
        android.widget.TextView textView = null;
        if (z17) {
            view.setOnClickListener(new bg2.r8(this, h1Var, view));
        } else {
            view.setOnClickListener(null);
        }
        r45.dm2 m76806xdef68064 = h1Var.getFeedObject().getFeedObject().m76806xdef68064();
        int m75939xb282bd08 = (m76806xdef68064 == null || (pm2Var = (r45.pm2) m76806xdef68064.m75936x14adae67(12)) == null || (wm2Var = (r45.wm2) pm2Var.m75936x14adae67(10)) == null) ? 0 : wm2Var.m75939xb282bd08(1);
        uc2.g gVar = (uc2.g) O6(uc2.g.class);
        android.widget.TextView textView2 = (gVar == null || (b77 = ((sb2.l) gVar).b7()) == null) ? null : (android.widget.TextView) b77.findViewById(com.p314xaae8f345.mm.R.id.i1g);
        if (textView2 != null) {
            textView2.setText((!z17 || m75939xb282bd08 <= 0) ? view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nqt) : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.g(2, m75939xb282bd08));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.h6i);
        uc2.g gVar2 = (uc2.g) O6(uc2.g.class);
        if (gVar2 != null && (b76 = ((sb2.l) gVar2).b7()) != null) {
            textView = (android.widget.TextView) b76.findViewById(com.p314xaae8f345.mm.R.id.i1g);
        }
        if (z17) {
            return;
        }
        int d17 = i65.a.d(c22699x3dcdb352.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560521mr);
        c22699x3dcdb352.m82040x7541828(d17);
        if (textView != null) {
            textView.setTextColor(d17);
        }
    }

    public final void a7(so2.h1 h1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f102187e, "[stopLiveLikePolling], id = ".concat(pm0.v.u((h1Var == null || (feedObject = h1Var.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null) ? 0L : feedObject2.m76784x5db1b11())));
        bg2.g2 g2Var = (bg2.g2) N6(bg2.g2.class);
        if (g2Var != null) {
            g2Var.Z6(42);
        }
    }

    public final void b7(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, r45.wm2 wm2Var) {
        r45.pm2 pm2Var;
        r45.wm2 wm2Var2;
        r45.dm2 m76806xdef68064 = c19792x256d2725.m76806xdef68064();
        if (m76806xdef68064 != null && (pm2Var = (r45.pm2) m76806xdef68064.m75936x14adae67(12)) != null && (wm2Var2 = (r45.wm2) pm2Var.m75936x14adae67(10)) != null && wm2Var != null) {
            wm2Var2.set(1, java.lang.Integer.valueOf(wm2Var.m75939xb282bd08(1)));
            wm2Var2.set(2, java.lang.Integer.valueOf(wm2Var.m75939xb282bd08(2)));
            wm2Var2.set(4, java.lang.Integer.valueOf(wm2Var.m75939xb282bd08(4)));
            wm2Var2.set(5, (r45.jn2) wm2Var.m75936x14adae67(5));
        }
        if (wm2Var != null) {
            c19792x256d2725.m76884x50740976(wm2Var.m75939xb282bd08(1));
            c19792x256d2725.m76872x2d5669f8(wm2Var.m75939xb282bd08(2));
            c19792x256d2725.m76869x85124ecc(wm2Var.m75939xb282bd08(4));
        }
    }

    public final void c7(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, r45.wm2 wm2Var) {
        r45.pm2 pm2Var;
        r45.wm2 wm2Var2;
        r45.dm2 m76806xdef68064 = c19792x256d2725.m76806xdef68064();
        if (m76806xdef68064 != null && (pm2Var = (r45.pm2) m76806xdef68064.m75936x14adae67(12)) != null && (wm2Var2 = (r45.wm2) pm2Var.m75936x14adae67(10)) != null && wm2Var != null) {
            wm2Var2.set(0, java.lang.Integer.valueOf(wm2Var.m75939xb282bd08(0)));
            wm2Var2.set(5, (r45.jn2) wm2Var.m75936x14adae67(5));
        }
        if (wm2Var != null) {
            c19792x256d2725.m76885xb8471e25(wm2Var.m75939xb282bd08(0));
        }
    }

    public final void d7(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, r45.wm2 wm2Var) {
        r45.pm2 pm2Var;
        r45.wm2 wm2Var2;
        r45.dm2 m76806xdef68064 = c19792x256d2725.m76806xdef68064();
        if (m76806xdef68064 != null && (pm2Var = (r45.pm2) m76806xdef68064.m75936x14adae67(12)) != null && (wm2Var2 = (r45.wm2) pm2Var.m75936x14adae67(10)) != null && wm2Var != null) {
            wm2Var2.set(3, wm2Var.m75941xfb821914(3));
            wm2Var2.set(5, (r45.jn2) wm2Var.m75936x14adae67(5));
        }
        if (wm2Var != null) {
            c19792x256d2725.m76886xb849cf57(wm2Var.m75941xfb821914(3));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r0.m75933x41a8a7f2(0) == true) goto L16;
     */
    @Override // tc2.h
    /* renamed from: onLiveStart */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo10403x39a513b7(r45.hc1 r8) {
        /*
            r7 = this;
            tc2.g r8 = r7.f498674d
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r8 = r8.f498681h
            boolean r0 = r8 instanceof so2.h1
            r1 = 0
            if (r0 == 0) goto Lc
            so2.h1 r8 = (so2.h1) r8
            goto Ld
        Lc:
            r8 = r1
        Ld:
            if (r8 != 0) goto L10
            return
        L10:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r8.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            r45.dm2 r0 = r0.m76806xdef68064()
            r2 = 0
            if (r0 == 0) goto L31
            r3 = 44
            com.tencent.mm.protobuf.f r0 = r0.m75936x14adae67(r3)
            r45.t94 r0 = (r45.t94) r0
            if (r0 == 0) goto L31
            boolean r0 = r0.m75933x41a8a7f2(r2)
            r3 = 1
            if (r0 != r3) goto L31
            goto L32
        L31:
            r3 = r2
        L32:
            if (r3 == 0) goto Ldf
            r7.a7(r8)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "[startLiveLikePolling], id = "
            r0.<init>(r3)
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r8.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
            long r3 = r3.m76784x5db1b11()
            java.lang.String r3 = pm0.v.u(r3)
            r0.append(r3)
            java.lang.String r3 = ", pollingData = "
            r0.append(r3)
            r45.wm2 r3 = r7.f102189g
            if (r3 == 0) goto L60
            org.json.JSONObject r3 = pm0.b0.g(r3)
            if (r3 != 0) goto L62
        L60:
            java.lang.String r3 = "null"
        L62:
            r0.append(r3)
            java.lang.String r3 = " data = "
            r0.append(r3)
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r8.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
            r45.dm2 r3 = r3.m76806xdef68064()
            r4 = 10
            r5 = 12
            if (r3 == 0) goto L91
            com.tencent.mm.protobuf.f r3 = r3.m75936x14adae67(r5)
            r45.pm2 r3 = (r45.pm2) r3
            if (r3 == 0) goto L91
            com.tencent.mm.protobuf.f r3 = r3.m75936x14adae67(r4)
            r45.wm2 r3 = (r45.wm2) r3
            if (r3 == 0) goto L91
            org.json.JSONObject r3 = pm0.b0.g(r3)
            goto L92
        L91:
            r3 = r1
        L92:
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = r7.f102187e
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r0)
            java.lang.Class<bg2.g2> r0 = bg2.g2.class
            tc2.c r0 = r7.N6(r0)
            bg2.g2 r0 = (bg2.g2) r0
            if (r0 == 0) goto Le2
            r45.dj6 r3 = new r45.dj6
            r3.<init>()
            r45.wm2 r6 = r7.f102189g
            if (r6 != 0) goto Lce
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r8.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObject r6 = r6.getFeedObject()
            r45.dm2 r6 = r6.m76806xdef68064()
            if (r6 == 0) goto Lcf
            com.tencent.mm.protobuf.f r5 = r6.m75936x14adae67(r5)
            r45.pm2 r5 = (r45.pm2) r5
            if (r5 == 0) goto Lcf
            com.tencent.mm.protobuf.f r1 = r5.m75936x14adae67(r4)
            r45.wm2 r1 = (r45.wm2) r1
            goto Lcf
        Lce:
            r1 = r6
        Lcf:
            r3.set(r2, r1)
            bg2.w8 r1 = new bg2.w8
            java.lang.Class<r45.ej6> r4 = r45.ej6.class
            r1.<init>(r7, r8, r4)
            r8 = 42
            r0.Y6(r8, r3, r2, r1)
            goto Le2
        Ldf:
            r7.a7(r8)
        Le2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.x8.mo10403x39a513b7(r45.hc1):void");
    }
}
