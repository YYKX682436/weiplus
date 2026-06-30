package th5;

/* loaded from: classes12.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f500942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f500943e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f500944f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ th5.p0 f500945g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ th5.q f500946h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(float f17, float f18, p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, th5.p0 p0Var, th5.q qVar) {
        super(2);
        this.f500942d = f17;
        this.f500943e = f18;
        this.f500944f = e0Var;
        this.f500945g = p0Var;
        this.f500946h = qVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        if (longValue > 0) {
            float f17 = this.f500942d;
            if (f17 > 0.0f) {
                float e17 = this.f500943e + (f17 * e06.p.e(((float) longValue2) / ((float) longValue), 0.0f, 1.0f));
                th5.o0.a(this.f500944f, this.f500945g, this.f500946h, e17);
            }
        }
        return jz5.f0.f384359a;
    }
}
