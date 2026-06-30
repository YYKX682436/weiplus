package z;

/* loaded from: classes13.dex */
public final class n1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f550282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f550283e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f550284f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f550285g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(double d17, double d18, double d19, double d27) {
        super(1);
        this.f550282d = d17;
        this.f550283e = d18;
        this.f550284f = d19;
        this.f550285g = d27;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        double doubleValue = ((java.lang.Number) obj).doubleValue();
        double d17 = this.f550282d;
        double d18 = this.f550283e;
        double exp = d17 * d18 * java.lang.Math.exp(d18 * doubleValue);
        double d19 = this.f550284f;
        double d27 = this.f550285g;
        return java.lang.Double.valueOf(exp + (d19 * d27 * java.lang.Math.exp(d27 * doubleValue)));
    }
}
