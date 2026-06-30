package c61;

/* loaded from: classes3.dex */
public interface ub extends i95.m {
    static void A3(c61.ub ubVar, android.app.Activity activity, android.content.Intent intent, com.tencent.mm.protocal.protobuf.FinderContact contact, int i17, boolean z17, java.lang.Boolean bool, r45.h32 h32Var, boolean z18, r45.j01 j01Var, com.tencent.mm.ui.zc zcVar, int i18, java.lang.Object obj) {
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
        com.tencent.mm.ui.zc zcVar2 = (i18 & 512) != 0 ? null : zcVar;
        ((com.tencent.mm.plugin.finder.assist.i0) ubVar).getClass();
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(contact, "contact");
        if (j01Var == null && h32Var2 == null) {
            com.tencent.mars.xlog.Log.e("Finder.ActivityRouter", "no createLivePrepareResponse but not edit mode");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#enterFinderLiveNoticeUI notice_attach_available_items.attach_type=");
        if (j01Var == null || (linkedList = j01Var.I1) == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Integer.valueOf(((r45.d32) it.next()).f372032d));
            }
        }
        sb6.append(arrayList);
        sb6.append(", isHalfScreen=");
        sb6.append(bool2);
        sb6.append(", requestCode=");
        sb6.append(i17);
        sb6.append(", iResult=");
        sb6.append(zcVar2);
        com.tencent.mars.xlog.Log.i("Finder.ActivityRouter", sb6.toString());
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        intent2.putExtra("KEY_FINDER_LIVE_NOTICE_CONTACT", contact.toByteArray());
        if (j01Var != null) {
            intent2.putExtra("KEY_FINDER_LIVE_CREATE_LIVE_PREPARE", j01Var.toByteArray());
        }
        if (h32Var2 != null) {
            intent2.putExtra("KEY_COME_HERE_TO_EDIT_NOTICE_OBJECT", h32Var2.toByteArray());
        }
        intent2.putExtra("KEY_FINDER_LIVE_NOTICE_IS_CAN_CREATE", z19);
        intent2.putExtra("KEY_FINDER_LIVE_NOTICE_CREATE_ONLY_PUBLIC_MODE", z27);
        int i19 = activity.getResources().getConfiguration().orientation;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (i19 == 2) {
            jz2.x0 x0Var = jz2.x0.f302754a;
            intent2.setClass(activity, (java.lang.Class) ((jz5.n) jz2.x0.I).getValue());
            com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = activity instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) activity : null;
            if (zcVar2 != null && mMFragmentActivity != null) {
                ((com.tencent.mm.ui.bd) mMFragmentActivity.startActivityForResult(intent2)).f197877a = zcVar2;
                f0Var = f0Var2;
            }
            if (f0Var == null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(i17));
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.k(activity, arrayList2.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLiveNoticeUI", "(Landroid/app/Activity;Landroid/content/Intent;Lcom/tencent/mm/protocal/protobuf/FinderContact;IZLjava/lang/Boolean;Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeInfo;ZLcom/tencent/mm/protocal/protobuf/FinderCreateLivePrepareResponse;Lcom/tencent/mm/ui/MMFragmentActivity$IResult;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            }
            activity.overridePendingTransition(com.tencent.mm.R.anim.f477876e0, com.tencent.mm.R.anim.f477728p);
            return;
        }
        if (kotlin.jvm.internal.o.b(bool2, java.lang.Boolean.TRUE)) {
            bh5.c cVar = new bh5.c();
            cVar.f20922a.f20924a = activity;
            cVar.d(intent2);
            cVar.b(com.tencent.mm.plugin.finder.ui.fragment.FinderHalfScreenDialogFragment.class);
            cVar.a("com.tencent.mm.plugin.finder.feed.ui.FinderLiveNoticeUI");
            if (zcVar2 != null) {
                cVar.i(zcVar2);
                return;
            } else {
                cVar.h(i17);
                return;
            }
        }
        jz2.x0 x0Var2 = jz2.x0.f302754a;
        intent2.setClass(activity, (java.lang.Class) ((jz5.n) jz2.x0.I).getValue());
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity2 = activity instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) activity : null;
        if (zcVar2 != null && mMFragmentActivity2 != null) {
            ((com.tencent.mm.ui.bd) mMFragmentActivity2.startActivityForResult(intent2)).f197877a = zcVar2;
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(java.lang.Integer.valueOf(i17));
            arrayList3.add(intent2);
            java.util.Collections.reverse(arrayList3);
            yj0.a.k(activity, arrayList3.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLiveNoticeUI", "(Landroid/app/Activity;Landroid/content/Intent;Lcom/tencent/mm/protocal/protobuf/FinderContact;IZLjava/lang/Boolean;Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeInfo;ZLcom/tencent/mm/protocal/protobuf/FinderCreateLivePrepareResponse;Lcom/tencent/mm/ui/MMFragmentActivity$IResult;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
        activity.overridePendingTransition(com.tencent.mm.R.anim.f477876e0, com.tencent.mm.R.anim.f477728p);
    }

    static int F7(c61.ub ubVar, android.content.Context context, dk2.x4 config, java.lang.String str, java.lang.String str2, android.content.Intent intent, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterFinderLiveVisitorUI");
        }
        java.lang.String contextId = (i17 & 4) != 0 ? "" : str;
        java.lang.String clickTabContextId = (i17 & 8) != 0 ? "" : str2;
        android.content.Intent intent2 = (i17 & 16) != 0 ? null : intent;
        boolean z18 = (i17 & 32) != 0 ? false : z17;
        ((com.tencent.mm.plugin.finder.assist.i0) ubVar).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(contextId, "contextId");
        kotlin.jvm.internal.o.g(clickTabContextId, "clickTabContextId");
        com.tencent.mars.xlog.Log.i("Finder.ActivityRouter", "[enterFinderLiveVisitorUI] " + config + ",contextId:" + contextId + ",clickTabContextId:" + clickTabContextId);
        boolean z19 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3833o4).getValue()).r()).intValue() == 1;
        com.tencent.mm.plugin.finder.report.q5 q5Var = new com.tencent.mm.plugin.finder.report.q5();
        q5Var.f125268a = java.lang.System.currentTimeMillis();
        q5Var.f125273f = z19;
        com.tencent.mm.plugin.finder.report.r5.f125336b = q5Var;
        com.tencent.mm.plugin.finder.report.q1.f125258d = null;
        com.tencent.mm.plugin.finder.report.q1.f125256b = 0L;
        com.tencent.mm.plugin.finder.report.q1.f125257c = 0L;
        com.tencent.mm.plugin.finder.report.q1.f125259e = false;
        com.tencent.mm.plugin.finder.report.q1.f125261g = true;
        com.tencent.mm.plugin.finder.report.p1 p1Var = new com.tencent.mm.plugin.finder.report.p1();
        p1Var.f125230a = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.finder.report.q1.f125258d = p1Var;
        com.tencent.mm.plugin.finder.report.q1.f125256b = 1L;
        com.tencent.mm.plugin.finder.report.q1.f125257c = 1L;
        p1Var.f125231b = 0L;
        p1Var.f125232c = 0L;
        p1Var.f125233d = 0L;
        p1Var.f125234e = 0L;
        p1Var.f125235f = 0L;
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        com.tencent.mm.live.api.LiveConfig d17 = config.d();
        ((com.tencent.mm.feature.finder.live.v4) w0Var).Bk(d17 != null ? d17.f68537e : 0L);
        if ((config.f234321o & 4) > 0) {
            return 0;
        }
        return ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).fj(context, config, contextId, clickTabContextId, intent2, z18, new com.tencent.mm.plugin.finder.assist.z(config, z19));
    }

    static void I2(c61.ub ubVar, androidx.appcompat.app.AppCompatActivity context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, android.os.Bundle bundle, int i17, int i18, int i19, java.lang.Object obj) {
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
        ((com.tencent.mm.plugin.finder.assist.i0) ubVar).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        com.tencent.mm.plugin.finder.assist.n7.f102406a.E(context, feed, bundle2, i27, i18);
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
        ((com.tencent.mm.plugin.finder.assist.i0) ubVar).xk(context, intent, i17, z17);
    }

    static /* synthetic */ void M8(c61.ub ubVar, android.content.Context context, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, java.util.Map map, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, yz5.l lVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openAddTagLiteApp");
        }
        ((com.tencent.mm.plugin.finder.assist.i0) ubVar).tl(context, finderJumpInfo, (i17 & 4) != 0 ? null : map, (i17 & 8) != 0 ? null : baseFinderFeed, (i17 & 16) != 0 ? null : lVar);
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
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) ubVar;
        i0Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        kotlin.jvm.internal.o.g(liveInfo, "liveInfo");
        kotlin.jvm.internal.o.g(contextId, "contextId");
        en0.g gVar = new en0.g();
        gVar.f255246a = 0;
        gVar.f255248c = liveInfo.getLong(0);
        gVar.f255256k = j17;
        gVar.f255262q = nonceId;
        gVar.f255251f = xy2.c.e(context);
        gVar.f255263r = "";
        gVar.f255266u = 0L;
        gVar.f255267v = 0L;
        gVar.f255264s = "";
        gVar.f255265t = "";
        gVar.f255257l = str4;
        gVar.f255268w = str5;
        com.tencent.mm.live.api.LiveConfig a17 = gVar.a();
        com.tencent.mars.xlog.Log.i("Finder.ActivityRouter", "enterFinderLiveAnchorUI " + a17.b());
        dk2.x4 x4Var = new dk2.x4();
        x4Var.f234318l.add(a17);
        x4Var.f234307a = h32Var2;
        x4Var.f234319m = liveInfo.getInteger(21);
        x4Var.f234311e = linkedList2;
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Bk(liveInfo.getLong(0));
        if (intent2 == null) {
            intent2 = new android.content.Intent();
        }
        intent2.putExtra("KEY_PARAMS_SOURCE_TYPE", liveInfo.getInteger(12));
        i0Var.Ej(context, x4Var, contextId, intent2);
    }

    static void ah(c61.ub ubVar, androidx.appcompat.app.AppCompatActivity context, com.tencent.mm.plugin.finder.storage.FinderItem feedObject, android.os.Bundle bundle, int i17, yz5.l lVar, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shareToConversation");
        }
        android.os.Bundle bundle2 = (i18 & 4) != 0 ? null : bundle;
        if ((i18 & 8) != 0) {
            i17 = 1;
        }
        int i19 = i17;
        yz5.l lVar2 = (i18 & 16) != 0 ? null : lVar;
        ((com.tencent.mm.plugin.finder.assist.i0) ubVar).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feedObject, "feedObject");
        com.tencent.mm.plugin.finder.assist.n7.f102406a.B(context, feedObject, bundle2, i19, lVar2);
    }

    static /* synthetic */ void c7(c61.ub ubVar, android.content.Context context, java.lang.String str, int i17, android.content.Intent intent, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Long l17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterChattingUIFromProfile");
        }
        ((com.tencent.mm.plugin.finder.assist.i0) ubVar).Zi(context, str, i17, intent, (i18 & 16) != 0 ? null : num, (i18 & 32) != 0 ? null : num2, (i18 & 64) != 0 ? null : num3, (i18 & 128) != 0 ? null : l17);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void e4(c61.ub r20, android.content.Intent r21, android.content.Context r22, long r23, long r25, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, int r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.Integer r35, int r36, byte[] r37, com.tencent.mm.protocal.protobuf.FinderObject r38, boolean r39, java.lang.String r40, long r41, com.tencent.mm.protocal.protobuf.FinderObject r43, int r44, java.lang.Object r45) {
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
        ((com.tencent.mm.plugin.finder.assist.i0) ubVar).Hj(context, intent, i17);
    }

    static /* synthetic */ void w2(c61.ub ubVar, android.content.Context context, android.content.Intent intent, r45.f96 f96Var, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterPoiFeedMapUI");
        }
        if ((i18 & 8) != 0) {
            i17 = 11;
        }
        ((com.tencent.mm.plugin.finder.assist.i0) ubVar).Tk(context, intent, f96Var, i17);
    }
}
