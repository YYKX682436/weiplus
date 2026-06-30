package te5;

/* loaded from: classes9.dex */
public final class e1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f500162d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f500163e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f500164f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ te5.l1 f500165g;

    /* renamed from: h, reason: collision with root package name */
    public int f500166h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(te5.l1 l1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f500165g = l1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f500164f = obj;
        this.f500166h |= Integer.MIN_VALUE;
        return this.f500165g.cj(null, null, false, this);
    }
}
