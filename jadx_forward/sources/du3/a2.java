package du3;

/* loaded from: classes3.dex */
public final class a2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f325039d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f325040e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f325041f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ du3.b2 f325042g;

    /* renamed from: h, reason: collision with root package name */
    public int f325043h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(du3.b2 b2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f325042g = b2Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f325041f = obj;
        this.f325043h |= Integer.MIN_VALUE;
        return this.f325042g.mo771x2f8fd3(null, this);
    }
}
