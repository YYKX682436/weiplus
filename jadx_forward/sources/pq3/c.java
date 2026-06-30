package pq3;

/* loaded from: classes12.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f439143d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f439144e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f439145f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pq3.j f439146g;

    /* renamed from: h, reason: collision with root package name */
    public int f439147h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(pq3.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f439146g = jVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f439145f = obj;
        this.f439147h |= Integer.MIN_VALUE;
        return pq3.j.b(this.f439146g, this);
    }
}
