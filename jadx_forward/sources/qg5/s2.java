package qg5;

/* loaded from: classes8.dex */
public final class s2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.z2 f444708d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(qg5.z2 z2Var) {
        super(0);
        this.f444708d = z2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoChatRecordsFeatureService", "[onChatRecordsAnalyzeClick] User cancelled chat log analysis");
        qg5.z2 z2Var = this.f444708d;
        ((qg5.l0) z2Var.aj()).ij();
        ((qg5.e3) ((ct.k3) ((jz5.n) z2Var.f444806o).mo141623x754a37bb())).oj("journey_analyze");
        return jz5.f0.f384359a;
    }
}
