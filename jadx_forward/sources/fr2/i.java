package fr2;

/* loaded from: classes2.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f347256d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f347257e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f347258f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fr2.p f347259g;

    /* renamed from: h, reason: collision with root package name */
    public int f347260h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(fr2.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f347259g = pVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f347258f = obj;
        this.f347260h |= Integer.MIN_VALUE;
        return fr2.p.Q6(this.f347259g, false, this);
    }
}
