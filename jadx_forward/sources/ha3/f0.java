package ha3;

/* loaded from: classes15.dex */
public final class f0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f361378d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f361379e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f361380f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ha3.h0 f361381g;

    /* renamed from: h, reason: collision with root package name */
    public int f361382h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(ha3.h0 h0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f361381g = h0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f361380f = obj;
        this.f361382h |= Integer.MIN_VALUE;
        return this.f361381g.a(null, this);
    }
}
