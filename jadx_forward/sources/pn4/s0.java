package pn4;

/* loaded from: classes14.dex */
public final class s0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public int f438751d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f438752e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pn4.t0 f438753f;

    /* renamed from: g, reason: collision with root package name */
    public int f438754g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(pn4.t0 t0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f438753f = t0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f438752e = obj;
        this.f438754g |= Integer.MIN_VALUE;
        return this.f438753f.c(null, 0, 0, this);
    }
}
