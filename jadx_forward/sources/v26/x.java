package v26;

/* loaded from: classes14.dex */
public final class x extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f514603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v26.y f514604e;

    /* renamed from: f, reason: collision with root package name */
    public int f514605f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(v26.y yVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f514604e = yVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f514603d = obj;
        this.f514605f |= Integer.MIN_VALUE;
        return this.f514604e.mo771x2f8fd3(null, this);
    }
}
