package df2;

/* loaded from: classes3.dex */
public final class ww extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f313258d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f313259e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f313260f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.xw f313261g;

    /* renamed from: h, reason: collision with root package name */
    public int f313262h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(df2.xw xwVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f313261g = xwVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f313260f = obj;
        this.f313262h |= Integer.MIN_VALUE;
        return df2.xw.b7(this.f313261g, null, this);
    }
}
