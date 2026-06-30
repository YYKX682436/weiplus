package yx0;

/* loaded from: classes5.dex */
public final class q2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f549104d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f549105e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f549106f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f549107g;

    /* renamed from: h, reason: collision with root package name */
    public int f549108h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(yx0.b8 b8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f549107g = b8Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f549106f = obj;
        this.f549108h |= Integer.MIN_VALUE;
        return yx0.b8.h(this.f549107g, this);
    }
}
