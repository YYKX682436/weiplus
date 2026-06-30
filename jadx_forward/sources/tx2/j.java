package tx2;

/* loaded from: classes15.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f504131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tx2.k f504132e;

    /* renamed from: f, reason: collision with root package name */
    public int f504133f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(tx2.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f504132e = kVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f504131d = obj;
        this.f504133f |= Integer.MIN_VALUE;
        return this.f504132e.e(null, this);
    }
}
