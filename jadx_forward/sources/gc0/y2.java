package gc0;

/* loaded from: classes5.dex */
public final class y2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f351914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gc0.d3 f351915e;

    /* renamed from: f, reason: collision with root package name */
    public int f351916f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(gc0.d3 d3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f351915e = d3Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f351914d = obj;
        this.f351916f |= Integer.MIN_VALUE;
        return this.f351915e.g(this);
    }
}
