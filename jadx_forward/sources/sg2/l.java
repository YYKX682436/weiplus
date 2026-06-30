package sg2;

/* loaded from: classes13.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f489447d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f489448e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sg2.x f489449f;

    /* renamed from: g, reason: collision with root package name */
    public int f489450g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(sg2.x xVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f489449f = xVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f489448e = obj;
        this.f489450g |= Integer.MIN_VALUE;
        return this.f489449f.e(null, this);
    }
}
