package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes9.dex */
public class k1 extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.fy f238409r;

    /* renamed from: s, reason: collision with root package name */
    public final int f238410s;

    public k1(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5) {
        this.f238410s = 1;
        this.f238410s = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ey();
        lVar.f152198b = new r45.fy();
        lVar.f152200d = 2717;
        lVar.f152199c = "/cgi-bin/mmpay-bin/uniontransfer_operation";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f295566n = a17;
        r45.ey eyVar = (r45.ey) a17.f152243a.f152217a;
        eyVar.f455328e = str;
        eyVar.f455327d = str2;
        eyVar.f455329f = str3;
        eyVar.f455330g = i17;
        eyVar.f455331h = str4;
        eyVar.f455332i = str5;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUnionTransferConfirm", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.fy fyVar = (r45.fy) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f238409r = fyVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUnionTransferConfirm", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(fyVar.f456253d), this.f238409r.f456254e);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f295567o;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void I(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        r45.fy fyVar = (r45.fy) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f295561f = fyVar.f456253d;
        this.f295563h = fyVar.f456254e;
    }

    public r45.lj5 P() {
        if (this.f238409r.f456255f == null) {
            return null;
        }
        r45.lj5 lj5Var = new r45.lj5();
        r45.yr6 yr6Var = this.f238409r.f456255f;
        lj5Var.f461056d = yr6Var.f472861d;
        lj5Var.f461057e = yr6Var.f472862e;
        lj5Var.f461058f = yr6Var.f472863f;
        lj5Var.f461059g = yr6Var.f472864g;
        lj5Var.f461060h = yr6Var.f472865h;
        return lj5Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2717;
    }
}
