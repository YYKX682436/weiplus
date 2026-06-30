package pi2;

/* loaded from: classes3.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pi2.n f436312d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(pi2.n nVar) {
        super(2);
        this.f436312d = nVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        ((java.lang.Number) obj2).longValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicPayExchang", "getRewardWishList wecoinBalance: " + longValue);
        pm0.v.X(new pi2.g(this.f436312d, longValue));
        return jz5.f0.f384359a;
    }
}
