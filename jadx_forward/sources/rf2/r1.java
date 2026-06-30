package rf2;

/* loaded from: classes10.dex */
public final class r1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f476410d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f476411e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f476412f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f476413g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ rf2.c2 f476414h;

    /* renamed from: i, reason: collision with root package name */
    public int f476415i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(rf2.c2 c2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f476414h = c2Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f476413g = obj;
        this.f476415i |= Integer.MIN_VALUE;
        return this.f476414h.c(null, false, this);
    }
}
