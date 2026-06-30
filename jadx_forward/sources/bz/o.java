package bz;

/* loaded from: classes10.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f118222d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f118223e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f118224f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f118225g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bz.w f118226h;

    /* renamed from: i, reason: collision with root package name */
    public int f118227i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(bz.w wVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f118226h = wVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f118225g = obj;
        this.f118227i |= Integer.MIN_VALUE;
        return this.f118226h.f(null, this);
    }
}
