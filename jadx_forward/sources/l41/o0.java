package l41;

/* loaded from: classes15.dex */
public final class o0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f397418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l41.j1 f397419e;

    /* renamed from: f, reason: collision with root package name */
    public int f397420f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(l41.j1 j1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f397419e = j1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f397418d = obj;
        this.f397420f |= Integer.MIN_VALUE;
        return l41.j1.a(this.f397419e, this);
    }
}
