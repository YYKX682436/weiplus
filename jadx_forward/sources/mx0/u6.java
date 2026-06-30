package mx0;

/* loaded from: classes5.dex */
public final class u6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f413907d;

    /* renamed from: e, reason: collision with root package name */
    public int f413908e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f413909f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mx0.v6 f413910g;

    /* renamed from: h, reason: collision with root package name */
    public int f413911h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(mx0.v6 v6Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f413910g = v6Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f413909f = obj;
        this.f413911h |= Integer.MIN_VALUE;
        return this.f413910g.mo771x2f8fd3(null, this);
    }
}
