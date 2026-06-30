package l0;

/* loaded from: classes14.dex */
public final class z4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a2.o1 f396250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f396251e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f396252f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(a2.o1 o1Var, yz5.p pVar, int i17) {
        super(2);
        this.f396250d = o1Var;
        this.f396251e = pVar;
        this.f396252f = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f396252f | 1;
        l0.e5.a(this.f396250d, this.f396251e, (n0.o) obj, i17);
        return jz5.f0.f384359a;
    }
}
