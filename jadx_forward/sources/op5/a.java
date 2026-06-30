package op5;

/* loaded from: classes9.dex */
public abstract class a extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0 {
    public abstract int H();

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: configRequest */
    public void mo83006x226c38ed(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p944x882e457a.o m83007x5a9a73ac = m83007x5a9a73ac();
        if (m83007x5a9a73ac == null) {
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152197a = new r45.k75();
            lVar.f152198b = new r45.l75();
            lVar.f152199c = "/cgi-bin/mmpay-bin/payu";
            lVar.f152200d = 1518;
            lVar.f152201e = 0;
            lVar.f152202f = 0;
            m83007x5a9a73ac = lVar.a();
            m83007x5a9a73ac.m47986x306cfea3(true);
        }
        r45.k75 k75Var = (r45.k75) m83007x5a9a73ac.f152243a.f152217a;
        if (z17) {
            k75Var.f459987d = H();
        }
        if (z18) {
            k75Var.f459988e = 1;
        }
        m83028xf0ffe720(m83007x5a9a73ac);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f39858xf5bc2045 = u0Var;
        if (c01.z1.I()) {
            return mo9409x10f9447a(sVar, this.f295573rr, this);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetScenePayUBase", "hy: serious error: not payupay");
        u0Var.mo815x76e0bfae(1000, -100868, "Pay Method Err", this);
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: getEncryptUrl */
    public java.lang.String mo83008x94177cc0(java.lang.String str) {
        return com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28004x1aebb22d.m121664x51474d82(str);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: getPayCgicmd */
    public int mo83013xb2b366a7() {
        return H();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: getRetModel */
    public com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.e1 mo83014x6758cc7e(com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        r45.l75 l75Var = (r45.l75) oVar.f152244b.f152233a;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.e1 e1Var = new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.e1();
        int i17 = l75Var.f460733g;
        e1Var.f295423c = l75Var.f460732f;
        e1Var.f295422b = l75Var.f460731e;
        e1Var.f295421a = l75Var.f460730d;
        e1Var.f295425e = l75Var.f460735i;
        e1Var.f295424d = l75Var.f460734h;
        return e1Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1518;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: putToReqText */
    public void mo83024x7114b9a1(com.p314xaae8f345.mm.p944x882e457a.o oVar, r45.cu5 cu5Var) {
        ((r45.k75) oVar.f152243a.f152217a).f459989f = cu5Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: putToRequest */
    public void mo83025x7123b945(java.lang.StringBuilder sb6, java.lang.String str) {
        sb6.append(java.net.URLEncoder.encode(str));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: putToWXReqText */
    public void mo83026xd36d8220(com.p314xaae8f345.mm.p944x882e457a.o oVar, r45.cu5 cu5Var) {
        ((r45.k75) oVar.f152243a.f152217a).f459990g = cu5Var;
    }
}
