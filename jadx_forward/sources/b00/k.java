package b00;

/* loaded from: classes9.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f98232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b00.r f98233e;

    /* renamed from: f, reason: collision with root package name */
    public int f98234f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b00.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f98233e = rVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f98232d = obj;
        this.f98234f |= Integer.MIN_VALUE;
        return this.f98233e.nj(null, null, this);
    }
}
