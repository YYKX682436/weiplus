package ls4;

/* loaded from: classes8.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls4.u f402626d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ls4.u uVar) {
        super(0);
        this.f402626d = uVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ls4.u uVar = this.f402626d;
        js4.r.f383098a = uVar.f402633a.f439553a;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        js4.r.f383100c = uuid;
        int ordinal = uVar.f402633a.f439558f.ordinal();
        if (ordinal == 0) {
            ls4.u.b(uVar);
        } else if (ordinal == 1) {
            ls4.u.c(uVar);
        } else if (ordinal == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeCoinConsumeLogic", "directIfEnoughCoin");
            uVar.g();
            new ks4.e().l().h(new ls4.g(uVar));
        }
        return jz5.f0.f384359a;
    }
}
