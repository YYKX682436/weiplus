package nu0;

/* loaded from: classes5.dex */
public final class j2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f421517d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f421518e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f421519f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f421520g;

    /* renamed from: h, reason: collision with root package name */
    public int f421521h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(nu0.b4 b4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f421520g = b4Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f421519f = obj;
        this.f421521h |= Integer.MIN_VALUE;
        return nu0.b4.b7(this.f421520g, null, null, this);
    }
}
