package o72;

/* loaded from: classes12.dex */
public class j5 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f424904m = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: n, reason: collision with root package name */
    public static int f424905n = 0;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f424906d;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f424908f;

    /* renamed from: h, reason: collision with root package name */
    public final int f424910h;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f424907e = null;

    /* renamed from: g, reason: collision with root package name */
    public int f424909g = 0;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f424911i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_fav_scene_xml_null_batch_get, true);

    public j5(java.util.LinkedList linkedList) {
        this.f424910h = 100;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.lf();
        lVar.f152198b = new r45.mf();
        lVar.f152199c = "/cgi-bin/micromsg-bin/batchgetfavitem";
        lVar.f152200d = 402;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f424906d = lVar.a();
        this.f424908f = linkedList;
        f424904m.incrementAndGet();
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        }
        this.f424910h = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Fav_SceneLimit_Int, 100);
        java.util.HashSet hashSet = new java.util.HashSet(linkedList);
        linkedList.clear();
        linkedList.addAll(hashSet);
        java.lang.System.currentTimeMillis();
    }

    public static void H() {
        f424904m.decrementAndGet();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349();
    }

    public final boolean I() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().c().l(8217, null)) == 0;
        java.util.LinkedList linkedList = this.f424908f;
        boolean z18 = linkedList != null && this.f424909g < linkedList.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBatchgetFav", "check needContinue, notInit %B indexOK %B", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        return !z17 && z18;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBatchgetFav", "ashutest::doscene count:%d", java.lang.Integer.valueOf(f424904m.get()));
        java.util.LinkedList linkedList = this.f424908f;
        if (linkedList == null || linkedList.isEmpty() || this.f424909g >= linkedList.size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneBatchgetFav", "klem doScene, idlist size = " + linkedList.size() + ", begIndex = " + this.f424909g + ", xmlError = false");
            return -1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBatchgetFav", "ashutest::do netscene size %d, begIndex %d, total %s", java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(this.f424909g), linkedList);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().c().l(8217, null)) == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneBatchgetFav", "klem doScene, init not done, do not batchget");
            return -1;
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f424906d;
        r45.lf lfVar = (r45.lf) oVar.f152243a.f152217a;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        int i17 = this.f424909g;
        linkedList2.addAll(linkedList.subList(i17, java.lang.Math.min(i17 + 15, linkedList.size())));
        lfVar.f460934e = linkedList2;
        lfVar.f460933d = linkedList2.size();
        this.f424909g += 15;
        byte[] h17 = fo3.s.INSTANCE.h();
        if (h17 != null && h17.length > 0) {
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(h17);
            lfVar.f460935f = cu5Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBatchgetFav", "doScene set SecAuthRequestBuffer, size=%d", java.lang.Integer.valueOf(h17.length));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBatchgetFav", "ashutest::do netscene checkd size %d, %s", java.lang.Integer.valueOf(linkedList2.size()), linkedList2);
        this.f424907e = u0Var;
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 402;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        boolean z17;
        r45.cu5 cu5Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i19);
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(this.f424909g);
        java.util.LinkedList linkedList = this.f424908f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBatchgetFav", "netId %d errType %d errCode %d begIndex %d idListSize %d errMsg[%s]", valueOf, valueOf2, valueOf3, valueOf4, java.lang.Integer.valueOf(linkedList.size()), str);
        if (i19 == 3005) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBatchgetFav", "FAV_ERR_MAIN_DEVICE_AUTH_BLOCK received, parsing SecAuthResponseBuffer");
            r45.mf mfVar = (r45.mf) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            if (mfVar == null || (cu5Var = mfVar.f461970f) == null || (gVar = cu5Var.f453374f) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneBatchgetFav", "SecAuthResponseBuffer is null or empty");
            } else {
                java.lang.String str2 = new java.lang.String(gVar.f273689a);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBatchgetFav", "SecAuthResponseBuffer content: %s", str2);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5434x2d22e975 c5434x2d22e975 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5434x2d22e975();
                c5434x2d22e975.f135778g.f87760a = str2;
                c5434x2d22e975.e();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBatchgetFav", "FavoritesBatchSafeCheckerEvent published");
            }
            H();
            this.f424907e.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger = f424904m;
        if (i18 != 0 || i19 != 0) {
            if (!I()) {
                H();
                this.f424907e.mo815x76e0bfae(i18, i19, str, this);
                return;
            }
            int mo807x6c193ac1 = mo807x6c193ac1(m47995xb7ba1aa7(), this.f424907e);
            if (mo807x6c193ac1 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBatchgetFav", "doScene ret:%s, minus sceneCount, cur:%s", java.lang.Integer.valueOf(mo807x6c193ac1), java.lang.Integer.valueOf(atomicInteger.get()));
                H();
                return;
            }
            return;
        }
        r45.mf mfVar2 = (r45.mf) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        int i27 = mfVar2.f461968d;
        java.util.LinkedList linkedList2 = mfVar2.f461969e;
        int size = linkedList2.size();
        boolean z18 = true;
        if (i27 != size) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Integer.valueOf(size);
            objArr[1] = java.lang.Integer.valueOf(i27);
            objArr[2] = java.lang.Integer.valueOf(this.f424909g > linkedList.size() ? linkedList.size() % 15 : 15);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneBatchgetFav", "klem onGYNet resp list size:%d, return count %d, request count %d", objArr);
            if (!I()) {
                H();
                this.f424907e.mo815x76e0bfae(i18, -1, str, this);
                return;
            }
            int mo807x6c193ac12 = mo807x6c193ac1(m47995xb7ba1aa7(), this.f424907e);
            if (mo807x6c193ac12 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBatchgetFav", "doScene ret:%s, minus sceneCount, cur:%s", java.lang.Integer.valueOf(mo807x6c193ac12), java.lang.Integer.valueOf(atomicInteger.get()));
                H();
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBatchgetFav", "onGYNetEnd listSize:%s", java.lang.Integer.valueOf(size));
        int i28 = 0;
        while (i28 < size) {
            r45.tp0 tp0Var = (r45.tp0) linkedList2.get(i28);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBatchgetFav", "klem onGYNet index:%s favid:%d, status:%d", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(tp0Var.f468171d), java.lang.Integer.valueOf(tp0Var.f468172e));
            if (tp0Var.f468172e == 0) {
                o72.r2 re6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(tp0Var.f468171d);
                if (re6 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneBatchgetFav", "klem onGYNet favid:%d not exist!", java.lang.Integer.valueOf(tp0Var.f468171d));
                    z17 = z18;
                    i28++;
                    z18 = z17;
                } else {
                    java.lang.String str3 = tp0Var.f468173f;
                    re6.f67660x4b6e9352 = str3;
                    re6.U0(str3);
                    re6.f67641x225ba391 = tp0Var.f468174g;
                    re6.f67646x8f0eb299 = tp0Var.f468176i;
                    re6.f67659xa783a79b = (tp0Var.f468175h * 1000) + i28;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBatchgetFav", "field_update");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBatchgetFav", "huahuahailang:item field_xml batgch get :\n %s", re6.f67660x4b6e9352);
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBatchgetFav", "data dealed needUpload:%b  needDownload:%b", bool, bool);
                    re6.f67644x3059914a = 10;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().mo9952xce0038c9(re6, dm.i4.f66867x2a5c95c7);
                    o72.x1.Q0(re6);
                    re6.w0("MicroMsg.NetSceneBatchgetFav", o72.r2.G1);
                    tp0Var = tp0Var;
                }
            }
            if ((tp0Var.f468174g & 1) != 0) {
                o72.r2 re7 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(tp0Var.f468171d);
                z17 = true;
                o72.x1.l(re7, true, null, 4, null);
            } else {
                z17 = true;
            }
            i28++;
            z18 = z17;
        }
        ((a82.v) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj()).V6();
        if (I()) {
            int mo807x6c193ac13 = mo807x6c193ac1(m47995xb7ba1aa7(), this.f424907e);
            if (mo807x6c193ac13 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBatchgetFav", "doScene ret:%s, minus sceneCount, cur:%s", java.lang.Integer.valueOf(mo807x6c193ac13), java.lang.Integer.valueOf(atomicInteger.get()));
                H();
                return;
            }
            return;
        }
        H();
        if (this.f424911i) {
            f424905n = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBatchgetFav", "report sync flow end, retry count = " + f424905n);
        this.f424907e.mo815x76e0bfae(i18, i19, str, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return this.f424910h;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: setSecurityCheckError */
    public void mo14485xb35c0942(com.p314xaae8f345.mm.p944x882e457a.n1 n1Var) {
        if (n1Var == com.p314xaae8f345.mm.p944x882e457a.n1.EReachMaxLimit) {
            this.f424907e.mo815x76e0bfae(3, -1, "EReachMaxLimit", this);
        }
    }
}
