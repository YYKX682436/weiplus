package bb3;

/* loaded from: classes4.dex */
public class b extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f100633d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f100634e;

    public b() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ai3();
        lVar.f152198b = new r45.bi3();
        lVar.f152200d = 502;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152199c = "/cgi-bin/micromsg-bin/getloginqrcode";
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f100634e = a17;
        r45.ai3 ai3Var = (r45.ai3) a17.f152243a.f152217a;
        byte[] s07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s0();
        ai3Var.f451552d = x51.j1.a(s07);
        ai3Var.f451553e = 0;
        try {
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(fo3.s.INSTANCE.h());
            k57Var.f459929f = cu5Var;
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(k57Var.mo14344x5f01b1f6());
            ai3Var.f451556h = cu5Var2;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneGetLoginQRCode", th6, "cc throws exception.", new java.lang.Object[0]);
        }
        this.f100634e.m48033x97bfc4c(o45.pi.a());
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f100634e;
        oVar.f152247e = 1;
        oVar.mo47979x2d63726f().m150625x820885cc(s07);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f100633d = u0Var;
        return mo9409x10f9447a(sVar, this.f100634e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 502;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetLoginQRCode", "errType %d,errCode %d,errMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f100633d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
