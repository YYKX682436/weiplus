package c61;

/* loaded from: classes10.dex */
public interface yb extends i95.m {
    static void Gh(c61.yb ybVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, long j17, java.lang.String str, int i17, int i18, java.lang.String feedUsername, boolean z17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var, long j18, java.lang.String str2, boolean z18, boolean z19, java.lang.String str3, r45.qt2 qt2Var, boolean z27, int i19, java.lang.String str4, yz5.l lVar, int i27, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cgiGetFinderFeedComment");
        }
        boolean z28 = (i27 & 64) != 0 ? false : z17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = (i27 & 128) != 0 ? null : gVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var2 = (i27 & 256) != 0 ? null : yj0Var;
        long j19 = (i27 & 512) != 0 ? 0L : j18;
        java.lang.String username = (i27 & 1024) != 0 ? "" : str2;
        boolean z29 = (i27 & 2048) != 0 ? true : z18;
        boolean z37 = (i27 & 4096) != 0 ? false : z19;
        java.lang.String encryptedObjectId = (i27 & 8192) != 0 ? "" : str3;
        boolean z38 = (32768 & i27) != 0 ? true : z27;
        int i28 = (65536 & i27) != 0 ? 6 : i19;
        java.lang.String str5 = (i27 & 131072) != 0 ? null : str4;
        ((c61.p2) ybVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedUsername, "feedUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(encryptedObjectId, "encryptedObjectId");
        new db2.g4(j17, str, i17, i18, feedUsername, z28, gVar2, yj0Var2, j19, username, z29, z37, encryptedObjectId, qt2Var, i28, null, z38, null, null, "", null, null, 0, 0, null, null, false, str5, null, 402030592, null).l().h(new c61.c2(lVar)).f(context);
    }

