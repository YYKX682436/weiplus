package en5;

/* loaded from: classes14.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f336979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f336980e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yz5.a aVar, int i17) {
        super(2);
        this.f336979d = aVar;
        this.f336980e = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f336980e | 1;
        en5.l.c(this.f336979d, (n0.o) obj, i17);
        return jz5.f0.f384359a;
    }
}
