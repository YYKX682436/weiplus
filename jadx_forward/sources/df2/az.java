package df2;

/* loaded from: classes3.dex */
public final class az extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f311291d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f311292e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f311293f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.lz f311294g;

    /* renamed from: h, reason: collision with root package name */
    public int f311295h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az(df2.lz lzVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f311294g = lzVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f311293f = obj;
        this.f311295h |= Integer.MIN_VALUE;
        return df2.lz.Z6(this.f311294g, null, this);
    }
}
