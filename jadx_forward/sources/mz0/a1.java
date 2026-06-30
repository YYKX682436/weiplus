package mz0;

/* loaded from: classes5.dex */
public final class a1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f414406d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f414407e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f414408f;

    /* renamed from: g, reason: collision with root package name */
    public int f414409g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(mz0.b2 b2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f414408f = b2Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f414407e = obj;
        this.f414409g |= Integer.MIN_VALUE;
        return mz0.b2.P6(this.f414408f, null, this);
    }
}
