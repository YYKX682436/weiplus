package rf2;

/* loaded from: classes10.dex */
public final class w extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f476458d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f476459e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f476460f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f476461g;

    /* renamed from: h, reason: collision with root package name */
    public int f476462h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(rf2.v0 v0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f476461g = v0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f476460f = obj;
        this.f476462h |= Integer.MIN_VALUE;
        return rf2.v0.a(this.f476461g, null, this);
    }
}
