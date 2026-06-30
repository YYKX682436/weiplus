package sf2;

/* loaded from: classes10.dex */
public final class x0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f488882d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f488883e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f488884f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf2.e1 f488885g;

    /* renamed from: h, reason: collision with root package name */
    public int f488886h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(sf2.e1 e1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f488885g = e1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f488884f = obj;
        this.f488886h |= Integer.MIN_VALUE;
        return this.f488885g.i7(null, this);
    }
}
