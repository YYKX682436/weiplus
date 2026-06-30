package bb3;

/* loaded from: classes4.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f100630d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f100631e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f100632f;

    public a(java.lang.String str, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.e10();
        lVar.f152198b = new r45.f10();
        lVar.f152200d = 503;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152199c = "/cgi-bin/micromsg-bin/checkloginqrcode";
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f100631e = a17;
        r45.e10 e10Var = (r45.e10) a17.f152243a.f152217a;
        byte[] s07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s0();
        e10Var.f454432d = x51.j1.a(s07);
        e10Var.f454434f = (int) (java.lang.System.currentTimeMillis() / 1000);
        e10Var.f454433e = str;
        e10Var.f454435g = 0;
        a17.m48033x97bfc4c(o45.pi.a());
        a17.f152247e = 1;
        a17.mo47979x2d63726f().m150625x820885cc(s07);
        this.f100632f = bArr;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f100630d = u0Var;
        return mo9409x10f9447a(sVar, this.f100631e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 503;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCheckLoginQRCode", "errType %d,errCode %d,errMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f100630d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
