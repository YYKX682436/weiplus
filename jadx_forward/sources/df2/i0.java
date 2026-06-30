package df2;

/* loaded from: classes3.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.j0 f311902d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(df2.j0 j0Var) {
        super(2);
        this.f311902d = j0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        df2.j0 j0Var = this.f311902d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j0Var.f311973m, "startChargeLiveCountDown OutAnim " + floatValue + ",finish:" + booleanValue + '!');
        if (booleanValue) {
            df2.j0.b7(j0Var);
        }
        return jz5.f0.f384359a;
    }
}
