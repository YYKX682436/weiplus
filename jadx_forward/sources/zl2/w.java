package zl2;

/* loaded from: classes3.dex */
public final class w extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f555539d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f555540e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f555541f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zl2.b0 f555542g;

    /* renamed from: h, reason: collision with root package name */
    public int f555543h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(zl2.b0 b0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f555542g = b0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f555541f = obj;
        this.f555543h |= Integer.MIN_VALUE;
        return this.f555542g.h(null, null, 0L, null, 0, false, this);
    }
}
