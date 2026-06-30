package o45;

/* loaded from: classes12.dex */
public class sg extends o45.ug {

    /* renamed from: b, reason: collision with root package name */
    public final r45.ji4 f424539b = new r45.ji4();

    /* renamed from: c, reason: collision with root package name */
    public boolean f424540c = false;

    @Override // o45.ug
    public java.lang.String a() {
        return o45.ag.f424425a ? "/cgi-bin/micromsg-bin/secmanualauth" : "/cgi-bin/micromsg-bin/manualauth";
    }

    @Override // o45.xg
    /* renamed from: getFuncId */
    public int mo13851x19c9adf5() {
        return o45.ag.f424425a ? 252 : 701;
    }

    @Override // o45.xg
    /* renamed from: toProtoBuf */
    public byte[] mo13852xc3d7db06() {
        int c17;
        int i17;
        gm0.m.f354768x = "";
        if (m150615xc9c28268() == 16) {
            c17 = 1;
        } else if (this.f424540c) {
            c17 = 3;
        } else {
            gm0.j1.i();
            c17 = gm0.j1.u().f354681a.c(46, 0);
        }
        if (10002 == x51.o1.f533597q && x51.o1.f533598r > 0) {
            x51.o1.f533598r = 0;
            o45.pi.f("", "", 0);
        }
        m150628x97bfc4c(o45.pi.d());
        r45.ji4 ji4Var = this.f424539b;
        r45.ii4 ii4Var = ji4Var.f459372e;
        ii4Var.mo11509x3ab820bc(o45.bh.a(this));
        ii4Var.f458599e = wo.w0.g(true);
        fo3.s sVar = fo3.s.INSTANCE;
        ii4Var.f458600f = sVar.I3(c17);
        ii4Var.f458601g = 0;
        ii4Var.f458602h = gm0.m.e();
        ii4Var.f458603i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        ii4Var.f458604m = o45.wf.f424559d;
        ii4Var.f458605n = com.p314xaae8f345.mm.p2621x8fb0427b.la.m0();
        ii4Var.f458606o = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        ii4Var.f458607p = "" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k0();
        ii4Var.f458608q = com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b;
        if (10012 == x51.o1.f533597q && (i17 = x51.o1.f533598r) > 0) {
            ii4Var.f458608q = i17;
        }
        ii4Var.f458610s = o45.wf.f424557b;
        ii4Var.f458611t = o45.wf.f424558c;
        ii4Var.f458612u = wo.q.f529317e;
        ii4Var.f458613v = wo.w0.o();
        ii4Var.C = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().f354681a.a(18);
        r45.zd zdVar = ii4Var.f458598d;
        int i18 = zdVar.f473460i;
        r45.z57 z57Var = zdVar.f473456e;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(str));
        z57Var.f473275g = cu5Var;
        try {
            byte[] h17 = sVar.h();
            r45.k57 k57Var = new r45.k57();
            int i19 = ii4Var.f458617z;
            if (2 == i19 || 1 == i19 || i19 == 0) {
                if (sVar.wf("ie_login_id")) {
                    sVar.E7("ie_login_id");
                }
                r45.cu5 cu5Var2 = new r45.cu5();
                cu5Var2.d(sVar.Ph("ie_login_id"));
                k57Var.f459927d = cu5Var2;
                r45.cu5 cu5Var3 = new r45.cu5();
                cu5Var3.d(sVar.Ci("ce_login_id"));
                k57Var.f459928e = cu5Var3;
                java.lang.String Sf = sVar.Sf("ce_login_id");
                if (Sf != null) {
                    r45.cu5 cu5Var4 = new r45.cu5();
                    cu5Var4.d(Sf.getBytes());
                    k57Var.f459934n = cu5Var4;
                }
            }
            r45.cu5 cu5Var5 = new r45.cu5();
            cu5Var5.d(sVar.L9());
            k57Var.f459933m = cu5Var5;
            r45.cu5 cu5Var6 = new r45.cu5();
            cu5Var6.d(h17);
            k57Var.f459929f = cu5Var6;
            r45.cu5 cu5Var7 = new r45.cu5();
            cu5Var7.d(k57Var.mo14344x5f01b1f6());
            ii4Var.B = cu5Var7;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ManualReq", th6, "cc throws exception.", new java.lang.Object[0]);
        }
        r45.ki4 ki4Var = ji4Var.f459371d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(this.f424544a)) {
            r45.cu5 cu5Var8 = new r45.cu5();
            cu5Var8.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s0());
            ki4Var.f460249d = cu5Var8;
            r45.ig0 ig0Var = new r45.ig0();
            ig0Var.f458544d = 713;
            com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc12 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1();
            com.p314xaae8f345.mm.p2496xc50a8ce6.C19776x5804ff1f.m75986x666ffc8c(ig0Var.f458544d, c19764x527bffc1, c19764x527bffc12);
            byte[] bArr = c19764x527bffc1.f38861x6ac9171;
            byte[] bArr2 = c19764x527bffc12.f38861x6ac9171;
            this.f424544a = bArr2 != null ? bArr2 : new byte[0];
            ii4Var.D = new r45.ye5();
            com.p314xaae8f345.mm.p971x6de15a2e.j jVar = com.p314xaae8f345.mm.p971x6de15a2e.j.f153559e;
            java.lang.String a17 = jVar.a();
            if (android.text.TextUtils.isEmpty(a17)) {
                r45.ye5 ye5Var = ii4Var.D;
                ye5Var.f472548d = 0;
                r45.cu5 cu5Var9 = new r45.cu5();
                cu5Var9.d(new byte[0]);
                ye5Var.f472549e = cu5Var9;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ManualReq", "get sign key failed");
            } else {
                r45.ye5 ye5Var2 = ii4Var.D;
                jVar.b();
                ye5Var2.f472548d = jVar.f153560a.f472548d;
                r45.ye5 ye5Var3 = ii4Var.D;
                r45.cu5 cu5Var10 = new r45.cu5();
                cu5Var10.d(a17.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
                ye5Var3.f472549e = cu5Var10;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ManualReq", "manualauth add public key , length " + a17.length());
            }
            com.p314xaae8f345.mm.p971x6de15a2e.i iVar = new com.p314xaae8f345.mm.p971x6de15a2e.i();
            iVar.f153556b = jVar.a();
            jVar.b();
            iVar.f153555a = jVar.f153561b;
            m150621x20d83983(iVar);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(bArr);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(bArr2);
            r45.cu5 cu5Var11 = new r45.cu5();
            cu5Var11.d(bArr);
            ig0Var.f458545e = cu5Var11;
            ki4Var.f460250e = ig0Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ManualReq", "summerauth manual IMEI:%s SoftType:%s ClientSeqID:%s Signature:%s DeviceName:%s DeviceType:%s Language:%s TimeZone:%s chan[%d,%d,%d] DeviceBrand:%s DeviceModel:%s OSType:%s RealCountry:%s AndroidPackageName:%s", ii4Var.f458599e, ii4Var.f458600f, ii4Var.f458602h, ii4Var.f458603i, ii4Var.f458604m, ii4Var.f458605n, ii4Var.f458606o, ii4Var.f458607p, java.lang.Integer.valueOf(ii4Var.f458608q), java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b), java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273973c), ii4Var.f458610s, ii4Var.f458611t, ii4Var.f458612u, ii4Var.f458613v, ii4Var.C);
        try {
            return ji4Var.mo14344x5f01b1f6();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ManualReq", "summerauth toProtoBuf :%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return null;
        }
    }
}
