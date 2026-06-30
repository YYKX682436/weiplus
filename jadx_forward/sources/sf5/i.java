package sf5;

/* loaded from: classes10.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f489172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf5.k f489173e;

    /* renamed from: f, reason: collision with root package name */
    public int f489174f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(sf5.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f489173e = kVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f489172d = obj;
        this.f489174f |= Integer.MIN_VALUE;
        return this.f489173e.b(null, this);
    }
}
