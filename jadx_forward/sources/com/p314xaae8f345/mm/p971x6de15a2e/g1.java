package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes12.dex */
public class g1 extends com.p314xaae8f345.mm.p971x6de15a2e.t implements com.p314xaae8f345.mm.p971x6de15a2e.f, com.p314xaae8f345.mm.p971x6de15a2e.s {
    public static java.lang.String B = "";
    public static java.lang.String C = "";

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9 f153524i;

    /* renamed from: m, reason: collision with root package name */
    public final long f153525m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af f153526n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.c2 f153527o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.e2 f153528p;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f153532t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.j3 f153533u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p971x6de15a2e.f1 f153534v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p971x6de15a2e.y f153535w;

    /* renamed from: x, reason: collision with root package name */
    public byte[] f153536x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p971x6de15a2e.e0 f153537y;

    /* renamed from: e, reason: collision with root package name */
    public int f153520e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f153521f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f153522g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f153523h = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f153529q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f153530r = -1;

    /* renamed from: s, reason: collision with root package name */
    public int f153531s = 0;

    /* renamed from: z, reason: collision with root package name */
    public long f153538z = 0;
    public long A = 0;

    public g1(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        this.f153524i = null;
        this.f153532t = n3Var == null ? new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3() : n3Var;
        this.f153526n = new com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af(this);
        com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9 c4549xd1736fd9 = new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9(com.p314xaae8f345.mm.p971x6de15a2e.x2.d(), "MicroMsg.MMAutoAuth");
        this.f153524i = c4549xd1736fd9;
        this.f153525m = M();
        this.f153527o = new com.p314xaae8f345.mm.p971x6de15a2e.c2(this, c4549xd1736fd9);
        this.f153528p = new com.p314xaae8f345.mm.p971x6de15a2e.e2(this, c4549xd1736fd9);
        this.f153533u = new com.p314xaae8f345.mm.p2621x8fb0427b.j3(com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a + "autoauth.cfg");
    }

