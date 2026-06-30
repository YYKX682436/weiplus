package n61;

/* loaded from: classes11.dex */
public class b extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f416711d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f416712e;

    /* renamed from: f, reason: collision with root package name */
    public final long f416713f;

    public b(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, boolean z17) {
        byte[] d17;
        this.f416713f = 0L;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.fi();
        lVar.f152198b = new r45.gi();
        lVar.f152199c = "/cgi-bin/micromsg-bin/bindqq";
        lVar.f152200d = 144;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f416712e = a17;
        this.f416713f = j17;
        r45.fi fiVar = (r45.fi) a17.f152243a.f152217a;
        fiVar.f455895d = new kk.v(j17).f390011d;
        fiVar.f455896e = "";
        fiVar.f455897f = "";
        fiVar.f455898g = "";
        fiVar.f455899h = "";
        r45.du5 du5Var = new r45.du5();
        du5Var.f454289d = "";
        du5Var.f454290e = true;
        fiVar.f455901m = du5Var;
        fiVar.f455900i = 1;
        if (z17) {
            d17 = gm0.j1.b().l().c(j17, str3);
        } else {
            d17 = gm0.j1.b().l().d(j17, kk.k.g(str.getBytes()), true);
        }
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(d17);
        fiVar.f455906r = cu5Var;
        java.lang.String str5 = (java.lang.String) gm0.j1.u().c().l(47, null);
        java.lang.String str6 = str5 != null ? str5 : "";
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(str6));
        fiVar.f455902n = cu5Var2;
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Long.valueOf(j17);
        objArr[2] = java.lang.Integer.valueOf(d17 == null ? -1 : d17.length);
        objArr[3] = str3;
        objArr[4] = str2;
        objArr[5] = str4;
        objArr[6] = str6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBindQQ", "init opcode:%d qq:%d  wtbuf:%d img[%s,%s,%s] ksid:%s", objArr);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f416711d = u0Var;
        return mo9409x10f9447a(sVar, this.f416712e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 144;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        int i27;
        int i28 = i19;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f416712e;
        r45.fi fiVar = (r45.fi) oVar.f152243a.f152217a;
        r45.gi giVar = (r45.gi) oVar.f152244b.f152233a;
        byte[] d17 = x51.j1.d(giVar.f456800s);
        boolean f17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(d17) ? gm0.j1.b().l().f(new kk.v(fiVar.f455895d).longValue(), d17) : false;
        if (f17 && gm0.j1.a()) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MANUAL_AUTH_AS_QQ_ACCOUNT_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        }
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(i18);
        objArr[1] = java.lang.Integer.valueOf(i19);
        objArr[2] = java.lang.Boolean.valueOf(f17);
        objArr[3] = java.lang.Integer.valueOf(d17 == null ? -1 : d17.length);
        objArr[4] = giVar.f456788d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBindQQ", "onGYNetEnd[%d,%d] wtret:%b wtRespBuf:%d imgsid:%s", objArr);
        if (i18 == 0 && i28 == 0) {
            int q17 = gm0.j1.u().c().q(9, 0);
            gm0.j1.u().c().w(9, java.lang.Integer.valueOf(fiVar.f455895d));
            if (q17 != 0) {
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LAST_LOGIN_USERNAME_STRING;
                if (c17.m(u3Var, "").equals(java.lang.String.valueOf(q17))) {
                    gm0.j1.u().c().x(u3Var, c01.z1.r());
                }
                java.util.Iterator it = ((java.util.HashSet) c01.uc.f119047c.d()).iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    java.lang.String valueOf = java.lang.String.valueOf(q17);
                    c01.uc ucVar = c01.uc.f119047c;
                    if (valueOf.equals(ucVar.c(str2, "login_user_name"))) {
                        ucVar.h(str2, "login_user_name", str2);
                    }
                }
            }
            if (fiVar.f455900i == 1) {
                gm0.j1.u().c().w(17, java.lang.Integer.valueOf(giVar.f456790f));
            }
            xg3.r0 hj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).hj();
            java.lang.String str3 = giVar.f456792h;
            boolean z17 = giVar.f456791g == 1 ? 1 : 0;
            com.p314xaae8f345.mm.p2621x8fb0427b.ka kaVar = (com.p314xaae8f345.mm.p2621x8fb0427b.ka) hj6;
            kaVar.getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RoleStorage", "insert role info failed: empty user");
            } else {
                com.p314xaae8f345.mm.p2621x8fb0427b.ja n07 = kaVar.n0(str3);
                if (n07 == null) {
                    kaVar.u0(new com.p314xaae8f345.mm.p2621x8fb0427b.ja(str3, z17, true, 2));
                } else {
                    if (z17 != 0) {
                        n07.f276593d |= z17;
                    } else {
                        n07.f276593d &= -2;
                    }
                    n07.f276590a = 4;
                    kaVar.z0(n07);
                }
            }
            int i29 = fiVar.f455895d;
            if (i29 != 0) {
                i27 = 3;
                ((com.p314xaae8f345.mm.p2621x8fb0427b.ka) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).hj()).y0("" + new kk.v(i29) + "@qqim", 3);
            } else {
                i27 = 3;
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).hj(i29, i27);
            gm0.j1.u().c().w(32, fiVar.f455896e);
            gm0.j1.u().c().w(33, fiVar.f455897f);
            java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(gm0.j1.b().l().b(new kk.v(fiVar.f455895d).longValue()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBindQQ", "onGYNetEnd wtret:%b newa2key:%s ", java.lang.Boolean.valueOf(f17), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(l17));
            gm0.j1.u().c().w(72, l17);
            gm0.j1.u().c().w(46, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(x51.j1.d(giVar.f456796o)));
            java.lang.String l18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(x51.j1.d(fiVar.f455902n));
            gm0.j1.u().c().w(47, l18);
            gm0.j1.u().f354681a.f(18, l18);
            gm0.j1.u().c().w(-1535680990, giVar.f456794m);
        } else if (i18 == 4) {
            gm0.j1.u().c().w(32, "");
            gm0.j1.u().c().w(33, "");
        }
        if (fiVar.f455900i == 3 && i28 == -3) {
            i28 = 10000;
        }
        this.f416711d.mo815x76e0bfae(i18, i28, str, this);
    }

    public b(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, java.lang.String str5, java.lang.String str6, boolean z17) {
        this(j17, str, str2, str3, str4, i17, z17);
        r45.fi fiVar = (r45.fi) this.f416712e.f152243a.f152217a;
        fiVar.f455904p = str5;
        fiVar.f455905q = str6;
    }
}
