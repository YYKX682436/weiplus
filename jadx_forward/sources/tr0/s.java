package tr0;

/* loaded from: classes14.dex */
public final class s extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f502886d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f502887e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f502888f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tr0.t f502889g;

    /* renamed from: h, reason: collision with root package name */
    public int f502890h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(tr0.t tVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f502889g = tVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f502888f = obj;
        this.f502890h |= Integer.MIN_VALUE;
        return this.f502889g.P(null, this);
    }
}
