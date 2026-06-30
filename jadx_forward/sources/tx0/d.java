package tx0;

/* loaded from: classes.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f504039d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f504040e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tx0.k f504041f;

    /* renamed from: g, reason: collision with root package name */
    public int f504042g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(tx0.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f504041f = kVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f504040e = obj;
        this.f504042g |= Integer.MIN_VALUE;
        java.lang.Object c17 = this.f504041f.c(this);
        return c17 == pz5.a.f440719d ? c17 : p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(c17);
    }
}
