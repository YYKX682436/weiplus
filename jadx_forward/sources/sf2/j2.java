package sf2;

/* loaded from: classes10.dex */
public final class j2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f488710d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f488711e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f488712f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf2.d3 f488713g;

    /* renamed from: h, reason: collision with root package name */
    public int f488714h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(sf2.d3 d3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f488713g = d3Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f488712f = obj;
        this.f488714h |= Integer.MIN_VALUE;
        return this.f488713g.h7(null, false, null, null, this);
    }
}
