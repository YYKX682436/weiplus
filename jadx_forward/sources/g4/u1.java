package g4;

/* loaded from: classes5.dex */
public final class u1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f350112d;

    /* renamed from: e, reason: collision with root package name */
    public int f350113e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.x1 f350114f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f350115g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f350116h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(g4.x1 x1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f350114f = x1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f350112d = obj;
        this.f350113e |= Integer.MIN_VALUE;
        return this.f350114f.a(null, this);
    }
}
