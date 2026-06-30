package tw0;

/* loaded from: classes5.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f503952d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f503953e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f503954f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tw0.i f503955g;

    /* renamed from: h, reason: collision with root package name */
    public int f503956h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(tw0.i iVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f503955g = iVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f503954f = obj;
        this.f503956h |= Integer.MIN_VALUE;
        return this.f503955g.c(null, null, null, this);
    }
}
