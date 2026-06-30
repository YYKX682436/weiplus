package g4;

/* loaded from: classes5.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f349778d;

    /* renamed from: e, reason: collision with root package name */
    public int f349779e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.e f349780f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f349781g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f349782h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g4.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f349780f = eVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f349778d = obj;
        this.f349779e |= Integer.MIN_VALUE;
        return this.f349780f.mo771x2f8fd3(null, this);
    }
}
