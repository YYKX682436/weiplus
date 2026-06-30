package sg2;

/* loaded from: classes13.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f489438d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f489439e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f489440f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sg2.x f489441g;

    /* renamed from: h, reason: collision with root package name */
    public int f489442h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(sg2.x xVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f489441g = xVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f489440f = obj;
        this.f489442h |= Integer.MIN_VALUE;
        return this.f489441g.c(null, this);
    }
}
