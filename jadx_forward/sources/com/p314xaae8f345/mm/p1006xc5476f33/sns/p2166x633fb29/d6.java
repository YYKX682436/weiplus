package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class d6 implements com.p314xaae8f345.mm.p944x882e457a.u0, p94.n0 {

    /* renamed from: t, reason: collision with root package name */
    public static int f245679t = -1;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f245680d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f245681e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f245682f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f245683g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public int f245684h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f245685i = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f245686m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f245687n = new java.util.HashMap();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f245688o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f245689p = new java.util.HashMap();

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x6 f245690q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Set f245691r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Set f245692s;

    public d6() {
        new java.util.HashMap();
        this.f245690q = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x6();
        this.f245691r = new java.util.HashSet();
        this.f245692s = new java.util.HashSet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        r3.f38984xe83113e0.remove(r5);
        r3.f38982x6c24f798--;
        r1.f68881x4c58c87d = r3.mo14344x5f01b1f6();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.c(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6.a(java.lang.String):void");
    }

    public static void d(r45.k76 k76Var, zb4.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dealCommentContentData", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        int a17 = aVar != null ? aVar.a() : 0;
        k76Var.f460010z = a17;
        if (a17 == 1 && aVar.b() != null) {
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb b17 = aVar.b();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEmojiSize", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
            android.util.Size size = aVar.f552837b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEmojiSize", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
            r45.l86 l86Var = new r45.l86();
            l86Var.f460763d = b17.mo42933xb5885648();
            l86Var.f460765f = size.getWidth();
            l86Var.f460766g = size.getHeight();
            l86Var.f460767h = b17.mo42935xfb854877();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsService", "dealCommentData >> emojiMd5: %s, width: %d, height: %d size: %d", l86Var.f460763d, java.lang.Integer.valueOf(l86Var.f460765f), java.lang.Integer.valueOf(l86Var.f460766g), java.lang.Integer.valueOf(l86Var.f460767h));
            r45.cu5 cu5Var = new r45.cu5();
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r4 r4Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r4) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6.class));
            r4Var.getClass();
            byte[] mo14344x5f01b1f6 = r4Var.Ai(b17).mo14344x5f01b1f6();
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = mo14344x5f01b1f6 == null ? null : new com.p314xaae8f345.mm.p2495xc50a8b8b.g(mo14344x5f01b1f6, 0, mo14344x5f01b1f6.length);
            if (gVar != null) {
                cu5Var.d(gVar.f273689a);
                l86Var.f460764e = cu5Var;
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            k76Var.f460007w = linkedList;
            linkedList.add(l86Var);
            k76Var.f460008x = 1;
        } else if (k76Var.f460010z == 2) {
            r45.d86 d86Var = new r45.d86();
            d86Var.f453759d = aVar.c();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            k76Var.B = linkedList2;
            linkedList2.add(d86Var);
            k76Var.A = 1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealCommentContentData", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
    }

    public static int k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTimelineControlFlag", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        int i17 = f245679t;
        if (i17 != -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimelineControlFlag", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            return i17;
        }
        android.os.Vibrator vibrator = ca4.z0.f121601a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsFlag", "com.tencent.mm.plugin.sns.data.SnsUtil");
        int i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).getInt("sns_control_flag", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsFlag", "com.tencent.mm.plugin.sns.data.SnsUtil");
        f245679t = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsService", "getTimelineControlFlag %d", java.lang.Integer.valueOf(i18));
        int i19 = f245679t;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimelineControlFlag", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        return i19;
    }

    public static void l(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 v1Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sendBlessMsg", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        r45.k76 k76Var = new r45.k76();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        k76Var.f459997m = (int) (java.lang.System.currentTimeMillis() / 1000);
        k76Var.f459993f = c01.z1.l();
        k76Var.f459991d = c01.z1.r();
        k76Var.f459996i = 0;
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        k76Var.f459994g = c01.a2.e(str);
        k76Var.f459992e = str;
        k76Var.f459995h = 22;
        k76Var.f459999o = (int) v1Var.f67458x3aefdbd0;
        r45.k76 k76Var2 = new r45.k76();
        k76Var2.f459991d = "";
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("")) {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str2 = k76Var2.f459991d;
            ((sg3.a) v0Var).getClass();
            k76Var2.f459993f = c01.a2.e(str2);
        }
        r45.l76 l76Var = new r45.l76();
        l76Var.f460736d = v1Var.f67469x29d1290e;
        l76Var.f460738f = k76Var;
        l76Var.f460739g = k76Var2;
        java.lang.String g17 = kk.k.g(("" + android.os.SystemClock.elapsedRealtime()).getBytes());
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().a(g17, l76Var, 0)) {
            gm0.j1.i();
            gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n2(l76Var, g17, 0));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsService", "can not add bless Comment");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendBlessMsg", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
    }

    public static r45.e86 m(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, java.lang.String str, long j17, java.lang.String str2, boolean z17, int i18) {
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sendComment", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        r45.k76 k76Var = new r45.k76();
        k76Var.f459998n = str;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        k76Var.f459997m = (int) (java.lang.System.currentTimeMillis() / 1000);
        k76Var.f459993f = c01.z1.l();
        k76Var.f459991d = c01.z1.r();
        k76Var.f459996i = i18;
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String m70374x6bf53a6c = c17933xe8d1b226.m70374x6bf53a6c();
        ((sg3.a) v0Var).getClass();
        k76Var.f459994g = c01.a2.e(m70374x6bf53a6c);
        k76Var.f459992e = c17933xe8d1b226.m70374x6bf53a6c();
        k76Var.f459995h = i17;
        if (c17933xe8d1b226.m70414xa57c8812(32)) {
            k76Var.f460002r = j17;
        } else {
            k76Var.f459999o = (int) j17;
        }
        r45.k76 k76Var2 = new r45.k76();
        k76Var2.f459991d = str2;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str4 = k76Var2.f459991d;
            ((sg3.a) v0Var2).getClass();
            k76Var2.f459993f = c01.a2.e(str4);
        }
        r45.l76 l76Var = new r45.l76();
        l76Var.f460736d = c17933xe8d1b226.f68891x29d1292e;
        l76Var.f460738f = k76Var;
        l76Var.f460739g = k76Var2;
        if (c17933xe8d1b226.m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70346x10413e67 = c17933xe8d1b226.m70346x10413e67();
            java.lang.String str5 = m70346x10413e67 == null ? "" : m70346x10413e67.f38105xcf532ea0;
            str3 = m70346x10413e67 == null ? "" : m70346x10413e67.f38104xce64ddf1;
            int i19 = k76Var.f459995h;
            if (i19 == 7) {
                ((p34.p) ((p94.f0) i95.n0.c(p94.f0.class))).Bi(11855, c17933xe8d1b226.m70350x13c652ad(), 1, str5, java.lang.Integer.valueOf(c17933xe8d1b226.m70350x13c652ad()));
            } else if (i19 == 8) {
                ((p34.p) ((p94.f0) i95.n0.c(p94.f0.class))).Bi(11855, c17933xe8d1b226.m70350x13c652ad(), 2, str5, java.lang.Integer.valueOf(c17933xe8d1b226.m70350x13c652ad()));
            }
        } else {
            str3 = "";
        }
        java.lang.String g17 = kk.k.g(("" + android.os.SystemClock.elapsedRealtime()).getBytes());
        if (c17933xe8d1b226.m70414xa57c8812(32)) {
            g17 = "_AD_TAG_" + g17;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().b(g17, l76Var, str3, i18)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsService", "can not add Comment");
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i4.n(g17)) {
            gm0.j1.i();
            gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i2(l76Var, g17, str3, 0));
        } else {
            gm0.j1.i();
            gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n2(l76Var, g17, i18));
        }
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendComment", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            return null;
        }
        r45.e86 e86Var = new r45.e86();
        e86Var.f454664i = k76Var.f459997m;
        e86Var.f454662g = k76Var.f459995h;
        e86Var.f454661f = k76Var.f459996i;
        e86Var.f454659d = k76Var.f459991d;
        e86Var.f454660e = k76Var.f459993f;
        e86Var.f454663h = k76Var.f459998n;
        e86Var.f454672t = k76Var.f460005u;
        if (c17933xe8d1b226.m70414xa57c8812(32)) {
            e86Var.f454669q = j17;
        } else {
            e86Var.f454666n = (int) j17;
        }
        e86Var.f454667o = str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendComment", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        return e86Var;
    }

    public static r45.e86 n(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, zb4.a aVar, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sendComment", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sendComment", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        r45.e86 o17 = o(c17933xe8d1b226, i17, aVar, null, false, 0, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendComment", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendComment", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        return o17;
    }

    public static r45.e86 o(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, zb4.a aVar, r45.e86 e86Var, boolean z17, int i18, int i19) {
        long j17;
        java.lang.String str;
        int i27;
        r45.e86 e86Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70346x10413e67;
        int i28;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sendComment", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        r45.k76 k76Var = new r45.k76();
        k76Var.f459998n = aVar != null ? aVar.d() : "";
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        k76Var.f459997m = (int) (java.lang.System.currentTimeMillis() / 1000);
        k76Var.f459993f = c01.z1.l();
        k76Var.f459991d = c01.z1.r();
        k76Var.f459996i = 0;
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String m70374x6bf53a6c = c17933xe8d1b226.m70374x6bf53a6c();
        ((sg3.a) v0Var).getClass();
        k76Var.f459994g = c01.a2.e(m70374x6bf53a6c);
        k76Var.f459992e = c17933xe8d1b226.m70374x6bf53a6c();
        k76Var.f459995h = i17;
        k76Var.f460005u = i18;
        if (c17933xe8d1b226.m70414xa57c8812(32)) {
            k76Var.f460002r = e86Var == null ? 0L : e86Var.f454670r;
        } else {
            k76Var.f459999o = e86Var == null ? 0 : e86Var.f454665m;
        }
        d(k76Var, aVar);
        r45.k76 k76Var2 = new r45.k76();
        java.lang.String str2 = e86Var == null ? "" : e86Var.f454659d;
        k76Var2.f459991d = str2;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str3 = k76Var2.f459991d;
            ((sg3.a) v0Var2).getClass();
            k76Var2.f459993f = c01.a2.e(str3);
        }
        r45.l76 l76Var = new r45.l76();
        l76Var.f460736d = c17933xe8d1b226.f68891x29d1292e;
        l76Var.f460738f = k76Var;
        l76Var.f460739g = k76Var2;
        if (c17933xe8d1b226.m70377x3172ed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsService", "sendComment, sourceScene=" + i19 + ", type=" + i17 + ", flag=" + i18);
            if (i19 == 2) {
                m70346x10413e67 = c17933xe8d1b226.m70356x450e1efa();
                i28 = 1;
            } else {
                m70346x10413e67 = c17933xe8d1b226.m70346x10413e67();
                i28 = 0;
            }
            java.lang.String str4 = m70346x10413e67 == null ? "" : m70346x10413e67.f38105xcf532ea0;
            str = m70346x10413e67 == null ? "" : m70346x10413e67.f38104xce64ddf1;
            int i29 = k76Var.f459995h;
            if (i29 == 7) {
                ((p34.p) ((p94.f0) i95.n0.c(p94.f0.class))).Bi(11855, c17933xe8d1b226.m70350x13c652ad(), 1, str4, java.lang.Integer.valueOf(c17933xe8d1b226.m70350x13c652ad()));
            } else if (i29 == 8) {
                ((p34.p) ((p94.f0) i95.n0.c(p94.f0.class))).Bi(11855, c17933xe8d1b226.m70350x13c652ad(), 2, str4, java.lang.Integer.valueOf(c17933xe8d1b226.m70350x13c652ad()));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 m70351xaa22b9ed = c17933xe8d1b226.m70351xaa22b9ed();
            if (m70351xaa22b9ed != null) {
                if (m70351xaa22b9ed.f67601x912e119f == 0) {
                    m70351xaa22b9ed.f67601x912e119f = k76Var.f459997m;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().b1(m70351xaa22b9ed.f67610x29d1292e, m70351xaa22b9ed);
                }
                r45.o3 m70308xe0bbc4b6 = m70351xaa22b9ed.m70308xe0bbc4b6();
                if (i19 == 2) {
                    if (m70308xe0bbc4b6 != null) {
                        r45.k76 k76Var3 = l76Var.f460738f;
                        r45.mo5 mo5Var = m70308xe0bbc4b6.f463395e;
                        k76Var3.f460006v = mo5Var;
                        if (mo5Var != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsService", "atFriend remindInfo aid64 %d, aid %d", java.lang.Long.valueOf(mo5Var.f462251i), java.lang.Integer.valueOf(m70308xe0bbc4b6.f463395e.f462246d));
                            r45.mo5 mo5Var2 = m70308xe0bbc4b6.f463395e;
                            if (mo5Var2.f462251i == 0 && mo5Var2.f462246d == 0) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(nd1.j0.f72943x366c91de, 9);
                            }
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(nd1.j0.f72943x366c91de, 7);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsService", "remindInfo is null!");
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsService", "remindInfo group is null!");
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(nd1.j0.f72943x366c91de, 5);
                    }
                } else if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.t2.i(i18, 8)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsService", "sendAtFriend");
                    if (m70308xe0bbc4b6 != null) {
                        r45.mo5 mo5Var3 = m70308xe0bbc4b6.f463394d;
                        if (mo5Var3 != null) {
                            l76Var.f460738f.f460006v = mo5Var3;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsService", "timeline remindInfo aid64 %d, aid %d", java.lang.Long.valueOf(mo5Var3.f462251i), java.lang.Integer.valueOf(m70308xe0bbc4b6.f463394d.f462246d));
                            r45.mo5 mo5Var4 = m70308xe0bbc4b6.f463394d;
                            if (mo5Var4.f462251i == 0 && mo5Var4.f462246d == 0) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(nd1.j0.f72943x366c91de, 8);
                            }
                        } else {
                            r45.mo5 mo5Var5 = m70308xe0bbc4b6.f463395e;
                            if (mo5Var5 != null) {
                                l76Var.f460738f.f460006v = mo5Var5;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsService", "atFriend remindInfo aid64 %d, aid %d", java.lang.Long.valueOf(mo5Var5.f462251i), java.lang.Integer.valueOf(m70308xe0bbc4b6.f463395e.f462246d));
                                r45.mo5 mo5Var6 = m70308xe0bbc4b6.f463395e;
                                j17 = 0;
                                if (mo5Var6.f462251i == 0 && mo5Var6.f462246d == 0) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(nd1.j0.f72943x366c91de, 8);
                                }
                            } else {
                                j17 = 0;
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(nd1.j0.f72943x366c91de, 6);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsService", "remindInfo is null!");
                            }
                        }
                    } else {
                        j17 = 0;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsService", "remindInfo group is null!");
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(nd1.j0.f72943x366c91de, 5);
                    }
                    i27 = i28;
                }
            }
            j17 = 0;
            i27 = i28;
        } else {
            j17 = 0;
            str = "";
            i27 = 0;
        }
        java.lang.String g17 = kk.k.g(("" + android.os.SystemClock.elapsedRealtime()).getBytes());
        if (c17933xe8d1b226.m70414xa57c8812(32)) {
            g17 = "_AD_TAG_" + g17;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().a(g17, l76Var, i19)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsService", "can not add Comment");
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i4.n(g17)) {
            gm0.j1.i();
            gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i2(l76Var, g17, str, i27));
        } else {
            gm0.j1.i();
            gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n2(l76Var, g17, i19));
        }
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendComment", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            return null;
        }
        r45.e86 e86Var3 = new r45.e86();
        e86Var3.f454664i = k76Var.f459997m;
        e86Var3.f454662g = k76Var.f459995h;
        e86Var3.f454661f = k76Var.f459996i;
        e86Var3.f454659d = k76Var.f459991d;
        e86Var3.f454660e = k76Var.f459993f;
        e86Var3.f454663h = k76Var.f459998n;
        e86Var3.f454672t = k76Var.f460005u;
        e86Var3.f454677y = k76Var.f460010z;
        e86Var3.f454673u = k76Var.f460007w;
        e86Var3.f454674v = k76Var.f460008x;
        e86Var3.A = k76Var.B;
        e86Var3.f454678z = k76Var.A;
        if (c17933xe8d1b226.m70414xa57c8812(32)) {
            e86Var2 = e86Var;
            e86Var3.f454669q = e86Var2 == null ? j17 : e86Var2.f454670r;
        } else {
            e86Var2 = e86Var;
            e86Var3.f454666n = e86Var2 == null ? 0 : e86Var2.f454665m;
        }
        e86Var3.f454667o = e86Var2 != null ? e86Var2.f454659d : "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendComment", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        return e86Var3;
    }

    public static void p(java.lang.String str, int i17, zb4.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sendCommentToStranger", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        if (i17 != 3 && i17 != 5) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendCommentToStranger", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            return;
        }
        r45.k76 k76Var = new r45.k76();
        k76Var.f459998n = aVar == null ? "" : aVar.d();
        k76Var.f459997m = (int) (java.lang.System.currentTimeMillis() / 1000);
        k76Var.f459993f = c01.z1.l();
        k76Var.f459991d = c01.z1.r();
        k76Var.f459996i = i18;
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        k76Var.f459994g = c01.a2.e(str);
        k76Var.f459992e = str;
        k76Var.f459995h = i17;
        d(k76Var, aVar);
        r45.l76 l76Var = new r45.l76();
        l76Var.f460736d = c17933xe8d1b226.f68891x29d1292e;
        l76Var.f460738f = k76Var;
        l76Var.f460739g = new r45.k76();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(android.os.SystemClock.elapsedRealtime());
        java.lang.String g17 = kk.k.g(sb6.toString().getBytes());
        long j17 = c17933xe8d1b226.f68891x29d1292e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("insertCommentStg", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 v1Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1();
            v1Var.f67471x114ef53e = str;
            v1Var.f67469x29d1290e = j17;
            v1Var.f67460xac3be4e = (int) (java.lang.System.currentTimeMillis() / 1000);
            v1Var.f67461x5e5c2922 = k76Var.mo14344x5f01b1f6();
            v1Var.f67472x2262335f = i17;
            v1Var.f67464xff7bdab7 = true;
            v1Var.f67462xff7b64c5 = (short) 1;
            v1Var.f67466xa9a2f4d7 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.t2.g(k76Var, null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().mo880xb970c2b9(v1Var);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsService", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertCommentStg", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().a(g17, l76Var, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendCommentToStranger", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
    }

    public static r45.e86 q(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, zb4.a aVar, r45.e86 e86Var, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sendCommentWithFlag", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        r45.e86 r17 = r(c17933xe8d1b226, i17, aVar, e86Var, false, i18, i19);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendCommentWithFlag", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        return r17;
    }

    public static r45.e86 r(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, zb4.a aVar, r45.e86 e86Var, boolean z17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sendCommentWithFlag", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        r45.e86 o17 = o(c17933xe8d1b226, i17, aVar, e86Var, z17, i18, i19);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendCommentWithFlag", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        return o17;
    }

    public void b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cleanGalleryItem", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        ((java.util.HashMap) this.f245689p).remove(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanGalleryItem", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
    }

    public boolean c(p94.m0 m0Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("closeServer", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        ((java.util.HashMap) this.f245687n).remove(m0Var);
        if ((i17 == 2 || i17 == 10 || i17 == 11) && this.f245688o.size() > 0) {
            this.f245688o.removeLast();
        }
        if (((java.util.HashMap) this.f245687n).isEmpty()) {
            gm0.j1.i();
            gm0.j1.n().f354821b.q(211, this);
            gm0.j1.i();
            gm0.j1.n().f354821b.q(212, this);
            gm0.j1.i();
            gm0.j1.n().f354821b.q(5203, this);
            ((java.util.HashSet) this.f245691r).clear();
            java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.f245725a;
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.class) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("release", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
                ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.f245725a).clear();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("release", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226.m70337x41012807();
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x5(this), 5000L);
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f246209d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cleanCacheObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            java.util.Map map2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f246211f;
            if (map2 != null) {
                ((java.util.concurrent.ConcurrentHashMap) map2).clear();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanCacheObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsService", "close finish");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("closeServer", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        return true;
    }

    public void e(int i17, java.lang.String str, boolean z17, boolean z18, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doFpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        if (x51.o1.f533585f) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doFpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            return;
        }
        boolean m47 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.SnsService", "doFpList type: %s, objectId: %s", java.lang.Integer.valueOf(i17), str);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6100x9682acd8 c6100x9682acd8 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6100x9682acd8();
        c6100x9682acd8.f136377g.f87726a = 1;
        c6100x9682acd8.e();
        if (i17 == 2) {
            if (m47) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Uj().mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z5(this, str, z18, i18, i17));
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Uj().mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y5(this, str, z18, i18, i17));
            }
        } else if (i17 == 1) {
            if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h3.H("@__weixintimtline")) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doFpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Mj().getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Mj().f246274c = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().h2(0L, 1, true);
            gm0.j1.i();
            gm0.j1.u().c().w(68377, "");
            gm0.j1.i();
            gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h3(0L, 0L, 0));
        } else if (i17 != 3) {
            if (i17 == 4) {
                if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m2.H("@__classify_timeline")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doFpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    return;
                } else {
                    gm0.j1.i();
                    gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m2(0L, ""));
                }
            } else if (i17 == 10) {
                if (m47) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Uj().mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b6(this, str, z18, i18, i17));
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Uj().mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.a6(this, str, z18, i18, i17));
                }
            } else if (i17 == 11) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Uj().mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c6(this, str, z18, i18, i17));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doFpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
    }

    public boolean f(int i17, java.lang.String str, boolean z17, boolean z18, int i18) {
        long longValue;
        long longValue2;
        long longValue3;
        long longValue4;
        long longValue5;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        if (x51.o1.f533585f) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            return false;
        }
        synchronized (this.f245680d) {
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.SnsService", "DO NP\u3000NP ~_~ %s type %s timeLastId: %s userLastIds: %s", str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(this.f245685i), this.f245680d);
            } finally {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            }
        }
        boolean m47 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str);
        if (i17 == 2) {
            if (m47) {
                if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q3.H(str)) {
                    ((java.util.HashSet) this.f245692s).add(str);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    return false;
                }
                synchronized (this.f245680d) {
                    try {
                        longValue4 = ((java.util.HashMap) this.f245680d).containsKey(str) ? ((java.lang.Long) ((java.util.HashMap) this.f245680d).get(str)).longValue() : 0L;
                    } finally {
                    }
                }
                if (longValue4 == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q3.M(str);
                    ((java.util.HashSet) this.f245692s).add(str);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    return false;
                }
                gm0.j1.i();
                gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q3(str, longValue4, z18, i18, -1, 0, z18 ? 4 : 8, i17));
            } else {
                if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n3.H(str)) {
                    ((java.util.HashSet) this.f245692s).add(str);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    return false;
                }
                synchronized (this.f245680d) {
                    try {
                        longValue5 = ((java.util.HashMap) this.f245680d).containsKey(str) ? ((java.lang.Long) ((java.util.HashMap) this.f245680d).get(str)).longValue() : 0L;
                    } finally {
                    }
                }
                if (longValue5 == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n3.L(str);
                    ((java.util.HashSet) this.f245692s).add(str);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    return false;
                }
                gm0.j1.i();
                gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n3(str, longValue5, z18, i18, -1, 0, z18 ? 4 : 8, i17));
            }
        } else if (i17 == 1) {
            if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h3.H("@__weixintimtline")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Improve.DataFlow", "addTimeLineReq error");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                return false;
            }
            if (this.f245685i == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h3.L("@__weixintimtline");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Improve.DataFlow", "load more but timeLastId = 0");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                return false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Mj().getClass();
            gm0.j1.i();
            gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h3(this.f245685i, 0L, 0));
        } else if (i17 != 3) {
            if (i17 == 4) {
                if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m2.H("@__classify_timeline")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    return false;
                }
                if (this.f245685i == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m2.I("@__classify_timeline");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    return false;
                }
                gm0.j1.i();
                gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m2(0L, ""));
            } else if (i17 == 10) {
                if (m47) {
                    if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q3.H(str)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                        return false;
                    }
                    synchronized (this.f245682f) {
                        try {
                            longValue2 = ((java.util.HashMap) this.f245682f).containsKey(str) ? ((java.lang.Long) ((java.util.HashMap) this.f245682f).get(str)).longValue() : 0L;
                        } finally {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                        }
                    }
                    if (longValue2 == 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q3.M(str);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                        return false;
                    }
                    gm0.j1.i();
                    gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q3(str, longValue2, z18, i18, -1, 1, 64, i17));
                } else {
                    if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n3.H(str)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                        return false;
                    }
                    synchronized (this.f245682f) {
                        try {
                            longValue3 = ((java.util.HashMap) this.f245682f).containsKey(str) ? ((java.lang.Long) ((java.util.HashMap) this.f245682f).get(str)).longValue() : 0L;
                        } finally {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                        }
                    }
                    if (longValue3 == 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n3.L(str);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                        return false;
                    }
                    gm0.j1.i();
                    gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n3(str, longValue3, z18, i18, -1, 1, 64, i17));
                }
            } else if (i17 == 11) {
                if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n3.H(str)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    return false;
                }
                synchronized (this.f245682f) {
                    try {
                        longValue = ((java.util.HashMap) this.f245682f).containsKey(str) ? ((java.lang.Long) ((java.util.HashMap) this.f245682f).get(str)).longValue() : 0L;
                    } finally {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    }
                }
                if (longValue == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n3.L(str);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    return false;
                }
                gm0.j1.i();
                gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n3(str, longValue, z18, i18, -1, 2, 64, i17));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        return true;
    }

    public void g(int i17, java.lang.String str, int i18, boolean z17, long j17, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doOtherList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsService", "doOtherList fetchType:%s, type:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        if (i17 == 2) {
            if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n3.H(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doOtherList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                return;
            }
            if (i18 == 0) {
                this.f245690q.a(str, z17, i19, j17, i17);
            } else if (i18 == 1) {
                this.f245690q.b(str, z17, i19, j17, i17);
            } else if (i18 == 2) {
                this.f245690q.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doDownFetch", "com.tencent.mm.plugin.sns.model.SnsUpDownServerHelper");
                gm0.j1.i();
                gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n3(str, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f246207b, z17, i19, 2, 0, z17 ? 4 : 8, 2));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDownFetch", "com.tencent.mm.plugin.sns.model.SnsUpDownServerHelper");
            }
        } else if (i17 == 1) {
            if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h3.H("@__weixintimtline")) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doOtherList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Mj().getClass();
            if (i18 == 0) {
                this.f245690q.a(str, z17, i19, j17, i17);
            } else if (i18 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Mj().getClass();
                this.f245690q.b(str, z17, i19, this.f245686m, i17);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doOtherList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
    }

    public android.content.Intent h(android.content.Intent intent, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getIntent", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        intent.putExtra("sns_userName", str);
        java.util.LinkedList linkedList = this.f245688o;
        if (linkedList == null || !linkedList.contains(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getIntent", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            return intent;
        }
        intent.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
        intent.addFlags(67108864);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getIntent", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        return intent;
    }

    public int i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRespCount", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        int i17 = this.f245684h;
        if (i17 <= 0) {
            i17 = ca4.z0.P();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRespCount", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        return i17;
    }

    public int j(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRespCount", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        synchronized (this.f245681e) {
            try {
                if (!((java.util.HashMap) this.f245681e).containsKey(str)) {
                    int P = ca4.z0.P();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRespCount", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    return P;
                }
                int intValue = ((java.lang.Integer) ((java.util.HashMap) this.f245681e).get(str)).intValue();
                if (intValue <= 0) {
                    intValue = ca4.z0.P();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRespCount", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                return intValue;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRespCount", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                throw th6;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016c  */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r31, int r32, java.lang.String r33, com.p314xaae8f345.mm.p944x882e457a.m1 r34) {
        /*
            Method dump skipped, instructions count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    public void s(java.lang.String str, java.util.ArrayList arrayList) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGalleryItem", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        ((java.util.HashMap) this.f245689p).put(str, arrayList);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGalleryItem", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
    }

    public void t(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTimeFirstId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.SnsService", "setTimeFirstId %d", java.lang.Long.valueOf(j17));
        if (j17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTimeFirstId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        } else {
            this.f245686m = j17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTimeFirstId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        }
    }

    public void u(long j17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTimeLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.SnsService", "setTimeLastId %d", java.lang.Long.valueOf(j17));
        if (i17 > 0) {
            this.f245684h = i17;
            android.os.Vibrator vibrator = ca4.z0.f121601a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("putSnsResponeCount", "com.tencent.mm.plugin.sns.data.SnsUtil");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).edit().putInt("sns_respone_count", i17).commit();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("putSnsResponeCount", "com.tencent.mm.plugin.sns.data.SnsUtil");
        }
        if (j17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTimeLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        } else {
            this.f245685i = j17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTimeLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        }
    }

    public void v(java.lang.String str, long j17, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUserLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        if (i18 == 10 || i18 == 11) {
            if (i17 > 0) {
                synchronized (this.f245683g) {
                    try {
                        ((java.util.HashMap) this.f245683g).put(str, java.lang.Integer.valueOf(i17));
                    } finally {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUserLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    }
                }
            }
            if (j17 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUserLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                return;
            }
            synchronized (this.f245682f) {
                try {
                    ((java.util.HashMap) this.f245682f).put(str, java.lang.Long.valueOf(j17));
                } finally {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUserLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                }
            }
        } else {
            if (i17 > 0) {
                synchronized (this.f245681e) {
                    try {
                        ((java.util.HashMap) this.f245681e).put(str, java.lang.Integer.valueOf(i17));
                    } finally {
                    }
                }
            }
            if (j17 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUserLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                return;
            }
            synchronized (this.f245680d) {
                try {
                    ((java.util.HashMap) this.f245680d).put(str, java.lang.Long.valueOf(j17));
                } finally {
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUserLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
    }

    public void w(int i17, java.lang.String str, p94.m0 m0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startServer", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsService", "startServer " + i17 + " " + m0Var);
        boolean m47 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i4 xj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj();
        java.lang.String r17 = c01.z1.r();
        xj6.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSelfName", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        xj6.f245833c = r17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSelfName", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().g();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().d();
        if (!m47 && !((java.util.HashSet) this.f245691r).contains(211) && !((java.util.HashSet) this.f245691r).contains(212)) {
            gm0.j1.i();
            gm0.j1.n().f354821b.a(211, this);
            gm0.j1.i();
            gm0.j1.n().f354821b.a(212, this);
            ((java.util.HashSet) this.f245691r).add(211);
            ((java.util.HashSet) this.f245691r).add(212);
        } else if (m47 && !((java.util.HashSet) this.f245691r).contains(5203)) {
            gm0.j1.i();
            gm0.j1.n().f354821b.a(5203, this);
            ((java.util.HashSet) this.f245691r).add(5203);
        }
        if (!((java.util.HashMap) this.f245687n).containsKey(m0Var)) {
            if (i17 == 1) {
                ((java.util.HashMap) this.f245687n).put(m0Var, "@__weixintimtline");
            } else if (i17 == 2 || i17 == 3 || i17 == 10 || i17 == 11) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                for (p94.m0 m0Var2 : ((java.util.HashMap) this.f245687n).keySet()) {
                    if (str.equals((java.lang.String) ((java.util.HashMap) this.f245687n).get(m0Var2))) {
                        linkedList.add(m0Var2);
                    }
                }
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    ((java.util.HashMap) this.f245687n).remove((p94.m0) it.next());
                }
                ((java.util.HashMap) this.f245687n).put(m0Var, str);
            } else if (i17 == 4) {
                ((java.util.HashMap) this.f245687n).put(m0Var, "@__classify_timeline");
            } else if (i17 == 5) {
                ((java.util.HashMap) this.f245687n).put(m0Var, "");
            } else {
                ((java.util.HashMap) this.f245687n).put(m0Var, "");
            }
        }
        if (i17 == 1) {
            this.f245685i = 0L;
            this.f245684h = i();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h3.L("@__weixintimtline");
        } else if (i17 == 2) {
            synchronized (this.f245680d) {
                try {
                    ((java.util.HashMap) this.f245680d).put(str, 0L);
                } finally {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startServer", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                }
            }
            synchronized (this.f245681e) {
                try {
                    if (!((java.util.HashMap) this.f245681e).containsKey(str)) {
                        ((java.util.HashMap) this.f245681e).put(str, java.lang.Integer.valueOf(i()));
                    }
                } finally {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startServer", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                }
            }
            if (m47) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q3.M(str);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n3.L(str);
            }
            this.f245688o.add(str);
        } else if (i17 == 10 || i17 == 11) {
            synchronized (this.f245682f) {
                try {
                    ((java.util.HashMap) this.f245682f).put(str, 0L);
                } finally {
                }
            }
            synchronized (this.f245683g) {
                try {
                    if (!((java.util.HashMap) this.f245683g).containsKey(str)) {
                        ((java.util.HashMap) this.f245683g).put(str, java.lang.Integer.valueOf(i()));
                    }
                } finally {
                }
            }
            if (m47) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q3.M(str);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n3.L(str);
            }
            this.f245688o.add(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startServer", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
    }
}