    static void H7(c61.yb ybVar, android.content.Context context, android.content.Intent intent, long j17, java.lang.String str, int i17, int i18, boolean z17, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initIntentParams");
        }
        long j18 = (i19 & 4) != 0 ? 0L : j17;
        java.lang.String str2 = (i19 & 8) != 0 ? null : str;
        int i27 = (i19 & 16) != 0 ? 0 : i17;
        int i28 = (i19 & 32) != 0 ? 0 : i18;
        boolean z18 = (i19 & 64) != 0 ? false : z17;
        ((c61.p2) ybVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, context, intent, j18, str2, i27, i28, z18, 0, null, 384, null);
    }

    static void R8(c61.yb ybVar, r45.qt2 contextObj, java.lang.String finderUser, int i17, long j17, boolean z17, java.lang.String str, r45.o72 o72Var, java.lang.Integer num, java.lang.Integer num2, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, java.lang.String str2, java.lang.String str3, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: followAsync");
        }
        long j18 = (i18 & 8) != 0 ? 0L : j17;
        boolean z18 = (i18 & 16) != 0 ? false : z17;
        java.lang.String participantFinderUsername = (i18 & 32) != 0 ? "" : str;
        r45.o72 o72Var2 = (i18 & 64) != 0 ? null : o72Var;
        java.lang.Integer num3 = (i18 & 128) != 0 ? 0 : num;
        java.lang.Integer num4 = (i18 & 256) != 0 ? -1 : num2;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = (i18 & 512) != 0 ? null : gVar;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = (i18 & 1024) != 0 ? null : gVar2;
        java.lang.String nonceId = (i18 & 2048) != 0 ? "" : str2;
        java.lang.String micId = (i18 & 4096) != 0 ? "" : str3;
        ((c61.p2) ybVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUser, "finderUser");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(participantFinderUsername, "participantFinderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micId, "micId");
        so2.z1.d(so2.z1.f492263a, contextObj, finderUser, i17, j18, null, z18, participantFinderUsername, o72Var2, num3, num4 != null ? num4.intValue() : -1, gVar3, gVar4, 0, null, nonceId, micId, 12288, null);
    }

    static /* synthetic */ az2.j W3(c61.yb ybVar, long j17, java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var, long j18, java.lang.String str3, boolean z18, boolean z19, java.lang.String str4, r45.qt2 qt2Var, int i19, java.lang.String str5, int i27, java.lang.Object obj) {
        if (obj == null) {
            return ((c61.p2) ybVar).Ai(j17, str, i17, i18, str2, (i27 & 32) != 0 ? false : z17, (i27 & 64) != 0 ? null : gVar, (i27 & 128) != 0 ? null : yj0Var, (i27 & 256) != 0 ? 0L : j18, (i27 & 512) != 0 ? "" : str3, (i27 & 1024) != 0 ? true : z18, (i27 & 2048) != 0 ? false : z19, (i27 & 4096) != 0 ? "" : str4, qt2Var, (i27 & 16384) != 0 ? 6 : i19, (i27 & 32768) != 0 ? "" : str5);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cgiGetFinderFeedComment");
    }

    static /* synthetic */ void Yi(c61.yb ybVar, android.content.Context context, r45.ac4 ac4Var, l81.b1 b1Var, in5.s0 s0Var, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchJumpV1");
        }
        if ((i17 & 8) != 0) {
            s0Var = null;
        }
        ((c61.p2) ybVar).Bi(context, ac4Var, b1Var, s0Var);
    }

    static java.lang.String db(c61.yb ybVar, java.lang.String str, java.lang.String str2, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWxDisplayName");
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        ((c61.p2) ybVar).getClass();
        return g92.b.f351302e.K5(str, str2, z17);
    }

    static void ea(c61.yb ybVar, r45.qt2 contextObj, java.lang.String finderUser, int i17, long j17, boolean z17, java.lang.String str, r45.o72 o72Var, java.lang.Integer num, int i18, java.lang.Integer num2, yz5.l lVar, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: followWithCallback");
        }
        long j18 = (i19 & 8) != 0 ? 0L : j17;
        boolean z18 = (i19 & 16) != 0 ? false : z17;
        java.lang.String participantFinderUsername = (i19 & 32) != 0 ? "" : str;
        r45.o72 o72Var2 = (i19 & 64) != 0 ? null : o72Var;
        java.lang.Integer num3 = (i19 & 128) != 0 ? 0 : num;
        int i27 = (i19 & 256) != 0 ? -1 : i18;
        java.lang.Integer num4 = (i19 & 512) != 0 ? -1 : num2;
        yz5.l lVar2 = (i19 & 1024) == 0 ? lVar : null;
        ((c61.p2) ybVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUser, "finderUser");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(participantFinderUsername, "participantFinderUsername");
        int intValue = num4 != null ? num4.intValue() : -1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("follow event commentScene:");
        sb6.append(contextObj.m75939xb282bd08(7));
        sb6.append(" user:");
        sb6.append(finderUser);
        sb6.append(" opType: ");
        sb6.append(i17);
        sb6.append(" form ");
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFollowLogic", sb6.toString());
        jx3.f.INSTANCE.mo68477x336bdfd8(1278L, i17 == 2 ? 5L : 4L, 1L, false);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).xj(contextObj, contextObj.m75942xfb822ef2(6), contextObj.m75945x2fec8307(21), finderUser, i17 == 2 ? 1 : 2);
        new db2.m0(new nv2.a0(finderUser, i17, j18, null, contextObj, z18, intValue, participantFinderUsername, o72Var2, num3, null, null, i27, 0L, 0, null, null, null, 257024, null), false).l().K(new so2.y1(lVar2));
    }

    static android.text.SpannableString ei(c61.yb ybVar, java.lang.String prefix, java.lang.String result, java.util.ArrayList parseInfoList, java.lang.Boolean bool, c61.vb vbVar, yz5.l onKeywordClick, int i17, java.lang.Object obj) {
        int i18;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleCommentSearchParsedInfo");
        }
        java.lang.Integer num = null;
        java.lang.Boolean bool2 = (i17 & 8) != 0 ? null : bool;
        int i19 = 16;
        c61.vb iconModel = (i17 & 16) != 0 ? new c61.vb(12.0f, c61.wb.f120926e, 48, null) : vbVar;
        ((c61.p2) ybVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parseInfoList, "parseInfoList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconModel, "iconModel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onKeywordClick, "onKeywordClick");
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String concat = prefix.concat(result);
        ((ke0.e) xVar).getClass();
        android.text.SpannableString valueOf = android.text.SpannableString.valueOf(new android.text.SpannableStringBuilder(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.n(context, concat, 0.0f)));
        int i27 = (bool2 != null && bool2.booleanValue()) ? com.p314xaae8f345.mm.R.C30859x5a72f63.akq : com.p314xaae8f345.mm.R.C30859x5a72f63.f560654qk;
        int i28 = bool2 == null ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29 : bool2.booleanValue() ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77639x41633080 : com.p314xaae8f345.mm.R.C30859x5a72f63.f77908xe61cad8f;
        int m9702x7444d5ad = b3.l.m9702x7444d5ad(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i27);
        int m9702x7444d5ad2 = b3.l.m9702x7444d5ad(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i28);
        java.util.Iterator it = parseInfoList.iterator();
        while (it.hasNext()) {
            r45.jb4 jb4Var = (r45.jb4) it.next();
            r45.my0 my0Var = (r45.my0) jb4Var.m75936x14adae67(2);
            if (my0Var != null && my0Var.m75945x2fec8307(1) != null) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) my0Var.m75936x14adae67(2);
                java.lang.Integer valueOf2 = c19786x6a1e2862 != null ? java.lang.Integer.valueOf(c19786x6a1e2862.m76480xe2ee1ca3()) : num;
                int i29 = (valueOf2 != null && valueOf2.intValue() == 121) ? com.p314xaae8f345.mm.R.raw.f79466x69c7a2ec : (valueOf2 != null && valueOf2.intValue() == 40) ? com.p314xaae8f345.mm.R.raw.f79899x267f2c0 : 0;
                int m75939xb282bd08 = jb4Var.m75939xb282bd08(0) + prefix.length();
                if (i29 > 0) {
                    java.lang.Integer num2 = iconModel.f120897d;
                    int intValue = num2 != null ? num2.intValue() : m9702x7444d5ad;
                    android.graphics.drawable.Drawable drawable = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(i29);
                    com.p314xaae8f345.mm.ui.uk.f(drawable, intValue);
                    int a17 = (int) (ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, iconModel.f120894a) * i65.a.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
                    drawable.setBounds(0, 0, a17, a17);
                    java.lang.Object sqVar = iconModel.f120896c == i19 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.sq(drawable) : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.a(drawable);
                    if (iconModel.f120895b == c61.wb.f120925d) {
                        i18 = 1;
                        valueOf.setSpan(sqVar, 0, 1, 18);
                    } else {
                        i18 = 1;
                        valueOf.setSpan(sqVar, jb4Var.m75939xb282bd08(1) + m75939xb282bd08, jb4Var.m75939xb282bd08(1) + m75939xb282bd08 + 1, 18);
                    }
                } else {
                    i18 = 1;
                }
                java.lang.String m75945x2fec8307 = my0Var.m75945x2fec8307(i18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75945x2fec8307);
                valueOf.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yl(m75945x2fec8307, m9702x7444d5ad, m9702x7444d5ad2, false, true, new c61.h2(onKeywordClick, jb4Var)), m75939xb282bd08, m75939xb282bd08 + jb4Var.m75939xb282bd08(1) + 1, 17);
                num = null;
                i19 = 16;
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
        return valueOf;
    }

    static void l3(c61.yb ybVar, android.content.Context context, java.lang.String finderUserName, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2, android.content.DialogInterface.OnDismissListener onDismissListener, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showUserInfoConfirmDialog");
        }
        if ((i17 & 16) != 0) {
            onDismissListener = null;
        }
        android.content.DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
        if ((i17 & 32) != 0) {
            z17 = false;
        }
        ((c61.p2) ybVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15230x4b89f918.INSTANCE.m61675x2d973e92(context, finderUserName, onClickListener, onClickListener2, onDismissListener2, z17);
    }

    static /* synthetic */ java.lang.String md(c61.yb ybVar, java.lang.String str, java.lang.String str2, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDisplayName");
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        return ((c61.p2) ybVar).Ri(str, str2, z17);
    }

    static /* synthetic */ az2.j nc(c61.yb ybVar, long j17, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cgiGetFeedCommentDetailWithFeedId");
        }
        if ((i17 & 2) != 0) {
            str = null;
        }
        return ((c61.p2) ybVar).wi(j17, str);
    }

    static void nd(c61.yb ybVar, android.content.Context context, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 info, l81.b1 b1Var, int i17, in5.s0 s0Var, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchJump");
        }
        if ((i18 & 8) != 0) {
            i17 = 0;
        }
        if ((i18 & 16) != 0) {
            s0Var = null;
        }
        ((c61.p2) ybVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        xc2.y2 y2Var = xc2.y2.f534876a;
        xc2.p0 p0Var = new xc2.p0(info);
        p0Var.f534784m = b1Var;
        if ((b1Var != null ? b1Var.S : null) == k91.y3.POPUP) {
            p0Var.f534785n = 1;
        }
        y2Var.h(context, p0Var, i17, s0Var);
    }

    static /* synthetic */ java.lang.CharSequence nf(c61.yb ybVar, android.content.Context context, android.text.TextPaint textPaint, java.lang.CharSequence charSequence, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNickName");
        }
        if ((i18 & 8) != 0) {
            i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.p2();
        }
        return ((c61.p2) ybVar).cj(context, textPaint, charSequence, i17);
    }

    static void t2(c61.yb ybVar, int i17, yz5.l callback, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cgiGetFinderPrepareUser");
        }
        if ((i18 & 2) != 0) {
            callback = c61.xb.f120946d;
        }
        ((c61.p2) ybVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        g92.b.f351302e.M0(i17).l();
    }
}
