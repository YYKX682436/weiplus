package cc1;

/* loaded from: classes7.dex */
public final class x extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f121990d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f121991e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f121992f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f121993g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ cc1.y f121994h;

    /* renamed from: i, reason: collision with root package name */
    public int f121995i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(cc1.y yVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f121994h = yVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f121993g = obj;
        this.f121995i |= Integer.MIN_VALUE;
        return this.f121994h.C(null, null, this);
    }
}
