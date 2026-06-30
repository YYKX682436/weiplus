package eu;

/* loaded from: classes12.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f338210d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f338211e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f338212f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ eu.b f338213g;

    /* renamed from: h, reason: collision with root package name */
    public int f338214h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(eu.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f338213g = bVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f338212f = obj;
        this.f338214h |= Integer.MIN_VALUE;
        return this.f338213g.T6(null, this);
    }
}
