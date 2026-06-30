package e80;

/* loaded from: classes12.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f331554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e80.r f331555e;

    /* renamed from: f, reason: collision with root package name */
    public int f331556f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e80.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f331555e = rVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f331554d = obj;
        this.f331556f |= Integer.MIN_VALUE;
        return this.f331555e.W6(null, null, this);
    }
}
