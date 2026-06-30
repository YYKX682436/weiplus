package q92;

/* loaded from: classes10.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q92.h f442430d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q92.h hVar) {
        super(0);
        this.f442430d = hVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f442430d.getClass();
        d95.b0 b0Var = new d95.b0();
        java.lang.String str = gm0.j1.u().h() + "FinderAccounts_01.db";
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(-1527282937, q92.g.f442432a);
        if (!b0Var.S(str, hashMap, true, true)) {
            throw new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183("finder db init failed");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderAccountFeatureService", "[initAccountDb] path=".concat(str));
        return b0Var;
    }
}
