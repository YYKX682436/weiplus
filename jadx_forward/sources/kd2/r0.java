package kd2;

/* loaded from: classes10.dex */
public final class r0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f388351d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f388352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kd2.p1 f388353f;

    /* renamed from: g, reason: collision with root package name */
    public int f388354g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(kd2.p1 p1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f388353f = p1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f388352e = obj;
        this.f388354g |= Integer.MIN_VALUE;
        return this.f388353f.x0(false, false, false, null, false, this);
    }
}
