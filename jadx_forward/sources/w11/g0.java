package w11;

/* loaded from: classes12.dex */
public class g0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f523561d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f523562e;

    /* renamed from: f, reason: collision with root package name */
    public final int f523563f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f523564g;

    /* renamed from: h, reason: collision with root package name */
    public final fp.j f523565h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.StringBuilder f523566i;

    /* renamed from: m, reason: collision with root package name */
    public final long f523567m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f523568n;

    public g0() {
        this.f523562e = "";
        this.f523563f = 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        this.f523566i = sb6;
        this.f523567m = -1L;
        this.f523568n = false;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f523565h = new fp.j();
        sb6.append("stack:" + new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3() + " time:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
    }

    public final boolean H(int i17, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081) {
        if (i17 == 50) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetPushSync", "hit voip");
            c19772x1c2cd081.f38869x6ac9171 = "abort-by-voip";
            return true;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetPushSync", "check should launch to mm ,content or from username is null.");
            c19772x1c2cd081.f38869x6ac9171 = "abort-by-content-nil";
            return false;
        }
        if (i17 == 9998 && str.equalsIgnoreCase("weixin")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetPushSync", "hit ipxx");
            c19772x1c2cd081.f38869x6ac9171 = "abort-by-ipxx";
            return true;
        }
        if (i17 == 10002 && str2.contains("revokemsg")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetPushSync", "hit MM_DATA_SYSCMD_NEWXML_SUBTYPE_REVOKE");
            c19772x1c2cd081.f38869x6ac9171 = "abort-by-revoke";
            return true;
        }
        if (i17 < 9998) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetPushSync", "hit notifyMsgType: " + i17);
        c19772x1c2cd081.f38869x6ac9171 = "abort-by-unknown-msg";
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(long r11, java.lang.String r13, java.lang.String r14, java.util.Map r15, r45.j4 r16) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w11.g0.I(long, java.lang.String, java.lang.String, java.util.Map, r45.j4):void");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: cancel */
    public void mo9408xae7a2e7a() {
        super.mo9408xae7a2e7a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f523561d = u0Var;
        this.f523566i.append(" lastd:" + this.f32552xa692e110 + " dotime:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() + " net:" + com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(hashCode());
        objArr[1] = 7;
        objArr[2] = java.lang.Boolean.valueOf(this.f523564g != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetPushSync", "doScene[%d] selector:%d pusher:%b ", objArr);
        if (this.f523564g != null) {
            m48011xbb66a70e(sVar);
            this.f523564g.c(0L, 0L);
            this.f523564g = null;
            return -1;
        }
        w11.e0 e0Var = new w11.e0(false);
        e0Var.f523546c = com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153526n.f153435o;
        r45.dw4 dw4Var = ((o45.xh) e0Var.mo47979x2d63726f()).f424569a;
        dw4Var.f454311e = 7;
        dw4Var.f454312f = x51.j1.a(w11.c2.f523524a.a());
        dw4Var.f454313g = 1;
        dw4Var.f454310d = new r45.c50();
        dw4Var.f454314h = wo.q.f529313a;
        int wi6 = ((v61.f) ((zl.i) i95.n0.c(zl.i.class))).wi();
        if (wi6 != 0) {
            dw4Var.f454317n = wi6;
        }
        return mo9409x10f9447a(sVar, e0Var, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getInfo */
    public java.lang.String mo47997xfb80cd24() {
        return this.f523566i.toString();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 138;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x031f  */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo804x5f9cdc6f(int r19, int r20, int r21, java.lang.String r22, com.p314xaae8f345.mm.p971x6de15a2e.v0 r23, byte[] r24) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w11.g0.mo804x5f9cdc6f(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 500;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCountReach */
    public boolean mo48014x3a8bbc5f() {
        return super.mo48014x3a8bbc5f();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }

    public g0(o45.yh yhVar, int i17, long j17) {
        this();
        this.f523563f = i17;
        this.f523567m = j17;
        this.f523564g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(xu5.b.a("MMPushCore"), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new w11.c0(this, yhVar), false);
    }
}
