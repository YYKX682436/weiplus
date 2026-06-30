package r73;

/* loaded from: classes2.dex */
public class b extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.a10 f474697r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f474698s;

    public b(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.z00();
        lVar.f152198b = new r45.a10();
        lVar.f152200d = 2926;
        lVar.f152199c = "/cgi-bin/mmpay-bin/checkhoneyuser";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f295566n = a17;
        r45.z00 z00Var = (r45.z00) a17.f152243a.f152217a;
        z00Var.f473096d = str;
        z00Var.f473097e = i17;
        this.f474698s = str;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCheckHoneyUser", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.a10 a10Var = (r45.a10) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f474697r = a10Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCheckHoneyUser", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(a10Var.f451153d), this.f474697r.f451154e);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f295567o;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void I(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        r45.a10 a10Var = (r45.a10) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f295561f = a10Var.f451153d;
        this.f295563h = a10Var.f451154e;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2926;
    }
}
