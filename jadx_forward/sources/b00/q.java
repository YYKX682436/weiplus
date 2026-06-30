package b00;

/* loaded from: classes9.dex */
public final class q extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f98283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b00.r f98284e;

    /* renamed from: f, reason: collision with root package name */
    public int f98285f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(b00.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f98284e = rVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f98283d = obj;
        this.f98285f |= Integer.MIN_VALUE;
        return this.f98284e.vj(null, 0, false, this);
    }
}
