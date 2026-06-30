package df2;

/* loaded from: classes3.dex */
public final class wz extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f313278d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f313279e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f313280f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.a00 f313281g;

    /* renamed from: h, reason: collision with root package name */
    public int f313282h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz(df2.a00 a00Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f313281g = a00Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f313280f = obj;
        this.f313282h |= Integer.MIN_VALUE;
        return df2.a00.a7(this.f313281g, null, this);
    }
}
