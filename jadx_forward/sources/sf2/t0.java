package sf2;

/* loaded from: classes10.dex */
public final class t0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f488817d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f488818e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f488819f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf2.e1 f488820g;

    /* renamed from: h, reason: collision with root package name */
    public int f488821h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(sf2.e1 e1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f488820g = e1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f488819f = obj;
        this.f488821h |= Integer.MIN_VALUE;
        return this.f488820g.h7(null, this);
    }
}
