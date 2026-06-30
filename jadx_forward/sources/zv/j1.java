package zv;

/* loaded from: classes11.dex */
public final class j1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f557532d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f557533e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f557534f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f557535g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zv.e2 f557536h;

    /* renamed from: i, reason: collision with root package name */
    public int f557537i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(zv.e2 e2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f557536h = e2Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f557535g = obj;
        this.f557537i |= Integer.MIN_VALUE;
        return this.f557536h.wi(null, null, this);
    }
}
