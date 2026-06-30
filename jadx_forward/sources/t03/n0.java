package t03;

/* loaded from: classes15.dex */
public final class n0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f496022d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f496023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t03.r0 f496024f;

    /* renamed from: g, reason: collision with root package name */
    public int f496025g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(t03.r0 r0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f496024f = r0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f496023e = obj;
        this.f496025g |= Integer.MIN_VALUE;
        return t03.r0.T(this.f496024f, this);
    }
}
