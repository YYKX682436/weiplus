package s72;

/* loaded from: classes12.dex */
public final class b0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f485526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s72.j0 f485527e;

    /* renamed from: f, reason: collision with root package name */
    public int f485528f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(s72.j0 j0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f485527e = j0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f485526d = obj;
        this.f485528f |= Integer.MIN_VALUE;
        return this.f485527e.c7(this);
    }
}
