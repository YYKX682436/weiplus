package kp;

/* loaded from: classes13.dex */
public final class w0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f392384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f392385e;

    /* renamed from: f, reason: collision with root package name */
    public int f392386f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(kp.i1 i1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f392385e = i1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f392384d = obj;
        this.f392386f |= Integer.MIN_VALUE;
        return this.f392385e.nj(null, this);
    }
}
