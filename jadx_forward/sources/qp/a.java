package qp;

/* loaded from: classes4.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f447201d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f447202e;

    /* renamed from: f, reason: collision with root package name */
    public long f447203f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f447204g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qp.b f447205h;

    /* renamed from: i, reason: collision with root package name */
    public int f447206i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qp.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f447205h = bVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f447204g = obj;
        this.f447206i |= Integer.MIN_VALUE;
        return this.f447205h.a(null, null, this);
    }
}
