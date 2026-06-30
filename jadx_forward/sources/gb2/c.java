package gb2;

/* loaded from: classes2.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f351539d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f351540e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f351541f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gb2.d f351542g;

    /* renamed from: h, reason: collision with root package name */
    public int f351543h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(gb2.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f351542g = dVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f351541f = obj;
        this.f351543h |= Integer.MIN_VALUE;
        return this.f351542g.i(false, this);
    }
}
