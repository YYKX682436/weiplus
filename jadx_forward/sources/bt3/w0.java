package bt3;

/* loaded from: classes9.dex */
public final class w0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f105969d;

    /* renamed from: e, reason: collision with root package name */
    public long f105970e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f105971f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bt3.y0 f105972g;

    /* renamed from: h, reason: collision with root package name */
    public int f105973h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(bt3.y0 y0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f105972g = y0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f105971f = obj;
        this.f105973h |= Integer.MIN_VALUE;
        return this.f105972g.a7(null, this);
    }
}
