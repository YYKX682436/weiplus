package v14;

/* loaded from: classes5.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f514113d;

    /* renamed from: e, reason: collision with root package name */
    public int f514114e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v14.s f514115f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(v14.s sVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f514115f = sVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f514113d = obj;
        this.f514114e |= Integer.MIN_VALUE;
        return this.f514115f.mo771x2f8fd3(null, this);
    }
}
