package n12;

/* loaded from: classes10.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f415616d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f415617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n12.n f415618f;

    /* renamed from: g, reason: collision with root package name */
    public int f415619g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n12.n nVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f415618f = nVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f415617e = obj;
        this.f415619g |= Integer.MIN_VALUE;
        return this.f415618f.c(this);
    }
}
