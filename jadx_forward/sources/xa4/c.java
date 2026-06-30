package xa4;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final xa4.c f534355a = new xa4.c();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f534356b = new java.util.HashMap();

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, boolean z17) {
        int i18;
        int i19;
        int i27;
        r45.fd6 fd6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("feedExpose", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("feedExpose", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
            return;
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("feedExpose", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
            return;
        }
        if (!xa4.g.f534363d.y(c17933xe8d1b226.m70371x485d7())) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("feedExpose", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
            return;
        }
        java.lang.String c17 = c(c17933xe8d1b226, i17);
        java.util.HashMap hashMap = f534356b;
        if (!hashMap.containsKey(c17)) {
            hashMap.put(c17, new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6905xa73db7df());
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6905xa73db7df c6905xa73db7df = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6905xa73db7df) hashMap.get(c17);
        if (c6905xa73db7df == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("feedExpose", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
        if (m70371x485d7 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("feedExpose", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
            return;
        }
        c6905xa73db7df.f142231d = c6905xa73db7df.b("feedID", ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e), true);
        c6905xa73db7df.f142232e = c6905xa73db7df.b("publishUin", c17933xe8d1b226.m70374x6bf53a6c(), true);
        c6905xa73db7df.f142234g = xa4.g.w(m70371x485d7, c17933xe8d1b226.m70377x3172ed(), z17) ? 1 : 0;
        java.lang.String str = m70371x485d7.f39013x4c306a8a;
        int i28 = 0;
        c6905xa73db7df.f142235h = str != null ? str.length() : 0;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 e17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.e(c17933xe8d1b226);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calculateMyCommentCount", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
        java.lang.String sj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.sj();
        java.util.LinkedList<r45.e86> linkedList = e17.f38963x20c46e68;
        if (linkedList != null) {
            i18 = 0;
            i19 = 0;
            for (r45.e86 e86Var : linkedList) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(e86Var.f454659d, sj6)) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e86Var.f454667o)) {
                        i18++;
                    } else {
                        i19++;
                    }
                }
            }
        } else {
            i18 = 0;
            i19 = 0;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i19);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calculateMyCommentCount", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
        int intValue = valueOf.intValue();
        c6905xa73db7df.f142238k = valueOf2.intValue() + intValue;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calculateMyLikeCount", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
        java.lang.String sj7 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.sj();
        java.util.LinkedList<r45.e86> linkedList2 = e17.f38984xe83113e0;
        if (linkedList2 == null || linkedList2.isEmpty()) {
            i27 = 0;
        } else {
            java.util.Iterator<T> it = linkedList2.iterator();
            i27 = 0;
            while (it.hasNext()) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.e86) it.next()).f454659d, sj7) && (i27 = i27 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calculateMyLikeCount", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
        c6905xa73db7df.f142239l = i27;
        c6905xa73db7df.f142237j = intValue;
        java.util.LinkedList<r45.e86> linkedList3 = e17.f38963x20c46e68;
        c6905xa73db7df.f142243p = linkedList3 != null ? linkedList3.size() : 0;
        java.util.LinkedList<r45.e86> linkedList4 = e17.f38963x20c46e68;
        c6905xa73db7df.f142236i = linkedList4 != null ? linkedList4.size() : 0;
        java.util.LinkedList<r45.e86> linkedList5 = e17.f38984xe83113e0;
        c6905xa73db7df.f142244q = linkedList5 != null ? linkedList5.size() : 0;
        r45.a90 a90Var = m70371x485d7.f39014x86965dde;
        if (a90Var != null && (fd6Var = a90Var.B) != null) {
            i28 = fd6Var.f455777e;
        }
        c6905xa73db7df.f142245r = i28;
        c6905xa73db7df.f142241n++;
        c6905xa73db7df.f142240m = i17;
        if (c17933xe8d1b226.m70377x3172ed()) {
            c6905xa73db7df.f142246s = c6905xa73db7df.b("aid", c17933xe8d1b226.m70355xb5882a06(), true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("feedExpose", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("feedSpringTailClick", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("feedSpringTailClick", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
            return;
        }
        java.lang.String c17 = c(c17933xe8d1b226, i17);
        java.util.HashMap hashMap = f534356b;
        if (!hashMap.containsKey(c17)) {
            hashMap.put(c17, new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6905xa73db7df());
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6905xa73db7df c6905xa73db7df = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6905xa73db7df) hashMap.get(c17);
        if (c6905xa73db7df == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("feedSpringTailClick", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
        } else {
            c6905xa73db7df.f142242o++;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("feedSpringTailClick", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
        }
    }

    public final java.lang.String c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeUniqueKey", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
        java.lang.String str = c17933xe8d1b226.m70363x51f8f990() + '-' + i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeUniqueKey", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
        return str;
    }
}
