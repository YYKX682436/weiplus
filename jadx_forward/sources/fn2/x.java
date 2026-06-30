package fn2;

/* loaded from: classes5.dex */
public final class x extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f345967d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f345968e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fn2.b0 f345969f;

    /* renamed from: g, reason: collision with root package name */
    public int f345970g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(fn2.b0 b0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f345969f = b0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f345968e = obj;
        this.f345970g |= Integer.MIN_VALUE;
        return this.f345969f.a(this);
    }
}
