package r73;

/* loaded from: classes4.dex */
public class c extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.z90 f474699r;

    public c(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.y90();
        lVar.f152198b = new r45.z90();
        lVar.f152200d = 2662;
        lVar.f152199c = "/cgi-bin/mmpay-bin/createhoneypaycard";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f295566n = a17;
        r45.y90 y90Var = (r45.y90) a17.f152243a.f152217a;
        y90Var.f472410d = str;
        y90Var.f472411e = j17;
        y90Var.f472412f = str2;
        y90Var.f472413g = str3;
        y90Var.f472414h = i17;
        y90Var.f472415i = str4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCreateHoneyPayCard", "username: %s, credit line: %s", str2, java.lang.Long.valueOf(j17));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCreateHoneyPayCard", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.z90 z90Var = (r45.z90) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f474699r = z90Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCreateHoneyPayCard", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(z90Var.f473328d), this.f474699r.f473329e);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f295567o;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void I(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        r45.z90 z90Var = (r45.z90) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f295561f = z90Var.f473328d;
        this.f295563h = z90Var.f473329e;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2662;
    }
}
