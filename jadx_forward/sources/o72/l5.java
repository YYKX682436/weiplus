package o72;

/* loaded from: classes12.dex */
public class l5 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f424930d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f424931e;

    /* renamed from: f, reason: collision with root package name */
    public final int f424932f;

    /* renamed from: g, reason: collision with root package name */
    public final int f424933g;

    /* renamed from: h, reason: collision with root package name */
    public final o72.m2 f424934h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f424935i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f424936m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f424937n;

    /* renamed from: o, reason: collision with root package name */
    public final int f424938o;

    /* renamed from: p, reason: collision with root package name */
    public final o72.r2 f424939p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f424940q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f424941r;

    public l5(int i17, java.util.LinkedList linkedList, java.util.LinkedList linkedList2, int i18) {
        o72.r2 re6;
        this.f424931e = null;
        this.f424940q = "";
        this.f424941r = "";
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.co4();
        lVar.f152198b = new r45.do4();
        lVar.f152199c = "/cgi-bin/micromsg-bin/modfavitem";
        lVar.f152200d = com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60870xaffa30c6;
        lVar.f152201e = 216;
        lVar.f152202f = 1000000216;
        this.f424930d = lVar.a();
        this.f424935i = linkedList2;
        this.f424936m = linkedList;
        this.f424932f = i17;
        this.f424933g = i18;
        long H = H();
        if (H <= 0 && (re6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(i17)) != null) {
            H = re6.f67645x88be67a1;
        }
        this.f424941r = o72.s2.f(H);
    }

    public long H() {
        o72.m2 m2Var = this.f424934h;
        if (m2Var == null) {
            return -1L;
        }
        return m2Var.f67419x88be67a1;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        java.lang.String str;
        java.util.LinkedList linkedList = this.f424936m;
        int i17 = this.f424938o;
        if (i17 == 0 && (linkedList == null || linkedList.size() == 0)) {
            return -1;
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f424930d;
        r45.co4 co4Var = (r45.co4) oVar.f152243a.f152217a;
        co4Var.f453248e = linkedList.size();
        java.util.LinkedList linkedList2 = this.f424935i;
        if (linkedList2 != null) {
            co4Var.f453250g = linkedList2.size();
            co4Var.f453251h = linkedList2;
        } else {
            co4Var.f453250g = 0;
            co4Var.f453251h = new java.util.LinkedList();
        }
        java.lang.String str2 = this.f424937n;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            co4Var.f453252i = str2;
        }
        co4Var.f453248e = linkedList.size();
        co4Var.f453249f = linkedList;
        int i18 = this.f424932f;
        co4Var.f453247d = i18;
        co4Var.f453253m = i17;
        this.f424931e = u0Var;
        if (!this.f424940q.isEmpty()) {
            co4Var.f453256p = this.f424940q;
        }
        java.lang.String str3 = this.f424941r;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(co4Var.f453248e);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(co4Var.f453250g);
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(i17);
        java.lang.String str4 = this.f424940q;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = o72.s2.f424994a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str = "xmlLen=0";
        } else {
            str = "xmlLen=" + str2.length();
        }
        o72.s2.g("MicroMsg.Fav.NetSceneModFavItem", str3, "Request Start params: favId=%d, indexCount=%d, objectCount=%d, scene=%d, clientId=%s, %s", valueOf, valueOf2, valueOf3, valueOf4, str4, str);
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60870xaffa30c6;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 == 4 && i19 != 0) {
            o72.r2 r2Var = this.f424939p;
            o72.d2.f(10002, i19, r2Var != null ? java.lang.String.format("itemType=%d;id=%d;localId=%s;errType:%d;errCode:%d;errMsg:%s", java.lang.Integer.valueOf(r2Var.f67657x2262335f), java.lang.Integer.valueOf(r2Var.f67643xc8a07680), java.lang.Long.valueOf(r2Var.f67645x88be67a1), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str) : java.lang.String.format("itemInfo null;errType:%d;errCode:%d;errMsg:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str));
        }
        boolean z17 = false;
        boolean z18 = i19 == 0;
        int i27 = this.f424932f;
        o72.d2.e(i27, i18, i19, z18, 1);
        o72.d2.b();
        java.lang.String str2 = this.f424941r;
        long H = H();
        int i28 = this.f424932f;
        if (i18 == 0 && i19 == 0) {
            z17 = true;
        }
        o72.s2.l("MicroMsg.Fav.NetSceneModFavItem", str2, H, i28, i18, i19, z17);
        this.f424931e.mo815x76e0bfae(i18, i19, str, this);
        o72.x1.f(((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(i27));
    }

    public l5(o72.r2 r2Var, java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        this(r2Var.f67643xc8a07680, linkedList, linkedList2, 0);
        this.f424939p = r2Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l5(int r4, o72.m2 r5) {
        /*
            r3 = this;
            r45.kp0 r0 = r5.f67420xbda7f2f0
            java.util.LinkedList r1 = r0.f460421d
            java.util.LinkedList r0 = r0.f460422e
            r2 = 1
            r3.<init>(r4, r1, r0, r2)
            r3.f424934h = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o72.l5.<init>(int, o72.m2):void");
    }

    public l5(o72.r2 r2Var, java.util.LinkedList linkedList, java.util.LinkedList linkedList2, java.lang.String str) {
        this(r2Var.f67643xc8a07680, linkedList, linkedList2, 0);
        this.f424937n = str;
        this.f424939p = r2Var;
    }

    public l5(o72.r2 r2Var, java.util.LinkedList linkedList, java.util.LinkedList linkedList2, java.lang.String str, int i17) {
        this(r2Var.f67643xc8a07680, linkedList, linkedList2, 0);
        this.f424937n = str;
        this.f424938o = i17;
        this.f424939p = r2Var;
    }
}
