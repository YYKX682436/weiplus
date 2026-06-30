package z;

/* loaded from: classes13.dex */
public final class k1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f550243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f550244e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f550245f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f550246g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(double d17, double d18, double d19, double d27) {
        super(1);
        this.f550243d = d17;
        this.f550244e = d18;
        this.f550245f = d19;
        this.f550246g = d27;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        double doubleValue = ((java.lang.Number) obj).doubleValue();
        return java.lang.Double.valueOf(((this.f550243d + (this.f550244e * doubleValue)) * java.lang.Math.exp(this.f550245f * doubleValue)) + this.f550246g);
    }
}
