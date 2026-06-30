package is;

/* loaded from: classes11.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f375831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ is.f f375832e;

    /* renamed from: f, reason: collision with root package name */
    public int f375833f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(is.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f375832e = fVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f375831d = obj;
        this.f375833f |= Integer.MIN_VALUE;
        return this.f375832e.wi(null, null, null, this);
    }
}
