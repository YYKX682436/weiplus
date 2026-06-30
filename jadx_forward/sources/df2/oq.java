package df2;

/* loaded from: classes3.dex */
public final class oq extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f312528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.rq f312529e;

    /* renamed from: f, reason: collision with root package name */
    public int f312530f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq(df2.rq rqVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f312529e = rqVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f312528d = obj;
        this.f312530f |= Integer.MIN_VALUE;
        return this.f312529e.q(this);
    }
}
