package rf2;

/* loaded from: classes10.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f476362d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f476363e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f476364f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rf2.q f476365g;

    /* renamed from: h, reason: collision with root package name */
    public int f476366h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(rf2.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f476365g = qVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f476364f = obj;
        this.f476366h |= Integer.MIN_VALUE;
        return rf2.q.a(this.f476365g, null, this);
    }
}
