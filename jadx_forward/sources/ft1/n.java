package ft1;

/* loaded from: classes11.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f348033d;

    /* renamed from: e, reason: collision with root package name */
    public int f348034e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f348035f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ft1.q f348036g;

    /* renamed from: h, reason: collision with root package name */
    public int f348037h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ft1.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f348036g = qVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f348035f = obj;
        this.f348037h |= Integer.MIN_VALUE;
        return ft1.q.b(this.f348036g, null, 0, this);
    }
}
