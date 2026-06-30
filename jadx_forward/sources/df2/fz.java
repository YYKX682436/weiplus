package df2;

/* loaded from: classes3.dex */
public final class fz extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f311709d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f311710e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.hz f311711f;

    /* renamed from: g, reason: collision with root package name */
    public int f311712g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz(df2.hz hzVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f311711f = hzVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f311710e = obj;
        this.f311712g |= Integer.MIN_VALUE;
        return this.f311711f.q(this);
    }
}
