package z;

/* loaded from: classes13.dex */
public final class m1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f550270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f550271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f550272f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f550273g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ double f550274h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(double d17, double d18, double d19, double d27, double d28) {
        super(1);
        this.f550270d = d17;
        this.f550271e = d18;
        this.f550272f = d19;
        this.f550273g = d27;
        this.f550274h = d28;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        double doubleValue = ((java.lang.Number) obj).doubleValue();
        return java.lang.Double.valueOf((this.f550270d * java.lang.Math.exp(this.f550271e * doubleValue)) + (this.f550272f * java.lang.Math.exp(this.f550273g * doubleValue)) + this.f550274h);
    }
}
