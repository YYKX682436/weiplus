package tx0;

/* loaded from: classes.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f504050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tx0.k f504051e;

    /* renamed from: f, reason: collision with root package name */
    public int f504052f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(tx0.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f504051e = kVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f504050d = obj;
        this.f504052f |= Integer.MIN_VALUE;
        java.lang.Object a17 = tx0.k.a(this.f504051e, 0.0d, 0.0d, this);
        return a17 == pz5.a.f440719d ? a17 : p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(a17);
    }
}
