package ep1;

/* loaded from: classes14.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f337132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ep1.k f337133e;

    /* renamed from: f, reason: collision with root package name */
    public int f337134f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ep1.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f337133e = kVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f337132d = obj;
        this.f337134f |= Integer.MIN_VALUE;
        ep1.k.a(this.f337133e, null, null, this);
        return jz5.f0.f384359a;
    }
}
