package dz0;

/* loaded from: classes5.dex */
public final class d0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f326335d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f326336e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dz0.e0 f326337f;

    /* renamed from: g, reason: collision with root package name */
    public int f326338g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(dz0.e0 e0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f326337f = e0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f326336e = obj;
        this.f326338g |= Integer.MIN_VALUE;
        return this.f326337f.d(this);
    }
}
