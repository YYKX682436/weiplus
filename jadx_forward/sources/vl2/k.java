package vl2;

/* loaded from: classes10.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f519378d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f519379e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f519380f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vl2.s f519381g;

    /* renamed from: h, reason: collision with root package name */
    public int f519382h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(vl2.s sVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f519381g = sVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f519380f = obj;
        this.f519382h |= Integer.MIN_VALUE;
        return this.f519381g.a(null, this);
    }
}
