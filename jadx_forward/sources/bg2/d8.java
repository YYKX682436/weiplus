package bg2;

/* loaded from: classes2.dex */
public final class d8 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f101570d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f101571e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f101572f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f101573g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bg2.l8 f101574h;

    /* renamed from: i, reason: collision with root package name */
    public int f101575i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(bg2.l8 l8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f101574h = l8Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f101573g = obj;
        this.f101575i |= Integer.MIN_VALUE;
        return bg2.l8.b7(this.f101574h, 0, null, this);
    }
}
