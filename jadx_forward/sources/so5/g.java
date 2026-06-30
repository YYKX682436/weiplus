package so5;

/* loaded from: classes14.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f492361d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f492362e;

    /* renamed from: f, reason: collision with root package name */
    public int f492363f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f492364g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ so5.m f492365h;

    /* renamed from: i, reason: collision with root package name */
    public int f492366i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(so5.m mVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f492365h = mVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f492364g = obj;
        this.f492366i |= Integer.MIN_VALUE;
        return so5.m.a(this.f492365h, null, 0, this);
    }
}
