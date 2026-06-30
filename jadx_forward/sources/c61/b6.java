package c61;

/* loaded from: classes10.dex */
public final class b6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f120424d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f120425e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c61.l7 f120426f;

    /* renamed from: g, reason: collision with root package name */
    public int f120427g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(c61.l7 l7Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f120426f = l7Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f120425e = obj;
        this.f120427g |= Integer.MIN_VALUE;
        return this.f120426f.kk(null, null, false, this);
    }
}
