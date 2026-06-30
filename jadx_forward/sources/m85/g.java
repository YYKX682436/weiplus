package m85;

/* loaded from: classes14.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f406366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f406367e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yz5.p pVar, int i17) {
        super(2);
        this.f406366d = pVar;
        this.f406367e = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f406367e | 1;
        m85.h.a(this.f406366d, (n0.o) obj, i17);
        return jz5.f0.f384359a;
    }
}
