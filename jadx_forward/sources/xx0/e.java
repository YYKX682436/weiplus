package xx0;

/* loaded from: classes5.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f539418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xx0.i f539419e;

    /* renamed from: f, reason: collision with root package name */
    public int f539420f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(xx0.i iVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f539419e = iVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f539418d = obj;
        this.f539420f |= Integer.MIN_VALUE;
        return this.f539419e.b(false, this);
    }
}
