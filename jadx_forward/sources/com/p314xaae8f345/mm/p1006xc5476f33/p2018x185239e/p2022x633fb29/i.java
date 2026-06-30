package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes4.dex */
public class i extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.rx f238385r;

    public i(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.qx();
        lVar.f152198b = new r45.rx();
        lVar.f152200d = 2783;
        lVar.f152199c = "/cgi-bin/mmpay-bin/beforetransfer";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f295566n = a17;
        r45.qx qxVar = (r45.qx) a17.f152243a.f152217a;
        qxVar.f465856d = str;
        if (!h45.y.c()) {
            qxVar.f465857e = h45.y.f360501a;
        }
        qxVar.f465858f = str2;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBeforeTransfer", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.rx rxVar = (r45.rx) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f238385r = rxVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBeforeTransfer", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(rxVar.f466788d), this.f238385r.f466789e);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f295567o;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void I(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        r45.rx rxVar = (r45.rx) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f295561f = rxVar.f466788d;
        this.f295563h = rxVar.f466789e;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2783;
    }
}
