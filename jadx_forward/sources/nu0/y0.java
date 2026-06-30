package nu0;

/* loaded from: classes5.dex */
public final class y0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f421678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nu0.b1 f421679e;

    /* renamed from: f, reason: collision with root package name */
    public int f421680f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(nu0.b1 b1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f421679e = b1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f421678d = obj;
        this.f421680f |= Integer.MIN_VALUE;
        return this.f421679e.d5(false, this);
    }
}
