package qg5;

/* loaded from: classes5.dex */
public final class a5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f444446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qg5.n5 f444447e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(yz5.a aVar, qg5.n5 n5Var) {
        super(0);
        this.f444446d = aVar;
        this.f444447e = n5Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yz5.a aVar = this.f444446d;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) this.f444447e.f444635n).mo141623x754a37bb();
        if (o4Var != null) {
            o4Var.putBoolean("yuanbao_summarize_agreed", true);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoSummarizeFSC", "[handleSummaryTosConsent] user accepted");
        return jz5.f0.f384359a;
    }
}
