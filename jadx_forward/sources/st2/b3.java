package st2;

/* loaded from: classes3.dex */
public final class b3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f493766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ st2.g3 f493767e;

    /* renamed from: f, reason: collision with root package name */
    public int f493768f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(st2.g3 g3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f493767e = g3Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f493766d = obj;
        this.f493768f |= Integer.MIN_VALUE;
        return this.f493767e.q(0L, 0L, 0, null, this);
    }
}
