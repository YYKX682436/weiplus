package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes7.dex */
public class u0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f295526d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f295527e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f295528f;

    /* renamed from: g, reason: collision with root package name */
    public final h45.r f295529g;

    public u0(java.util.Map map, java.lang.String str, java.lang.String str2, int i17, h45.r rVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneJSAPISecureTunnel", "new pay sercuretunnel netscene url :" + str + " appid: " + str2);
        this.f295529g = rVar;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.gy5();
        lVar.f152198b = new r45.hy5();
        lVar.f152199c = "/cgi-bin/mmpay-bin/securetunnel";
        lVar.f152211o = 2;
        this.f295526d = 2632;
        lVar.f152200d = 2632;
        if (map.containsKey("timeout")) {
            lVar.f152205i = ((java.lang.Integer) map.get("timeout")).intValue();
        }
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f295528f = a17;
        r45.gy5 gy5Var = (r45.gy5) a17.f152243a.f152217a;
        gy5Var.f457178g = (java.lang.String) map.get("reqbuf");
        gy5Var.f457175d = (java.lang.String) map.get("cmd");
        gy5Var.f457177f = str;
        gy5Var.f457176e = str2;
        gy5Var.f457179h = i17;
        gy5Var.f457180i = 0;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f295527e = u0Var;
        return mo9409x10f9447a(sVar, this.f295528f, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return this.f295526d;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneJSAPISecureTunnel", "onGYNetEnd, netId : " + i17 + " errType :" + i18 + " errCode: " + i19 + " errMsg :" + str);
        h45.r rVar = this.f295529g;
        if (rVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneJSAPISecureTunnel", "secureTunnel callback");
            if (i18 == 0 && i19 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneJSAPISecureTunnel", "secureTunnel callback success");
                rVar.mo74492xe05b4124(((r45.hy5) this.f295528f.f152244b.f152233a).f458089d);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneJSAPISecureTunnel", "secureTunnel callback fail");
                rVar.a(str);
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f295527e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
