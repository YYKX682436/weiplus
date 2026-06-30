package dk2;

/* loaded from: classes3.dex */
public final class p4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f315430d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f315431e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f315432f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.q4 f315433g;

    /* renamed from: h, reason: collision with root package name */
    public int f315434h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(dk2.q4 q4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f315433g = q4Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f315432f = obj;
        this.f315434h |= Integer.MIN_VALUE;
        return this.f315433g.q(null, null, null, this);
    }
}
