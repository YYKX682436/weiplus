package su2;

/* loaded from: classes2.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f494289d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f494290e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f494291f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ su2.p f494292g;

    /* renamed from: h, reason: collision with root package name */
    public int f494293h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(su2.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f494292g = pVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f494291f = obj;
        this.f494293h |= Integer.MIN_VALUE;
        return this.f494292g.b(null, this);
    }
}
