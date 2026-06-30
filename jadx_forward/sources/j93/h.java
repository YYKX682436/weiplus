package j93;

/* loaded from: classes11.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f379928d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f379929e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j93.n f379930f;

    /* renamed from: g, reason: collision with root package name */
    public int f379931g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j93.n nVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f379930f = nVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f379929e = obj;
        this.f379931g |= Integer.MIN_VALUE;
        return this.f379930f.P6(this);
    }
}
