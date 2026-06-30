package ch2;

/* loaded from: classes10.dex */
public final class f0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f122877d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f122878e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f122879f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f122880g;

    /* renamed from: h, reason: collision with root package name */
    public int f122881h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(ch2.o2 o2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f122880g = o2Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f122879f = obj;
        this.f122881h |= Integer.MIN_VALUE;
        return this.f122880g.s7(null, null, this);
    }
}
