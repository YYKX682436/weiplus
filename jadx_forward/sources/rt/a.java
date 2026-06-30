package rt;

/* loaded from: classes9.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f480898d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f480899e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rt.b f480900f;

    /* renamed from: g, reason: collision with root package name */
    public int f480901g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(rt.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f480900f = bVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f480899e = obj;
        this.f480901g |= Integer.MIN_VALUE;
        return this.f480900f.D(null, this);
    }
}
