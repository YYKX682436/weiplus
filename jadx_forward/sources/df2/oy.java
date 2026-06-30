package df2;

/* loaded from: classes10.dex */
public final class oy extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f312550d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f312551e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f312552f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.py f312553g;

    /* renamed from: h, reason: collision with root package name */
    public int f312554h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy(df2.py pyVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f312553g = pyVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f312552f = obj;
        this.f312554h |= Integer.MIN_VALUE;
        return this.f312553g.mo771x2f8fd3(null, this);
    }
}
