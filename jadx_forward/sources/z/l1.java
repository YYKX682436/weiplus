package z;

/* loaded from: classes13.dex */
public final class l1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f550251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f550252e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f550253f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(double d17, double d18, double d19) {
        super(1);
        this.f550251d = d17;
        this.f550252e = d18;
        this.f550253f = d19;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        double doubleValue = ((java.lang.Number) obj).doubleValue();
        double d17 = this.f550252e;
        double d18 = doubleValue * d17;
        return java.lang.Double.valueOf(((this.f550251d * (1 + d18)) + (this.f550253f * d17)) * java.lang.Math.exp(d18));
    }
}
