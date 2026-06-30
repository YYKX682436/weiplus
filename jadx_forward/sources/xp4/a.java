package xp4;

/* loaded from: classes10.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f537469d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f537470e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xp4.b f537471f;

    /* renamed from: g, reason: collision with root package name */
    public int f537472g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(xp4.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f537471f = bVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f537470e = obj;
        this.f537472g |= Integer.MIN_VALUE;
        return this.f537471f.a(null, null, this);
    }
}
