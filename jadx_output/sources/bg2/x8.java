package bg2;

/* loaded from: classes2.dex */
public final class x8 extends tc2.c implements tc2.h {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f20654e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f20655f;

    /* renamed from: g, reason: collision with root package name */
    public r45.wm2 f20656g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Boolean f20657h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f20654e = "Live.LiveShareBtnController";
    }

    @Override // tc2.c
    public void P6() {
        uc2.g gVar = (uc2.g) O6(uc2.g.class);
        android.view.View d76 = gVar != null ? ((sb2.l) gVar).d7() : null;
        if (d76 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
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
    
        if ((r8 != null && ((r8 = r8.f104360h) == 4 || r8 == 1 || r8 == 3)) == true) goto L20;
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
            kotlin.jvm.internal.o.g(r8, r0)
            java.lang.Class<uc2.g> r8 = uc2.g.class
            java.lang.Object r8 = r7.O6(r8)
            uc2.g r8 = (uc2.g) r8
            r0 = 0
            r1 = 0
            if (r8 == 0) goto L32
            sb2.l r8 = (sb2.l) r8
            tc2.g r8 = r8.f417141d
            in5.r r8 = r8.f417150m
            boolean r2 = r8 instanceof com.tencent.mm.plugin.finder.convert.zf
            if (r2 == 0) goto L1e
            com.tencent.mm.plugin.finder.convert.zf r8 = (com.tencent.mm.plugin.finder.convert.zf) r8
            goto L1f
        L1e:
            r8 = r0
        L1f:
            r2 = 1
            if (r8 == 0) goto L2e
            r3 = 4
            int r8 = r8.f104360h
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
            com.tencent.mm.storage.u3 r4 = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_FEED_LONG_CLICK_LONG_SYNC
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            r8.x(r4, r5)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r4 = "onMediaLongClick USERINFO_FINDER_LIVE_FEED_LONG_CLICK_LONG_SYNC:"
            r8.<init>(r4)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r4 = r7.f20654e
            com.tencent.mars.xlog.Log.i(r4, r8)
            tc2.g r8 = r7.f417141d
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r8 = r8.f417148h
            boolean r5 = r8 instanceof so2.h1
            if (r5 == 0) goto L68
            r0 = r8
            so2.h1 r0 = (so2.h1) r0
        L68:
            if (r0 != 0) goto L6b
            return
        L6b:
            boolean r8 = r0.f410381h
            if (r8 == 0) goto L93
            gm0.b0 r8 = gm0.j1.u()
            com.tencent.mm.storage.n3 r8 = r8.c()
            com.tencent.mm.storage.u3 r5 = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_FEED_FORWARD_GUIDE_LONG_SYNC
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            r8.x(r5, r6)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r5 = "onMediaLongClick USERINFO_FINDER_LIVE_FEED_FORWARD_GUIDE_LONG_SYNC:"
            r8.<init>(r5)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            com.tencent.mars.xlog.Log.i(r4, r8)
            r0.f410381h = r1
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.x8.T6(android.view.View):void");
    }

    @Override // tc2.c
    public void U6() {
        android.view.View e76;
        android.view.ViewPropertyAnimator animate;
        com.tencent.mm.sdk.event.IListener iListener = this.f20655f;
        if (iListener != null) {
            iListener.dead();
        }
        this.f20655f = null;
        uc2.g gVar = (uc2.g) O6(uc2.g.class);
        android.view.View d76 = gVar != null ? ((sb2.l) gVar).d7() : null;
        if (d76 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
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
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        r45.dm2 object_extend;
        r45.t94 t94Var;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f417141d.f417148h;
        return (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null || (object_extend = feedObject2.getObject_extend()) == null || (t94Var = (r45.t94) object_extend.getCustom(44)) == null || !t94Var.getBoolean(1)) ? false : true;
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
        r45.dm2 object_extend = h1Var.getFeedObject().getFeedObject().getObject_extend();
        int integer = (object_extend == null || (pm2Var = (r45.pm2) object_extend.getCustom(12)) == null || (wm2Var = (r45.wm2) pm2Var.getCustom(10)) == null) ? 0 : wm2Var.getInteger(1);
        uc2.g gVar = (uc2.g) O6(uc2.g.class);
        android.widget.TextView textView2 = (gVar == null || (b77 = ((sb2.l) gVar).b7()) == null) ? null : (android.widget.TextView) b77.findViewById(com.tencent.mm.R.id.i1g);
        if (textView2 != null) {
            textView2.setText((!z17 || integer <= 0) ? view.getContext().getString(com.tencent.mm.R.string.nqt) : com.tencent.mm.plugin.finder.assist.w2.g(2, integer));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.h6i);
        uc2.g gVar2 = (uc2.g) O6(uc2.g.class);
        if (gVar2 != null && (b76 = ((sb2.l) gVar2).b7()) != null) {
            textView = (android.widget.TextView) b76.findViewById(com.tencent.mm.R.id.i1g);
        }
        if (z17) {
            return;
        }
        int d17 = i65.a.d(weImageView.getContext(), com.tencent.mm.R.color.f478988mr);
        weImageView.setIconColor(d17);
        if (textView != null) {
            textView.setTextColor(d17);
        }
    }

    public final void a7(so2.h1 h1Var) {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        com.tencent.mars.xlog.Log.i(this.f20654e, "[stopLiveLikePolling], id = ".concat(pm0.v.u((h1Var == null || (feedObject = h1Var.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null) ? 0L : feedObject2.getId())));
        bg2.g2 g2Var = (bg2.g2) N6(bg2.g2.class);
        if (g2Var != null) {
            g2Var.Z6(42);
        }
    }

    public final void b7(com.tencent.mm.protocal.protobuf.FinderObject finderObject, r45.wm2 wm2Var) {
        r45.pm2 pm2Var;
        r45.wm2 wm2Var2;
        r45.dm2 object_extend = finderObject.getObject_extend();
        if (object_extend != null && (pm2Var = (r45.pm2) object_extend.getCustom(12)) != null && (wm2Var2 = (r45.wm2) pm2Var.getCustom(10)) != null && wm2Var != null) {
            wm2Var2.set(1, java.lang.Integer.valueOf(wm2Var.getInteger(1)));
            wm2Var2.set(2, java.lang.Integer.valueOf(wm2Var.getInteger(2)));
            wm2Var2.set(4, java.lang.Integer.valueOf(wm2Var.getInteger(4)));
            wm2Var2.set(5, (r45.jn2) wm2Var.getCustom(5));
        }
        if (wm2Var != null) {
            finderObject.setLikeCount(wm2Var.getInteger(1));
            finderObject.setFriendLikeCount(wm2Var.getInteger(2));
            finderObject.setForwardCount(wm2Var.getInteger(4));
        }
    }

    public final void c7(com.tencent.mm.protocal.protobuf.FinderObject finderObject, r45.wm2 wm2Var) {
        r45.pm2 pm2Var;
        r45.wm2 wm2Var2;
        r45.dm2 object_extend = finderObject.getObject_extend();
        if (object_extend != null && (pm2Var = (r45.pm2) object_extend.getCustom(12)) != null && (wm2Var2 = (r45.wm2) pm2Var.getCustom(10)) != null && wm2Var != null) {
            wm2Var2.set(0, java.lang.Integer.valueOf(wm2Var.getInteger(0)));
            wm2Var2.set(5, (r45.jn2) wm2Var.getCustom(5));
        }
        if (wm2Var != null) {
            finderObject.setLikeFlag(wm2Var.getInteger(0));
        }
    }

    public final void d7(com.tencent.mm.protocal.protobuf.FinderObject finderObject, r45.wm2 wm2Var) {
        r45.pm2 pm2Var;
        r45.wm2 wm2Var2;
        r45.dm2 object_extend = finderObject.getObject_extend();
        if (object_extend != null && (pm2Var = (r45.pm2) object_extend.getCustom(12)) != null && (wm2Var2 = (r45.wm2) pm2Var.getCustom(10)) != null && wm2Var != null) {
            wm2Var2.set(3, wm2Var.getList(3));
            wm2Var2.set(5, (r45.jn2) wm2Var.getCustom(5));
        }
        if (wm2Var != null) {
            finderObject.setLikeList(wm2Var.getList(3));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r0.getBoolean(0) == true) goto L16;
     */
    @Override // tc2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLiveStart(r45.hc1 r8) {
        /*
            r7 = this;
            tc2.g r8 = r7.f417141d
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r8 = r8.f417148h
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
            r45.dm2 r0 = r0.getObject_extend()
            r2 = 0
            if (r0 == 0) goto L31
            r3 = 44
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r3)
            r45.t94 r0 = (r45.t94) r0
            if (r0 == 0) goto L31
            boolean r0 = r0.getBoolean(r2)
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
            long r3 = r3.getId()
            java.lang.String r3 = pm0.v.u(r3)
            r0.append(r3)
            java.lang.String r3 = ", pollingData = "
            r0.append(r3)
            r45.wm2 r3 = r7.f20656g
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
            r45.dm2 r3 = r3.getObject_extend()
            r4 = 10
            r5 = 12
            if (r3 == 0) goto L91
            com.tencent.mm.protobuf.f r3 = r3.getCustom(r5)
            r45.pm2 r3 = (r45.pm2) r3
            if (r3 == 0) goto L91
            com.tencent.mm.protobuf.f r3 = r3.getCustom(r4)
            r45.wm2 r3 = (r45.wm2) r3
            if (r3 == 0) goto L91
            org.json.JSONObject r3 = pm0.b0.g(r3)
            goto L92
        L91:
            r3 = r1
        L92:
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = r7.f20654e
            com.tencent.mars.xlog.Log.i(r3, r0)
            java.lang.Class<bg2.g2> r0 = bg2.g2.class
            tc2.c r0 = r7.N6(r0)
            bg2.g2 r0 = (bg2.g2) r0
            if (r0 == 0) goto Le2
            r45.dj6 r3 = new r45.dj6
            r3.<init>()
            r45.wm2 r6 = r7.f20656g
            if (r6 != 0) goto Lce
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r8.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObject r6 = r6.getFeedObject()
            r45.dm2 r6 = r6.getObject_extend()
            if (r6 == 0) goto Lcf
            com.tencent.mm.protobuf.f r5 = r6.getCustom(r5)
            r45.pm2 r5 = (r45.pm2) r5
            if (r5 == 0) goto Lcf
            com.tencent.mm.protobuf.f r1 = r5.getCustom(r4)
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
        throw new UnsupportedOperationException("Method not decompiled: bg2.x8.onLiveStart(r45.hc1):void");
    }
}
