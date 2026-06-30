package jm4;

/* loaded from: classes11.dex */
public final class f6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f381917d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(yz5.l lVar) {
        super(1);
        this.f381917d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        pr4.b successResult = (pr4.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(successResult, "successResult");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinServiceStatic", "consume success, balance: " + successResult.f439519a);
        bw5.jr0 jr0Var = new bw5.jr0();
        jr0Var.f110653d = bw5.fp0.ConsumeSuccess;
        jr0Var.f110656g[1] = true;
        yz5.l lVar = this.f381917d;
        if (lVar != null) {
            lVar.mo146xb9724478(jr0Var);
        }
        return jz5.f0.f384359a;
    }
}
