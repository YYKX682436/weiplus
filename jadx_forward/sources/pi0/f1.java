package pi0;

/* loaded from: classes11.dex */
public final class f1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f436099d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f436100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pi0.l1 f436101f;

    /* renamed from: g, reason: collision with root package name */
    public int f436102g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(pi0.l1 l1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f436101f = l1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f436100e = obj;
        this.f436102g |= Integer.MIN_VALUE;
        return this.f436101f.m(null, null, false, 0L, this);
    }
}
