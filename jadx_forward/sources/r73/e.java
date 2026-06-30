package r73;

/* loaded from: classes9.dex */
public class e extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.bh3 f474701r;

    public e(java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ah3();
        lVar.f152198b = new r45.bh3();
        lVar.f152200d = com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.f27792x78e4cdb4;
        lVar.f152199c = "/cgi-bin/mmpay-bin/gethpcard";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f295566n = a17;
        r45.ah3 ah3Var = (r45.ah3) a17.f152243a.f152217a;
        ah3Var.f451541d = str;
        ah3Var.f451542e = at4.g0.d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetHoneyPayCard", "card no: %s", str);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetHoneyPayCard", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.bh3 bh3Var = (r45.bh3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f474701r = bh3Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetHoneyPayCard", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(bh3Var.f452291d), this.f474701r.f452292e);
        r45.bs bsVar = this.f474701r.f452294g;
        if (bsVar != null) {
            u73.h.k(bsVar.f452551f, bsVar.f452549d, bsVar.f452550e, null);
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f295567o;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void I(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        r45.bh3 bh3Var = (r45.bh3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f295561f = bh3Var.f452291d;
        this.f295563h = bh3Var.f452292e;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.f27792x78e4cdb4;
    }
}
