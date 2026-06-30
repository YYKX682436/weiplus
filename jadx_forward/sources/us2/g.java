package us2;

/* loaded from: classes5.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f512015d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f512016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ us2.u f512017f;

    /* renamed from: g, reason: collision with root package name */
    public int f512018g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(us2.u uVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f512017f = uVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f512016e = obj;
        this.f512018g |= Integer.MIN_VALUE;
        return this.f512017f.a(null, this);
    }
}
