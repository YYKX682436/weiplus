package cj0;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final cj0.a f123386a = new cj0.a();

    public final java.util.ArrayList a(bw5.nk0 snsVisibilityData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsVisibilityData, "snsVisibilityData");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = snsVisibilityData.f112253p.iterator();
        while (it.hasNext()) {
            arrayList.add(((bw5.ok0) it.next()).b());
        }
        return arrayList;
    }

    public final java.util.ArrayList b(bw5.nk0 snsVisibilityData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsVisibilityData, "snsVisibilityData");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = snsVisibilityData.f112251n.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf((int) ((bw5.pk0) it.next()).f113241d));
        }
        return arrayList;
    }

    public final java.util.ArrayList c(bw5.nk0 snsVisibilityData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsVisibilityData, "snsVisibilityData");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = snsVisibilityData.f112251n.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf(((bw5.pk0) it.next()).f113241d));
        }
        return arrayList;
    }

    public final java.util.ArrayList d(bw5.nk0 snsVisibilityData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsVisibilityData, "snsVisibilityData");
        if (snsVisibilityData.b() == bw5.qk0.SNS_VISIBILITY_VISIBLE) {
            return a(snsVisibilityData);
        }
        return f(snsVisibilityData);
    }

    public final java.util.LinkedList e(java.util.List userNameList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userNameList, "userNameList");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = userNameList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            bw5.ok0 ok0Var = new bw5.ok0();
            ok0Var.f112671d = str;
            boolean[] zArr = ok0Var.f112673f;
            zArr[1] = true;
            ok0Var.f112672e = f123386a.m(str);
            zArr[2] = true;
            linkedList.add(ok0Var);
        }
        return linkedList;
    }

    public final java.util.ArrayList f(bw5.nk0 snsVisibilityData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsVisibilityData, "snsVisibilityData");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = snsVisibilityData.f112247g.iterator();
        while (it.hasNext()) {
            arrayList.add(((bw5.ok0) it.next()).b());
        }
        return arrayList;
    }

    public final java.util.ArrayList g(bw5.nk0 snsVisibilityData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsVisibilityData, "snsVisibilityData");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = snsVisibilityData.f112245e.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf((int) ((bw5.pk0) it.next()).f113241d));
        }
        return arrayList;
    }

    public final java.util.ArrayList h(bw5.nk0 snsVisibilityData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsVisibilityData, "snsVisibilityData");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = snsVisibilityData.f112245e.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf(((bw5.pk0) it.next()).f113241d));
        }
        return arrayList;
    }

    public final java.util.ArrayList i(bw5.nk0 snsVisibilityData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsVisibilityData, "snsVisibilityData");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = snsVisibilityData.f112249i.iterator();
        while (it.hasNext()) {
            arrayList.add(((bw5.ok0) it.next()).b());
        }
        return arrayList;
    }

    public final java.util.LinkedList j(java.util.LinkedList labelIdList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelIdList, "labelIdList");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = labelIdList.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            bw5.pk0 pk0Var = new bw5.pk0();
            java.lang.String g17 = ((b93.b) c93.a.a()).g(java.lang.String.valueOf(intValue));
            if (g17 == null) {
                g17 = "";
            }
            java.util.List<java.lang.String> j17 = ((b93.b) c93.a.a()).j(java.lang.String.valueOf(intValue));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getLabelList labelId: ");
            sb6.append(intValue);
            sb6.append(", labelName:");
            sb6.append(g17);
            sb6.append(" userSize: ");
            sb6.append(j17 != null ? java.lang.Integer.valueOf(j17.size()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Sns.VisibilityHelper", sb6.toString());
            pk0Var.f113241d = intValue;
            boolean[] zArr = pk0Var.f113244g;
            zArr[1] = true;
            pk0Var.f113242e = g17;
            zArr[2] = true;
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            if (j17 != null) {
                for (java.lang.String str : j17) {
                    bw5.ok0 ok0Var = new bw5.ok0();
                    ok0Var.f112671d = str;
                    boolean[] zArr2 = ok0Var.f112673f;
                    zArr2[1] = true;
                    cj0.a aVar = f123386a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    ok0Var.f112672e = aVar.m(str);
                    zArr2[2] = true;
                    linkedList2.add(ok0Var);
                }
            }
            pk0Var.f113243f = linkedList2;
            zArr[3] = true;
            linkedList.add(pk0Var);
        }
        return linkedList;
    }

    public final java.util.LinkedList k(java.util.LinkedList linkedList) {
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            bw5.pk0 pk0Var = new bw5.pk0();
            java.lang.String g17 = ((b93.b) c93.a.a()).g(java.lang.String.valueOf(intValue));
            if (g17 == null) {
                g17 = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Sns.VisibilityHelper", "getLabelList labelId: " + intValue + ", labelName:" + g17);
            pk0Var.f113241d = (long) intValue;
            boolean[] zArr = pk0Var.f113244g;
            zArr[1] = true;
            pk0Var.f113242e = g17;
            zArr[2] = true;
            pk0Var.f113243f = new java.util.LinkedList();
            zArr[3] = true;
            linkedList2.add(pk0Var);
        }
        return linkedList2;
    }

    public final void l(java.lang.String tag, bw5.nk0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "SnsVisibilityData >> visibilityType: " + data.b() + " includeFriendsNum: " + data.f112247g.size() + "  includeFriends: " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(f(data), "，") + " excludeFriendNum: " + data.f112253p.size() + "  excludeFriends: " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(a(data), "，") + " includeLabelsNum: " + data.f112245e.size() + "  includeLabels: " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(h(data), "，") + " excludeLabelsNum: " + data.f112251n.size() + "  excludeLabels: " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(c(data), "，") + " interactFriendsNum: " + data.f112249i.size() + "  interactFriends: " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(i(data), "，"));
    }

    public final java.lang.String m(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String a17 = c01.a2.a(username);
        if (!android.text.TextUtils.isEmpty(a17)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
            return a17;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true);
        if (n17 == null || android.text.TextUtils.isEmpty(n17.f2())) {
            return "";
        }
        java.lang.String f27 = n17.f2();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f27, "getDisplayNick(...)");
        return f27;
    }

    public final java.util.LinkedList d(java.util.LinkedList userNameList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userNameList, "userNameList");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = userNameList.iterator();
        while (it.hasNext()) {
            r45.du5 du5Var = (r45.du5) it.next();
            bw5.ok0 ok0Var = new bw5.ok0();
            java.lang.String str = du5Var.f454289d;
            ok0Var.f112671d = str;
            boolean[] zArr = ok0Var.f112673f;
            zArr[1] = true;
            cj0.a aVar = f123386a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
            ok0Var.f112672e = aVar.m(str);
            zArr[2] = true;
            linkedList.add(ok0Var);
        }
        return linkedList;
    }

    public final bw5.nk0 l(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 snsInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsInfo, "snsInfo");
        bw5.nk0 nk0Var = new bw5.nk0();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 f17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f(snsInfo);
        int i17 = f17.f39000xe139598c;
        boolean[] zArr = nk0Var.f112255r;
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkHaveGroupContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            int i18 = f17.f39000xe139598c;
            if (i18 != 0) {
                r12 = i18 == 3;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkHaveGroupContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            } else {
                if ((f17.f38967x15579d0d & 4) > 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(f17.f38975x1f0e1eca)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkHaveGroupContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                } else if ((f17.f38967x15579d0d & 512) > 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(f17.f38971xffe88d2)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkHaveGroupContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkHaveGroupContactListOrTagListBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                }
                r12 = true;
            }
            if (r12) {
                java.util.LinkedList<r45.du5> GroupUser = f17.f38975x1f0e1eca;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(GroupUser, "GroupUser");
                java.util.LinkedList d17 = d(GroupUser);
                nk0Var.f112247g.addAll(d17);
                nk0Var.h(d17.size());
                java.util.LinkedList<java.lang.Integer> GroupContactTagIdList = f17.f38971xffe88d2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(GroupContactTagIdList, "GroupContactTagIdList");
                java.util.LinkedList j17 = j(GroupContactTagIdList);
                nk0Var.f112245e.addAll(j17);
                nk0Var.f112246f = j17.size();
                zArr[3] = true;
                nk0Var.i(bw5.qk0.SNS_VISIBILITY_VISIBLE);
            } else {
                nk0Var.i(bw5.qk0.SNS_VISIBILITY_INVISIBLE);
                java.util.LinkedList<r45.du5> BlackList = f17.f38960xc6d7bd1d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(BlackList, "BlackList");
                java.util.LinkedList d18 = d(BlackList);
                nk0Var.f112253p.addAll(d18);
                nk0Var.a(d18.size());
                java.util.LinkedList<java.lang.Integer> BlackContactTagIdList = f17.f38958xbe522252;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(BlackContactTagIdList, "BlackContactTagIdList");
                java.util.LinkedList j18 = j(BlackContactTagIdList);
                nk0Var.f112251n.addAll(j18);
                nk0Var.f112252o = j18.size();
                zArr[9] = true;
            }
        } else {
            nk0Var.i(bw5.qk0.a(i17));
            java.util.LinkedList<r45.du5> GroupUser2 = f17.f38975x1f0e1eca;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(GroupUser2, "GroupUser");
            java.util.LinkedList d19 = d(GroupUser2);
            nk0Var.f112247g.addAll(d19);
            nk0Var.h(d19.size());
            java.util.LinkedList<r45.du5> BlackList2 = f17.f38960xc6d7bd1d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(BlackList2, "BlackList");
            java.util.LinkedList d27 = d(BlackList2);
            nk0Var.f112253p.addAll(d27);
            nk0Var.a(d27.size());
            java.util.LinkedList<r45.du5> RecentInteractUserList = f17.f38995x9ed6b7fa;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(RecentInteractUserList, "RecentInteractUserList");
            java.util.LinkedList d28 = d(RecentInteractUserList);
            nk0Var.f112249i.addAll(d28);
            nk0Var.f112250m = d28.size();
            zArr[7] = true;
            java.util.LinkedList<java.lang.Integer> GroupContactTagIdList2 = f17.f38971xffe88d2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(GroupContactTagIdList2, "GroupContactTagIdList");
            java.util.LinkedList j19 = j(GroupContactTagIdList2);
            nk0Var.f112245e.addAll(j19);
            nk0Var.f112246f = j19.size();
            zArr[3] = true;
            java.util.LinkedList<java.lang.Integer> BlackContactTagIdList2 = f17.f38958xbe522252;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(BlackContactTagIdList2, "BlackContactTagIdList");
            java.util.LinkedList j27 = j(BlackContactTagIdList2);
            nk0Var.f112251n.addAll(j27);
            nk0Var.f112252o = j27.size();
            zArr[9] = true;
        }
        return nk0Var;
    }
}
