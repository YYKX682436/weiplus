package ca4;

/* loaded from: classes4.dex */
public final class e1 {
    public e1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static int a(ca4.e1 e1Var, int i17, boolean z17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("characterCount2TextCount$default", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if ((i18 & 2) != 0) {
            z17 = true;
        }
        e1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("characterCount2TextCount", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        int ceil = (int) (z17 ? java.lang.Math.ceil(i17 / 2.0d) : java.lang.Math.floor(i17 / 2.0d));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("characterCount2TextCount", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("characterCount2TextCount$default", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return ceil;
    }

    public final boolean b(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkEnableShowGroupByExtFlag", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        boolean z17 = (i17 & 3) == 3 || (i17 & 5) == 5 || (i17 & 1025) == 1025 || (i17 & 513) == 513 || (i17 & 4097) == 4097;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkEnableShowGroupByExtFlag", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return z17;
    }

    public final boolean c(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkHaveBlackContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (c19806x4c372b7 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkHaveBlackContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return false;
        }
        int i17 = c19806x4c372b7.f39000xe139598c;
        if (i17 != 0) {
            boolean z17 = i17 == 4;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkHaveBlackContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return z17;
        }
        if ((c19806x4c372b7.f38967x15579d0d & 2) > 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(c19806x4c372b7.f38960xc6d7bd1d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkHaveBlackContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return true;
        }
        if ((c19806x4c372b7.f38967x15579d0d & 1024) <= 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(c19806x4c372b7.f38958xbe522252)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkHaveBlackContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkHaveBlackContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return true;
    }

    public final boolean d(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkHaveBlackTagList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (c19806x4c372b7 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkHaveBlackTagList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return false;
        }
        if ((c19806x4c372b7.f38967x15579d0d & 1024) <= 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(c19806x4c372b7.f38958xbe522252)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkHaveBlackTagList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkHaveBlackTagList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return true;
    }

    public final boolean e(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkHaveGroupContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (c19806x4c372b7 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkHaveGroupContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return false;
        }
        int i17 = c19806x4c372b7.f39000xe139598c;
        if (i17 != 0) {
            boolean z17 = i17 == 3;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkHaveGroupContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return z17;
        }
        if ((c19806x4c372b7.f38967x15579d0d & 4) > 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(c19806x4c372b7.f38975x1f0e1eca)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkHaveGroupContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return true;
        }
        if ((c19806x4c372b7.f38967x15579d0d & 512) <= 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(c19806x4c372b7.f38971xffe88d2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkHaveGroupContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkHaveGroupContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return true;
    }

    public final boolean f(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkHaveGroupTagList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (c19806x4c372b7 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkHaveGroupTagList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return false;
        }
        if ((c19806x4c372b7.f38967x15579d0d & 512) <= 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(c19806x4c372b7.f38971xffe88d2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkHaveGroupTagList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkHaveGroupTagList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return true;
    }

    public final boolean g(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkHaveSetInteractFriendList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        boolean z17 = false;
        if (c19806x4c372b7 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkHaveSetInteractFriendList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return false;
        }
        int i17 = c19806x4c372b7.f38967x15579d0d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkHaveSetInteractFriendList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        boolean z18 = (i17 & 4096) > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkHaveSetInteractFriendList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (z18 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(c19806x4c372b7.f38995x9ed6b7fa)) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkHaveSetInteractFriendList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return z17;
    }

    public final boolean h(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 snsObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkIsSetComplexVisibility", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsObject, "snsObject");
        boolean z17 = g(snsObject) || (e(snsObject) && c(snsObject));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkIsSetComplexVisibility", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return z17;
    }

    public final void i(java.lang.CharSequence charSequence, boolean z17) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkStyleAndReplaceClickSpanColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLinkSpanColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (z17) {
            xa4.g.t();
            i17 = com.p314xaae8f345.mm.R.C30859x5a72f63.af9;
        } else {
            r();
            i17 = com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLinkSpanColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        int d17 = i65.a.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("forceReplaceClickSpanTextColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (charSequence instanceof android.text.Spannable) {
            android.text.Spannable spannable = (android.text.Spannable) charSequence;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0[] z0VarArr = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0[]) spannable.getSpans(0, spannable.length(), com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z0VarArr);
            for (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 z0Var : z0VarArr) {
                z0Var.mo63036x52d2f021(d17, z0Var.m75726x319751e8());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("forceReplaceClickSpanTextColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkStyleAndReplaceClickSpanColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
    }

    public final void j(java.lang.String tag, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("debugPrintSnsObjectVisibilityInfo", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        if (c19806x4c372b7 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("debugPrintSnsObjectVisibilityInfo", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return;
        }
        java.lang.String str = z17 ? ", " : "\n ";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("debugPrintSnsObjectVisibilityInfo:");
        sb6.append(str);
        sb6.append("SnsObject#Id=" + c19806x4c372b7.Id);
        sb6.append(str);
        sb6.append("ExtFlag=" + c19806x4c372b7.f38967x15579d0d);
        sb6.append(str);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("showGroupList=");
        sb7.append((c19806x4c372b7.f38967x15579d0d & 4) > 0);
        sb6.append(sb7.toString());
        sb6.append(str);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("showGroupTagList=");
        sb8.append((c19806x4c372b7.f38967x15579d0d & 512) > 0);
        sb6.append(sb8.toString());
        sb6.append(str);
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("showBlackList=");
        sb9.append((c19806x4c372b7.f38967x15579d0d & 2) > 0);
        sb6.append(sb9.toString());
        sb6.append(str);
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder("showBlackTagList=");
        sb10.append((c19806x4c372b7.f38967x15579d0d & 1024) > 0);
        sb6.append(sb10.toString());
        sb6.append(str);
        sb6.append("GroupUser Size: " + c19806x4c372b7.f38975x1f0e1eca.size());
        sb6.append(str);
        sb6.append("BlackList Size: " + c19806x4c372b7.f38960xc6d7bd1d.size());
        sb6.append(str);
        sb6.append("BlackContactTagIdList:" + c19806x4c372b7.f38958xbe522252);
        sb6.append(str);
        sb6.append("GroupContactTagIdList:" + c19806x4c372b7.f38971xffe88d2);
        sb6.append(str);
        sb6.append("IsStar:" + c19806x4c372b7.f38980x988ba8e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("debugPrintSnsObjectVisibilityInfo", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
    }

    public final boolean k(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableShowCommentEntrance", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableShowCommentEntrance", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return false;
        }
        boolean m70391x8f904ca3 = c17933xe8d1b226.m70391x8f904ca3();
        java.lang.String m70374x6bf53a6c = c17933xe8d1b226.m70374x6bf53a6c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isUserChatOnlyOrBlackContact", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m70374x6bf53a6c)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUserChatOnlyOrBlackContact", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 q17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(m70374x6bf53a6c);
            if (q17 != null) {
                z17 = q17.o2() || q17.y2();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUserChatOnlyOrBlackContact", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                if (!m70391x8f904ca3 && z17) {
                    m70391x8f904ca3 = false;
                } else if (!m70391x8f904ca3 && !z17) {
                    m70391x8f904ca3 = true;
                }
                boolean D0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(c17933xe8d1b226.m70374x6bf53a6c(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.sj());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUtilExt", "enableShowCommentEntrance: " + c17933xe8d1b226.m70367x7525eefd() + ", " + c17933xe8d1b226.m70391x8f904ca3() + ", " + z17 + ", " + D0);
                boolean z18 = !m70391x8f904ca3 || D0;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableShowCommentEntrance", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                return z18;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUserChatOnlyOrBlackContact", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        }
        z17 = false;
        if (!m70391x8f904ca3) {
        }
        if (!m70391x8f904ca3) {
            m70391x8f904ca3 = true;
        }
        boolean D02 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(c17933xe8d1b226.m70374x6bf53a6c(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.sj());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUtilExt", "enableShowCommentEntrance: " + c17933xe8d1b226.m70367x7525eefd() + ", " + c17933xe8d1b226.m70391x8f904ca3() + ", " + z17 + ", " + D02);
        if (m70391x8f904ca3) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableShowCommentEntrance", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return z18;
    }

    public final android.graphics.drawable.Drawable l(android.content.Context context, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720) {
        android.graphics.drawable.Drawable i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommentButtonIconDrawable", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (xa4.g.f534363d.y(c19807x593d1720)) {
            i17 = i65.a.i(context, com.p314xaae8f345.mm.R.C30861xcebc809e.f78115xb2ff3e33);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i17);
        } else {
            i17 = pc4.d.f434943a.z() ? i65.a.i(context, com.p314xaae8f345.mm.R.C30861xcebc809e.d4t) : com.p314xaae8f345.mm.ui.zk.d(context, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559934iu);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentButtonIconDrawable", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return i17;
    }

    public final int m(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommentLikeIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (z17) {
            xa4.g.t();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentLikeIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return com.p314xaae8f345.mm.R.C30859x5a72f63.af9;
        }
        r();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentLikeIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c;
    }

    public final int n(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDeleteIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (xa4.g.f534363d.y(c19807x593d1720)) {
            xa4.g.t();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDeleteIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return com.p314xaae8f345.mm.R.C30859x5a72f63.af9;
        }
        r();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDeleteIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c;
    }

    public final java.lang.CharSequence o(java.lang.String remarkname, java.lang.String username, yz5.p clickCb) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDisplayRemarkSpan", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remarkname, "remarkname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickCb, "clickCb");
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        ((ke0.e) xVar).getClass();
        android.text.SpannableString i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, remarkname);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d1 d1Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d1(remarkname, new ca4.a1(clickCb, username));
        d1Var.f272735f = java.lang.Boolean.FALSE;
        i17.setSpan(d1Var, 0, remarkname.length(), 33);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayRemarkSpan", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return i17;
    }

    public final int p(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGroupPermissionIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (xa4.g.f534363d.y(c19807x593d1720)) {
            xa4.g.t();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGroupPermissionIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return com.p314xaae8f345.mm.R.C30859x5a72f63.af9;
        }
        r();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGroupPermissionIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c;
    }

    public final android.graphics.drawable.Drawable q(android.content.Context context, boolean z17, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLikeIconDrawable", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int color = context.getResources().getColor(m(z17));
        if (z17) {
            android.graphics.drawable.Drawable s17 = xa4.g.s(color, i17, i18);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLikeIconDrawable", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return s17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLikeIconResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLikeIconResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        android.graphics.drawable.Drawable e17 = com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79408xa2054ce2, color);
        e17.setBounds(0, 0, i17, i18);
        e17.clearColorFilter();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLikeIconDrawable", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return e17;
    }

    public final int r() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNormalLinkColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNormalLinkColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c;
    }

    public final int s(android.content.Context context) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPLTextWidthOnLargeWindow", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        int i17 = 0;
        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.ActivityC18203x35bf69b5) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC$Companion");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getEnableLargeUI$cp", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
            z17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.u.f250533d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getEnableLargeUI$cp", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC$Companion");
            if (z17) {
                i17 = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.aav);
            }
        } else {
            z17 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUtilExt", "getPLTextViewHeightOnLargeWindow=" + i17 + ", inLargeWindow=" + z17 + ' ');
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPLTextWidthOnLargeWindow", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return i17;
    }

    public final int t(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStarIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (xa4.g.f534363d.y(c19807x593d1720)) {
            xa4.g.t();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStarIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return com.p314xaae8f345.mm.R.C30859x5a72f63.af9;
        }
        r();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStarIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c;
    }

    public final java.lang.CharSequence u(android.content.Context context, java.lang.String snsId, boolean z17, java.util.LinkedList withTaList) {
        java.lang.String g17;
        java.lang.String str;
        java.util.Iterator it;
        boolean z18;
        java.lang.String str2;
        java.lang.CharSequence o17;
        java.lang.String str3 = "getWithTaText";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWithTaText", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsId, "snsId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(withTaList, "withTaList");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.jge));
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        android.os.Vibrator vibrator = ca4.z0.f121601a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWithTaUsernameList", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p2621x8fb0427b.e8 pj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.pj();
        java.lang.String sj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.sj();
        java.util.Iterator it6 = withTaList.iterator();
        boolean z19 = false;
        while (it6.hasNext()) {
            java.lang.String str4 = ((r45.e86) it6.next()).f454659d;
            com.p314xaae8f345.mm.p2621x8fb0427b.e8 e8Var = pj6;
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) pj6).n(str4, true);
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
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWithTaUsernameList", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String sj7 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.sj();
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
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str5, sj7)) {
                java.lang.String g18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f572005w1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g18, "getString(...)");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sj7);
                o17 = o(g18, sj7, b1Var);
                str2 = str3;
                str = sj7;
                it = it7;
                z18 = z27;
            } else {
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                java.lang.String a17 = c01.a2.a(str5);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
                str = sj7;
                it = it7;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("withFriends", "com.tencent.mm.plugin.sns.model.withta.UtilsKt");
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                java.lang.String a18 = c01.a2.a(a17);
                qa4.k kVar = qa4.k.f442628a;
                z18 = z27;
                if (!kVar.s().contains(a18)) {
                    kVar.s().add(a18);
                }
                java.util.Collection s17 = kVar.s();
                if (kVar.s().size() > 3) {
                    java.util.ArrayList s18 = kVar.s();
                    str2 = str3;
                    java.util.Collection subList = s18.subList(0, 3);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(subList, "subList(...)");
                    s17 = subList;
                } else {
                    str2 = str3;
                }
                java.lang.String g19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.jhy);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g19, "getString(...)");
                java.lang.String format = java.lang.String.format(g19, java.util.Arrays.copyOf(new java.lang.Object[]{kz5.n0.g0(s17, "、", null, null, 0, null, null, 62, null)}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setWithFriendsStr", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
                qa4.k.f442630c = format;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setWithFriendsStr", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("withFriends", "com.tencent.mm.plugin.sns.model.withta.UtilsKt");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str5);
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
        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac) {
            dx1.g.f326022a.o("MomentsTogetherTailActionFeed", snsId, "CCUserList", stringBuffer);
        }
        if (arrayList.isEmpty()) {
            spannableStringBuilder.clear();
        }
        int size = withTaList.size();
        int size2 = arrayList.size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWithTaStr", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (size2 == 1) {
            if (size2 < size) {
                g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.jgh);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWithTaStr", "com.tencent.mm.plugin.sns.data.SnsUtil");
            } else {
                g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.jgg);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWithTaStr", "com.tencent.mm.plugin.sns.data.SnsUtil");
            }
        } else if (size2 <= 1) {
            g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.j9q);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWithTaStr", "com.tencent.mm.plugin.sns.data.SnsUtil");
        } else if (size2 < size) {
            g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.jgf);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWithTaStr", "com.tencent.mm.plugin.sns.data.SnsUtil");
        } else {
            g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.jgg);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWithTaStr", "com.tencent.mm.plugin.sns.data.SnsUtil");
        }
        spannableStringBuilder.append((java.lang.CharSequence) g17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str6, "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return spannableStringBuilder;
    }

    public final java.util.LinkedList v(java.util.List stringList) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stringListToSKBuiltinStringList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stringList, "stringList");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = stringList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            r45.du5 du5Var = new r45.du5();
            du5Var.c(str);
            linkedList.add(du5Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stringListToSKBuiltinStringList", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        return linkedList;
    }

    public final void h(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, java.lang.CharSequence charSequence) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkStyleAndReplaceClickSpanColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkStyleAndReplaceClickSpanColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return;
        }
        if (c17933xe8d1b226.m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkStyleAndReplaceClickSpanColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkStyleAndReplaceClickSpanColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        i(charSequence, xa4.g.f534363d.y(m70371x485d7));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkStyleAndReplaceClickSpanColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkStyleAndReplaceClickSpanColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
    }
}
