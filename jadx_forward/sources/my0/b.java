package my0;

/* loaded from: classes5.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f414180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ my0.e f414181e;

    /* renamed from: f, reason: collision with root package name */
    public int f414182f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(my0.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f414181e = eVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f414180d = obj;
        this.f414182f |= Integer.MIN_VALUE;
        return this.f414181e.h(null, null, 0, this);
    }
}
