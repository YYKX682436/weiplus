package st2;

/* loaded from: classes3.dex */
public final class a2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f493747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ st2.c2 f493748e;

    /* renamed from: f, reason: collision with root package name */
    public int f493749f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(st2.c2 c2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f493748e = c2Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f493747d = obj;
        this.f493749f |= Integer.MIN_VALUE;
        return this.f493748e.i(null, null, null, false, this);
    }
}