    public static long M() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.s0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.s0.class)).T3();
    }

    public static void d(com.p314xaae8f345.mm.p971x6de15a2e.g1 g1Var, com.p314xaae8f345.mm.p971x6de15a2e.z0 z0Var, int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af = g1Var.f153526n;
        java.util.Objects.toString(binderC11173x1cfac0af);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "oreh doAutoAuth ticket:%s, login:%b", str, java.lang.Boolean.valueOf(binderC11173x1cfac0af.mo9865x7b0e9c5f()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40529x312e01fd();
        if (binderC11173x1cfac0af.mo9865x7b0e9c5f() || com.p314xaae8f345.mm.p971x6de15a2e.x2.h().h() || com.p314xaae8f345.mm.p971x6de15a2e.x2.h().q(z0Var, g1Var.f153527o, g1Var.f153526n, 1, null) >= 0) {
            return;
        }
        g1Var.T(3, -1, "");
    }

    public static int e(com.p314xaae8f345.mm.p971x6de15a2e.g1 g1Var, com.p314xaae8f345.mm.p971x6de15a2e.z0 z0Var, com.p314xaae8f345.mm.p971x6de15a2e.o0 o0Var, int i17) {
        com.p314xaae8f345.mm.p971x6de15a2e.C11181xa473aa4c Ag;
        g1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "dkcgi sendImp rr.type:%d callback:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(o0Var.hashCode()));
        if (i17 == 126) {
            z0Var.mo48052xfb85f7b0();
            com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af = new com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af(g1Var);
            binderC11173x1cfac0af.f153428e = z0Var.mo48049x2d63726f().mo48041x6bf53a6c();
            int q17 = com.p314xaae8f345.mm.p971x6de15a2e.x2.h().q(z0Var, o0Var, binderC11173x1cfac0af, 0, null);
            if (q17 < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "register: net.send err");
                return q17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "register: netid=" + q17);
            return q17;
        }
        if (i17 == 252) {
            int l17 = g1Var.l(z0Var, o0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "summerauths MMFunc_SecManualAuth netId[%s]", java.lang.Integer.valueOf(l17));
            return l17;
        }
        if (i17 == 701) {
            return g1Var.l(z0Var, o0Var);
        }
        z0Var.S6(240);
        try {
            Ag = z0Var.Ag(g1Var.f153526n.f153435o);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMAutoAuth", th6, "nonauth exception.", new java.lang.Object[0]);
        }
        if (Ag == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "nonauth: reqInfo empty.");
            return -1;
        }
        int q18 = com.p314xaae8f345.mm.p971x6de15a2e.x2.h().q(z0Var, o0Var, g1Var.f153526n, Ag.f153477q == 1 ? 1 : 0, Ag);
        if (q18 >= 0) {
            return q18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "nonauth: in queue err");
        return q18;
    }

    public static void g(com.p314xaae8f345.mm.p971x6de15a2e.g1 g1Var, com.p314xaae8f345.mm.p971x6de15a2e.z0 z0Var, int i17, int i18) {
        if (g1Var.f153529q > 0) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j17 = g1Var.f153529q;
            if (60000 >= elapsedRealtime - j17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAutoAuth", "getcert lastGetCertSucTime=%d, curtime=%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
                g1Var.T(3, -1, "");
                return;
            }
        }
        if (com.p314xaae8f345.mm.p971x6de15a2e.x2.h().q(z0Var, g1Var.f153528p, g1Var.f153526n, 0, null) < 0) {
            g1Var.T(3, -1, "");
        }
    }

    public static void j(com.p314xaae8f345.mm.p971x6de15a2e.g1 g1Var, int i17) {
        int i18;
        int i19;
        g1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "cancel: netid=" + i17);
        if (i17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "error netid < 0, " + i17);
            return;
        }
        com.p314xaae8f345.mm.p971x6de15a2e.q2 h17 = com.p314xaae8f345.mm.p971x6de15a2e.x2.h();
        h17.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetTaskAdapter", "stopTask netId=" + i17);
        int i27 = h17.f153661a;
        if (i17 < 0 || i17 >= i27) {
            return;
        }
        synchronized (h17.f153662b) {
            com.p314xaae8f345.mm.p971x6de15a2e.p2 p2Var = h17.f153662b[i17];
            if (p2Var != null) {
                i19 = p2Var.f153645k;
                i18 = p2Var.f153646l;
            } else {
                i18 = 0;
                i19 = 0;
            }
        }
        if (i19 != 0) {
            if (com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84223xdac2174d() && 2 == i18) {
                ((com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0) com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84213x6f964b77(com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0.class)).m84608x6635e0a7(i19);
            } else {
                ((com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.class)).m40476x6635e0a7(i19);
            }
        }
        synchronized (h17.f153662b) {
            if (h17.f153662b[i17] != null) {
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetTaskAdapter", "mmcgi stopTask outQueue: netId:%d hash:%d type:%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(h17.f153662b[i17].f153641g.mo48052xfb85f7b0()), java.lang.Integer.valueOf(h17.f153662b[i17].f153641g.o2()));
                    h17.f153662b[i17] = null;
                } catch (android.os.RemoteException e17) {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                }
            }
        }
    }

    public void A() {
        this.f153524i.m40015x32c52b(this.f153525m, "MMAutoAuth.forceUpdateHostCache");
        new com.p314xaae8f345.mm.p971x6de15a2e.z1(this, 3000L, -1).a(this.f153532t);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public java.lang.String A0() {
        return ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40247xeaa2f5e2();
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v
    public com.p314xaae8f345.mm.p971x6de15a2e.h0 Ai() {
        return com.p314xaae8f345.mm.p971x6de15a2e.x2.i();
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void B(java.lang.String str) {
        ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40258xcb81b39(str);
        if (com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84223xdac2174d()) {
            ((com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80) com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84213x6f964b77(com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.class)).m84363xcb81b39(str);
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void C(boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2600x5c6729a.d.f273903d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAutoAuth", "loginevent but eventpool null, event:" + z17);
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public int D(int[] iArr, boolean z17, long j17, int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "uploadLog triggered, timespans: %s, isLogin: %s, uin: %s, beginHour: %s, endHour: %s, commextraInfo: %s, prefix: %s, suffix: %s", java.util.Arrays.toString(iArr), java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, str2, str3);
        return ((java.lang.Integer) new com.p314xaae8f345.mm.p971x6de15a2e.m1(this, 2000L, null, i17, i18, iArr, z17, j17, str, str2, str3).a(this.f153532t)).intValue();
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public int D0(java.lang.String str, boolean z17, java.util.List list) {
        return ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40251x77eff5c6(list, str, z17);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void F() {
        ((com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.class)).m40475x3a27d440();
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public com.p314xaae8f345.mm.p971x6de15a2e.o G() {
        return this.f153526n;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void H(long j17, long j18) {
        ((com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.class)).m40473xfe44f833(j17, j18);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void I(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "killPush %s", str);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public synchronized int J(com.p314xaae8f345.mm.p971x6de15a2e.z0 z0Var, com.p314xaae8f345.mm.p971x6de15a2e.o0 o0Var, int i17) {
        try {
            z0Var.S6(235);
        } catch (android.os.RemoteException e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "getProfileEnabled exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
        this.f153524i.m40015x32c52b(this.f153525m, "MMAutoAuth.send");
        return ((java.lang.Integer) new com.p314xaae8f345.mm.p971x6de15a2e.t1(this, 3000L, -1, z0Var, o0Var, i17).a(this.f153532t)).intValue();
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void J0() {
        ((com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.class)).m40461xe49bb003();
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public java.lang.String[] K() {
        com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af = this.f153526n;
        if (binderC11173x1cfac0af != null) {
            return binderC11173x1cfac0af.K();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAutoAuth", "accinfo is empty");
        return new java.lang.String[2];
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public long L() {
        return ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40245xbb09de0b();
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public byte[] N(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.mm.C4564xe93729bb[] m40248xb14c55a9 = ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40248xb14c55a9(i17, i18);
        if (m40248xb14c55a9 != null && m40248xb14c55a9.length != 0) {
            try {
                return com.p314xaae8f345.p542x3306d5.mm.C4565xc753cdad.m40182xddd166e0(m40248xb14c55a9);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", e17.getLocalizedMessage());
            }
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v
    public void Nd(com.p314xaae8f345.mm.p971x6de15a2e.f1 f1Var) {
        this.f153534v = f1Var;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public int P(java.lang.String str, int i17, int i18, int i19, int i27, byte[] bArr, byte[] bArr2, com.p314xaae8f345.mm.p971x6de15a2e.c1 c1Var) {
        return ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40235x17921322(str, i17, i18, i19, i27, bArr, bArr2, c1Var);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public java.lang.String[] P0(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.mm.C4574xe5297c17 m40246x7a610133 = ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40246x7a610133(str);
        java.lang.String[] strArr = new java.lang.String[3];
        if (m40246x7a610133 != null) {
            byte[] bArr = m40246x7a610133.f19509x7af38fe9;
            if (bArr != null) {
                strArr[0] = new java.lang.String(bArr);
            } else {
                strArr[0] = "";
            }
            byte[] bArr2 = m40246x7a610133.ctx;
            if (bArr2 != null) {
                strArr[1] = new java.lang.String(bArr2);
            } else {
                strArr[1] = "";
            }
            byte[] bArr3 = m40246x7a610133.f19508x36253652;
            if (bArr3 != null) {
                strArr[2] = new java.lang.String(bArr3);
            } else {
                strArr[2] = "";
            }
        } else {
            strArr[0] = "";
            strArr[1] = "";
            strArr[2] = "";
        }
        return strArr;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void Q(java.lang.String[] strArr, int[] iArr) {
        this.f153524i.m40015x32c52b(this.f153525m, "MMAutoAuth.setMMTlsHostInfo");
        new com.p314xaae8f345.mm.p971x6de15a2e.q1(this, 1000L, null, strArr, iArr).a(this.f153532t);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public int Q0(int i17) {
        return ((java.lang.Integer) new com.p314xaae8f345.mm.p971x6de15a2e.n1(this, 2000L, null, i17).a(this.f153532t)).intValue();
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void R(boolean z17) {
        new com.p314xaae8f345.mm.p971x6de15a2e.u1(this, 3000L, -1, z17).a(this.f153532t);
    }

    public byte[] S() {
        byte[] bArr;
        byte[] bArr2;
        com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af = this.f153526n;
        if (!binderC11173x1cfac0af.mo9865x7b0e9c5f()) {
            return null;
        }
        boolean a17 = o45.ji.a();
        w11.b2 b2Var = w11.c2.f523524a;
        if (!a17) {
            o45.gi giVar = new o45.gi();
            giVar.f424471d = binderC11173x1cfac0af.f153435o;
            giVar.f424468a = b2Var.a();
            giVar.f424469b = o45.a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            giVar.f424470c = o45.a.b();
            com.p314xaae8f345.p542x3306d5.mm.C4574xe5297c17 m40246x7a610133 = ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40246x7a610133("synccheck");
            if (m40246x7a610133 == null || (bArr = m40246x7a610133.f19509x7af38fe9) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAutoAuth", "network id is empty");
            } else {
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = java.lang.Integer.valueOf(bArr.length);
                byte[] bArr3 = m40246x7a610133.ctx;
                objArr[1] = java.lang.Integer.valueOf(bArr3 == null ? 0 : bArr3.length);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "getnetworkid, id length: %d, ctx length %d,", objArr);
                giVar.f424473f = m40246x7a610133.f19509x7af38fe9;
                byte[] bArr4 = m40246x7a610133.ctx;
                if (bArr4 != null) {
                    giVar.f424475h = bArr4;
                    giVar.f424474g = bArr4.length;
                } else {
                    giVar.f424474g = 0;
                }
            }
            try {
                byte[] mo13852xc3d7db06 = giVar.mo13852xc3d7db06();
                this.f153536x = giVar.f424472e;
                return mo13852xc3d7db06;
            } catch (java.lang.Exception e17) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                return null;
            }
        }
        o45.fi fiVar = new o45.fi();
        fiVar.f424462d = binderC11173x1cfac0af.f153435o & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
        fiVar.f424459a = b2Var.a();
        int i17 = o45.wf.f424556a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        fiVar.f424460b = o45.a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        fiVar.f424461c = o45.a.b();
        com.p314xaae8f345.p542x3306d5.mm.C4574xe5297c17 m40246x7a6101332 = ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40246x7a610133("synccheck");
        if (m40246x7a6101332 == null || (bArr2 = m40246x7a6101332.f19509x7af38fe9) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAutoAuth", "synccheck3 network id is empty");
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            objArr2[0] = java.lang.Integer.valueOf(bArr2.length);
            byte[] bArr5 = m40246x7a6101332.ctx;
            objArr2[1] = java.lang.Integer.valueOf(bArr5 != null ? bArr5.length : 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "synccheck3 getnetworkid3, id length: %d, ctx length %d,", objArr2);
            fiVar.f424464f = m40246x7a6101332.f19509x7af38fe9;
            byte[] bArr6 = m40246x7a6101332.ctx;
            if (bArr6 != null) {
                fiVar.f424465g = bArr6;
            }
        }
        try {
            byte[] mo13852xc3d7db062 = fiVar.mo13852xc3d7db06();
            this.f153536x = fiVar.f424463e;
            return mo13852xc3d7db062;
        } catch (java.lang.Exception e18) {
            jx3.f.INSTANCE.mo68477x336bdfd8(2143L, 0L, 1L, true);
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "synccheck3 exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
            return null;
        }
    }

    public final void T(int i17, int i18, java.lang.String str) {
        int i19;
        int i27 = i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("summerauth handleAutoAuthFail inErrType=");
        sb6.append(i27);
        sb6.append(", inErrCode=");
        sb6.append(i18);
        sb6.append(", errMsg=");
        sb6.append(str);
        sb6.append(" stack=");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", sb6.toString());
        int i28 = -3;
        if (i27 == 4 && (i18 == -106 || i18 == -3 || i18 == -5)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "summerauth handleAutoAuthFail autoauth errCode %s should be transfer to MM_ERR_AUTH_ANOTHERPLACE", java.lang.Integer.valueOf(i18));
            i19 = -100;
        } else {
            i19 = i18;
        }
        if (i27 == 5 && i18 == -13) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "summerauth handleAutoAuthFail autoauth should not be return MM_ERR_SESSIONTIMEOUT trans to MM_ERR_PASSWORD");
            U();
            jx3.f.INSTANCE.mo68477x336bdfd8(148L, 42L, 1L, false);
            i27 = 4;
        } else {
            i28 = i19;
        }
        if ((i27 == 6 && i18 == -10001) || (i27 == 5 && i18 != -13)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "summerauth handleAutoAuthFail autoauth ENCODE ERROR check sp");
            android.content.SharedPreferences a17 = c01.h9.a();
            java.lang.String string = a17.getString("_auth_key", "");
            java.lang.String string2 = a17.getString("server_id", "");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "summerauth handleAutoAuthFail autoauth ENCODE ERROR check sp aak and cookie null logout");
                jx3.f.INSTANCE.mo68477x336bdfd8(148L, 52L, 1L, false);
                i28 = -104;
                i27 = 4;
            }
        }
        com.p314xaae8f345.mm.p971x6de15a2e.x2.h().e(i27, i28, str);
        if (i27 == 4) {
            if (i28 == -100 || i28 == -2023 || i28 == -205 || i28 == -213) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("auth_hold_prefs", 0).edit().putBoolean("auth_ishold", true).commit();
                mo48028x6761d4f();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public int T0(java.lang.String str, int i17, int i18, java.util.List list) {
        return ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40234x8fac3bcd(str, i17, i18, list);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void U() {
        ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40233x6bfeee24();
        if (com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84223xdac2174d()) {
            ((com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80) com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84213x6f964b77(com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.class)).m84336x6bfeee24();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v
    public void Uh(o45.mi miVar) {
        com.p314xaae8f345.mm.p971x6de15a2e.q2 h17 = com.p314xaae8f345.mm.p971x6de15a2e.x2.h();
        com.p314xaae8f345.mm.p971x6de15a2e.p2[] p2VarArr = h17.f153662b;
        for (int i17 = 0; i17 < h17.f153661a; i17++) {
            try {
                com.p314xaae8f345.mm.p971x6de15a2e.p2 p2Var = p2VarArr[i17];
                if (p2Var != null) {
                    p2Var.f153641g.mo48052xfb85f7b0();
                }
            } catch (android.os.RemoteException e17) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s, remove index:%d", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17), java.lang.Integer.valueOf(i17));
                p2VarArr[i17] = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean V(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p971x6de15a2e.g1.V(java.lang.String):boolean");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:92|(11:99|(3:(2:104|105)|106|105)|107|108|109|110|(1:112)|113|(1:123)(1:117)|118|(1:120))|127|(0)|107|108|109|110|(0)|113|(1:115)|123|118|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02cb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02cc, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", r0.getLocalizedMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02db A[Catch: RemoteException -> 0x0400, TryCatch #0 {RemoteException -> 0x0400, blocks: (B:84:0x01c4, B:87:0x0241, B:90:0x024c, B:92:0x0252, B:105:0x02b2, B:107:0x02bc, B:110:0x02d3, B:112:0x02db, B:113:0x02e6, B:115:0x02f0, B:117:0x02fa, B:118:0x0332, B:120:0x03da, B:123:0x032c, B:126:0x02cc, B:128:0x03e6, B:129:0x0248, B:130:0x023d, B:109:0x02c3), top: B:83:0x01c4, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03da A[Catch: RemoteException -> 0x0400, TryCatch #0 {RemoteException -> 0x0400, blocks: (B:84:0x01c4, B:87:0x0241, B:90:0x024c, B:92:0x0252, B:105:0x02b2, B:107:0x02bc, B:110:0x02d3, B:112:0x02db, B:113:0x02e6, B:115:0x02f0, B:117:0x02fa, B:118:0x0332, B:120:0x03da, B:123:0x032c, B:126:0x02cc, B:128:0x03e6, B:129:0x0248, B:130:0x023d, B:109:0x02c3), top: B:83:0x01c4, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void W(int r30, int r31, int r32, java.lang.String r33, com.p314xaae8f345.mm.p971x6de15a2e.z0 r34, byte[] r35, int r36) {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p971x6de15a2e.g1.W(int, int, int, java.lang.String, com.tencent.mm.network.z0, byte[], int):void");
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void W0(java.lang.String str) {
        ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40264x4fead059(str);
        if (com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84223xdac2174d()) {
            ((com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80) com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84213x6f964b77(com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.class)).m84369x4fead059(str);
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void X(boolean z17) {
        ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40276x764cd590(z17);
        if (com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84223xdac2174d()) {
            ((com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80) com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84213x6f964b77(com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.class)).m84382x764cd590(z17);
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void Y(boolean z17) {
        ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40238x77b2a3c(z17);
        if (com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84223xdac2174d()) {
            ((com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80) com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84213x6f964b77(com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.class)).m84342x77b2a3c(z17);
        }
    }

    public void Z(r45.wc wcVar, final long j17, final com.p314xaae8f345.mm.p971x6de15a2e.a2 a2Var) {
        java.util.LinkedList linkedList;
        int i17;
        ((com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0.class)).m37571x9537f237(wcVar.m75960xfb7e5820());
        if (wcVar.f470590d == 0 || (linkedList = wcVar.f470591e) == null || linkedList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAutoAuth", "ax host list is null");
            com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af = this.f153526n;
            binderC11173x1cfac0af.I = true;
            binderC11173x1cfac0af.M();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "ax host list size [%d] scene [%s]", java.lang.Integer.valueOf(wcVar.f470590d), a2Var.toString());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        final java.util.LinkedList linkedList2 = wcVar.f470591e;
        com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af2 = this.f153526n;
        int size = linkedList2.size();
        long j18 = binderC11173x1cfac0af2.f153432i;
        if (j17 != j18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AccInfo", "setAxAuthRequestingCount timestamp mismatch, need:%s, income:%s", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17));
        } else {
            synchronized (binderC11173x1cfac0af2) {
                binderC11173x1cfac0af2.f153446z = size;
            }
        }
        if (linkedList2.isEmpty()) {
            com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af3 = this.f153526n;
            binderC11173x1cfac0af3.I = true;
            binderC11173x1cfac0af3.M();
        }
        java.util.Iterator it = linkedList2.iterator();
        while (true) {
            i17 = 0;
            if (!it.hasNext()) {
                break;
            }
            r45.vc vcVar = (r45.vc) it.next();
            r45.kx3 kx3Var = vcVar.f469623f;
            if (kx3Var != null) {
                try {
                    this.f153526n.Y0(vcVar.f469621d, true, j17);
                    this.f153526n.d(vcVar.f469621d, kx3Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMAutoAuth", e17, "", new java.lang.Object[0]);
                }
            }
            a0(arrayList, arrayList2, arrayList3, kx3Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "after parse ax host list size [%d]", java.lang.Integer.valueOf(arrayList.size()));
        if (arrayList.size() > 0) {
            java.lang.String[] strArr = new java.lang.String[arrayList.size()];
            java.lang.String[] strArr2 = new java.lang.String[arrayList2.size()];
            int[] iArr = new int[arrayList3.size()];
            arrayList.toArray(strArr);
            arrayList2.toArray(strArr2);
            java.util.Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                iArr[i17] = ((java.lang.Integer) arrayList3.get(((java.lang.Integer) it6.next()).intValue())).intValue();
                i17++;
            }
            this.f153524i.m40015x32c52b(this.f153525m, "MMAutoAuth.addHostInfo");
            new com.p314xaae8f345.mm.p971x6de15a2e.k1(this, 1000L, null, strArr, strArr2, iArr).a(this.f153532t);
        }
        boolean l17 = j62.e.g().l("clicfg_a2auth_run_sub_process", true, true, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "is_a2auth_run_sub_process %b", java.lang.Boolean.valueOf(l17));
        if (l17) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("AxAuthScene").mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.mm.network.g1$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p971x6de15a2e.g1.this.p(j17, a2Var, linkedList2);
                }
            });
        } else {
            p(j17, a2Var, linkedList2);
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public int Z0(java.lang.String str, int i17, long j17, java.lang.String str2, java.lang.String str3) {
        return ((java.lang.Integer) new com.p314xaae8f345.mm.p971x6de15a2e.l1(this, 2000L, null, str, i17, j17, str2, str3).a(this.f153532t)).intValue();
    }

    public final void a0(java.util.List list, java.util.List list2, java.util.List list3, r45.kx3 kx3Var) {
        java.util.LinkedList linkedList;
        if (kx3Var == null || (linkedList = kx3Var.f460557e) == null || linkedList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAutoAuth", "host list size is zero");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "autoauth parse hostlist size [%d]", java.lang.Integer.valueOf(linkedList.size()));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.hx3 hx3Var = (r45.hx3) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "parse hostlist host org:%s sub:%s", hx3Var.f458068d, hx3Var.f458069e);
            list.add(hx3Var.f458068d);
            list2.add(hx3Var.f458069e);
            list3.add(java.lang.Integer.valueOf(hx3Var.f458070f));
            if (hx3Var.f458068d.equals(com.p314xaae8f345.mm.p971x6de15a2e.k.f153588a)) {
                C = hx3Var.f458069e;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    /* renamed from: ackActionNotify */
    public int mo48026x708d4848(java.lang.String str, long j17, int i17) {
        if (com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84223xdac2174d()) {
            ((com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80) com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84213x6f964b77(com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.class)).m84358x988efe88(str, j17, i17);
        }
        return ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40253x988efe88(str, j17, i17);
    }

    public final boolean b0(java.lang.String str, java.lang.String str2, int i17) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(str == null ? -1 : str.length());
        objArr[1] = java.lang.Integer.valueOf(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "summerauths saveAAKAndCookieToSp aak[%s] uin[%s]", objArr);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("auth_hold_prefs", 0).edit().remove("auth_ishold").commit();
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("auth_info_key_prefs", 4);
        boolean z17 = sharedPreferences.getBoolean("key_auth_info_prefs_created", false);
        int i18 = sharedPreferences.getInt("key_auth_update_version", 0);
        int i19 = sharedPreferences.getInt("_auth_uin", 0);
        java.lang.String string = sharedPreferences.getString("_auth_key", "");
        java.lang.String string2 = sharedPreferences.getString("server_id", "");
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("key_auth_info_prefs_created", true);
        edit.putInt("key_auth_update_version", o45.wf.f424562g);
        edit.putInt("_auth_uin", i17);
        edit.putString("_auth_key", str);
        edit.putString("server_id", str2);
        if (!edit.commit()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "summerauth save aak & id commit failed 1th!");
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.mo68477x336bdfd8(148L, 36L, 1L, false);
            if (!edit.commit()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "summerauth save aak & id commit failed 2nd!");
                fVar.mo68477x336bdfd8(148L, 37L, 1L, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "summerauth save aak & id commit failed 2th so ret false old vs new vs input create[%b, %b, %b] version[%d, %d, %d], uin[%d, %d, %d], aak[%s, %s, %s], cookie[%s, %s, %s]", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(sharedPreferences.getBoolean("key_auth_info_prefs_created", false)), java.lang.Boolean.TRUE, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(sharedPreferences.getInt("key_auth_update_version", 0)), java.lang.Integer.valueOf(o45.wf.f424562g), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(sharedPreferences.getInt("_auth_uin", 0)), java.lang.Integer.valueOf(i17), string, sharedPreferences.getString("_auth_key", ""), str, string2, sharedPreferences.getString("server_id", ""), str2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40529x312e01fd();
                return false;
            }
        }
        boolean z18 = sharedPreferences.getBoolean("key_auth_info_prefs_created", false);
        int i27 = sharedPreferences.getInt("key_auth_update_version", 0);
        int i28 = sharedPreferences.getInt("_auth_uin", 0);
        java.lang.String string3 = sharedPreferences.getString("_auth_key", "");
        java.lang.String string4 = sharedPreferences.getString("server_id", "");
        if (!z18 || i27 != o45.wf.f424562g || i28 != i17 || !string3.equals(str) || !string4.equals(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "summerauth save aak & id commit failed check not equal so ret false old vs new vs input create[%b, %b, %b] version[%d, %d, %d], uin[%d, %d, %d], aak[%s, %s, %s], cookie[%s, %s, %s]", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.TRUE, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(o45.wf.f424562g), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i17), string, string3, str, string2, string4, str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40529x312e01fd();
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.j3 j3Var = this.f153533u;
        synchronized (j3Var) {
            j3Var.f276581h = true;
        }
        this.f153533u.f(1, java.lang.Integer.valueOf(o45.wf.f424562g));
        this.f153533u.f(2, java.lang.Integer.valueOf(i17));
        this.f153533u.f(3, str);
        this.f153533u.f(4, str2);
        com.p314xaae8f345.mm.p2621x8fb0427b.j3 j3Var2 = this.f153533u;
        synchronized (j3Var2) {
            j3Var2.f276581h = false;
            j3Var2.j();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "summerauth save aak & id ok old vs new vs input[%b, %b, %b, %b] version[%d, %d, %d. %d], uin[%d, %d, %d, %d], aak[%s, %s, %s, %s], cookie[%s, %s, %s, %s]", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(!this.f153533u.f276577d), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(o45.wf.f424562g), (java.lang.Integer) this.f153533u.a(1), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i17), (java.lang.Integer) this.f153533u.a(2), string, string3, str, (java.lang.String) this.f153533u.a(3), string2, string4, str2, (java.lang.String) this.f153533u.a(4));
        return true;
    }

    public final void c0(byte[] bArr, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            return;
        }
        java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(bArr);
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("auth_info_key_prefs", 4);
        if (!sharedPreferences.edit().putString("server_index_buffer", l17).commit()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "mmpack summerauth save serverIndexBuffer commit failed, retry");
            if (!sharedPreferences.edit().putString("server_index_buffer", l17).commit()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "mmpack summerauth save serverIndexBuffer commit failed 2nd, skip autoauthcfg");
                return;
            }
        }
        java.lang.String string = sharedPreferences.getString("server_index_buffer", "");
        if (!l17.equals(string)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "mmpack summerauth save serverIndexBuffer verify failed, written[%d] read[%d]", java.lang.Integer.valueOf(l17.length()), java.lang.Integer.valueOf(string.length()));
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.j3 j3Var = this.f153533u;
        synchronized (j3Var) {
            j3Var.f276581h = true;
        }
        j3Var.f(5, l17);
        synchronized (j3Var) {
            j3Var.f276581h = false;
            j3Var.j();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "mmpack summerauth save serverIndexBuffer ok len[%d] uin[%d]", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void d0(int i17) {
        ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40268xa6cdc88d(i17);
        if (com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84223xdac2174d()) {
            ((com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80) com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84213x6f964b77(com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.class)).m84373xa6cdc88d(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void d1() {
        ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40275x177c4668();
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public int e0() {
        return ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40244x10685519();
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public java.lang.String[] e1(boolean z17) {
        return ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40241x9d83e8c7(z17);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void f1(com.p314xaae8f345.mm.p971x6de15a2e.b0 b0Var) {
        ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40256x7b24ad89(b0Var);
    }

    /* renamed from: finalize */
    public void m48347xd764dc1e() {
        mo48028x6761d4f();
        super.finalize();
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public boolean g0() {
        return this.f153520e < 5;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    /* renamed from: getHostByName */
    public int mo48027x8faab340(java.lang.String str, java.util.List list) {
        return ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40239x8faab340(str, list);
    }

    public boolean h0() {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j17 = this.f153522g;
        if (90000 >= elapsedRealtime - j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAutoAuth", "auto limit lastSessionTimeout=%d, curtime=%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "sessionTimeOut");
        this.f153522g = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af = this.f153526n;
        binderC11173x1cfac0af.E(new byte[0], new byte[0], new byte[0], binderC11173x1cfac0af.f153435o, 0L);
        this.f153526n.i0();
        ((com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0.class)).m37566x32788c9c(null);
        ((com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0.class)).m37577x25e0d3ab(null, null);
        ((com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0.class)).m37576x50d1585d(null);
        ((com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0.class)).m37551x64f46292();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void h1(com.p314xaae8f345.mm.p971x6de15a2e.b0 b0Var) {
        ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40231x7433764c(b0Var);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v
    public void hh(com.p314xaae8f345.mm.p971x6de15a2e.e0 e0Var) {
        this.f153537y = e0Var;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void i1(int i17) {
        this.f153524i.m40015x32c52b(this.f153525m, java.lang.String.format("MMAutoAuth.cancel,%d", java.lang.Integer.valueOf(i17)));
        new com.p314xaae8f345.mm.p971x6de15a2e.r1(this, 1000L, null, i17).a(this.f153532t);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void j0(java.lang.String[] strArr, java.lang.String[] strArr2, int[] iArr) {
        this.f153524i.m40015x32c52b(this.f153525m, "MMAutoAuth.setHostInfo");
        if (strArr2 != null && strArr2.length > 0) {
            com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af = this.f153526n;
            synchronized (binderC11173x1cfac0af.A) {
                binderC11173x1cfac0af.A.clear();
            }
            for (java.lang.String str : strArr2) {
                com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af2 = this.f153526n;
                byte[] bytes = str.getBytes();
                synchronized (binderC11173x1cfac0af2.A) {
                    binderC11173x1cfac0af2.A.add(new java.lang.String(bytes));
                }
            }
        }
        new com.p314xaae8f345.mm.p971x6de15a2e.j1(this, 1000L, null, strArr, strArr2, iArr).a(this.f153532t);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void j1(u31.c cVar) {
        com.p314xaae8f345.mm.p971x6de15a2e.x2.g().f153717a = cVar;
    }

    public void k() {
        boolean l17 = j62.e.g().l("clicfg_pay_mmtls_switch_android", false, true, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "paymmtls: MMAutoAuth clicfg_pay_mmtls_switch_android: %s", java.lang.Boolean.valueOf(l17));
        if (l17 && com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84223xdac2174d()) {
            com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af = this.f153526n;
            new com.p314xaae8f345.mm.p971x6de15a2e.o1(this, 1000L, null, binderC11173x1cfac0af.H, binderC11173x1cfac0af.G, binderC11173x1cfac0af.F).a(this.f153532t);
        }
    }

    public void k0(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(new java.lang.String[0])) {
            return;
        }
        new com.p314xaae8f345.mm.p971x6de15a2e.y1(this, 1000L, null, str, str2).a(this.f153532t);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void k1(java.lang.String str, java.lang.String str2, int[] iArr, int[] iArr2) {
        this.f153524i.m40015x32c52b(this.f153525m, "MMAutoAuth.setIDCHostInfo");
        java.util.List<o45.hh> d17 = o45.hh.d(str2);
        java.util.List<o45.hh> d18 = o45.hh.d(str);
        ((java.util.LinkedList) d18).size();
        ((java.util.LinkedList) d17).size();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (o45.hh hhVar : d17) {
            java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(hhVar.f424479d);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                hashMap.put(hhVar.f424479d, arrayList);
            }
            arrayList.add(hhVar.f424478c);
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        for (o45.hh hhVar2 : d18) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) hashMap2.get(hhVar2.f424479d);
            if (arrayList2 == null) {
                arrayList2 = new java.util.ArrayList();
                hashMap2.put(hhVar2.f424479d, arrayList2);
            }
            arrayList2.add(hhVar2.f424478c);
        }
        new com.p314xaae8f345.mm.p971x6de15a2e.v1(this, 3000L, -1, hashMap, iArr2, hashMap2, iArr).a(this.f153532t);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v
    public void ke(com.p314xaae8f345.mm.p971x6de15a2e.y yVar) {
        this.f153535w = yVar;
    }

    public final int l(com.p314xaae8f345.mm.p971x6de15a2e.z0 z0Var, com.p314xaae8f345.mm.p971x6de15a2e.o0 o0Var) {
        if (com.p314xaae8f345.mm.p971x6de15a2e.x2.h().h()) {
            return -1;
        }
        o45.hg mo48049x2d63726f = z0Var.mo48049x2d63726f();
        com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af = new com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af(this);
        binderC11173x1cfac0af.f153428e = mo48049x2d63726f.mo48041x6bf53a6c();
        int q17 = com.p314xaae8f345.mm.p971x6de15a2e.x2.h().q(z0Var, o0Var, binderC11173x1cfac0af, 0, null);
        if (q17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "auth: net.send err");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "auth: netid=" + q17);
        }
        return q17;
    }

    public void l0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f153524i.m40015x32c52b(this.f153525m, "MMAutoAuth.setFixedHost");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "dkidc setFixedHost debug short:%s:%s long:%s:%s", str, str2, str3, str4);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAutoAuth", "dkidc setFixedHost FAILED ! check assist");
        } else {
            new com.p314xaae8f345.mm.p971x6de15a2e.w1(this, 3000L, -1, str, str2, str3, str4).a(this.f153532t);
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void m0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40529x312e01fd();
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void n0(boolean z17) {
        ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40259x35762fe6(z17);
        if (com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84223xdac2174d()) {
            ((com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80) com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84213x6f964b77(com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.class)).m84364x35762fe6(z17);
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void n1(boolean z17) {
        ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40269x36dcb8f2(z17);
        if (com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84223xdac2174d()) {
            ((com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80) com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84213x6f964b77(com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.class)).m84374x36dcb8f2(z17);
        }
    }

    public final void o0(byte[] bArr, long j17, int i17) {
        java.lang.String str;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "newreg parseHostInfo");
        try {
            r45.zv4 zv4Var = new r45.zv4();
            zv4Var.mo11468x92b714fd(bArr);
            jx3.f.INSTANCE.mo68477x336bdfd8(148L, 23L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "newreg start to parse main hostlist");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            a0(arrayList, arrayList2, arrayList3, zv4Var.A);
            int size = arrayList.size();
            java.lang.String[] strArr = new java.lang.String[size];
            java.lang.String[] strArr2 = new java.lang.String[arrayList2.size()];
            int[] iArr = new int[arrayList3.size()];
            arrayList.toArray(strArr);
            arrayList2.toArray(strArr2);
            java.util.Iterator it = arrayList3.iterator();
            int i18 = 0;
            while (it.hasNext()) {
                iArr[i18] = ((java.lang.Integer) arrayList3.get(((java.lang.Integer) it.next()).intValue())).intValue();
                i18++;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "after parse main host list size [%d]", java.lang.Integer.valueOf(size));
            j0(strArr, strArr2, iArr);
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            r45.jo joVar = zv4Var.f473932p;
            if (joVar != null && (linkedList2 = joVar.f459518h) != null) {
                java.util.Iterator it6 = linkedList2.iterator();
                while (it6.hasNext()) {
                    r45.io ioVar = (r45.io) it6.next();
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = ioVar.f458738g;
                    linkedList3.add(new o45.hh(ioVar.f458735d, ioVar.f458737f.i(), ioVar.f458736e, gVar != null ? gVar.i() : ""));
                    ioVar.f458737f.i();
                }
            }
            java.lang.String c17 = o45.hh.c(linkedList3);
            java.util.LinkedList linkedList4 = new java.util.LinkedList();
            r45.jo joVar2 = zv4Var.f473932p;
            if (joVar2 != null && (linkedList = joVar2.f459517g) != null) {
                java.util.Iterator it7 = linkedList.iterator();
                while (it7.hasNext()) {
                    r45.io ioVar2 = (r45.io) it7.next();
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = ioVar2.f458738g;
                    linkedList4.add(new o45.hh(ioVar2.f458735d, ioVar2.f458737f.i(), ioVar2.f458736e, gVar2 != null ? gVar2.i() : ""));
                    ioVar2.f458737f.i();
                }
            }
            java.lang.String c18 = o45.hh.c(linkedList4);
            r45.rt4 rt4Var = zv4Var.f473936t;
            o45.gh b17 = (rt4Var == null || (str = rt4Var.f466734d) == null) ? null : o45.hh.b(str);
            if (b17 != null) {
                b17.getClass();
                k1(c17, c18, null, b17.f424467a);
            }
            r45.wc wcVar = zv4Var.R;
            if (wcVar.f470590d <= 0 || wcVar.f470591e.isEmpty()) {
                o45.b bVar = new o45.b(0, -1, -1, -1, -1, -1, "");
                jx3.f.INSTANCE.f(32791, bVar.b(), true, true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "AxAuth Report %s", bVar.a());
            } else {
                Z(zv4Var.R, j17, com.p314xaae8f345.mm.p971x6de15a2e.a2.REG);
            }
            r45.cu5 cu5Var = zv4Var.S;
            if (cu5Var == null || cu5Var.f453372d <= 0) {
                return;
            }
            byte[] bArr2 = cu5Var.f453374f.f273689a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr2)) {
                return;
            }
            ((com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0.class)).m37578x8da162c6(bArr2);
            this.f153526n.f153434n = bArr2;
            c0(bArr2, i17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", e17.getLocalizedMessage());
        }
    }

    public final void p(long j17, final com.p314xaae8f345.mm.p971x6de15a2e.a2 a2Var, final java.util.LinkedList linkedList) {
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            final r45.vc vcVar = (r45.vc) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "axauth start. cgi:%s id:%d", vcVar.f469626i, java.lang.Integer.valueOf(vcVar.f469624g));
            int i17 = vcVar.f469621d;
            int mo807x6c193ac1 = new w11.b0(i17, vcVar.f469624g, vcVar.f469626i, i17, vcVar.f469622e, vcVar.f469625h.f453374f.f273689a, 0, j17).mo807x6c193ac1(this, new com.p314xaae8f345.mm.p944x882e457a.u0() { // from class: com.tencent.mm.network.g1$$c
                @Override // com.p314xaae8f345.mm.p944x882e457a.u0
                /* renamed from: onSceneEnd */
                public final void mo815x76e0bfae(int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
                    if (com.p314xaae8f345.mm.p971x6de15a2e.a2.this == com.p314xaae8f345.mm.p971x6de15a2e.a2.REG) {
                        int size = linkedList.size();
                        r45.vc vcVar2 = vcVar;
                        o45.b bVar = new o45.b(size, 0, i19, i18, vcVar2.f469621d, vcVar2.f469624g, vcVar2.f469626i);
                        jx3.f.INSTANCE.f(32791, bVar.b(), true, true);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "AxAuth Report %s", bVar.a());
                    }
                }
            });
            if (mo807x6c193ac1 < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "send axauth fail");
                this.f153526n.Y0(vcVar.f469621d, false, j17);
                if (a2Var == com.p314xaae8f345.mm.p971x6de15a2e.a2.REG) {
                    o45.b bVar = new o45.b(linkedList.size(), mo807x6c193ac1, -1, -1, vcVar.f469621d, vcVar.f469624g, vcVar.f469626i);
                    jx3.f.INSTANCE.f(32791, bVar.b(), true, true);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "AxAuth Report %s", bVar.a());
                }
            }
        }
    }

    public final void p0(byte[] bArr, long j17) {
        java.lang.String str;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "autoauth parseHostInfo");
        if (bArr == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAutoAuth", "null == response");
            return;
        }
        r45.sr6 sr6Var = new r45.sr6();
        try {
            sr6Var.mo11468x92b714fd(bArr);
            int i17 = sr6Var.f467484d;
            if ((i17 & 4) != 0) {
                jx3.f.INSTANCE.mo68477x336bdfd8(148L, 23L, 1L, false);
                r45.vt4 vt4Var = sr6Var.f467487g;
                if (vt4Var != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "autoauth start to parse main hostlist");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    a0(arrayList, arrayList2, arrayList3, vt4Var.f470050d);
                    int size = arrayList.size();
                    java.lang.String[] strArr = new java.lang.String[size];
                    java.lang.String[] strArr2 = new java.lang.String[arrayList2.size()];
                    int[] iArr = new int[arrayList3.size()];
                    arrayList.toArray(strArr);
                    arrayList2.toArray(strArr2);
                    java.util.Iterator it = arrayList3.iterator();
                    int i18 = 0;
                    while (it.hasNext()) {
                        iArr[i18] = ((java.lang.Integer) arrayList3.get(((java.lang.Integer) it.next()).intValue())).intValue();
                        i18++;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "after parse main host list size [%d]", java.lang.Integer.valueOf(size));
                    j0(strArr, strArr2, iArr);
                    java.util.LinkedList linkedList3 = new java.util.LinkedList();
                    r45.jo joVar = vt4Var.f470052f;
                    if (joVar != null && (linkedList2 = joVar.f459518h) != null) {
                        java.util.Iterator it6 = linkedList2.iterator();
                        while (it6.hasNext()) {
                            r45.io ioVar = (r45.io) it6.next();
                            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = ioVar.f458738g;
                            linkedList3.add(new o45.hh(ioVar.f458735d, ioVar.f458737f.i(), ioVar.f458736e, gVar != null ? gVar.i() : ""));
                            ioVar.f458737f.i();
                        }
                    }
                    java.lang.String c17 = o45.hh.c(linkedList3);
                    java.util.LinkedList linkedList4 = new java.util.LinkedList();
                    r45.jo joVar2 = vt4Var.f470052f;
                    if (joVar2 != null && (linkedList = joVar2.f459517g) != null) {
                        java.util.Iterator it7 = linkedList.iterator();
                        while (it7.hasNext()) {
                            r45.io ioVar2 = (r45.io) it7.next();
                            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = ioVar2.f458738g;
                            linkedList4.add(new o45.hh(ioVar2.f458735d, ioVar2.f458737f.i(), ioVar2.f458736e, gVar2 != null ? gVar2.i() : ""));
                            ioVar2.f458737f.i();
                        }
                    }
                    java.lang.String c18 = o45.hh.c(linkedList4);
                    r45.rt4 rt4Var = vt4Var.f470051e;
                    o45.gh b17 = (rt4Var == null || (str = rt4Var.f466734d) == null) ? null : o45.hh.b(str);
                    if (b17 != null) {
                        k1(c17, c18, null, b17.f424467a);
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAutoAuth", "summerauth updateProfile networksect not set!");
            }
            r45.jx3 jx3Var = sr6Var.f467489i;
            com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af = this.f153526n;
            int length = binderC11173x1cfac0af.r(1).length;
            int length2 = binderC11173x1cfac0af.r(2).length;
            int length3 = binderC11173x1cfac0af.r(3).length;
            ((com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0.class)).m37566x32788c9c(binderC11173x1cfac0af.r(1));
            ((com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0.class)).m37577x25e0d3ab(binderC11173x1cfac0af.r(2), binderC11173x1cfac0af.r(3));
            ((com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0.class)).m37576x50d1585d(jx3Var.m75960xfb7e5820());
            java.util.LinkedList linkedList5 = jx3Var.f459731e;
            if (linkedList5 == null || jx3Var.f459730d == 0 || linkedList5.size() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "handleHostAlgo ignore. empty list");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccInfo", "cleanMainHostAlgo");
                binderC11173x1cfac0af.B.clear();
                java.util.Iterator it8 = linkedList5.iterator();
                while (it8.hasNext()) {
                    r45.ix3 ix3Var = (r45.ix3) it8.next();
                    binderC11173x1cfac0af.e(ix3Var.f458922d, ix3Var.f458923e);
                }
            }
            if ((i17 & 8) != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "autoauth start to parse ax hostlist");
                Z(sr6Var.f467488h, j17, com.p314xaae8f345.mm.p971x6de15a2e.a2.AUTH);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "autoauth no need parse ax hostlist");
                binderC11173x1cfac0af.I = true;
                binderC11173x1cfac0af.M();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", e17.getLocalizedMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void p1(java.lang.String str, java.lang.String str2, int i17) {
        ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40263x96ccc477(str, str2, i17);
        if (com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84223xdac2174d()) {
            ((com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80) com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84213x6f964b77(com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.class)).m84368x96ccc477(str, str2, i17);
        }
    }

    public final void q0(byte[] bArr) {
        r45.vt4 vt4Var;
        r45.xb xbVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "ILinkStreamSession setILinkInfo to accinfo");
        if (bArr == null || bArr.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAutoAuth", "setILinkInfo: response is null or empty");
            return;
        }
        r45.sr6 sr6Var = new r45.sr6();
        try {
            sr6Var.mo11468x92b714fd(bArr);
            int i17 = sr6Var.f467484d;
            int i18 = i17 & 1;
            com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af = this.f153526n;
            if (i18 == 0 || (xbVar = sr6Var.f467485e) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAutoAuth", "setILinkInfo: AuthSect not set or missing in response. unifyFlag:%d", java.lang.Integer.valueOf(i17));
            } else {
                r45.cu5 cu5Var = xbVar.F;
                if (cu5Var == null || cu5Var.f453372d <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAutoAuth", "setILinkInfo: JWT data not set in AuthSectResp");
                } else {
                    binderC11173x1cfac0af.f153440t = cu5Var.f453374f.f273689a;
                }
            }
            if ((i17 & 4) == 0 || (vt4Var = sr6Var.f467487g) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAutoAuth", "setILinkInfo: NetworkSect not set or missing in response. unifyFlag:%d", java.lang.Integer.valueOf(i17));
                return;
            }
            r45.cu5 cu5Var2 = vt4Var.f470055i;
            if (cu5Var2 == null || cu5Var2.f453372d <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAutoAuth", "setILinkInfo: iLink network buffer not set in NetworkSectResp");
            } else {
                binderC11173x1cfac0af.f153441u = cu5Var2.f453374f.f273689a;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "setILinkInfo: parse response failed: " + e17.getLocalizedMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void q1(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40270xb8c91725(str, str2, str3);
    }

    public void r0(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return;
        }
        new com.p314xaae8f345.mm.p971x6de15a2e.x1(this, 1000L, null, str, str2).a(this.f153532t);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void r1(boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    /* renamed from: reset */
    public void mo48028x6761d4f() {
        this.f153524i.m40015x32c52b(this.f153525m, "MMAutoAuth.reset");
        new com.p314xaae8f345.mm.p971x6de15a2e.s1(this, 1000L, null).a(this.f153532t);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void s0(java.lang.String str) {
        B = str;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s
    public com.p314xaae8f345.mm.p971x6de15a2e.h0 s1() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    /* renamed from: simpleTestCommand */
    public void mo48029x19d1d47(java.lang.String str) {
        ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40274x19d1d47(str);
    }

    public final void t0(byte[] bArr, int i17) {
        if (bArr == null || bArr.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAutoAuth", "mmpack setServerIndexBuffer: response is null or empty");
            return;
        }
        r45.sr6 sr6Var = new r45.sr6();
        try {
            sr6Var.mo11468x92b714fd(bArr);
            r45.cu5 cu5Var = sr6Var.f467491n;
            if (cu5Var == null || cu5Var.f453372d <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAutoAuth", "mmpack setServerIndexBuffer: ServerIndexBuffer not set in response");
                return;
            }
            byte[] bArr2 = cu5Var.f453374f.f273689a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAutoAuth", "mmpack setServerIndexBuffer: buffer bytes is null or empty");
                return;
            }
            ((com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0.class)).m37578x8da162c6(bArr2);
            this.f153526n.f153434n = bArr2;
            c0(bArr2, i17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "mmpack setServerIndexBuffer: parse response failed: " + e17.getLocalizedMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void u0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "mmpack recoverySession uin");
        com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0 c4437x20da8ce0 = (com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0.class);
        com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af = this.f153526n;
        c4437x20da8ce0.m37565x7e862e61(binderC11173x1cfac0af.f153433m);
        byte[] bArr = binderC11173x1cfac0af.f153434n;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            ((com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0.class)).m37578x8da162c6(bArr);
        }
        ((com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0.class)).m37566x32788c9c(binderC11173x1cfac0af.r(1));
        ((com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0.class)).m37577x25e0d3ab(binderC11173x1cfac0af.r(2), binderC11173x1cfac0af.r(3));
    }

    public void w(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.z0 z0Var, byte[] bArr, int i19) {
        try {
            W(0, i17, i18, str, z0Var, bArr, i19);
        } catch (android.os.RemoteException e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    public void w0(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAutoAuth", "synccheck response is empty");
            return;
        }
        java.lang.String str = "empty";
        boolean z17 = false;
        if (o45.ji.a()) {
            o45.hi hiVar = new o45.hi();
            try {
                hiVar.mo13863x347f4535(bArr);
                byte[] bArr2 = hiVar.f424484e;
                byte[] bArr3 = hiVar.f424485f;
                if (bArr2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "synccheck3 networkid3 is null");
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "synccheck3 networkid3 " + bArr2.length);
                int i17 = hiVar.f424483d;
                boolean z18 = bArr2.length >= 31 && bArr2[0] == 0 && bArr2[10] == 0 && bArr2[20] == 0 && bArr2[30] == 0;
                if (bArr3 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "synccheck3 networkctx3 " + bArr3.length);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "synccheck3 networkctx3 is null");
                }
                com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80 c4569xb3cd6a80 = (com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class);
                if (!z18) {
                    str = new java.lang.String(bArr2);
                }
                c4569xb3cd6a80.m40271xd6b4c1a7("synccheck", str, bArr3 != null ? new java.lang.String(bArr3) : "", i17);
                return;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "synccheck3 parse failed. %s, hex:%s", e17.getLocalizedMessage(), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(bArr));
                jx3.f.INSTANCE.mo68477x336bdfd8(2143L, 1L, 1L, true);
                return;
            }
        }
        o45.ii iiVar = new o45.ii();
        try {
            iiVar.mo13863x347f4535(bArr);
            byte[] bArr4 = iiVar.f424499f;
            if (bArr4 != null) {
                byte[] bArr5 = iiVar.f424500g;
                if (bArr4.length < 31) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "networkid too short: " + bArr4.length);
                } else if (bArr4[0] == 0 && bArr4[10] == 0 && bArr4[20] == 0 && bArr4[30] == 0) {
                    z17 = true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "networkid " + bArr4.length);
                if (bArr5 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "ctx " + bArr5.length);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoAuth", "ctx is null");
                }
                com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80 c4569xb3cd6a802 = (com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class);
                if (!z17) {
                    str = new java.lang.String(bArr4);
                }
                c4569xb3cd6a802.m40271xd6b4c1a7("synccheck", str, new java.lang.String(bArr5), iiVar.f424498e);
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAutoAuth", "newsync parse failed " + e18.getLocalizedMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void y() {
        ((com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.class)).m40462x21976a50();
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void z(java.lang.String str) {
        this.f153524i.m40015x32c52b(this.f153525m, "MMAutoAuth.ipxxStatistics");
        new com.p314xaae8f345.mm.p971x6de15a2e.h1(this, 1000L, null, str).a(this.f153532t);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public java.lang.String z0() {
        return ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40242x749b3e8b();
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v
    /* renamed from: G, reason: collision with other method in class */
    public com.p314xaae8f345.mm.p971x6de15a2e.r mo180101G() {
        return this.f153526n;
    }
}
