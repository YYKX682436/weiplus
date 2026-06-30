package hf2;

/* loaded from: classes10.dex */
public final class m extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f362642d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f362643e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f362644f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hf2.x f362645g;

    /* renamed from: h, reason: collision with root package name */
    public int f362646h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(hf2.x xVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f362645g = xVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f362644f = obj;
        this.f362646h |= Integer.MIN_VALUE;
        return hf2.x.Z6(this.f362645g, null, this);
    }
}
