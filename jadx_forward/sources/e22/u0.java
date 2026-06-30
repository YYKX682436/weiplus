package e22;

/* loaded from: classes5.dex */
public final class u0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f328269d;

    /* renamed from: e, reason: collision with root package name */
    public int f328270e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e22.v0 f328271f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(e22.v0 v0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f328271f = v0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f328269d = obj;
        this.f328270e |= Integer.MIN_VALUE;
        return this.f328271f.mo771x2f8fd3(null, this);
    }
}
