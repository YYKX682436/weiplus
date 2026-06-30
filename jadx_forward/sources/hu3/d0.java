package hu3;

/* loaded from: classes5.dex */
public final class d0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f366638d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f366639e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f366640f;

    /* renamed from: g, reason: collision with root package name */
    public int f366641g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f366642h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f366643i;

    /* renamed from: m, reason: collision with root package name */
    public int f366644m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(hu3.n0 n0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f366643i = n0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f366642h = obj;
        this.f366644m |= Integer.MIN_VALUE;
        return this.f366643i.h(null, false, this);
    }
}
