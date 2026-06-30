package my1;

/* loaded from: classes4.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f414215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ my1.j f414216e;

    /* renamed from: f, reason: collision with root package name */
    public int f414217f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(my1.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f414216e = jVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f414215d = obj;
        this.f414217f |= Integer.MIN_VALUE;
        return this.f414216e.a(0, null, null, null, null, this);
    }
}
