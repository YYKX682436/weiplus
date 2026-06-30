package cp5;

/* loaded from: classes14.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f302687d;

    /* renamed from: e, reason: collision with root package name */
    public int f302688e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f302689f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cp5.j f302690g;

    /* renamed from: h, reason: collision with root package name */
    public int f302691h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(cp5.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f302690g = jVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f302689f = obj;
        this.f302691h |= Integer.MIN_VALUE;
        return this.f302690g.a(0, this);
    }
}
