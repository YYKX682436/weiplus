package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public abstract class s5 {

    /* renamed from: a, reason: collision with root package name */
    public static long f246206a;

    /* renamed from: b, reason: collision with root package name */
    public static long f246207b;

    /* renamed from: c, reason: collision with root package name */
    public static long f246208c;

    /* renamed from: d, reason: collision with root package name */
    public static int f246209d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f246210e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f246211f;

    static {
        new java.util.TreeMap(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q5());
        f246206a = 0L;
        f246207b = 0L;
        f246208c = 0L;
        f246209d = 0;
        f246210e = 86400L;
        f246211f = new java.util.concurrent.ConcurrentHashMap();
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkLocalDeletedComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        if (c17933xe8d1b226 != null) {
            try {
                if (c17933xe8d1b226.f68881x4c58c87d != null) {
                    java.lang.String r17 = c01.z1.r();
                    long e17 = c01.id.e();
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b72 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7().mo11468x92b714fd(c17933xe8d1b226.f68881x4c58c87d);
                    if (c19806x4c372b72 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(c19806x4c372b72.f38963x20c46e68) && c19806x4c372b7 != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        if (c19806x4c372b7.f38963x20c46e68 == null) {
                            c19806x4c372b7.f38963x20c46e68 = new java.util.LinkedList<>();
                        }
                        java.util.Iterator<r45.e86> it = c19806x4c372b7.f38963x20c46e68.iterator();
                        while (it.hasNext()) {
                            arrayList.add(java.lang.Integer.valueOf(it.next().f454665m));
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.Iterator<r45.e86> it6 = c19806x4c372b72.f38963x20c46e68.iterator();
                        while (it6.hasNext()) {
                            r45.e86 next = it6.next();
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(next.f454659d, r17) && next.f454671s > 0) {
                                if (e17 - next.f454664i > f246210e) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorageLogic", "it's time to delete local comment deleted tip:[%s,%s]", java.lang.Integer.valueOf(next.f454665m), next.f454659d);
                                } else if (!arrayList.contains(java.lang.Integer.valueOf(next.f454665m))) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorageLogic", "insert a local fake comment deleted tip:[%s,%s]", java.lang.Integer.valueOf(next.f454665m), next.f454659d);
                                    arrayList2.add(next);
                                }
                            }
                        }
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList2)) {
                            c19806x4c372b7.f38963x20c46e68.addAll(arrayList2);
                        }
                        java.util.Collections.sort(c19806x4c372b7.f38963x20c46e68, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r5());
                    }
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsInfoStorageLogic", e18, "", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLocalDeletedComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
    }

    public static com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 b(r45.l86 l86Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createSnsEmojiInfo", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
        if (l86Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSnsEmojiInfo", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return c21053xdbf1e5f4;
        }
        if (l86Var.f460764e == null) {
            c21053xdbf1e5f4.f68671x4b6e68b9 = l86Var.f460763d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSnsEmojiInfo", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return c21053xdbf1e5f4;
        }
        try {
            r45.ri0 ri0Var = new r45.ri0();
            ri0Var.mo11468x92b714fd(l86Var.f460764e.f453374f.f273689a);
            n22.m.a(ri0Var, c21053xdbf1e5f4);
            c21053xdbf1e5f4.f68685x2261e7f9 = 1;
            c21053xdbf1e5f4.f68653x95b20dd4 = 65;
        } catch (java.lang.Exception unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSnsEmojiInfo", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        return c21053xdbf1e5f4;
    }

    public static r45.jj4 c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Xj()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return null;
        }
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return null;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
        r45.a90 a90Var = m70371x485d7.f39014x86965dde;
        if (a90Var == null || a90Var.f451373h.size() == 0 || m70371x485d7.f39014x86965dde.f451373h.size() <= i17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return null;
        }
        r45.jj4 jj4Var = (r45.jj4) m70371x485d7.f39014x86965dde.f451373h.get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        return jj4Var;
    }

    public static r45.jj4 d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
        r45.a90 a90Var = m70371x485d7.f39014x86965dde;
        if (a90Var == null || a90Var.f451373h.size() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return null;
        }
        java.util.Iterator it = m70371x485d7.f39014x86965dde.f451373h.iterator();
        while (it.hasNext()) {
            r45.jj4 jj4Var = (r45.jj4) it.next();
            if (jj4Var.f459388d.equals(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                return jj4Var;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        return null;
    }

    public static com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 e(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMergeSnsObject", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        try {
            if (c17933xe8d1b226.f38322x2a5be89d == null) {
                c17933xe8d1b226.f38322x2a5be89d = kk.k.g(c17933xe8d1b226.f68882xad49e234) + kk.k.g(c17933xe8d1b226.f68881x4c58c87d);
            }
            java.util.Map map = f246211f;
            if (((java.util.concurrent.ConcurrentHashMap) map).containsKey(c17933xe8d1b226.f38322x2a5be89d)) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) ((java.util.concurrent.ConcurrentHashMap) map).get(c17933xe8d1b226.f38322x2a5be89d);
                if (c19806x4c372b7 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().s(c19806x4c372b7);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMergeSnsObject", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                    return c19806x4c372b7;
                }
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b72 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7().mo11468x92b714fd(c17933xe8d1b226.f68881x4c58c87d);
            ((java.util.concurrent.ConcurrentHashMap) map).put(c17933xe8d1b226.f38322x2a5be89d, c19806x4c372b72);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().s(c19806x4c372b72);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMergeSnsObject", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return c19806x4c372b72;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsInfoStorageLogic", "SnsObject parseFrom error");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsInfoStorageLogic", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b73 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMergeSnsObject", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return c19806x4c372b73;
        }
    }

    public static com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 f(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMergeSnsObjectWithCache", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        try {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 s17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().s((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7().mo11468x92b714fd(c17933xe8d1b226.f68881x4c58c87d));
            if (s17.Id == 0) {
                long j17 = c17933xe8d1b226.f68891x29d1292e;
                if (j17 != 0) {
                    s17.Id = j17;
                }
            }
            ((java.util.concurrent.ConcurrentHashMap) f246211f).clear();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMergeSnsObjectWithCache", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return s17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsInfoStorageLogic", "SnsObject parseFrom error");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsInfoStorageLogic", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMergeSnsObjectWithCache", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return c19806x4c372b7;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        r3.close();
        r3 = 1;
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r2.contains(r4) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r4 = r6 + r3;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTagName", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0018, code lost:
    
        if (r3.moveToFirst() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x001a, code lost:
    
        r4 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2();
        r4.mo9015xbf5d97fd(r3);
        r4 = r4.f69154x183bff00;
        r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r4 != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0028, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        r2.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
    
        if (r3.moveToNext() != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String g(java.lang.String r6) {
        /*
            java.lang.String r0 = "getTagName"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            com.tencent.mm.plugin.sns.storage.r2 r3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Lj()
            android.database.Cursor r3 = r3.J0()
            boolean r4 = r3.moveToFirst()
            if (r4 == 0) goto L33
        L1a:
            com.tencent.mm.plugin.sns.storage.q2 r4 = new com.tencent.mm.plugin.sns.storage.q2
            r4.<init>()
            r4.mo9015xbf5d97fd(r3)
            java.lang.String r4 = r4.f69154x183bff00
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            if (r4 != 0) goto L2a
            java.lang.String r4 = ""
        L2a:
            r2.add(r4)
            boolean r4 = r3.moveToNext()
            if (r4 != 0) goto L1a
        L33:
            r3.close()
            r3 = 1
            r4 = r6
        L38:
            boolean r5 = r2.contains(r4)
            if (r5 == 0) goto L51
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            int r5 = r3 + 1
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            r3 = r5
            goto L38
        L51:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.g(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(java.lang.String r17, int r18, java.util.LinkedList r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.h(java.lang.String, int, java.util.LinkedList, java.lang.String):void");
    }

    public static boolean i(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isLocalPrivated", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLocalPrivated", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return false;
        }
        boolean z18 = i17 > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLocalPrivated", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        return z18;
    }

    public static boolean j(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isWsFold", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        boolean z17 = (i17 & 16) > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWsFold", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        return z17;
    }

    public static java.lang.String k(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("listToString", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        java.util.Iterator it = list.iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            if (str.length() == 0) {
                str = str2;
            } else {
                str = str + "," + str2;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("listToString", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        return str;
    }

    public static r45.cu5 l(r45.cu5 cu5Var, byte[] bArr) {
        r45.cu5 cu5Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("mergeOperation", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        if (bArr != null) {
            try {
                cu5Var2 = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7().mo11468x92b714fd(bArr)).f38991x89eed8ab;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsInfoStorageLogic", e17, "", new java.lang.Object[0]);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("mergeOperation", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                return null;
            }
        } else {
            cu5Var2 = null;
        }
        if (cu5Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("mergeOperation", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return cu5Var2;
        }
        r45.u96 u96Var = new r45.u96();
        if (cu5Var2 != null) {
            u96Var = (r45.u96) u96Var.mo11468x92b714fd(cu5Var2.f453374f.f273689a);
        }
        r45.u96 u96Var2 = (r45.u96) new r45.u96().mo11468x92b714fd(cu5Var.f453374f.f273689a);
        if (u96Var2.f468695h == null) {
            u96Var2.f468695h = u96Var.f468695h;
        }
        r45.ad0 ad0Var = u96Var.f468694g;
        if (ad0Var == null) {
            u96Var2.f468694g = null;
        } else if (u96Var2.f468694g == null) {
            u96Var2.f468694g = ad0Var;
        }
        byte[] mo14344x5f01b1f6 = u96Var2.mo14344x5f01b1f6();
        r45.cu5 cu5Var3 = new r45.cu5();
        cu5Var3.d(mo14344x5f01b1f6);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("mergeOperation", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        return cu5Var3;
    }

    public static void m(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b72;
        r45.kb5 kb5Var;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("mergePreloadInfo", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            if (c17933xe8d1b226.m70373x5384133c() == 15 && (c19806x4c372b72 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7().mo11468x92b714fd(c17933xe8d1b226.f68881x4c58c87d)) != null && (kb5Var = c19806x4c372b72.f38993xee7ff79) != null && (i17 = kb5Var.f460108d) > 0) {
                c19806x4c372b7.f38993xee7ff79 = kb5Var;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorageLogic", "mergePreloadInfo predownload info [%d %d %s] cost[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(c19806x4c372b7.f38993xee7ff79.f460109e), c19806x4c372b7.f38993xee7ff79.f460110f, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsInfoStorageLogic", "mergePreloadInfo error %s", e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("mergePreloadInfo", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
    }

    public static void n(long j17, r45.l76 l76Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        r45.k76 k76Var = l76Var.f460738f;
        if (k76Var.f459995h != 9) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(j17);
        if (W0 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return;
        }
        try {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7().mo11468x92b714fd(W0.f68881x4c58c87d);
            c19806x4c372b7.Id = j17;
            java.util.Iterator<r45.e86> it = c19806x4c372b7.f38963x20c46e68.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r45.e86 next = it.next();
                if (next.f454665m == k76Var.f460000p && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(next.f454659d) && next.f454659d.equals(k76Var.f459991d)) {
                    c19806x4c372b7.f38963x20c46e68.remove(next);
                    break;
                }
            }
            W0.m70440x8904a400(c19806x4c372b7.mo14344x5f01b1f6());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().Y2(c19806x4c372b7.Id, W0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsInfoStorageLogic", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
    }

    public static long o(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7, java.lang.String str, int i17) {
        boolean z17;
        boolean z18;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replace", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        if (c17933xe8d1b226 == null) {
            c17933xe8d1b226 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
        }
        byte[] bArr = c17933xe8d1b226.f68882xad49e234;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i4 xj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj();
        long j17 = c17933xe8d1b226.f68891x29d1292e;
        synchronized (xj6) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkNotDel", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            java.util.Iterator it = xj6.f245831a.f525781h.iterator();
            while (true) {
                z17 = false;
                if (!it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkNotDel", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                    z18 = true;
                    break;
                }
                if (((wa4.o) it.next()).f525803d == j17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkNotDel", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                    z18 = false;
                    break;
                }
            }
        }
        if (!z18) {
            long j18 = c19806x4c372b7.Id;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replace", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return j18;
        }
        if (c19806x4c372b7.f38989xeab5cf1 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorageLogic", "hit the filter id:" + c19806x4c372b7.Id + "  " + ca4.z0.t0(c19806x4c372b7.Id));
            if (!c17933xe8d1b226.m70414xa57c8812(i17)) {
                c17933xe8d1b226.m70338xbeec15a8(i17);
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().Y2(c19806x4c372b7.Id, c17933xe8d1b226);
            }
            long j19 = c19806x4c372b7.Id;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replace", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return j19;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorageLogic", "hasChange id:%s listSize %s Stringid %s", ca4.z0.t0(c19806x4c372b7.Id), java.lang.Integer.valueOf(c19806x4c372b7.f38963x20c46e68.size()), ca4.z0.t0(c19806x4c372b7.Id));
        r45.cu5 cu5Var = c19806x4c372b7.f38990xb6613a90;
        if (cu5Var == null || (gVar = cu5Var.f453374f) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorageLogic", "object desc is null");
            long j27 = c19806x4c372b7.Id;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replace", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return j27;
        }
        java.lang.String str2 = new java.lang.String(gVar.g());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            long j28 = c19806x4c372b7.Id;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replace", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return j28;
        }
        if (!c17933xe8d1b226.m70441xe9f5bdb7(str2)) {
            long j29 = c19806x4c372b7.Id;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replace", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return j29;
        }
        c19806x4c372b7.f38991x89eed8ab = l(c19806x4c372b7.f38991x89eed8ab, c17933xe8d1b226.f68881x4c58c87d);
        c19806x4c372b7.f38990xb6613a90.d(new byte[0]);
        c17933xe8d1b226.m70468x66ad9b78(c19806x4c372b7.f38999xf403ecf6);
        c17933xe8d1b226.m70443x6e018feb(c19806x4c372b7.f38965xc86e6609);
        c17933xe8d1b226.m70448xb8471e25(c19806x4c372b7.f38983x458ee3c3);
        c17933xe8d1b226.m70462x53b40971(c19806x4c372b7.Id);
        c17933xe8d1b226.m70463x5078d04c(c19806x4c372b7.Id);
        c17933xe8d1b226.f68890x658b81e5 = c19806x4c372b7.f38967x15579d0d;
        c17933xe8d1b226.m70338xbeec15a8(i17);
        try {
            if (!c17933xe8d1b226.m70377x3172ed()) {
                a(c17933xe8d1b226, c19806x4c372b7);
            }
            m(c17933xe8d1b226, c19806x4c372b7);
            c17933xe8d1b226.m70440x8904a400(c19806x4c372b7.mo14344x5f01b1f6());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsInfoStorageLogic", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
        m70371x485d7.f39018xf3f56116 = c19806x4c372b7.f38999xf403ecf6;
        int i18 = m70371x485d7.f39017xbebdef61;
        c17933xe8d1b226.m70460x23d307c3(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorageLogic", "ext flag %s  extflag %s", java.lang.Long.valueOf(c19806x4c372b7.Id), java.lang.Integer.valueOf(c19806x4c372b7.f38967x15579d0d));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkClearOldVideo", "com.tencent.mm.plugin.sns.ui.improve.func.SnsMultiSpecVideoHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsMultiVideoNeedClearOldVideoConfig", "com.tencent.mm.plugin.sns.ui.improve.config.SnsVideoConfig");
        pc4.d dVar = pc4.d.f434943a;
        r45.ga6 p17 = dVar.p();
        boolean z19 = p17 != null && p17.f456594w == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsMultiVideoNeedClearOldVideoConfig", "com.tencent.mm.plugin.sns.ui.improve.config.SnsVideoConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsMultiVideoNeedClearOldLivePhotoVideoConfig", "com.tencent.mm.plugin.sns.ui.improve.config.SnsVideoConfig");
        r45.ga6 p18 = dVar.p();
        boolean z27 = p18 != null && p18.f456597z == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsMultiVideoNeedClearOldLivePhotoVideoConfig", "com.tencent.mm.plugin.sns.ui.improve.config.SnsVideoConfig");
        if (z19 || z27) {
            ((ku5.t0) ku5.t0.f394148d).h(new sc4.b(bArr, m70371x485d7, z19, z27), "sns_multi_video_clear");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkClearOldVideo", "com.tencent.mm.plugin.sns.ui.improve.func.SnsMultiSpecVideoHelper");
        int i19 = c19806x4c372b7.f38967x15579d0d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isBIDIRFRIEND", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        boolean z28 = (i19 & 1) > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isBIDIRFRIEND", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        if (z28) {
            c17933xe8d1b226.m70445x635d8e6b();
        } else {
            c17933xe8d1b226.m70473x58a4cde4();
        }
        if (c19806x4c372b7.f39002x36ea9d02 != 0) {
            c17933xe8d1b226.m70470xd989cf82();
        } else {
            c17933xe8d1b226.m70343xacb0922d();
        }
        if (j(c19806x4c372b7.f38967x15579d0d)) {
            c17933xe8d1b226.m70338xbeec15a8(128);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.s2 y07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Qj().y0(c19806x4c372b7.Id);
            if (y07 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(y07.f69423x99016a0b)) {
                r45.qb6 qb6Var = new r45.qb6();
                try {
                    qb6Var.mo11468x92b714fd(y07.f69423x99016a0b);
                    z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(qb6Var.f465343d);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsInfoStorageLogic", "parse SnsWsGroupStruct fail:%s", e18.getMessage());
                }
            }
            if (y07 == null || !z17) {
                c17933xe8d1b226.m70341xbcb87932();
            } else {
                c17933xe8d1b226.m70471x5a9a740b();
            }
        } else {
            c17933xe8d1b226.m70341xbcb87932();
        }
        if (i18 == 1 && i17 != 4 && i17 != 16 && i17 != 64) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsInfoStorageLogic", "svr error push me the private pic in timelnie or others");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replace", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return 0L;
        }
        if (i18 == 1 || (!str.equals(c19806x4c372b7.f38999xf403ecf6) && i17 == 4)) {
            c17933xe8d1b226.m70451x2f244d1a();
        }
        c17933xe8d1b226.m70466xfabce6e3(m70371x485d7);
        c17933xe8d1b226.m70467x4e3c7448(m70371x485d7.f39014x86965dde.f451370e);
        c17933xe8d1b226.m70465x963f7264(m70371x485d7.f39014x86965dde.f451374i);
        if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().Y2(c19806x4c372b7.Id, c17933xe8d1b226)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsInfoStorageLogic", "");
        }
        if (j62.e.g().c(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2157xaf3f8342.C17833x135cc83e()) == 1) {
            java.util.Iterator<r45.e86> it6 = c19806x4c372b7.f38963x20c46e68.iterator();
            while (it6.hasNext()) {
                java.util.Iterator it7 = it6.next().f454673u.iterator();
                while (it7.hasNext()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 b17 = b((r45.l86) it7.next());
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(b17.f68671x4b6e68b9) == null) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().mo880xb970c2b9(b17);
                        zq.h.f556505a.e(b17, null);
                    }
                }
            }
        }
        long j37 = c19806x4c372b7.Id;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replace", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        return j37;
    }

    public static long p(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replace", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        long q17 = q(c19806x4c372b7, "", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replace", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        return q17;
    }

    public static long q(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replace", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(c19806x4c372b7.Id);
        if (W0 == null) {
            W0 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
        }
        long o17 = o(W0, c19806x4c372b7, str, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replace", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        return o17;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean r(int r17) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.r(int):boolean");
    }

    public static void s(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unsetOmitResendFlag", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().i1(i17);
        if (i18 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unsetOmitResendFlag", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return;
        }
        i18.m70475x9dfe85a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().w3(i17, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unsetOmitResendFlag", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
    }

    public static boolean t(long j17, r45.l76 l76Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updataComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        r45.k76 k76Var = l76Var.f460738f;
        int i17 = k76Var.f459995h;
        if (i17 != 1 && i17 != 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updataComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(j17);
        if (W0 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updataComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return true;
        }
        if (W0.m70373x5384133c() == 21 && !ha4.h.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorageLogic", "passed because close lucky");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updataComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return false;
        }
        try {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7().mo11468x92b714fd(W0.f68881x4c58c87d);
            c19806x4c372b7.Id = j17;
            int i18 = k76Var.f459995h;
            if (i18 == 1) {
                java.util.Iterator<r45.e86> it = c19806x4c372b7.f38984xe83113e0.iterator();
                while (it.hasNext()) {
                    r45.e86 next = it.next();
                    if (next.f454664i == k76Var.f459997m && next.f454659d.equals(k76Var.f459991d)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updataComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                        return true;
                    }
                }
                c19806x4c372b7.f38984xe83113e0.add(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i4.l(l76Var));
            } else if (i18 == 2) {
                java.util.Iterator<r45.e86> it6 = c19806x4c372b7.f38963x20c46e68.iterator();
                while (it6.hasNext()) {
                    r45.e86 next2 = it6.next();
                    if (next2.f454664i == k76Var.f459997m && next2.f454659d.equals(k76Var.f459991d)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updataComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                        return true;
                    }
                }
                c19806x4c372b7.f38963x20c46e68.add(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i4.l(l76Var));
            }
            W0.m70440x8904a400(c19806x4c372b7.mo14344x5f01b1f6());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().Y2(c19806x4c372b7.Id, W0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsInfoStorageLogic", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updataComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        return true;
    }

    public static void u(long j17, r45.l76 l76Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updataHbAction", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        r45.k76 k76Var = l76Var.f460738f;
        if (k76Var.f459995h != 13) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updataHbAction", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(j17);
        if (W0 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updataHbAction", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return;
        }
        try {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7().mo11468x92b714fd(W0.f68881x4c58c87d);
            c19806x4c372b7.Id = j17;
            if (c19806x4c372b7.f38998xb2b52717 == null) {
                c19806x4c372b7.f38998xb2b52717 = new r45.da6();
            }
            if (k76Var.f459995h == 13) {
                java.util.Iterator it = c19806x4c372b7.f38998xb2b52717.f453808e.iterator();
                while (it.hasNext()) {
                    if (((r45.b96) it.next()).f452172d.equals(k76Var.f459991d)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updataHbAction", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                        return;
                    }
                }
                r45.b96 b96Var = new r45.b96();
                b96Var.f452174f = k76Var.f460004t;
                b96Var.f452173e = k76Var.f459997m;
                b96Var.f452172d = k76Var.f459991d;
                c19806x4c372b7.f38998xb2b52717.f453808e.add(b96Var);
                r45.da6 da6Var = c19806x4c372b7.f38998xb2b52717;
                da6Var.f453807d = da6Var.f453808e.size();
            }
            W0.m70440x8904a400(c19806x4c372b7.mo14344x5f01b1f6());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().Y2(c19806x4c372b7.Id, W0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsInfoStorageLogic", "error for update hbaction " + e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsInfoStorageLogic", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updataHbAction", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
    }

    public static void v(java.util.LinkedList linkedList, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateSnsSearchIndicator", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        if (i17 == 0) {
            f246206a = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) linkedList.getFirst()).Id;
            f246207b = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) linkedList.getLast()).Id;
        } else if (i17 == 1) {
            f246206a = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) linkedList.getFirst()).Id;
        } else if (i17 == 2) {
            f246207b = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) linkedList.getLast()).Id;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateSnsSearchIndicator", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
    }
}
