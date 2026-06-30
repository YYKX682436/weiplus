package en5;

/* loaded from: classes14.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f336966e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.String str, int i17) {
        super(2);
        this.f336965d = str;
        this.f336966e = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f336966e | 1;
        en5.l.b(this.f336965d, (n0.o) obj, i17);
        return jz5.f0.f384359a;
    }
}
