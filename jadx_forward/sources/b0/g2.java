package b0;

/* loaded from: classes14.dex */
public final class g2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f97828d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97829e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.h2 f97830f;

    /* renamed from: g, reason: collision with root package name */
    public int f97831g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(b0.h2 h2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f97830f = h2Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f97829e = obj;
        this.f97831g |= Integer.MIN_VALUE;
        return this.f97830f.b(this);
    }
}
