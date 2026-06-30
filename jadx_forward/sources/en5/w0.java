package en5;

/* loaded from: classes14.dex */
public final class w0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f337055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f337056e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f337057f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(fn5.n0 n0Var, yz5.a aVar, int i17) {
        super(2);
        this.f337055d = n0Var;
        this.f337056e = aVar;
        this.f337057f = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f337057f | 1;
        en5.i1.b(this.f337055d, this.f337056e, (n0.o) obj, i17);
        return jz5.f0.f384359a;
    }
}
