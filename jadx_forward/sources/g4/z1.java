package g4;

/* loaded from: classes5.dex */
public final class z1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f350181d;

    /* renamed from: e, reason: collision with root package name */
    public int f350182e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.a2 f350183f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(g4.a2 a2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f350183f = a2Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f350181d = obj;
        this.f350182e |= Integer.MIN_VALUE;
        return this.f350183f.mo771x2f8fd3(null, this);
    }
}
