package te2;

/* loaded from: classes3.dex */
public final class o1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f499800d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f499801e;

    /* renamed from: f, reason: collision with root package name */
    public int f499802f;

    /* renamed from: g, reason: collision with root package name */
    public int f499803g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f499804h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ te2.p1 f499805i;

    /* renamed from: m, reason: collision with root package name */
    public int f499806m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(te2.p1 p1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f499805i = p1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f499804h = obj;
        this.f499806m |= Integer.MIN_VALUE;
        return this.f499805i.z(0, null, null, 0, this);
    }
}
