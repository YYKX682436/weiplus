package zh5;

/* loaded from: classes12.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f554562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zh5.k f554563e;

    /* renamed from: f, reason: collision with root package name */
    public int f554564f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(zh5.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f554563e = kVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f554562d = obj;
        this.f554564f |= Integer.MIN_VALUE;
        return this.f554563e.b(null, this);
    }
}
