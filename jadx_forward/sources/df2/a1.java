package df2;

/* loaded from: classes3.dex */
public final class a1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f311186d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f311187e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f311188f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.d1 f311189g;

    /* renamed from: h, reason: collision with root package name */
    public int f311190h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(df2.d1 d1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f311189g = d1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f311188f = obj;
        this.f311190h |= Integer.MIN_VALUE;
        return this.f311189g.c7(null, 0, 0L, this);
    }
}
