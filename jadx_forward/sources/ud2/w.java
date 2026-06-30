package ud2;

/* loaded from: classes10.dex */
public final class w extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f508190d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f508191e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f508192f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f508193g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ud2.c0 f508194h;

    /* renamed from: i, reason: collision with root package name */
    public int f508195i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ud2.c0 c0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f508194h = c0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f508193g = obj;
        this.f508195i |= Integer.MIN_VALUE;
        return ud2.c0.b(this.f508194h, this);
    }
}
