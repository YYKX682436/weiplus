package ub2;

/* loaded from: classes10.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f507581d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f507582e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ub2.k f507583f;

    /* renamed from: g, reason: collision with root package name */
    public int f507584g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ub2.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f507583f = kVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f507582e = obj;
        this.f507584g |= Integer.MIN_VALUE;
        return ub2.k.a(this.f507583f, 0, this);
    }
}
