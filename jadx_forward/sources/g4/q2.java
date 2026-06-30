package g4;

/* loaded from: classes5.dex */
public final class q2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f350041d;

    /* renamed from: e, reason: collision with root package name */
    public int f350042e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.y2 f350043f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(g4.y2 y2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f350043f = y2Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f350041d = obj;
        this.f350042e |= Integer.MIN_VALUE;
        return this.f350043f.i(null, null, this);
    }
}
