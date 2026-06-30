package ms4;

/* loaded from: classes8.dex */
public final class a0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ms4.b0 f412532a;

    public a0(ms4.b0 b0Var) {
        this.f412532a = b0Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        this.f412532a.a(5, 3, fVar.f152149b, fVar.f152150c);
        if (fVar.f152148a != 0 || fVar.f152149b != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinMidasInitializer", "cancelWecoinRechargeRequest errorType: " + fVar.f152148a + ", errorCode: " + fVar.f152149b + ", errorMsg: " + fVar.f152150c);
        }
        return jz5.f0.f384359a;
    }
}
