package en5;

/* loaded from: classes14.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f336952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f336953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f336954f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f336955g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f336956h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(z0.t tVar, int i17, java.util.ArrayList arrayList, yz5.l lVar, int i18) {
        super(2);
        this.f336952d = tVar;
        this.f336953e = i17;
        this.f336954f = arrayList;
        this.f336955g = lVar;
        this.f336956h = i18;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        en5.l.a(this.f336952d, this.f336953e, this.f336954f, this.f336955g, (n0.o) obj, this.f336956h | 1);
        return jz5.f0.f384359a;
    }
}
