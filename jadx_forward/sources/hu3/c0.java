package hu3;

/* loaded from: classes5.dex */
public final class c0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f366629d;

    /* renamed from: e, reason: collision with root package name */
    public int f366630e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f366631f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f366632g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f366633h;

    /* renamed from: i, reason: collision with root package name */
    public int f366634i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(hu3.n0 n0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f366633h = n0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f366632g = obj;
        this.f366634i |= Integer.MIN_VALUE;
        return hu3.n0.c(this.f366633h, 0, false, this);
    }
}
