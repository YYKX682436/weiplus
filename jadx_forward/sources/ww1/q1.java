package ww1;

/* loaded from: classes2.dex */
public class q1 extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.wu5 f531803r;

    public q1(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.vu5();
        lVar.f152198b = new r45.wu5();
        lVar.f152200d = 1800;
        lVar.f152199c = "/cgi-bin/mmpay-bin/scanf2fmaterialcode";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f295566n = a17;
        r45.vu5 vu5Var = (r45.vu5) a17.f152243a.f152217a;
        vu5Var.f470118d = str;
        vu5Var.f470119e = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneF2fMaterial", "req url: %s, %s", str, java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.wu5 wu5Var = (r45.wu5) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f531803r = wu5Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneF2fMaterial", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(wu5Var.f471008d), this.f531803r.f471009e);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f295567o;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void I(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        r45.wu5 wu5Var = (r45.wu5) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f295561f = wu5Var.f471008d;
        this.f295563h = wu5Var.f471009e;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1800;
    }
}
