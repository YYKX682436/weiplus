package qu;

/* loaded from: classes5.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f448243d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f448244e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qu.b f448245f;

    /* renamed from: g, reason: collision with root package name */
    public int f448246g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qu.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f448245f = bVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f448244e = obj;
        this.f448246g |= Integer.MIN_VALUE;
        return this.f448245f.D(null, this);
    }
}
