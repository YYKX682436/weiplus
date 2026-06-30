package my0;

/* loaded from: classes5.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f414186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ my0.e f414187e;

    /* renamed from: f, reason: collision with root package name */
    public int f414188f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(my0.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f414187e = eVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f414186d = obj;
        this.f414188f |= Integer.MIN_VALUE;
        return this.f414187e.i(null, this);
    }
}
