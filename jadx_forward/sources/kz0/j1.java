package kz0;

/* loaded from: classes5.dex */
public final class j1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f395289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f395290e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f395291f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f395292g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(yz5.a aVar, yz5.a aVar2, yz5.p pVar, int i17) {
        super(2);
        this.f395289d = aVar;
        this.f395290e = aVar2;
        this.f395291f = pVar;
        this.f395292g = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f395292g | 1;
        yz5.a aVar = this.f395290e;
        yz5.p pVar = this.f395291f;
        kz0.k1.f(this.f395289d, aVar, pVar, (n0.o) obj, i17);
        return jz5.f0.f384359a;
    }
}
