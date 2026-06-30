package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class n3 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, p94.d0 {
    public static final java.util.Vector E = new java.util.Vector();
    public final int A;
    public final int B;
    public int C;
    public final int D;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f246025d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f246026e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f246027f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f246028g;

    /* renamed from: h, reason: collision with root package name */
    public final long f246029h;

    /* renamed from: i, reason: collision with root package name */
    public long f246030i;

    /* renamed from: m, reason: collision with root package name */
    public long f246031m;

    /* renamed from: n, reason: collision with root package name */
    public int f246032n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f246033o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f246034p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f246035q;

    /* renamed from: r, reason: collision with root package name */
    public long f246036r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f246037s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f246038t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f246039u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f246040v;

    /* renamed from: w, reason: collision with root package name */
    public final int f246041w;

    /* renamed from: x, reason: collision with root package name */
    public int f246042x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f246043y;

    /* renamed from: z, reason: collision with root package name */
    public long f246044z;

    public n3(java.lang.String str, long j17, boolean z17, int i17, int i18, int i19, int i27, int i28) {
        this(str, j17, z17, i17, i18, i19, i27, i28, 1);
    }

    public static synchronized boolean H(java.lang.String str) {
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n3.class) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addSnsUserReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
            java.util.Vector vector = E;
            if (vector.contains(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSnsUserReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
                return false;
            }
            vector.add(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSnsUserReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
            return true;
        }
    }

    public static synchronized boolean L(java.lang.String str) {
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n3.class) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeUserReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
            E.remove(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeUserReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        }
        return true;
    }

    @Override // p94.d0
    public int A() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPullType", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPullType", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return -1;
    }

    @Override // p94.d0
    public boolean C() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFp", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFp", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return this.f246027f;
    }

    @Override // p94.d0
    public long D() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUserLastId", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        long j17 = this.f246031m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUserLastId", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return j17;
    }

    @Override // p94.d0
    public boolean E() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isUpAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        boolean z17 = this.f246038t;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUpAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return z17;
    }

    public final void I(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkLocalData", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        int y27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().y2(11, this.f246026e, this.f246028g);
        if (y27 <= 10 && y27 > 0 && i17 == 0 && i18 == 0) {
            this.f246039u = true;
        } else if (y27 == 0) {
            this.f246037s = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLocalData", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
    }

    public final void J(r45.eb6 eb6Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("insertListAndUpdateFaultInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        java.util.LinkedList linkedList = eb6Var.f454774f;
        java.lang.String str2 = this.f246026e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.h(str2, this.f246041w, linkedList, str);
        long j17 = this.f246030i;
        java.util.LinkedList linkedList2 = eb6Var.f454774f;
        if (j17 == 0) {
            this.f246030i = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) linkedList2.getFirst()).Id;
        } else {
            this.f246030i = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f1.a(j17);
        }
        this.f246031m = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) linkedList2.getLast()).Id;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsUserPage", "insertListAndUpdateFaultInfo userName %s maxId %s minId %s NewRequestTime %s", str2, ca4.z0.t0(this.f246030i), ca4.z0.t0(this.f246031m), java.lang.Integer.valueOf(eb6Var.f454777i));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f1.d(this.f246026e, this.f246030i, this.f246031m, eb6Var.f454777i);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertListAndUpdateFaultInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
    }

    public final boolean K() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAlbumSelf", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        boolean z17 = this.f246041w == 64;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAlbumSelf", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return z17;
    }

    @Override // p94.d0
    public boolean d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isOtherFetch", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        boolean z17 = true;
        int i17 = this.A;
        if (i17 != 0 && i17 != 2 && i17 != 1) {
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOtherFetch", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public final int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        this.f246043y = u0Var;
        int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f246025d, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return mo9409x10f9447a;
    }

    @Override // p94.d0
    public long f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRecentLimitID", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        long j17 = this.f246044z;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRecentLimitID", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return j17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return 212;
    }

    @Override // p94.d0
    /* renamed from: getUserName */
    public java.lang.String mo70032x6bf53a6c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUserName", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUserName", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return this.f246026e;
    }

    @Override // p94.d0
    public boolean h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDownAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        boolean z17 = this.f246037s;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDownAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return z17;
    }

    @Override // p94.d0
    public boolean i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isNeedGetNextPage", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        boolean z17 = this.f246039u;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isNeedGetNextPage", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return z17;
    }

    @Override // p94.d0
    public int k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("respCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        int i17 = this.C;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("respCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return i17;
    }

    @Override // p94.d0
    public java.lang.String m() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRecentTips", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        java.lang.String str = this.f246035q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRecentTips", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return str;
    }

    @Override // p94.d0
    public boolean o() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isBgChange", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        boolean z17 = this.f246033o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isBgChange", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:215:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0886  */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo804x5f9cdc6f(int r28, int r29, int r30, java.lang.String r31, com.p314xaae8f345.mm.p971x6de15a2e.v0 r32, byte[] r33) {
        /*
            Method dump skipped, instructions count: 2292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n3.mo804x5f9cdc6f(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // p94.d0
    public boolean q() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPrivacy", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        boolean z17 = this.f246040v;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPrivacy", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return z17;
    }

    @Override // p94.d0
    public long r() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMaxLimitID", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        long j17 = this.f246030i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMaxLimitID", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return j17;
    }

    @Override // p94.d0
    public int y() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFetchMode", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFetchMode", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        return this.A;
    }

    public n3(java.lang.String str, long j17, boolean z17, int i17, int i18, int i19, int i27, int i28, int i29) {
        this.f246029h = 0L;
        this.f246031m = 0L;
        this.f246032n = 0;
        this.f246033o = false;
        this.f246034p = "";
        this.f246035q = "";
        this.f246036r = 0L;
        this.f246037s = false;
        this.f246038t = false;
        this.f246039u = false;
        this.f246040v = false;
        this.f246042x = 0;
        this.A = -1;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.D = i29;
        this.f246026e = str;
        this.f246030i = j17;
        this.f246028g = z17;
        this.A = i18;
        if (j17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsUserPage", "fp userName " + str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsUserPage", "np userName " + str);
        }
        this.f246041w = i27;
        this.B = i28;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.db6();
        lVar.f152198b = new r45.eb6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmsnsuserpage";
        lVar.f152200d = 212;
        lVar.f152201e = 99;
        lVar.f152202f = 1000000099;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsUserPage", "filterType:%d sourceType:%d serverType:%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28));
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f246025d = a17;
        r45.db6 db6Var = (r45.db6) a17.f152243a.f152217a;
        db6Var.f453819e = str;
        db6Var.f453820f = j17;
        db6Var.f453824m = i19;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getBoolean("ShowWithTaEntrance_" + str, false)) {
            db6Var.f453828q = 1;
        }
        boolean z18 = j17 == 0;
        this.f246027f = z18;
        if (i18 != 1 && i18 != 2 && i18 != 0) {
            int j18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Kj().j(str);
            long F2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().F2(z18 ? 0L : j17, j18, str, z17);
            this.f246031m = F2;
            db6Var.f453822h = F2;
            int c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f1.c(F2, j17, str);
            db6Var.f453823i = c17;
            db6Var.f453821g = i17;
            if (z18) {
                if (K()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2 Ej = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ej();
                    Ej.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAlbumMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                    java.lang.String str2 = Ej.J0(str).f67937x79146e34;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAlbumMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                    this.f246034p = str2;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2 Ej2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ej();
                    Ej2.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                    java.lang.String str3 = Ej2.J0(str).f67951x4b6e68b9;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                    this.f246034p = str3;
                }
                if (this.f246034p == null) {
                    this.f246034p = "";
                }
                db6Var.f453818d = this.f246034p;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsUserPage", "nextCount: " + j18 + " maxId:" + ca4.z0.t0(j17) + " minId:" + ca4.z0.t0(this.f246031m) + " lastReqTime:" + c17 + " snsSource:" + i17 + " FirstPageMd5:" + this.f246034p);
        } else {
            db6Var.f453822h = 0L;
            db6Var.f453821g = i17;
            if (i18 == 1) {
                db6Var.f453825n = 1;
            }
            this.f246041w = 16;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsUserPage", "maxId:%s, minId:%s, snsSource:%s, pullType:%s", ca4.z0.t0(j17), ca4.z0.t0(this.f246031m), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(db6Var.f453825n));
        }
        this.f246029h = j17;
    }
}
