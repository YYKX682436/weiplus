package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class tx implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f109111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f109112e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f109113f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f109114g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f109115h;

    public tx(com.tencent.mm.plugin.finder.feed.pz pzVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, yz5.a aVar, in5.s0 s0Var, int i17) {
        this.f109111d = pzVar;
        this.f109112e = baseFinderFeed;
        this.f109113f = aVar;
        this.f109114g = s0Var;
        this.f109115h = i17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String string;
        jz5.f0 f0Var;
        cw2.da videoView;
        r45.q23 video_tmpl_info;
        r45.tz0 tz0Var;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f109111d;
        java.lang.String str = pzVar.U;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getMoreMenuItemSelectedListener] feed ");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed feed = this.f109112e;
        sb6.append(feed);
        sb6.append(' ');
        sb6.append(i17);
        sb6.append(" menuItem:");
        sb6.append(menuItem.getItemId());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        yz5.a aVar = this.f109113f;
        if (aVar != null) {
            aVar.invoke();
        }
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
        if (itemId == 215) {
            y4Var.e0(pzVar.f108755g, feed);
            return;
        }
        if (itemId == 216) {
            com.tencent.mm.ui.MMActivity context = pzVar.f108755g;
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(feed, "feed");
            r45.dm2 object_extend = feed.getFeedObject().getFeedObject().getObject_extend();
            if (object_extend == null || (string = object_extend.getString(46)) == null) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", string);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        if (itemId == 218) {
            y4Var.g0(pzVar.f108755g, feed);
            return;
        }
        in5.s0 s0Var = this.f109114g;
        if (itemId == 219) {
            y4Var.d0(pzVar.f108755g, feed, s0Var);
            return;
        }
        if (itemId == 301 || itemId == 302) {
            com.tencent.mm.ui.MMActivity activity = pzVar.f108755g;
            kotlin.jvm.internal.o.g(activity, "activity");
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.Q6((com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC) a17, this.f109114g, false, true, false, 8, null);
            return;
        }
        com.tencent.mm.plugin.finder.report.x3 x3Var = com.tencent.mm.plugin.finder.report.x3.f125432a;
        if (itemId == 99) {
            java.util.List<E> listOfType = pzVar.C.getListOfType(com.tencent.mm.plugin.finder.model.BaseFinderFeed.class);
            int indexOf = listOfType.indexOf(feed);
            if (indexOf < 0) {
                com.tencent.mars.xlog.Log.i(pzVar.U, "[not interested] pos error=" + indexOf + ", feed=" + feed + ", dataList=" + listOfType);
                return;
            }
            boolean z17 = feed instanceof so2.h1;
            bd2.r rVar = bd2.r.f19284a;
            rVar.e(pzVar.f108755g, feed.getFeedObject().getId(), feed.w(), feed.getFeedObject().getObjectNonceId(), feed.getFeedObject().isLiveFeed(), this.f109114g);
            if (!rVar.b() && z17) {
                com.tencent.mm.autogen.events.LiveNotInterestedClickEvent liveNotInterestedClickEvent = new com.tencent.mm.autogen.events.LiveNotInterestedClickEvent();
                liveNotInterestedClickEvent.f54474g.f8381a = feed.getItemId();
                liveNotInterestedClickEvent.e();
            }
            pzVar.getClass();
            if (feed.getFeedObject().isLiveFeed()) {
                com.tencent.mm.ui.MMActivity context2 = pzVar.f108755g;
                kotlin.jvm.internal.o.g(context2, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                i95.m c17 = i95.n0.c(zy2.zb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c17;
                ml2.t1 t1Var = ml2.t1.f327934a2;
                jz5.l[] lVarArr = new jz5.l[3];
                r45.nw1 liveInfo = feed.getFeedObject().getLiveInfo();
                lVarArr[0] = new jz5.l("liveId", java.lang.String.valueOf(liveInfo != null ? java.lang.Long.valueOf(liveInfo.getLong(0)) : null));
                lVarArr[1] = new jz5.l("feedId", java.lang.String.valueOf(feed.getFeedObject().getFeedObject().getId()));
                lVarArr[2] = new jz5.l("panel_sence", "1");
                zy2.zb.T8(zbVar, t1Var, kz5.c1.l(lVarArr), V6 != null ? V6.getString(1) : null, java.lang.String.valueOf(V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null), feed.g0(), null, false, 96, null);
            }
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("feed_uninterest_clk", s0Var.itemView, null, 24617);
            x3Var.c(pzVar.f108755g, "button_uninterested", feed.getItemId(), this.f109115h);
            return;
        }
        if (itemId == 116) {
            if (pzVar.f108759m != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                android.view.View p17 = s0Var.p(com.tencent.mm.R.id.f484486ee3);
                if (p17 != null) {
                    arrayList.add(p17);
                }
                com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k);
                cw2.da videoView2 = finderVideoLayout != null ? finderVideoLayout.getVideoView() : null;
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = videoView2 instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView2 : null;
                if (finderThumbPlayerProxy != null) {
                    com.tencent.mm.ui.MMActivity activity2 = pzVar.f108755g;
                    kotlin.jvm.internal.o.g(activity2, "activity");
                    androidx.lifecycle.c1 a18 = pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class);
                    kotlin.jvm.internal.o.f(a18, "get(...)");
                    com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.a7((com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC) a18, s0Var, arrayList, finderThumbPlayerProxy, null, null, null, 56, null);
                }
            }
            x3Var.c(pzVar.f108755g, "button_speedplay", feed.getItemId(), this.f109115h);
            return;
        }
        if (itemId == 213) {
            com.tencent.mm.plugin.finder.assist.k2 k2Var = com.tencent.mm.plugin.finder.assist.k2.f102306a;
            k2Var.a(feed.getFeedObject());
            k2Var.b(pzVar.f108755g);
            return;
        }
        if (itemId == 312) {
            y4Var.M(pzVar.f108755g, s0Var, feed, pzVar.F);
            return;
        }
        if (itemId == 313) {
            y4Var.K(pzVar.f108755g, feed, s0Var, menuItem);
            return;
        }
        switch (itemId) {
            case 305:
                y4Var.L(this.f109114g, true, this.f109112e, this.f109115h, pzVar.C.getDataListJustForAdapter());
                return;
            case com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RESET /* 306 */:
                y4Var.L(this.f109114g, false, this.f109112e, this.f109115h, pzVar.C.getDataListJustForAdapter());
                return;
            case com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RELEASE /* 307 */:
                com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = pzVar.f108756h;
                if (finderHomeTabFragment != null) {
                    com.tencent.mm.plugin.finder.viewmodel.component.th thVar = (com.tencent.mm.plugin.finder.viewmodel.component.th) pf5.z.f353948a.b(finderHomeTabFragment).e(com.tencent.mm.plugin.finder.viewmodel.component.th.class);
                    if (thVar != null) {
                        thVar.f136030i = true;
                    }
                    f0Var = jz5.f0.f302826a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    com.tencent.mm.ui.MMActivity activity3 = pzVar.f108755g;
                    kotlin.jvm.internal.o.g(activity3, "activity");
                    com.tencent.mm.plugin.finder.viewmodel.component.th thVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.th) pf5.z.f353948a.a(activity3).e(com.tencent.mm.plugin.finder.viewmodel.component.th.class);
                    if (thVar2 != null) {
                        thVar2.f136030i = true;
                    }
                }
                com.tencent.mm.ui.MMActivity activity4 = pzVar.f108755g;
                kotlin.jvm.internal.o.g(activity4, "activity");
                ((com.tencent.mm.plugin.finder.viewmodel.component.f2) pf5.z.f353948a.a(activity4).a(com.tencent.mm.plugin.finder.viewmodel.component.f2.class)).Q6(s0Var, false);
                x3Var.c(pzVar.f108755g, "button_minimize", feed.getItemId(), this.f109115h);
                return;
            case com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_ON_ERROR /* 308 */:
                y4Var.I(pzVar.f108755g, feed);
                return;
            case com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_SET_URL /* 309 */:
                com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout2 = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k);
                vn2.u0.f438387a.a(pzVar.U, "", pzVar.f108755g, this.f109112e, true, true, (finderVideoLayout2 == null || (videoView = finderVideoLayout2.getVideoView()) == null) ? 0.0f : ((float) videoView.getCurrentPlayMs()) / ((float) videoView.getVideoDurationMs()));
                return;
            default:
                switch (itemId) {
                    case 403:
                        c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
                        com.tencent.mm.ui.MMActivity mMActivity = pzVar.f108755g;
                        r45.s02 s02Var = new r45.s02();
                        s02Var.set(4, java.lang.Long.valueOf(c01.id.a()));
                        s02Var.set(3, 1);
                        ((b92.d1) zbVar2).uj(mMActivity, s02Var);
                        com.tencent.mm.ui.MMActivity activity5 = pzVar.f108755g;
                        kotlin.jvm.internal.o.g(activity5, "activity");
                        r45.qt2 V62 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity5).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
                        i95.m c18 = i95.n0.c(zy2.zb.class);
                        kotlin.jvm.internal.o.f(c18, "getService(...)");
                        zy2.zb.T8((zy2.zb) c18, ml2.t1.W2, kz5.c1.i(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "1")), V62.getString(1), java.lang.Integer.valueOf(V62.getInteger(5)).toString(), null, null, false, 112, null);
                        return;
                    case 404:
                        com.tencent.mars.xlog.Log.i(pzVar.U, "start live feed danmaku close");
                        zl2.q4.f473933a.J(pzVar.f108755g, false, new com.tencent.mm.plugin.finder.feed.rx(pzVar, feed));
                        com.tencent.mm.ui.MMActivity context3 = pzVar.f108755g;
                        kotlin.jvm.internal.o.g(context3, "context");
                        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                        r45.qt2 V63 = nyVar2 != null ? nyVar2.V6() : null;
                        i95.m c19 = i95.n0.c(zy2.zb.class);
                        kotlin.jvm.internal.o.f(c19, "getService(...)");
                        zy2.zb zbVar3 = (zy2.zb) c19;
                        ml2.t1 t1Var2 = ml2.t1.f327937b3;
                        jz5.l[] lVarArr2 = new jz5.l[2];
                        r45.nw1 liveInfo2 = feed.getFeedObject().getLiveInfo();
                        lVarArr2[0] = new jz5.l("liveId", java.lang.String.valueOf(liveInfo2 != null ? java.lang.Long.valueOf(liveInfo2.getLong(0)) : null));
                        lVarArr2[1] = new jz5.l("status_type", "0");
                        zy2.zb.T8(zbVar3, t1Var2, kz5.c1.l(lVarArr2), V63 != null ? V63.getString(1) : null, java.lang.String.valueOf(V63 != null ? java.lang.Integer.valueOf(V63.getInteger(5)) : null), feed.g0(), null, false, 96, null);
                        return;
                    case 405:
                        com.tencent.mars.xlog.Log.i(pzVar.U, "start live feed danmaku open");
                        zl2.q4.f473933a.J(pzVar.f108755g, true, new com.tencent.mm.plugin.finder.feed.qx(pzVar, feed));
                        com.tencent.mm.ui.MMActivity context4 = pzVar.f108755g;
                        kotlin.jvm.internal.o.g(context4, "context");
                        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar3 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context4).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                        r45.qt2 V64 = nyVar3 != null ? nyVar3.V6() : null;
                        i95.m c27 = i95.n0.c(zy2.zb.class);
                        kotlin.jvm.internal.o.f(c27, "getService(...)");
                        zy2.zb zbVar4 = (zy2.zb) c27;
                        ml2.t1 t1Var3 = ml2.t1.f327937b3;
                        jz5.l[] lVarArr3 = new jz5.l[2];
                        r45.nw1 liveInfo3 = feed.getFeedObject().getLiveInfo();
                        lVarArr3[0] = new jz5.l("liveId", java.lang.String.valueOf(liveInfo3 != null ? java.lang.Long.valueOf(liveInfo3.getLong(0)) : null));
                        lVarArr3[1] = new jz5.l("status_type", "1");
                        zy2.zb.T8(zbVar4, t1Var3, kz5.c1.l(lVarArr3), V64 != null ? V64.getString(1) : null, java.lang.String.valueOf(V64 != null ? java.lang.Integer.valueOf(V64.getInteger(5)) : null), feed.g0(), null, false, 96, null);
                        return;
                    case 406:
                        y4Var.U(pzVar.f108755g, feed.getItemId());
                        return;
                    default:
                        com.tencent.mm.plugin.finder.assist.n7 n7Var = com.tencent.mm.plugin.finder.assist.n7.f102406a;
                        switch (itemId) {
                            case 101:
                                if (zl2.q4.f473933a.C(feed)) {
                                    com.tencent.mm.ui.MMActivity context5 = pzVar.f108755g;
                                    kotlin.jvm.internal.o.g(context5, "context");
                                    com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar4 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context5).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                                    r45.qt2 V65 = nyVar4 != null ? nyVar4.V6() : null;
                                    i95.m c28 = i95.n0.c(zy2.zb.class);
                                    kotlin.jvm.internal.o.f(c28, "getService(...)");
                                    zy2.zb zbVar5 = (zy2.zb) c28;
                                    ml2.t1 t1Var4 = ml2.t1.f327936b2;
                                    jz5.l[] lVarArr4 = new jz5.l[3];
                                    r45.nw1 liveInfo4 = feed.getFeedObject().getLiveInfo();
                                    lVarArr4[0] = new jz5.l("liveId", java.lang.String.valueOf(liveInfo4 != null ? java.lang.Long.valueOf(liveInfo4.getLong(0)) : null));
                                    lVarArr4[1] = new jz5.l("feedId", pm0.v.u(feed.getFeedObject().getFeedObject().getId()));
                                    lVarArr4[2] = new jz5.l("panel_sence", "1");
                                    zy2.zb.T8(zbVar5, t1Var4, kz5.c1.l(lVarArr4), V65 != null ? V65.getString(1) : null, java.lang.String.valueOf(V65 != null ? java.lang.Integer.valueOf(V65.getInteger(5)) : null), feed.g0(), null, false, 96, null);
                                    r45.nw1 liveInfo5 = feed.getFeedObject().getLiveInfo();
                                    if (liveInfo5 != null) {
                                        long j17 = liveInfo5.getLong(0);
                                        bd2.b bVar = bd2.b.f19244a;
                                        com.tencent.mm.ui.MMActivity activity6 = pzVar.f108755g;
                                        kotlin.jvm.internal.o.g(activity6, "activity");
                                        bVar.j(activity6, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity6).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), j17, feed.getFeedObject().getUserName(), (i18 & 16) != 0 ? null : null, (i18 & 32) != 0 ? 62 : 0, (i18 & 64) != 0 ? null : feed);
                                    }
                                } else {
                                    bd2.b.c(bd2.b.f19244a, pzVar.f108755g, this.f109112e, 0L, 0, 12, null);
                                }
                                x3Var.c(pzVar.f108755g, "button_complaint", feed.getItemId(), this.f109115h);
                                return;
                            case 102:
                                android.os.Bundle bundle = new android.os.Bundle();
                                feed.getClass();
                                int i18 = this.f109115h;
                                c61.zb zbVar6 = (c61.zb) i95.n0.c(c61.zb.class);
                                ml2.t1 t1Var5 = ml2.t1.f327954i;
                                com.tencent.mm.ui.MMActivity activity7 = pzVar.f108755g;
                                kotlin.jvm.internal.o.g(activity7, "activity");
                                ((b92.d1) zbVar6).rj(t1Var5, feed, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity7).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
                                n7Var.B(pzVar.f108755g, feed.getFeedObject(), bundle, 3, new com.tencent.mm.plugin.finder.feed.sx(feed, pzVar));
                                x3Var.c(pzVar.f108755g, "button_forward_friend", feed.getItemId(), i18);
                                return;
                            case 103:
                                com.tencent.mm.plugin.finder.assist.n7.F(n7Var, pzVar.f108755g, this.f109112e, null, 0, 0, 28, null);
                                if (feed.getFeedObject().isLiveFeed()) {
                                    vs5.a aVar2 = vs5.a.f439924a;
                                    r45.nw1 liveInfo6 = feed.getFeedObject().getLiveInfo();
                                    java.lang.String valueOf = java.lang.String.valueOf(liveInfo6 != null ? java.lang.Long.valueOf(liveInfo6.getLong(0)) : null);
                                    java.lang.String valueOf2 = java.lang.String.valueOf(feed.getFeedObject().getFeedObject().getId());
                                    java.lang.String username = feed.getFeedObject().getFeedObject().getUsername();
                                    java.lang.String str2 = com.tencent.mm.plugin.finder.convert.zf.D1;
                                    aVar2.a(valueOf, valueOf2, username, com.tencent.mm.plugin.finder.convert.zf.D1, "2", "0", (i17 & 64) != 0 ? null : null, (i17 & 128) != 0 ? "" : feed.g0());
                                }
                                x3Var.c(pzVar.f108755g, "button_forward_friendcircle", feed.getItemId(), this.f109115h);
                                c61.zb zbVar7 = (c61.zb) i95.n0.c(c61.zb.class);
                                ml2.t1 t1Var6 = ml2.t1.f327964m;
                                com.tencent.mm.ui.MMActivity activity8 = pzVar.f108755g;
                                kotlin.jvm.internal.o.g(activity8, "activity");
                                ((b92.d1) zbVar7).rj(t1Var6, feed, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity8).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
                                return;
                            case 104:
                                so2.v0.b(so2.v0.f410644a, this.f109112e, pzVar.f108755g, null, null, 12, null);
                                i95.m c29 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                                kotlin.jvm.internal.o.f(c29, "getService(...)");
                                com.tencent.mm.plugin.finder.report.o3.Rk((com.tencent.mm.plugin.finder.report.o3) c29, pzVar.f108755g, true, feed.getItemId(), false, 8, null);
                                return;
                            default:
                                switch (itemId) {
                                    case 106:
                                        cu2.m.f222420a.b(pzVar.f108755g, feed, false, new com.tencent.mm.plugin.finder.feed.lx(pzVar));
                                        return;
                                    case 107:
                                        cu2.m.f222420a.b(pzVar.f108755g, feed, true, new com.tencent.mm.plugin.finder.feed.kx(pzVar));
                                        return;
                                    case 108:
                                        if (feed.e()) {
                                            com.tencent.mm.plugin.finder.assist.y4.R(y4Var, pzVar.f108755g, this.f109112e, 0, null, 12, null);
                                            return;
                                        }
                                        return;
                                    case 109:
                                        y4Var.S(pzVar.f108755g, this.f109112e, this.f109114g, this.f109115h, pzVar.f108762p);
                                        return;
                                    default:
                                        switch (itemId) {
                                            case 112:
                                                android.content.Intent intent2 = new android.content.Intent();
                                                intent2.putExtra("KEY_FROM_SCENE", 1);
                                                intent2.putExtra("KEY_USERNAME", xy2.c.e(pzVar.f108755g));
                                                intent2.putExtra("KEY_FINDER_SELF_FLAG", true);
                                                intent2.putExtra("KEY_IS_FULLSCREEN", true);
                                                intent2.putExtra("KEY_ENABLE_SWITCH_PREVIEW_MODE", false);
                                                hc2.e0.b(intent2, 0, kz5.b0.c(feed), null, null);
                                                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).al(pzVar.f108755g, intent2);
                                                return;
                                            case 113:
                                                com.tencent.mm.plugin.finder.assist.n7.H(n7Var, pzVar.f108755g, this.f109112e, null, 0, 12, null);
                                                x3Var.c(pzVar.f108755g, "textstatus_in_menu", feed.getItemId(), this.f109115h);
                                                if (feed.getFeedObject().isLiveFeed()) {
                                                    vs5.a aVar3 = vs5.a.f439924a;
                                                    r45.nw1 liveInfo7 = feed.getFeedObject().getLiveInfo();
                                                    java.lang.String valueOf3 = java.lang.String.valueOf(liveInfo7 != null ? java.lang.Long.valueOf(liveInfo7.getLong(0)) : null);
                                                    java.lang.String valueOf4 = java.lang.String.valueOf(feed.getFeedObject().getFeedObject().getId());
                                                    java.lang.String username2 = feed.getFeedObject().getFeedObject().getUsername();
                                                    java.lang.String str3 = com.tencent.mm.plugin.finder.convert.zf.D1;
                                                    aVar3.a(valueOf3, valueOf4, username2, com.tencent.mm.plugin.finder.convert.zf.D1, "3", "0", (i17 & 64) != 0 ? null : null, (i17 & 128) != 0 ? "" : null);
                                                }
                                                c61.zb zbVar8 = (c61.zb) i95.n0.c(c61.zb.class);
                                                ml2.t1 t1Var7 = ml2.t1.f327967n;
                                                com.tencent.mm.ui.MMActivity activity9 = pzVar.f108755g;
                                                kotlin.jvm.internal.o.g(activity9, "activity");
                                                ((b92.d1) zbVar8).rj(t1Var7, feed, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity9).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
                                                return;
                                            case 114:
                                                com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) s0Var.p(com.tencent.mm.R.id.ghd);
                                                kotlin.jvm.internal.o.d(finderFullSeekBarLayout);
                                                cw2.ca.d(finderFullSeekBarLayout, null, false, 3, null);
                                                com.tencent.mm.plugin.finder.assist.y5.f102716a.d(pzVar.f108755g, this.f109112e, 2L, (r24 & 8) != 0, (r24 & 16) != 0 ? "" : null, (r24 & 32) != 0 ? "" : null, (r24 & 64) != 0 ? 0 : 0, (r24 & 128) != 0 ? null : this.f109114g, new com.tencent.mm.plugin.finder.feed.mx(finderFullSeekBarLayout, pzVar));
                                                x3Var.c(pzVar.f108755g, "button_set_bell", feed.getItemId(), this.f109115h);
                                                return;
                                            default:
                                                switch (itemId) {
                                                    case 118:
                                                        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = feed.getFeedObject().getFeedObject().getObjectDesc();
                                                        r45.q23 video_tmpl_info2 = objectDesc != null ? objectDesc.getVideo_tmpl_info() : null;
                                                        if (video_tmpl_info2 == null) {
                                                            com.tencent.mm.ui.MMActivity mMActivity2 = pzVar.f108755g;
                                                            db5.t7.g(mMActivity2, mMActivity2.getString(com.tencent.mm.R.string.d0c));
                                                        } else {
                                                            android.content.Intent intent3 = new android.content.Intent();
                                                            int i19 = video_tmpl_info2.f383586e;
                                                            int i27 = i19 != 1 ? i19 != 3 ? -1 : 16 : 13;
                                                            com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
                                                            p2Var.W(p2Var.i(pzVar.f108755g, 53, false));
                                                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                                                            jSONObject.put("shoot_same_feedid", ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Ui(feed.getFeedObject().getFeedObject().getId()));
                                                            java.lang.String jSONObject2 = jSONObject.toString();
                                                            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                                                            p2Var.V(r26.i0.t(jSONObject2, ",", ";", false));
                                                            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                                                            com.tencent.mm.ui.MMActivity mMActivity3 = pzVar.f108755g;
                                                            intent3.putExtra("key_maas_entrance", 5);
                                                            intent3.putExtra("key_ref_feed_id", feed.getFeedObject().getFeedObject().getId());
                                                            intent3.putExtra("key_ref_feed_dup_flag", feed.w());
                                                            intent3.putExtra("KEY_FINDER_NEED_POST_TO_COMMENT", true);
                                                            intent3.putExtra("KEY_FINDER_TARGET_TEMPLATE_ID", video_tmpl_info2.f383585d);
                                                            intent3.putExtra("KEY_FINDER_TARGET_TEMPLATE_TYPE", video_tmpl_info2.f383586e);
                                                            ((c61.l7) b6Var).tj(mMActivity3, video_tmpl_info2, intent3, i27);
                                                            com.tencent.mm.plugin.finder.report.p2.L(p2Var, pzVar.f108755g, 93, video_tmpl_info2, 0L, 0, 24, null);
                                                        }
                                                        com.tencent.mm.ui.MMActivity activity10 = pzVar.f108755g;
                                                        kotlin.jvm.internal.o.g(activity10, "activity");
                                                        r45.qt2 V66 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity10).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
                                                        com.tencent.mm.plugin.finder.report.b6 b6Var2 = com.tencent.mm.plugin.finder.report.b6.f124969a;
                                                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                                                        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = feed.getFeedObject().getFeedObject().getObjectDesc();
                                                        java.lang.Object obj = (objectDesc2 == null || (video_tmpl_info = objectDesc2.getVideo_tmpl_info()) == null) ? null : video_tmpl_info.f383585d;
                                                        if (obj == null) {
                                                            obj = 0;
                                                        }
                                                        jSONObject3.put("templateId", obj);
                                                        b6Var2.c(V66, "shoot_same_video", true, jSONObject3);
                                                        return;
                                                    case 119:
                                                        y4Var.X(pzVar.f108755g, feed);
                                                        return;
                                                    case 120:
                                                        com.tencent.mm.ui.MMActivity activity11 = pzVar.f108755g;
                                                        kotlin.jvm.internal.o.g(activity11, "activity");
                                                        kotlin.jvm.internal.o.g(feed, "feed");
                                                        fe0.k4 k4Var = (fe0.k4) i95.n0.c(fe0.k4.class);
                                                        byte[] byteArray = feed.getFeedObject().getFeedObject().toByteArray();
                                                        ((ee0.n4) k4Var).getClass();
                                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                                                        if (byteArray == null) {
                                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                                                            return;
                                                        } else {
                                                            je4.a.f299315a.a(activity11, 2, byteArray, 0, 9);
                                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                                                            return;
                                                        }
                                                    case 121:
                                                        y4Var.Q(pzVar.f108755g, feed);
                                                        return;
                                                    default:
                                                        int i28 = this.f109115h;
                                                        switch (itemId) {
                                                            case 200:
                                                                y4Var.Y(feed, pzVar.f108755g, cu2.f0.f222391a.f(feed.getFeedObject().getFromAppId()));
                                                                return;
                                                            case 201:
                                                                y4Var.h0(pzVar.f108755g, feed);
                                                                return;
                                                            case 202:
                                                                xc2.y2 y2Var = xc2.y2.f453343a;
                                                                com.tencent.mm.ui.MMActivity mMActivity4 = pzVar.f108755g;
                                                                pzVar.getClass();
                                                                y2Var.V(mMActivity4, feed, i28, false);
                                                                return;
                                                            default:
                                                                switch (itemId) {
                                                                    case 207:
                                                                        y4Var.f0(pzVar.f108755g, feed, i28);
                                                                        return;
                                                                    case 208:
                                                                        n7Var.I(pzVar.f108755g, feed.getFeedObject());
                                                                        return;
                                                                    case 209:
                                                                        com.tencent.mm.ui.MMActivity context6 = pzVar.f108755g;
                                                                        kotlin.jvm.internal.o.g(context6, "context");
                                                                        kotlin.jvm.internal.o.g(feed, "feed");
                                                                        r45.dm2 object_extend2 = feed.getFeedObject().getFeedObject().getObject_extend();
                                                                        if (object_extend2 == null || (tz0Var = (r45.tz0) object_extend2.getCustom(11)) == null || (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) tz0Var.getCustom(0)) == null) {
                                                                            return;
                                                                        }
                                                                        xc2.y2.i(xc2.y2.f453343a, context6, new xc2.p0(finderJumpInfo), 0, null, 12, null);
                                                                        return;
                                                                    case 210:
                                                                        y4Var.j0(pzVar.f108755g, feed, s0Var);
                                                                        return;
                                                                    default:
                                                                        ((com.tencent.mm.pluginsdk.forward.m) pzVar.f108766r).aj((db5.h4) menuItem, new com.tencent.mm.plugin.finder.feed.px(feed, pzVar, menuItem, i28));
                                                                        return;
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }
}
