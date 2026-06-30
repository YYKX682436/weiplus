package l0;

/* loaded from: classes5.dex */
public final class s0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f396039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f396040e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(yz5.p pVar, int i17) {
        super(2);
        this.f396039d = pVar;
        this.f396040e = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f396040e | 1;
        l0.t0.a(this.f396039d, (n0.o) obj, i17);
        return jz5.f0.f384359a;
    }
}
