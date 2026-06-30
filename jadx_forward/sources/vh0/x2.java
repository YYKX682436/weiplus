package vh0;

/* loaded from: classes11.dex */
public final class x2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f518530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh0.f3 f518531e;

    /* renamed from: f, reason: collision with root package name */
    public int f518532f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(vh0.f3 f3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f518531e = f3Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f518530d = obj;
        this.f518532f |= Integer.MIN_VALUE;
        return vh0.f3.Bi(this.f518531e, null, 0, null, this);
    }
}
