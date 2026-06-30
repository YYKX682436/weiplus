package a6;

/* loaded from: classes14.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f83187d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f83188e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f83189f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a6.l f83190g;

    /* renamed from: h, reason: collision with root package name */
    public int f83191h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a6.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f83190g = lVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f83189f = obj;
        this.f83191h |= Integer.MIN_VALUE;
        return this.f83190g.b(null, this);
    }
}
