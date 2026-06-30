package bg2;

/* loaded from: classes2.dex */
public final class i6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f101702d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f101703e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f101704f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f101705g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bg2.q6 f101706h;

    /* renamed from: i, reason: collision with root package name */
    public int f101707i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(bg2.q6 q6Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f101706h = q6Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f101705g = obj;
        this.f101707i |= Integer.MIN_VALUE;
        return bg2.q6.a7(this.f101706h, this);
    }
}
