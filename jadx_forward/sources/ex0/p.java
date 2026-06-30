package ex0;

/* loaded from: classes5.dex */
public final class p extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f338691d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f338692e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.q f338693f;

    /* renamed from: g, reason: collision with root package name */
    public int f338694g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ex0.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f338693f = qVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f338692e = obj;
        this.f338694g |= Integer.MIN_VALUE;
        return this.f338693f.G(this);
    }
}
