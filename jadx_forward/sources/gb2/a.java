package gb2;

/* loaded from: classes2.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f351534d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f351535e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f351536f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gb2.b f351537g;

    /* renamed from: h, reason: collision with root package name */
    public int f351538h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(gb2.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f351537g = bVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f351536f = obj;
        this.f351538h |= Integer.MIN_VALUE;
        return this.f351537g.b(this);
    }
}
