package g4;

/* loaded from: classes5.dex */
public final class m extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f349956d;

    /* renamed from: e, reason: collision with root package name */
    public int f349957e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.n f349958f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(g4.n nVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f349958f = nVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f349956d = obj;
        this.f349957e |= Integer.MIN_VALUE;
        return this.f349958f.mo771x2f8fd3(null, this);
    }
}
