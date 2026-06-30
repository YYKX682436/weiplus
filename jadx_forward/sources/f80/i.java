package f80;

/* loaded from: classes12.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f341640d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f341641e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f341642f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f341643g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f80.j f341644h;

    /* renamed from: i, reason: collision with root package name */
    public int f341645i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f80.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f341644h = jVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f341643g = obj;
        this.f341645i |= Integer.MIN_VALUE;
        return f80.j.p(this.f341644h, this);
    }
}
