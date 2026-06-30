package c61;

/* loaded from: classes10.dex */
public interface yb extends i95.m {
    static void Gh(c61.yb ybVar, com.tencent.mm.ui.MMActivity context, long j17, java.lang.String str, int i17, int i18, java.lang.String feedUsername, boolean z17, com.tencent.mm.protobuf.g gVar, com.tencent.mm.plugin.finder.storage.yj0 yj0Var, long j18, java.lang.String str2, boolean z18, boolean z19, java.lang.String str3, r45.qt2 qt2Var, boolean z27, int i19, java.lang.String str4, yz5.l lVar, int i27, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cgiGetFinderFeedComment");
        }
        boolean z28 = (i27 & 64) != 0 ? false : z17;
        com.tencent.mm.protobuf.g gVar2 = (i27 & 128) != 0 ? null : gVar;
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var2 = (i27 & 256) != 0 ? null : yj0Var;
        long j19 = (i27 & 512) != 0 ? 0L : j18;
        java.lang.String username = (i27 & 1024) != 0 ? "" : str2;
        boolean z29 = (i27 & 2048) != 0 ? true : z18;
        boolean z37 = (i27 & 4096) != 0 ? false : z19;
        java.lang.String encryptedObjectId = (i27 & 8192) != 0 ? "" : str3;
        boolean z38 = (32768 & i27) != 0 ? true : z27;
        int i28 = (65536 & i27) != 0 ? 6 : i19;
        java.lang.String str5 = (i27 & 131072) != 0 ? null : str4;
        ((c61.p2) ybVar).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feedUsername, "feedUsername");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(encryptedObjectId, "encryptedObjectId");
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
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, context, intent, j18, str2, i27, i28, z18, 0, null, 384, null);
    }

    static void R8(c61.yb ybVar, r45.qt2 contextObj, java.lang.String finderUser, int i17, long j17, boolean z17, java.lang.String str, r45.o72 o72Var, java.lang.Integer num, java.lang.Integer num2, com.tencent.mm.protobuf.g gVar, com.tencent.mm.protobuf.g gVar2, java.lang.String str2, java.lang.String str3, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: followAsync");
        }
        long j18 = (i18 & 8) != 0 ? 0L : j17;
        boolean z18 = (i18 & 16) != 0 ? false : z17;
        java.lang.String participantFinderUsername = (i18 & 32) != 0 ? "" : str;
        r45.o72 o72Var2 = (i18 & 64) != 0 ? null : o72Var;
        java.lang.Integer num3 = (i18 & 128) != 0 ? 0 : num;
        java.lang.Integer num4 = (i18 & 256) != 0 ? -1 : num2;
        com.tencent.mm.protobuf.g gVar3 = (i18 & 512) != 0 ? null : gVar;
        com.tencent.mm.protobuf.g gVar4 = (i18 & 1024) != 0 ? null : gVar2;
        java.lang.String nonceId = (i18 & 2048) != 0 ? "" : str2;
        java.lang.String micId = (i18 & 4096) != 0 ? "" : str3;
        ((c61.p2) ybVar).getClass();
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kotlin.jvm.internal.o.g(finderUser, "finderUser");
        kotlin.jvm.internal.o.g(participantFinderUsername, "participantFinderUsername");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        kotlin.jvm.internal.o.g(micId, "micId");
        so2.z1.d(so2.z1.f410730a, contextObj, finderUser, i17, j18, null, z18, participantFinderUsername, o72Var2, num3, num4 != null ? num4.intValue() : -1, gVar3, gVar4, 0, null, nonceId, micId, 12288, null);
    }

    static /* synthetic */ az2.j W3(c61.yb ybVar, long j17, java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17, com.tencent.mm.protobuf.g gVar, com.tencent.mm.plugin.finder.storage.yj0 yj0Var, long j18, java.lang.String str3, boolean z18, boolean z19, java.lang.String str4, r45.qt2 qt2Var, int i19, java.lang.String str5, int i27, java.lang.Object obj) {
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
        return g92.b.f269769e.K5(str, str2, z17);
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
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kotlin.jvm.internal.o.g(finderUser, "finderUser");
        kotlin.jvm.internal.o.g(participantFinderUsername, "participantFinderUsername");
        int intValue = num4 != null ? num4.intValue() : -1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("follow event commentScene:");
        sb6.append(contextObj.getInteger(7));
        sb6.append(" user:");
        sb6.append(finderUser);
        sb6.append(" opType: ");
        sb6.append(i17);
        sb6.append(" form ");
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("Finder.FinderFollowLogic", sb6.toString());
        jx3.f.INSTANCE.idkeyStat(1278L, i17 == 2 ? 5L : 4L, 1L, false);
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).xj(contextObj, contextObj.getLong(6), contextObj.getString(21), finderUser, i17 == 2 ? 1 : 2);
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
        c61.vb iconModel = (i17 & 16) != 0 ? new c61.vb(12.0f, c61.wb.f39393e, 48, null) : vbVar;
        ((c61.p2) ybVar).getClass();
        kotlin.jvm.internal.o.g(prefix, "prefix");
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(parseInfoList, "parseInfoList");
        kotlin.jvm.internal.o.g(iconModel, "iconModel");
        kotlin.jvm.internal.o.g(onKeywordClick, "onKeywordClick");
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String concat = prefix.concat(result);
        ((ke0.e) xVar).getClass();
        android.text.SpannableString valueOf = android.text.SpannableString.valueOf(new android.text.SpannableStringBuilder(com.tencent.mm.pluginsdk.ui.span.c0.n(context, concat, 0.0f)));
        int i27 = (bool2 != null && bool2.booleanValue()) ? com.tencent.mm.R.color.akq : com.tencent.mm.R.color.f479121qk;
        int i28 = bool2 == null ? com.tencent.mm.R.color.BW_0_Alpha_0_2 : bool2.booleanValue() ? com.tencent.mm.R.color.BW_0_Alpha_0_2_Night_Mode : com.tencent.mm.R.color.UN_BW_0_Alpha_0_2;
        int color = b3.l.getColor(com.tencent.mm.sdk.platformtools.x2.f193071a, i27);
        int color2 = b3.l.getColor(com.tencent.mm.sdk.platformtools.x2.f193071a, i28);
        java.util.Iterator it = parseInfoList.iterator();
        while (it.hasNext()) {
            r45.jb4 jb4Var = (r45.jb4) it.next();
            r45.my0 my0Var = (r45.my0) jb4Var.getCustom(2);
            if (my0Var != null && my0Var.getString(1) != null) {
                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) my0Var.getCustom(2);
                java.lang.Integer valueOf2 = finderJumpInfo != null ? java.lang.Integer.valueOf(finderJumpInfo.getBusiness_type()) : num;
                int i29 = (valueOf2 != null && valueOf2.intValue() == 121) ? com.tencent.mm.R.raw.gift_effect_on_left_medium : (valueOf2 != null && valueOf2.intValue() == 40) ? com.tencent.mm.R.raw.icons_filled_search : 0;
                int integer = jb4Var.getInteger(0) + prefix.length();
                if (i29 > 0) {
                    java.lang.Integer num2 = iconModel.f39364d;
                    int intValue = num2 != null ? num2.intValue() : color;
                    android.graphics.drawable.Drawable drawable = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(i29);
                    com.tencent.mm.ui.uk.f(drawable, intValue);
                    int a17 = (int) (ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, iconModel.f39361a) * i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a));
                    drawable.setBounds(0, 0, a17, a17);
                    java.lang.Object sqVar = iconModel.f39363c == i19 ? new com.tencent.mm.plugin.finder.feed.ui.sq(drawable) : new com.tencent.mm.plugin.finder.view.a(drawable);
                    if (iconModel.f39362b == c61.wb.f39392d) {
                        i18 = 1;
                        valueOf.setSpan(sqVar, 0, 1, 18);
                    } else {
                        i18 = 1;
                        valueOf.setSpan(sqVar, jb4Var.getInteger(1) + integer, jb4Var.getInteger(1) + integer + 1, 18);
                    }
                } else {
                    i18 = 1;
                }
                java.lang.String string = my0Var.getString(i18);
                kotlin.jvm.internal.o.d(string);
                valueOf.setSpan(new com.tencent.mm.plugin.finder.view.yl(string, color, color2, false, true, new c61.h2(onKeywordClick, jb4Var)), integer, integer + jb4Var.getInteger(1) + 1, 17);
                num = null;
                i19 = 16;
            }
        }
        kotlin.jvm.internal.o.d(valueOf);
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
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.INSTANCE.showUserInfoConfirmDialog(context, finderUserName, onClickListener, onClickListener2, onDismissListener2, z17);
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

    static void nd(c61.yb ybVar, android.content.Context context, com.tencent.mm.protocal.protobuf.FinderJumpInfo info, l81.b1 b1Var, int i17, in5.s0 s0Var, int i18, java.lang.Object obj) {
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
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(info, "info");
        xc2.y2 y2Var = xc2.y2.f453343a;
        xc2.p0 p0Var = new xc2.p0(info);
        p0Var.f453251m = b1Var;
        if ((b1Var != null ? b1Var.S : null) == k91.y3.POPUP) {
            p0Var.f453252n = 1;
        }
        y2Var.h(context, p0Var, i17, s0Var);
    }

    static /* synthetic */ java.lang.CharSequence nf(c61.yb ybVar, android.content.Context context, android.text.TextPaint textPaint, java.lang.CharSequence charSequence, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNickName");
        }
        if ((i18 & 8) != 0) {
            i17 = com.tencent.mm.plugin.finder.storage.t70.f127590a.p2();
        }
        return ((c61.p2) ybVar).cj(context, textPaint, charSequence, i17);
    }

    static void t2(c61.yb ybVar, int i17, yz5.l callback, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cgiGetFinderPrepareUser");
        }
        if ((i18 & 2) != 0) {
            callback = c61.xb.f39413d;
        }
        ((c61.p2) ybVar).getClass();
        kotlin.jvm.internal.o.g(callback, "callback");
        g92.b.f269769e.M0(i17).l();
    }
}
