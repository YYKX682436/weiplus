package fg0;

/* loaded from: classes12.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f343358d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f343359e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f343360f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fg0.g f343361g;

    /* renamed from: h, reason: collision with root package name */
    public int f343362h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(fg0.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f343361g = gVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f343360f = obj;
        this.f343362h |= Integer.MIN_VALUE;
        return this.f343361g.U6(null, this);
    }
}
