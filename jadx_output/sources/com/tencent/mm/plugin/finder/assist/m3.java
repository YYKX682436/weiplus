package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class m3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.m3 f102381a = new com.tencent.mm.plugin.finder.assist.m3();

    public final void a(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, com.tencent.mm.plugin.finder.feed.k8 k8Var, int i17, int i18, boolean z17, int i19) {
        java.lang.String userName;
        java.lang.Class cls;
        int i27;
        java.lang.String str;
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar;
        boolean z18;
        r45.qt2 qt2Var;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        boolean z19;
        java.lang.String str2;
        int i28;
        r45.vx0 vx0Var;
        java.lang.String str3;
        java.lang.Class cls2;
        java.lang.String sessionBuffer;
        java.lang.String str4;
        java.lang.String str5;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2;
        java.lang.String X6;
        java.lang.String str6;
        java.lang.String str7;
        com.tencent.mm.ui.MMActivity f122643d;
        android.content.Intent intent;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        r45.xk bizInfo = item.getFeedObject().getBizInfo();
        boolean z27 = bizInfo != null;
        if (!z27) {
            userName = item.getFeedObject().getUserName();
        } else if (bizInfo == null || (userName = bizInfo.getString(0)) == null) {
            userName = "";
        }
        kotlin.jvm.internal.o.d(userName);
        com.tencent.mars.xlog.Log.i("FinderProfileUtils", "isBizProfile: " + z27);
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar2 = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        if (z27) {
            if (userName.length() == 0) {
                com.tencent.mars.xlog.Log.e("FinderProfileUtils", "jumpBizProfile: biz username is null");
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            android.content.Context context = holder.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar2, context, intent2, item.getItemId(), null, 0, 1, false, 0, item.w(), 192, null);
            intent2.putExtra("Contact_User", userName);
            intent2.putExtra("Contact_Scene", 213);
            intent2.putExtra("biz_profile_enter_from_finder", true);
            intent2.putExtra("force_get_contact", true);
            intent2.putExtra("key_use_new_contact_profile", true);
            intent2.putExtra("finder_feed_id", item.getItemId());
            intent2.putExtra("biz_profile_tab_type", 1);
            java.lang.String sessionBuffer2 = item.getFeedObject().getFeedObject().getSessionBuffer();
            boolean z28 = sessionBuffer2 == null || sessionBuffer2.length() == 0;
            android.content.Context context2 = holder.f293121e;
            if (z28) {
                com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                str3 = "context";
                long itemId = item.getItemId();
                java.lang.String w17 = item.w();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                cls2 = com.tencent.mm.plugin.finder.viewmodel.component.a4.class;
                com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar2.e(context2);
                sessionBuffer = o3Var.ek(itemId, w17, e17 != null ? e17.f135380n : 0);
            } else {
                str3 = "context";
                cls2 = com.tencent.mm.plugin.finder.viewmodel.component.a4.class;
                sessionBuffer = item.getFeedObject().getFeedObject().getSessionBuffer();
            }
            intent2.putExtra("Contact_Scene_Note", sessionBuffer);
            intent2.putExtra("finder_from_feed_id", item.getFeedObject().getId());
            intent2.putExtra("finder_from_feed_dup_flag", item.getFeedObject().getDupFlag());
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar2.e(context2);
            intent2.putExtra("finder_from_feed_comment_scene", e18 != null ? e18.f135380n : 0);
            intent2.putExtra("finder_from_feed_type", item.getFeedObject().isLiveFeed() ? 1 : 2);
            com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar2.e(context2);
            r45.qt2 V6 = e19 != null ? e19.V6() : null;
            if ((k8Var == null || (f122643d = k8Var.getF122643d()) == null || (intent = f122643d.getIntent()) == null || !intent.getBooleanExtra("is_from_ad", false)) ? false : true) {
                com.tencent.mm.plugin.finder.viewmodel.component.ny e27 = iyVar2.e(context2);
                if (e27 != null && (X6 = e27.X6()) != null) {
                    try {
                        java.lang.String optString = new org.json.JSONObject(X6).optString("sns_ad");
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.put("adReportInfo", optString);
                            jSONObject.put("commentscene", V6 != null ? V6.getInteger(5) : 0);
                            if (V6 == null || (str6 = V6.getString(2)) == null) {
                                str6 = "";
                            }
                            jSONObject.put("clicktabcontextid", str6);
                            if (V6 == null || (str7 = V6.getString(1)) == null) {
                                str7 = "";
                            }
                            jSONObject.put("findercontextid", str7);
                            jSONObject.put("feedid", pm0.v.u(item.getItemId()));
                            java.lang.String jSONObject2 = jSONObject.toString();
                            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                            intent2.putExtra("Contact_Finder_Buffer", r26.i0.t(jSONObject2, ",", ";", false));
                        }
                    } catch (java.lang.Exception unused) {
                        com.tencent.mars.xlog.Log.e("FinderProfileUtils", "jumpBizProfile parse ad info");
                    }
                }
            } else {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("commentscene", V6 != null ? V6.getInteger(5) : 0);
                if (V6 == null || (str4 = V6.getString(2)) == null) {
                    str4 = "";
                }
                jSONObject3.put("clicktabcontextid", str4);
                if (V6 == null || (str5 = V6.getString(1)) == null) {
                    str5 = "";
                }
                jSONObject3.put("findercontextid", str5);
                jSONObject3.put("feedid", pm0.v.u(item.getItemId()));
                java.lang.String jSONObject4 = jSONObject3.toString();
                kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
                intent2.putExtra("Contact_Finder_Buffer", r26.i0.t(jSONObject4, ",", ";", false));
            }
            if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.F0().r()).intValue() == 1) {
                uh4.c0 c0Var = (uh4.c0) i95.n0.c(uh4.c0.class);
                boolean isTeenMode = c0Var != null ? c0Var.isTeenMode() : false;
                boolean z29 = ((context2 instanceof com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI) || (context2 instanceof com.tencent.mm.plugin.finder.ui.FinderShareFeedDetailUI) || (context2 instanceof com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI)) ? false : true;
                if (isTeenMode && !z29) {
                    ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context2);
                } else if (context2 instanceof com.tencent.mm.ui.MMActivity) {
                    pf5.z zVar = pf5.z.f353948a;
                    if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context2;
                    com.tencent.mm.plugin.finder.viewmodel.component.a4 a4Var = (com.tencent.mm.plugin.finder.viewmodel.component.a4) zVar.a(appCompatActivity).a(cls2);
                    com.tencent.mm.plugin.finder.feed.pz pzVar = k8Var instanceof com.tencent.mm.plugin.finder.feed.pz ? (com.tencent.mm.plugin.finder.feed.pz) k8Var : null;
                    com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = pzVar != null ? pzVar.f108756h : null;
                    a4Var.getClass();
                    android.app.Activity context3 = a4Var.getContext();
                    kotlin.jvm.internal.o.g(context3, str3);
                    if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ha.class);
                    kotlin.jvm.internal.o.f(a17, "get(...)");
                    com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a P6 = com.tencent.mm.plugin.finder.viewmodel.component.ha.P6((com.tencent.mm.plugin.finder.viewmodel.component.ha) a17, 6, com.tencent.mm.plugin.finder.viewmodel.component.a4.Z6(a4Var, finderHomeTabFragment, item, holder, com.tencent.mm.plugin.finder.viewmodel.component.k2.f134913d, com.tencent.mm.plugin.finder.viewmodel.component.l2.f135015d, false, 32, null), null, 4, null);
                    com.tencent.mm.plugin.finder.viewmodel.component.s4 s4Var = (com.tencent.mm.plugin.finder.viewmodel.component.s4) zVar.a(appCompatActivity).e(com.tencent.mm.plugin.finder.viewmodel.component.s4.class);
                    if (s4Var != null) {
                        s4Var.Q6((com.tencent.mm.ui.MMActivity) context2, intent2, P6, i18);
                    }
                }
            } else {
                j45.l.j(context2, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent2, null);
            }
            if (context2 instanceof com.tencent.mm.ui.MMActivity) {
                baseFinderFeed2 = item;
                com.tencent.mm.plugin.finder.convert.qe.U.c((com.tencent.mm.ui.MMActivity) context2, baseFinderFeed2, i19 == 2);
            } else {
                baseFinderFeed2 = item;
            }
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Sk(baseFinderFeed2, V6);
            return;
        }
        android.content.Context context4 = holder.f293121e;
        kotlin.jvm.internal.o.f(context4, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny e28 = iyVar2.e(context4);
        if (e28 != null) {
            i27 = e28.f135380n;
            cls = com.tencent.mm.plugin.finder.viewmodel.component.ha.class;
        } else {
            cls = com.tencent.mm.plugin.finder.viewmodel.component.ha.class;
            i27 = 0;
        }
        android.content.Intent intent3 = new android.content.Intent();
        android.content.Context context5 = holder.f293121e;
        com.tencent.mm.ui.MMActivity mMActivity = context5 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context5 : null;
        if (mMActivity != null) {
            intent3.putExtra("key_to_user_name", mMActivity.getIntent().getStringExtra("key_to_user_name"));
            intent3.putExtra("from_user", mMActivity.getIntent().getStringExtra("from_user"));
            intent3.putExtra("key_from_user_name", mMActivity.getIntent().getStringExtra("key_from_user_name"));
            intent3.putExtra("report_scene", mMActivity.getIntent().getIntExtra("report_scene", 0));
        }
        intent3.putExtra("finder_username", item.getFeedObject().getUserName());
        intent3.putExtra("finder_read_feed_id", item.getFeedObject().getId());
        intent3.putExtra("finder_read_feed_dup_flag", item.w());
        intent3.putExtra("finder_from_feed_id", item.getFeedObject().getId());
        intent3.putExtra("finder_from_feed_dup_flag", item.w());
        intent3.putExtra("finder_from_feed_comment_scene", i27);
        intent3.putExtra("finder_from_feed_type", item.getFeedObject().isLiveFeed() ? 1 : 2);
        r45.dm2 object_extend = item.getFeedObject().getFeedObject().getObject_extend();
        intent3.putExtra("key_finder_collection_id", (object_extend == null || (vx0Var = (r45.vx0) object_extend.getCustom(0)) == null) ? null : java.lang.Long.valueOf(vx0Var.getLong(0)));
        android.content.Context context6 = holder.f293121e;
        if (!(context6 instanceof com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI) && !(context6 instanceof com.tencent.mm.plugin.finder.ui.FinderShareFeedDetailUI) && !(context6 instanceof com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI)) {
            intent3.putExtra("KEY_FROM_TIMELINE", true);
        }
        intent3.putExtra("key_entrance_type", i17);
        intent3.putExtra("key_click_avatar_type", i19);
        intent3.putExtra("key_if_living", z17);
        if (item.getFeedObject().isLiveFeed()) {
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            jSONObject5.put("live_feedid", pm0.v.u(item.getFeedObject().getFeedObject().getId()));
            r45.nw1 liveInfo = item.getFeedObject().getFeedObject().getLiveInfo();
            jSONObject5.put("liveid", pm0.v.u(liveInfo != null ? liveInfo.getLong(0) : 0L));
            intent3.putExtra("key_aditional_client_udf_kv", jSONObject5.toString());
            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
            str = "finder_from_feed_type";
            jSONObject6.put("feedid", pm0.v.u(item.getFeedObject().getFeedObject().getId()));
            r45.nw1 liveInfo2 = item.getFeedObject().getFeedObject().getLiveInfo();
            jSONObject6.put("liveid", pm0.v.u(liveInfo2 != null ? liveInfo2.getLong(0) : 0L));
            jSONObject6.put("panel_sence", "5");
            intent3.putExtra("key_aditional_client_udf_kv", jSONObject6.toString());
        } else {
            str = "finder_from_feed_type";
        }
        android.content.Context context7 = holder.f293121e;
        kotlin.jvm.internal.o.f(context7, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar2, context7, intent3, item.getItemId(), null, 0, 1, false, 0, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).tj(item, holder.getAdapterPosition(), java.lang.String.valueOf(i27));
        pf5.u uVar = pf5.u.f353936a;
        android.content.Context context8 = holder.f293121e;
        kotlin.jvm.internal.o.f(context8, "getContext(...)");
        ((com.tencent.mm.plugin.finder.live.viewmodel.aa) ((zy2.v9) uVar.b(context8).c(zy2.v9.class))).S6(item.getItemId(), intent3);
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.F0().r()).intValue() == 1) {
            android.content.Context context9 = holder.f293121e;
            kotlin.jvm.internal.o.f(context9, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context9 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context9).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            int i29 = nyVar != null ? nyVar.f135380n : 0;
            boolean z37 = (i29 == 1 && item.getFeedObject().getBizInfo() == null) || i29 == 8 || i29 == 120;
            uh4.c0 c0Var2 = (uh4.c0) i95.n0.c(uh4.c0.class);
            boolean isTeenMode2 = c0Var2 != null ? c0Var2.isTeenMode() : false;
            boolean booleanExtra = intent3.getBooleanExtra("KEY_FROM_TIMELINE", false);
            if (!isTeenMode2 || booleanExtra) {
                java.lang.String userName2 = item.getFeedObject().getUserName();
                android.content.Context context10 = holder.f293121e;
                kotlin.jvm.internal.o.f(context10, "getContext(...)");
                if (uVar.b(context10).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC.class) != null) {
                    ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.finder.assist.g3(userName2, item));
                    long uptimeMillis = android.os.SystemClock.uptimeMillis();
                    long id6 = z37 ? 0L : item.getFeedObject().getId();
                    java.io.Serializable w18 = z37 ? 0L : item.w();
                    intent3.putExtra("finder_read_feed_id", id6);
                    intent3.putExtra("finder_read_feed_dup_flag", w18);
                    intent3.putExtra("finder_from_feed_id", item.getFeedObject().getId());
                    intent3.putExtra("finder_from_feed_dup_flag", item.w());
                    intent3.putExtra("finder_from_feed_comment_scene", i29);
                    if (item.getFeedObject().isLiveFeed()) {
                        str2 = str;
                        i28 = 1;
                    } else {
                        str2 = str;
                        i28 = 2;
                    }
                    intent3.putExtra(str2, i28);
                    intent3.putExtra("key_profile_from_hard_ad", hc2.o0.E(item.getFeedObject().getFeedObject(), false, 1, null));
                    if (i29 == 212) {
                        intent3.putExtra("key_newlife_comment_scene", i29);
                    }
                    android.content.Context context11 = holder.f293121e;
                    kotlin.jvm.internal.o.f(context11, "getContext(...)");
                    com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC finderProfileDrawerUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC) uVar.b(context11).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC.class);
                    android.content.Context context12 = holder.f293121e;
                    kotlin.jvm.internal.o.f(context12, "getContext(...)");
                    com.tencent.mm.plugin.finder.viewmodel.component.a4 a4Var2 = (com.tencent.mm.plugin.finder.viewmodel.component.a4) uVar.b(context12).a(com.tencent.mm.plugin.finder.viewmodel.component.a4.class);
                    com.tencent.mm.plugin.finder.feed.pz pzVar2 = k8Var instanceof com.tencent.mm.plugin.finder.feed.pz ? (com.tencent.mm.plugin.finder.feed.pz) k8Var : null;
                    com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment2 = pzVar2 != null ? pzVar2.f108756h : null;
                    a4Var2.getClass();
                    java.lang.Class cls3 = cls;
                    iyVar = iyVar2;
                    com.tencent.mm.plugin.finder.viewmodel.component.a4.Z6(a4Var2, finderHomeTabFragment2, item, holder, new com.tencent.mm.plugin.finder.viewmodel.component.n3(finderProfileDrawerUIC), new com.tencent.mm.plugin.finder.viewmodel.component.o3(finderProfileDrawerUIC), false, 32, null);
                    if (finderProfileDrawerUIC != null) {
                        android.app.Activity context13 = a4Var2.getContext();
                        kotlin.jvm.internal.o.g(context13, "context");
                        pf5.z zVar2 = pf5.z.f353948a;
                        if (!(context13 instanceof androidx.appcompat.app.AppCompatActivity)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        com.tencent.mm.plugin.finder.viewmodel.component.ha haVar = (com.tencent.mm.plugin.finder.viewmodel.component.ha) zVar2.a((androidx.appcompat.app.AppCompatActivity) context13).a(cls3);
                        com.tencent.mm.plugin.finder.viewmodel.component.p3 p3Var = new com.tencent.mm.plugin.finder.viewmodel.component.p3(finderProfileDrawerUIC);
                        haVar.getClass();
                        qt2Var = null;
                        finderProfileDrawerUIC.f133629q.add(new com.tencent.mm.plugin.finder.viewmodel.component.fa(haVar, 5, p3Var, null));
                    } else {
                        qt2Var = null;
                    }
                    android.content.Context context14 = holder.f293121e;
                    kotlin.jvm.internal.o.f(context14, "getContext(...)");
                    com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC finderProfileDrawerUIC2 = (com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC) uVar.b(context14).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC.class);
                    z18 = false;
                    if (finderProfileDrawerUIC2 != null) {
                        finderProfileDrawerUIC2.Q6(intent3, 0);
                    }
                    com.tencent.mars.xlog.Log.i("FinderProfileUtils", "profile updateData COST: " + (android.os.SystemClock.uptimeMillis() - uptimeMillis) + "ms");
                }
            } else {
                ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(holder.f293121e);
            }
            iyVar = iyVar2;
            z18 = false;
            qt2Var = null;
        } else {
            iyVar = iyVar2;
            z18 = false;
            qt2Var = null;
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            android.content.Context context15 = holder.f293121e;
            kotlin.jvm.internal.o.f(context15, "getContext(...)");
            i0Var.mk(context15, intent3);
        }
        if (holder.f293121e instanceof com.tencent.mm.ui.MMActivity) {
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Ni(holder, item.getItemId(), item.getFeedObject());
            com.tencent.mm.plugin.finder.convert.t8 t8Var = com.tencent.mm.plugin.finder.convert.qe.U;
            android.content.Context context16 = holder.f293121e;
            kotlin.jvm.internal.o.e(context16, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.tencent.mm.ui.MMActivity mMActivity2 = (com.tencent.mm.ui.MMActivity) context16;
            if (i19 == 2) {
                baseFinderFeed = item;
                z19 = true;
            } else {
                z19 = z18;
                baseFinderFeed = item;
            }
            t8Var.c(mMActivity2, baseFinderFeed, z19);
        } else {
            baseFinderFeed = item;
        }
        android.content.Context context17 = holder.f293121e;
        kotlin.jvm.internal.o.f(context17, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny e29 = iyVar.e(context17);
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Sk(baseFinderFeed, e29 != null ? e29.V6() : qt2Var);
    }

    public final gx2.q b(com.tencent.mm.ui.MMActivity activity, android.content.Intent intent, android.view.ViewGroup attachRoot, boolean z17, yz5.a aVar) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(attachRoot, "attachRoot");
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(activity);
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(com.tencent.mm.R.id.g3v);
        frameLayout.setBackgroundColor(activity.getResources().getColor(com.tencent.mm.R.color.a9e));
        com.tencent.mm.ui.vas.VASCommonFragment b17 = lk5.q0.b("com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI", intent, false, 4, null);
        float k17 = (i65.a.k(activity) + com.tencent.mm.ui.bk.p(activity)) * kx2.a.f313278a.a(activity);
        gx2.a aVar2 = new gx2.a();
        aVar2.f277337c = k17;
        aVar2.f277338d = new hx2.g(activity, 0, 0, 0, false, false, 62, null);
        aVar2.f277339e = new hx2.c(frameLayout);
        aVar2.f277340f = new hx2.b(activity, z17);
        gx2.q b18 = aVar2.b(attachRoot);
        b18.setOnDrawerWillClose(new com.tencent.mm.plugin.finder.assist.h3(b17, attachRoot, b18));
        intent.putExtra("key_is_auto_report", false);
        androidx.fragment.app.i2 beginTransaction = activity.getSupportFragmentManager().beginTransaction();
        kotlin.jvm.internal.o.f(beginTransaction, "beginTransaction(...)");
        frameLayout.removeAllViews();
        b17.setMenuVisibility(false);
        b17.q0(new com.tencent.mm.plugin.finder.assist.k3(frameLayout, b18, aVar));
        b18.setContentReachTop(new com.tencent.mm.plugin.finder.assist.l3(b17));
        beginTransaction.k(com.tencent.mm.R.id.g3v, b17, null);
        beginTransaction.f();
        return b18;
    }
}
