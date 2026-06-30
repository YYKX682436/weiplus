package b92;

@j95.b
/* loaded from: classes3.dex */
public final class d1 extends i95.w implements c61.zb {

    /* renamed from: d, reason: collision with root package name */
    public boolean f99945d;

    public void Ai(java.lang.String userName, java.lang.String noticeId, r45.h32 liveNoticeInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeId, "noticeId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveNoticeInfo, "liveNoticeInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189463a.a(userName, noticeId, liveNoticeInfo);
    }

    public java.lang.Object Bi(long j17, java.lang.String str, long j18, java.lang.String str2, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return dk2.q4.f315471a.a(j17, str, j18, str2, 6, 0, 0, "", "", context, interfaceC29045xdcb5ca57);
    }

    public void Di(java.lang.String id6, int i17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        gz2.i iVar = gz2.i.f359273a;
        if (gz2.i.f359279g) {
            return;
        }
        if (i17 != 1 || gz2.i.f359274b.contains(id6)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("count id:");
            sb6.append(id6);
            sb6.append(", type:");
            sb6.append(i17);
            sb6.append(", params:");
            sb6.append(list != null ? kz5.n0.g0(list, null, null, null, 0, null, gz2.f.f359266d, 31, null) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveBatchReporter", sb6.toString());
            pm0.v.w(new gz2.g(list, id6, i17));
        }
    }

    public az2.j Ni(java.lang.String anchorFinderUserName, int i17, int i18, r45.qt2 qt2Var, int i19, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorFinderUserName, "anchorFinderUserName");
        return new ke2.b(anchorFinderUserName, i17, i18, qt2Var, i19, j17, null);
    }

