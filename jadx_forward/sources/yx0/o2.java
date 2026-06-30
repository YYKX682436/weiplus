package yx0;

/* loaded from: classes5.dex */
public final class o2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f549031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f549032e;

    /* renamed from: f, reason: collision with root package name */
    public int f549033f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(yx0.b8 b8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f549032e = b8Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f549031d = obj;
        this.f549033f |= Integer.MIN_VALUE;
        return this.f549032e.P(this);
    }
}
