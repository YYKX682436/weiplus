package tt2;

/* loaded from: classes3.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f503541d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f503542e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(tt2.e1 e1Var, java.lang.Object obj) {
        super(2);
        this.f503541d = e1Var;
        this.f503542e = obj;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        if (intValue > 0) {
            tt2.e1 e1Var = this.f503541d;
            if (intValue >= 0 && intValue < e1Var.mo1894x7e414b06()) {
                pm0.v.X(new tt2.v(e1Var, intValue, this.f503542e));
            }
        }
        return jz5.f0.f384359a;
    }
}
