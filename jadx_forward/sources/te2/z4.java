package te2;

/* loaded from: classes3.dex */
public final class z4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f500093d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f500094e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f500095f;

    /* renamed from: g, reason: collision with root package name */
    public int f500096g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(te2.p8 p8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f500095f = p8Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f500094e = obj;
        this.f500096g |= Integer.MIN_VALUE;
        return te2.p8.O6(this.f500095f, false, this);
    }
}
