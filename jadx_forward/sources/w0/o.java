package w0;

/* loaded from: classes14.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0.p f523384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f523385e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f523386f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f523387g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(w0.p pVar, java.lang.Object obj, yz5.p pVar2, int i17) {
        super(2);
        this.f523384d = pVar;
        this.f523385e = obj;
        this.f523386f = pVar2;
        this.f523387g = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f523387g | 1;
        java.lang.Object obj3 = this.f523385e;
        yz5.p pVar = this.f523386f;
        this.f523384d.a(obj3, pVar, (n0.o) obj, i17);
        return jz5.f0.f384359a;
    }
}
