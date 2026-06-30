package kp;

/* loaded from: classes13.dex */
public final class g1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f392278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f392279e;

    /* renamed from: f, reason: collision with root package name */
    public int f392280f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(kp.i1 i1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f392279e = i1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f392278d = obj;
        this.f392280f |= Integer.MIN_VALUE;
        return this.f392279e.qj(null, 0L, this);
    }
}
