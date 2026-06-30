package j0;

/* loaded from: classes13.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k0.y0 f377786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f377787e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f377788f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(k0.y0 y0Var, yz5.p pVar, int i17) {
        super(2);
        this.f377786d = y0Var;
        this.f377787e = pVar;
        this.f377788f = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f377788f | 1;
        j0.e0.a(this.f377786d, this.f377787e, (n0.o) obj, i17);
        return jz5.f0.f384359a;
    }
}
