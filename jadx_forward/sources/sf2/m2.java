package sf2;

/* loaded from: classes10.dex */
public final class m2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f488746d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f488747e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f488748f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf2.d3 f488749g;

    /* renamed from: h, reason: collision with root package name */
    public int f488750h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(sf2.d3 d3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f488749g = d3Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f488748f = obj;
        this.f488750h |= Integer.MIN_VALUE;
        return this.f488749g.k7(0, 0, false, this);
    }
}
