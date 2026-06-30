package bg2;

/* loaded from: classes2.dex */
public final class c8 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f101520d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f101521e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f101522f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f101523g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bg2.l8 f101524h;

    /* renamed from: i, reason: collision with root package name */
    public int f101525i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(bg2.l8 l8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f101524h = l8Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f101523g = obj;
        this.f101525i |= Integer.MIN_VALUE;
        return bg2.l8.a7(this.f101524h, this);
    }
}
