package c61;

/* loaded from: classes3.dex */
public interface ub extends i95.m {
    static void A3(c61.ub ubVar, android.app.Activity activity, android.content.Intent intent, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa contact, int i17, boolean z17, java.lang.Boolean bool, r45.h32 h32Var, boolean z18, r45.j01 j01Var, com.p314xaae8f345.mm.ui.zc zcVar, int i18, java.lang.Object obj) {
        java.util.ArrayList arrayList;
        java.util.LinkedList linkedList;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterFinderLiveNoticeUI");
        }
        boolean z19 = (i18 & 16) != 0 ? true : z17;
        java.lang.Boolean bool2 = (i18 & 32) != 0 ? java.lang.Boolean.FALSE : bool;
        jz5.f0 f0Var = null;
        r45.h32 h32Var2 = (i18 & 64) != 0 ? null : h32Var;
        boolean z27 = (i18 & 128) != 0 ? false : z18;
        com.p314xaae8f345.mm.ui.zc zcVar2 = (i18 & 512) != 0 ? null : zcVar;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        if (j01Var == null && h32Var2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.ActivityRouter", "no createLivePrepareResponse but not edit mode");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#enterFinderLiveNoticeUI notice_attach_available_items.attach_type=");
        if (j01Var == null || (linkedList = j01Var.I1) == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Integer.valueOf(((r45.d32) it.next()).f453565d));
            }
        }
        sb6.append(arrayList);
        sb6.append(", isHalfScreen=");
        sb6.append(bool2);
        sb6.append(", requestCode=");
        sb6.append(i17);
        sb6.append(", iResult=");
        sb6.append(zcVar2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", sb6.toString());
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        intent2.putExtra("KEY_FINDER_LIVE_NOTICE_CONTACT", contact.mo14344x5f01b1f6());
        if (j01Var != null) {
            intent2.putExtra("KEY_FINDER_LIVE_CREATE_LIVE_PREPARE", j01Var.mo14344x5f01b1f6());
        }
        if (h32Var2 != null) {
            intent2.putExtra("KEY_COME_HERE_TO_EDIT_NOTICE_OBJECT", h32Var2.mo14344x5f01b1f6());
        }
        intent2.putExtra("KEY_FINDER_LIVE_NOTICE_IS_CAN_CREATE", z19);
        intent2.putExtra("KEY_FINDER_LIVE_NOTICE_CREATE_ONLY_PUBLIC_MODE", z27);
        int i19 = activity.getResources().getConfiguration().orientation;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (i19 == 2) {
            jz2.x0 x0Var = jz2.x0.f384287a;
            intent2.setClass(activity, (java.lang.Class) ((jz5.n) jz2.x0.I).mo141623x754a37bb());
            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = activity instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity : null;
            if (zcVar2 != null && activityC21401x6ce6f73f != null) {
                ((com.p314xaae8f345.mm.ui.bd) activityC21401x6ce6f73f.m78751x5dc77fb5(intent2)).f279410a = zcVar2;
                f0Var = f0Var2;
            }
            if (f0Var == null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(java.lang.Integer.valueOf(i17));
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.k(activity, arrayList2.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLiveNoticeUI", "(Landroid/app/Activity;Landroid/content/Intent;Lcom/tencent/mm/protocal/protobuf/FinderContact;IZLjava/lang/Boolean;Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeInfo;ZLcom/tencent/mm/protocal/protobuf/FinderCreateLivePrepareResponse;Lcom/tencent/mm/ui/MMFragmentActivity$IResult;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            }
            activity.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool2, java.lang.Boolean.TRUE)) {
            bh5.c cVar = new bh5.c();
            cVar.f102455a.f102457a = activity;
            cVar.d(intent2);
            cVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.C15123xb4cb4e7d.class);
            cVar.a("com.tencent.mm.plugin.finder.feed.ui.FinderLiveNoticeUI");
            if (zcVar2 != null) {
                cVar.i(zcVar2);
                return;
            } else {
                cVar.h(i17);
                return;
            }
        }
        jz2.x0 x0Var2 = jz2.x0.f384287a;
        intent2.setClass(activity, (java.lang.Class) ((jz5.n) jz2.x0.I).mo141623x754a37bb());
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f2 = activity instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity : null;
        if (zcVar2 != null && activityC21401x6ce6f73f2 != null) {
            ((com.p314xaae8f345.mm.ui.bd) activityC21401x6ce6f73f2.m78751x5dc77fb5(intent2)).f279410a = zcVar2;
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(java.lang.Integer.valueOf(i17));
            arrayList3.add(intent2);
            java.util.Collections.reverse(arrayList3);
            yj0.a.k(activity, arrayList3.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLiveNoticeUI", "(Landroid/app/Activity;Landroid/content/Intent;Lcom/tencent/mm/protocal/protobuf/FinderContact;IZLjava/lang/Boolean;Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeInfo;ZLcom/tencent/mm/protocal/protobuf/FinderCreateLivePrepareResponse;Lcom/tencent/mm/ui/MMFragmentActivity$IResult;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
        activity.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
    }

    static int F7(c61.ub ubVar, android.content.Context context, dk2.x4 config, java.lang.String str, java.lang.String str2, android.content.Intent intent, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterFinderLiveVisitorUI");
        }
        java.lang.String contextId = (i17 & 4) != 0 ? "" : str;
        java.lang.String clickTabContextId = (i17 & 8) != 0 ? "" : str2;
        android.content.Intent intent2 = (i17 & 16) != 0 ? null : intent;
        boolean z18 = (i17 & 32) != 0 ? false : z17;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextId, "contextId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickTabContextId, "clickTabContextId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", "[enterFinderLiveVisitorUI] " + config + ",contextId:" + contextId + ",clickTabContextId:" + clickTabContextId);
        boolean z19 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85366o4).mo141623x754a37bb()).r()).intValue() == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q5 q5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q5();
        q5Var.f206801a = java.lang.System.currentTimeMillis();
        q5Var.f206806f = z19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r5.f206869b = q5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206791d = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206789b = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206790c = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206792e = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206794g = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p1 p1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p1();
        p1Var.f206763a = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206791d = p1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206789b = 1L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206790c = 1L;
        p1Var.f206764b = 0L;
        p1Var.f206765c = 0L;
        p1Var.f206766d = 0L;
        p1Var.f206767e = 0L;
        p1Var.f206768f = 0L;
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e d17 = config.d();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).Bk(d17 != null ? d17.f150070e : 0L);
        if ((config.f315854o & 4) > 0) {
            return 0;
        }
        return ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).fj(context, config, contextId, clickTabContextId, intent2, z18, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.z(config, z19));
    }

    static void I2(c61.ub ubVar, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, android.os.Bundle bundle, int i17, int i18, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shareToSnsTimeLine");
        }
        if ((i19 & 4) != 0) {
            bundle = null;
        }
        android.os.Bundle bundle2 = bundle;
        if ((i19 & 8) != 0) {
            i17 = 2;
        }
        int i27 = i17;
        if ((i19 & 16) != 0) {
            i18 = 0;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a.E(context, feed, bundle2, i27, i18);
    }

    static /* synthetic */ void L7(c61.ub ubVar, android.content.Context context, android.content.Intent intent, int i17, boolean z17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterFinderTimelineUI");
        }
        if ((i18 & 4) != 0) {
            i17 = 2;
        }
        if ((i18 & 8) != 0) {
            z17 = true;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).xk(context, intent, i17, z17);
    }

    static /* synthetic */ void M8(c61.ub ubVar, android.content.Context context, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, yz5.l lVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openAddTagLiteApp");
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).tl(context, c19786x6a1e2862, (i17 & 4) != 0 ? null : map, (i17 & 8) != 0 ? null : abstractC14490x69736cb5, (i17 & 16) != 0 ? null : lVar);
    }

    static void Rf(c61.ub ubVar, android.content.Context context, long j17, java.lang.String nonceId, r45.nw1 nw1Var, km2.v vVar, r45.h32 h32Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.LinkedList linkedList, android.content.Intent intent, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterFinderLiveAnchorUI");
        }
        r45.nw1 liveInfo = (i17 & 8) != 0 ? new r45.nw1() : nw1Var;
        r45.h32 h32Var2 = (i17 & 32) != 0 ? null : h32Var;
        java.lang.String str4 = (i17 & 64) != 0 ? null : str;
        java.lang.String contextId = (i17 & 128) != 0 ? "" : str2;
        java.lang.String str5 = (i17 & 256) != 0 ? null : str3;
        java.util.LinkedList linkedList2 = (i17 & 512) != 0 ? null : linkedList;
        android.content.Intent intent2 = (i17 & 1024) == 0 ? intent : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar;
        i0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveInfo, "liveInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextId, "contextId");
        en0.g gVar = new en0.g();
        gVar.f336779a = 0;
        gVar.f336781c = liveInfo.m75942xfb822ef2(0);
        gVar.f336789k = j17;
        gVar.f336795q = nonceId;
        gVar.f336784f = xy2.c.e(context);
        gVar.f336796r = "";
        gVar.f336799u = 0L;
        gVar.f336800v = 0L;
        gVar.f336797s = "";
        gVar.f336798t = "";
        gVar.f336790l = str4;
        gVar.f336801w = str5;
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e a17 = gVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", "enterFinderLiveAnchorUI " + a17.b());
        dk2.x4 x4Var = new dk2.x4();
        x4Var.f315851l.add(a17);
        x4Var.f315840a = h32Var2;
        x4Var.f315852m = liveInfo.m75939xb282bd08(21);
        x4Var.f315844e = linkedList2;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Bk(liveInfo.m75942xfb822ef2(0));
        if (intent2 == null) {
            intent2 = new android.content.Intent();
        }
        intent2.putExtra("KEY_PARAMS_SOURCE_TYPE", liveInfo.m75939xb282bd08(12));
        i0Var.Ej(context, x4Var, contextId, intent2);
    }

    static void ah(c61.ub ubVar, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject, android.os.Bundle bundle, int i17, yz5.l lVar, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shareToConversation");
        }
        android.os.Bundle bundle2 = (i18 & 4) != 0 ? null : bundle;
        if ((i18 & 8) != 0) {
            i17 = 1;
        }
        int i19 = i17;
        yz5.l lVar2 = (i18 & 16) != 0 ? null : lVar;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedObject, "feedObject");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a.B(context, feedObject, bundle2, i19, lVar2);
    }

    static /* synthetic */ void c7(c61.ub ubVar, android.content.Context context, java.lang.String str, int i17, android.content.Intent intent, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Long l17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterChattingUIFromProfile");
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).Zi(context, str, i17, intent, (i18 & 16) != 0 ? null : num, (i18 & 32) != 0 ? null : num2, (i18 & 64) != 0 ? null : num3, (i18 & 128) != 0 ? null : l17);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void e4(c61.ub r20, android.content.Intent r21, android.content.Context r22, long r23, long r25, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, int r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.Integer r35, int r36, byte[] r37, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 r38, boolean r39, java.lang.String r40, long r41, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 r43, int r44, java.lang.Object r45) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.ub.e4(c61.ub, android.content.Intent, android.content.Context, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int, byte[], com.tencent.mm.protocal.protobuf.FinderObject, boolean, java.lang.String, long, com.tencent.mm.protocal.protobuf.FinderObject, int, java.lang.Object):void");
    }

    static /* synthetic */ void o6(c61.ub ubVar, android.content.Context context, android.content.Intent intent, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterFinderLiveNoticeQrCodeUI");
        }
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).Hj(context, intent, i17);
    }

    static /* synthetic */ void w2(c61.ub ubVar, android.content.Context context, android.content.Intent intent, r45.f96 f96Var, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterPoiFeedMapUI");
        }
        if ((i18 & 8) != 0) {
            i17 = 11;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).Tk(context, intent, f96Var, i17);
    }
}
