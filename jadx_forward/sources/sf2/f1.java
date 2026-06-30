package sf2;

/* loaded from: classes10.dex */
public final class f1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f488664d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f488665e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f488666f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf2.i1 f488667g;

    /* renamed from: h, reason: collision with root package name */
    public int f488668h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(sf2.i1 i1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f488667g = i1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f488666f = obj;
        this.f488668h |= Integer.MIN_VALUE;
        return this.f488667g.a(null, this);
    }
}
