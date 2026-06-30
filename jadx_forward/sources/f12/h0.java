package f12;

/* loaded from: classes4.dex */
public final class h0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f340142d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f340143e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f12.j0 f340144f;

    /* renamed from: g, reason: collision with root package name */
    public int f340145g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(f12.j0 j0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f340144f = j0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f340143e = obj;
        this.f340145g |= Integer.MIN_VALUE;
        return f12.j0.N6(this.f340144f, this);
    }
}
