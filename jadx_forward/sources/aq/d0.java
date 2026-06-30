package aq;

/* loaded from: classes14.dex */
public final class d0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f94384d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f94385e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f94386f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ aq.r0 f94387g;

    /* renamed from: h, reason: collision with root package name */
    public int f94388h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(aq.r0 r0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f94387g = r0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f94386f = obj;
        this.f94388h |= Integer.MIN_VALUE;
        return aq.r0.b(this.f94387g, null, null, this);
    }
}
