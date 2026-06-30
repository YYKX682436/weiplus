package mz0;

/* loaded from: classes5.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f414464d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f414465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f414466f;

    /* renamed from: g, reason: collision with root package name */
    public int f414467g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(mz0.b2 b2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f414466f = b2Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f414465e = obj;
        this.f414467g |= Integer.MIN_VALUE;
        return this.f414466f.U6(this);
    }
}
