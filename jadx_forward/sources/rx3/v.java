package rx3;

/* loaded from: classes10.dex */
public final class v extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f482600d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f482601e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f482602f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rx3.z f482603g;

    /* renamed from: h, reason: collision with root package name */
    public int f482604h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(rx3.z zVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f482603g = zVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f482602f = obj;
        this.f482604h |= Integer.MIN_VALUE;
        return this.f482603g.a(0, false, false, this);
    }
}
