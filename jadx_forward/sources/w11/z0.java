package w11;

/* loaded from: classes12.dex */
public class z0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {
    public static boolean A = false;
    public static int B = 0;

    /* renamed from: z, reason: collision with root package name */
    public static int f523714z = 7;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f523715d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f523716e;

    /* renamed from: f, reason: collision with root package name */
    public int f523717f;

    /* renamed from: g, reason: collision with root package name */
    public int f523718g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f523719h;

    /* renamed from: i, reason: collision with root package name */
    public w11.i2 f523720i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f523721m;

    /* renamed from: n, reason: collision with root package name */
    public final int f523722n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f523723o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f523724p;

    /* renamed from: q, reason: collision with root package name */
    public final fp.j f523725q;

    /* renamed from: r, reason: collision with root package name */
    public int f523726r;

    /* renamed from: s, reason: collision with root package name */
    public final long f523727s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f523728t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f523729u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f523730v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f523731w;

    /* renamed from: x, reason: collision with root package name */
    public o45.yh f523732x;

    /* renamed from: y, reason: collision with root package name */
    public long f523733y;

    public z0(int i17) {
        this.f523715d = "MicroMsg.NetSceneSync";
        this.f523717f = 0;
        this.f523718g = 0;
        this.f523719h = "";
        this.f523720i = null;
        this.f523721m = false;
        this.f523722n = 0;
        this.f523723o = null;
        this.f523724p = null;
        this.f523727s = -1L;
        this.f523728t = false;
        this.f523729u = false;
        this.f523730v = false;
        this.f523731w = "";
        this.f523732x = null;
        this.f523733y = 0L;
        java.lang.String str = "MicroMsg.NetSceneSync[" + hashCode() + "]";
        this.f523715d = str;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "dkpush NetSceneSync scene:%d stack:%s", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        this.f523731w = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.a();
        this.f523725q = new fp.j();
        if (this.f523720i == null) {
            this.f523720i = new w11.i2();
        }
        this.f523720i.f523591a = i17;
        gm0.j1.i();
        if (gm0.j1.u() != null && gm0.j1.a()) {
            gm0.j1.i();
            if (gm0.j1.u().c() != null && !gm0.m.r()) {
                gm0.j1.i();
                long k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) gm0.j1.u().c().l(8196, null), 0L);
                if (k17 != 0) {
                    gm0.j1.i();
                    gm0.j1.u().c().w(8196, 0L);
                    f523714z = ((int) (f523714z | k17)) & 95;
                }
            }
        }
        if (i17 == 1) {
            A = true;
        }
        if (i17 == 1010) {
            f523714z |= 16;
            A = true;
            this.f523726r = 7;
        } else if (i17 == 1011) {
            f523714z |= 64;
            A = true;
            this.f523726r = 7;
        } else if (i17 == 3) {
            f523714z |= 262144;
            A = true;
            this.f523726r = 3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "summerbadcr NetSceneSync aiScene[%d], selector[%d], syncScene[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(f523714z), java.lang.Integer.valueOf(this.f523726r));
        } else {
            this.f523726r = i17;
        }
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.mo68477x336bdfd8(99L, this.f523726r, 1L, false);
        fVar.mo68477x336bdfd8(99L, 0L, 1L, false);
        fVar.mo68477x336bdfd8(99L, z65.c.f551988a ? 241L : 242L, 1L, false);
        if (B == 0) {
            H();
        }
    }

    public final boolean H() {
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        gm0.j1.i();
        byte[] f17 = com.p314xaae8f345.mm.p642xad8b531f.y1.f(c19767x257d7f, gm0.j1.b().h());
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(c19767x257d7f.f38864x6ac9171);
        objArr[1] = java.lang.Integer.valueOf(hashCode());
        objArr[2] = java.lang.Integer.valueOf(f17 != null ? f17.length : 0);
        java.lang.String str = this.f523715d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "dealWithRespData index:%d, hashcode:%d, buf.len:%d", objArr);
        int i17 = c19767x257d7f.f38864x6ac9171;
        B = i17;
        if (i17 == 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(f17)) {
            B = 0;
            return false;
        }
        o45.yh yhVar = new o45.yh();
        try {
            yhVar.mo13863x347f4535(f17);
            this.f523724p = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(gm0.j1.e().a(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new w11.w0(this, new w11.y0(yhVar)), false);
            return true;
        } catch (java.lang.Error unused) {
            long freeMemory = java.lang.Runtime.getRuntime().freeMemory() / 1000;
            long j17 = java.lang.Runtime.getRuntime().totalMemory() / 1000;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "dealWithRespData memoryInfo avail/total, dalvik[%dk, %dk, user:%dk]", java.lang.Long.valueOf(freeMemory), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j17 - freeMemory));
            iz5.a.g("dealWithRespData error", false);
            return false;
        } catch (java.lang.Exception unused2) {
            jx3.f.INSTANCE.mo68477x336bdfd8(99L, 226L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "dealWithRespData SyncResp fromProtoBuf failed");
            int i18 = B;
            gm0.j1.i();
            com.p314xaae8f345.mm.p642xad8b531f.y1.b(i18, gm0.j1.b().h());
            B = 0;
            return false;
        }
    }

    public void I(o45.yh yhVar) {
        w11.b2 b2Var = w11.c2.f523524a;
        b2Var.d(x51.j1.d(yhVar.f424572a.f455294g), true);
        gm0.j1.i();
        gm0.j1.u().c().w(8196, java.lang.Long.valueOf(yhVar.f424572a.f455293f));
        boolean z17 = ((yhVar.f424572a.f455293f & f523714z) == 0 || super.mo48014x3a8bbc5f()) ? false : true;
        java.lang.Object[] objArr = {java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(yhVar.f424572a.f455293f), java.lang.Integer.valueOf(f523714z), java.lang.Boolean.valueOf(super.mo48014x3a8bbc5f())};
        java.lang.String str = this.f523715d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "canContinue cont:%b ContinueFlag:%d selector:%d securityLimitCountReach:%b", objArr);
        if (!z17 && (yhVar.f424572a.f455293f & 256) != 0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6099xc95a2e47 c6099xc95a2e47 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6099xc95a2e47();
            c6099xc95a2e47.f136376g.f90144a = 1;
            c6099xc95a2e47.e();
        }
        if (!z17 && (yhVar.f424572a.f455293f & 2097152) != 0) {
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5822x76918f51().e();
        }
        if (!z17 && (yhVar.f424572a.f455293f & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb) != 0) {
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5535xce15fb19().e();
        }
        if (!z17 && (yhVar.f424572a.f455293f & 32) != 0) {
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5218x7db5f878().e();
        }
        jx3.f.INSTANCE.mo68477x336bdfd8(99L, z17 ? 234L : 235L, 1L, false);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(yhVar.f424572a.f455293f);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(this.f523728t);
        java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(z17);
        java.lang.Boolean valueOf4 = java.lang.Boolean.valueOf(A);
        int i17 = this.f523722n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onRespHandled continueFlag:%d isNotifyData:%b conCont:%b notifyPending:%b pushSyncFlag:%d isContinueScene:%b respHandler:%s ", valueOf, valueOf2, valueOf3, valueOf4, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.f523729u), this.f523724p);
        if (!this.f523728t && z17) {
            this.f523729u = true;
            mo807x6c193ac1(m47995xb7ba1aa7(), this.f523716e);
            return;
        }
        if (A) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "dkpush new notify pending, sync now");
            int i18 = B;
            if (i18 != 0) {
                gm0.j1.i();
                com.p314xaae8f345.mm.p642xad8b531f.y1.b(i18, gm0.j1.b().h());
            }
            B = 0;
            this.f523724p = null;
            A = false;
            this.f523729u = true;
            mo807x6c193ac1(m47995xb7ba1aa7(), this.f523716e);
            return;
        }
        if (this.f523724p == null) {
            if ((i17 & 1) > 0) {
                gm0.j1.d().g(new w11.n0(this.f523727s, b2Var.a()));
            }
            f523714z = 7;
            this.f523716e.mo815x76e0bfae(this.f523717f, this.f523718g, this.f523719h, this);
            return;
        }
        int i19 = B;
        gm0.j1.i();
        com.p314xaae8f345.mm.p642xad8b531f.y1.b(i19, gm0.j1.b().h());
        this.f523724p = null;
        H();
        mo807x6c193ac1(m47995xb7ba1aa7(), this.f523716e);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: accept */
    public boolean mo47993xab27b508(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof w11.z0)) {
            return false;
        }
        w11.z0 z0Var = (w11.z0) m1Var;
        if (z0Var.f523721m || !A) {
            return false;
        }
        java.lang.Object[] objArr = {java.lang.Long.valueOf(z0Var.f32552xa692e110)};
        java.lang.String str = this.f523715d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "old not busy and notified, maybe cancel old scene, last dispatch=%d", objArr);
        long j17 = z0Var.f32552xa692e110;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        boolean z18 = android.os.SystemClock.elapsedRealtime() - j17 > 360000;
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "summerworker NetSceneSync timeout");
            android.os.Message m77781x1d1b2a3e = gm0.j1.e().d().m77781x1d1b2a3e();
            if ((m77781x1d1b2a3e == null ? null : m77781x1d1b2a3e.getCallback()) != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("summerworker worker is just blocked by task: ");
                android.os.Message m77781x1d1b2a3e2 = gm0.j1.e().d().m77781x1d1b2a3e();
                sb6.append(m77781x1d1b2a3e2 != null ? m77781x1d1b2a3e2.toString() : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, sb6.toString());
                return false;
            }
        }
        return z18;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: cancel */
    public void mo9408xae7a2e7a() {
        super.mo9408xae7a2e7a();
        jx3.f.INSTANCE.mo68477x336bdfd8(99L, 229L, 1L, false);
        this.f523730v = true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        boolean b17 = w11.a1.b();
        java.lang.String str = this.f523715d;
        if (b17) {
            B = 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "dkinit never do sync before init done");
            return -1;
        }
        this.f523716e = u0Var;
        if (this.f523720i == null) {
            this.f523720i = new w11.i2();
        }
        this.f523720i.getClass();
        if (this.f523724p != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "pushSyncRespHandler not null");
            m48011xbb66a70e(sVar);
            this.f523724p.c(0L, 0L);
            return 0;
        }
        int i17 = B;
        if (i17 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "other sync is dealing with resp data :%d", java.lang.Integer.valueOf(i17));
            return -1;
        }
        if (this.f523723o != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "pusher not null");
            m48011xbb66a70e(sVar);
            this.f523723o.c(0L, 0L);
            return 0;
        }
        w11.y0 y0Var = new w11.y0(false);
        r45.dw4 dw4Var = ((o45.xh) y0Var.mo47979x2d63726f()).f424569a;
        int i18 = this.f523726r;
        if (i18 == 3) {
            dw4Var.f454315i = 1;
        } else {
            dw4Var.f454315i = 0;
        }
        if (this.f523729u) {
            i18 = 6;
        }
        this.f523726r = i18;
        dw4Var.f454311e = f523714z;
        byte[] a17 = w11.c2.f523524a.a();
        dw4Var.f454312f = x51.j1.a(a17);
        dw4Var.f454313g = this.f523726r;
        dw4Var.f454310d = new r45.c50();
        int i19 = o45.wf.f424556a;
        dw4Var.f454314h = wo.q.f529313a;
        int wi6 = ((v61.f) ((zl.i) i95.n0.c(zl.i.class))).wi();
        if (wi6 != 0) {
            dw4Var.f454317n = wi6;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "doScene Selector:%d Scene:%d key[%s], SyncFlag[%d]", java.lang.Integer.valueOf(dw4Var.f454311e), java.lang.Integer.valueOf(dw4Var.f454313g), o45.qi.d(a17), java.lang.Integer.valueOf(wi6));
        A = false;
        w11.i2 i2Var = this.f523720i;
        int i27 = i2Var != null ? i2Var.f523591a : 0;
        int i28 = f523714z;
        boolean z17 = mm.w.f410075a;
        mm.w.d("MicroMsg.NotifyPowerInspector", "netSync: scene=" + i27 + ", selector=0x" + java.lang.Integer.toBinaryString(i27));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40965x320351f8()) {
            java.lang.String str2 = i27 + "-" + java.lang.Integer.toBinaryString(i28);
            mm.y yVar = mm.w.f410081g;
            if (yVar.b() || !mm.w.f410076b) {
                yVar.c(str2);
            }
        }
        return mo9409x10f9447a(sVar, y0Var, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 138;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e3  */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo804x5f9cdc6f(int r26, int r27, int r28, java.lang.String r29, com.p314xaae8f345.mm.p971x6de15a2e.v0 r30, byte[] r31) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w11.z0.mo804x5f9cdc6f(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 100;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCountReach */
    public boolean mo48014x3a8bbc5f() {
        boolean mo48014x3a8bbc5f = super.mo48014x3a8bbc5f();
        if (mo48014x3a8bbc5f) {
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.mo68477x336bdfd8(99L, 228L, 1L, false);
            java.lang.Object[] objArr = new java.lang.Object[9];
            objArr[0] = 0;
            objArr[1] = 0;
            objArr[2] = 0;
            objArr[3] = 0;
            objArr[4] = 0;
            objArr[5] = 0;
            objArr[6] = 0;
            objArr[7] = java.lang.Integer.valueOf(z65.c.f551988a ? 1 : 2);
            objArr[8] = "9999";
            fVar.d(12063, objArr);
        }
        return mo48014x3a8bbc5f;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: uniqueInNetsceneQueue */
    public boolean mo48023x99a7e80c() {
        return true;
    }

    public z0(o45.yh yhVar, int i17, long j17) {
        this(8);
        this.f523731w = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f523715d, "dkpush NOTIFYDATA resp size:%d pushSyncFlag:%d  recvTime:%d", java.lang.Long.valueOf(yhVar.m150571x5fdf8057()), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
        this.f523722n = i17;
        this.f523727s = j17;
        this.f523723o = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(gm0.j1.e().a(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new w11.v0(this, yhVar), false);
        if (B == 0) {
            H();
        }
    }
}
