package th5;

/* loaded from: classes12.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f500948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f500949e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ th5.p0 f500950f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ th5.q f500951g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(float f17, p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, th5.p0 p0Var, th5.q qVar) {
        super(2);
        this.f500948d = f17;
        this.f500949e = e0Var;
        this.f500950f = p0Var;
        this.f500951g = qVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        if (longValue > 0) {
            float f17 = this.f500948d;
            if (f17 > 0.0f) {
                float e17 = f17 * e06.p.e(((float) longValue2) / ((float) longValue), 0.0f, 1.0f);
                th5.o0.a(this.f500949e, this.f500950f, this.f500951g, e17);
            }
        }
        return jz5.f0.f384359a;
    }
}
