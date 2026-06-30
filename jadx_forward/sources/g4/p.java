package g4;

/* loaded from: classes5.dex */
public final class p extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f350009d;

    /* renamed from: e, reason: collision with root package name */
    public int f350010e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.q f350011f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(g4.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f350011f = qVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f350009d = obj;
        this.f350010e |= Integer.MIN_VALUE;
        return this.f350011f.mo771x2f8fd3(null, this);
    }
}
