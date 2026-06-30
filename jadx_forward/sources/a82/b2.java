package a82;

/* loaded from: classes4.dex */
public final class b2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f83507d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f83508e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f83509f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a82.g2 f83510g;

    /* renamed from: h, reason: collision with root package name */
    public int f83511h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(a82.g2 g2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f83510g = g2Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f83509f = obj;
        this.f83511h |= Integer.MIN_VALUE;
        return this.f83510g.b(null, null, 0, this);
    }
}
