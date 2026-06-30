package c01;

/* loaded from: classes11.dex */
public abstract class h2 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Comparator f118757a = new c01.f2();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f118758b = new java.util.ArrayList();

    public static int a(java.lang.String str, java.lang.String str2) {
        boolean z17;
        int i17 = 0;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0;
        }
        if ("notification_messages".equals(str) || "schedule_message".equals(str)) {
            return 8;
        }
        if (str2 != null && str2.endsWith("@chatroom")) {
            return 2;
        }
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        synchronized (f118758b) {
            int i18 = 0;
            z17 = false;
            while (true) {
                java.util.List list = f118758b;
                if (i18 < ((java.util.ArrayList) list).size()) {
                    c01.g2 g2Var = (c01.g2) ((java.util.ArrayList) list).get(i18);
                    if (g2Var != null && (z17 = ((aq1.j1) g2Var).a(str, str2, c19767x257d7f))) {
                        i17 = c19767x257d7f.f38864x6ac9171;
                        break;
                    }
                    i18++;
                } else {
                    break;
                }
            }
        }
        if (z17) {
            return i17;
        }
        return 1;
    }

    public static int b(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
            return c01.e2.I(str) ? 3 : 4;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.k4(str)) {
            return 5;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.C3(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.B3(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.j4(str)) {
            return 7;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.o4(str)) {
            return 9;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.y4(str)) {
            return 8;
        }
        if (c01.e2.G(str)) {
            return 6;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(str)) {
            return 10;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.W4(str)) {
            return 11;
        }
        return c01.e2.Q(str) ? 2 : 1;
    }

    public static int c(int i17) {
        int i18 = 0;
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ConversationLogic", "get total unread with black list, but has not set uin");
            return 0;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.util.Iterator it = f(i17).values().iterator();
        while (it.hasNext()) {
            i18 += ((com.p314xaae8f345.mm.p2621x8fb0427b.l4) it.next()).d1();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationLogic", "get count %d with black list use %d ms", java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        return i18;
    }

    public static int d(java.lang.String str, java.lang.String[] strArr) {
        boolean endsWith;
        boolean endsWith2;
        int i17 = 0;
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ConversationLogic", "get total unread, but has not set uin");
            return 0;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        Di.getClass();
        android.database.Cursor B = Di.f276650d.B("select unReadCount, parentRef from rconversation where username = '" + str + "' AND unReadCount > 0 ", null);
        if (B != null && B.getCount() > 0) {
            B.moveToFirst();
            boolean z17 = true;
            java.lang.String string = B.getString(1);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().getClass();
            int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("message_fold_config2").o("fold_button_status_int_sync", 65536);
            if (!(o17 == 262144 || o17 == 65536) ? !(string == null || string.isEmpty()) : !(string == null || string.isEmpty() || string.equalsIgnoreCase("message_fold"))) {
                java.util.Set set = c01.e2.f118650a;
                if (strArr != null) {
                    boolean z18 = false;
                    for (java.lang.String str2 : strArr) {
                        if ("@all.android".equals(str2)) {
                            z18 = true;
                        } else {
                            if ("@micromsg.qq.com".equals(str2)) {
                                endsWith2 = str.contains("@");
                            } else {
                                if ("@chatroom".equals(str2)) {
                                    endsWith = str.endsWith("@chatroom");
                                } else if ("@talkroom".equals(str2)) {
                                    endsWith = str.endsWith("@talkroom");
                                } else if ("@t.qq.com".equals(str2)) {
                                    endsWith = str.endsWith("@t.qq.com");
                                } else if ("@qqim".equals(str2)) {
                                    endsWith = str.endsWith("@qqim");
                                } else if ("@chatroom_exclusive".equals(str2)) {
                                    endsWith2 = str.endsWith("@chatroom");
                                } else if ("@app".equals(str2)) {
                                    endsWith = str.endsWith("@app");
                                } else if ("@openim".equals(str2)) {
                                    endsWith = str.endsWith("@openim");
                                } else if ("@im.chatroom".equals(str2)) {
                                    endsWith = str.endsWith("@im.chatroom");
                                } else if ("@kefu.openim".equalsIgnoreCase(str2)) {
                                    endsWith = str.endsWith("@kefu.openim");
                                } else if ("@weclaw".equals(str2)) {
                                    endsWith = str.endsWith("@weclaw");
                                }
                                z18 |= endsWith;
                            }
                            endsWith = !endsWith2;
                            z18 |= endsWith;
                        }
                    }
                    z17 = z18;
                }
                if (z17) {
                    i17 = B.getInt(0);
                }
            }
        }
        if (B != null) {
            B.close();
        }
        return i17;
    }

    public static java.util.Map e(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ConversationLogic", "get Total Unread Talker, but has not set uin");
            return hashMap;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT rcontact.* FROM rcontact,rconversation WHERE unReadCount > 0 AND ");
        sb6.append(Di.O());
        sb6.append(" AND rconversation.username = rcontact.username");
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(" ORDER BY flag DESC, conversationTime DESC ");
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationStorage", "get total unread contact with black list, sql is %s", sb7);
        android.database.Cursor B = Di.f276650d.B(sb7, null);
        if (B != null) {
            java.util.List g17 = g();
            while (B.moveToNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                z3Var.mo9015xbf5d97fd(B);
                if (!((java.util.ArrayList) g17).contains(z3Var.d1()) && !i(z3Var)) {
                    hashMap.put(z3Var.d1(), z3Var);
                }
            }
            B.close();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationLogic", "[getTotalUnreadTalker] cost %d ms  unread contact: %s, stack %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), hashMap.keySet(), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        return hashMap;
    }

    public static java.util.HashMap f(int i17) {
        java.lang.String str;
        android.database.Cursor B;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        Di.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationStorage", "getUnreadConversationCursor filterType[%d] [%s]", java.lang.Integer.valueOf(i17), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT rconversation.username, rconversation.unReadCount, rconversation.conversationTime from ");
        boolean a17 = com.p314xaae8f345.mm.p670x38b72420.d.f146388g.a();
        java.util.Set set = c01.e2.f118650a;
        if (a17) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder(128);
            sb8.append("rconversation inner join rcontact WHERE rconversation.username=rcontact.username");
            sb7.append(sb8.toString());
            sb7.append(" AND ");
            str = sb7.toString();
        } else {
            str = "rconversation WHERE ";
        }
        sb6.append(str);
        l75.e0 e0Var = pp.a.f438897e2;
        sb6.append("unReadCount > 0 AND (parentRef is null or parentRef = '' ) ");
        sb6.append(c01.e2.a(a17, i17));
        android.database.Cursor B2 = Di.f276650d.B(sb6.toString(), null);
        java.util.HashMap hashMap = new java.util.HashMap();
        if (B2 == null) {
            return hashMap;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        while (B2.moveToNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
            l4Var.mo9015xbf5d97fd(B2);
            hashSet.add(l4Var.h1());
            hashMap.put(l4Var.h1(), l4Var);
        }
        B2.close();
        java.util.List g17 = g();
        java.util.HashSet hashSet2 = new java.util.HashSet(g17);
        java.util.HashSet hashSet3 = new java.util.HashSet(hashSet);
        hashSet3.removeAll(g17);
        if (!hashSet3.isEmpty() && (B = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().B(new java.util.ArrayList(hashSet3))) != null) {
            while (B.moveToNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                z3Var.mo9015xbf5d97fd(B);
                if (i(z3Var)) {
                    hashSet2.add(z3Var.d1());
                }
            }
            B.close();
        }
        java.util.Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            hashMap.remove((java.lang.String) it.next());
        }
        java.util.Collection<com.p314xaae8f345.mm.p2621x8fb0427b.l4> values = hashMap.values();
        java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        if (values == null) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationLogic", "print2log conversations=null, cost=%d, stack=%s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), b17);
        } else {
            java.util.Comparator comparator = f118757a;
            java.util.PriorityQueue priorityQueue = new java.util.PriorityQueue(10, comparator);
            for (com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var2 : values) {
                if (priorityQueue.size() < 10) {
                    priorityQueue.offer(l4Var2);
                } else if (((c01.f2) comparator).compare((com.p314xaae8f345.mm.p2621x8fb0427b.l4) priorityQueue.peek(), l4Var2) < 0) {
                    priorityQueue.poll();
                    priorityQueue.offer(l4Var2);
                }
            }
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder(values.size() * 24);
            while (priorityQueue.size() > 0) {
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var3 = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) priorityQueue.poll();
                sb9.append(l4Var3.h1());
                sb9.append('(');
                sb9.append(l4Var3.d1());
                sb9.append("), ");
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(values.size());
            java.lang.String sb10 = sb9.toString();
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationLogic", "print2log totalSize=%d, conversations=%s; cost=%d, stack=%s", valueOf, sb10, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), b17);
        }
        return hashMap;
    }

    public static java.util.List g() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("floatbottle");
        if (!gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC, true)) {
            arrayList.add("notifymessage");
        }
        if (!gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WXA_CUSTOM_SESSION_MESSAGE_NOTICE_BOOLEAN_SYNC, true)) {
            arrayList.add("appbrandcustomerservicemsg");
        }
        arrayList.add("appbrand_notify_message");
        arrayList.add("BrandEcsTemplateMsg@fakeuser");
        arrayList.add("officialaccounts");
        arrayList.add("service_officialaccounts");
        arrayList.add("conversationboxservice");
        arrayList.add("message_fold");
        arrayList.add("qmessage");
        return arrayList;
    }

    public static boolean h(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        if (((java.util.ArrayList) g()).contains(str)) {
            return true;
        }
        return i(c01.e2.l(str));
    }

    public static boolean i(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        if (z3Var == null || ((int) z3Var.E2) == 0) {
            return false;
        }
        if (c01.e2.P(z3Var) && z3Var.B2()) {
            return true;
        }
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(z3Var.d1()) && z3Var.T == 0;
    }

    public static void j(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(str);
        if (p17 != null && (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p17.W0()) || "message_fold".equalsIgnoreCase(p17.W0()) || "conversationboxservice".equalsIgnoreCase(p17.W0()))) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().P(new java.lang.String[]{str}, "hidden_conv_parent");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c c6423x452b9f7c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c();
        c6423x452b9f7c.f137646e = 3800L;
        c6423x452b9f7c.r(str);
        c6423x452b9f7c.s(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
        c6423x452b9f7c.t(p17 == null ? "#conv_null" : p17.W0());
        c6423x452b9f7c.k();
    }
}