    public az2.j Ri(java.lang.String userName, java.lang.String noticeId, int i17, r45.qt2 qt2Var, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeId, "noticeId");
        return new ke2.a(userName, noticeId, i17, qt2Var, java.lang.Integer.valueOf(i18));
    }

    public az2.j Ui(java.lang.String toUserName, java.lang.String msgContent, zy2.j5 j5Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUserName, "toUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgContent, "msgContent");
        return ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).Ui(toUserName, msgContent, j5Var);
    }

    public java.util.LinkedList Vi(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa<T> m56388xcaeb60d0;
        int size = (abstractC13919x46aff122 == null || (m56388xcaeb60d0 = abstractC13919x46aff122.m56388xcaeb60d0()) == 0) ? 0 : m56388xcaeb60d0.size();
        int i19 = i18 >= size ? size - 1 : i18 < i17 ? i17 : i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.filterData", "filterData firstItemPos:" + i17 + " lastItemPos:" + i18);
        boolean z17 = true;
        if (!(i17 >= 0 && i17 < size) || abstractC13919x46aff122 == null) {
            return null;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa<T> m56388xcaeb60d02 = abstractC13919x46aff122.m56388xcaeb60d0();
            if (m56388xcaeb60d02 == 0) {
                return null;
            }
            if (m56388xcaeb60d02.size() <= i19) {
                z17 = false;
            }
            java.util.List list = z17 ? m56388xcaeb60d02 : null;
            if (list != null) {
                return new java.util.LinkedList(kz5.n0.C0(list, new e06.k(i17, i19)));
            }
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.filterData", e17, "filterData fail", new java.lang.Object[0]);
            return null;
        }
    }

    public java.lang.String Zi(long j17) {
        return zl2.r4.S(zl2.r4.f555483a, j17, 0, 2, null);
    }

    public int aj(int i17) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1 i1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189463a;
        java.util.List createNoticeList = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189466d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createNoticeList, "createNoticeList");
        synchronized (createNoticeList) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : createNoticeList) {
                if (((r45.h32) obj).m75939xb282bd08(14) == i17) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList.size();
    }

    public r45.h32 bj(java.lang.String userName, java.lang.String noticeId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeId, "noticeId");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189463a.e(userName, noticeId);
    }

    public java.lang.String cj() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1 i1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189463a;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189464b;
        synchronized (concurrentHashMap) {
            for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                java.util.Iterator it = ((java.util.ArrayList) entry.getValue()).iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f1 f1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f1) it.next();
                    stringBuffer.append("[");
                    stringBuffer.append((java.lang.String) entry.getKey());
                    stringBuffer.append(":");
                    stringBuffer.append(f1Var.f189379a.m75939xb282bd08(1));
                    stringBuffer.append("]");
                }
            }
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringBuffer2, "toString(...)");
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextId, "contextId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickTabContextId, "clickTabContextId");
        dk2.r9 r9Var = dk2.r9.f315558a;
        java.lang.String str4 = "";
        ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Zi("", "goVisitorUIWithCheck");
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e d18 = config.d();
        if (d18 != null) {
            long j17 = d18.f150070e;
            if (j17 != 0) {
                ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                r0Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "#markTapEnterLive " + j17);
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6513xf93b0bed Ni = r0Var.Ni(j17);
                Ni.f138619e = j17;
                Ni.f138628n = c01.id.c();
            }
        }
        kz2.b.f395391a.d("goVisitorUIWithCheck", "init goVisitorUIWithCheck contextId:" + contextId + ' ' + config + ' ');
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e d19 = config.d();
        if (d19 != null) {
            if (intent == null || (str3 = intent.getStringExtra("key_enter_live_param_share_username")) == null) {
                str3 = "";
            }
            d19.I = str3;
        }
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e d27 = config.d();
        if (d27 != null) {
            d27.f150068J = intent != null ? intent.getIntExtra("key_enter_live_param_from_share_scene", 0) : 0;
        }
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e d28 = config.d();
        if (d28 != null) {
            d28.K = intent != null ? intent.getIntExtra("key_enter_live_param_from_share_scene_new", 0) : 0;
        }
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e d29 = config.d();
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
        config.f315865z = stringExtra;
        config.b(intent);
        byte[] byteArrayExtra = intent != null ? intent.getByteArrayExtra("KEY_ENTER_LIVE_PARAM_SQUARE_EXTRA_INFO") : null;
        if (byteArrayExtra != null) {
            r45.q92 q92Var = new r45.q92();
            try {
                q92Var.mo11468x92b714fd(byteArrayExtra);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
            config.f315862w = q92Var;
        }
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e d37 = config.d();
        if (d37 != null) {
            long j18 = d37.f150070e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8 y8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.f184265a;
            java.lang.String id6 = "RV_VISITOR_" + j18;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.f184269e;
            concurrentHashMap.clear();
            concurrentHashMap.put(id6, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.f9(c01.id.a(), 0, 0));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.e(y8Var, id6, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184102o.f184073b, null, true, false, false, 52, null);
        }
        ws2.k1.f530599r.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = contextId;
        if (contextId.length() == 0) {
            zy2.ra Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context);
            if (Sj != null && (str = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj).f216915p) != null) {
                str4 = str;
            }
            h0Var.f391656d = str4;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveJumpChecker", "goVisitorUIWithCheck locContextId:" + ((java.lang.String) h0Var.f391656d));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        h0Var2.f391656d = string;
        gk2.e eVar = gk2.e.f354004n;
        mm2.c1 c1Var = eVar != null ? (mm2.c1) eVar.a(mm2.c1.class) : null;
        java.lang.Long valueOf = (c1Var == null || (nw1Var = ((mm2.e1) c1Var.m147920xbba4bfc0(mm2.e1.class)).f410521r) == null) ? null : java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0));
        if (valueOf != null) {
            valueOf.longValue();
        }
        if (fp.h.c(30) && c1Var != null && (valueOf == null || valueOf.longValue() != 0)) {
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (com.p314xaae8f345.mm.ui.bk.w0() && com.p314xaae8f345.mm.ui.bk.y()) {
                if (activity != null && activity.isInMultiWindowMode()) {
                    if (intent != null) {
                        intent.addFlags(4096);
                    }
                    com.p314xaae8f345.mm.ui.fj.j(activity.getClass(), 0);
                    if (intent != null) {
                        intent.addFlags(268435456);
                    }
                    if (intent != null) {
                        intent.addFlags(32768);
                    }
                }
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionChannels.k(context, null)) {
            r9Var = null;
        }
        if (r9Var != null && (f17 = r9Var.f(new dk2.y8(context, h0Var2, f0Var))) != null && (d17 = f17.d(new dk2.a9(f0Var, context))) != null) {
            iq.b.r();
            dk2.r9 e18 = d17.e(context, false, new dk2.e9(config, context, h0Var, intent, z17, f0Var));
            if (e18 != null && (g17 = e18.g(context, new dk2.g9(f0Var, context))) != null && (a17 = g17.a(new dk2.i9(f0Var, context))) != null) {
                dk2.w8 w8Var = new dk2.w8(f0Var);
                if (iq.b.B(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, true)) {
                    w8Var.mo152xb9724478();
                    a17 = null;
                }
                if (a17 != null) {
                    iq.b.q(null, false);
                    if (aVar != null) {
                        aVar.mo152xb9724478();
                    }
                    a17.k(context, config, (java.lang.String) h0Var.f391656d, clickTabContextId, intent, z17);
                }
            }
        }
        return f0Var.f391649d;
    }

    public void hj(android.content.Context context, android.content.Intent intent, boolean z17) {
        dk2.r9 f17;
        dk2.r9 d17;
        dk2.r9 g17;
        dk2.r9 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        dk2.r9 r9Var = dk2.r9.f315558a;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        h0Var.f391656d = string;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionChannels.k(context, null)) {
            r9Var = null;
        }
        if (r9Var == null || (f17 = r9Var.f(new dk2.l9(context, h0Var))) == null || (d17 = f17.d(new dk2.m9(context))) == null) {
            return;
        }
        iq.b.r();
        dk2.n9 n9Var = new dk2.n9(context);
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).fk()) {
            n9Var.mo152xb9724478();
            d17 = null;
        }
        if (d17 == null || (g17 = d17.g(context, new dk2.o9(context))) == null || (a17 = g17.a(new dk2.p9(context))) == null) {
            return;
        }
        if (iq.b.B(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveJumpChecker", "checkTingChatRoom conflict with ting chat room");
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
            intent2.setClass(context, (java.lang.Class) ((jz5.n) jz2.x0.f384286J).mo141623x754a37bb());
            if (z18) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
                activity.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
            }
            boolean booleanExtra = intent2.getBooleanExtra("KEY_PARAMS_NEED_CLOSE_LIVE", true);
            if (booleanExtra) {
                dk2.ef.T(dk2.ef.f314905a, false, null, 3, null);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveJumpChecker", "context:" + context + ",is activity:" + z18 + ",needCloseLive:" + booleanExtra + '!');
        }
    }

    public boolean ij() {
        ae2.in inVar = ae2.in.f85221a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85436v6).mo141623x754a37bb()).r()).intValue();
        if (intValue == 1) {
            return false;
        }
        if (intValue != 2) {
            return this.f99945d;
        }
        return true;
    }

    public void mj(java.lang.Object panelObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panelObject, "panelObject");
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
        if (c14197x319b1b9e != null) {
            if2.z.f372686a.i(c14197x319b1b9e, new mf2.s(c14197x319b1b9e, panelObject));
        }
    }

    public void nj(java.lang.Object panelObject, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panelObject, "panelObject");
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
        if (c14197x319b1b9e != null) {
            if2.z.f372686a.i(c14197x319b1b9e, new mf2.t(c14197x319b1b9e, panelObject, i17));
        }
    }

    public void oj(java.lang.Object panelObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panelObject, "panelObject");
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
        if (c14197x319b1b9e != null) {
            if2.z.f372686a.i(c14197x319b1b9e, new mf2.u(c14197x319b1b9e, panelObject));
        }
    }

    public void pj(java.lang.String noticeId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeId, "noticeId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1 i1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189463a;
        java.util.List createNoticeList = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189466d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createNoticeList, "createNoticeList");
        pm0.v.G(createNoticeList, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.g1(noticeId));
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

    public void rj(ml2.t1 eid, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, r45.qt2 qt2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eid, "eid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        boolean z17 = feed instanceof so2.h1;
        if (z17 && z17) {
            r45.nw1 m59258xd0557130 = feed.getFeedObject().m59258xd0557130();
            long m75942xfb822ef2 = m59258xd0557130 != null ? m59258xd0557130.m75942xfb822ef2(0) : 0L;
            java.lang.String u17 = pm0.v.u(m75942xfb822ef2);
            java.lang.String u18 = pm0.v.u(feed.getFeedObject().f66939xc8a07680);
            i95.m c17 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, eid, kz5.c1.i(new jz5.l("share_scene", java.lang.String.valueOf(feed.getFeedObject().getShareScene())), new jz5.l("liveid", u17), new jz5.l("feedid", u18), new jz5.l("enter_session_id", pm0.v.u(((ml2.r0) i95.n0.c(ml2.r0.class)).Ri(m75942xfb822ef2)))), qt2Var != null ? qt2Var.m75945x2fec8307(1) : null, qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)).toString() : null, null, null, false, 112, null);
        }
    }

    public void sj(ml2.u1 eid, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, r45.qt2 qt2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eid, "eid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        if (feed instanceof so2.h1) {
            r45.nw1 m59258xd0557130 = feed.getFeedObject().m59258xd0557130();
            long m75942xfb822ef2 = m59258xd0557130 != null ? m59258xd0557130.m75942xfb822ef2(0) : 0L;
            java.lang.String u17 = pm0.v.u(m75942xfb822ef2);
            java.lang.String u18 = pm0.v.u(feed.getFeedObject().f66939xc8a07680);
            i95.m c17 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.I8((zy2.zb) c17, eid, kz5.c1.i(new jz5.l("share_scene", java.lang.String.valueOf(feed.getFeedObject().getShareScene())), new jz5.l("liveid", u17), new jz5.l("feedid", u18), new jz5.l("enter_session_id", pm0.v.u(((ml2.r0) i95.n0.c(ml2.r0.class)).Ri(m75942xfb822ef2)))), qt2Var != null ? qt2Var.m75945x2fec8307(1) : null, qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)).toString() : null, null, null, false, 112, null);
        }
    }

    public void tj(android.widget.ImageView imageView, java.lang.String url, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        zl2.r4 r4Var = zl2.r4.f555483a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", "setBlurBitmap imageView:" + imageView.getId() + ",url:" + url);
        mn2.g1 g1Var = mn2.g1.f411508a;
        g1Var.c().c(new mn2.e0(url, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), imageView, g1Var.h(mn2.f1.f411486d));
    }

    public void uj(android.content.Context context, r45.s02 modInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modInfo, "modInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x9 x9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x9(context, dk2.ef.I, g92.b.f351302e.u4(), modInfo);
        x9Var.T = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(x9Var, null, false, 0, 7, null);
        if (modInfo.m75939xb282bd08(3) == 9) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.b4 b4Var = ml2.b4.f408810x2;
            cl0.g gVar = new cl0.g();
            gVar.h("type", "2");
            gVar.h(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "3");
            ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
        }
    }

    public java.util.List vj(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "str");
        return r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null);
    }

    public void wi(ml2.f0 liveFeed) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveFeed, "liveFeed");
        new ml2.d().i(liveFeed, null);
    }

    public void wj(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        zl2.r4 r4Var = zl2.r4.f555483a;
        if (gVar == null) {
            return;
        }
        r45.tz1 tz1Var = new r45.tz1();
        try {
            tz1Var.mo11468x92b714fd(gVar.g());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            tz1Var = null;
        }
        if (tz1Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateLiveMentionRedDotSwitchConfig ");
            sb6.append(!tz1Var.m75933x41a8a7f2(0));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", sb6.toString());
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_MENTION_REDDOT_BOOLEAN_SYNC, java.lang.Boolean.valueOf(!tz1Var.m75933x41a8a7f2(0)));
        }
    }
}
