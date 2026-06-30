package un0;

/* loaded from: classes14.dex */
public final class p extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f510938d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f510939e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ un0.s f510940f;

    /* renamed from: g, reason: collision with root package name */
    public int f510941g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(un0.s sVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f510940f = sVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f510939e = obj;
        this.f510941g |= Integer.MIN_VALUE;
        return this.f510940f.b(false, this);
    }
}
