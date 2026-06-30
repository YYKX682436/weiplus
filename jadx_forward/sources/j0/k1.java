package j0;

/* loaded from: classes14.dex */
public final class k1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k0.y0 f377930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f377931e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f377932f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(k0.y0 y0Var, boolean z17, int i17) {
        super(2);
        this.f377930d = y0Var;
        this.f377931e = z17;
        this.f377932f = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f377932f | 1;
        j0.p1.d(this.f377930d, this.f377931e, (n0.o) obj, i17);
        return jz5.f0.f384359a;
    }
}
