package o45;

/* loaded from: classes12.dex */
public class og extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public final r45.oc f424521a = new r45.oc();

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f424522b;

    @Override // o45.xg
    /* renamed from: getFuncId */
    public int mo13851x19c9adf5() {
        return 3941;
    }

    @Override // o45.xg
    /* renamed from: toProtoBuf */
    public byte[] mo13852xc3d7db06() {
        int c17;
        gm0.m.f354768x = "";
        if (m150615xc9c28268() == 12) {
            c17 = 1;
        } else {
            gm0.j1.i();
            c17 = gm0.j1.u().f354681a.c(46, 0);
        }
        m150628x97bfc4c(o45.pi.d());
        if (10002 == x51.o1.f533597q && x51.o1.f533598r > 0) {
            x51.o1.f533598r = 0;
            o45.pi.f("", "", 0);
        }
        r45.oc ocVar = this.f424521a;
        r45.mc mcVar = ocVar.f463675e;
        mcVar.mo11509x3ab820bc(o45.bh.a(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAuth", "summerauth autoauth toProtoBuf uin[%d]", java.lang.Integer.valueOf(m150617xb5887524()));
        mcVar.f461878f = wo.w0.g(true);
        mcVar.f461879g = fo3.s.INSTANCE.I3(c17);
        mcVar.f461880h = 0;
        mcVar.f461881i = gm0.m.e();
        mcVar.f461882m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        mcVar.f461883n = o45.wf.f424559d;
        mcVar.f461884o = com.p314xaae8f345.mm.p2621x8fb0427b.la.m0();
        mcVar.f461885p = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        mcVar.f461886q = "" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k0();
        mcVar.f461887r = com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b;
        mcVar.f461891v = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().f354681a.a(18);
        int i17 = mcVar.f461876d.f473460i;
        r45.z57 z57Var = mcVar.f461876d.f473456e;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(str));
        z57Var.f473275g = cu5Var;
        mcVar.f461892w = new r45.ye5();
        com.p314xaae8f345.mm.p971x6de15a2e.j jVar = com.p314xaae8f345.mm.p971x6de15a2e.j.f153559e;
        java.lang.String a17 = jVar.a();
        if (android.text.TextUtils.isEmpty(a17)) {
            r45.ye5 ye5Var = mcVar.f461892w;
            ye5Var.f472548d = 0;
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(new byte[0]);
            ye5Var.f472549e = cu5Var2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAuth", "get sign key failed");
        } else {
            r45.ye5 ye5Var2 = mcVar.f461892w;
            jVar.b();
            ye5Var2.f472548d = jVar.f153560a.f472548d;
            r45.ye5 ye5Var3 = mcVar.f461892w;
            r45.cu5 cu5Var3 = new r45.cu5();
            cu5Var3.d(a17.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
            ye5Var3.f472549e = cu5Var3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAuth", "disaster auth add public key , length " + a17.length());
        }
        com.p314xaae8f345.mm.p971x6de15a2e.i iVar = new com.p314xaae8f345.mm.p971x6de15a2e.i();
        iVar.f153556b = jVar.a();
        jVar.b();
        iVar.f153555a = jVar.f153561b;
        m150621x20d83983(iVar);
        r45.pc pcVar = ocVar.f463674d;
        r45.ig0 ig0Var = new r45.ig0();
        ig0Var.f458544d = 713;
        com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc12 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1();
        com.p314xaae8f345.mm.p2496xc50a8ce6.C19776x5804ff1f.m75986x666ffc8c(ig0Var.f458544d, c19764x527bffc1, c19764x527bffc12);
        byte[] bArr = c19764x527bffc1.f38861x6ac9171;
        byte[] bArr2 = c19764x527bffc12.f38861x6ac9171;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(bArr);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(bArr2);
        r45.cu5 cu5Var4 = new r45.cu5();
        cu5Var4.d(bArr);
        ig0Var.f458545e = cu5Var4;
        pcVar.f464469e = ig0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAuth", "summerauth auto IMEI:%s SoftType:%s ClientSeqID:%s Signature:%s DeviceName:%s DeviceType:%s Language:%s TimeZone:%s AndroidPackageName:%s chan[%d,%d,%d]", mcVar.f461878f, mcVar.f461879g, mcVar.f461881i, mcVar.f461882m, mcVar.f461883n, mcVar.f461884o, mcVar.f461885p, mcVar.f461886q, mcVar.f461891v, java.lang.Integer.valueOf(mcVar.f461887r), java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b), java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273973c));
        try {
            return ocVar.mo14344x5f01b1f6();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAuth", "summerauth toProtoBuf :%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return null;
        }
    }
}
