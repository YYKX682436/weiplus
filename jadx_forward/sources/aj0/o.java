package aj0;

/* loaded from: classes11.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f86805d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f86806e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ aj0.s f86807f;

    /* renamed from: g, reason: collision with root package name */
    public int f86808g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(aj0.s sVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f86807f = sVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f86806e = obj;
        this.f86808g |= Integer.MIN_VALUE;
        return this.f86807f.a(this);
    }
}
