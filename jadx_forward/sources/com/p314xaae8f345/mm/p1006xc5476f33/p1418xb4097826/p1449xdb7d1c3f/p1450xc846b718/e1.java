package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class e1 implements zy2.z8 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x f187012e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x(null);

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List f187013f = kz5.c0.i("finder_wx_private_msg_entrance", "FinderWXMessageConversation", "finder_private_msg_entrance", "FinderMessageConversation", "AuthorProfileNotify", "FinderMessageEntryRight", "NotificationCenterLike", "NotificationCenterComment", "NotificationCenterFollow", "WxMessageEntry", "WxMessageEntryRight", "WxMessageComment", "WxMessageLike", "AuthorProfileMemberNotify", "MemberNotificationCenterLike", "MemberNotificationCenterJoin", "MemberNotificationCenterComment", "TLPersonalCenter", "FinderMentionEntrance", "Discovery", "FinderSwitchAccount");

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.List f187014g = kz5.c0.i("finder_private_msg_entrance", "FinderMessageConversation", "AuthorProfileNotify", "NotificationCenterLike", "NotificationCenterComment", "NotificationCenterFollow", "AuthorProfileMemberNotify", "MemberNotificationCenterLike", "MemberNotificationCenterJoin", "MemberNotificationCenterComment", "FinderMessageEntryRight");

    /* renamed from: a, reason: collision with root package name */
    public final zy2.fa f187015a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f187016b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f187017c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a0 f187018d;

    public e1(zy2.fa redDotManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotManager, "redDotManager");
        this.f187015a = redDotManager;
        this.f187016b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("FinderMsgRedDotCountHandler");
        this.f187018d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a0();
    }

    public static /* synthetic */ void p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.e1 e1Var, java.lang.String str, java.util.ArrayList arrayList, java.util.HashSet hashSet, zy2.y8 y8Var, r45.vs2 vs2Var, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            arrayList = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList2 = arrayList;
        if ((i17 & 4) != 0) {
            hashSet = new java.util.HashSet();
        }
        java.util.HashSet hashSet2 = hashSet;
        if ((i17 & 16) != 0) {
            vs2Var = null;
        }
        e1Var.o(str, arrayList2, hashSet2, y8Var, vs2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r25, java.lang.String r26, java.util.ArrayList r27, zy2.y8 r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 831
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.e1.a(java.lang.String, java.lang.String, java.util.ArrayList, zy2.y8, boolean):void");
    }

    public final void b(java.lang.String str, java.lang.String str2, java.util.ArrayList arrayList, zy2.y8 y8Var) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t80 Kj = ((c61.l7) i95.n0.c(c61.l7.class)).Kj();
        int L0 = Kj.L0(2, 2, str2);
        boolean z17 = true;
        int L02 = Kj.L0(2, 1, str2);
        java.lang.Object obj = null;
        m92.b j37 = g92.a.j3(g92.b.f351302e, str2, false, 2, null);
        int i17 = j37 != null ? j37.f68721x6e5f342 : 0;
        boolean z18 = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LATEST_NOTIFICATION_SYS_MSG_END_TIME_LONG_SYNC, 0L) * 1000 < c01.id.c();
        java.lang.String str3 = "";
        if (z18) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LATEST_NOTIFICATION_SYS_MSG_CONTENT_STRING_SYNC, "");
        } else {
            str3 = gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LATEST_NOTIFICATION_SYS_MSG_CONTENT_STRING_SYNC, "");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[calFinderPrivateMsg] Cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms 视频号身份私信=" + L0 + " 视频号团队=" + i17 + " 打招呼消息=" + L02 + " 透出文案=" + str3 + " 结束=" + z18);
        int i18 = L0 + i17;
        if (i18 > 0) {
            kz5.h0.B(arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.i0.f187109d);
            r45.f03 f03Var = new r45.f03();
            f03Var.f455439z = str2;
            f03Var.f455425i = "finder_private_msg_entrance";
            f03Var.f455426m = "TLPersonalCenter";
            f03Var.f455424h = 2;
            f03Var.f455420d = 2;
            f03Var.f455421e = i18;
            if (!(str3 == null || str3.length() == 0)) {
                f03Var.f455422f = str3;
            }
            arrayList.add(f03Var);
            kz5.h0.B(arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.j0.f187134d);
            r45.f03 f03Var2 = new r45.f03();
            f03Var2.f455439z = str2;
            f03Var2.f455425i = "FinderMessageConversation";
            f03Var2.f455426m = "finder_private_msg_entrance";
            f03Var2.f455424h = 1;
            f03Var2.f455420d = 1;
            arrayList.add(f03Var2);
            return;
        }
        if (L02 <= 0 || !(y8Var == zy2.y8.D || y8Var == zy2.y8.f559161x)) {
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                r45.f03 f03Var3 = (r45.f03) next;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f03Var3.f455425i, "finder_private_msg_entrance") && f03Var3.f455420d == 1) {
                    obj = next;
                    break;
                }
            }
            if (obj == null) {
                kz5.h0.B(arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.m0.f187231d);
                kz5.h0.B(arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.h0.f187076d);
                return;
            }
            return;
        }
        kz5.h0.B(arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.k0.f187154d);
        kz5.h0.B(arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l0.f187173d);
        r45.f03 f03Var4 = new r45.f03();
        f03Var4.f455439z = str2;
        f03Var4.f455425i = "finder_private_msg_entrance";
        f03Var4.f455426m = "TLPersonalCenter";
        f03Var4.f455424h = 2;
        f03Var4.f455420d = 1;
        if (str3 != null && str3.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            f03Var4.f455422f = str3;
        }
        arrayList.add(f03Var4);
    }

    public final void c(java.lang.String str, java.util.ArrayList arrayList, zy2.y8 y8Var) {
        java.lang.Object obj;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t80 Kj = ((c61.l7) i95.n0.c(c61.l7.class)).Kj();
        int L0 = Kj.L0(1, 2, "");
        int L02 = Kj.L0(1, 1, "");
        int L03 = Kj.L0(1, 3, "");
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WX_PRIVATE_SYS_MSG_UNREAD_COUNT_INT_SYNC, 0);
        zy2.y8 y8Var2 = zy2.y8.f559161x;
        if (y8Var != y8Var2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[calWxPrivateMsg] Cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms 微信身份私信=" + L0 + " 马甲身份私信=" + L03 + " 打招呼消息=" + L02 + " 微信系统消息=" + r17);
        }
        int i17 = L0 + L03 + r17;
        if (i17 > 0) {
            kz5.h0.B(arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.u0.f187415d);
            r45.f03 f03Var = new r45.f03();
            f03Var.f455425i = "finder_wx_private_msg_entrance";
            f03Var.f455426m = "TLPersonalCenter";
            f03Var.f455424h = 2;
            f03Var.f455420d = 2;
            f03Var.f455421e = i17;
            arrayList.add(f03Var);
            kz5.h0.B(arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.v0.f187448d);
            r45.f03 f03Var2 = new r45.f03();
            f03Var2.f455425i = "FinderWXMessageConversation";
            f03Var2.f455426m = "finder_wx_private_msg_entrance";
            f03Var2.f455424h = 1;
            f03Var2.f455420d = 1;
            arrayList.add(f03Var2);
            return;
        }
        if (L02 > 0 && (y8Var == zy2.y8.C || y8Var == y8Var2)) {
            kz5.h0.B(arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w0.f187475d);
            kz5.h0.B(arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x0.f187505d);
            r45.f03 f03Var3 = new r45.f03();
            f03Var3.f455425i = "finder_wx_private_msg_entrance";
            f03Var3.f455426m = "TLPersonalCenter";
            f03Var3.f455424h = 2;
            f03Var3.f455420d = 1;
            arrayList.add(f03Var3);
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            r45.f03 f03Var4 = (r45.f03) obj;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f03Var4.f455425i, "finder_wx_private_msg_entrance") && f03Var4.f455420d == 1) {
                break;
            }
        }
        if (obj == null) {
            kz5.h0.B(arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.y0.f187556d);
            kz5.h0.B(arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.t0.f187401d);
        }
    }

    public void d(java.lang.String finderUsername, zy2.y8 source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.List<java.lang.String> list = f187014g;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar : zy2.fa.O0(this.f187015a, (java.lang.String) it.next(), finderUsername, false, false, 12, null)) {
                java.lang.String str = jbVar.f65882x5364c75d;
                if (str == null || str.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(f(finderUsername, source), "tips_uuid is null! " + jbVar);
                }
                java.lang.String str2 = jbVar.f65882x5364c75d;
                if (str2 == null) {
                    str2 = jbVar.f65880x11c19d58;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                hashMap.put(str2, jbVar);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f(finderUsername, source), "[clearMessageRedDot] finderUsername=" + finderUsername + " deleteCtrlInfoSet=" + hashMap);
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            for (java.lang.String str3 : list) {
                r45.f03 I0 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) entry.getValue()).I0(str3);
                this.f187015a.g0((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) entry.getValue(), str3, true, I0 != null ? I0.f455439z : null);
            }
        }
        h(finderUsername, source);
    }

    public final void e(java.lang.String str, java.lang.String str2, java.util.ArrayList arrayList, java.util.HashSet hashSet, boolean z17) {
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[fillShowInfoList#berfore] ");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r45.f03 f03Var = (r45.f03) it.next();
                arrayList2.add(f03Var.f455425i + '#' + f03Var.f455420d + '#' + f03Var.f455421e);
            }
            sb6.append(arrayList2);
            sb6.append(" ignoreReadPathSet=");
            sb6.append(hashSet);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            java.lang.String str3 = ((r45.f03) it6.next()).f455425i;
            if (str3 == null) {
                str3 = "";
            }
            arrayList3.add(str3);
        }
        hashSet.addAll(arrayList3);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj : f187013f) {
            if (true ^ hashSet.contains((java.lang.String) obj)) {
                arrayList4.add(obj);
            }
        }
        java.util.Iterator it7 = arrayList4.iterator();
        while (it7.hasNext()) {
            r45.f03 b07 = this.f187015a.b0((java.lang.String) it7.next(), str2);
            if (b07 != null) {
                if (!(b07.f455420d == 1 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b07.f455425i, "Discovery"))) {
                    arrayList.add(b07);
                }
            }
        }
        if (z17) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[fillShowInfoList#after] ");
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                r45.f03 f03Var2 = (r45.f03) it8.next();
                arrayList5.add(f03Var2.f455425i + '#' + f03Var2.f455420d + '#' + f03Var2.f455421e);
            }
            sb7.append(arrayList5);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7.toString());
        }
    }

    public final java.lang.String f(java.lang.String str, zy2.y8 y8Var) {
        if (str == null || str.length() == 0) {
            return "Finder.MsgRedDot#@null#" + y8Var;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Finder.MsgRedDot#");
        m92.b j37 = g92.a.j3(g92.b.f351302e, str, false, 2, null);
        java.lang.String str2 = j37 != null ? j37.f68710x21f9b213 : null;
        if (str2 == null) {
            str2 = "@null";
        }
        sb6.append(str2);
        sb6.append('#');
        sb6.append(y8Var);
        return sb6.toString();
    }

    public final java.lang.String g(java.util.List list) {
        java.util.ArrayList<r45.f03> arrayList = new java.util.ArrayList(list);
        kz5.h0.B(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.b1(kz5.c0.i("finder_wx_private_msg_entrance", "finder_private_msg_entrance", "AuthorProfileMemberNotify", "AuthorProfileNotify", "WxMessageEntry")));
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (r45.f03 f03Var : arrayList) {
            arrayList2.add(f03Var.f455425i + '#' + f03Var.f455420d + '#' + f03Var.f455421e);
        }
        return arrayList2.toString();
    }

    public void h(java.lang.String str, zy2.y8 source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p(this, str, null, null, source, null, 22, null);
    }

    public final void i(int i17, int i18, int i19, java.lang.String finderUsername) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        zy2.y8 y8Var = zy2.y8.f559162y;
        java.lang.String f17 = f(finderUsername, y8Var);
        if (i17 <= 0 && i18 <= 0 && i19 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f17, "[notifyFinderMsgCount] server error.");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i27 = i17 + i18 + i19;
        r45.f03 f03Var = new r45.f03();
        f03Var.f455421e = i27;
        f03Var.f455420d = i27 > 0 ? 2 : 1;
        f03Var.f455424h = 1;
        f03Var.f455425i = "AuthorProfileMemberNotify";
        f03Var.f455439z = finderUsername;
        arrayList.add(f03Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f17, "isEnableLike :true isEnableComment:true isEnableFollow:true messageCount:" + i27);
        if (i17 > 0) {
            r45.f03 f03Var2 = new r45.f03();
            f03Var2.f455420d = 2;
            f03Var2.f455424h = 1;
            f03Var2.f455425i = "MemberNotificationCenterLike";
            f03Var2.f455421e = i17;
            f03Var2.f455439z = finderUsername;
            arrayList.add(f03Var2);
        }
        if (i18 > 0) {
            r45.f03 f03Var3 = new r45.f03();
            f03Var3.f455420d = 2;
            f03Var3.f455424h = 1;
            f03Var3.f455425i = "MemberNotificationCenterComment";
            f03Var3.f455421e = i18;
            f03Var3.f455439z = finderUsername;
            arrayList.add(f03Var3);
        }
        if (i19 > 0) {
            r45.f03 f03Var4 = new r45.f03();
            f03Var4.f455420d = 2;
            f03Var4.f455424h = 1;
            f03Var4.f455425i = "MemberNotificationCenterJoin";
            f03Var4.f455421e = i19;
            f03Var4.f455439z = finderUsername;
            arrayList.add(f03Var4);
        }
        p(this, finderUsername, arrayList, kz5.p1.d("AuthorProfileMemberNotify", "MemberNotificationCenterLike", "MemberNotificationCenterJoin", "MemberNotificationCenterComment"), y8Var, null, 16, null);
    }

    public final void j(int i17, int i18, int i19, int i27, java.lang.String finderUsername) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        if (finderUsername.length() == 0) {
            pm0.z.b(xy2.b.f539688b, "notifyFinderMentionCount", false, null, "changelcai", false, false, null, 116, null);
            return;
        }
        if (i27 > 0) {
            g92.b bVar = g92.b.f351302e;
            m92.c cVar = new m92.c(finderUsername);
            cVar.f68721x6e5f342 = i27;
            bVar.C(cVar, m92.j.f406541z);
        }
        zy2.y8 y8Var = zy2.y8.f559163z;
        java.lang.String f17 = f(finderUsername, y8Var);
        if (i17 <= 0 && i18 <= 0 && i19 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f17, "[notifyFinderMsgCount] only update systemCount=" + i27 + '.');
            return;
        }
        this.f187018d.f186865a = false;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        ya2.b2 b17 = ya2.h.f542017a.b(finderUsername);
        long j17 = b17 != null ? b17.f69327x1c739054 : 0L;
        boolean z17 = (j17 & 1) != 1;
        boolean z18 = (j17 & 2) != 2;
        boolean z19 = (j17 & 4) != 4;
        int i28 = z17 ? i17 : 0;
        int i29 = z18 ? i18 : 0;
        int i37 = z19 ? i19 : 0;
        int i38 = i28 + i29 + i37;
        if (i38 != i17 + i18 + i19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f17, "[notifyFinderMsgCount] server error? [" + i17 + ':' + i18 + ':' + i19 + "] => [" + i28 + ':' + i29 + ':' + i37 + "]finderUsername=" + finderUsername);
        }
        if (i17 > 0) {
            r45.f03 f03Var = new r45.f03();
            f03Var.f455420d = i28 > 0 ? 2 : 1;
            f03Var.f455424h = 1;
            f03Var.f455425i = "NotificationCenterLike";
            f03Var.f455421e = i17;
            f03Var.f455439z = finderUsername;
            arrayList.add(f03Var);
        }
        if (i18 > 0) {
            r45.f03 f03Var2 = new r45.f03();
            f03Var2.f455420d = i29 > 0 ? 2 : 1;
            f03Var2.f455424h = 1;
            f03Var2.f455425i = "NotificationCenterComment";
            f03Var2.f455421e = i18;
            f03Var2.f455439z = finderUsername;
            arrayList.add(f03Var2);
        }
        if (i19 > 0) {
            r45.f03 f03Var3 = new r45.f03();
            f03Var3.f455420d = i37 > 0 ? 2 : 1;
            f03Var3.f455424h = 1;
            f03Var3.f455425i = "NotificationCenterFollow";
            f03Var3.f455421e = i19;
            f03Var3.f455439z = finderUsername;
            arrayList.add(f03Var3);
        }
        r45.f03 f03Var4 = new r45.f03();
        f03Var4.f455439z = finderUsername;
        f03Var4.f455425i = "AuthorProfileNotify";
        f03Var4.f455426m = "TLPersonalCenter";
        f03Var4.f455424h = 2;
        f03Var4.f455420d = i38 > 0 ? 2 : 1;
        if (i38 <= 0) {
            i38 = 0;
        }
        f03Var4.f455421e = i38;
        arrayList.add(f03Var4);
        p(this, finderUsername, arrayList, kz5.p1.d("AuthorProfileNotify", "NotificationCenterFollow", "NotificationCenterComment", "NotificationCenterLike"), y8Var, null, 16, null);
    }

    public final void k(r45.vs2 ctrlInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrlInfo, "ctrlInfo");
        o(ctrlInfo.f470029q, new java.util.ArrayList(ctrlInfo.f470022g), kz5.p1.d(""), zy2.y8.A, ctrlInfo);
    }

    public final void l(r45.d33 mention) {
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mention, "mention");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WX_MENTION_IS_BUBBLE_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        r45.vs2 vs2Var = (r45.vs2) mention.m75936x14adae67(5);
        java.util.ArrayList arrayList = (vs2Var == null || (linkedList = vs2Var.f470022g) == null) ? new java.util.ArrayList() : new java.util.ArrayList(linkedList);
        java.util.HashSet d17 = kz5.p1.d("WxMessageEntry", "WxMessageComment", "WxMessageLike");
        this.f187018d.f186866b = false;
        p(this, null, arrayList, d17, zy2.y8.B, null, 16, null);
    }

    public void m() {
        java.util.Iterator it = g92.a.K6(g92.b.f351302e, false, 1, null).iterator();
        while (it.hasNext()) {
            p(this, ((m92.b) it.next()).f68723xdec927b, null, null, zy2.y8.f559147g, null, 22, null);
        }
    }

    public final void n() {
        zy2.y8 y8Var = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_MSG_RED_DOT_VERSION_INT_SYNC, 0) < 1 ? zy2.y8.f559161x : zy2.y8.f559148h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Z6).mo141623x754a37bb()).r()).intValue() == 1) {
            q(f("", y8Var), y8Var, "");
        }
        java.util.Iterator it = g92.a.K6(g92.b.f351302e, false, 1, null).iterator();
        while (it.hasNext()) {
            java.lang.String str = ((m92.b) it.next()).f68723xdec927b;
            java.lang.String f17 = f(str, y8Var);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            q(f17, y8Var, str);
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_MSG_RED_DOT_VERSION_INT_SYNC, 1);
    }

    public final void o(java.lang.String str, java.util.ArrayList arrayList, java.util.HashSet hashSet, zy2.y8 y8Var, r45.vs2 vs2Var) {
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x2) this.f187015a).d1()) {
            this.f187016b.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.c1(this, str, y8Var, arrayList, hashSet, vs2Var));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(f(str, y8Var), "postBuildRedDot but accountNotReady!");
        }
    }

    public final void q(java.lang.String str, zy2.y8 y8Var, java.lang.String str2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet(f187013f);
        kz5.h0.A(hashSet, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.d1(kz5.c0.i("AuthorProfileNotify", "NotificationCenterLike", "NotificationCenterComment", "NotificationCenterFollow", "AuthorProfileMemberNotify", "MemberNotificationCenterLike", "MemberNotificationCenterJoin", "MemberNotificationCenterComment", "WxMessageEntry", "WxMessageComment", "WxMessageLike")));
        if (y8Var == zy2.y8.f559161x) {
            c(str, arrayList, y8Var);
            b(str, str2, arrayList, y8Var);
        }
        e(str, str2, arrayList, hashSet, false);
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.List i17 = kz5.c0.i(2, 1, 1006, 1007, 1008, java.lang.Integer.valueOf(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46405xe4de6fbf), java.lang.Integer.valueOf(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46404xa5f7fd74), 29, 1024);
        java.util.Iterator it = i17.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            zy2.fa faVar = this.f187015a;
            java.util.Set W = faVar.W();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : W) {
                if (i17.contains(java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) obj).f65875xb5fc3ab6))) {
                    arrayList2.add(obj);
                }
            }
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                faVar.e(intValue, str2, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z0(intValue, hashSet2));
            }
        }
        java.util.HashSet hashSet3 = new java.util.HashSet();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it7 = hashSet2.iterator();
        while (it7.hasNext()) {
            java.lang.Object next = it7.next();
            if (hashSet3.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) next).f65880x11c19d58)) {
                arrayList3.add(next);
            }
        }
        java.util.Iterator it8 = arrayList3.iterator();
        while (it8.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) it8.next();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[clearOtherMsgCtrlInfo] clear this ");
            sb6.append(jbVar.f65880x11c19d58);
            sb6.append(" type=");
            sb6.append(jbVar.m55856xfb85f7b0());
            sb6.append("showInfo=");
            java.util.LinkedList<r45.f03> show_infos = jbVar.f65874xb5f7102a.f470022g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(show_infos, "show_infos");
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(show_infos, 10));
            for (r45.f03 f03Var : show_infos) {
                arrayList4.add(f03Var.f455425i + '#' + f03Var.f455420d + '#' + f03Var.f455421e);
            }
            sb6.append(arrayList4);
            sb6.append(' ');
            sb6.append(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, sb6.toString());
        }
        p(this, str2, arrayList, null, y8Var, null, 20, null);
    }
}
