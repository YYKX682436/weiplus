package hu3;

/* loaded from: classes5.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f366645d;

    /* renamed from: e, reason: collision with root package name */
    public int f366646e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f366647f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f366648g;

    /* renamed from: h, reason: collision with root package name */
    public int f366649h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(hu3.n0 n0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f366648g = n0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f366647f = obj;
        this.f366649h |= Integer.MIN_VALUE;
        return hu3.n0.a(this.f366648g, this);
    }
}
