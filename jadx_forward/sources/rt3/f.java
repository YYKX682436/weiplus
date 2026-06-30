package rt3;

/* loaded from: classes5.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f481061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rt3.j f481062e;

    /* renamed from: f, reason: collision with root package name */
    public int f481063f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(rt3.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f481062e = jVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f481061d = obj;
        this.f481063f |= Integer.MIN_VALUE;
        return this.f481062e.a(null, 0, 0L, null, null, this);
    }
}
