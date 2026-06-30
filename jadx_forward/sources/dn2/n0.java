package dn2;

/* loaded from: classes3.dex */
public final class n0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f323480d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f323481e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dn2.s0 f323482f;

    /* renamed from: g, reason: collision with root package name */
    public int f323483g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(dn2.s0 s0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f323482f = s0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f323481e = obj;
        this.f323483g |= Integer.MIN_VALUE;
        return dn2.s0.e(this.f323482f, null, 0L, null, null, this);
    }
}
