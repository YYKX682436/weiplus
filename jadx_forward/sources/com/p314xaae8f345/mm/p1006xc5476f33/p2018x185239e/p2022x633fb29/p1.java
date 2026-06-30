package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes9.dex */
public class p1 extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.ly f238488r;

    /* renamed from: s, reason: collision with root package name */
    public final int f238489s;

    public p1(int i17, java.lang.String str, java.lang.String str2) {
        this.f238489s = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ky();
        lVar.f152198b = new r45.ly();
        lVar.f152200d = 2838;
        lVar.f152199c = "/cgi-bin/mmpay-bin/mmpayweworkuniontransferappsvr_transfer_querydetail";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f295566n = a17;
        r45.ky kyVar = (r45.ky) a17.f152243a.f152217a;
        kyVar.f460567d = str;
        kyVar.f460568e = str2;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUnionTransferQuery", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.ly lyVar = (r45.ly) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f238488r = lyVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUnionTransferQuery", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(lyVar.f461493d), this.f238488r.f461494e);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f295567o;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void I(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        r45.ly lyVar = (r45.ly) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f295561f = lyVar.f461493d;
        this.f295563h = lyVar.f461494e;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2466xda460cb3.api.C19564xaf6ceaf4 P() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2466xda460cb3.api.C19564xaf6ceaf4 c19564xaf6ceaf4 = new com.p314xaae8f345.mm.p1006xc5476f33.p2466xda460cb3.api.C19564xaf6ceaf4();
        r45.zw4 zw4Var = this.f238488r.f461500n;
        if (zw4Var != null) {
            c19564xaf6ceaf4.f270123d = zw4Var.f473963d;
            c19564xaf6ceaf4.f270124e = zw4Var.f473964e;
            c19564xaf6ceaf4.f270125f = zw4Var.f473965f;
            c19564xaf6ceaf4.f270126g = zw4Var.f473966g;
            c19564xaf6ceaf4.f270127h = zw4Var.f473967h;
        }
        return c19564xaf6ceaf4;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2838;
    }
}
