package pn4;

/* loaded from: classes14.dex */
public final class i0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f438648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pn4.q0 f438649e;

    /* renamed from: f, reason: collision with root package name */
    public int f438650f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(pn4.q0 q0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f438649e = q0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f438648d = obj;
        this.f438650f |= Integer.MIN_VALUE;
        return this.f438649e.h(0, null, this);
    }
}
