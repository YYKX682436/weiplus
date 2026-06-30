package pq3;

/* loaded from: classes12.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f439202d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f439203e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f439204f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pq3.q f439205g;

    /* renamed from: h, reason: collision with root package name */
    public int f439206h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(pq3.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f439205g = qVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f439204f = obj;
        this.f439206h |= Integer.MIN_VALUE;
        return this.f439205g.e(this);
    }
}
