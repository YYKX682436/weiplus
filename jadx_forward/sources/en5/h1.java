package en5;

/* loaded from: classes14.dex */
public final class h1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f336962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f336963e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f336964f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(java.util.ArrayList arrayList, yz5.l lVar, int i17) {
        super(2);
        this.f336962d = arrayList;
        this.f336963e = lVar;
        this.f336964f = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f336964f | 1;
        en5.i1.e(this.f336962d, this.f336963e, (n0.o) obj, i17);
        return jz5.f0.f384359a;
    }
}
