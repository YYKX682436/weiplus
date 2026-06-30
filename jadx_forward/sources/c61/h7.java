package c61;

/* loaded from: classes10.dex */
public final class h7 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f120548d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f120549e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f120550f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f120551g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c61.l7 f120552h;

    /* renamed from: i, reason: collision with root package name */
    public int f120553i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(c61.l7 l7Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f120552h = l7Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f120551g = obj;
        this.f120553i |= Integer.MIN_VALUE;
        return this.f120552h.pl(0L, null, 0, this);
    }
}
