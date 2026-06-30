package ca4;

/* loaded from: classes4.dex */
public final class e1 {
    public e1(kotlin.jvm.internal.i iVar) {
    }

    public static int a(ca4.e1 e1Var, int i17, boolean z17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("characterCount2TextCount$default", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if ((i18 & 2) != 0) {
            z17 = true;
        }
        e1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("characterCount2TextCount", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        int ceil = (int) (z17 ? java.lang.Math.ceil(i17 / 2.0d) : java.lang.Math.floor(i17 / 2.0d));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("characterCount2TextCount", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("characterCount2TextCount$default", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return ceil;
    }

    public final boolean b(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkEnableShowGroupByExtFlag", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        boolean z17 = (i17 & 3) == 3 || (i17 & 5) == 5 || (i17 & 1025) == 1025 || (i17 & 513) == 513 || (i17 & 4097) == 4097;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkEnableShowGroupByExtFlag", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return z17;
    }

    public final boolean c(com.tencent.mm.protocal.protobuf.SnsObject snsObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkHaveBlackContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (snsObject == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkHaveBlackContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return false;
        }
        int i17 = snsObject.VisibilityType;
        if (i17 != 0) {
            boolean z17 = i17 == 4;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkHaveBlackContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return z17;
        }
        if ((snsObject.ExtFlag & 2) > 0 && !com.tencent.mm.sdk.platformtools.t8.L0(snsObject.BlackList)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkHaveBlackContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return true;
        }
        if ((snsObject.ExtFlag & 1024) <= 0 || com.tencent.mm.sdk.platformtools.t8.L0(snsObject.BlackContactTagIdList)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkHaveBlackContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkHaveBlackContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return true;
    }

    public final boolean d(com.tencent.mm.protocal.protobuf.SnsObject snsObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkHaveBlackTagList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (snsObject == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkHaveBlackTagList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return false;
        }
        if ((snsObject.ExtFlag & 1024) <= 0 || com.tencent.mm.sdk.platformtools.t8.L0(snsObject.BlackContactTagIdList)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkHaveBlackTagList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkHaveBlackTagList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return true;
    }

    public final boolean e(com.tencent.mm.protocal.protobuf.SnsObject snsObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkHaveGroupContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (snsObject == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkHaveGroupContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return false;
        }
        int i17 = snsObject.VisibilityType;
        if (i17 != 0) {
            boolean z17 = i17 == 3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkHaveGroupContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return z17;
        }
        if ((snsObject.ExtFlag & 4) > 0 && !com.tencent.mm.sdk.platformtools.t8.L0(snsObject.GroupUser)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkHaveGroupContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return true;
        }
        if ((snsObject.ExtFlag & 512) <= 0 || com.tencent.mm.sdk.platformtools.t8.L0(snsObject.GroupContactTagIdList)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkHaveGroupContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkHaveGroupContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return true;
    }

    public final boolean f(com.tencent.mm.protocal.protobuf.SnsObject snsObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkHaveGroupTagList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (snsObject == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkHaveGroupTagList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return false;
        }
        if ((snsObject.ExtFlag & 512) <= 0 || com.tencent.mm.sdk.platformtools.t8.L0(snsObject.GroupContactTagIdList)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkHaveGroupTagList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkHaveGroupTagList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return true;
    }

    public final boolean g(com.tencent.mm.protocal.protobuf.SnsObject snsObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkHaveSetInteractFriendList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        boolean z17 = false;
        if (snsObject == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkHaveSetInteractFriendList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return false;
        }
        int i17 = snsObject.ExtFlag;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkHaveSetInteractFriendList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        boolean z18 = (i17 & 4096) > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkHaveSetInteractFriendList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (z18 && !com.tencent.mm.sdk.platformtools.t8.L0(snsObject.RecentInteractUserList)) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkHaveSetInteractFriendList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return z17;
    }

    public final boolean h(com.tencent.mm.protocal.protobuf.SnsObject snsObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkIsSetComplexVisibility", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        kotlin.jvm.internal.o.g(snsObject, "snsObject");
        boolean z17 = g(snsObject) || (e(snsObject) && c(snsObject));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkIsSetComplexVisibility", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return z17;
    }

    public final void i(java.lang.CharSequence charSequence, boolean z17) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkStyleAndReplaceClickSpanColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLinkSpanColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (z17) {
            xa4.g.t();
            i17 = com.tencent.mm.R.color.af9;
        } else {
            r();
            i17 = com.tencent.mm.R.color.Link_100;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLinkSpanColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        int d17 = i65.a.d(com.tencent.mm.sdk.platformtools.x2.f193071a, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("forceReplaceClickSpanTextColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (charSequence instanceof android.text.Spannable) {
            android.text.Spannable spannable = (android.text.Spannable) charSequence;
            com.tencent.mm.pluginsdk.ui.span.z0[] z0VarArr = (com.tencent.mm.pluginsdk.ui.span.z0[]) spannable.getSpans(0, spannable.length(), com.tencent.mm.pluginsdk.ui.span.z0.class);
            kotlin.jvm.internal.o.d(z0VarArr);
            for (com.tencent.mm.pluginsdk.ui.span.z0 z0Var : z0VarArr) {
                z0Var.setColor(d17, z0Var.getBgColor());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("forceReplaceClickSpanTextColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkStyleAndReplaceClickSpanColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
    }

    public final void j(java.lang.String tag, com.tencent.mm.protocal.protobuf.SnsObject snsObject, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("debugPrintSnsObjectVisibilityInfo", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        kotlin.jvm.internal.o.g(tag, "tag");
        if (snsObject == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("debugPrintSnsObjectVisibilityInfo", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return;
        }
        java.lang.String str = z17 ? ", " : "\n ";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("debugPrintSnsObjectVisibilityInfo:");
        sb6.append(str);
        sb6.append("SnsObject#Id=" + snsObject.Id);
        sb6.append(str);
        sb6.append("ExtFlag=" + snsObject.ExtFlag);
        sb6.append(str);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("showGroupList=");
        sb7.append((snsObject.ExtFlag & 4) > 0);
        sb6.append(sb7.toString());
        sb6.append(str);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("showGroupTagList=");
        sb8.append((snsObject.ExtFlag & 512) > 0);
        sb6.append(sb8.toString());
        sb6.append(str);
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("showBlackList=");
        sb9.append((snsObject.ExtFlag & 2) > 0);
        sb6.append(sb9.toString());
        sb6.append(str);
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder("showBlackTagList=");
        sb10.append((snsObject.ExtFlag & 1024) > 0);
        sb6.append(sb10.toString());
        sb6.append(str);
        sb6.append("GroupUser Size: " + snsObject.GroupUser.size());
        sb6.append(str);
        sb6.append("BlackList Size: " + snsObject.BlackList.size());
        sb6.append(str);
        sb6.append("BlackContactTagIdList:" + snsObject.BlackContactTagIdList);
        sb6.append(str);
        sb6.append("GroupContactTagIdList:" + snsObject.GroupContactTagIdList);
        sb6.append(str);
        sb6.append("IsStar:" + snsObject.InTopList);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("debugPrintSnsObjectVisibilityInfo", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
    }

    public final boolean k(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableShowCommentEntrance", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableShowCommentEntrance", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return false;
        }
        boolean isExtFlag = snsInfo.isExtFlag();
        java.lang.String userName = snsInfo.getUserName();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isUserChatOnlyOrBlackContact", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (com.tencent.mm.sdk.platformtools.t8.K0(userName)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isUserChatOnlyOrBlackContact", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        } else {
            com.tencent.mm.storage.z3 q17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(userName);
            if (q17 != null) {
                z17 = q17.o2() || q17.y2();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isUserChatOnlyOrBlackContact", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                if (!isExtFlag && z17) {
                    isExtFlag = false;
                } else if (!isExtFlag && !z17) {
                    isExtFlag = true;
                }
                boolean D0 = com.tencent.mm.sdk.platformtools.t8.D0(snsInfo.getUserName(), com.tencent.mm.plugin.sns.model.l4.sj());
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsUtilExt", "enableShowCommentEntrance: " + snsInfo.getSnsId() + ", " + snsInfo.isExtFlag() + ", " + z17 + ", " + D0);
                boolean z18 = !isExtFlag || D0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableShowCommentEntrance", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                return z18;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isUserChatOnlyOrBlackContact", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        }
        z17 = false;
        if (!isExtFlag) {
        }
        if (!isExtFlag) {
            isExtFlag = true;
        }
        boolean D02 = com.tencent.mm.sdk.platformtools.t8.D0(snsInfo.getUserName(), com.tencent.mm.plugin.sns.model.l4.sj());
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUtilExt", "enableShowCommentEntrance: " + snsInfo.getSnsId() + ", " + snsInfo.isExtFlag() + ", " + z17 + ", " + D02);
        if (isExtFlag) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableShowCommentEntrance", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return z18;
    }

    public final android.graphics.drawable.Drawable l(android.content.Context context, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        android.graphics.drawable.Drawable i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentButtonIconDrawable", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        kotlin.jvm.internal.o.g(context, "context");
        if (xa4.g.f452830d.y(timeLineObject)) {
            i17 = i65.a.i(context, com.tencent.mm.R.drawable.icon_spring2024_comment);
            kotlin.jvm.internal.o.d(i17);
        } else {
            i17 = pc4.d.f353410a.z() ? i65.a.i(context, com.tencent.mm.R.drawable.d4t) : com.tencent.mm.ui.zk.d(context, com.tencent.mm.R.attr.f478401iu);
            kotlin.jvm.internal.o.d(i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentButtonIconDrawable", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return i17;
    }

    public final int m(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentLikeIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (z17) {
            xa4.g.t();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentLikeIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return com.tencent.mm.R.color.af9;
        }
        r();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentLikeIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return com.tencent.mm.R.color.Link_100;
    }

    public final int n(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDeleteIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (xa4.g.f452830d.y(timeLineObject)) {
            xa4.g.t();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDeleteIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return com.tencent.mm.R.color.af9;
        }
        r();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDeleteIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return com.tencent.mm.R.color.Link_100;
    }

    public final java.lang.CharSequence o(java.lang.String remarkname, java.lang.String username, yz5.p clickCb) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayRemarkSpan", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        kotlin.jvm.internal.o.g(remarkname, "remarkname");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(clickCb, "clickCb");
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((ke0.e) xVar).getClass();
        android.text.SpannableString i17 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, remarkname);
        com.tencent.mm.pluginsdk.ui.span.d1 d1Var = new com.tencent.mm.pluginsdk.ui.span.d1(remarkname, new ca4.a1(clickCb, username));
        d1Var.f191202f = java.lang.Boolean.FALSE;
        i17.setSpan(d1Var, 0, remarkname.length(), 33);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayRemarkSpan", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return i17;
    }

    public final int p(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGroupPermissionIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (xa4.g.f452830d.y(timeLineObject)) {
            xa4.g.t();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGroupPermissionIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return com.tencent.mm.R.color.af9;
        }
        r();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGroupPermissionIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return com.tencent.mm.R.color.Link_100;
    }

    public final android.graphics.drawable.Drawable q(android.content.Context context, boolean z17, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLikeIconDrawable", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        kotlin.jvm.internal.o.g(context, "context");
        int color = context.getResources().getColor(m(z17));
        if (z17) {
            android.graphics.drawable.Drawable s17 = xa4.g.s(color, i17, i18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLikeIconDrawable", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return s17;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLikeIconResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLikeIconResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.friendactivity_likeicon, color);
        e17.setBounds(0, 0, i17, i18);
        e17.clearColorFilter();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLikeIconDrawable", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return e17;
    }

    public final int r() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNormalLinkColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNormalLinkColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return com.tencent.mm.R.color.Link_100;
    }

    public final int s(android.content.Context context) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPLTextWidthOnLargeWindow", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        int i17 = 0;
        if (context instanceof com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC$Companion");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getEnableLargeUI$cp", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
            z17 = com.tencent.mm.plugin.sns.ui.improve.component.u.f169000d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getEnableLargeUI$cp", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC$Companion");
            if (z17) {
                i17 = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aav);
            }
        } else {
            z17 = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUtilExt", "getPLTextViewHeightOnLargeWindow=" + i17 + ", inLargeWindow=" + z17 + ' ');
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPLTextWidthOnLargeWindow", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return i17;
    }

    public final int t(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStarIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (xa4.g.f452830d.y(timeLineObject)) {
            xa4.g.t();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStarIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return com.tencent.mm.R.color.af9;
        }
        r();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStarIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return com.tencent.mm.R.color.Link_100;
    }

    public final java.lang.CharSequence u(android.content.Context context, java.lang.String snsId, boolean z17, java.util.LinkedList withTaList) {
        java.lang.String g17;
        java.lang.String str;
        java.util.Iterator it;
        boolean z18;
        java.lang.String str2;
        java.lang.CharSequence o17;
        java.lang.String str3 = "getWithTaText";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWithTaText", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        kotlin.jvm.internal.o.g(snsId, "snsId");
        kotlin.jvm.internal.o.g(withTaList, "withTaList");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.jge));
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        android.os.Vibrator vibrator = ca4.z0.f40068a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWithTaUsernameList", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.storage.e8 pj6 = com.tencent.mm.plugin.sns.model.l4.pj();
        java.lang.String sj6 = com.tencent.mm.plugin.sns.model.l4.sj();
        java.util.Iterator it6 = withTaList.iterator();
        boolean z19 = false;
        while (it6.hasNext()) {
            java.lang.String str4 = ((r45.e86) it6.next()).f373126d;
            com.tencent.mm.storage.e8 e8Var = pj6;
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) pj6).n(str4, true);
            if (str4.equals(sj6)) {
                pj6 = e8Var;
                z19 = true;
            } else {
                if (valueOf.booleanValue() || (!n17.o2() && n17.r2())) {
                    arrayList.add(str4);
                }
                pj6 = e8Var;
            }
        }
        if (z19) {
            arrayList.add(0, sj6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWithTaUsernameList", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String sj7 = com.tencent.mm.plugin.sns.model.l4.sj();
        java.util.Iterator it7 = arrayList.iterator();
        boolean z27 = false;
        while (it7.hasNext()) {
            java.lang.String str5 = (java.lang.String) it7.next();
            if (z27) {
                spannableStringBuilder.append((java.lang.CharSequence) "、");
                stringBuffer.append("#");
            } else {
                spannableStringBuilder.append((java.lang.CharSequence) "");
                z27 = true;
            }
            ca4.b1 b1Var = new ca4.b1(snsId);
            if (kotlin.jvm.internal.o.b(str5, sj7)) {
                java.lang.String g18 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490472w1);
                kotlin.jvm.internal.o.f(g18, "getString(...)");
                kotlin.jvm.internal.o.d(sj7);
                o17 = o(g18, sj7, b1Var);
                str2 = str3;
                str = sj7;
                it = it7;
                z18 = z27;
            } else {
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                java.lang.String a17 = c01.a2.a(str5);
                kotlin.jvm.internal.o.d(a17);
                str = sj7;
                it = it7;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("withFriends", "com.tencent.mm.plugin.sns.model.withta.UtilsKt");
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                java.lang.String a18 = c01.a2.a(a17);
                qa4.k kVar = qa4.k.f361095a;
                z18 = z27;
                if (!kVar.s().contains(a18)) {
                    kVar.s().add(a18);
                }
                java.util.Collection s17 = kVar.s();
                if (kVar.s().size() > 3) {
                    java.util.ArrayList s18 = kVar.s();
                    str2 = str3;
                    java.util.Collection subList = s18.subList(0, 3);
                    kotlin.jvm.internal.o.f(subList, "subList(...)");
                    s17 = subList;
                } else {
                    str2 = str3;
                }
                java.lang.String g19 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.jhy);
                kotlin.jvm.internal.o.f(g19, "getString(...)");
                java.lang.String format = java.lang.String.format(g19, java.util.Arrays.copyOf(new java.lang.Object[]{kz5.n0.g0(s17, "、", null, null, 0, null, null, 62, null)}, 1));
                kotlin.jvm.internal.o.f(format, "format(...)");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWithFriendsStr", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
                qa4.k.f361097c = format;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWithFriendsStr", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("withFriends", "com.tencent.mm.plugin.sns.model.withta.UtilsKt");
                kotlin.jvm.internal.o.d(str5);
                o17 = o(a17, str5, b1Var);
            }
            spannableStringBuilder.append(o17);
            stringBuffer.append(str5);
            sj7 = str;
            it7 = it;
            str3 = str2;
            z27 = z18;
        }
        java.lang.String str6 = str3;
        if (context instanceof com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI) {
            dx1.g.f244489a.o("MomentsTogetherTailActionFeed", snsId, "CCUserList", stringBuffer);
        }
        if (arrayList.isEmpty()) {
            spannableStringBuilder.clear();
        }
        int size = withTaList.size();
        int size2 = arrayList.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWithTaStr", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (size2 == 1) {
            if (size2 < size) {
                g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.jgh);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWithTaStr", "com.tencent.mm.plugin.sns.data.SnsUtil");
            } else {
                g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.jgg);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWithTaStr", "com.tencent.mm.plugin.sns.data.SnsUtil");
            }
        } else if (size2 <= 1) {
            g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.j9q);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWithTaStr", "com.tencent.mm.plugin.sns.data.SnsUtil");
        } else if (size2 < size) {
            g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.jgf);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWithTaStr", "com.tencent.mm.plugin.sns.data.SnsUtil");
        } else {
            g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.jgg);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWithTaStr", "com.tencent.mm.plugin.sns.data.SnsUtil");
        }
        spannableStringBuilder.append((java.lang.CharSequence) g17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return spannableStringBuilder;
    }

    public final java.util.LinkedList v(java.util.List stringList) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stringListToSKBuiltinStringList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        kotlin.jvm.internal.o.g(stringList, "stringList");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = stringList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            r45.du5 du5Var = new r45.du5();
            du5Var.c(str);
            linkedList.add(du5Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stringListToSKBuiltinStringList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return linkedList;
    }

    public final void h(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, java.lang.CharSequence charSequence) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkStyleAndReplaceClickSpanColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkStyleAndReplaceClickSpanColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return;
        }
        if (snsInfo.isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkStyleAndReplaceClickSpanColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return;
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkStyleAndReplaceClickSpanColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        i(charSequence, xa4.g.f452830d.y(timeLine));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkStyleAndReplaceClickSpanColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkStyleAndReplaceClickSpanColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
    }
}
