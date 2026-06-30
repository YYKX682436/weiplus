package f0;

/* loaded from: classes14.dex */
public final class x1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f339802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f339803e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f0.y1 f339804f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(java.util.List list, int i17, f0.y1 y1Var) {
        super(2);
        this.f339802d = list;
        this.f339803e = i17;
        this.f339804f = y1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.util.List list = this.f339802d;
        int intValue3 = (((java.lang.Number) list.get((intValue + intValue2) - 1)).intValue() - (intValue == 0 ? 0 : ((java.lang.Number) list.get(intValue - 1)).intValue())) + (this.f339803e * (intValue2 - 1));
        boolean z17 = this.f339804f.f339807a;
        p2.b bVar = p2.c.f432906b;
        return new p2.c(z17 ? bVar.d(intValue3) : bVar.c(intValue3));
    }
}
