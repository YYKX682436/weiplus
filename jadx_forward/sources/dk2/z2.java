package dk2;

/* loaded from: classes3.dex */
public final class z2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f315944d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f315945e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315946f;

    /* renamed from: g, reason: collision with root package name */
    public int f315947g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(dk2.r4 r4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f315946f = r4Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f315945e = obj;
        this.f315947g |= Integer.MIN_VALUE;
        return this.f315946f.f0(null, null, null, null, this);
    }
}
