package gx0;

/* loaded from: classes5.dex */
public final class x1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f358681d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f358682e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f358683f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f358684g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f358685h;

    /* renamed from: i, reason: collision with root package name */
    public int f358686i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(gx0.u2 u2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f358685h = u2Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f358684g = obj;
        this.f358686i |= Integer.MIN_VALUE;
        return gx0.u2.Q7(this.f358685h, this);
    }
}
