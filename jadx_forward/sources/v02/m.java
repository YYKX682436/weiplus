package v02;

/* loaded from: classes8.dex */
public final class m extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f513798d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f513799e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f513800f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v02.f0 f513801g;

    /* renamed from: h, reason: collision with root package name */
    public int f513802h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(v02.f0 f0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f513801g = f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f513800f = obj;
        this.f513802h |= Integer.MIN_VALUE;
        return v02.f0.Zi(this.f513801g, null, this);
    }
}
