package rv0;

/* loaded from: classes5.dex */
public final class g1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f481543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481544e;

    /* renamed from: f, reason: collision with root package name */
    public int f481545f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(rv0.n1 n1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f481544e = n1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f481543d = obj;
        this.f481545f |= Integer.MIN_VALUE;
        return rv0.n1.l7(this.f481544e, null, this);
    }
}
