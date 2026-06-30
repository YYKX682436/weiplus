package h41;

/* loaded from: classes14.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f360312d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f360313e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f360314f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f360315g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h41.j f360316h;

    /* renamed from: i, reason: collision with root package name */
    public int f360317i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h41.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f360316h = jVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f360315g = obj;
        this.f360317i |= Integer.MIN_VALUE;
        return this.f360316h.c(null, this);
    }
}
