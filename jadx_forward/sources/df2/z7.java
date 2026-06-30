package df2;

/* loaded from: classes.dex */
public final class z7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f313466d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(df2.s8 s8Var) {
        super(2);
        this.f313466d = s8Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        ((java.lang.Number) obj2).longValue();
        df2.s8 s8Var = this.f313466d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s8Var.f312832m, "getRewardWishList wecoinBalance: " + longValue);
        ((mm2.c1) s8Var.m56788xbba4bfc0(mm2.c1.class)).w8(longValue);
        return jz5.f0.f384359a;
    }
}
