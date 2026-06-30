package yx0;

/* loaded from: classes5.dex */
public final class e5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f548813d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f548814e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f548815f;

    /* renamed from: g, reason: collision with root package name */
    public int f548816g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(yx0.b8 b8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f548815f = b8Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f548814e = obj;
        this.f548816g |= Integer.MIN_VALUE;
        return this.f548815f.o0(null, null, this);
    }
}
