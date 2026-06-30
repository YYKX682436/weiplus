package df2;

/* loaded from: classes10.dex */
public final class nn extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f312398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.un f312399e;

    /* renamed from: f, reason: collision with root package name */
    public int f312400f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn(df2.un unVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f312399e = unVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f312398d = obj;
        this.f312400f |= Integer.MIN_VALUE;
        return this.f312399e.a7(null, false, this);
    }
}
