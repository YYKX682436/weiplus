package b92;

@j95.b
/* loaded from: classes3.dex */
public final class d1 extends i95.w implements c61.zb {

    /* renamed from: d, reason: collision with root package name */
    public boolean f18412d;

    public void Ai(java.lang.String userName, java.lang.String noticeId, r45.h32 liveNoticeInfo) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(noticeId, "noticeId");
        kotlin.jvm.internal.o.g(liveNoticeInfo, "liveNoticeInfo");
        com.tencent.mm.plugin.finder.feed.model.i1.f107930a.a(userName, noticeId, liveNoticeInfo);
    }

    public java.lang.Object Bi(long j17, java.lang.String str, long j18, java.lang.String str2, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        return dk2.q4.f233938a.a(j17, str, j18, str2, 6, 0, 0, "", "", context, continuation);
    }

    public void Di(java.lang.String id6, int i17, java.util.List list) {
        kotlin.jvm.internal.o.g(id6, "id");
        gz2.i iVar = gz2.i.f277740a;
        if (gz2.i.f277746g) {
            return;
        }
        if (i17 != 1 || gz2.i.f277741b.contains(id6)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("count id:");
            sb6.append(id6);
            sb6.append(", type:");
            sb6.append(i17);
            sb6.append(", params:");
            sb6.append(list != null ? kz5.n0.g0(list, null, null, null, 0, null, gz2.f.f277733d, 31, null) : null);
            com.tencent.mars.xlog.Log.i("Finder.LiveBatchReporter", sb6.toString());
            pm0.v.w(new gz2.g(list, id6, i17));
        }
    }

    public az2.j Ni(java.lang.String anchorFinderUserName, int i17, int i18, r45.qt2 qt2Var, int i19, long j17) {
        kotlin.jvm.internal.o.g(anchorFinderUserName, "anchorFinderUserName");
        return new ke2.b(anchorFinderUserName, i17, i18, qt2Var, i19, j17, null);
    }

    public az2.j Ri(java.lang.String userName, java.lang.String noticeId, int i17, r45.qt2 qt2Var, int i18) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(noticeId, "noticeId");
        return new ke2.a(userName, noticeId, i17, qt2Var, java.lang.Integer.valueOf(i18));
    }

    public az2.j Ui(java.lang.String toUserName, java.lang.String msgContent, zy2.j5 j5Var) {
        kotlin.jvm.internal.o.g(toUserName, "toUserName");
        kotlin.jvm.internal.o.g(msgContent, "msgContent");
        return ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).Ui(toUserName, msgContent, j5Var);
    }

    public java.util.LinkedList Vi(com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader, int i17, int i18) {
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> dataListJustForAdapter;
        int size = (baseFeedLoader == null || (dataListJustForAdapter = baseFeedLoader.getDataListJustForAdapter()) == 0) ? 0 : dataListJustForAdapter.size();
        int i19 = i18 >= size ? size - 1 : i18 < i17 ? i17 : i18;
        com.tencent.mars.xlog.Log.i("Finder.filterData", "filterData firstItemPos:" + i17 + " lastItemPos:" + i18);
        boolean z17 = true;
        if (!(i17 >= 0 && i17 < size) || baseFeedLoader == null) {
            return null;
        }
        try {
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> dataListJustForAdapter2 = baseFeedLoader.getDataListJustForAdapter();
            if (dataListJustForAdapter2 == 0) {
                return null;
            }
            if (dataListJustForAdapter2.size() <= i19) {
                z17 = false;
            }
            java.util.List list = z17 ? dataListJustForAdapter2 : null;
            if (list != null) {
                return new java.util.LinkedList(kz5.n0.C0(list, new e06.k(i17, i19)));
            }
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.filterData", e17, "filterData fail", new java.lang.Object[0]);
            return null;
        }
    }

    public java.lang.String Zi(long j17) {
        return zl2.r4.S(zl2.r4.f473950a, j17, 0, 2, null);
    }

    public int aj(int i17) {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.finder.feed.model.i1 i1Var = com.tencent.mm.plugin.finder.feed.model.i1.f107930a;
        java.util.List createNoticeList = com.tencent.mm.plugin.finder.feed.model.i1.f107933d;
        kotlin.jvm.internal.o.f(createNoticeList, "createNoticeList");
        synchronized (createNoticeList) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : createNoticeList) {
                if (((r45.h32) obj).getInteger(14) == i17) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList.size();
    }

    public r45.h32 bj(java.lang.String userName, java.lang.String noticeId) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(noticeId, "noticeId");
        return com.tencent.mm.plugin.finder.feed.model.i1.f107930a.e(userName, noticeId);
    }

    public java.lang.String cj() {
        com.tencent.mm.plugin.finder.feed.model.i1 i1Var = com.tencent.mm.plugin.finder.feed.model.i1.f107930a;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.finder.feed.model.i1.f107931b;
        synchronized (concurrentHashMap) {
            for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                java.util.Iterator it = ((java.util.ArrayList) entry.getValue()).iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.finder.feed.model.f1 f1Var = (com.tencent.mm.plugin.finder.feed.model.f1) it.next();
                    stringBuffer.append("[");
                    stringBuffer.append((java.lang.String) entry.getKey());
                    stringBuffer.append(":");
                    stringBuffer.append(f1Var.f107846a.getInteger(1));
                    stringBuffer.append("]");
                }
            }
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        kotlin.jvm.internal.o.f(stringBuffer2, "toString(...)");
        return stringBuffer2;
    }

    public int fj(android.content.Context context, dk2.x4 config, java.lang.String contextId, java.lang.String clickTabContextId, android.content.Intent intent, boolean z17, yz5.a aVar) {
        dk2.r9 f17;
        dk2.r9 d17;
        dk2.r9 g17;
        dk2.r9 a17;
        r45.nw1 nw1Var;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(contextId, "contextId");
        kotlin.jvm.internal.o.g(clickTabContextId, "clickTabContextId");
        dk2.r9 r9Var = dk2.r9.f234025a;
        java.lang.String str4 = "";
        ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Zi("", "goVisitorUIWithCheck");
        com.tencent.mm.live.api.LiveConfig d18 = config.d();
        if (d18 != null) {
            long j17 = d18.f68537e;
            if (j17 != 0) {
                ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                r0Var.getClass();
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "#markTapEnterLive " + j17);
                com.tencent.mm.autogen.mmdata.rpt.FinderLiveCdnUserEnterLiveTimeCostStruct Ni = r0Var.Ni(j17);
                Ni.f57086e = j17;
                Ni.f57095n = c01.id.c();
            }
        }
        kz2.b.f313858a.d("goVisitorUIWithCheck", "init goVisitorUIWithCheck contextId:" + contextId + ' ' + config + ' ');
        com.tencent.mm.live.api.LiveConfig d19 = config.d();
        if (d19 != null) {
            if (intent == null || (str3 = intent.getStringExtra("key_enter_live_param_share_username")) == null) {
                str3 = "";
            }
            d19.I = str3;
        }
        com.tencent.mm.live.api.LiveConfig d27 = config.d();
        if (d27 != null) {
            d27.f68535J = intent != null ? intent.getIntExtra("key_enter_live_param_from_share_scene", 0) : 0;
        }
        com.tencent.mm.live.api.LiveConfig d28 = config.d();
        if (d28 != null) {
            d28.K = intent != null ? intent.getIntExtra("key_enter_live_param_from_share_scene_new", 0) : 0;
        }
        com.tencent.mm.live.api.LiveConfig d29 = config.d();
        if (d29 != null) {
            if (intent == null || (str2 = intent.getStringExtra("KEY_ENTER_LIVE_PARAM_TO_USERNAME")) == null) {
                str2 = "";
            }
            d29.L = str2;
        }
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("key_enter_live_param_ecsource") : null;
        if (stringExtra == null) {
            stringExtra = "";
        }
        config.f234332z = stringExtra;
        config.b(intent);
        byte[] byteArrayExtra = intent != null ? intent.getByteArrayExtra("KEY_ENTER_LIVE_PARAM_SQUARE_EXTRA_INFO") : null;
        if (byteArrayExtra != null) {
            r45.q92 q92Var = new r45.q92();
            try {
                q92Var.parseFrom(byteArrayExtra);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
            config.f234329w = q92Var;
        }
        com.tencent.mm.live.api.LiveConfig d37 = config.d();
        if (d37 != null) {
            long j18 = d37.f68537e;
            com.tencent.mm.plugin.finder.assist.y8 y8Var = com.tencent.mm.plugin.finder.assist.y8.f102732a;
            java.lang.String id6 = "RV_VISITOR_" + j18;
            kotlin.jvm.internal.o.g(id6, "id");
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.finder.assist.y8.f102736e;
            concurrentHashMap.clear();
            concurrentHashMap.put(id6, new com.tencent.mm.plugin.finder.assist.f9(c01.id.a(), 0, 0));
            com.tencent.mm.plugin.finder.assist.y8.e(y8Var, id6, com.tencent.mm.plugin.finder.assist.t8.f102569o.f102540b, null, true, false, false, 52, null);
        }
        ws2.k1.f449066r.c();
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = contextId;
        if (contextId.length() == 0) {
            zy2.ra Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context);
            if (Sj != null && (str = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).f135382p) != null) {
                str4 = str;
            }
            h0Var.f310123d = str4;
            com.tencent.mars.xlog.Log.i("Finder.LiveJumpChecker", "goVisitorUIWithCheck locContextId:" + ((java.lang.String) h0Var.f310123d));
        }
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.f490454vi);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        h0Var2.f310123d = string;
        gk2.e eVar = gk2.e.f272471n;
        mm2.c1 c1Var = eVar != null ? (mm2.c1) eVar.a(mm2.c1.class) : null;
        java.lang.Long valueOf = (c1Var == null || (nw1Var = ((mm2.e1) c1Var.business(mm2.e1.class)).f328988r) == null) ? null : java.lang.Long.valueOf(nw1Var.getLong(0));
        if (valueOf != null) {
            valueOf.longValue();
        }
        if (fp.h.c(30) && c1Var != null && (valueOf == null || valueOf.longValue() != 0)) {
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (com.tencent.mm.ui.bk.w0() && com.tencent.mm.ui.bk.y()) {
                if (activity != null && activity.isInMultiWindowMode()) {
                    if (intent != null) {
                        intent.addFlags(4096);
                    }
                    com.tencent.mm.ui.fj.j(activity.getClass(), 0);
                    if (intent != null) {
                        intent.addFlags(268435456);
                    }
                    if (intent != null) {
                        intent.addFlags(32768);
                    }
                }
            }
        }
        if (!com.tencent.mm.sdk.platformtools.f9.SessionChannels.k(context, null)) {
            r9Var = null;
        }
        if (r9Var != null && (f17 = r9Var.f(new dk2.y8(context, h0Var2, f0Var))) != null && (d17 = f17.d(new dk2.a9(f0Var, context))) != null) {
            iq.b.r();
            dk2.r9 e18 = d17.e(context, false, new dk2.e9(config, context, h0Var, intent, z17, f0Var));
            if (e18 != null && (g17 = e18.g(context, new dk2.g9(f0Var, context))) != null && (a17 = g17.a(new dk2.i9(f0Var, context))) != null) {
                dk2.w8 w8Var = new dk2.w8(f0Var);
                if (iq.b.B(com.tencent.mm.sdk.platformtools.x2.f193071a, true)) {
                    w8Var.invoke();
                    a17 = null;
                }
                if (a17 != null) {
                    iq.b.q(null, false);
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    a17.k(context, config, (java.lang.String) h0Var.f310123d, clickTabContextId, intent, z17);
                }
            }
        }
        return f0Var.f310116d;
    }

    public void hj(android.content.Context context, android.content.Intent intent, boolean z17) {
        dk2.r9 f17;
        dk2.r9 d17;
        dk2.r9 g17;
        dk2.r9 a17;
        kotlin.jvm.internal.o.g(context, "context");
        dk2.r9 r9Var = dk2.r9.f234025a;
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.f490454vi);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        h0Var.f310123d = string;
        if (!com.tencent.mm.sdk.platformtools.f9.SessionChannels.k(context, null)) {
            r9Var = null;
        }
        if (r9Var == null || (f17 = r9Var.f(new dk2.l9(context, h0Var))) == null || (d17 = f17.d(new dk2.m9(context))) == null) {
            return;
        }
        iq.b.r();
        dk2.n9 n9Var = new dk2.n9(context);
        if (((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).fk()) {
            n9Var.invoke();
            d17 = null;
        }
        if (d17 == null || (g17 = d17.g(context, new dk2.o9(context))) == null || (a17 = g17.a(new dk2.p9(context))) == null) {
            return;
        }
        if (iq.b.B(com.tencent.mm.sdk.platformtools.x2.f193071a, true)) {
            com.tencent.mars.xlog.Log.i("Finder.LiveJumpChecker", "checkTingChatRoom conflict with ting chat room");
            a17 = null;
        }
        if (a17 != null) {
            iq.b.q(null, false);
            android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
            boolean z18 = context instanceof android.app.Activity;
            android.content.Intent intent3 = !z18 ? intent2 : null;
            if (intent3 != null) {
                intent3.addFlags(268435456);
            }
            intent2.setClass(context, (java.lang.Class) ((jz5.n) jz2.x0.f302753J).getValue());
            if (z18) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(1010);
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.k((android.app.Activity) context, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/FinderLiveJumpChecker", "gotoFinderReplayUI", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/model/FinderLiveJumpChecker", "gotoFinderReplayUI", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/finder/live/model/FinderLiveJumpChecker", "gotoFinderReplayUI", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            android.app.Activity activity = z18 ? (android.app.Activity) context : null;
            if (activity != null) {
                activity.overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
            }
            boolean booleanExtra = intent2.getBooleanExtra("KEY_PARAMS_NEED_CLOSE_LIVE", true);
            if (booleanExtra) {
                dk2.ef.T(dk2.ef.f233372a, false, null, 3, null);
            }
            com.tencent.mars.xlog.Log.i("Finder.LiveJumpChecker", "context:" + context + ",is activity:" + z18 + ",needCloseLive:" + booleanExtra + '!');
        }
    }

    public boolean ij() {
        ae2.in inVar = ae2.in.f3688a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3903v6).getValue()).r()).intValue();
        if (intValue == 1) {
            return false;
        }
        if (intValue != 2) {
            return this.f18412d;
        }
        return true;
    }

    public void mj(java.lang.Object panelObject) {
        kotlin.jvm.internal.o.g(panelObject, "panelObject");
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore != null) {
            if2.z.f291153a.i(liveRoomControllerStore, new mf2.s(liveRoomControllerStore, panelObject));
        }
    }

    public void nj(java.lang.Object panelObject, int i17) {
        kotlin.jvm.internal.o.g(panelObject, "panelObject");
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore != null) {
            if2.z.f291153a.i(liveRoomControllerStore, new mf2.t(liveRoomControllerStore, panelObject, i17));
        }
    }

    public void oj(java.lang.Object panelObject) {
        kotlin.jvm.internal.o.g(panelObject, "panelObject");
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore != null) {
            if2.z.f291153a.i(liveRoomControllerStore, new mf2.u(liveRoomControllerStore, panelObject));
        }
    }

    public void pj(java.lang.String noticeId) {
        kotlin.jvm.internal.o.g(noticeId, "noticeId");
        com.tencent.mm.plugin.finder.feed.model.i1 i1Var = com.tencent.mm.plugin.finder.feed.model.i1.f107930a;
        java.util.List createNoticeList = com.tencent.mm.plugin.finder.feed.model.i1.f107933d;
        kotlin.jvm.internal.o.f(createNoticeList, "createNoticeList");
        pm0.v.G(createNoticeList, new com.tencent.mm.plugin.finder.feed.model.g1(noticeId));
    }

    public final void qj(boolean z17, java.lang.String str, long j17, int i17, int i18) {
        java.util.Map l17 = kz5.c1.l(new jz5.l("finder_feedid", pm0.v.u(j17)), new jz5.l("finder_feedid_commnt_count", java.lang.String.valueOf(i17)));
        zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
        java.lang.String valueOf = java.lang.String.valueOf(i18);
        if (z17) {
            ((ml2.j0) zbVar).Tj(str, l17, null, valueOf, null, null);
        } else {
            ((ml2.j0) zbVar).Sj(str, l17, null, valueOf, null, null);
        }
    }

    public void rj(ml2.t1 eid, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, r45.qt2 qt2Var) {
        kotlin.jvm.internal.o.g(eid, "eid");
        kotlin.jvm.internal.o.g(feed, "feed");
        boolean z17 = feed instanceof so2.h1;
        if (z17 && z17) {
            r45.nw1 liveInfo = feed.getFeedObject().getLiveInfo();
            long j17 = liveInfo != null ? liveInfo.getLong(0) : 0L;
            java.lang.String u17 = pm0.v.u(j17);
            java.lang.String u18 = pm0.v.u(feed.getFeedObject().field_id);
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, eid, kz5.c1.i(new jz5.l("share_scene", java.lang.String.valueOf(feed.getFeedObject().getShareScene())), new jz5.l("liveid", u17), new jz5.l("feedid", u18), new jz5.l("enter_session_id", pm0.v.u(((ml2.r0) i95.n0.c(ml2.r0.class)).Ri(j17)))), qt2Var != null ? qt2Var.getString(1) : null, qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)).toString() : null, null, null, false, 112, null);
        }
    }

    public void sj(ml2.u1 eid, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, r45.qt2 qt2Var) {
        kotlin.jvm.internal.o.g(eid, "eid");
        kotlin.jvm.internal.o.g(feed, "feed");
        if (feed instanceof so2.h1) {
            r45.nw1 liveInfo = feed.getFeedObject().getLiveInfo();
            long j17 = liveInfo != null ? liveInfo.getLong(0) : 0L;
            java.lang.String u17 = pm0.v.u(j17);
            java.lang.String u18 = pm0.v.u(feed.getFeedObject().field_id);
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.I8((zy2.zb) c17, eid, kz5.c1.i(new jz5.l("share_scene", java.lang.String.valueOf(feed.getFeedObject().getShareScene())), new jz5.l("liveid", u17), new jz5.l("feedid", u18), new jz5.l("enter_session_id", pm0.v.u(((ml2.r0) i95.n0.c(ml2.r0.class)).Ri(j17)))), qt2Var != null ? qt2Var.getString(1) : null, qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)).toString() : null, null, null, false, 112, null);
        }
    }

    public void tj(android.widget.ImageView imageView, java.lang.String url, int i17) {
        kotlin.jvm.internal.o.g(imageView, "imageView");
        kotlin.jvm.internal.o.g(url, "url");
        zl2.r4 r4Var = zl2.r4.f473950a;
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "setBlurBitmap imageView:" + imageView.getId() + ",url:" + url);
        mn2.g1 g1Var = mn2.g1.f329975a;
        g1Var.c().c(new mn2.e0(url, com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView, g1Var.h(mn2.f1.f329953d));
    }

    public void uj(android.content.Context context, r45.s02 modInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(modInfo, "modInfo");
        com.tencent.mm.plugin.finder.live.widget.x9 x9Var = new com.tencent.mm.plugin.finder.live.widget.x9(context, dk2.ef.I, g92.b.f269769e.u4(), modInfo);
        x9Var.T = null;
        com.tencent.mm.plugin.finder.live.widget.e0.W(x9Var, null, false, 0, 7, null);
        if (modInfo.getInteger(3) == 9) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.b4 b4Var = ml2.b4.f327277x2;
            cl0.g gVar = new cl0.g();
            gVar.h("type", "2");
            gVar.h(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "3");
            ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
        }
    }

    public java.util.List vj(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "str");
        return r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null);
    }

    public void wi(ml2.f0 liveFeed) {
        kotlin.jvm.internal.o.g(liveFeed, "liveFeed");
        new ml2.d().i(liveFeed, null);
    }

    public void wj(com.tencent.mm.protobuf.g gVar) {
        zl2.r4 r4Var = zl2.r4.f473950a;
        if (gVar == null) {
            return;
        }
        r45.tz1 tz1Var = new r45.tz1();
        try {
            tz1Var.parseFrom(gVar.g());
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            tz1Var = null;
        }
        if (tz1Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateLiveMentionRedDotSwitchConfig ");
            sb6.append(!tz1Var.getBoolean(0));
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", sb6.toString());
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_MENTION_REDDOT_BOOLEAN_SYNC, java.lang.Boolean.valueOf(!tz1Var.getBoolean(0)));
        }
    }
}
