package df2;

/* loaded from: classes3.dex */
public final class i00 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f311903d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f311904e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f311905f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.m00 f311906g;

    /* renamed from: h, reason: collision with root package name */
    public int f311907h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i00(df2.m00 m00Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f311906g = m00Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f311905f = obj;
        this.f311907h |= Integer.MIN_VALUE;
        return df2.m00.a7(this.f311906g, 0, this);
    }
}
