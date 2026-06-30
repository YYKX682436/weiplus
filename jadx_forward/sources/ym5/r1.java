package ym5;

/* loaded from: classes14.dex */
public final class r1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f545027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f545028e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(yz5.p pVar, int i17) {
        super(2);
        this.f545027d = pVar;
        this.f545028e = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f545028e | 1;
        ym5.s1.a(this.f545027d, (n0.o) obj, i17);
        return jz5.f0.f384359a;
    }
}
