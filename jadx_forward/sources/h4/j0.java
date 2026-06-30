package h4;

/* loaded from: classes14.dex */
public final class j0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f360205d;

    /* renamed from: e, reason: collision with root package name */
    public int f360206e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h4.k0 f360207f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f360208g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(h4.k0 k0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f360207f = k0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f360205d = obj;
        this.f360206e |= Integer.MIN_VALUE;
        return this.f360207f.b(this);
    }
}
