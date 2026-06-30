package v26;

/* loaded from: classes5.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f514543d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f514544e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f514545f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v26.k f514546g;

    /* renamed from: h, reason: collision with root package name */
    public int f514547h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(v26.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f514546g = kVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f514545f = obj;
        this.f514547h |= Integer.MIN_VALUE;
        return this.f514546g.mo771x2f8fd3(null, this);
    }
}
