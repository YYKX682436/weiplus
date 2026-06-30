package st2;

/* loaded from: classes3.dex */
public final class x1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f494029d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f494030e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ st2.c2 f494031f;

    /* renamed from: g, reason: collision with root package name */
    public int f494032g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(st2.c2 c2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f494031f = c2Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f494030e = obj;
        this.f494032g |= Integer.MIN_VALUE;
        return this.f494031f.f(null, null, null, null, false, this);
    }
}
