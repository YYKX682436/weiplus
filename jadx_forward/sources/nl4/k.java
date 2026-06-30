package nl4;

/* loaded from: classes11.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f419743d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f419744e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nl4.r f419745f;

    /* renamed from: g, reason: collision with root package name */
    public int f419746g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(nl4.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f419745f = rVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f419744e = obj;
        this.f419746g |= Integer.MIN_VALUE;
        return nl4.r.q(this.f419745f, 0L, null, null, this);
    }
}
