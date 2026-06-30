package yx0;

/* loaded from: classes5.dex */
public final class b6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f548698d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f548699e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f548700f;

    /* renamed from: g, reason: collision with root package name */
    public int f548701g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(yx0.b8 b8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f548700f = b8Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f548699e = obj;
        this.f548701g |= Integer.MIN_VALUE;
        return this.f548700f.s0(null, this);
    }
}
