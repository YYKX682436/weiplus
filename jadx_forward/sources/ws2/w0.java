package ws2;

/* loaded from: classes3.dex */
public final class w0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws2.k1 f530685d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(ws2.k1 k1Var) {
        super(0);
        this.f530685d = k1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayService", "generator innerReplayMiniView!");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ws2.k1 k1Var = this.f530685d;
        dt2.t tVar = new dt2.t(context, new ws2.v0(k1Var));
        tVar.p(k1Var.f530604c);
        return tVar;
    }
}
