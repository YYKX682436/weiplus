package lu3;

/* loaded from: classes10.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f402940d;

    /* renamed from: e, reason: collision with root package name */
    public int f402941e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f402942f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f402943g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ lu3.m f402944h;

    /* renamed from: i, reason: collision with root package name */
    public int f402945i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(lu3.m mVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f402944h = mVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f402943g = obj;
        this.f402945i |= Integer.MIN_VALUE;
        return this.f402944h.i(0, false, this);
    }
}
