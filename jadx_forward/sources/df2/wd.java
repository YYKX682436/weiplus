package df2;

/* loaded from: classes3.dex */
public final class wd extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.yd f313213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.y23 f313214e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd(df2.yd ydVar, r45.y23 y23Var) {
        super(2);
        this.f313213d = ydVar;
        this.f313214e = y23Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313213d.f313390m, "auto receive coupon for product " + this.f313214e.m75942xfb822ef2(0) + ", success: " + booleanValue);
        return jz5.f0.f384359a;
    }
}
