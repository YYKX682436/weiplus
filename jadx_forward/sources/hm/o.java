package hm;

/* loaded from: classes12.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f363692d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f363693e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f363694f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hm.u f363695g;

    /* renamed from: h, reason: collision with root package name */
    public int f363696h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(hm.u uVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f363695g = uVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f363694f = obj;
        this.f363696h |= Integer.MIN_VALUE;
        return this.f363695g.T6(null, null, this);
    }
}
