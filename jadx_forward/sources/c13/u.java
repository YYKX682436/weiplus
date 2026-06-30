package c13;

/* loaded from: classes11.dex */
public final class u extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f119455d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f119456e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f119457f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f119458g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c13.b0 f119459h;

    /* renamed from: i, reason: collision with root package name */
    public int f119460i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(c13.b0 b0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f119459h = b0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f119458g = obj;
        this.f119460i |= Integer.MIN_VALUE;
        return c13.b0.b(this.f119459h, null, false, this);
    }
}
