package e00;

/* loaded from: classes9.dex */
public final class h0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f327308d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f327309e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e00.k0 f327310f;

    /* renamed from: g, reason: collision with root package name */
    public int f327311g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(e00.k0 k0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f327310f = k0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f327309e = obj;
        this.f327311g |= Integer.MIN_VALUE;
        return this.f327310f.c(null, null, null, null, this);
    }
}
