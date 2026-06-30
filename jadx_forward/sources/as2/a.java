package as2;

/* loaded from: classes2.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f94966d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f94967e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ as2.b f94968f;

    /* renamed from: g, reason: collision with root package name */
    public int f94969g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(as2.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f94968f = bVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f94967e = obj;
        this.f94969g |= Integer.MIN_VALUE;
        return this.f94968f.b(this);
    }
}
