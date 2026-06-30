package dk2;

/* loaded from: classes14.dex */
public final class h5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f315096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.i5 f315097e;

    /* renamed from: f, reason: collision with root package name */
    public int f315098f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(dk2.i5 i5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f315097e = i5Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f315096d = obj;
        this.f315098f |= Integer.MIN_VALUE;
        return this.f315097e.a(null, this);
    }
}
