package lr1;

/* loaded from: classes11.dex */
public final class g implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public static final lr1.g f402195d = new lr1.g();

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizStrategyManager", "doBizStrategy callback %d/%d %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        lr1.k kVar = lr1.k.f402215a;
        kVar.b().putLong("biz_time_line_strategy_last_time", java.lang.System.currentTimeMillis());
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizStrategyResp");
            r45.rm rmVar = (r45.rm) fVar;
            r45.pm pmVar = rmVar.f466526f;
            if (pmVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizStrategyManager", "updateBizStrategyControlInfo RefreshInterval = %d", java.lang.Integer.valueOf(pmVar.f464706d));
                if (pmVar.f464706d > 0) {
                    kVar.b().putLong("biz_time_line_fetch_interval", pmVar.f464706d);
                }
            }
            r45.b43 b43Var = rmVar.f466539v;
            if (b43Var != null && b43Var.f452045e > 0.0f && b43Var.f452044d > 0.0f) {
                kVar.b().putFloat("key_biz_flutter_fling_friction", rmVar.f466539v.f452045e);
                kVar.b().putFloat("key_biz_flutter_min_fling_velocity_factor", rmVar.f466539v.f452044d);
            }
            yw.h1 h1Var = yw.h1.f547865a;
            r45.hm5 hm5Var = rmVar.f466542y;
            if (hm5Var != null) {
                h1Var.m().G("BizTimeLineShowRedPacketCover", hm5Var.f457827d);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterHelper", "saveRedPackageCoverConfig BizTimeLineShowRedPacketCover=" + hm5Var.f457827d);
            }
            o25.q qVar = o25.q.f424107a;
            r45.j9 j9Var = rmVar.f466525e;
            if (j9Var != null) {
                qVar.e().putBoolean("biz_time_line_has_fetch_strategy", true);
                qVar.e().putBoolean("biz_time_line_need_preload", j9Var.f459189e);
                qVar.e().putBoolean("biz_time_preload_at_foreground", j9Var.f459195n);
                qVar.e().putBoolean("biz_time_preload_at_chat_list", j9Var.f459196o);
                qVar.e().putBoolean("biz_time_preload_at_biz_box_expose", j9Var.f459197p);
                if (j9Var.f459191g > 0) {
                    qVar.e().putInt("biz_time_line_need_preload_interval", j9Var.f459191g);
                }
                if (j9Var.f459190f > 0) {
                    qVar.e().putInt("biz_time_line_need_preload_top_num", j9Var.f459190f);
                }
                if (j9Var.f459192h > 0) {
                    qVar.e().putInt("biz_time_line_msg_sync_gap", j9Var.f459192h);
                }
                if (j9Var.f459193i > 0) {
                    qVar.e().putInt("biz_time_line_pic_download_gap", j9Var.f459193i);
                }
                if (j9Var.f459194m > 0) {
                    qVar.e().putInt("biz_time_line_pic_limit_minute", j9Var.f459194m);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizImagePreloadStrategy", "CoverPreloadInfo: NeedPreload = " + j9Var.f459189e + ", NeedPreloadFold = " + j9Var.f459188d + ", PreloadInterval = " + j9Var.f459191g + ", PreloadTopNum = " + j9Var.f459191g + ", PreloadSyncGap = " + j9Var.f459192h + ", PreloadPicGap = " + j9Var.f459193i + ", NeedPreloadAtForeground = " + j9Var.f459195n + ", NeedPreloadAtChatList = " + j9Var.f459196o + ", NeedPreloadAtAppMsgExpose = " + j9Var.f459197p);
            }
            c01.y0 y0Var = c01.a1.f118578a;
            r45.zk5 zk5Var = rmVar.f466530m;
            if (zk5Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.BizTLRecFeedsDataUtil", "updateSvrSwitch = " + zk5Var.f473709d);
                int i19 = zk5Var.f473709d;
                c01.z0[] z0VarArr = c01.z0.f119110d;
                if (i19 == 1) {
                    y0Var.a().G("BizTLRecommendFeedsSvrOpen", false);
                } else if (i19 == 2) {
                    y0Var.a().G("BizTLRecommendFeedsSvrOpen", true);
                }
                y0Var.a().A("BizTLRecommendFeedsRefreshFreq", zk5Var.f473710e);
                y0Var.a().A("BizTLRecommendFeedsTimingPreload", zk5Var.f473711f);
                y0Var.a().G("BizTLRecommendFeedsShowRecReplaceButton", zk5Var.f473712g);
                y0Var.a().A("BizTLRecommendFeedsTimeGapOfRecDataRequest", zk5Var.f473713h);
                y0Var.a().A("BizTLRecommendClickReplaceNotExposedSwitch", zk5Var.f473715m);
                y0Var.a().A("BizTLRecommendClickNegativeReplaceNotExposedSwitch", zk5Var.f473716n);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.BizTLRecFeedsDataUtil", "BizTLRecommendFeedsTimingPreload = " + zk5Var.f473711f + ", BizTLRecommendFeedsShowReplaceButton = " + zk5Var.f473712g + ", BizTLRecommendFeedsTimeGapOfRecDataRequest = " + zk5Var.f473713h + ", BizTLRecommendFeedsClickReplaceNotExposedSwitch = " + zk5Var.f473715m + ", BizTLRecommendFeedsNegativeClickReplaceNotExposedSwitch = " + zk5Var.f473716n);
                r45.x25 x25Var = zk5Var.f473714i;
                if (x25Var != null) {
                    y0Var.a().A("BizTLRecommendFeedsBatchWithBizMsgResort", x25Var.f471229d);
                    y0Var.a().A("BizTLRecommendFeedsOutBoxPullFeedsNeedUplineCard", x25Var.f471230e);
                    y0Var.a().A("BizTLRecommendFeedsEnterBoxFilter", x25Var.f471231f);
                    y0Var.a().A("BizTLRecommendFeedsOutBoxPullFeedsControlSwitch", x25Var.f471232g);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.BizTLRecFeedsDataUtil", "BizTLRecommendFeedsBatchWithBizMsgResort = " + x25Var.f471229d + ", BizTLRecommendFeedsOutBoxPullFeedsNeedUplineCard = " + x25Var.f471230e + ", BizTLRecommendFeedsEnterBoxFilter = " + x25Var.f471231f + ", BizTLRecommendFeedsOutBoxPullFeedsControlSwitch = " + x25Var.f471232g);
                }
                y0Var.a().A("BizTLRecommendFeedsClientFeedsUIVersion", zk5Var.f473717o);
                y0Var.a().A("BizTLRecommendFeedsCloseNegativeButton", zk5Var.f473718p);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.BizTLRecFeedsDataUtil", "ClientFeedsUIVersion = " + zk5Var.f473717o);
            }
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0 b0Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a;
            r45.kk kkVar = rmVar.f466532o;
            b0Var.h().A("SvrOpenFlag", kkVar != null ? kkVar.f460305d : 0);
            r45.g85 g85Var = rmVar.f466523J;
            if (g85Var != null) {
                h1Var.m().A("key_biz_pic_text_scroll_list_enable", g85Var.f456524d);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterHelper", "savePicTextScrollConfig enable=" + g85Var.f456524d);
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.g2 g2Var = com.p314xaae8f345.mm.p2621x8fb0427b.g2.f275478a;
            r45.hl hlVar = rmVar.f466534q;
            if (hlVar != null) {
                g2Var.a().G("ReSortBizMsgRetrieveInvalidExposureCard", hlVar.f457784d);
                g2Var.a().A("ReSortBizMsgValidExposureAreaRatio", hlVar.f457785e);
                g2Var.a().A("ReSortBizMsgValidExposurePeriod", hlVar.f457786f);
                g2Var.a().G("ReSortBizMsgRedDotSample", hlVar.f457787g);
                g2Var.a().G("ReSortBizMsgRecMsgReportSample", hlVar.f457788h);
                g2Var.a().A("ReSortBizMsgRecMsgReportMaxCount", hlVar.f457789i);
                g2Var.a().A("ReSortBizMsgRecommendReasonMode", hlVar.f457790m);
                g2Var.a().A("AndroidValidExposureMode", hlVar.f457791n);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineResortLogic", "saveConfig RetrieveInvalidExposureCard=" + hlVar.f457784d + ", ValidExposureAreaRatio=" + hlVar.f457785e + ", ValidExposurePeriod=" + hlVar.f457786f + ", RedDotSample=" + hlVar.f457787g + ", RecMsgReportSample=" + hlVar.f457788h + "， RecMsgReportMaxCount=" + hlVar.f457789i + ", RecommendReasonMode=" + hlVar.f457790m);
            }
            r45.jl jlVar = rmVar.f466536s;
            if (jlVar != null) {
                h1Var.m().A("BizResortV2ControlFlag", jlVar.f459439d);
                h1Var.m().A("lift_read_area_size", jlVar.f459440e);
                h1Var.m().D("history_box_wording", jlVar.f459441f);
                h1Var.m().B("resort_scene_bit_switch", jlVar.f459443h);
                h1Var.m().A("hide_box_when_delete", jlVar.f459444i);
                h1Var.m().A("resort_blocked_when_client_running_back", jlVar.f459445m);
                h1Var.m().A("reddot_expose_end_report", jlVar.f459447o);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterHelper", "saveConfig controlFlag=" + jlVar.f459439d + " lift_read_area_size=" + jlVar.f459440e + " resort_scene_bit_switch=" + jlVar.f459443h + "  hide_box_when_delete=" + jlVar.f459444i + " resort_blocked_when_client_running_back: " + jlVar.f459445m + " reddot_expose_end_report=" + jlVar.f459447o + ' ');
            }
            dw5.q qVar2 = new dw5.q();
            qVar2.f325941d = h1Var.j();
            boolean[] zArr = qVar2.f325949o;
            zArr[1] = true;
            qVar2.f325942e = h1Var.m().o("lift_read_area_size", 0);
            zArr[2] = true;
            qVar2.f325943f = h1Var.k();
            zArr[3] = true;
            qVar2.f325944g = h1Var.m().q("resort_scene_bit_switch", 0L);
            zArr[4] = true;
            qVar2.f325945h = h1Var.m().o("resort_blocked_when_client_running_back", 0);
            zArr[5] = true;
            qVar2.f325946i = y0Var.a().o("BizTLRecommendFeedsBatchWithBizMsgResort", 0);
            zArr[6] = true;
            qVar2.f325947m = y0Var.a().o("BizTLRecommendFeedsOutBoxPullFeedsNeedUplineCard", 0);
            zArr[7] = true;
            qVar2.f325948n = h1Var.q();
            zArr[8] = true;
            if (z40.e.l4() && ((y40.i0) z40.e.get()).Ni()) {
                z40.e eVar = z40.e.get();
                lr1.i iVar = lr1.i.f402211a;
                ((y40.i0) eVar).getClass();
                com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c0 a17 = a50.e1.f83004a.a();
                if (a17 != null) {
                    a17.B(2, (cw5.g) y40.o0.a(qVar2, new cw5.g()), new y40.e0(iVar));
                }
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g0.f299596b.J(2, qVar2, lr1.j.f402214a);
            ur1.n nVar = ur1.n.f511894a;
            r45.sl slVar = rmVar.f466535r;
            if (slVar != null) {
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) ur1.n.f511895b).mo141623x754a37bb()).H("personal_center_main_table", slVar.mo14344x5f01b1f6());
            }
            r45.ev0 ev0Var = rmVar.f466537t;
            if (ev0Var != null) {
                ms1.b bVar = ms1.c.f412499a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineAutoPlayConfig", "updateVideoAutoPlayConfig= " + ev0Var);
                bVar.a().putInt("auto_play_trigger_threshold_in_ms", ev0Var.f455270d);
                bVar.a().putInt("config_key_video_lar_card_auto_play_enable", ev0Var.f455271e);
                bVar.a().putInt("config_key_video_scroll_card_auto_play_enable", ev0Var.f455272f);
                bVar.a().putInt("config_key_often_read_video_scroll_card_auto_play_enabled", ev0Var.f455273g);
            }
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e eVar2 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e.f270810a;
            r45.jm6 jm6Var = rmVar.f466533p;
            if (jm6Var != null) {
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizCommUtil", "setTimelineSettingInfo bitSet = " + jm6Var.f459488d);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("brandService").H("k_TimelineSettingInfo", jm6Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizCommUtil", "encode TimelineSettingInfo ex %s", e17.getMessage());
                }
            }
            int i27 = rmVar.H;
            yw.h1 h1Var2 = yw.h1.f547865a;
            h1Var2.m().A("key_biz_expt_report_list_rank_wait_cnt", i27);
            h1Var2.m().A("key_biz_prod_report_list_rank_wait_cnt", rmVar.I);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e eVar3 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e.f270810a;
            r45.dn dnVar = rmVar.f466540w;
            if (dnVar != null) {
                try {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("brandService").H("k_TimelinePersonalCenterSettingInfo", dnVar.mo14344x5f01b1f6());
                } catch (java.io.IOException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizCommUtil", "encode BizWxaPersonalCenter ex %s", e18.getMessage());
                }
            }
            r45.ul1 ul1Var = rmVar.f466538u;
            if (ul1Var != null) {
                ms1.b bVar2 = ms1.c.f412499a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineAutoPlayConfig", "updateLiveAutoPlayConfig= " + ul1Var);
                bVar2.a().putInt("config_key_live_card_auto_play_enable", ul1Var.f468987d);
                bVar2.a().putInt("config_key_rec_flow_live_dual_card_auto_play_enable", ul1Var.f468988e);
                bVar2.a().putInt("config_key_often_read_live_scroll_card_auto_play_enabled", ul1Var.f468989f);
            }
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e eVar4 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e.f270810a;
            r45.bf5 bf5Var = rmVar.f466543z;
            if (bf5Var != null) {
                java.util.Iterator it = bf5Var.f452262d.iterator();
                while (it.hasNext()) {
                    r45.af5 af5Var = (r45.af5) it.next();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizCommUtil", "setPublisherNewMsgInfo msg_version:" + af5Var.f451514d + " msg_open:" + af5Var.f451515e);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("brandService").putBoolean("k_personalCenterMessageListUseStyleV2_V" + af5Var.f451514d, af5Var.f451515e == 1);
                }
            }
            r45.am amVar = rmVar.A;
            if (amVar != null) {
                yw.h1 h1Var3 = yw.h1.f547865a;
                h1Var3.m().A("BizHoldSecAfterUserLeaveForReport", amVar.f451646d);
                h1Var3.m().A("BizTimeLineReportArticleJumpPathDepth", amVar.f451647e);
                h1Var3.m().A("BizTimeLineReportShowBatchSize", amVar.f451648f);
                h1Var3.m().D("BizTimeLineReportShowStrategyInfo", amVar.f451649g);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterHelper", "saveBizReportConfig BizRecReqReportWaitSec=" + amVar.f451646d + " & BizTimeLineReportArticleJumpPathDepth=" + amVar.f451647e + " & BizTimeLineReportShowBatchSize=" + amVar.f451648f + " & BizTimeLineReportShowStrategyInfo]" + amVar.f451649g);
            }
            r45.em6 em6Var = rmVar.D;
            if (em6Var != null) {
                yw.h1 h1Var4 = yw.h1.f547865a;
                h1Var4.m().A("BizTimeLineFinderInfo", em6Var.f455144d);
                h1Var4.m().G("biz_time_line_finder_display_breathing_light", em6Var.f455145e);
                h1Var4.m().A("biz_time_line_finder_get_live_info_interval", em6Var.f455146f);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterHelper", "saveBizTimelineFinderInfo BizTimeLineFinderInfo=" + em6Var.f455144d + ", display_breathing_light: " + em6Var.f455145e + ", get_live_info_interval: " + em6Var.f455146f);
            }
            r45.tb tbVar = rmVar.E;
            if (tbVar != null) {
                yw.h1 h1Var5 = yw.h1.f547865a;
                if (tbVar.f467797d > 0) {
                    h1Var5.m().H("BizAudioFeedsInfo", tbVar.mo14344x5f01b1f6());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterHelper", "saveAudioFeedsInfo " + tbVar);
                }
            }
            r45.zw6 zw6Var = rmVar.F;
            if (zw6Var != null) {
                yw.h1 h1Var6 = yw.h1.f547865a;
                h1Var6.m().A("biz_time_line_valid_expose_area_ratio", zw6Var.f473978d);
                h1Var6.m().A("biz_time_line_valid_expose_time_ms", zw6Var.f473979e);
                h1Var6.m().A("biz_time_line_extra_calc_expose_time_ms", zw6Var.f473980f);
                h1Var6.m().A("biz_time_line_new_valid_expose_time_ms", zw6Var.f473981g);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterHelper", "saveValidExposeConfig ValidExposeAreaRatio=" + zw6Var.f473978d + ", ValidExposeTimeMs: " + zw6Var.f473979e + ", ExtraCalcExposeTimeMs: " + zw6Var.f473980f + "  NewValidExposeTimeMs: " + zw6Var.f473981g);
            }
            r45.r80 r80Var = rmVar.G;
            if (r80Var != null) {
                yw.h1.f547865a.m().A("key_biz_fetch_contact_create_time_interval_in_second", r80Var.f466141d);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterHelper", "saveContactListConfig intervalSec=" + r80Var.f466141d);
            }
            r45.ww4 ww4Var = rmVar.K;
            if (ww4Var != null) {
                yw.h1 h1Var7 = yw.h1.f547865a;
                int i28 = ww4Var.f471078d;
                h1Var7.m().A("key_biz_notify_permanent", i28);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterHelper", "saveNotifyConfig notifyPermanent=" + i28);
            }
        }
        return 0;
    }
}
