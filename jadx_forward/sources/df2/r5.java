package df2;

/* loaded from: classes3.dex */
public final class r5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f312755d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f312756e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.s5 f312757f;

    /* renamed from: g, reason: collision with root package name */
    public int f312758g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(df2.s5 s5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f312757f = s5Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f312756e = obj;
        this.f312758g |= Integer.MIN_VALUE;
        return this.f312757f.a(this);
    }
}
