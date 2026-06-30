package sf2;

/* loaded from: classes3.dex */
public final class g2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f488680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hn2.d f488681e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f488682f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, hn2.d dVar, yz5.a aVar) {
        super(2);
        this.f488680d = f0Var;
        this.f488681e = dVar;
        this.f488682f = aVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int longValue = (int) ((((float) ((java.lang.Number) obj2).longValue()) / ((float) ((java.lang.Number) obj).longValue())) * 100);
        this.f488680d.f391649d = longValue;
        this.f488681e.f364048k = longValue / 2;
        pm0.v.X(new sf2.f2(this.f488682f));
        return jz5.f0.f384359a;
    }
}
