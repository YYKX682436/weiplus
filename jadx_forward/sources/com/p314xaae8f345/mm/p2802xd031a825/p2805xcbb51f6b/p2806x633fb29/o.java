package com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29;

/* loaded from: classes9.dex */
public abstract class o extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0 {

    /* renamed from: IS_SPLIT_CGI */
    public static final boolean f39875xdd5460cb = true;
    public static final java.lang.String TAG = "MicroMsg.NetSenceTenPayBase";

    /* renamed from: cgiFunNameVector */
    public static java.util.Vector<java.lang.String> f39876xb743a08 = new java.util.Vector<>();

    /* renamed from: isFake */
    protected boolean f39877xb9a2b39f = false;

    static {
        int i17 = 0;
        while (true) {
            java.lang.String[] strArr = h45.w.f360500b;
            if (i17 >= strArr.length) {
                return;
            }
            f39876xb743a08.add(strArr[i17]);
            i17++;
        }
    }

    /* renamed from: canRetry */
    public boolean mo83038xf7b914b8() {
        return true;
    }

    /* renamed from: certSignConfig */
    public void m83039x5a3f54a3() {
        if (f39876xb743a08.contains(this.f295573rr.f152245c)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "cert try get errormsg %s", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.j.b().c()));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.j.b().e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        r45.fl6 fl6Var = (r45.fl6) this.f295573rr.f152243a.f152217a;
        r45.cu5 cu5Var = fl6Var.f455962f;
        java.lang.String str = cu5Var != null ? new java.lang.String(cu5Var.f453374f.f273689a) : "";
        r45.cu5 cu5Var2 = fl6Var.f455963g;
        java.lang.String str2 = new java.lang.String((str + "&&" + (cu5Var2 != null ? new java.lang.String(cu5Var2.f453374f.f273689a) : "")).getBytes());
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.c().getClass();
        java.lang.String b17 = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.b();
        if (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.j.b().f(b17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(414L, 20L, 1L, true);
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.j b18 = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.j.b();
            b18.getClass();
            java.lang.String a17 = b18.a(b17, str2.getBytes(java.nio.charset.StandardCharsets.UTF_8));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                g0Var.d(20743, "user_identification", "pay_cert_sign", "", "", "", "", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.j.b().c()));
            }
            g0Var.mo68477x336bdfd8(414L, 21L, java.lang.System.currentTimeMillis() - currentTimeMillis, true);
            fl6Var.f455964h = a17;
            fl6Var.f455965i = b17;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "cert not exist cn %s %s", b17, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.j.b().c()));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "sign cost time %s cn %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), b17);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: configRequest */
    public void mo83006x226c38ed(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p944x882e457a.o m83007x5a9a73ac = m83007x5a9a73ac();
        if (m83007x5a9a73ac == null) {
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152197a = new r45.fl6();
            lVar.f152198b = new r45.gl6();
            java.lang.String mo1064xb5887636 = mo1064xb5887636();
            int mo1062x19c9adf5 = mo1062x19c9adf5();
            lVar.f152199c = mo1064xb5887636;
            lVar.f152200d = mo1062x19c9adf5;
            lVar.f152201e = 185;
            lVar.f152202f = 1000000185;
            m83007x5a9a73ac = lVar.a();
            m83007x5a9a73ac.m47986x306cfea3(!mo83038xf7b914b8());
        }
        r45.fl6 fl6Var = (r45.fl6) m83007x5a9a73ac.f152243a.f152217a;
        if (z17) {
            fl6Var.f455960d = mo1063x46809856();
        }
        if (z18) {
            fl6Var.f455961e = 1;
        }
        m83028xf0ffe720(m83007x5a9a73ac);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        int m83040x1b967052;
        this.f39858xf5bc2045 = u0Var;
        m83039x5a3f54a3();
        if (this.f39877xb9a2b39f && (m83040x1b967052 = m83040x1b967052(this.f295573rr, sVar, u0Var)) != -1) {
            return m83040x1b967052;
        }
        if (!c01.z1.I()) {
            return mo9409x10f9447a(sVar, this.f295573rr, this);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "hy: serious error: is payupay");
        u0Var.mo815x76e0bfae(1000, -100868, "Pay Method Err", this);
        return 1;
    }

    /* renamed from: doSceneSimulately */
    public int m83040x1b967052(com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        r45.fl6 fl6Var = (r45.fl6) oVar.f152243a.f152217a;
        r45.cu5 cu5Var = fl6Var.f455962f;
        if (cu5Var != null) {
            new java.lang.String(cu5Var.f453374f.f273689a);
        }
        r45.cu5 cu5Var2 = fl6Var.f455963g;
        if (cu5Var2 != null) {
            new java.lang.String(cu5Var2.f453374f.f273689a);
        }
        mo83013xb2b366a7();
        if (!this.f39877xb9a2b39f) {
            return -1;
        }
        r45.gl6 gl6Var = (r45.gl6) oVar.f152244b.f152233a;
        if (gl6Var == null) {
            gl6Var = new r45.gl6();
        }
        byte[] bytes = "".getBytes();
        r45.cu5 cu5Var3 = new r45.cu5();
        cu5Var3.d(bytes);
        gl6Var.f456875d = cu5Var3;
        gl6Var.f456878g = mo83013xb2b366a7();
        gl6Var.f456876e = 0;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject((java.lang.String) null);
            gl6Var.f456879h = jSONObject.optInt("TenpayErrType");
            gl6Var.f456880i = jSONObject.optString("TenpayErrMsg");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
        }
        mo804x5f9cdc6f(1, 0, 0, "", oVar, null);
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: getEncryptUrl */
    public java.lang.String mo83008x94177cc0(java.lang.String str) {
        return com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28004x1aebb22d.m121664x51474d82(str);
    }

    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return 385;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: getPayCgicmd */
    public int mo83013xb2b366a7() {
        return mo1063x46809856();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: getRetModel */
    public com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.e1 mo83014x6758cc7e(com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        r45.gl6 gl6Var = (r45.gl6) oVar.f152244b.f152233a;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.e1 e1Var = new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.e1();
        int i17 = gl6Var.f456878g;
        e1Var.f295423c = gl6Var.f456877f;
        e1Var.f295422b = gl6Var.f456876e;
        e1Var.f295421a = gl6Var.f456875d;
        e1Var.f295425e = gl6Var.f456880i;
        e1Var.f295424d = gl6Var.f456879h;
        return e1Var;
    }

    /* renamed from: getTenpayCgicmd */
    public abstract int mo1063x46809856();

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 385;
    }

    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/micromsg-bin/tenpay";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: putToReqText */
    public void mo83024x7114b9a1(com.p314xaae8f345.mm.p944x882e457a.o oVar, r45.cu5 cu5Var) {
        ((r45.fl6) oVar.f152243a.f152217a).f455962f = cu5Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: putToWXReqText */
    public void mo83026xd36d8220(com.p314xaae8f345.mm.p944x882e457a.o oVar, r45.cu5 cu5Var) {
        ((r45.fl6) oVar.f152243a.f152217a).f455963g = cu5Var;
    }

    /* renamed from: setFake */
    public void m83041x764a06d7() {
        this.f39877xb9a2b39f = true;
    }
}
