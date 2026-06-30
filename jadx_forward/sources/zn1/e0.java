package zn1;

/* loaded from: classes11.dex */
public final class e0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public boolean f555966d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f555967e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f555968f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f555969g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f555970h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ zn1.i0 f555971i;

    /* renamed from: m, reason: collision with root package name */
    public int f555972m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(zn1.i0 i0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f555971i = i0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f555970h = obj;
        this.f555972m |= Integer.MIN_VALUE;
        return this.f555971i.f(false, this);
    }
}
