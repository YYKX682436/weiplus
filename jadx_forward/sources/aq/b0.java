package aq;

/* loaded from: classes14.dex */
public final class b0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f94372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aq.r0 f94373e;

    /* renamed from: f, reason: collision with root package name */
    public int f94374f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(aq.r0 r0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f94373e = r0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f94372d = obj;
        this.f94374f |= Integer.MIN_VALUE;
        return this.f94373e.f(null, null, false, this);
    }
}
