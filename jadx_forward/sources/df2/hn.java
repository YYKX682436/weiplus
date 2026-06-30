package df2;

/* loaded from: classes10.dex */
public final class hn extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f311872d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f311873e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f311874f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f311875g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ df2.ln f311876h;

    /* renamed from: i, reason: collision with root package name */
    public int f311877i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn(df2.ln lnVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f311876h = lnVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f311875g = obj;
        this.f311877i |= Integer.MIN_VALUE;
        return this.f311876h.b7(null, null, false, false, null, this);
    }
}
