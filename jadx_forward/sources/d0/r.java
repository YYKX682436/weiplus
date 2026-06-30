package d0;

/* loaded from: classes14.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f306732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f306733e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(z0.t tVar, int i17) {
        super(2);
        this.f306732d = tVar;
        this.f306733e = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f306733e | 1;
        d0.y.a(this.f306732d, (n0.o) obj, i17);
        return jz5.f0.f384359a;
    }
}
