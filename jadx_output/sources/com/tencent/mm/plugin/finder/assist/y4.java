package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class y4 {

    /* renamed from: a */
    public static final com.tencent.mm.plugin.finder.assist.y4 f102714a = new com.tencent.mm.plugin.finder.assist.y4();

    /* renamed from: b */
    public static final zy2.gc f102715b = new com.tencent.mm.plugin.finder.assist.m4();

    /* JADX WARN: Removed duplicated region for block: B:66:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.mm.plugin.finder.assist.i4 N(com.tencent.mm.plugin.finder.assist.y4 r26, android.content.Context r27, com.tencent.mm.plugin.finder.model.BaseFinderFeed r28, int r29, yz5.l r30, yz5.l r31, int r32, java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.assist.y4.N(com.tencent.mm.plugin.finder.assist.y4, android.content.Context, com.tencent.mm.plugin.finder.model.BaseFinderFeed, int, yz5.l, yz5.l, int, java.lang.Object):com.tencent.mm.plugin.finder.assist.i4");
    }

    public static void R(com.tencent.mm.plugin.finder.assist.y4 y4Var, android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, int i17, yz5.l lVar, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        if ((i18 & 8) != 0) {
            lVar = null;
        }
        y4Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        cu2.t tVar = cu2.u.f222441a;
        if (i17 == 0) {
            i17 = com.tencent.mm.R.string.eyd;
        }
        db5.e1.n(context, i17, 0, new cu2.p(context, feed, lVar), null);
    }

    public static /* synthetic */ void T(com.tencent.mm.plugin.finder.assist.y4 y4Var, android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 16) != 0) {
            i18 = 0;
        }
        y4Var.S(context, baseFinderFeed, s0Var, i17, i18);
    }

    public static /* synthetic */ void b0(com.tencent.mm.plugin.finder.assist.y4 y4Var, android.content.Context context, android.view.View view, java.lang.String str, java.util.Map map, boolean z17, java.lang.Integer num, int i17, java.lang.Object obj) {
        if ((i17 & 16) != 0) {
            z17 = false;
        }
        boolean z18 = z17;
        if ((i17 & 32) != 0) {
            num = null;
        }
        y4Var.a0(context, view, str, map, z18, num);
    }

    public static void u(com.tencent.mm.plugin.finder.assist.y4 y4Var, db5.g4 menu, android.content.Context context, int i17, int i18, int i19, boolean z17, boolean z18, int i27, java.lang.Object obj) {
        if ((i27 & 64) != 0) {
            z18 = false;
        }
        y4Var.getClass();
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(context, "context");
        if (z17) {
            menu.l(i18, context.getString(com.tencent.mm.R.string.f47), com.tencent.mm.R.raw.icons_outlined_unlock, z18);
        } else {
            menu.l(i19, context.getString(com.tencent.mm.R.string.f492070f46), com.tencent.mm.R.raw.finder_icons_outlined_lock, z18);
        }
    }

    public final void A(android.content.Context context, db5.g4 menu, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(feed, "feed");
        com.tencent.mm.protocal.protobuf.FinderObject feedObject = feed.getFeedObject().getFeedObject();
        jz5.g gVar = hc2.o0.f280336a;
        if ((((feedObject != null ? feedObject.getPermissionFlag() : 0) & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62) == 0) && ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).wi() && !feed.getFeedObject().isMemberFeed()) {
            com.tencent.mm.ui.component.UIComponentActivity uIComponentActivity = context instanceof com.tencent.mm.ui.component.UIComponentActivity ? (com.tencent.mm.ui.component.UIComponentActivity) context : null;
            if (uIComponentActivity != null ? uIComponentActivity.containUIC(com.tencent.mm.plugin.finder.viewmodel.component.zd.class) : false) {
                menu.j(120, context.getResources().getString(com.tencent.mm.R.string.f4y), com.tencent.mm.R.raw.icon_color_momentcover, 0, false);
            }
        }
    }

    public final void B(android.content.Context context, db5.g4 menu, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.plugin.finder.assist.i4 actionMenuInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(actionMenuInfo, "actionMenuInfo");
        if (actionMenuInfo.f102259i) {
            return;
        }
        menu.j(102, actionMenuInfo.f102255e, com.tencent.mm.R.raw.finder_icons_filled_share, context.getResources().getColor(com.tencent.mm.R.color.f478502m), actionMenuInfo.f102251a);
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        ml2.u1 u1Var = ml2.u1.f328062m;
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((b92.d1) zbVar).sj(u1Var, feed, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
    }

    public final void C(android.content.Context context, db5.g4 menu, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.plugin.finder.assist.i4 actionMenuInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(actionMenuInfo, "actionMenuInfo");
        if (actionMenuInfo.f102260j) {
            return;
        }
        menu.j(103, actionMenuInfo.f102256f, com.tencent.mm.R.raw.bottomsheet_icon_moment, 0, actionMenuInfo.f102252b);
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        ml2.u1 u1Var = ml2.u1.f328065n;
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((b92.d1) zbVar).sj(u1Var, feed, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
    }

    public final void D(android.content.Context context, db5.g4 menu, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(feed, "feed");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.X4).getValue()).r()).intValue() == 1) {
            com.tencent.mm.protocal.protobuf.FinderObject feedObject = feed.getFeedObject().getFeedObject();
            jz5.g gVar = hc2.o0.f280336a;
            kotlin.jvm.internal.o.g(feedObject, "<this>");
            boolean z17 = (feedObject.getPermissionFlag() & 16) == 0;
            boolean e17 = feedObject.getLiveInfo() != null ? hc2.o0.e(feedObject) : true;
            r45.dm2 object_extend = feedObject.getObject_extend();
            if (((object_extend != null ? object_extend.getInteger(2) : 0) & 4) <= 0 && z17 && e17) {
                com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                long itemId = feed.getItemId();
                o3Var.getClass();
                pf5.z zVar = pf5.z.f353948a;
                boolean z18 = context instanceof androidx.appcompat.app.AppCompatActivity;
                if (!z18) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context;
                r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
                com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct finderShowInWXProfileStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct();
                finderShowInWXProfileStruct.s(V6.getString(0));
                finderShowInWXProfileStruct.f57827e = finderShowInWXProfileStruct.b("findercontextid", V6.getString(1), true);
                finderShowInWXProfileStruct.p(java.lang.String.valueOf(V6.getInteger(5)));
                finderShowInWXProfileStruct.f57829g = 0;
                finderShowInWXProfileStruct.q("textstatus_in_menu");
                finderShowInWXProfileStruct.r(java.lang.String.valueOf(c01.id.c()));
                finderShowInWXProfileStruct.t(new cl0.g().h("feedid", pm0.v.u(itemId)).toString());
                finderShowInWXProfileStruct.k();
                java.lang.String string = context.getString(com.tencent.mm.R.string.f492074f53);
                int color = context.getResources().getColor(com.tencent.mm.R.color.f478496g);
                com.tencent.mm.protocal.protobuf.FinderObject feedObject2 = feed.getFeedObject().getFeedObject();
                kotlin.jvm.internal.o.g(feedObject2, "<this>");
                menu.j(113, string, com.tencent.mm.R.raw.state_icon_main, color, (feedObject2.getPermissionFlag() & 32768) > 0);
                c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
                ml2.u1 u1Var = ml2.u1.f328068o;
                if (!z18) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((b92.d1) zbVar).sj(u1Var, feed, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
            }
        }
    }

    public final void E(db5.g4 menu, com.tencent.mm.plugin.finder.assist.i4 actionMenuInfo) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(actionMenuInfo, "actionMenuInfo");
        if (actionMenuInfo.f102262l) {
            return;
        }
        menu.j(208, actionMenuInfo.f102258h, com.tencent.mm.R.raw.bottomsheet_icon_wework, 0, actionMenuInfo.f102254d);
    }

    public final void F(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, db5.g4 menu) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(menu, "menu");
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127920rg).getValue()).r()).booleanValue() || (feed instanceof so2.h1)) {
            return;
        }
        menu.j(219, context.getResources().getString(com.tencent.mm.R.string.o6l), com.tencent.mm.R.raw.finder_menu_send_to_desktop, 0, false);
    }

    public final void G(db5.g4 menu, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, java.lang.String playCtrlWording) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(playCtrlWording, "playCtrlWording");
        if (hc2.o0.r(feed.getFeedObject().getFeedObject())) {
            com.tencent.mars.xlog.Log.i("FinderMenuUtil", "addSpeedCtrl: isDisableSpeedControl");
            return;
        }
        if (feed.h() != 4) {
            com.tencent.mars.xlog.Log.i("FinderMenuUtil", "addSpeedCtrl: is not feed");
        } else if (!feed.getFeedTipsStatus().f477477c.f477484a) {
            menu.g(116, playCtrlWording, com.tencent.mm.R.raw.icons_outlined_play_control_2);
        } else {
            menu.w(116, playCtrlWording, com.tencent.mm.R.raw.icons_outlined_play_control_2);
            feed.getFeedTipsStatus().f477477c.f477484a = false;
        }
    }

    public final void H(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, db5.g4 menu) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(menu, "menu");
        boolean isTeenMode = ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode();
        r45.nr2 finder_promotion_jumpinfo = feed.getFeedObject().getFeedObject().getFinder_promotion_jumpinfo();
        if (finder_promotion_jumpinfo != null) {
            java.lang.String string = finder_promotion_jumpinfo.getString(3);
            if (string == null || string.length() == 0) {
                string = context.getString(com.tencent.mm.R.string.nxb);
            }
            com.tencent.mars.xlog.Log.i("FinderMenuUtil", "promotion=" + string);
            if (isTeenMode) {
                menu.l(202, string, com.tencent.mm.R.raw.icon_outlined_promote, true);
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ((com.tencent.mm.plugin.finder.report.o3) c17).Vk(context, false, feed.getFeedObject().getId(), (r22 & 8) != 0 ? 0 : 3, (r22 & 16) != 0 ? "" : null, (r22 & 32) != 0 ? 0 : 0, finder_promotion_jumpinfo.getInteger(4), feed.getFeedObject().getFeedObject().getSessionBuffer());
                return;
            }
            menu.g(202, string, com.tencent.mm.R.raw.icon_outlined_promote);
            i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ((com.tencent.mm.plugin.finder.report.o3) c18).Vk(context, false, feed.getFeedObject().getId(), (r22 & 8) != 0 ? 0 : 0, (r22 & 16) != 0 ? "" : null, (r22 & 32) != 0 ? 0 : 0, finder_promotion_jumpinfo.getInteger(4), feed.getFeedObject().getFeedObject().getSessionBuffer());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(android.app.Activity r20, com.tencent.mm.plugin.finder.model.BaseFinderFeed r21) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.assist.y4.I(android.app.Activity, com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }

    public final void J(android.content.Context context, com.tencent.mm.plugin.finder.storage.FinderItem feed, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        hb2.b0 b0Var = hb2.b0.f280025e;
        long id6 = feed.getId();
        feed.getFeedObject();
        java.lang.String objectNonceId = feed.getObjectNonceId();
        zy2.gc gcVar = f102715b;
        b0Var.getClass();
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        r45.wh2 wh2Var = new r45.wh2();
        wh2Var.set(0, java.lang.Long.valueOf(id6));
        wh2Var.set(1, 2);
        wh2Var.set(2, java.lang.Integer.valueOf(z17 ? 1 : 0));
        wh2Var.set(3, objectNonceId);
        hb2.w0.m(b0Var, wh2Var, gcVar, false, false, null, null, 60, null);
    }

    public final void K(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder, android.view.MenuItem menuItem) {
        android.content.Intent intent;
        com.tencent.mm.protocal.protobuf.FinderContact contact;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.gg ggVar = (com.tencent.mm.plugin.finder.viewmodel.component.gg) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class);
        ggVar.getClass();
        kd2.w S6 = ggVar.S6();
        S6.getClass();
        ya2.b2 contact2 = feed.getContact();
        boolean z17 = false;
        if (contact2 == null) {
            com.tencent.mm.protocal.protobuf.FinderContact contact3 = feed.getFeedObject().getFeedObject().getContact();
            java.lang.String username = contact3 != null ? contact3.getUsername() : null;
            contact2 = ((username == null || username.length() == 0) || (contact = feed.getFeedObject().getFeedObject().getContact()) == null) ? null : ya2.d.h(contact, null, false, 3, null);
        }
        if (contact2 != null) {
            S6.f93132d.f93063x = contact2.w0();
            S6.f93132d.f93057r = contact2.getAvatarUrl();
        }
        r45.yj4 yj4Var = new r45.yj4();
        yj4Var.set(0, pm0.v.u(feed.getFeedObject().getFeedObject().getId()));
        yj4Var.set(3, 0);
        java.util.LinkedList list = yj4Var.getList(1);
        if (list != null) {
            list.clear();
        }
        java.util.LinkedList list2 = yj4Var.getList(6);
        if (list2 != null) {
            list2.clear();
        }
        java.util.LinkedList list3 = yj4Var.getList(6);
        if (list3 != null) {
            list3.add(feed.getFeedObject().getFeedObject());
        }
        r45.hl2 client_local_buffer = feed.getFeedObject().getFeedObject().getClient_local_buffer();
        yj4Var.set(7, java.lang.Long.valueOf(client_local_buffer != null ? client_local_buffer.getLong(0) : c01.id.c()));
        feed.getFeedObject().getFeedObject().getUrlValidDuration();
        S6.f93132d.f93049g = pm0.v.u(feed.getFeedObject().getFeedObject().getId());
        android.content.Context context2 = holder.f293121e;
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context2;
        yj4Var.set(13, activity.getClass().getName());
        android.app.Activity activity2 = context2 instanceof android.app.Activity ? activity : null;
        if (activity2 != null && (intent = activity2.getIntent()) != null && intent.getIntExtra("FROM_SCENE_KEY", 2) == 6) {
            z17 = true;
        }
        yj4Var.set(14, java.lang.Boolean.valueOf(z17));
        S6.f93132d.G.putByteArray("KEY_FLOAT_BALL_INFO", yj4Var.toByteArray());
        S6.t().f93086f = 24;
        S6.e();
        S6.f306856v.f306706m = ((com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k)).getBitmap();
        S6.A(true, 2);
        if ((menuItem instanceof db5.h4) && ((db5.h4) menuItem).f228363d) {
            ((ov.f0) ((pv.c0) i95.n0.c(pv.c0.class))).Ai(pv.b0.f358484i);
        }
    }

    public final void L(in5.s0 holder, boolean z17, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, int i17, java.util.List dataList) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(dataList, "dataList");
        com.tencent.mm.plugin.finder.report.x3 x3Var = com.tencent.mm.plugin.finder.report.x3.f125432a;
        android.content.Context context = holder.f293121e;
        if (!z17) {
            ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).pj(false);
            db5.t7.makeText(context, com.tencent.mm.R.string.cva, 0).show();
            kotlin.jvm.internal.o.d(context);
            x3Var.c(context, "close_auto_slide", feed.getItemId(), i17);
            return;
        }
        ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).pj(true);
        db5.t7.makeText(context, com.tencent.mm.R.string.cvb, 0).show();
        kotlin.jvm.internal.o.d(context);
        x3Var.c(context, "open_auto_slide", feed.getItemId(), i17);
        int adapterPosition = holder.getAdapterPosition();
        androidx.recyclerview.widget.f2 f2Var = holder.f293122f;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = f2Var instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) f2Var : null;
        int a07 = adapterPosition - (wxRecyclerAdapter != null ? wxRecyclerAdapter.a0() : 0);
        com.tencent.mars.xlog.Log.i("FinderMenuUtil", "enableAutoScroll: fixPosition=" + a07 + ", adapterPos=" + holder.getAdapterPosition() + ", dataSize=" + dataList.size());
        int size = dataList.size();
        for (int i18 = a07 + 1; i18 < size; i18++) {
            java.lang.Object a08 = kz5.n0.a0(dataList, i18);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = a08 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) a08 : null;
            if (baseFinderFeed != null) {
                if (!(baseFinderFeed.getFeedObject().isLiveFeed() && !baseFinderFeed.getHasExposed())) {
                    baseFinderFeed = null;
                }
                if (baseFinderFeed != null) {
                    com.tencent.mars.xlog.Log.i("FinderMenuUtil", "enableAutoScroll: delete, index=" + i18 + ", feedId=" + pm0.v.u(baseFinderFeed.getItemId()));
                    com.tencent.mm.autogen.events.FeedDeleteEvent feedDeleteEvent = new com.tencent.mm.autogen.events.FeedDeleteEvent();
                    feedDeleteEvent.f54247g.f6437a = baseFinderFeed.getFeedObject().getId();
                    feedDeleteEvent.e();
                }
            }
        }
        java.lang.Long l17 = fd2.j.f261272m;
        if (l17 == null) {
            i95.m c17 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.sdk.platformtools.o4 o4Var = ((cq.k) c17).f221226g.f242285b;
            l17 = java.lang.Long.valueOf(o4Var != null ? o4Var.q("KEY_FINDER_ENABLE_AUTO_SCROLL_COUNT", 0L) : 0L);
            fd2.j.f261272m = l17;
        }
        if (l17 != null) {
            long longValue = l17.longValue() + 1;
            fd2.j.f261272m = java.lang.Long.valueOf(longValue);
            i95.m c18 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            com.tencent.mm.sdk.platformtools.o4 o4Var2 = ((cq.k) c18).f221226g.f242285b;
            if (o4Var2 != null) {
                o4Var2.B("KEY_FINDER_ENABLE_AUTO_SCROLL_COUNT", longValue);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(android.content.Context r47, in5.s0 r48, com.tencent.mm.plugin.finder.model.BaseFinderFeed r49, cw2.f8 r50) {
        /*
            Method dump skipped, instructions count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.assist.y4.M(android.content.Context, in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed, cw2.f8):void");
    }

    public final long O(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        cw2.da S6 = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler.class)).S6(context);
        long videoDurationMs = S6 != null ? S6.getVideoDurationMs() : 0L;
        return videoDurationMs > 0 ? videoDurationMs : bu2.z.b(baseFinderFeed.getFeedObject().getFeedObject());
    }

    public final void P(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        r45.cv0 cv0Var;
        r45.dm2 object_extend;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        java.lang.String u17 = pm0.v.u(feed.getItemId());
        com.tencent.mm.protocal.protobuf.FinderObject feedObject = feed.getFeedObject().getFeedObject();
        jz5.g gVar = hc2.o0.f280336a;
        if (!((((feedObject == null || (object_extend = feedObject.getObject_extend()) == null) ? 0L : object_extend.getLong(30)) & 2) == 2)) {
            com.tencent.mars.xlog.Log.i("FinderMenuUtil", "[handleAddTipsClick] feeId:" + u17 + " can not click");
            return;
        }
        r45.dm2 object_extend2 = feed.getFeedObject().getFeedObject().getObject_extend();
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (object_extend2 == null || (cv0Var = (r45.cv0) object_extend2.getCustom(31)) == null) ? null : (com.tencent.mm.protocal.protobuf.FinderJumpInfo) cv0Var.getCustom(0);
        if (finderJumpInfo != null) {
            ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).tl(context, finderJumpInfo, kz5.b1.e(new jz5.l("object_id", pm0.v.u(feed.getItemId()))), feed, new com.tencent.mm.plugin.finder.assist.o4(feed));
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderMenuUtil", "[handleAddTipsClick] feeId:" + u17 + " jumpInfo is null");
    }

    public final void Q(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        r45.dn2 dn2Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        java.lang.String u17 = pm0.v.u(feed.getItemId());
        r45.dm2 object_extend = feed.getFeedObject().getFeedObject().getObject_extend();
        if (object_extend == null || (dn2Var = (r45.dn2) object_extend.getCustom(29)) == null) {
            com.tencent.mars.xlog.Log.i("FinderMenuUtil", "[handleDeclareOriginalClick] feedId:" + u17 + ", originalInfo is null");
            return;
        }
        com.tencent.mm.protocal.protobuf.FinderObject feedObject = feed.getFeedObject().getFeedObject();
        jz5.g gVar = hc2.o0.f280336a;
        boolean z17 = ((feedObject != null ? feedObject.getPermissionFlag() : 0) & 1073741824) == 0;
        boolean z18 = dn2Var.getInteger(0) == 4;
        boolean e17 = hc2.s.e(ya2.h.f460484a.b(feed.getFeedObject().getUserName()));
        boolean z19 = feed.h() == 2;
        long O = O(context, feed);
        boolean z27 = e17 || !z17 || z18 || z19 || ((O > 5000L ? 1 : (O == 5000L ? 0 : -1)) < 0);
        com.tencent.mars.xlog.Log.i("FinderMenuUtil", "[handleDeclareOriginalClick] feedId:" + u17 + ", original_audit_status:" + dn2Var.getInteger(0) + " original_plan_ver:" + dn2Var.getInteger(1) + " disable:" + z27 + " canDeclare:" + z17 + " isReject:" + z18 + " isForbidden:" + e17 + " isPhoto:" + z19 + " duration:" + O);
        if (z27) {
            java.lang.String b17 = com.tencent.mm.plugin.finder.assist.n5.f102402a.b(context, e17, feed.h(), O);
            if (b17.length() == 0) {
                b17 = context.getResources().getString(com.tencent.mm.R.string.f491971lk5);
                kotlin.jvm.internal.o.f(b17, "getString(...)");
            }
            db5.t7.m(context, b17);
            return;
        }
        if (dn2Var.getInteger(1) == 1) {
            k0(context, feed, true);
            return;
        }
        int integer = dn2Var.getInteger(0);
        if (integer == 1) {
            k0(context, feed, false);
        } else if (integer == 2) {
            com.tencent.mm.plugin.finder.assist.n5.f102402a.e(context, u17, 1);
        } else if (integer == 3) {
            com.tencent.mm.plugin.finder.assist.n5.f102402a.e(context, u17, 2);
        }
    }

    public final void S(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 s0Var, int i17, int i18) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        pf5.u uVar = pf5.u.f353936a;
        int i19 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.b(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n;
        if (i19 == 52 && (context instanceof com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI)) {
            ((com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI) context).onBackPressed();
        } else {
            com.tencent.mm.protocal.protobuf.FinderJumpInfo X6 = ((xc2.k0) uVar.e(zy2.b6.class).a(xc2.k0.class)).X6(context, feed.getItemId(), i19, feed.w());
            bu2.j jVar = bu2.j.f24534a;
            com.tencent.mm.plugin.finder.storage.FinderItem feedObject = feed.getFeedObject();
            bu2.i iVar = bu2.i.f24521b;
            jVar.n(feedObject, bu2.i.f24522c);
            if (X6 != null) {
                xc2.y2 y2Var = xc2.y2.f453343a;
                xc2.p0 p0Var = new xc2.p0(X6);
                p0Var.f453244f = feed;
                p0Var.f453247i = "share_panel";
                p0Var.L = true;
                xc2.y2.i(y2Var, context, p0Var, 0, s0Var, 4, null);
                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).zk(context, 1, 1, java.lang.Integer.valueOf(feed.getFeedObject().field_finderObject.getFollow_feed_count()));
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null && feed.getFeedObject().isPostFinish()) {
                android.content.Intent intent = new android.content.Intent();
                long itemId = feed.getItemId();
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                int integer = V6 != null ? V6.getInteger(5) : 0;
                intent.putExtra("key_feed_id", itemId);
                intent.putExtra("key_feed_dup_flag", feed.w());
                intent.putExtra("key_ref_feed_id", itemId);
                intent.putExtra("key_ref_feed_dup_flag", feed.w());
                intent.putExtra("KEY_FINDER_NEED_POST_TO_COMMENT", true);
                intent.putExtra("key_source_postion", 3);
                intent.putExtra("key_ref_comment_scene", integer);
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                com.tencent.mm.plugin.finder.assist.i0.Rk((com.tencent.mm.plugin.finder.assist.i0) c17, context, intent, false, 4, null);
                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).zk(context, 1, 1, java.lang.Integer.valueOf(feed.getFeedObject().field_finderObject.getFollow_feed_count()));
            }
        }
        com.tencent.mm.plugin.finder.report.x3.f125432a.c(context, "button_original_sound", feed.getItemId(), i17);
    }

    public final void U(com.tencent.mm.ui.MMActivity context, long j17) {
        boolean z17;
        kotlin.jvm.internal.o.g(context, "context");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (z17) {
            return;
        }
        az2.f a17 = az2.c.a(az2.f.f16125d, context, context.getString(com.tencent.mm.R.string.f490604zq), 500L, null, 8, null);
        a17.a();
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.assist.p4 p4Var = new com.tencent.mm.plugin.finder.assist.p4(a17, context);
        com.tencent.mm.plugin.finder.assist.q4 q4Var = new com.tencent.mm.plugin.finder.assist.q4(a17, context);
        pq5.g l17 = new bq.j0(V6, j17).l();
        l17.f(context);
        pm0.v.T(l17, new cq.p(p4Var, q4Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        boolean disableHelpPromotion = feed.getFeedObject().disableHelpPromotion();
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        boolean z17 = !disableHelpPromotion;
        hb2.f0 f0Var = hb2.f0.f280042e;
        f0Var.getClass();
        androidx.lifecycle.y yVar = context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null;
        if (yVar == null) {
            return;
        }
        hb2.e0 e0Var = new hb2.e0(feed, z17, context);
        long itemId = feed.getItemId();
        if (!z17) {
            f0Var.n(yVar, true, itemId, e0Var);
            return;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488793ag3, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487334ob5)).setText(context.getResources().getString(com.tencent.mm.R.string.a_7));
        k0Var.s(inflate, false);
        k0Var.f211872n = new hb2.c0(context);
        k0Var.f211881s = new hb2.d0(yVar, itemId, e0Var);
        k0Var.v();
    }

    /* JADX WARN: Removed duplicated region for block: B:206:0x0724 A[EDGE_INSN: B:206:0x0724->B:207:0x0724 BREAK  A[LOOP:1: B:193:0x06f6->B:224:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:224:? A[LOOP:1: B:193:0x06f6->B:224:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0828  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W(android.content.Context r38, android.view.View r39, int r40, android.view.MenuItem r41, com.tencent.mm.plugin.finder.model.BaseFinderFeed r42) {
        /*
            Method dump skipped, instructions count: 2504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.assist.y4.W(android.content.Context, android.view.View, int, android.view.MenuItem, com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }

    public final void X(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        r45.ao2 a17;
        r45.sd1 sd1Var;
        r45.mb4 mb4Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        m92.b j37 = g92.a.j3(g92.b.f269769e, xy2.c.e(context), false, 2, null);
        if (j37 == null || (a17 = k92.a.a(j37)) == null || (sd1Var = (r45.sd1) a17.getCustom(3)) == null || (mb4Var = (r45.mb4) kz5.n0.Z(feed.getFeedObject().getMediaList())) == null) {
            return;
        }
        java.lang.String str = mb4Var.getString(0) + mb4Var.getString(18);
        if (str == null) {
            return;
        }
        uo2.m0.f429633b.a(context, sd1Var, "tid=" + feed.getItemId(), new com.tencent.mm.plugin.finder.assist.r4(str));
    }

    public final com.tencent.mm.ui.widget.dialog.j0 Y(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, android.app.Activity context, r45.xa5 xa5Var) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("FinderMenuUtil", "handleSameStyleClick");
        boolean z17 = false;
        if (com.tencent.mm.sdk.platformtools.t8.K0(xy2.c.e(context))) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_create_scene", 5);
            intent.putExtra("key_router_to_profile", false);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).qj(context, intent);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20694, 1);
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.o3.ij(o3Var, 1, "miaojian_createsame", "", nyVar != null ? nyVar.V6() : null, null, 16, null);
            return null;
        }
        if (xa5Var == null || com.tencent.mm.sdk.platformtools.t8.K0(xa5Var.getString(9))) {
            return null;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(xa5Var.getString(9))) {
            ci0.s sVar = (ci0.s) i95.n0.c(ci0.s.class);
            java.lang.String string = xa5Var.getString(9);
            if (string == null) {
                string = "";
            }
            java.lang.String string2 = xa5Var.getString(10);
            if (string2 == null) {
                string2 = "";
            }
            z17 = ((pc0.k) sVar).wi(context, string, string2);
        }
        if (z17) {
            i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var2 = (com.tencent.mm.plugin.finder.report.o3) c18;
            java.lang.String fromAppExtInfo = feed.getFeedObject().getFromAppExtInfo();
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.o3.ij(o3Var2, 1, "miaojian_createsame", fromAppExtInfo, nyVar2 != null ? nyVar2.V6() : null, null, 16, null);
            i95.m c19 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var3 = (com.tencent.mm.plugin.finder.report.o3) c19;
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar3 = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.o3.ij(o3Var3, 0, "miaojian_createsame_tips", "{\"if_has_set\": 1}", nyVar3 != null ? nyVar3.V6() : null, null, 16, null);
        } else {
            i95.m c27 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c27, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var4 = (com.tencent.mm.plugin.finder.report.o3) c27;
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar4 = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.o3.ij(o3Var4, 1, "miaojian_createsame", "", nyVar4 != null ? nyVar4.V6() : null, null, 16, null);
            i95.m c28 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c28, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var5 = (com.tencent.mm.plugin.finder.report.o3) c28;
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar5 = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.o3.ij(o3Var5, 0, "miaojian_createsame_tips", "{\"if_has_set\": 0}", nyVar5 != null ? nyVar5.V6() : null, null, 16, null);
        }
        java.lang.String Zi = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(context, xa5Var.getString(4));
        if (Zi == null) {
            Zi = "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String string3 = xa5Var.getString(7);
        sb6.append(string3 != null ? string3 : "");
        sb6.append(feed.getFeedObject().getFromAppExtInfo());
        java.lang.String sb7 = sb6.toString();
        com.tencent.mars.xlog.Log.i("FinderMenuUtil", "universalLink " + sb7);
        return db5.e1.A(context, z17 ? context.getString(com.tencent.mm.R.string.f3a, Zi) : context.getString(com.tencent.mm.R.string.f3_, Zi), "", context.getString(com.tencent.mm.R.string.f490507x1), context.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.finder.assist.s4(z17, context, sb7, xa5Var), com.tencent.mm.plugin.finder.assist.t4.f102549d);
    }

    public final void Z(android.content.Intent data) {
        kotlin.jvm.internal.o.g(data, "data");
        ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("selectFinderAsCover", "com.tencent.mm.feature.sns.SnsFeatureService");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("selectFinderAsCover", "com.tencent.mm.plugin.sns.util.SetSnsBgFromFinderUtils");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
        try {
            finderObject.parseFrom(data.getByteArrayExtra("SELECT_OBJECT"));
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("SetSnsBgFromFinderUtils", e17, "FinderObject error", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.model.l4.Nj().q(finderObject);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectFinderAsCover", "com.tencent.mm.plugin.sns.util.SetSnsBgFromFinderUtils");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectFinderAsCover", "com.tencent.mm.feature.sns.SnsFeatureService");
    }

    public final void a(android.content.Context context, db5.g4 menu, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        r45.dm2 object_extend;
        r45.cv0 cv0Var;
        r45.dm2 object_extend2;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(feed, "feed");
        java.lang.String u17 = pm0.v.u(feed.getItemId());
        com.tencent.mm.protocal.protobuf.FinderObject feedObject = feed.getFeedObject().getFeedObject();
        jz5.g gVar = hc2.o0.f280336a;
        long j17 = 0;
        long j18 = (feedObject == null || (object_extend2 = feedObject.getObject_extend()) == null) ? 0L : object_extend2.getLong(30);
        boolean z17 = false;
        if (!((j18 & 1) == 1 || (j18 & 2) == 2)) {
            com.tencent.mars.xlog.Log.i("FinderMenuUtil", "[addAddTipsMenu] feeId:" + u17 + " no permission");
            return;
        }
        r45.dm2 object_extend3 = feed.getFeedObject().getFeedObject().getObject_extend();
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (object_extend3 == null || (cv0Var = (r45.cv0) object_extend3.getCustom(31)) == null) ? null : (com.tencent.mm.protocal.protobuf.FinderJumpInfo) cv0Var.getCustom(0);
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2 = feed.getFeedObject().getFeedObject();
        if (feedObject2 != null && (object_extend = feedObject2.getObject_extend()) != null) {
            j17 = object_extend.getLong(30);
        }
        if (((j17 & 2) == 2) && finderJumpInfo != null) {
            z17 = true;
        }
        java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.f493753ox3);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        menu.i(122, string, z17 ? context.getResources().getColor(com.tencent.mm.R.color.FG_1) : context.getResources().getColor(com.tencent.mm.R.color.FG_2), com.tencent.mm.R.raw.icons_outlined_exclamation_mark_circle, z17 ? context.getResources().getColor(com.tencent.mm.R.color.FG_0) : context.getResources().getColor(com.tencent.mm.R.color.FG_2));
    }

    public final void a0(android.content.Context context, android.view.View view, java.lang.String str, java.util.Map map, boolean z17, java.lang.Integer num) {
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f485288h62);
        if (findViewById != null) {
            findViewById.hasOnClickListeners();
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        ((cy1.a) rVar).Mj(view);
        cy1.a aVar = (cy1.a) rVar;
        aVar.pk(view, str);
        int intValue = num != null ? num.intValue() : 40;
        aVar.ik(view, intValue, 25496);
        aVar.gk(view, map);
        if (z17) {
            aVar.Tj(view, intValue, 1, false);
        }
        zy2.ra Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context);
        aVar.Ai(view, new com.tencent.mm.plugin.finder.assist.u4(Sj != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).V6() : null));
    }

    public final void b(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, db5.g4 menu) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(menu, "menu");
        if (hc2.o0.H(feed.getFeedObject().getFeedObject())) {
            r45.dm2 object_extend = feed.getFeedObject().getFeedObject().getObject_extend();
            if ((object_extend != null ? (r45.kl2) object_extend.getCustom(45) : null) != null) {
                menu.g(215, context.getString(com.tencent.mm.R.string.nxa), com.tencent.mm.R.raw.play_rectangle_embed_regular);
                com.tencent.mm.plugin.finder.view.l2.f132537a.a(context, pm0.v.u(feed.getItemId()), "copy_video_id", "view_exp");
            }
        }
    }

    public final void c(android.content.Context context, db5.g4 menu, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.X3).getValue()).r()).intValue() != 1 || zl2.q4.f473933a.C(feed)) {
            return;
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Dg).getValue()).r()).booleanValue()) {
            return;
        }
        if (fd2.j.f261271i.b(holder)) {
            com.tencent.mars.xlog.Log.i("FinderMenuUtil", "addAutoScroll, there is only one feed in feed list, and no more feed can be loaded, return!");
            return;
        }
        boolean z17 = ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).f39226d;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("feedid", pm0.v.u(feed.getItemId()));
        jSONObject.put("from_action", feed.getMoreActionPanelActionType());
        if (z17) {
            menu.g(com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RESET, context.getString(com.tencent.mm.R.string.gyv), com.tencent.mm.R.raw.icons_finder_disable_auto_scroll);
        } else if (feed.getFeedTipsStatus().f477475a.f477442b) {
            menu.w(305, context.getString(com.tencent.mm.R.string.gyw), com.tencent.mm.R.raw.icons_finder_enable_auto_scroll);
            feed.getFeedTipsStatus().f477475a.f477442b = false;
        } else {
            menu.g(305, context.getString(com.tencent.mm.R.string.gyw), com.tencent.mm.R.raw.icons_finder_enable_auto_scroll);
        }
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.report.b6.d(b6Var, nyVar != null ? nyVar.V6() : null, z17 ? "close_auto_slide" : "open_auto_slide", 0, jSONObject, false, null, 48, null);
    }

    public final boolean c0(android.content.Context context) {
        m92.b j37;
        kotlin.jvm.internal.o.g(context, "context");
        int integer = (!hc2.t.d(context) || (j37 = g92.a.j3(g92.b.f269769e, xy2.c.e(context), false, 2, null)) == null) ? 0 : j37.u0().getInteger(48);
        return integer == 2 || integer == 3;
    }

    public final void d(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, db5.g4 menu) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(menu, "menu");
        if (feed.getFeedObject().isCommentClose() || !f102714a.c0(context)) {
            menu.g(107, context.getString(com.tencent.mm.R.string.cwf), com.tencent.mm.R.raw.icons_outlined_comment);
        } else {
            menu.g(106, context.getString(com.tencent.mm.R.string.f491363cv4), com.tencent.mm.R.raw.icons_outlined_comment_close);
        }
    }

    public final void d0(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        if (feed instanceof so2.h1) {
            return;
        }
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        long c17 = c01.id.c();
        i95.m c18 = i95.n0.c(au2.q.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ((au2.q) c18).f14089g = java.lang.Long.valueOf(c17);
        hc2.v0.d(itemView, "forward_menu_add_quick", "view_clk", false, kz5.b1.e(new jz5.l("click_timestamp", java.lang.Long.valueOf(c17))), null, 20, null);
        i95.m c19 = i95.n0.c(au2.q.class);
        kotlin.jvm.internal.o.f(c19, "getService(...)");
        ((au2.q) c19).wi(context);
    }

    public final void e(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, db5.g4 menu) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(menu, "menu");
        r45.dm2 object_extend = feed.getFeedObject().getFeedObject().getObject_extend();
        java.lang.String string = object_extend != null ? object_extend.getString(5) : null;
        if (string == null || string.length() == 0) {
            return;
        }
        menu.g(207, context.getString(com.tencent.mm.R.string.eng), com.tencent.mm.R.raw.finder_icons_outlined_copy_id);
    }

    public final void e0(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        r45.kl2 kl2Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        r45.dm2 object_extend = feed.getFeedObject().getFeedObject().getObject_extend();
        if (object_extend == null || (kl2Var = (r45.kl2) object_extend.getCustom(45)) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.view.k2 k2Var = com.tencent.mm.plugin.finder.view.l2.f132537a;
        java.lang.String u17 = pm0.v.u(feed.getItemId());
        k2Var.a(context, u17, "copy_video_id", "view_clk");
        java.lang.Object systemService = context.getSystemService("clipboard");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText(null, kl2Var.getString(0)));
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 2, 0);
        z2Var.i(com.tencent.mm.R.layout.e5k);
        z2Var.y(context.getString(com.tencent.mm.R.string.o1t));
        k2Var.a(context, u17, "complete_copy_videoid", "view_exp");
        z2Var.F = new com.tencent.mm.plugin.finder.view.i2(context, u17, z2Var);
        z2Var.z(context.getColor(com.tencent.mm.R.color.abu));
        boolean z17 = true;
        z2Var.x(1);
        java.lang.String string = kl2Var.getString(1);
        if (string != null && string.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
            linearLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, 64));
            linearLayout.setGravity(17);
            android.widget.TextView textView = new android.widget.TextView(context);
            textView.setText(context.getString(com.tencent.mm.R.string.o1u));
            textView.setTextSize(14.0f);
            textView.setTextColor(context.getColor(com.tencent.mm.R.color.Link_100));
            linearLayout.addView(textView);
            k2Var.a(context, u17, "learn_more_copy_videoid", "view_exp");
            linearLayout.setOnClickListener(new com.tencent.mm.plugin.finder.view.j2(context, u17, kl2Var));
            z2Var.p(linearLayout);
        }
        z2Var.C();
        com.tencent.mars.xlog.Log.i("FinderAuthorCopyIDDialog", "Copied export id: " + kl2Var.getString(0) + ", and show author copy ID dialog");
    }

    public final void f(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, db5.g4 menu) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(menu, "menu");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Uf).getValue()).r()).booleanValue()) {
            menu.g(218, "用长视频打开", com.tencent.mm.R.raw.square_play_regular);
        }
    }

    public final void f0(com.tencent.mm.ui.MMActivity context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        r45.dm2 object_extend = feed.getFeedObject().getFeedObject().getObject_extend();
        if (object_extend != null) {
            com.tencent.mars.xlog.Log.i("FinderMenuUtil", "internal_click_copy_msg=" + object_extend.getString(5));
            com.tencent.mm.sdk.platformtools.b0.e(object_extend.getString(5));
            db5.t7.m(context, context.getResources().getString(com.tencent.mm.R.string.enh));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("feedid", pm0.v.u(feed.getItemId()));
            jSONObject.put("finder_username", feed.getFeedObject().getUserName());
            jSONObject.put("from_action", i17 != 1 ? 2 : 1);
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            com.tencent.mm.plugin.finder.report.o3.ij(o3Var, 1, "copy_id", t17, nyVar != null ? nyVar.V6() : null, null, 16, null);
        }
    }

    public final void g(android.content.Context context, db5.g4 menu, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        r45.dn2 dn2Var;
        com.tencent.mm.plugin.finder.assist.y4 y4Var;
        boolean z17;
        java.lang.String str;
        java.lang.String string;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(feed, "feed");
        java.lang.String u17 = pm0.v.u(feed.getItemId());
        com.tencent.mm.protocal.protobuf.FinderObject feedObject = feed.getFeedObject().getFeedObject();
        jz5.g gVar = hc2.o0.f280336a;
        if (((feedObject != null ? feedObject.getPermissionFlag() : 0) & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            com.tencent.mars.xlog.Log.i("FinderMenuUtil", "[addDeclareOriginalMenu] feedId:" + u17 + ", hide declare origin");
            return;
        }
        ya2.g gVar2 = ya2.h.f460484a;
        ya2.b2 b17 = gVar2.b(feed.getFeedObject().getUserName());
        if (((b17 != null ? b17.field_additionalFlag : 0L) & 1) != 1) {
            com.tencent.mars.xlog.Log.i("FinderMenuUtil", "[addDeclareOriginalMenu] feedId:" + u17 + ", has no entrance");
            return;
        }
        r45.dm2 object_extend = feed.getFeedObject().getFeedObject().getObject_extend();
        if (object_extend == null || (dn2Var = (r45.dn2) object_extend.getCustom(29)) == null) {
            com.tencent.mars.xlog.Log.i("FinderMenuUtil", "[addDeclareOriginalMenu] feedId:" + u17 + ", originalInfo is null");
            return;
        }
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2 = feed.getFeedObject().getFeedObject();
        boolean z18 = ((feedObject2 != null ? feedObject2.getPermissionFlag() : 0) & 1073741824) == 0;
        boolean z19 = dn2Var.getInteger(0) == 4;
        boolean e17 = hc2.s.e(gVar2.b(feed.getFeedObject().getUserName()));
        if (feed.h() == 2) {
            y4Var = this;
            str = "FinderMenuUtil";
            z17 = true;
        } else {
            y4Var = this;
            z17 = false;
            str = "FinderMenuUtil";
        }
        long O = y4Var.O(context, feed);
        boolean z27 = e17 || !z18 || z19 || z17 || ((O > 5000L ? 1 : (O == 5000L ? 0 : -1)) < 0);
        com.tencent.mars.xlog.Log.i(str, "[addDeclareOriginalMenu] feedId:" + u17 + ", original_audit_status:" + dn2Var.getInteger(0) + " original_plan_ver:" + dn2Var.getInteger(1) + " disable:" + z27 + " canDeclare:" + z18 + " isReject:" + z19 + " isForbidden:" + e17 + " isPhoto:" + z17 + " duration:" + O);
        int color = z27 ? context.getResources().getColor(com.tencent.mm.R.color.FG_2) : context.getResources().getColor(com.tencent.mm.R.color.FG_1);
        int color2 = z27 ? context.getResources().getColor(com.tencent.mm.R.color.FG_2) : context.getResources().getColor(com.tencent.mm.R.color.FG_0);
        if (dn2Var.getInteger(1) == 1) {
            string = context.getResources().getString(com.tencent.mm.R.string.lkd);
        } else {
            int integer = dn2Var.getInteger(0);
            string = integer == 2 ? context.getResources().getString(com.tencent.mm.R.string.lk7) : integer == 3 ? context.getResources().getString(com.tencent.mm.R.string.lk6) : context.getResources().getString(com.tencent.mm.R.string.cnp);
        }
        java.lang.String str2 = string;
        kotlin.jvm.internal.o.d(str2);
        menu.i(121, str2, color, com.tencent.mm.R.raw.icons_outlined_origin_creative, color2);
    }

    public final void g0(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Uf).getValue()).r()).booleanValue()) {
            android.os.Bundle bundle = new android.os.Bundle();
            com.tencent.mm.protocal.protobuf.FinderObject feedObject = feed.getFeedObject().getFeedObject();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            int i17 = qg3.g1.f362820d;
            java.lang.String UR_BC6E = urgen.ur_54A4.UR_6075.UR_BC6E();
            bw5.id0 id0Var = new bw5.id0();
            id0Var.f28542g = false;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            android.util.ArrayMap arrayMap = id0Var.f28558z;
            arrayMap.put(4, bool);
            bw5.zc0 zc0Var = new bw5.zc0();
            zc0Var.d(new bw5.yr().parseFrom(feedObject.toByteArray()));
            id0Var.e(zc0Var);
            id0Var.f(UR_BC6E);
            id0Var.g(0);
            id0Var.f28541f = 7L;
            arrayMap.put(3, bool);
            id0Var.d(281);
            byte[] byteArray = id0Var.toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            linkedHashMap.put("open_params", byteArray);
            i95.m c17 = i95.n0.c(n40.o.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            n40.o.U8((n40.o) c17, context, linkedHashMap, false, bundle, feed.getFeedObject().getFeedObject(), null, 32, null);
        }
    }

    public final void h(android.content.Context context, db5.g4 menu, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(feed, "feed");
        int i17 = zl2.q4.f473933a.C(feed) ? com.tencent.mm.R.raw.finder_live_dislike : com.tencent.mm.R.raw.finder_feed_dislike_new;
        boolean z17 = feed.getFeedTipsStatus().f477476b.f477455a;
        feed.getFeedTipsStatus().f477476b.f477456b = z17;
        if (!z17) {
            menu.g(99, context.getString(com.tencent.mm.R.string.gyz), i17);
        } else {
            menu.w(99, context.getString(com.tencent.mm.R.string.gyz), i17);
            feed.getFeedTipsStatus().f477476b.f477455a = false;
        }
    }

    public final void h0(com.tencent.mm.ui.MMActivity context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = feed.getFeedObject().getFeedObject().getInternal_feedback_url() + "?&specFormat=" + ds2.h.f242866a.c(feed.getFeedObject().getExpectId(), (r45.mb4) kz5.n0.X(feed.getFeedObject().getMediaList()), false).g() + "&currentSpeed=" + ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).getRecentAverageSpeed(2) + "&maxBitRate=" + ((c61.l7) i95.n0.c(c61.l7.class)).ek().f464694k;
        com.tencent.mars.xlog.Log.i("FinderMenuUtil", "internal_feedback_url=" + str);
        intent.putExtra("rawUrl", str);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public final void i(android.content.Context context, db5.g4 menu, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.plugin.finder.assist.i4 actionMenuInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(actionMenuInfo, "actionMenuInfo");
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.D0().r()).intValue() != 1 || actionMenuInfo.f102261k) {
            return;
        }
        menu.j(104, context.getString(com.tencent.mm.R.string.c__), com.tencent.mm.R.raw.bottomsheet_icon_fav, 0, actionMenuInfo.f102263m);
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3.Rk((com.tencent.mm.plugin.finder.report.o3) c17, context, false, feed.getItemId(), actionMenuInfo.f102263m, 2, null);
    }

    public final void i0(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        com.tencent.mm.protocal.protobuf.Html5Info html5_info;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) g92.b.f269769e.k2().d().getCustom(27);
        java.lang.String url = (finderJumpInfo == null || (html5_info = finderJumpInfo.getHtml5_info()) == null) ? null : html5_info.getUrl();
        r45.dm2 object_extend = feed.getFeedObject().getFeedObject().getObject_extend();
        java.lang.String string = object_extend != null ? object_extend.getString(25) : null;
        if (url == null || string == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String substring = url.substring(0, r26.n0.L(url, "=", 0, false, 6, null) + 1);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        java.lang.String format = java.lang.String.format(substring.concat(string) + "&from_page=2", java.util.Arrays.copyOf(new java.lang.Object[0], 0));
        kotlin.jvm.internal.o.f(format, "format(...)");
        com.tencent.mars.xlog.Log.i("FinderMenuUtil", "rawUrl=".concat(format));
        intent.putExtra("rawUrl", format);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[6];
        lVarArr[0] = new jz5.l("view_id", "forward_menu_administration");
        lVarArr[1] = new jz5.l("feed_id", pm0.v.u(feed.getItemId()));
        lVarArr[2] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
        lVarArr[3] = new jz5.l("selfUin", java.lang.Long.valueOf(new kk.v(gm0.j1.b().h()).longValue()));
        lVarArr[4] = new jz5.l("finder_context_id", V6 != null ? V6.getString(1) : null);
        lVarArr[5] = new jz5.l("finder_tab_context_id", V6 != null ? V6.getString(2) : null);
        ((cy1.a) rVar).Ej("view_clk", kz5.c1.k(lVarArr), 25496);
    }

    public final void j(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, db5.g4 menu) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(menu, "menu");
        r45.dm2 object_extend = feed.getFeedObject().getFeedObject().getObject_extend();
        java.lang.String string = object_extend != null ? object_extend.getString(46) : null;
        if (string == null || string.length() == 0) {
            return;
        }
        menu.l(216, context.getResources().getString(com.tencent.mm.R.string.nx_), com.tencent.mm.R.raw.icons_outlined_finder_internal_feedback, false);
    }

    public final void j0(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k);
        long currentPosMs = finderVideoLayout != null ? finderVideoLayout.getCurrentPosMs() : 0L;
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("view_id", "projection");
        pf5.z zVar = pf5.z.f353948a;
        boolean z17 = context instanceof androidx.appcompat.app.AppCompatActivity;
        if (!z17) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context;
        com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar = (com.tencent.mm.plugin.finder.viewmodel.component.sx) zVar.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.sx.class);
        long itemId = feed.getItemId();
        long j17 = sxVar.f135942x;
        lVarArr[1] = new jz5.l("if_projection", java.lang.Integer.valueOf((j17 == 0 || j17 != itemId) ? 0 : 1));
        lVarArr[2] = new jz5.l("feed_id", pm0.v.u(feed.getItemId()));
        lVarArr[3] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
        lVarArr[4] = new jz5.l("projection_front_time", java.lang.Long.valueOf(currentPosMs));
        ((cy1.a) rVar).Ej("view_clk", kz5.c1.k(lVarArr), 25496);
        if (!z17) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.finder.viewmodel.component.sx) zVar.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.sx.class)).Z6(feed.getItemId(), new java.lang.ref.WeakReference(holder));
    }

    public final void k(android.content.Context context, db5.g4 menu, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(feed, "feed");
        if (((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Di() && (feed instanceof so2.u1)) {
            menu.k(313, context.getString(com.tencent.mm.R.string.o_e), com.tencent.mm.R.raw.floating_window_regular, context.getResources().getColor(com.tencent.mm.R.color.abw), ((ov.f0) ((pv.c0) i95.n0.c(pv.c0.class))).wi(pv.b0.f358484i), false);
        }
    }

    public final void k0(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, boolean z17) {
        qd2.g1 g1Var = new qd2.g1(context, baseFinderFeed.h(), baseFinderFeed.getItemId(), null, z17, 1, 8, null);
        g1Var.f361764r = new com.tencent.mm.plugin.finder.assist.x4(context, baseFinderFeed, g1Var);
        g1Var.e(true, false);
    }

    public final void l(android.content.Context context, db5.g4 menu, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(feed, "feed");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((com.tencent.mm.plugin.finder.viewmodel.component.f2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.f2.class)).S6() && (feed instanceof so2.u1)) {
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo();
            multiTaskInfo.field_id = pm0.v.u(feed.getItemId());
            multiTaskInfo.field_type = 22;
            com.tencent.mm.plugin.multitask.s0 s0Var = com.tencent.mm.plugin.multitask.s0.f150501a;
            menu.h(com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RELEASE, s0Var.f(context, multiTaskInfo), s0Var.e(multiTaskInfo), context.getResources().getColor(com.tencent.mm.R.color.agw));
        }
    }

    public final void m(android.content.Context context, db5.g4 menu, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        java.lang.String string;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(feed, "feed");
        if (hc2.f0.f(feed.getFeedObject())) {
            boolean z17 = true;
            if (feed.getFeedObject().field_finderObject.getFollow_feed_count() > 1) {
                string = context.getResources().getString(com.tencent.mm.R.string.cvg, com.tencent.mm.plugin.finder.assist.w2.o(feed.getFeedObject().field_finderObject.getFollow_feed_count(), true));
                kotlin.jvm.internal.o.d(string);
            } else {
                string = context.getResources().getString(com.tencent.mm.R.string.cvf);
                kotlin.jvm.internal.o.d(string);
            }
            if (feed.getFeedObject().isPostFinish() && !feed.getFeedObject().isPostFailed()) {
                com.tencent.mm.protocal.protobuf.FinderObject feedObject = feed.getFeedObject().getFeedObject();
                jz5.g gVar = hc2.o0.f280336a;
                kotlin.jvm.internal.o.g(feedObject, "<this>");
                if (!((feedObject.getPermissionFlag() & 524288) > 0)) {
                    z17 = false;
                }
            }
            menu.l(109, string, com.tencent.mm.R.raw.icons_outlined_bgm_play, z17);
        }
    }

    public final void n(android.content.Context context, db5.g4 menu, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(feed, "feed");
        if (hc2.o0.a(feed.getFeedObject().getFeedObject())) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127810ld).getValue()).r()).booleanValue()) {
                menu.l(406, context.getString(com.tencent.mm.R.string.leg), com.tencent.mm.R.raw.icons_outlined_link, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(android.content.Context r8, db5.g4 r9, com.tencent.mm.plugin.finder.model.BaseFinderFeed r10) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.g(r8, r0)
            java.lang.String r0 = "menu"
            kotlin.jvm.internal.o.g(r9, r0)
            r0 = 1
            r1 = 0
            if (r10 == 0) goto L1d
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r10.getFeedObject()
            if (r10 == 0) goto L1d
            boolean r10 = r10.isReplayVideo()
            if (r10 != r0) goto L1d
            r10 = r0
            goto L1e
        L1d:
            r10 = r1
        L1e:
            if (r10 == 0) goto L21
            goto L8a
        L21:
            java.lang.Class<com.tencent.mm.plugin.appbrand.service.b6> r10 = com.tencent.mm.plugin.appbrand.service.b6.class
            i95.m r10 = i95.n0.c(r10)
            com.tencent.mm.plugin.appbrand.service.b6 r10 = (com.tencent.mm.plugin.appbrand.service.b6) r10
            if (r10 != 0) goto L2c
            goto L8a
        L2c:
            com.tencent.mm.modelsimple.t r10 = (com.tencent.mm.modelsimple.t) r10
            c01.f r2 = c01.d9.b()
            boolean r2 = r2.F()
            java.lang.String r3 = "Finder.FinderFeedHandOffUtil"
            if (r2 != 0) goto L41
            java.lang.String r10 = "not wxOnline"
            com.tencent.mars.xlog.Log.i(r3, r10)
            goto L8a
        L41:
            boolean r2 = r10.Bi()
            if (r2 == 0) goto L48
            goto L8b
        L48:
            java.util.List r10 = r10.Ai()
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.util.Iterator r10 = r10.iterator()
        L52:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L8a
            java.lang.Object r2 = r10.next()
            com.tencent.mm.plugin.appbrand.service.v6 r2 = (com.tencent.mm.plugin.appbrand.service.v6) r2
            int r4 = r2.f88808c
            r5 = 14
            if (r4 != r5) goto L52
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "online type:"
            r4.<init>(r5)
            int r5 = r2.f88806a
            r4.append(r5)
            java.lang.String r5 = " version:"
            r4.append(r5)
            long r5 = r2.f88807b
            r4.append(r5)
            java.lang.String r2 = r4.toString()
            com.tencent.mars.xlog.Log.i(r3, r2)
            int r2 = ug3.i.f427543q
            r4 = 319293952(0x13080a00, float:1.7170544E-27)
            if (r2 < r4) goto L52
            goto L8b
        L8a:
            r0 = r1
        L8b:
            if (r0 == 0) goto L9f
            r2 = 213(0xd5, float:2.98E-43)
            r10 = 2131767866(0x7f10323a, float:1.9166962E38)
            java.lang.String r3 = r8.getString(r10)
            r4 = 2131691200(0x7f0f06c0, float:1.9011465E38)
            r5 = 0
            r6 = 0
            r1 = r9
            r1.j(r2, r3, r4, r5, r6)
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.assist.y4.o(android.content.Context, db5.g4, com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }

    public final void p(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, db5.g4 menu) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(menu, "menu");
        java.lang.String internal_feedback_url = feed.getFeedObject().getFeedObject().getInternal_feedback_url();
        if (internal_feedback_url == null || internal_feedback_url.length() == 0) {
            return;
        }
        menu.g(201, context.getString(com.tencent.mm.R.string.csr), com.tencent.mm.R.raw.icons_outlined_finder_internal_feedback);
    }

    public final void q(android.content.Context context, db5.g4 menu, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(feed, "feed");
        if ((feed instanceof so2.u1) && !zl2.q4.f473933a.C(feed) && feed.getFeedObject().isLongVideo()) {
            ((o40.e) i95.n0.c(o40.e.class)).getClass();
            r45.qt2 d17 = xy2.c.d(context);
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            long itemId = feed.getItemId();
            int integer = d17 != null ? d17.getInteger(5) : 0;
            java.lang.String w17 = feed.w();
            ((c61.l7) b6Var).getClass();
            if (((r45.nm2) ((xc2.k0) pf5.u.f353936a.e(zy2.b6.class).a(xc2.k0.class)).V6(itemId, integer, w17).getValue()) != null) {
                wy2.g gVar = (wy2.g) ((o40.e) i95.n0.c(o40.e.class));
                if (gVar.f450639f == null) {
                    gVar.f450639f = com.tencent.mm.sdk.platformtools.o4.M("FinderAudioService");
                }
                com.tencent.mm.sdk.platformtools.o4 o4Var = gVar.f450639f;
                boolean z17 = o4Var != null ? o4Var.getBoolean(gVar.f450640g, true) : false;
                menu.k(312, context.getString(com.tencent.mm.R.string.nxc), com.tencent.mm.R.raw.earphone_regular, context.getResources().getColor(com.tencent.mm.R.color.FG_0), z17, false);
                if (z17) {
                    wy2.g gVar2 = (wy2.g) ((o40.e) i95.n0.c(o40.e.class));
                    if (gVar2.f450639f == null) {
                        gVar2.f450639f = com.tencent.mm.sdk.platformtools.o4.M("FinderAudioService");
                    }
                    com.tencent.mm.sdk.platformtools.o4 o4Var2 = gVar2.f450639f;
                    if (o4Var2 != null) {
                        o4Var2.putBoolean(gVar2.f450640g, false);
                    }
                }
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("feed_id", pm0.v.u(feed.getItemId()));
                hashMap.put("comment_scene", d17 != null ? java.lang.Integer.valueOf(d17.getInteger(5)) : 0L);
                hashMap.put("finder_context_id", d17 != null ? d17.getString(1) : null);
                hashMap.put("finder_tab_context_id", d17 != null ? d17.getString(2) : null);
                hashMap.put("session_buffer", feed.g0());
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("menu_listen_video", "view_exp", hashMap, 1, false);
            }
        }
    }

    public final void r(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, db5.g4 menu) {
        r45.tz0 tz0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(menu, "menu");
        if (feed.getFeedObject().getMediaType() == 4) {
            r45.dm2 object_extend = feed.getFeedObject().getFeedObject().getObject_extend();
            if (((object_extend == null || (tz0Var = (r45.tz0) object_extend.getCustom(11)) == null) ? null : (com.tencent.mm.protocal.protobuf.FinderJumpInfo) tz0Var.getCustom(0)) != null) {
                ya2.b2 contact = feed.getContact();
                if (((contact != null ? contact.field_additionalFlag : 0L) & 16) == 0) {
                    menu.g(209, context.getString(com.tencent.mm.R.string.enk), com.tencent.mm.R.raw.icons_outlined_mini_app_reference);
                }
            }
        }
    }

    public final void s(android.content.Context context, db5.g4 menu, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(feed, "feed");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((com.tencent.mm.plugin.finder.viewmodel.component.f2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.f2.class)).S6()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderMenuUtil", "addMultiTaskMenuWrapper finder fun flag:" + feed.getFeedObject().getFeedObject().getFunc_flag() + ",replaceMultiTaskWithSeeLater:" + feed.getFeedObject().replaceMultiTaskWithSeeLater() + ",enableShowLongVideo:false");
        if (feed instanceof so2.u1) {
            menu.g(com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RELEASE, context.getString(com.tencent.mm.R.string.c0w), com.tencent.mm.R.raw.icons_outlined_multitask);
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[6];
            lVarArr[0] = new jz5.l("view_id", "button_float_frame");
            lVarArr[1] = new jz5.l("feed_id", pm0.v.u(feed.getItemId()));
            lVarArr[2] = new jz5.l("behaviour_session_id", V6 != null ? V6.getString(0) : null);
            lVarArr[3] = new jz5.l("finder_context_id", V6 != null ? V6.getString(1) : null);
            lVarArr[4] = new jz5.l("finder_tab_context_id", V6 != null ? V6.getString(2) : null);
            lVarArr[5] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
            ((cy1.a) rVar).Ej("view_exp", kz5.c1.k(lVarArr), 25496);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        if (r0 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ca, code lost:
    
        if (hc2.o0.J(r5, bu2.z.b(r9)) != false) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(android.content.Context r7, db5.g4 r8, com.tencent.mm.plugin.finder.model.BaseFinderFeed r9) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.g(r7, r0)
            java.lang.String r0 = "menu"
            kotlin.jvm.internal.o.g(r8, r0)
            java.lang.String r0 = "feed"
            kotlin.jvm.internal.o.g(r9, r0)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r9.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            jz5.g r1 = hc2.o0.f280336a
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.o.g(r0, r1)
            int r0 = r0.getPermissionFlag()
            r2 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r2
            r2 = 1
            r3 = 0
            if (r0 <= 0) goto L2c
            r0 = r2
            goto L2d
        L2c:
            r0 = r3
        L2d:
            if (r0 != 0) goto L30
            return
        L30:
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r9.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r9.getFeedObject()
            kotlin.jvm.internal.o.g(r9, r1)
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r9.getObjectDesc()
            if (r0 == 0) goto L84
            r45.z31 r1 = r0.getFromApp()
            if (r1 == 0) goto L5a
            java.lang.String r1 = r1.getString(r3)
            if (r1 == 0) goto L5a
            int r1 = r1.length()
            if (r1 <= 0) goto L55
            r1 = r2
            goto L56
        L55:
            r1 = r3
        L56:
            if (r1 != r2) goto L5a
            r1 = r2
            goto L5b
        L5a:
            r1 = r3
        L5b:
            if (r1 == 0) goto L5f
            goto Lcd
        L5f:
            r45.el2 r0 = r0.getFeedBgmInfo()
            if (r0 == 0) goto L80
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r3)
            r45.zi2 r0 = (r45.zi2) r0
            if (r0 == 0) goto L80
            java.lang.String r0 = r0.getString(r3)
            if (r0 == 0) goto L80
            int r0 = r0.length()
            if (r0 <= 0) goto L7b
            r0 = r2
            goto L7c
        L7b:
            r0 = r3
        L7c:
            if (r0 != r2) goto L80
            r0 = r2
            goto L81
        L80:
            r0 = r3
        L81:
            if (r0 == 0) goto L84
            goto Lcd
        L84:
            g92.b r0 = g92.b.f269769e
            java.lang.String r1 = xy2.c.e(r7)
            r4 = 2
            r5 = 0
            m92.b r0 = g92.a.j3(r0, r1, r3, r4, r5)
            if (r0 == 0) goto L96
            r45.ao2 r5 = k92.a.a(r0)
        L96:
            if (r5 == 0) goto Lbf
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r9.getObjectDesc()
            if (r0 == 0) goto Lb1
            java.util.LinkedList r0 = r0.getMedia()
            if (r0 == 0) goto Lb1
            java.lang.Object r0 = kz5.n0.Z(r0)
            com.tencent.mm.protocal.protobuf.FinderMedia r0 = (com.tencent.mm.protocal.protobuf.FinderMedia) r0
            if (r0 == 0) goto Lb1
            int r0 = r0.getMediaType()
            goto Lb2
        Lb1:
            r0 = -1
        Lb2:
            java.util.LinkedList r1 = r5.getList(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            goto Lc0
        Lbf:
            r0 = r3
        Lc0:
            if (r0 == 0) goto Lcd
            long r0 = bu2.z.b(r9)
            boolean r9 = hc2.o0.J(r5, r0)
            if (r9 == 0) goto Lcd
            goto Lce
        Lcd:
            r2 = r3
        Lce:
            if (r2 == 0) goto Le3
            android.content.res.Resources r7 = r7.getResources()
            r9 = 2131767847(0x7f103227, float:1.9166924E38)
            java.lang.String r7 = r7.getString(r9)
            r9 = 2131691342(0x7f0f074e, float:1.9011753E38)
            r0 = 119(0x77, float:1.67E-43)
            r8.l(r0, r7, r9, r3)
        Le3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.assist.y4.t(android.content.Context, db5.g4, com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }

    public final void v(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, db5.g4 menu) {
        java.lang.String string;
        int i17;
        x91.c cVar;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(menu, "menu");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.N2).getValue()).r()).intValue() == 0) {
            return;
        }
        com.tencent.mm.protocal.protobuf.FinderObject feedObject = feed.getFeedObject().getFeedObject();
        jz5.g gVar = hc2.o0.f280336a;
        kotlin.jvm.internal.o.g(feedObject, "<this>");
        if ((feedObject.getPermissionFlag() & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) > 0) {
            pf5.z zVar = pf5.z.f353948a;
            boolean z17 = context instanceof androidx.appcompat.app.AppCompatActivity;
            if (!z17) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context;
            com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar = (com.tencent.mm.plugin.finder.viewmodel.component.sx) zVar.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.sx.class);
            long itemId = feed.getItemId();
            long j17 = sxVar.f135942x;
            if (j17 != 0 && j17 == itemId) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d8a));
                sb6.append('\n');
                if (!z17) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                x91.h hVar = ((com.tencent.mm.plugin.finder.viewmodel.component.sx) zVar.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.sx.class)).f135941w;
                java.lang.String str = (hVar == null || (cVar = hVar.f452647a) == null) ? null : cVar.f452639g;
                if (str == null) {
                    str = "";
                }
                sb6.append(str);
                string = sb6.toString();
                i17 = 1;
            } else {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dwz);
                kotlin.jvm.internal.o.d(string);
                i17 = 0;
            }
            menu.h(210, string, com.tencent.mm.R.raw.finder_icon_projection_screen_2, context.getResources().getColor(com.tencent.mm.R.color.f478502m));
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[4];
            lVarArr[0] = new jz5.l("view_id", "projection");
            lVarArr[1] = new jz5.l("if_projection", java.lang.Integer.valueOf(i17));
            lVarArr[2] = new jz5.l("feed_id", pm0.v.u(feed.getItemId()));
            lVarArr[3] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
            ((cy1.a) rVar).Ej("view_exp", kz5.c1.k(lVarArr), 25496);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(android.content.Context r9, db5.g4 r10, com.tencent.mm.plugin.finder.model.BaseFinderFeed r11) {
        /*
            r8 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.g(r9, r0)
            java.lang.String r0 = "menu"
            kotlin.jvm.internal.o.g(r10, r0)
            java.lang.String r0 = "feed"
            kotlin.jvm.internal.o.g(r11, r0)
            boolean r0 = hc2.b0.a(r11)
            if (r0 == 0) goto L8c
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r11.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.field_finderObject
            r1 = 0
            if (r0 == 0) goto L24
            int r0 = r0.getRingtone_count()
            goto L25
        L24:
            r0 = r1
        L25:
            if (r0 == 0) goto L59
            com.tencent.mm.plugin.finder.storage.t70 r2 = com.tencent.mm.plugin.finder.storage.t70.f127590a
            java.lang.Class<e42.e0> r2 = e42.e0.class
            i95.m r2 = i95.n0.c(r2)
            e42.e0 r2 = (e42.e0) r2
            e42.d0 r3 = e42.d0.clicfg_finder_ring_tone_show_count
            h62.d r2 = (h62.d) r2
            int r2 = r2.Ni(r3, r1)
            if (r0 < r2) goto L59
            java.lang.Class<zy2.b6> r2 = zy2.b6.class
            i95.m r2 = i95.n0.c(r2)
            zy2.b6 r2 = (zy2.b6) r2
            c61.l7 r2 = (c61.l7) r2
            java.lang.String r0 = r2.il(r0)
            android.content.res.Resources r9 = r9.getResources()
            r2 = 2131762372(0x7f101cc4, float:1.915582E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r9 = r9.getString(r2, r0)
            goto L64
        L59:
            android.content.res.Resources r9 = r9.getResources()
            r0 = 2131767856(0x7f103230, float:1.9166942E38)
            java.lang.String r9 = r9.getString(r0)
        L64:
            r4 = r9
            kotlin.jvm.internal.o.d(r4)
            r3 = 114(0x72, float:1.6E-43)
            r5 = 2131691034(0x7f0f061a, float:1.9011128E38)
            r6 = 0
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r11.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r9.getFeedObject()
            jz5.g r11 = hc2.o0.f280336a
            java.lang.String r11 = "<this>"
            kotlin.jvm.internal.o.g(r9, r11)
            int r9 = r9.getPermissionFlag()
            r11 = 65536(0x10000, float:9.1835E-41)
            r9 = r9 & r11
            if (r9 <= 0) goto L87
            r1 = 1
        L87:
            r7 = r1
            r2 = r10
            r2.j(r3, r4, r5, r6, r7)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.assist.y4.w(android.content.Context, db5.g4, com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x010d, code lost:
    
        if (com.tencent.mm.sdk.platformtools.z.f193115k != false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0120, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_finder_maas_show_creation_with_same_template_entry, bm5.h0.RepairerConfig_Maas_ShowCreationSameEntry_Int, 1) == 1) goto L178;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(android.content.Context r19, com.tencent.mm.plugin.finder.model.BaseFinderFeed r20, db5.g4 r21) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.assist.y4.x(android.content.Context, com.tencent.mm.plugin.finder.model.BaseFinderFeed, db5.g4):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(android.app.Activity r15, com.tencent.mm.plugin.finder.model.BaseFinderFeed r16, db5.g4 r17, com.tencent.mm.ui.widget.dialog.k0 r18, int r19) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.assist.y4.y(android.app.Activity, com.tencent.mm.plugin.finder.model.BaseFinderFeed, db5.g4, com.tencent.mm.ui.widget.dialog.k0, int):void");
    }

    public final void z(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, db5.g4 menu) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(menu, "menu");
        so2.u1 u1Var = feed instanceof so2.u1 ? (so2.u1) feed : null;
        boolean z17 = false;
        if (u1Var != null && u1Var.g2()) {
            z17 = true;
        }
        if (z17) {
            if (gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_FINDER_BULLET_SWITCH_BOOLEAN, true)) {
                menu.g(301, context.getString(com.tencent.mm.R.string.gyu), com.tencent.mm.R.raw.bullet_screen_off_regular);
            } else {
                menu.g(302, context.getString(com.tencent.mm.R.string.gyy), com.tencent.mm.R.raw.bullet_screen_on_regular);
            }
        }
    }
}
