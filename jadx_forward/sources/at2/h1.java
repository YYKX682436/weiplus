package at2;

/* loaded from: classes3.dex */
public final class h1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f95212d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f95213e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ at2.n1 f95214f;

    /* renamed from: g, reason: collision with root package name */
    public int f95215g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(at2.n1 n1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f95214f = n1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f95213e = obj;
        this.f95215g |= Integer.MIN_VALUE;
        return at2.n1.t1(this.f95214f, this);
    }
}
