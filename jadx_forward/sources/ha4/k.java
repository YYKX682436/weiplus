package ha4;

/* loaded from: classes4.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.ThreadLocal f361531a = new java.lang.ThreadLocal();

    public static boolean a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        boolean b17 = b(c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.e(c17933xe8d1b226));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        return b17;
    }

    public static boolean b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            return true;
        }
        r45.kj4 m70365xa8f45ee4 = c17933xe8d1b226.m70365xa8f45ee4();
        if (c17933xe8d1b226.m70373x5384133c() != 21) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            return true;
        }
        if (m70365xa8f45ee4.D == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            return true;
        }
        if (c01.z1.r().equals(c17933xe8d1b226.m70374x6bf53a6c())) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            return true;
        }
        r45.da6 da6Var = c19806x4c372b7.f38998xb2b52717;
        if (da6Var != null) {
            java.util.LinkedList linkedList = da6Var.f453808e;
            if (linkedList == null || linkedList.size() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
                return false;
            }
            java.lang.String r17 = c01.z1.r();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                if (r17.equals(((r45.b96) it.next()).f452172d)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
                    return true;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        return false;
    }

    public static boolean c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(str);
        boolean b17 = b(k17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.e(k17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        return b17;
    }

    public static int d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTotalCount", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTotalCount", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        int i17 = 0;
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTotalCount", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        } else {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 e17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.e(c17933xe8d1b226);
            if (e17 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTotalCount", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            } else {
                r45.da6 da6Var = e17.f38998xb2b52717;
                if (da6Var != null) {
                    java.util.LinkedList linkedList = da6Var.f453808e;
                    if (linkedList.size() != 0) {
                        i17 = linkedList.size();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTotalCount", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTotalCount", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTotalCount", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        return i17;
    }

    public static long e(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        long j17 = 0;
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            return 0L;
        }
        if (c19806x4c372b7 == null) {
            c19806x4c372b7 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.e(c17933xe8d1b226);
        }
        if (c19806x4c372b7 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            return 0L;
        }
        r45.da6 da6Var = c19806x4c372b7.f38998xb2b52717;
        if (da6Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            return 0L;
        }
        java.util.LinkedList<r45.b96> linkedList = da6Var.f453808e;
        if (linkedList == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            return 0L;
        }
        java.lang.String str = c17933xe8d1b226.f38322x2a5be89d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = kk.k.g(c17933xe8d1b226.f68882xad49e234) + kk.k.g(c17933xe8d1b226.f68881x4c58c87d);
        }
        java.lang.ThreadLocal threadLocal = f361531a;
        java.util.HashMap hashMap = (java.util.HashMap) threadLocal.get();
        if (hashMap != null && hashMap.containsKey(str)) {
            long longValue = ((java.lang.Long) hashMap.get(str)).longValue();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            return longValue;
        }
        for (r45.b96 b96Var : linkedList) {
            r45.vv3 vv3Var = new r45.vv3();
            try {
                vv3Var.mo11468x92b714fd(x51.j1.d(b96Var.f452174f));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicrMsg.SnsLuckyUtil", e17.getMessage() + "hbBuffer is error");
            }
            j17 += vv3Var.f470137d;
        }
        if (hashMap == null) {
            hashMap = new java.util.HashMap();
        }
        hashMap.put(str, java.lang.Long.valueOf(j17));
        threadLocal.set(hashMap);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        return j17;
    }
}
