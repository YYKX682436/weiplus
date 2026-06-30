package dd2;

/* loaded from: classes2.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f310494d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dd2.g f310496f;

    /* renamed from: g, reason: collision with root package name */
    public int f310497g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(dd2.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f310496f = gVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f310495e = obj;
        this.f310497g |= Integer.MIN_VALUE;
        return this.f310496f.a(this);
    }
}
