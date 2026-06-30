package ef3;

/* loaded from: classes9.dex */
public class m implements com.p314xaae8f345.mm.p2802xd031a825.ui.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f333955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.wh5 f333956b;

    public m(int i17, r45.wh5 wh5Var) {
        this.f333955a = i17;
        this.f333956b = wh5Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.p1
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QueryWeChatWalletManager", "get from push done: %s", obj);
        long longValue = obj instanceof java.lang.Long ? ((java.lang.Long) obj).longValue() : 0L;
        new ef3.c(longValue, this.f333956b).l().q(new ef3.o()).h(new ef3.n(this.f333955a, longValue));
    }
}
