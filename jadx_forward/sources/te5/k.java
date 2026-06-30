package te5;

/* loaded from: classes12.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f500230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te5.o f500231e;

    /* renamed from: f, reason: collision with root package name */
    public int f500232f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(te5.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f500231e = oVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f500230d = obj;
        this.f500232f |= Integer.MIN_VALUE;
        return this.f500231e.wi(null, null, this);
    }
}
