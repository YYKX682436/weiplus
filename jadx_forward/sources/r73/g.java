package r73;

/* loaded from: classes2.dex */
public class g extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.fi3 f474703r;

    public g(java.lang.String str, long j17, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ei3();
        lVar.f152198b = new r45.fi3();
        lVar.f152200d = 2815;
        lVar.f152199c = "/cgi-bin/mmpay-bin/gmcreditlinetoken";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f295566n = a17;
        r45.ei3 ei3Var = (r45.ei3) a17.f152243a.f152217a;
        ei3Var.f455064d = str;
        ei3Var.f455065e = j17;
        ei3Var.f455066f = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneMCreditLineTokenSign", "card_no: %s, credit_line: %s", str, java.lang.Long.valueOf(j17));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneMCreditLineTokenSign", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.fi3 fi3Var = (r45.fi3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f474703r = fi3Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneMCreditLineTokenSign", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(fi3Var.f455912e), this.f474703r.f455913f);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f295567o;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void I(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        r45.fi3 fi3Var = (r45.fi3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f295561f = fi3Var.f455912e;
        this.f295563h = fi3Var.f455913f;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2815;
    }
}
