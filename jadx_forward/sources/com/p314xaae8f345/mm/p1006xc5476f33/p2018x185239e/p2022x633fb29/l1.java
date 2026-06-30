package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes2.dex */
public class l1 extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.zx f238413r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f238414s;

    public l1(java.lang.String str, long j17, java.lang.String str2) {
        this.f238414s = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.yx();
        lVar.f152198b = new r45.zx();
        lVar.f152200d = 4895;
        lVar.f152199c = "/cgi-bin/mmpay-bin/uniontransfer_msgcheck";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f295566n = a17;
        r45.yx yxVar = (r45.yx) a17.f152243a.f152217a;
        yxVar.f472986d = str;
        yxVar.f472988f = str2;
        yxVar.f472987e = j17;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUnionTransferMsgCheck", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.zx zxVar = (r45.zx) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f238413r = zxVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUnionTransferMsgCheck", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(zxVar.f473982d), this.f238413r.f473983e);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f295567o;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void I(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        r45.zx zxVar = (r45.zx) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f295561f = zxVar.f473982d;
        this.f295563h = zxVar.f473983e;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4895;
    }
}
