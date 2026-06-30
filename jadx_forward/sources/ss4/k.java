package ss4;

/* loaded from: classes2.dex */
public class k extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f493604d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f493605e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f493606f = "";

    /* renamed from: g, reason: collision with root package name */
    public boolean f493607g = false;

    public k() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.zk3();
        lVar.f152198b = new r45.al3();
        lVar.f152199c = "/cgi-bin/mmpay-bin/getpayuserduty";
        lVar.f152200d = 2541;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f493604d = a17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f493605e = u0Var;
        rp3.c.a().getClass();
        return mo9409x10f9447a(sVar, this.f493604d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2541;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 != 0 || i19 != 0) {
            this.f493605e.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        r45.al3 al3Var = (r45.al3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        java.lang.String str2 = al3Var.f451623f;
        this.f493606f = str2;
        java.lang.String str3 = al3Var.f451625h;
        boolean z17 = al3Var.f451624g;
        this.f493607g = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.NetSceneGetPayUserDuty", "duty_info %s ,duty_info_darkmode %s need_agree_duty %s", str2, str3, java.lang.Boolean.valueOf(z17));
        this.f493605e.mo815x76e0bfae(i18, i19, str, this);
    }
}
