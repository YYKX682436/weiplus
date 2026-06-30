package com.p314xaae8f345.mm.p957x53236a1b;

/* loaded from: classes12.dex */
public class v0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f152959d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.v0 f152960e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f152961f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f152962g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f152963h;

    /* renamed from: i, reason: collision with root package name */
    public int f152964i;

    /* renamed from: m, reason: collision with root package name */
    public int f152965m;

    /* renamed from: n, reason: collision with root package name */
    public int f152966n;

    /* renamed from: o, reason: collision with root package name */
    public int f152967o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f152968p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f152969q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f152970r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f152971s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f152972t;

    public v0(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this("", "", i17, str, str2, str3, 0, "", false, false);
    }

    public java.lang.String H() {
        com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var = this.f152960e;
        return ((o45.tg) ((c01.f9) v0Var).f118717c).f424548a.f467485e == null ? "" : ((o45.tg) ((c01.f9) v0Var).f118717c).f424548a.f467485e.f471466s;
    }

    public java.lang.String I() {
        return ((o45.tg) ((c01.f9) this.f152960e).f118717c).f424548a.f467485e.f471468u;
    }

    public java.lang.String J() {
        r45.w56 w56Var;
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var = this.f152960e;
        if (((o45.tg) ((c01.f9) v0Var).f118717c).f424548a.f467485e != null && (w56Var = ((o45.tg) ((c01.f9) v0Var).f118717c).f424548a.f467485e.f471467t) != null && (linkedList = w56Var.f470438e) != null && linkedList.size() > 0) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.gg6 gg6Var = (r45.gg6) it.next();
                if (gg6Var.f456770d == 16) {
                    return gg6Var.f456771e;
                }
            }
        }
        return "";
    }

    public byte[] K() {
        com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var = this.f152960e;
        if (((o45.tg) ((c01.f9) v0Var).f118717c).f424548a.f467485e == null) {
            return new byte[0];
        }
        int N = N();
        if (N == 3) {
            if (((o45.tg) ((c01.f9) v0Var).f118717c).f424548a.f467485e.f471461n != null) {
                return x51.j1.e(((o45.tg) ((c01.f9) v0Var).f118717c).f424548a.f467485e.f471461n.f467815e, new byte[0]);
            }
        } else if (N == 1) {
            if (((o45.tg) ((c01.f9) v0Var).f118717c).f424548a.f467485e.f471460m != null) {
                return x51.j1.e(((o45.tg) ((c01.f9) v0Var).f118717c).f424548a.f467485e.f471460m.f451332g, new byte[0]);
            }
        } else if (N == 2 && ((o45.sg) v0Var.mo47979x2d63726f()).f424539b.f459371d != null) {
            gm0.j1.b().l().f(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(((o45.sg) v0Var.mo47979x2d63726f()).f424539b.f459371d.f460251f, 0L), x51.j1.d(((o45.tg) ((c01.f9) v0Var).f118717c).f424548a.f467485e.f471459i));
            return gm0.j1.b().l().e(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(((o45.sg) v0Var.mo47979x2d63726f()).f424539b.f459371d.f460251f, 0L));
        }
        return new byte[0];
    }

    public java.lang.String L() {
        com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var = this.f152960e;
        if (((o45.tg) ((c01.f9) v0Var).f118717c).f424548a.f467485e == null || N() != 1 || ((o45.tg) ((c01.f9) v0Var).f118717c).f424548a.f467485e.f471460m == null) {
            return "";
        }
        if (((o45.tg) ((c01.f9) v0Var).f118717c).f424548a.f467485e.f471460m.f451329d != null) {
            return ((o45.tg) ((c01.f9) v0Var).f118717c).f424548a.f467485e.f471460m.f451329d;
        }
        return null;
    }

    public java.lang.String M() {
        com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var = this.f152960e;
        if (((o45.tg) ((c01.f9) v0Var).f118717c).f424548a.f467485e == null) {
            return "";
        }
        int N = N();
        if (N == 3) {
            if (((o45.tg) ((c01.f9) v0Var).f118717c).f424548a.f467485e.f471461n == null) {
                return "";
            }
            java.lang.String str = ((o45.tg) ((c01.f9) v0Var).f118717c).f424548a.f467485e.f471461n.f467814d;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            return str == null ? "" : str;
        }
        if (N != 1 || ((o45.tg) ((c01.f9) v0Var).f118717c).f424548a.f467485e.f471460m == null) {
            return "";
        }
        java.lang.String str2 = ((o45.tg) ((c01.f9) v0Var).f118717c).f424548a.f467485e.f471460m.f451331f;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return str2 == null ? "" : str2;
    }

    public int N() {
        if (((o45.tg) ((c01.f9) this.f152960e).f118717c).f424548a.f467485e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneManualAuth", "getSecCodeType ERROR AuthSectResp or WxVerifyCodeRespInfo is null");
            return 0;
        }
        int i17 = this.f152964i;
        if (i17 != 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneManualAuth", "getSecCodeType ERROR errType :%d", java.lang.Integer.valueOf(i17));
            return 0;
        }
        int i18 = this.f152965m;
        if (i18 == -311) {
            return 2;
        }
        if (i18 == -6) {
            return 1;
        }
        return i18 == -310 ? 3 : 0;
    }

    public int O() {
        r45.w56 w56Var;
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var = this.f152960e;
        if (((o45.tg) ((c01.f9) v0Var).f118717c).f424548a.f467485e == null || (w56Var = ((o45.tg) ((c01.f9) v0Var).f118717c).f424548a.f467485e.f471467t) == null || (linkedList = w56Var.f470438e) == null || linkedList.size() <= 0) {
            return 0;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.gg6 gg6Var = (r45.gg6) it.next();
            if (gg6Var.f456770d == 11) {
                return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(gg6Var.f456771e, 0);
            }
        }
        return 0;
    }

    public int P() {
        r45.w56 w56Var;
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var = this.f152960e;
        if (((o45.tg) ((c01.f9) v0Var).f118717c).f424548a.f467485e == null || (w56Var = ((o45.tg) ((c01.f9) v0Var).f118717c).f424548a.f467485e.f471467t) == null || (linkedList = w56Var.f470438e) == null || linkedList.size() <= 0) {
            return 0;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.gg6 gg6Var = (r45.gg6) it.next();
            if (gg6Var.f456770d == 13) {
                return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(gg6Var.f456771e, 0);
            }
        }
        return 0;
    }

    public com.p314xaae8f345.mm.p957x53236a1b.C11133xdc5bf27e Q() {
        java.lang.String str;
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var = this.f152960e;
        if (((o45.tg) ((c01.f9) v0Var).f118717c).f424548a.f467485e == null) {
            return null;
        }
        r45.w56 w56Var = ((o45.tg) ((c01.f9) v0Var).f118717c).f424548a.f467485e.f471467t;
        if (w56Var != null && (linkedList = w56Var.f470438e) != null && linkedList.size() > 0) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.gg6 gg6Var = (r45.gg6) it.next();
                if (gg6Var.f456770d == 12) {
                    str = gg6Var.f456771e;
                    break;
                }
            }
        }
        str = null;
        if (str == null) {
            return null;
        }
        try {
            return new com.p314xaae8f345.mm.p957x53236a1b.f().a(str);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneManualAuth", e17, "", new java.lang.Object[0]);
            return null;
        } catch (org.xmlpull.v1.XmlPullParserException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneManualAuth", e18, "", new java.lang.Object[0]);
            return null;
        }
    }

    public java.lang.String R() {
        return ((o45.tg) ((c01.f9) this.f152960e).f118717c).f424548a.f467486f.f458175h;
    }

    public boolean S() {
        return (((o45.tg) ((c01.f9) this.f152960e).f118717c).f424548a.f467485e.f471471x & 16) != 0;
    }

    public void T(java.lang.String str) {
        r45.ji4 ji4Var = ((o45.sg) this.f152960e.mo47979x2d63726f()).f424539b;
        r45.ki4 ki4Var = ji4Var.f459371d;
        ki4Var.f460252g = str;
        ki4Var.f460253h = str;
        r45.zd zdVar = ji4Var.f459372e.f458598d;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(new byte[0]);
        zdVar.f473455d = cu5Var;
        this.f152961f = str;
        this.f152962g = str;
    }

    public com.p314xaae8f345.mm.p957x53236a1b.v0 U(boolean z17) {
        this.f152972t = z17;
        return this;
    }

    public boolean V() {
        r45.w56 w56Var;
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var = this.f152960e;
        if (((o45.tg) ((c01.f9) v0Var).f118717c).f424548a.f467485e != null && (w56Var = ((o45.tg) ((c01.f9) v0Var).f118717c).f424548a.f467485e.f471467t) != null && (linkedList = w56Var.f470438e) != null && linkedList.size() > 0) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r45.gg6 gg6Var = (r45.gg6) it.next();
                if (gg6Var.f456770d == 18) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(gg6Var.f456771e, 0) == 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var = this.f152960e;
        r45.ji4 ji4Var = ((o45.sg) v0Var.mo47979x2d63726f()).f424539b;
        r45.ki4 ki4Var = ji4Var.f459371d;
        ki4Var.f460254i = this.f152969q;
        ki4Var.f460255m = this.f152970r;
        ji4Var.f459372e.E = this.f152971s;
        this.f152959d = u0Var;
        return mo9409x10f9447a(sVar, v0Var, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return o45.ag.f424425a ? 252 : 701;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x033e  */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo804x5f9cdc6f(int r27, int r28, int r29, java.lang.String r30, com.p314xaae8f345.mm.p971x6de15a2e.v0 r31, byte[] r32) {
        /*
            Method dump skipped, instructions count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p957x53236a1b.v0.mo804x5f9cdc6f(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 5;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: setSecurityCheckError */
    public void mo14485xb35c0942(com.p314xaae8f345.mm.p944x882e457a.n1 n1Var) {
    }

    public v0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        this(str, str2, 0, "", "", "", i17, str3, false, false);
    }

    public v0(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, java.lang.String str4, int i17) {
        this(str2, str3, 0, "", "", "", i17, str4, z17, false);
        this.f152968p = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v0(java.lang.String r28, java.lang.String r29, int r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, int r34, java.lang.String r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p957x53236a1b.v0.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, boolean, boolean):void");
    }
}
