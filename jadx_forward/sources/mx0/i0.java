package mx0;

/* loaded from: classes5.dex */
public final class i0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f413569d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f413570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mx0.e1 f413571f;

    /* renamed from: g, reason: collision with root package name */
    public int f413572g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(mx0.e1 e1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f413571f = e1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f413570e = obj;
        this.f413572g |= Integer.MIN_VALUE;
        return mx0.e1.b(this.f413571f, this);
    }
}
