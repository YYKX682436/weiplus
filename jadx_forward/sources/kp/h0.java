package kp;

/* loaded from: classes13.dex */
public final class h0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f392283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f392284e;

    /* renamed from: f, reason: collision with root package name */
    public int f392285f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(kp.i1 i1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f392284e = i1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f392283d = obj;
        this.f392285f |= Integer.MIN_VALUE;
        return this.f392284e.Ni(null, null, this);
    }
}
