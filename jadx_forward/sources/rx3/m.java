package rx3;

/* loaded from: classes10.dex */
public final class m extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f482570d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f482571e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f482572f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f482573g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ rx3.s f482574h;

    /* renamed from: i, reason: collision with root package name */
    public int f482575i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(rx3.s sVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f482574h = sVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f482573g = obj;
        this.f482575i |= Integer.MIN_VALUE;
        return this.f482574h.c(null, this);
    }
}
