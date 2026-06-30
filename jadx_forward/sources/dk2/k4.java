package dk2;

/* loaded from: classes3.dex */
public final class k4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f315213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.q4 f315214e;

    /* renamed from: f, reason: collision with root package name */
    public int f315215f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(dk2.q4 q4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f315214e = q4Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f315213d = obj;
        this.f315215f |= Integer.MIN_VALUE;
        return this.f315214e.k(null, null, null, false, this);
    }
}
