package ez;

/* loaded from: classes9.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f339251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ez.e f339252e;

    /* renamed from: f, reason: collision with root package name */
    public int f339253f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ez.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f339252e = eVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f339251d = obj;
        this.f339253f |= Integer.MIN_VALUE;
        return this.f339252e.oj(null, this);
    }
}
