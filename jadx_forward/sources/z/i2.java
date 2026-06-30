package z;

/* loaded from: classes14.dex */
public final class i2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.l2 f550232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f550233e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f550234f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(z.l2 l2Var, java.lang.Object obj, int i17) {
        super(2);
        this.f550232d = l2Var;
        this.f550233e = obj;
        this.f550234f = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f550234f | 1;
        this.f550232d.a(this.f550233e, (n0.o) obj, i17);
        return jz5.f0.f384359a;
    }
}
