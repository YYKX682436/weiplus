package i21;

/* loaded from: classes11.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f369430d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f369431e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i21.n f369432f;

    /* renamed from: g, reason: collision with root package name */
    public int f369433g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i21.n nVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f369432f = nVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f369431e = obj;
        this.f369433g |= Integer.MIN_VALUE;
        return i21.n.a(this.f369432f, null, 0, this);
    }
}
