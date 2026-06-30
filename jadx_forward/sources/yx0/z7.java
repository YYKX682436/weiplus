package yx0;

/* loaded from: classes5.dex */
public final class z7 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f549350d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f549351e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f549352f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f549353g;

    /* renamed from: h, reason: collision with root package name */
    public int f549354h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(yx0.b8 b8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f549353g = b8Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f549352f = obj;
        this.f549354h |= Integer.MIN_VALUE;
        return this.f549353g.x0(false, this);
    }
}
