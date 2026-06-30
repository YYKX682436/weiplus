package jm4;

/* loaded from: classes11.dex */
public final class h6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f381925d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(yz5.l lVar) {
        super(0);
        this.f381925d = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinServiceStatic", "consume cancel");
        bw5.jr0 jr0Var = new bw5.jr0();
        jr0Var.f110653d = bw5.fp0.ConsumeCancel;
        jr0Var.f110656g[1] = true;
        yz5.l lVar = this.f381925d;
        if (lVar != null) {
            lVar.mo146xb9724478(jr0Var);
        }
        return jz5.f0.f384359a;
    }
}
