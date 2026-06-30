package b80;

/* loaded from: classes12.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f99799d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f99800e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b80.u f99801f;

    /* renamed from: g, reason: collision with root package name */
    public int f99802g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(b80.u uVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f99801f = uVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f99800e = obj;
        this.f99802g |= Integer.MIN_VALUE;
        return this.f99801f.qj(null, false, this);
    }
}
