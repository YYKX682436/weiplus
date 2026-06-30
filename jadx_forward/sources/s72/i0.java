package s72;

/* loaded from: classes12.dex */
public final class i0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f485595d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f485596e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s72.j0 f485597f;

    /* renamed from: g, reason: collision with root package name */
    public int f485598g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(s72.j0 j0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f485597f = j0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f485596e = obj;
        this.f485598g |= Integer.MIN_VALUE;
        return this.f485597f.g7(0, 0, this);
    }
}
