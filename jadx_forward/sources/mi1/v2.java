package mi1;

/* loaded from: classes7.dex */
public final class v2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f408249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mi1.x2 f408250e;

    /* renamed from: f, reason: collision with root package name */
    public int f408251f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(mi1.x2 x2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f408250e = x2Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f408249d = obj;
        this.f408251f |= Integer.MIN_VALUE;
        return this.f408250e.a(this);
    }
}
