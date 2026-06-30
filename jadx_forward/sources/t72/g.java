package t72;

/* loaded from: classes4.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f497590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t72.l f497591e;

    /* renamed from: f, reason: collision with root package name */
    public int f497592f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(t72.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f497591e = lVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f497590d = obj;
        this.f497592f |= Integer.MIN_VALUE;
        return this.f497591e.X6(null, this);
    }
}
