package ou4;

/* loaded from: classes8.dex */
public final class p extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f430538d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f430539e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ou4.s f430540f;

    /* renamed from: g, reason: collision with root package name */
    public int f430541g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ou4.s sVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f430540f = sVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f430539e = obj;
        this.f430541g |= Integer.MIN_VALUE;
        return this.f430540f.c(null, null, this);
    }
}
