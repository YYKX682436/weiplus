package o45;

/* loaded from: classes12.dex */
public class bi extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public final r45.yv4 f424442a = new r45.yv4();

    /* renamed from: b, reason: collision with root package name */
    public byte[] f424443b;

    @Override // o45.zg
    /* renamed from: getCmdId */
    public int mo13850x7443ca3f() {
        return 0;
    }

    @Override // o45.xg
    /* renamed from: getFuncId */
    public int mo13851x19c9adf5() {
        return 126;
    }

    @Override // o45.xg
    /* renamed from: toProtoBuf */
    public byte[] mo13852xc3d7db06() {
        m150628x97bfc4c(o45.pi.d());
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s0());
        r45.yv4 yv4Var = this.f424442a;
        yv4Var.f472952u = cu5Var;
        yv4Var.mo11509x3ab820bc(o45.bh.a(this));
        yv4Var.f472946o = com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273973c;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(this.f424443b)) {
            r45.ig0 ig0Var = new r45.ig0();
            ig0Var.f458544d = 713;
            com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc12 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1();
            com.p314xaae8f345.mm.p2496xc50a8ce6.C19776x5804ff1f.m75986x666ffc8c(ig0Var.f458544d, c19764x527bffc1, c19764x527bffc12);
            byte[] bArr = c19764x527bffc1.f38861x6ac9171;
            byte[] bArr2 = c19764x527bffc12.f38861x6ac9171;
            this.f424443b = bArr2 != null ? bArr2 : new byte[0];
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(bArr);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(bArr2);
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(bArr);
            ig0Var.f458545e = cu5Var2;
            yv4Var.G = ig0Var;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMReg2.Req", "summerecdh pri key is not null, len:%d", java.lang.Integer.valueOf(this.f424443b.length));
        }
        try {
            fo3.s sVar = fo3.s.INSTANCE;
            byte[] h17 = sVar.h();
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var3 = new r45.cu5();
            cu5Var3.d(h17);
            k57Var.f459929f = cu5Var3;
            r45.cu5 cu5Var4 = new r45.cu5();
            cu5Var4.d(sVar.L9());
            k57Var.f459933m = cu5Var4;
            r45.cu5 cu5Var5 = new r45.cu5();
            cu5Var5.d(k57Var.mo14344x5f01b1f6());
            yv4Var.S = cu5Var5;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMReg2.Req", th6, "cc throws exception.", new java.lang.Object[0]);
        }
        yv4Var.W = new r45.ye5();
        com.p314xaae8f345.mm.p971x6de15a2e.j jVar = com.p314xaae8f345.mm.p971x6de15a2e.j.f153559e;
        java.lang.String a17 = jVar.a();
        if (android.text.TextUtils.isEmpty(a17)) {
            r45.ye5 ye5Var = yv4Var.W;
            ye5Var.f472548d = 0;
            r45.cu5 cu5Var6 = new r45.cu5();
            cu5Var6.d(new byte[0]);
            ye5Var.f472549e = cu5Var6;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMReg2.Req", "get sign key failed");
        } else {
            r45.ye5 ye5Var2 = yv4Var.W;
            jVar.b();
            ye5Var2.f472548d = jVar.f153560a.f472548d;
            r45.ye5 ye5Var3 = yv4Var.W;
            r45.cu5 cu5Var7 = new r45.cu5();
            cu5Var7.d(a17.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
            ye5Var3.f472549e = cu5Var7;
        }
        com.p314xaae8f345.mm.p971x6de15a2e.i iVar = new com.p314xaae8f345.mm.p971x6de15a2e.i();
        iVar.f153556b = jVar.a();
        jVar.b();
        iVar.f153555a = jVar.f153561b;
        m150621x20d83983(iVar);
        return yv4Var.mo14344x5f01b1f6();
    }
}
