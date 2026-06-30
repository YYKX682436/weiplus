package mh2;

/* loaded from: classes10.dex */
public final class s0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407985d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f407986e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407987f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mh2.f1 f407988g;

    /* renamed from: h, reason: collision with root package name */
    public int f407989h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(mh2.f1 f1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f407988g = f1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f407987f = obj;
        this.f407989h |= Integer.MIN_VALUE;
        return mh2.f1.f(this.f407988g, null, this);
    }
}
