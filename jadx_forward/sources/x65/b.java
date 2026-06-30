package x65;

/* loaded from: classes12.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f533868d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f533869e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f533870f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f533871g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x65.l f533872h;

    /* renamed from: i, reason: collision with root package name */
    public int f533873i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(x65.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f533872h = lVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f533871g = obj;
        this.f533873i |= Integer.MIN_VALUE;
        return x65.l.d(this.f533872h, null, this);
    }
}
