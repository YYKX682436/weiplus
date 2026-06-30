package el2;

/* loaded from: classes3.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i1 f335424d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(el2.i1 i1Var) {
        super(2);
        this.f335424d = i1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        ((java.lang.Number) obj2).longValue();
        el2.i1 i1Var = this.f335424d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i1Var.f335348g, "getRewardWishList wecoinBalance: " + longValue);
        ((mm2.c1) i1Var.f335347f.P0(mm2.c1.class)).w8(longValue);
        return jz5.f0.f384359a;
    }
}
