package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class q3 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, p94.d0 {
    public static final java.util.Vector D = new java.util.Vector();
    public final int A;
    public int B;
    public final int C;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f246129d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f246130e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f246131f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f246132g;

    /* renamed from: h, reason: collision with root package name */
    public final long f246133h;

    /* renamed from: i, reason: collision with root package name */
    public long f246134i;

    /* renamed from: m, reason: collision with root package name */
    public long f246135m;

    /* renamed from: n, reason: collision with root package name */
    public int f246136n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f246137o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f246138p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f246139q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f246140r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f246141s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f246142t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f246143u;

    /* renamed from: v, reason: collision with root package name */
    public final int f246144v;

    /* renamed from: w, reason: collision with root package name */
    public int f246145w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f246146x;

    /* renamed from: y, reason: collision with root package name */
    public long f246147y;

    /* renamed from: z, reason: collision with root package name */
    public final int f246148z;

    public q3(java.lang.String str, long j17, boolean z17, int i17, int i18, int i19, int i27, int i28) {
        this(str, j17, z17, i17, i18, i19, i27, i28, 1);
    }

    public static synchronized boolean H(java.lang.String str) {
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q3.class) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addSnsWwUserReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
            java.util.Vector vector = D;
            if (vector.contains(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSnsWwUserReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
                return false;
            }
            vector.add(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSnsWwUserReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
            return true;
        }
    }

    public static synchronized boolean M(java.lang.String str) {
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q3.class) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeWwUserReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
            D.remove(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeWwUserReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        }
        return true;
    }

    @Override // p94.d0
    public int A() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPullType", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPullType", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return -1;
    }

    @Override // p94.d0
    public boolean C() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFp", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFp", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return this.f246131f;
    }

    @Override // p94.d0
    public long D() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUserLastId", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        long j17 = this.f246135m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUserLastId", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return j17;
    }

    @Override // p94.d0
    public boolean E() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isUpAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        boolean z17 = this.f246141s;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUpAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return z17;
    }

    public final void I(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkLocalData", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        int y27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().y2(11, this.f246130e, this.f246132g);
        if (y27 <= 10 && y27 > 0 && i17 == 0 && i18 == 0) {
            this.f246142t = true;
        } else if (y27 == 0 || (y27 <= 10 && i18 == 207)) {
            this.f246140r = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLocalData", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
    }

    public final void J(r45.wb6 wb6Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doFetchByContinueID", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Uj().mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p3(this, wb6Var));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doFetchByContinueID", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
    }

    public final void K(r45.xb6 xb6Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("insertListAndUpdateFaultInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        java.util.LinkedList linkedList = xb6Var.f471483f;
        java.lang.String str2 = this.f246130e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.h(str2, this.f246144v, linkedList, str);
        long j17 = this.f246134i;
        java.util.LinkedList linkedList2 = xb6Var.f471483f;
        if (j17 == 0) {
            this.f246134i = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) linkedList2.getFirst()).Id;
        } else {
            this.f246134i = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f1.a(j17);
        }
        this.f246135m = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) linkedList2.getLast()).Id;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsWwUserPage", "insertListAndUpdateFaultInfo userName %s maxId %s minId %s NewRequestTime %s", str2, java.lang.Long.valueOf(this.f246134i), java.lang.Long.valueOf(this.f246135m), java.lang.Integer.valueOf(xb6Var.f471486i));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f1.d(this.f246130e, this.f246134i, this.f246135m, xb6Var.f471486i);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertListAndUpdateFaultInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
    }

    public final boolean L() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAlbumSelf", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        boolean z17 = this.f246144v == 64;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAlbumSelf", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return z17;
    }

    @Override // p94.d0
    public boolean d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isOtherFetch", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        boolean z17 = true;
        int i17 = this.f246148z;
        if (i17 != 0 && i17 != 2 && i17 != 1) {
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOtherFetch", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public final int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        this.f246146x = u0Var;
        int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f246129d, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return mo9409x10f9447a;
    }

    @Override // p94.d0
    public long f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRecentLimitID", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        long j17 = this.f246147y;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRecentLimitID", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return j17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return 5203;
    }

    @Override // p94.d0
    /* renamed from: getUserName */
    public java.lang.String mo70032x6bf53a6c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUserName", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUserName", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return this.f246130e;
    }

    @Override // p94.d0
    public boolean h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDownAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        boolean z17 = this.f246140r;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDownAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return z17;
    }

    @Override // p94.d0
    public boolean i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isNeedGetNextPage", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        boolean z17 = this.f246142t;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isNeedGetNextPage", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return z17;
    }

    @Override // p94.d0
    public int k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("respCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        int i17 = this.B;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("respCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return i17;
    }

    @Override // p94.d0
    public java.lang.String m() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRecentTips", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        java.lang.String str = this.f246139q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRecentTips", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return str;
    }

    @Override // p94.d0
    public boolean o() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isBgChange", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        boolean z17 = this.f246137o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isBgChange", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x01aa, code lost:
    
        if (r14.V.equals(r6.f471495u.f469610d) == false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x021d  */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo804x5f9cdc6f(int r30, int r31, int r32, java.lang.String r33, com.p314xaae8f345.mm.p971x6de15a2e.v0 r34, byte[] r35) {
        /*
            Method dump skipped, instructions count: 1486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q3.mo804x5f9cdc6f(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // p94.d0
    public boolean q() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPrivacy", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        boolean z17 = this.f246143u;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPrivacy", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return z17;
    }

    @Override // p94.d0
    public long r() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMaxLimitID", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        long j17 = this.f246134i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMaxLimitID", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return j17;
    }

    @Override // p94.d0
    public int y() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFetchMode", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFetchMode", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return this.f246148z;
    }

    public q3(java.lang.String str, long j17, boolean z17, int i17, int i18, int i19, int i27, int i28, int i29) {
        this.f246133h = 0L;
        this.f246135m = 0L;
        this.f246136n = 0;
        this.f246137o = false;
        this.f246138p = "";
        this.f246139q = "";
        this.f246140r = false;
        this.f246141s = false;
        this.f246142t = false;
        this.f246143u = false;
        this.f246145w = 0;
        this.f246148z = -1;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.C = i29;
        this.f246130e = str;
        this.f246134i = j17;
        this.f246132g = z17;
        this.f246148z = i18;
        if (j17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsWwUserPage", "fp userName " + str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsWwUserPage", "np userName " + str);
        }
        this.f246144v = i27;
        this.A = i28;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.wb6();
        lVar.f152198b = new r45.xb6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmsnswwuserpage";
        lVar.f152200d = 5203;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f246129d = a17;
        r45.wb6 wb6Var = (r45.wb6) a17.f152243a.f152217a;
        wb6Var.f470572e = str;
        wb6Var.f470573f = j17;
        wb6Var.f470577m = i19;
        boolean z18 = j17 == 0;
        this.f246131f = z18;
        if (i18 != 1 && i18 != 2 && i18 != 0) {
            int j18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Kj().j(str);
            long F2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().F2(z18 ? 0L : j17, j18, str, z17);
            this.f246135m = F2;
            wb6Var.f470575h = F2;
            int c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f1.c(F2, j17, str);
            wb6Var.f470576i = c17;
            wb6Var.f470574g = i17;
            if (z18) {
                if (L()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2 Ej = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ej();
                    Ej.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAlbumMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                    java.lang.String str2 = Ej.J0(str).f67937x79146e34;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAlbumMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                    this.f246138p = str2;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2 Ej2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ej();
                    Ej2.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                    java.lang.String str3 = Ej2.J0(str).f67951x4b6e68b9;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                    this.f246138p = str3;
                }
                if (this.f246138p == null) {
                    this.f246138p = "";
                }
                wb6Var.f470571d = this.f246138p;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsWwUserPage", "nextCount: " + j18 + " maxId:" + ca4.z0.t0(j17) + " minId:" + ca4.z0.t0(this.f246135m) + " lastReqTime:" + c17 + " snsSource:" + i17 + " FirstPageMd5:" + this.f246138p);
        } else {
            wb6Var.f470575h = 0L;
            wb6Var.f470574g = i17;
            if (i18 == 1) {
                wb6Var.f470578n = 1;
            }
            this.f246144v = 16;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsWwUserPage", "maxId:%s, minId:%s, snsSource:%s, pullType:%s", ca4.z0.t0(j17), ca4.z0.t0(this.f246135m), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(wb6Var.f470578n));
        }
        this.f246133h = j17;
    }
}
