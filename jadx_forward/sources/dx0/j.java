package dx0;

/* loaded from: classes5.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f325976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dx0.n f325977e;

    /* renamed from: f, reason: collision with root package name */
    public int f325978f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(dx0.n nVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f325977e = nVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f325976d = obj;
        this.f325978f |= Integer.MIN_VALUE;
        return this.f325977e.c(null, false, this);
    }
}
