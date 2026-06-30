package co5;

/* loaded from: classes11.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f125402d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f125403e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f125404f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ co5.p f125405g;

    /* renamed from: h, reason: collision with root package name */
    public int f125406h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(co5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f125405g = pVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f125404f = obj;
        this.f125406h |= Integer.MIN_VALUE;
        return co5.p.wi(this.f125405g, null, this);
    }
}
