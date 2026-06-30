package vh0;

/* loaded from: classes8.dex */
public final class n3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f518451d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f518452e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f518453f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f518454g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vh0.p3 f518455h;

    /* renamed from: i, reason: collision with root package name */
    public int f518456i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(vh0.p3 p3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f518455h = p3Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f518454g = obj;
        this.f518456i |= Integer.MIN_VALUE;
        return vh0.p3.Zi(this.f518455h, false, this);
    }
}
