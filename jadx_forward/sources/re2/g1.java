package re2;

/* loaded from: classes3.dex */
public final class g1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re2.h1 f475948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f475949e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(re2.h1 h1Var, yz5.p pVar) {
        super(2);
        this.f475948d = h1Var;
        this.f475949e = pVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = (java.lang.String) obj2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f475948d.f475960s, "create failed: errCode=" + intValue + ", errMsg=" + str);
        yz5.p pVar = this.f475949e;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(intValue), str);
        }
        return jz5.f0.f384359a;
    }
}
