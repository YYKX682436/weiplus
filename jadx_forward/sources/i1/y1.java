package i1;

/* loaded from: classes14.dex */
public final class y1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i1.o1 f368609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f368610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f368611f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f368612g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(i1.o1 o1Var, java.util.Map map, int i17, int i18) {
        super(2);
        this.f368609d = o1Var;
        this.f368610e = map;
        this.f368611f = i17;
        this.f368612g = i18;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f368611f | 1;
        i1.c2.a(this.f368609d, this.f368610e, (n0.o) obj, i17, this.f368612g);
        return jz5.f0.f384359a;
    }
}
