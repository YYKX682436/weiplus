package com.tencent.mm.modelsimple;

/* loaded from: classes12.dex */
public class v0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f71426d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.network.v0 f71427e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f71428f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f71429g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f71430h;

    /* renamed from: i, reason: collision with root package name */
    public int f71431i;

    /* renamed from: m, reason: collision with root package name */
    public int f71432m;

    /* renamed from: n, reason: collision with root package name */
    public int f71433n;

    /* renamed from: o, reason: collision with root package name */
    public int f71434o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f71435p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f71436q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f71437r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f71438s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f71439t;

    public v0(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this("", "", i17, str, str2, str3, 0, "", false, false);
    }

    public java.lang.String H() {
        com.tencent.mm.network.v0 v0Var = this.f71427e;
        return ((o45.tg) ((c01.f9) v0Var).f37184c).f343015a.f385952e == null ? "" : ((o45.tg) ((c01.f9) v0Var).f37184c).f343015a.f385952e.f389933s;
    }

    public java.lang.String I() {
        return ((o45.tg) ((c01.f9) this.f71427e).f37184c).f343015a.f385952e.f389935u;
    }

    public java.lang.String J() {
        r45.w56 w56Var;
        java.util.LinkedList linkedList;
        com.tencent.mm.network.v0 v0Var = this.f71427e;
        if (((o45.tg) ((c01.f9) v0Var).f37184c).f343015a.f385952e != null && (w56Var = ((o45.tg) ((c01.f9) v0Var).f37184c).f343015a.f385952e.f389934t) != null && (linkedList = w56Var.f388905e) != null && linkedList.size() > 0) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.gg6 gg6Var = (r45.gg6) it.next();
                if (gg6Var.f375237d == 16) {
                    return gg6Var.f375238e;
                }
            }
        }
        return "";
    }

    public byte[] K() {
        com.tencent.mm.network.v0 v0Var = this.f71427e;
        if (((o45.tg) ((c01.f9) v0Var).f37184c).f343015a.f385952e == null) {
            return new byte[0];
        }
        int N = N();
        if (N == 3) {
            if (((o45.tg) ((c01.f9) v0Var).f37184c).f343015a.f385952e.f389928n != null) {
                return x51.j1.e(((o45.tg) ((c01.f9) v0Var).f37184c).f343015a.f385952e.f389928n.f386282e, new byte[0]);
            }
        } else if (N == 1) {
            if (((o45.tg) ((c01.f9) v0Var).f37184c).f343015a.f385952e.f389927m != null) {
                return x51.j1.e(((o45.tg) ((c01.f9) v0Var).f37184c).f343015a.f385952e.f389927m.f369799g, new byte[0]);
            }
        } else if (N == 2 && ((o45.sg) v0Var.getReqObj()).f343006b.f377838d != null) {
            gm0.j1.b().l().f(com.tencent.mm.sdk.platformtools.t8.V(((o45.sg) v0Var.getReqObj()).f343006b.f377838d.f378718f, 0L), x51.j1.d(((o45.tg) ((c01.f9) v0Var).f37184c).f343015a.f385952e.f389926i));
            return gm0.j1.b().l().e(com.tencent.mm.sdk.platformtools.t8.V(((o45.sg) v0Var.getReqObj()).f343006b.f377838d.f378718f, 0L));
        }
        return new byte[0];
    }

    public java.lang.String L() {
        com.tencent.mm.network.v0 v0Var = this.f71427e;
        if (((o45.tg) ((c01.f9) v0Var).f37184c).f343015a.f385952e == null || N() != 1 || ((o45.tg) ((c01.f9) v0Var).f37184c).f343015a.f385952e.f389927m == null) {
            return "";
        }
        if (((o45.tg) ((c01.f9) v0Var).f37184c).f343015a.f385952e.f389927m.f369796d != null) {
            return ((o45.tg) ((c01.f9) v0Var).f37184c).f343015a.f385952e.f389927m.f369796d;
        }
        return null;
    }

    public java.lang.String M() {
        com.tencent.mm.network.v0 v0Var = this.f71427e;
        if (((o45.tg) ((c01.f9) v0Var).f37184c).f343015a.f385952e == null) {
            return "";
        }
        int N = N();
        if (N == 3) {
            if (((o45.tg) ((c01.f9) v0Var).f37184c).f343015a.f385952e.f389928n == null) {
                return "";
            }
            java.lang.String str = ((o45.tg) ((c01.f9) v0Var).f37184c).f343015a.f385952e.f389928n.f386281d;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            return str == null ? "" : str;
        }
        if (N != 1 || ((o45.tg) ((c01.f9) v0Var).f37184c).f343015a.f385952e.f389927m == null) {
            return "";
        }
        java.lang.String str2 = ((o45.tg) ((c01.f9) v0Var).f37184c).f343015a.f385952e.f389927m.f369798f;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str2 == null ? "" : str2;
    }

    public int N() {
        if (((o45.tg) ((c01.f9) this.f71427e).f37184c).f343015a.f385952e == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneManualAuth", "getSecCodeType ERROR AuthSectResp or WxVerifyCodeRespInfo is null");
            return 0;
        }
        int i17 = this.f71431i;
        if (i17 != 4) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneManualAuth", "getSecCodeType ERROR errType :%d", java.lang.Integer.valueOf(i17));
            return 0;
        }
        int i18 = this.f71432m;
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
        com.tencent.mm.network.v0 v0Var = this.f71427e;
        if (((o45.tg) ((c01.f9) v0Var).f37184c).f343015a.f385952e == null || (w56Var = ((o45.tg) ((c01.f9) v0Var).f37184c).f343015a.f385952e.f389934t) == null || (linkedList = w56Var.f388905e) == null || linkedList.size() <= 0) {
            return 0;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.gg6 gg6Var = (r45.gg6) it.next();
            if (gg6Var.f375237d == 11) {
                return com.tencent.mm.sdk.platformtools.t8.P(gg6Var.f375238e, 0);
            }
        }
        return 0;
    }

    public int P() {
        r45.w56 w56Var;
        java.util.LinkedList linkedList;
        com.tencent.mm.network.v0 v0Var = this.f71427e;
        if (((o45.tg) ((c01.f9) v0Var).f37184c).f343015a.f385952e == null || (w56Var = ((o45.tg) ((c01.f9) v0Var).f37184c).f343015a.f385952e.f389934t) == null || (linkedList = w56Var.f388905e) == null || linkedList.size() <= 0) {
            return 0;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.gg6 gg6Var = (r45.gg6) it.next();
            if (gg6Var.f375237d == 13) {
                return com.tencent.mm.sdk.platformtools.t8.P(gg6Var.f375238e, 0);
            }
        }
        return 0;
    }

    public com.tencent.mm.modelsimple.BindWordingContent Q() {
        java.lang.String str;
        java.util.LinkedList linkedList;
        com.tencent.mm.network.v0 v0Var = this.f71427e;
        if (((o45.tg) ((c01.f9) v0Var).f37184c).f343015a.f385952e == null) {
            return null;
        }
        r45.w56 w56Var = ((o45.tg) ((c01.f9) v0Var).f37184c).f343015a.f385952e.f389934t;
        if (w56Var != null && (linkedList = w56Var.f388905e) != null && linkedList.size() > 0) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.gg6 gg6Var = (r45.gg6) it.next();
                if (gg6Var.f375237d == 12) {
                    str = gg6Var.f375238e;
                    break;
                }
            }
        }
        str = null;
        if (str == null) {
            return null;
        }
        try {
            return new com.tencent.mm.modelsimple.f().a(str);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneManualAuth", e17, "", new java.lang.Object[0]);
            return null;
        } catch (org.xmlpull.v1.XmlPullParserException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneManualAuth", e18, "", new java.lang.Object[0]);
            return null;
        }
    }

    public java.lang.String R() {
        return ((o45.tg) ((c01.f9) this.f71427e).f37184c).f343015a.f385953f.f376642h;
    }

    public boolean S() {
        return (((o45.tg) ((c01.f9) this.f71427e).f37184c).f343015a.f385952e.f389938x & 16) != 0;
    }

    public void T(java.lang.String str) {
        r45.ji4 ji4Var = ((o45.sg) this.f71427e.getReqObj()).f343006b;
        r45.ki4 ki4Var = ji4Var.f377838d;
        ki4Var.f378719g = str;
        ki4Var.f378720h = str;
        r45.zd zdVar = ji4Var.f377839e.f377065d;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(new byte[0]);
        zdVar.f391922d = cu5Var;
        this.f71428f = str;
        this.f71429g = str;
    }

    public com.tencent.mm.modelsimple.v0 U(boolean z17) {
        this.f71439t = z17;
        return this;
    }

    public boolean V() {
        r45.w56 w56Var;
        java.util.LinkedList linkedList;
        com.tencent.mm.network.v0 v0Var = this.f71427e;
        if (((o45.tg) ((c01.f9) v0Var).f37184c).f343015a.f385952e != null && (w56Var = ((o45.tg) ((c01.f9) v0Var).f37184c).f343015a.f385952e.f389934t) != null && (linkedList = w56Var.f388905e) != null && linkedList.size() > 0) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r45.gg6 gg6Var = (r45.gg6) it.next();
                if (gg6Var.f375237d == 18) {
                    if (com.tencent.mm.sdk.platformtools.t8.P(gg6Var.f375238e, 0) == 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.network.v0 v0Var = this.f71427e;
        r45.ji4 ji4Var = ((o45.sg) v0Var.getReqObj()).f343006b;
        r45.ki4 ki4Var = ji4Var.f377838d;
        ki4Var.f378721i = this.f71436q;
        ki4Var.f378722m = this.f71437r;
        ji4Var.f377839e.E = this.f71438s;
        this.f71426d = u0Var;
        return dispatch(sVar, v0Var, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return o45.ag.f342892a ? 252 : 701;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x033e  */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r27, int r28, int r29, java.lang.String r30, com.tencent.mm.network.v0 r31, byte[] r32) {
        /*
            Method dump skipped, instructions count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelsimple.v0.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 5;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }

    @Override // com.tencent.mm.modelbase.m1
    public void setSecurityCheckError(com.tencent.mm.modelbase.n1 n1Var) {
    }

    public v0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        this(str, str2, 0, "", "", "", i17, str3, false, false);
    }

    public v0(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, java.lang.String str4, int i17) {
        this(str2, str3, 0, "", "", "", i17, str4, z17, false);
        this.f71435p = str;
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelsimple.v0.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, boolean, boolean):void");
    }
}
