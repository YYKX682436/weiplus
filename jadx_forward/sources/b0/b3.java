package b0;

/* loaded from: classes14.dex */
public final class b3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f97760d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97761e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.c3 f97762f;

    /* renamed from: g, reason: collision with root package name */
    public int f97763g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(b0.c3 c3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f97762f = c3Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f97761e = obj;
        this.f97763g |= Integer.MIN_VALUE;
        return this.f97762f.a(0L, 0L, this);
    }
}
