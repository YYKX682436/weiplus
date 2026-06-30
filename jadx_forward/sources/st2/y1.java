package st2;

/* loaded from: classes3.dex */
public final class y1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f494038d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f494039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ st2.c2 f494040f;

    /* renamed from: g, reason: collision with root package name */
    public int f494041g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(st2.c2 c2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f494040f = c2Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f494039e = obj;
        this.f494041g |= Integer.MIN_VALUE;
        return this.f494040f.g(null, null, null, this);
    }
}
