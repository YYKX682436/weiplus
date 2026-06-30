package l0;

/* loaded from: classes14.dex */
public final class h2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f395751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f395752e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p2.f f395753f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(java.util.Map map, yz5.p pVar, p2.f fVar) {
        super(2);
        this.f395751d = map;
        this.f395752e = pVar;
        this.f395753f = fVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        float floatValue2 = ((java.lang.Number) obj2).floatValue();
        java.lang.Float valueOf = java.lang.Float.valueOf(floatValue);
        java.util.Map map = this.f395751d;
        return java.lang.Float.valueOf(((l0.f5) this.f395752e.mo149xb9724478(kz5.c1.h(map, valueOf), kz5.c1.h(map, java.lang.Float.valueOf(floatValue2)))).a(this.f395753f, floatValue, floatValue2));
    }
}
