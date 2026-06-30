package gx0;

/* loaded from: classes5.dex */
public final class r4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f358445d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f358446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx0.x4 f358447f;

    /* renamed from: g, reason: collision with root package name */
    public int f358448g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(gx0.x4 x4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f358447f = x4Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f358446e = obj;
        this.f358448g |= Integer.MIN_VALUE;
        return this.f358447f.d5(false, this);
    }
}
