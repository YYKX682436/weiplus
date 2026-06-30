package c61;

/* loaded from: classes11.dex */
public final class y9 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f120965d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f120966e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f120967f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f120968g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f120969h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c61.da f120970i;

    /* renamed from: m, reason: collision with root package name */
    public int f120971m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(c61.da daVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f120970i = daVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f120969h = obj;
        this.f120971m |= Integer.MIN_VALUE;
        return c61.da.a(this.f120970i, null, false, this);
    }
}
