package r61;

/* loaded from: classes11.dex */
public class e1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: i, reason: collision with root package name */
    public static int f474392i;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f474393d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f474394e;

    /* renamed from: f, reason: collision with root package name */
    public int f474395f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f474396g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f474397h;

    public e1(java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this(str, i17, str2, i18, str3);
        this.f474396g = str4;
        this.f474397h = str5;
        r45.di diVar = (r45.di) this.f474393d.f152243a.f152217a;
        diVar.f454023o = str4;
        diVar.f454024p = str5;
    }

    public final boolean H(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return false;
        }
        return (str.startsWith("+") || str2.startsWith("+")) ? str.endsWith(str2) || str2.endsWith(str) : str.equals(str2);
    }

    public int I() {
        return ((r45.di) this.f474393d.f152243a.f152217a).f454017f;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        java.lang.String str;
        this.f474394e = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f474393d;
        r45.di diVar = (r45.di) oVar.f152243a.f152217a;
        java.lang.String str2 = diVar.f454016e;
        if (str2 == null || str2.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneBindOpMobile", "doScene getMobile Error: " + diVar.f454016e);
            return -1;
        }
        int i17 = diVar.f454017f;
        if ((i17 != 2 && i17 != 19) || ((str = diVar.f454018g) != null && str.length() > 0)) {
            return mo9409x10f9447a(sVar, oVar, this);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneBindOpMobile", "doScene getVerifyCode Error: " + diVar.f454016e);
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 132;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f474393d;
        r45.di diVar = (r45.di) oVar.f152243a.f152217a;
        r45.ei eiVar = (r45.ei) oVar.f152244b.f152233a;
        if (eiVar != null) {
            int i27 = eiVar.f455058w;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBindOpMobile", "summerauth mmtls bindop:%s", java.lang.Integer.valueOf(i27));
            gm0.j1.i();
            gm0.j1.u().f354681a.f(47, java.lang.Integer.valueOf(i27));
            com.p314xaae8f345.mm.p971x6de15a2e.s sVar = gm0.j1.n().f354821b.f152297d;
            if (sVar != null) {
                sVar.n1((i27 & 1) == 0);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBindOpMobile", "onGYNetEnd response JSON %s", eiVar.mo12245xcc313de3());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBindOpMobile", "summerauth mmtls bindop not set as ret:%s", eiVar);
        }
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneBindOpMobile", "onGYNetEnd  errType:" + i18 + " errCode:" + i19);
            if (i18 != 4 || i19 != -240) {
                this.f474394e.mo815x76e0bfae(i18, i19, str, this);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBindOpMobile", "summerauth bindop MM_ERR_AUTO_RETRY_REQUEST redirectCount:%s", java.lang.Integer.valueOf(this.f474395f));
            int i28 = this.f474395f - 1;
            this.f474395f = i28;
            if (i28 <= 0) {
                this.f474394e.mo815x76e0bfae(3, -1, "", this);
                return;
            } else {
                mo807x6c193ac1(m47995xb7ba1aa7(), this.f474394e);
                return;
            }
        }
        int i29 = diVar.f454017f;
        if (i29 == 2 || i29 == 4 || i29 == 25 || i29 == 11 || i29 == 19) {
            gm0.j1.u().c().w(4097, "");
            java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(6, "");
            java.lang.String str3 = diVar.f454016e;
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 g17 = c01.z1.g();
            c01.uc ucVar = c01.uc.f119047c;
            java.lang.String c17 = ucVar.c(g17.d1(), "login_user_name");
            java.lang.String u17 = gm0.j1.u().c().u(6, "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBindOpMobile", "checkSwitchInfoWhenMobileChange: wxid=%s, switchLastUsername=%s oldMobile=%s newMobile=%s", g17.d1(), c17, u17, str3);
            if (H(u17, c17)) {
                ucVar.h(g17.d1(), "login_user_name", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u1(str3, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u1(g17.t0(), g17.d1())));
            }
            c01.b9 b9Var = c01.b9.f118602c;
            java.lang.String a17 = b9Var.a("login_user_name", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBindOpMobile", "checkSwitchInfoWhenMobileChange: wxid=%s, loginUsername=%s oldMobile=%s newMobile=%s", g17.d1(), a17, u17, str3);
            if (H(u17, a17)) {
                b9Var.d("login_user_name", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u1(str3, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u1(g17.t0(), g17.d1())));
            }
            gm0.j1.u().c().w(6, diVar.f454016e);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LAST_LOGIN_USERNAME_STRING;
                if (c18.m(u3Var, "").equals(str2)) {
                    gm0.j1.u().c().x(u3Var, diVar.f454016e);
                }
                java.util.Iterator it = ((java.util.HashSet) ucVar.d()).iterator();
                while (it.hasNext()) {
                    java.lang.String str4 = (java.lang.String) it.next();
                    c01.uc ucVar2 = c01.uc.f119047c;
                    if (str2.equals(ucVar2.c(str4, "login_user_name"))) {
                        ucVar2.h(str4, "login_user_name", diVar.f454016e);
                    }
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f474396g) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f474397h)) {
                r61.q0.k(true);
            }
            if (diVar.f454017f == 19) {
                gm0.j1.u().c().w(12322, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(4, 3);
        } else if (i29 == 3) {
            gm0.j1.u().c().w(4097, "");
            gm0.j1.u().c().w(6, "");
            gm0.j1.u().c().w(12322, null);
            gm0.j1.u().c().w(64, java.lang.Integer.valueOf(eiVar.f455051p));
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6199x6e6a85ab c6199x6e6a85ab = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6199x6e6a85ab();
            am.zz zzVar = c6199x6e6a85ab.f136453g;
            zzVar.f90150a = false;
            zzVar.f90151b = true;
            c6199x6e6a85ab.e();
            ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
            r61.b wi6 = m61.k.wi();
            if (wi6.f474352d.mo70514xb06685ab("addr_upload2", null, null) > 0) {
                wi6.b(5, wi6, null);
            }
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator it6 = ((java.util.ArrayList) ((com.p314xaae8f345.mm.p2621x8fb0427b.q7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ui()).J0(0)).iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.p7 p7Var = (com.p314xaae8f345.mm.p2621x8fb0427b.p7) it6.next();
                int i37 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().D3(p7Var.f66491xbeb3161d).f277897g;
                if (i37 == 10 || i37 == 11) {
                    hashSet.add(p7Var.f66493x114ef53e);
                }
            }
            hashSet.size();
            java.util.Iterator it7 = hashSet.iterator();
            while (it7.hasNext()) {
                r61.q0.c(0L, (java.lang.String) it7.next());
            }
        }
        this.f474394e.mo815x76e0bfae(i18, i19, str, this);
    }

    public e1(java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4) {
        this(str, i17, str2, i18, str3);
        ((r45.di) this.f474393d.f152243a.f152217a).f454021m = str4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r6) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b9, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cd, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r6) == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e1(java.lang.String r5, int r6, java.lang.String r7, int r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r61.e1.<init>(java.lang.String, int, java.lang.String, int, java.lang.String):void");
    }
}
