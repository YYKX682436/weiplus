package ds4;

/* loaded from: classes9.dex */
public class b extends ds4.g {
    public boolean A;
    public boolean B;

    public b(at4.z0 z0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05) {
        super(z0Var, c19099x8d444f05);
        this.A = false;
        K();
    }

    @Override // ds4.g
    public void J(java.util.Map map) {
        K();
        if (this.A || this.B) {
            map.put("busi_scene", this.f324460y.f95559e);
        }
    }

    public final void K() {
        this.A = false;
        if (vr4.f1.wi().Ai().f95537m != null) {
            at4.z0 z0Var = this.f324460y;
            if (z0Var.f95568n != null && z0Var.f95559e.equals(vr4.f1.wi().Ai().f95537m.f69223x58802fcb)) {
                int i17 = z0Var.f95568n.f273642e;
                if (i17 == 31 || i17 == 32 || i17 == 33 || i17 == 42 || i17 == 37 || i17 == 56) {
                    this.A = true;
                } else {
                    this.B = true;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayPayVertify", "isLqtSns: %s, isLqtTs: %s", java.lang.Boolean.valueOf(this.A), java.lang.Boolean.valueOf(this.B));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o, com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        if (this.A) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(663L, 26L, 1L, false);
        } else if (this.B) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(663L, 22L, 1L, false);
        }
        return super.mo807x6c193ac1(sVar, u0Var);
    }

    @Override // ds4.g, com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        K();
        if (this.A) {
            return 1281;
        }
        return this.B ? 1305 : 1601;
    }

    @Override // ds4.g, com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 121;
    }

    @Override // ds4.g, com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        K();
        return this.A ? "/cgi-bin/mmpay-bin/tenpay/snslqtpaybindverify" : this.B ? "/cgi-bin/mmpay-bin/tenpay/lqtpaybindverify" : "/cgi-bin/mmpay-bin/tenpay/banpaybindverify";
    }

    @Override // ds4.g, com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p, com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.r, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        super.mo1065x5f9cdc6f(i17, str, jSONObject);
        if (i17 != 0) {
            if (this.A) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(663L, 27L, 1L, false);
            } else if (this.B) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(663L, 23L, 1L, false);
            }
        }
    }
}
