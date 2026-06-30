package sp2;

/* loaded from: classes3.dex */
public final class x2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f492800d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f492801e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f492802f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f492803g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sp2.d3 f492804h;

    /* renamed from: i, reason: collision with root package name */
    public int f492805i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(sp2.d3 d3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f492804h = d3Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f492803g = obj;
        this.f492805i |= Integer.MIN_VALUE;
        return sp2.d3.a(this.f492804h, null, null, this);
    }
}
