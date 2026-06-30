package pn4;

/* loaded from: classes14.dex */
public final class v0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f438768d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f438769e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pn4.e1 f438770f;

    /* renamed from: g, reason: collision with root package name */
    public int f438771g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(pn4.e1 e1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f438770f = e1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f438769e = obj;
        this.f438771g |= Integer.MIN_VALUE;
        return this.f438770f.b(null, 0, this);
    }
}
