package jm4;

/* loaded from: classes11.dex */
public final class g6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f381919d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(yz5.l lVar) {
        super(1);
        this.f381919d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        bw5.fp0 fp0Var;
        pr4.a error = (pr4.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("consume fail, errorType: ");
        pr4.j jVar = error.f439518a;
        sb6.append(jVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinServiceStatic", sb6.toString());
        bw5.jr0 jr0Var = new bw5.jr0();
        int ordinal = jVar.ordinal();
        if (ordinal == 0) {
            fp0Var = bw5.fp0.ConsumeDefaultError;
        } else if (ordinal == 1) {
            fp0Var = bw5.fp0.ConsumeNoMoney;
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            fp0Var = bw5.fp0.ConsumeIntercept;
        }
        jr0Var.f110653d = fp0Var;
        jr0Var.f110656g[1] = true;
        yz5.l lVar = this.f381919d;
        if (lVar != null) {
            lVar.mo146xb9724478(jr0Var);
        }
        return jz5.f0.f384359a;
    }
}
